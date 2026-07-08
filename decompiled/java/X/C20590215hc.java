package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15hc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20590215hc {
    public static final C20590215hc LIZJ;
    public static final C20590215hc LIZLLL;
    public static final C20590215hc LJ;
    public static final C20590215hc LJFF;
    public static final C20590215hc LJI;
    public static final C20590215hc LJII;
    public static final C20590215hc LJIIIIZZ;
    public static final C20590215hc LJIIIZ;
    public static final C20590215hc LJIIJ;
    public static final C20590215hc LJIIJJI;
    public final int LIZ;
    public final C995200c0M LIZIZ;

    static {
        C20590215hc c20590215hc = new C20590215hc(0, new C995200c0M(12, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))));
        LIZJ = c20590215hc;
        LIZLLL = new C20590215hc(600, new C995200c0M(12, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))));
        LJ = new C20590215hc(840, new C995200c0M(12, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))));
        LJFF = new C20590215hc(1200, new C995200c0M(20, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))));
        LJI = new C20590215hc(1600, new C995200c0M(24, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))));
        LJII = c20590215hc;
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11));
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11));
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        LJIIIIZZ = new C20590215hc(480, new C995200c0M(12, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))));
        LJIIIZ = new C20590215hc(600, new C995200c0M(12, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))));
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        LJIIJ = new C20590215hc(800, new C995200c0M(12, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))));
        LJIIJJI = new C20590215hc(960, new C995200c0M(12, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24))));
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
    }

    public final int hashCode() {
        return ((527 + this.LIZ) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BreakPointClass(dpSize=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(",baseGridConfig=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C20590215hc) {
            C20590215hc c20590215hc = (C20590215hc) obj;
            if (c20590215hc.LIZ == this.LIZ && Intrinsics.LJFF(c20590215hc.LIZIZ, this.LIZIZ)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C20590215hc(int i, C995200c0M c995200c0M) {
        this.LIZ = i;
        this.LIZIZ = c995200c0M;
    }
}
