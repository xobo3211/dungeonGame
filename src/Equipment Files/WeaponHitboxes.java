import java.awt.geom.*;

abstract class WeaponHitboxes{
	Area[] hitboxes = new Area[4];

	Area get(int index){
		return hitboxes[index];
	}
}
