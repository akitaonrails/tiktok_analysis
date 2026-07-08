package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.052B, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C052B {
    public static final C052B LIZ = new C052B();
    public static long LIZIZ;

    public static void LIZ(int i, String str) {
        long jCurrentTimeMillis;
        String str2 = str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("trackDeviceConsentAcceptance, action = ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        String str3 = "1";
        if (i != 0) {
            if (i == 1) {
                if (LIZIZ > 0) {
                    jCurrentTimeMillis = System.currentTimeMillis() - LIZIZ;
                } else {
                    jCurrentTimeMillis = -1;
                }
                Pair[] pairArr = new Pair[3];
                pairArr[0] = new Pair("action", "1");
                if (!C1514430pVp.LIZLLL().booleanValue()) {
                    str3 = CardStruct.IStatusCode.DEFAULT;
                }
                pairArr[1] = new Pair("is_first_launch", str3);
                if (str2 == null) {
                    str2 = "";
                }
                pairArr[2] = new Pair("acceptance_scenario", str2);
                Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
                Map mapLIZJ = C2097908Jt.LIZJ(new Pair("acceptance_duration", String.valueOf(jCurrentTimeMillis)));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.putAll(mapLJIIIIZZ);
                linkedHashMap.putAll(mapLIZJ);
                C20684815ws.LJIILLIIL("pns_device_consent_acceptance", linkedHashMap);
                C793770VBv.LJII("pns_device_consent_acceptance", new JSONObject(mapLJIIIIZZ), new JSONObject(mapLIZJ), null);
                return;
            }
            return;
        }
        LIZIZ = System.currentTimeMillis();
        Pair[] pairArr2 = new Pair[2];
        pairArr2[0] = new Pair("action", CardStruct.IStatusCode.DEFAULT);
        if (!C1514430pVp.LIZLLL().booleanValue()) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr2[1] = new Pair("is_first_launch", str3);
        Map mapLJIIIIZZ2 = C2097608Jq.LJIIIIZZ(pairArr2);
        C20684815ws.LJIILLIIL("pns_device_consent_acceptance", mapLJIIIIZZ2);
        C793770VBv.LJII("pns_device_consent_acceptance", new JSONObject(mapLJIIIIZZ2), null, null);
    }
}
