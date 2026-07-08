package X;

import android.graphics.Color;

/* JADX INFO: renamed from: X.12BV, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12BV {
    public static final int LIZJ(C12BU c12bu) {
        C12BW c12bwLIZJ = c12bu.LIZ().LIZJ();
        return Color.rgb(C13LZ.LJ((int) c12bwLIZJ.LIZ, 0, 255), C13LZ.LJ((int) c12bwLIZJ.LIZIZ, 0, 255), C13LZ.LJ((int) c12bwLIZJ.LIZJ, 0, 255));
    }

    public static final C12BU LIZ(double d, double d2, double d3) {
        return new C12BU(C13LZ.LIZJ(d, 0.0d, 100.0d), C13LZ.LIZJ(d2, 0.0d, 100.0d), d3 % 360.0d);
    }
}
