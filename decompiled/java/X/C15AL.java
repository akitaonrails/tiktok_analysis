package X;

import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: renamed from: X.15AL, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15AL {
    public static C15AK LIZ(C1782400wU2 c1782400wU2, long j, C12DM c12dm, int i) {
        Interpolator linearInterpolator = c12dm;
        long j2 = j;
        if ((i & 4) != 0) {
            j2 = 300;
        }
        if ((i & 8) != 0) {
            linearInterpolator = new LinearInterpolator();
        }
        return new C15AK(0L, j2, linearInterpolator, C15AG.ALPHA, c1782400wU2);
    }

    public static C15AK LIZIZ(C15AG c15ag, C15A8 c15a8, long j, long j2, int i) {
        LinearInterpolator linearInterpolator;
        long j3 = j2;
        long j4 = j;
        if ((i & 4) != 0) {
            j4 = 0;
        }
        if ((i & 8) != 0) {
            j3 = 300;
        }
        if ((i & 16) != 0) {
            linearInterpolator = new LinearInterpolator();
        } else {
            linearInterpolator = null;
        }
        return new C15AK(j4, j3, linearInterpolator, c15ag, c15a8);
    }
}
