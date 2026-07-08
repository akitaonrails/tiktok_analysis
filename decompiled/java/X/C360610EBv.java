package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.internal.AFwS191S0000000_5;

/* JADX INFO: renamed from: X.0EBv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C360610EBv {
    public static int LIZ;
    public static final int LIZIZ;
    public static final int LIZJ;
    public static final int LIZLLL;
    public static final int LJ;
    public static final int LJFF;
    public static final int LJI;
    public static final int LJII;
    public static final int LJIIIIZZ;
    public static final boolean LJIIIZ;
    public static final int LJIIJ;
    public static final int LJIIJJI;
    public static final C01GW LJIIL;

    static {
        C0FU0.LIZ(48.0f);
        LIZ = LSPassThroughRecordSizeConfig.DEFAULT;
        LIZIZ = C0FU0.LIZ(20.0f);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C368130Ebz.LJIIJJI)));
        LIZJ = iLIZIZ;
        LIZLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C368130Ebz.LJIIJ)));
        C0FU0.LIZ(20.0f);
        C0FU0.LIZ(1.0f);
        C0FU0.LIZ(26.0f);
        C0FU0.LIZ(50.0f);
        LJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(34));
        LJFF = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(46));
        LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        LJIIIIZZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        C0FU0.LIZ(3.0f);
        LJIIIZ = true;
        LJIIJ = C0FU0.LIZ(5.0f);
        LJIIJJI = (int) (((double) iLIZIZ) * 1.5d);
        LJIIL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(332));
    }

    public static int LIZIZ() {
        return ((Number) LJIIL.getValue()).intValue();
    }

    public static float LIZJ() {
        return LIZJ / LIZ;
    }

    public static float LIZ(float f, int i) {
        if (f >= i / 2) {
            f = i - f;
        }
        float f2 = LJIIJJI;
        if (f >= f2) {
            return 1.0f;
        }
        return 1.0f + (((f2 - f) / f2) * 4);
    }
}
