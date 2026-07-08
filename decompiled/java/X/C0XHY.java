package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabPreloadTTLSetting;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XHY, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XHY {
    public static final C0XHY LIZ = new C0XHY();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C0XHZ());

    public static String LJFF(boolean z) {
        return z ? "1" : CardStruct.IStatusCode.DEFAULT;
    }

    public static void LIZLLL(Function0 function0) {
        ((ExecutorService) LIZIZ.getValue()).execute(new RunnableC514801zW(function0, (Function0<Unit>) 83));
    }

    public static int LJ(EnumC325100Com enumC325100Com) {
        int i = C0XHT.LIZ[enumC325100Com.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                return 1;
            }
            return 0;
        }
        return -1;
    }

    public static void LIZ(JSONObject jSONObject, Map map) {
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            jSONObject.putOpt((String) entry.getKey(), entry.getValue());
        }
    }

    public static long LIZIZ(C0XHY c0xhy, long j) {
        c0xhy.getClass();
        if (j > FriendsTabPreloadTTLSetting.DEFAULT) {
            return -1L;
        }
        return j;
    }

    public static void LIZJ(String str, JSONObject jSONObject) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("track: ");
        sbLIZ.append(str);
        sbLIZ.append(", params: ");
        sbLIZ.append(C786410Ut5.K3(4, jSONObject));
        C1720106oR.LJI("PerfMonitor", C2188811AlT.LIZIZ(sbLIZ));
        C20684815ws.LJIJ(str, jSONObject);
    }
}
