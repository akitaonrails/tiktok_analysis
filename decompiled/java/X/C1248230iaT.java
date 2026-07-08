package X;

import com.zhiliaoapp.musically.R;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0iaT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1248230iaT {
    public final boolean LIZ;
    public final boolean LIZIZ;

    public C1248230iaT() {
        this(false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1248230iaT)) {
            return false;
        }
        C1248230iaT c1248230iaT = (C1248230iaT) obj;
        return this.LIZ == c1248230iaT.LIZ && this.LIZIZ == c1248230iaT.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommonUIConfig(isSmallScreen=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isMyPage=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static int LIZJ() {
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
    }

    public static int LIZLLL() {
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    }

    public static int LJ() {
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(154));
    }

    public static int LJFF() {
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(238));
    }

    public final int LJIILJJIL() {
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LIZ ? 12 : 16)));
    }

    public final int LJIJ() {
        return (((Boolean) C268330AfP.LJIIJ.getValue()).booleanValue() || C268330AfP.LIZLLL()) ? this.LIZ ? 13 : 123 : C268330AfP.LJIIJ() ? 23 : 33;
    }

    public static int LJI() {
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C268330AfP.LIZLLL() ? 4 : 0)));
    }

    public static int LJII() {
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C268330AfP.LIZLLL() ? 0 : C268330AfP.LJIIIZ() ? 14 : C2537109wv.LJI() ? 8 : 6)));
    }

    public static int LJIIIZ() {
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf((C268330AfP.LIZLLL() || C2537109wv.LIZLLL()) ? 14 : 16)));
    }

    public static int LJIIJ() {
        return C268330AfP.LIZLLL() ? R.attr.a1h : R.attr.a04;
    }

    public static int LJIIJJI() {
        return (C268330AfP.LIZLLL() || C2537109wv.LIZLLL()) ? 62 : 52;
    }

    public static int LJIIL() {
        if (C268330AfP.LJIIIZ() || C268330AfP.LIZLLL()) {
            return 0;
        }
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
    }

    public static int LJIILIIL() {
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C268330AfP.LIZLLL() ? 2 : ((Boolean) C2532609wC.LJI.getValue()).booleanValue() ? 4 : C2537109wv.LJFF() ? 10 : 8)));
    }

    public static int LJIILLIIL() {
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf((C268330AfP.LIZLLL() || C268330AfP.LJIIJ()) ? 4 : 0)));
    }

    public static int LJIIZILJ() {
        return C268330AfP.LJIIIIZZ() ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)) : ((Boolean) C268330AfP.LJIIJ.getValue()).booleanValue() ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)) : C268330AfP.LIZLLL() ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)) : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
    }

    public final Pair<Integer, Integer> LIZ() {
        return C268330AfP.LIZLLL() ? new Pair<>(128, 112) : this.LIZ ? new Pair<>(116, 116) : new Pair<>(128, 128);
    }

    public final int LJIIIIZZ() {
        if (C268330AfP.LIZLLL()) {
            return LJIILJJIL();
        }
        if (C268330AfP.LJIIIZ()) {
            return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        }
        return 0;
    }

    public final int LJIILL() {
        if (C268330AfP.LJIIIIZZ() || !((Boolean) C268330AfP.LJIIJ.getValue()).booleanValue()) {
            return -1;
        }
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LIZ ? 30 : 38)));
    }

    public final int LJIJI() {
        if (C268330AfP.LIZLLL()) {
            return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LIZ ? 12 : 24)));
        }
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
    }

    public C1248230iaT(boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = z2;
    }

    public final int LIZIZ(boolean z, boolean z2) {
        int iLIZLLL;
        int iLIZIZ;
        if (z) {
            iLIZLLL = LIZJ();
        } else {
            iLIZLLL = LIZLLL();
        }
        if (z2) {
            if (z) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
            }
        } else if (this.LIZ) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
        } else if (z) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        }
        int i = iLIZIZ - iLIZLLL;
        if (i < 0) {
            return 0;
        }
        return i;
    }
}
