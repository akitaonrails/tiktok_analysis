package X;

import com.bytedance.android.monitorV2.hybridSetting.entity.BidInfo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pfA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1520220pfA extends C1520560pfi {
    public static final /* synthetic */ int LJIILLIIL = 0;
    public AbstractC1520150pf3 LJIILIIL;
    public C1491810ovL LJIILJJIL;
    public JSONObject LJIILL;

    @Override // X.C1520560pfi
    public final JSONObject LJII() {
        C1514490pVv c1514490pVv;
        JSONObject jSONObjectOptJSONObject;
        String strLIZIZ;
        String strOptString;
        String strOptString2;
        String strOptString3;
        JSONObject jSONObject = new JSONObject();
        String strLIZIZ2 = LIZIZ();
        C1520380pfQ.LIZ.getClass();
        BidInfo.BidConfig bidConfigLIZ = C1520380pfQ.LIZJ().LJIIIIZZ().LIZ(strLIZIZ2);
        JSONObject jSONObject2 = new JSONObject();
        C12868051u.LJI(jSONObject2, "bid", strLIZIZ2);
        C12868051u.LJI(jSONObject2, "setting_bid", bidConfigLIZ.bid);
        C12868051u.LJI(jSONObject2, "hit_sample", Long.valueOf(bidConfigLIZ.hitSample));
        C12868051u.LJI(jSONObject2, "setting_id", Long.valueOf(bidConfigLIZ.settingId));
        C1520640pfq.LJIILIIL("event_type", this.LIZ, jSONObject);
        C1520640pfq.LJIILIIL("container_id", this.LIZJ, jSONObject);
        JSONObject jSONObjectLIZIZ = this.LJFF.LIZIZ();
        C1520640pfq.LJIILJJIL(jSONObject, "nativeBase", jSONObjectLIZIZ);
        C1520640pfq.LJIILJJIL(jSONObjectLIZIZ, "bid_info", jSONObject2);
        AbstractC1520150pf3 abstractC1520150pf3 = this.LJIILIIL;
        if (abstractC1520150pf3 != null) {
            C1520640pfq.LJIILJJIL(jSONObject, "nativeInfo", abstractC1520150pf3.LIZIZ());
        }
        JSONObject jSONObject3 = this.LJIILL;
        if (jSONObject3 != null) {
            C1520640pfq.LJIILJJIL(jSONObject, "jsInfo", jSONObject3);
        }
        C1520640pfq.LJIILJJIL(jSONObject, "jsBase", this.LJI);
        C1491800ovK c1491800ovK = this.LJII;
        if (c1491800ovK != null) {
            C1520640pfq.LJIILJJIL(jSONObject, "containerBase", c1491800ovK.LIZIZ());
        }
        C1491810ovL c1491810ovL = this.LJIILJJIL;
        if (c1491810ovL != null) {
            C1520640pfq.LJIILJJIL(jSONObject, "containerInfo", c1491810ovL.LIZIZ());
        }
        C1520640pfq.LJIILJJIL(jSONObject, "extra", new JSONObject((Map) this.LJIIIZ.getValue()));
        Set<Character> set = C1520140pf2.LJI;
        C1514490pVv c1514490pVv2 = C1514580pW4.LIZLLL;
        if (c1514490pVv2 != null && c1514490pVv2.LIZ) {
            String strOptString4 = jSONObject.optString("event_type");
            LinkedHashMap linkedHashMap = (LinkedHashMap) C1520140pf2.LJIIIIZZ;
            if (C15442062u.LJIIIIZZ("blank", linkedHashMap.keySet()).contains(strOptString4) && (c1514490pVv = C1514580pW4.LIZLLL) != null && c1514490pVv.LIZLLL) {
                JSONObject jSONObject4 = new JSONObject();
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("nativeInfo");
                JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("jsInfo");
                JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("containerInfo");
                for (String str : (ArrayList) C13LP.LJLIL(C1697810uHb.LJIIJJI("st_checkpoints", "st_bizsteps", "client_issue_id", "has_fatal_error", "blank_category"), linkedHashMap.values())) {
                    if (Intrinsics.LJFF(str, "client_issue_id")) {
                        strLIZIZ = "_issue_id";
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append('_');
                        sbLIZ.append(str);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    }
                    if (jSONObjectOptJSONObject2 != null && (strOptString3 = jSONObjectOptJSONObject2.optString(str)) != null && strOptString3.length() > 0) {
                        C1520640pfq.LJIILIIL(strLIZIZ, strOptString3, jSONObject4);
                    }
                    if (jSONObjectOptJSONObject3 != null && (strOptString2 = jSONObjectOptJSONObject3.optString(str)) != null && strOptString2.length() > 0) {
                        C1520640pfq.LJIILIIL(strLIZIZ, strOptString2, jSONObject4);
                    }
                    if (jSONObjectOptJSONObject4 != null && (strOptString = jSONObjectOptJSONObject4.optString(str)) != null && strOptString.length() > 0) {
                        C1520640pfq.LJIILIIL(strLIZIZ, strOptString, jSONObject4);
                    }
                }
                JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("nativeBase");
                if (jSONObjectOptJSONObject5 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject5.optJSONObject("context")) != null) {
                    JSONObject jSONObjectLJIILL = C1520640pfq.LJIILL(C786410Ut5.J3(jSONObjectOptJSONObject));
                    C1520640pfq.LIZ(jSONObjectLJIILL, jSONObject4);
                    C1520640pfq.LJIILJJIL(jSONObjectOptJSONObject5, "context", jSONObjectLJIILL);
                }
            }
        }
        return jSONObject;
    }

    public C1520220pfA(String str) {
        super(str);
    }
}
