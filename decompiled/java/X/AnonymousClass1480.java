package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.1480, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class AnonymousClass1480 {
    public static final AnonymousClass1480 LIZ = new AnonymousClass1480();
    public static final ScheduledExecutorService LIZIZ;
    public static final C01GW LIZJ;
    public static final C01GW LIZLLL;
    public static final HashMap<String, C148A> LJ;
    public static volatile boolean LJFF;

    static {
        C2123408To c2123408ToLIZ = C2123508Tp.LIZ(C0WQX.SCHEDULED);
        c2123408ToLIZ.LIZIZ = "probe-observer-throttle";
        c2123408ToLIZ.LIZJ = 1;
        LIZIZ = (ScheduledExecutorService) C823050WQl.LIZ(c2123408ToLIZ.LIZ());
        LIZJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(517));
        LIZLLL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(516));
        LJ = new HashMap<>();
    }

    public static C148A LIZ(String str) {
        HashMap<String, C148A> map = LJ;
        C148A c148a = map.get(str);
        if (c148a == null) {
            C1911707eF c1911707eF = (C1911707eF) ((Map) LIZLLL.getValue()).get(str);
            if (c1911707eF == null) {
                C1911807eG c1911807eG = (C1911807eG) LIZJ.getValue();
                c1911807eG.getClass();
                c1911707eF = new C1911707eF(str, "", c1911807eG.LIZIZ, c1911807eG.LIZJ, c1911807eG.LIZLLL);
            }
            c148a = new C148A(c1911707eF);
            map.put(str, c148a);
        }
        return c148a;
    }

    public static void LIZIZ(AnonymousClass1489 anonymousClass1489, String str, String str2) {
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair("trxn_id", anonymousClass1489.LJFF);
        pairArr[1] = new Pair("entrance", anonymousClass1489.LIZ);
        String str3 = anonymousClass1489.LIZIZ;
        if (str3 == null) {
            str3 = "";
        }
        pairArr[2] = new Pair("event_name", str3);
        pairArr[3] = new Pair("business", str2);
        String str4 = anonymousClass1489.LJ;
        if (str4 == null) {
            str4 = "app_log_observer";
        }
        pairArr[4] = new Pair("mode", str4);
        pairArr[5] = new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
        AnonymousClass0678.LIZ("observer_applog_run_event", C2097608Jq.LJIIJ(pairArr));
    }
}
