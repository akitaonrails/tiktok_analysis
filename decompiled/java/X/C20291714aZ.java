package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14aZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20291714aZ {
    public static String LIZIZ;
    public static final C20291714aZ LIZ = new C20291714aZ();
    public static final C08I7<String, Boolean> LIZJ = new C08I7<>(500);
    public static final C08I7<String, Boolean> LIZLLL = new C08I7<>(500);
    public static final C08I7<String, Boolean> LJ = new C08I7<>(500);
    public static final C08I7<String, Boolean> LJFF = new C08I7<>(500);

    public static void LIZIZ(final Function0 function0) {
        C20684815ws.LJFF().execute(new Runnable() { // from class: X.0buE
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("FeedSurveyNewMonitor@964.maybeRunBackground$runnable$1");
                try {
                    try {
                        function0.invoke();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("FeedSurveyNewMonitor@964.maybeRunBackground$runnable$1");
            }
        });
    }

    public static void LIZJ(String str) {
        C08I7<String, Boolean> c08i7 = LJFF;
        if (c08i7.LIZIZ(str) != null) {
            return;
        }
        c08i7.LIZLLL(str, Boolean.TRUE);
        C2344009Gk c2344009Gk = new C2344009Gk();
        LIZ(c2344009Gk, str);
        C20684815ws.LJIILLIIL("check_biz_can_show_result", c2344009Gk.LIZ);
    }

    public static void LIZ(C2344009Gk c2344009Gk, String str) {
        int i;
        Integer numValueOf;
        String str2 = LIZIZ;
        if (str2 != null && str2.length() == 0) {
            C14ZT.LIZ.getClass();
            LIZIZ = C14ZT.LIZLLL();
        }
        c2344009Gk.LJFF("survey_key", str);
        c2344009Gk.LJFF("country_code", LIZIZ);
        if (str != null && C123100dR.LIZ(str)) {
            C14ZW.LIZ.getClass();
            C14ZG c14zg = C14ZW.LIZIZ.get(str);
            if (c14zg != null) {
                i = c14zg.LIZJ;
            } else {
                i = -1;
            }
            c2344009Gk.LIZJ(i, "style_group");
            C14ZG c14zgLJII = C14ZW.LJII(str);
            if (c14zgLJII != null) {
                numValueOf = Integer.valueOf(c14zgLJII.LIZLLL);
            } else {
                numValueOf = null;
            }
            c2344009Gk.LJ(numValueOf, "option_style");
        }
    }
}
