package X;

import android.graphics.Point;
import android.util.Size;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.01XZ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01XZ {
    public final Size LIZ;
    public final Size LIZIZ;
    public final int LIZJ;
    public final Point LIZLLL;

    public /* synthetic */ C01XZ(Size size, Size size2) {
        this(size, size2, R.raw.tux_lottie_tux_gestures_only_tt_tap, null);
    }

    public C01XZ(Size size, Size size2, int i, Point point) {
        this.LIZ = size;
        this.LIZIZ = size2;
        this.LIZJ = i;
        this.LIZLLL = point;
    }

    public static C01XZ LIZ(C01XZ c01xz, Size size, Size size2, Point point, int i) {
        int i2;
        if ((i & 1) != 0) {
            size = c01xz.LIZ;
        }
        if ((i & 2) != 0) {
            size2 = c01xz.LIZIZ;
        }
        if ((i & 4) != 0) {
            i2 = c01xz.LIZJ;
        } else {
            i2 = 0;
        }
        if ((i & 8) != 0) {
            point = c01xz.LIZLLL;
        }
        c01xz.getClass();
        return new C01XZ(size, size2, i2, point);
    }
}
