package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.067B, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C067B {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(AnonymousClass1487 anonymousClass1487) {
        boolean z;
        AnonymousClass1489 anonymousClass1489 = anonymousClass1487.LIZ;
        String str = anonymousClass1487.LIZIZ;
        String str2 = anonymousClass1487.LIZJ;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("request skipped, empty domain event=");
            sbLIZ.append(anonymousClass1489.LIZIZ);
            C2188811AlT.LIZIZ(sbLIZ);
            AnonymousClass0678.LIZ("observer_applog_run_event", LIZIZ(anonymousClass1489, str2, "empty_domain", ""));
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("request begin mode=app_log_observer event=");
        sbLIZ2.append(anonymousClass1489.LIZIZ);
        C2188811AlT.LIZIZ(sbLIZ2);
        AnonymousClass0678.LIZ("observer_applog_run_event", LIZIZ(anonymousClass1489, str2, "submitted", ""));
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C067A(str, anonymousClass1489, str2, null), 2);
    }

    public static Map LIZIZ(AnonymousClass1489 anonymousClass1489, String str, String str2, String str3) {
        Pair[] pairArr = new Pair[7];
        pairArr[0] = new Pair("trxn_id", anonymousClass1489.LJFF);
        pairArr[1] = new Pair("entrance", anonymousClass1489.LIZ);
        String str4 = anonymousClass1489.LIZIZ;
        if (str4 == null) {
            str4 = "";
        }
        pairArr[2] = new Pair("event_name", str4);
        pairArr[3] = new Pair("business", str);
        String str5 = anonymousClass1489.LJ;
        if (str5 == null) {
            str5 = "app_log_observer";
        }
        pairArr[4] = new Pair("mode", str5);
        pairArr[5] = new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str2);
        pairArr[6] = new Pair("error", str3);
        return C2097608Jq.LJIIJ(pairArr);
    }
}
