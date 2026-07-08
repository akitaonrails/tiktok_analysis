package X;

import com.ss.android.ugc.aweme.ecommerce.mall.settings.LandingPopupOptExperiment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS35S2200000_24;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0vQA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1741560vQA {
    public static final /* synthetic */ int LJI = 0;
    public final String LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final Map<String, Object> LIZLLL;
    public volatile long LJ;
    public volatile boolean LJFF;

    static {
        new C1741530vQ7();
    }

    public final void LJ(Map<String, ? extends Object> map) {
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value != null) {
                this.LIZLLL.put(entry.getKey(), value);
            } else {
                this.LIZLLL.remove(entry.getKey());
            }
        }
    }

    public C1741560vQA(String str, String str2, long j, Map map) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = j;
        this.LIZLLL = map;
        this.LJ = j;
    }

    public static void LIZJ(C1741560vQA c1741560vQA, String str, long j, Map map, int i) {
        Map map2 = map;
        long j2 = j;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        if ((i & 4) != 0) {
            map2 = null;
        }
        c1741560vQA.getClass();
        LIZLLL(c1741560vQA, str, j2, null, null, null, null, map2, 60);
    }

    public final void LIZ(String str, boolean z, Integer num, String str2, JSONObject jSONObject, Map<String, Object> map) throws JSONException {
        String str3;
        JSONObject jSONObjectLIZ;
        if (this.LJFF) {
            String str4 = this.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("redundant perf track ");
            sbLIZ.append(this.LIZIZ);
            sbLIZ.append(' ');
            sbLIZ.append(str);
            C1557000qcU.LIZ(str4, C2188811AlT.LIZIZ(sbLIZ), this.LIZLLL);
            return;
        }
        this.LJFF = true;
        if (z) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        if (jSONObject != null) {
            jSONObjectLIZ = C475630Ikz.LIZ(jSONObject);
            jSONObjectLIZ.remove("schema");
            jSONObjectLIZ.remove("data");
        } else {
            jSONObjectLIZ = null;
        }
        LIZLLL(this, str, 0L, str3, num, str2, jSONObjectLIZ, map, 2);
    }

    public static void LIZLLL(C1741560vQA c1741560vQA, String str, long j, String str2, Integer num, String str3, JSONObject jSONObject, Map map, int i) {
        String str4;
        Map map2 = map;
        String str5 = str3;
        if ((i & 2) != 0) {
            j = 0;
        }
        String strJ3 = null;
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 16) != 0) {
            str5 = null;
        }
        if ((i & 32) != 0) {
            jSONObject = null;
        }
        if ((i & 64) != 0) {
            map2 = null;
        }
        c1741560vQA.getClass();
        if (j <= 0) {
            j = System.currentTimeMillis();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("rd_tiktokec_mix_mall_diversion_perf_");
        sbLIZ.append(c1741560vQA.LIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(c1741560vQA.LIZLLL);
        linkedHashMap.put("action", c1741560vQA.LIZIZ);
        C1008603wy.LIZIZ(linkedHashMap, "key_point", str);
        linkedHashMap.put("init_time", String.valueOf(c1741560vQA.LIZJ));
        linkedHashMap.put("action_duration", Integer.valueOf((int) (j - c1741560vQA.LIZJ)));
        linkedHashMap.put("point_duration", Integer.valueOf((int) (j - c1741560vQA.LJ)));
        C1008603wy.LIZIZ(linkedHashMap, "action_result", str2);
        C1008603wy.LIZIZ(linkedHashMap, "code", num);
        C1008603wy.LIZIZ(linkedHashMap, "msg", str5);
        if (jSONObject != null) {
            strJ3 = C786410Ut5.J3(jSONObject);
        }
        C1008603wy.LIZIZ(linkedHashMap, "extra_data", strJ3);
        if (map2 != null) {
            linkedHashMap.putAll(map2);
        }
        linkedHashMap.put("mall_tab_position", Integer.valueOf(C1584390rKf.LIZ()));
        C1767960w6k.LIZ.getClass();
        if (C1767960w6k.LJFF) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_first_enter_mall", str4);
        c1741560vQA.LJ = j;
        C1768180w76.LIZ(strLIZIZ, null, linkedHashMap, LandingPopupOptExperiment.LIZ().enableMallTrackOpt);
        if (Intrinsics.LJFF(c1741560vQA.LIZ, "half_screen") && LandingPopupOptExperiment.LIZ().enableLandingTrackOpt) {
            C1767950w6j c1767950w6j = C1767950w6j.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("rd_tiktokec_mix_mall_diversion_perf2_");
            sbLIZ2.append(c1741560vQA.LIZ);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
            c1767950w6j.getClass();
            C1767950w6j.LJIJ(strLIZIZ2, linkedHashMap2);
        }
        new AwS35S2200000_24(strLIZIZ, (String) c1741560vQA, (C1741560vQA) str, (String) linkedHashMap, (Map<String, Object>) 2);
    }
}
