package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.bytedance.fly_main_color.FlyMainColor;

/* JADX INFO: renamed from: X.0HG4, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HG4 {
    public static int LIZ(Bitmap bitmap, Rect rect, C0HG5 c0hg5) {
        C204674156y c204674156yLIZ = FlyMainColor.LIZ.LIZ(new C2439109h7(bitmap, rect));
        if (c0hg5 != null) {
            c204674156yLIZ.LJI(c0hg5.LIZIZ);
            c204674156yLIZ.LJFF(c0hg5.LIZ);
            c204674156yLIZ.LJ(c0hg5.LIZJ, c0hg5.LIZLLL, c0hg5.LJ, c0hg5.LJFF, c0hg5.LJI);
        }
        Integer numLIZIZ = c204674156yLIZ.LIZIZ();
        if (numLIZIZ != null) {
            return numLIZIZ.intValue();
        }
        return -16777216;
    }
}
