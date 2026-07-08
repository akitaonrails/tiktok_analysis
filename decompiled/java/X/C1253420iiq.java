package X;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS303S0000000_19;

/* JADX INFO: renamed from: X.0iiq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1253420iiq {
    public static long LIZLLL;
    public static long LJ;
    public static long LJII;
    public static long LJIIIIZZ;
    public static long LJIIIZ;
    public static boolean LJIIL;
    public static boolean LJIILIIL;
    public static final C1253420iiq LIZ = new C1253420iiq();
    public static EnumC048600Fo LIZIZ = EnumC048600Fo.HOMEPAGE_SELF_PROFILE;
    public static boolean LIZJ = true;
    public static int LJFF = Integer.MIN_VALUE;
    public static String LJI = "";
    public static int LJIIJ = Integer.MIN_VALUE;
    public static String LJIIJJI = "";

    /* JADX WARN: Removed duplicated region for block: B:33:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010d A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.EnumC048600Fo r18) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1253420iiq.LIZIZ(X.00Fo):void");
    }

    public static void LIZJ(Throwable th) {
        LJ = System.currentTimeMillis();
        LIZ(th, AFwS303S0000000_19.get$arr$(34));
    }

    public static void LIZ(Throwable th, Function2 function2) {
        if (th == null) {
            function2.invoke(0, "success");
        } else if (th instanceof C0XIR) {
            C0XIR c0xir = (C0XIR) th;
            function2.invoke(Integer.valueOf(c0xir.getErrorCode()), c0xir.getErrorMsg());
        } else {
            function2.invoke(Integer.valueOf(C2177208fy.LIZ(th)), String.valueOf(th.getMessage()));
        }
    }

    public static void LIZLLL(EnumC048600Fo enumC048600Fo, boolean z) {
        LIZJ = z;
        LIZIZ = enumC048600Fo;
        LIZLLL = 0L;
        LJ = 0L;
        LJFF = Integer.MIN_VALUE;
        LJI = "";
        LJIIIIZZ = 0L;
        LJIIIZ = 0L;
        LJII = 0L;
        LJIIJ = Integer.MIN_VALUE;
        LJIIJJI = "";
        LJIILIIL = false;
        if (z) {
            LJIIL = false;
        }
    }
}
