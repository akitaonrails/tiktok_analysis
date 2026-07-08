package X;

import android.app.Activity;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0w6k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1767960w6k {
    public static long LIZIZ;
    public static long LIZLLL;
    public static boolean LJI;
    public static volatile boolean LJII;
    public static String LJIIIIZZ;
    public static Boolean LJIIIZ;
    public static Boolean LJIIJ;
    public static final C1767960w6k LIZ = new C1767960w6k();
    public static long LIZJ = -1;
    public static long LJ = -1;
    public static boolean LJFF = true;
    public static String LJIIJJI = "";
    public static long LJIIL = -1;

    public static boolean LIZIZ() {
        Boolean boolLIZLLL;
        if (LJIIIZ == null) {
            try {
                boolLIZLLL = C1514430pVp.LIZLLL();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2341109Fh.LIZ.getClass();
                C2341109Fh.LIZJ("Feed0VVManagerUtils.isFirstInstallAndFirstLaunch() error");
                boolLIZLLL = Boolean.FALSE;
            }
            LJIIIZ = boolLIZLLL;
        }
        return Intrinsics.LJFF(LJIIIZ, Boolean.TRUE);
    }

    public static boolean LIZJ() {
        if (LJIIJ == null) {
            LJIIJ = Boolean.valueOf(!C1257480ipO.LIZ.contains("is_first_show_mall"));
        }
        return Intrinsics.LJFF(LJIIJ, Boolean.TRUE);
    }

    public static boolean LJ() {
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity != null) {
            z = (topActivity instanceof InterfaceC1748820vbs) || Intrinsics.LJFF(topActivity.getClass().getName(), SparkActivity.class.getName());
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ShopMainLifeCycle stay_time isECBizPage ");
            sbLIZ.append(z);
            sbLIZ.append(" topActivity = ");
            sbLIZ.append(topActivity);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c2341109Fh.getClass();
            C2341109Fh.LIZ(strLIZIZ);
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(java.lang.String r7) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1767960w6k.LIZLLL(java.lang.String):void");
    }

    public static String LIZ(C19EG c19eg, String str) {
        String str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("homepage_");
        C1584320rKY c1584320rKY = C1584320rKY.LIZ;
        if (Intrinsics.LJFF(str, "homepage_mall")) {
            str2 = "Shop";
        } else {
            str2 = "SHOP_MALL";
        }
        c1584320rKY.getClass();
        sbLIZ.append((String) C1584320rKY.LIZIZ(c19eg, str2).getFirst());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
