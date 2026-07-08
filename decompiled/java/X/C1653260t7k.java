package X;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS140S1200000_25;

/* JADX INFO: renamed from: X.0t7k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1653260t7k {
    public static void LIZ(String str) {
        C830490Whz<String, C1653210t7f> c830490Whz = C1650090t2d.LIZIZ;
        C1653210t7f c1653210t7f = new C1653210t7f(0);
        c1653210t7f.LIZ = System.currentTimeMillis();
        c830490Whz.put(str, c1653210t7f);
    }

    public static void LIZIZ(String str) {
        C830490Whz<String, C1653210t7f> c830490Whz = C1650090t2d.LIZIZ;
        C1653210t7f c1653210t7f = c830490Whz.get(str);
        if (c1653210t7f != null) {
            c1653210t7f.LIZJ = System.currentTimeMillis();
            LJ(str, c1653210t7f);
            c830490Whz.remove(str);
        }
    }

    public static void LIZJ(String str, boolean z) {
        C1653210t7f c1653210t7f;
        C830490Whz<String, C1653210t7f> c830490Whz = C1650090t2d.LIZIZ;
        C1653210t7f c1653210t7f2 = c830490Whz.get(str);
        if (c1653210t7f2 != null) {
            c1653210t7f2.LIZIZ = System.currentTimeMillis();
        }
        if (z && (c1653210t7f = c830490Whz.get(str)) != null) {
            c1653210t7f.LIZIZ = System.currentTimeMillis();
            LJ(str, c1653210t7f);
            c830490Whz.remove(str);
        }
    }

    public static void LJ(String str, C1653210t7f c1653210t7f) {
        InterfaceC1457290o1f accountService = C0CHQ.LIZ().getAccountService();
        if (accountService.isLogin() && !accountService.LIZ()) {
            C0CNO.LIZ(C15O7.LJI, new AwS140S1200000_25(str, (String) c1653210t7f, (C1653210t7f) null, (Map<String, String>) 1));
        }
    }

    public static void LIZLLL(Long l, long j, int i, String str) {
        InterfaceC1457290o1f accountService = C0CHQ.LIZ().getAccountService();
        if (accountService.isLogin() && !accountService.LIZ()) {
            List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("action_name", str);
            c2344009Gk.LIZLLL(j, "react_duration");
            c2344009Gk.LIZJ(i, "creation_duration");
            if (l != null) {
                c2344009Gk.LIZLLL(l.longValue(), "react_ui_duration");
            }
            C2341909Fp.LIZ("tool_performance_ui_react_event", c2344009Gk.LIZ);
        }
    }
}
