package X;

import android.view.View;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.InteractionLayoutNewEventSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0atT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C952490atT {
    public static C952460atQ LIZIZ;
    public static C952480atS LIZJ;
    public static WeakReference<View> LJFF;
    public static final C952490atT LIZ = new C952490atT();
    public static final Map<String, C952520atW> LIZLLL = new LinkedHashMap();
    public static final Map<String, C952530atX> LJ = new LinkedHashMap();

    public static int LJFF() {
        C931800aM6.LIZ.getClass();
        if (C931800aM6.LIZIZ()) {
            return 3;
        }
        return C963580bBM.LIZ() ? 2 : 1;
    }

    public static String LJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IC_");
        sbLIZ.append(u.LJJIFFI(UUID.randomUUID().toString(), "-", "", false));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZLLL(EnumC952510atV enumC952510atV, C952540atY c952540atY, Map map) throws JSONException {
        boolean z;
        C952480atS c952480atS;
        InteractionLayoutNewEventSetting interactionLayoutNewEventSetting = InteractionLayoutNewEventSetting.INSTANCE;
        if (!interactionLayoutNewEventSetting.getValue().isEnabled) {
            return;
        }
        C952480atS c952480atS2 = LIZJ;
        if (c952480atS2 != null && System.currentTimeMillis() - c952480atS2.LJIIIZ > interactionLayoutNewEventSetting.getValue().layoutPipelineStageTimeout) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C952480atS c952480atS3 = LIZJ;
            if (c952480atS3 != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("fail_reason", "timeout");
                LJIIIZ(c952480atS3, EnumC952510atV.AUDIENCE_ROOM_ENTER_FAIL, linkedHashMap);
            }
            LIZJ = null;
        }
        C952480atS c952480atS4 = LIZJ;
        if (enumC952510atV == EnumC952510atV.AUDIENCE_ROOM_ENTER_ROOM_ENTER) {
            if (c952480atS4 != null && (c952480atS = LIZJ) != null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("fail_reason", "cancel");
                LJIIIZ(c952480atS, EnumC952510atV.AUDIENCE_ROOM_ENTER_FAIL, linkedHashMap2);
            }
            c952480atS4 = new C952480atS(c952540atY);
            LIZJ = c952480atS4;
        } else if (c952480atS4 == null) {
            return;
        }
        LJIIIZ(c952480atS4, enumC952510atV, map);
        c952480atS4.LJII.putAll(map);
        if (enumC952510atV == EnumC952510atV.AUDIENCE_ROOM_ENTER_RENDER || enumC952510atV == EnumC952510atV.AUDIENCE_ROOM_ENTER_FAIL) {
            LIZJ = null;
        }
    }

    public static void LJI(C952460atQ c952460atQ, EnumC952500atU enumC952500atU, Map map) throws JSONException {
        map.put("pipeline_type", c952460atQ.LJI.LIZ.getPipelineTypeValue());
        map.put("pt_source_id", String.valueOf(c952460atQ.LJI.LIZIZ));
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) LIZLLL).entrySet()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("source_id", ((C952520atW) entry.getValue()).LJI.get("source_id"));
            jSONObject.put(Scene.SCENE_SERVICE, ((C952520atW) entry.getValue()).LJI.get(Scene.SCENE_SERVICE));
            jSONObject.put("layout_key", ((C952520atW) entry.getValue()).LJI.get("layout_key"));
            jSONObject.put("spot_list", ((C952520atW) entry.getValue()).LJI.get("spot_list"));
            jSONObject.put("layout_id", ((C952520atW) entry.getValue()).LJI.get("layout_id"));
            jSONObject.put("fail_reason", ((C952520atW) entry.getValue()).LJI.get("fail_reason"));
            arrayList.add(jSONObject);
        }
        String strLIZLLL = C1058250de3.LIZLLL(arrayList);
        if (strLIZLLL == null) {
            strLIZLLL = "";
        }
        map.put("layout_pipeline_info", strLIZLLL);
        c952460atQ.LJIIZILJ();
        long jCurrentTimeMillis = System.currentTimeMillis();
        c952460atQ.LJIIIIZZ.put(enumC952500atU.getStageName(), Long.valueOf(jCurrentTimeMillis));
        c952460atQ.LJIIIZ = jCurrentTimeMillis;
        c952460atQ.LJIIL(Integer.valueOf(LJFF()), "layout_sdk_version", true);
        c952460atQ.LJIIL(enumC952500atU.getStageName(), "stage", true);
        Iterator<C954460awe> it2 = C915980Zwa.LJII().LJIJJ().iterator();
        while (it2.hasNext() && !it2.next().LJI()) {
        }
        c952460atQ.LJIIL(1, "user_type", true);
        for (Map.Entry entry2 : map.entrySet()) {
            AbstractC962030b8r.LJIIJ(c952460atQ.LIZLLL, (String) entry2.getKey(), entry2.getValue(), true);
        }
        for (Map.Entry entry3 : ((LinkedHashMap) c952460atQ.LJIIIIZZ).entrySet()) {
            String str = (String) entry3.getKey();
            long jLongValue = ((Number) entry3.getValue()).longValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("_ts");
            AbstractC962030b8r.LJIIJ(c952460atQ.LIZLLL, C2188811AlT.LIZIZ(sbLIZ), Long.valueOf(jLongValue), true);
        }
        c952460atQ.LJIJJLI("layout_trigger_anchor");
    }

    public static void LJII(C952520atW c952520atW, EnumC955050axb enumC955050axb, Map map) {
        String pipelineTypeValue;
        int i;
        C952540atY c952540atY;
        C952540atY c952540atY2;
        EnumC944090afv enumC944090afv;
        C952460atQ c952460atQ = LIZIZ;
        if (c952460atQ == null || (c952540atY2 = c952460atQ.LJI) == null || (enumC944090afv = c952540atY2.LIZ) == null || (pipelineTypeValue = enumC944090afv.getPipelineTypeValue()) == null) {
            pipelineTypeValue = EnumC944090afv.ANCHOR_NORMAL.getPipelineTypeValue();
        }
        map.put("pipeline_type", pipelineTypeValue);
        C952460atQ c952460atQ2 = LIZIZ;
        if (c952460atQ2 != null && (c952540atY = c952460atQ2.LJI) != null) {
            i = c952540atY.LIZIZ;
        } else {
            i = -1;
        }
        map.put("pt_source_id", String.valueOf(i));
        c952520atW.LJIIZILJ();
        long jCurrentTimeMillis = System.currentTimeMillis();
        c952520atW.LJII.put(enumC955050axb.getStageName(), Long.valueOf(jCurrentTimeMillis));
        c952520atW.LJIIIIZZ = jCurrentTimeMillis;
        c952520atW.LJIIL(Integer.valueOf(LJFF()), "layout_sdk_version", true);
        c952520atW.LJIIL(enumC955050axb.getStageName(), "stage", true);
        Iterator<C954460awe> it2 = C915980Zwa.LJII().LJIJJ().iterator();
        while (it2.hasNext() && !it2.next().LJI()) {
        }
        c952520atW.LJIIL(1, "user_type", true);
        for (Map.Entry entry : map.entrySet()) {
            AbstractC962030b8r.LJIIJ(c952520atW.LIZLLL, (String) entry.getKey(), entry.getValue(), true);
        }
        for (Map.Entry entry2 : ((LinkedHashMap) c952520atW.LJII).entrySet()) {
            String str = (String) entry2.getKey();
            long jLongValue = ((Number) entry2.getValue()).longValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("_ts");
            AbstractC962030b8r.LJIIJ(c952520atW.LIZLLL, C2188811AlT.LIZIZ(sbLIZ), Long.valueOf(jLongValue), true);
        }
        c952520atW.LJIJJLI("layout_trigger_anchor");
    }

    public static void LJIIIIZZ(C952530atX c952530atX, EnumC955060axc enumC955060axc, Map map) {
        String pipelineTypeValue;
        int i;
        String str;
        C954460awe next;
        int i2;
        C952540atY c952540atY;
        C952540atY c952540atY2;
        EnumC944090afv enumC944090afv;
        C952480atS c952480atS = LIZJ;
        if (c952480atS == null || (c952540atY2 = c952480atS.LJI) == null || (enumC944090afv = c952540atY2.LIZ) == null || (pipelineTypeValue = enumC944090afv.getPipelineTypeValue()) == null) {
            pipelineTypeValue = EnumC944090afv.ANCHOR_NORMAL.getPipelineTypeValue();
        }
        map.put("pipeline_type", pipelineTypeValue);
        C952480atS c952480atS2 = LIZJ;
        if (c952480atS2 != null && (c952540atY = c952480atS2.LJI) != null) {
            i = c952540atY.LIZIZ;
        } else {
            i = -1;
        }
        map.put("pt_source_id", String.valueOf(i));
        c952530atX.LJIIZILJ();
        long jCurrentTimeMillis = System.currentTimeMillis();
        c952530atX.LJII.put(enumC955060axc.getStageName(), Long.valueOf(jCurrentTimeMillis));
        c952530atX.LJIIIIZZ = jCurrentTimeMillis;
        c952530atX.LJIIL(Integer.valueOf(LJFF()), "layout_sdk_version", true);
        c952530atX.LJIIL(enumC955060axc.getStageName(), "stage", true);
        Iterator<C954460awe> it2 = C915980Zwa.LJII().LJIJJ().iterator();
        while (true) {
            str = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LJI()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C954460awe c954460awe = next;
        if (c954460awe != null) {
            str = c954460awe.LJIIJJI;
        }
        if (C948780anU.LJIIJ(C915980Zwa.LJII().LJIIIZ(), str)) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        c952530atX.LJIIL(Integer.valueOf(i2), "user_type", true);
        for (Map.Entry entry : map.entrySet()) {
            AbstractC962030b8r.LJIIJ(c952530atX.LIZLLL, (String) entry.getKey(), entry.getValue(), true);
        }
        for (Map.Entry entry2 : ((LinkedHashMap) c952530atX.LJII).entrySet()) {
            String str2 = (String) entry2.getKey();
            long jLongValue = ((Number) entry2.getValue()).longValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append("_ts");
            AbstractC962030b8r.LJIIJ(c952530atX.LIZLLL, C2188811AlT.LIZIZ(sbLIZ), Long.valueOf(jLongValue), true);
        }
        c952530atX.LJIJJLI("layout_trigger_audience");
    }

    public static void LJIIIZ(C952480atS c952480atS, EnumC952510atV enumC952510atV, Map map) throws JSONException {
        String str;
        C954460awe next;
        int i;
        map.put("pipeline_type", c952480atS.LJI.LIZ.getPipelineTypeValue());
        map.put("pt_source_id", String.valueOf(c952480atS.LJI.LIZIZ));
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) LIZLLL).entrySet()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("source_id", ((C952520atW) entry.getValue()).LJI.get("source_id"));
            jSONObject.put(Scene.SCENE_SERVICE, ((C952520atW) entry.getValue()).LJI.get(Scene.SCENE_SERVICE));
            jSONObject.put("layout_key", ((C952520atW) entry.getValue()).LJI.get("layout_key"));
            jSONObject.put("spot_list", ((C952520atW) entry.getValue()).LJI.get("spot_list"));
            jSONObject.put("layout_id", ((C952520atW) entry.getValue()).LJI.get("layout_id"));
            jSONObject.put("fail_reason", ((C952520atW) entry.getValue()).LJI.get("fail_reason"));
            arrayList.add(jSONObject);
        }
        String strLIZLLL = C1058250de3.LIZLLL(arrayList);
        if (strLIZLLL == null) {
            strLIZLLL = "";
        }
        map.put("layout_pipeline_info", strLIZLLL);
        c952480atS.LJIIZILJ();
        long jCurrentTimeMillis = System.currentTimeMillis();
        c952480atS.LJIIIIZZ.put(enumC952510atV.getStageName(), Long.valueOf(jCurrentTimeMillis));
        c952480atS.LJIIIZ = jCurrentTimeMillis;
        c952480atS.LJIIL(Integer.valueOf(LJFF()), "layout_sdk_version", true);
        c952480atS.LJIIL(enumC952510atV.getStageName(), "stage", true);
        Iterator<C954460awe> it2 = C915980Zwa.LJII().LJIJJ().iterator();
        while (true) {
            str = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LJI()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C954460awe c954460awe = next;
        if (c954460awe != null) {
            str = c954460awe.LJIIJJI;
        }
        if (C948780anU.LJIIJ(C915980Zwa.LJII().LJIIIZ(), str)) {
            i = 2;
        } else {
            i = 3;
        }
        c952480atS.LJIIL(Integer.valueOf(i), "user_type", true);
        for (Map.Entry entry2 : map.entrySet()) {
            AbstractC962030b8r.LJIIJ(c952480atS.LIZLLL, (String) entry2.getKey(), entry2.getValue(), true);
        }
        for (Map.Entry entry3 : ((LinkedHashMap) c952480atS.LJIIIIZZ).entrySet()) {
            String str2 = (String) entry3.getKey();
            long jLongValue = ((Number) entry3.getValue()).longValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append("_ts");
            AbstractC962030b8r.LJIIJ(c952480atS.LIZLLL, C2188811AlT.LIZIZ(sbLIZ), Long.valueOf(jLongValue), true);
        }
        c952480atS.LJIJJLI("layout_trigger_audience");
    }

    public final synchronized void LIZ(EnumC952500atU enumC952500atU, C952540atY c952540atY, Map<String, String> map) {
        C952460atQ c952460atQ;
        InteractionLayoutNewEventSetting interactionLayoutNewEventSetting = InteractionLayoutNewEventSetting.INSTANCE;
        if (!interactionLayoutNewEventSetting.getValue().isEnabled) {
            return;
        }
        C952460atQ c952460atQ2 = LIZIZ;
        boolean z = false;
        if (c952460atQ2 != null && System.currentTimeMillis() - c952460atQ2.LJIIIZ > interactionLayoutNewEventSetting.getValue().layoutPipelineStageTimeout) {
            z = true;
        }
        if (z) {
            C952460atQ c952460atQ3 = LIZIZ;
            if (c952460atQ3 != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("fail_reason", "timeout");
                LJI(c952460atQ3, EnumC952500atU.ANCHOR_CONN_LAYOUT_FAIL, linkedHashMap);
            }
            LIZIZ = null;
        }
        C952460atQ c952460atQ4 = LIZIZ;
        if (enumC952500atU == EnumC952500atU.ANCHOR_CONN_SUCCESS) {
            if (c952460atQ4 != null && (c952460atQ = LIZIZ) != null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.put("fail_reason", "cancel");
                LJI(c952460atQ, EnumC952500atU.ANCHOR_CONN_LAYOUT_FAIL, linkedHashMap2);
            }
            c952460atQ4 = new C952460atQ(c952540atY);
            LIZIZ = c952460atQ4;
        } else {
            if (c952460atQ4 != null) {
            }
        }
        LJI(c952460atQ4, enumC952500atU, map);
        c952460atQ4.LJII.putAll(map);
        if (enumC952500atU.isEndState()) {
            LIZIZ = null;
        }
    }

    public final synchronized void LIZIZ(String str, EnumC955050axb enumC955050axb, Map<String, String> map) {
        C952460atQ c952460atQ;
        if (!InteractionLayoutNewEventSetting.INSTANCE.getValue().isEnabled) {
            return;
        }
        Map<String, C952520atW> map2 = LIZLLL;
        int size = map2.size();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(((LinkedHashMap) map2).keySet());
        for (int i = 0; i < size; i++) {
            String str2 = (String) ListProtector.get(arrayList, i);
            Map<String, C952520atW> map3 = LIZLLL;
            C952520atW c952520atW = (C952520atW) ((LinkedHashMap) map3).get(str2);
            if (c952520atW != null && System.currentTimeMillis() - c952520atW.LJIIIIZZ > InteractionLayoutNewEventSetting.INSTANCE.getValue().layoutPipelineStageTimeout) {
                Map<String, String> map4 = c952520atW.LJI;
                map4.put("fail_reason", "timeout");
                LJII(c952520atW, EnumC955050axb.FAIL, map4);
                map3.remove(str2);
            }
        }
        if (enumC955050axb == EnumC955050axb.PIPELINE_TRIGGER) {
            LIZLLL.put(str, new C952520atW(null));
        }
        Map<String, C952520atW> map5 = LIZLLL;
        C952520atW c952520atW2 = (C952520atW) ((LinkedHashMap) map5).get(str);
        if (c952520atW2 != null) {
            C952490atT c952490atT = LIZ;
            LJII(c952520atW2, enumC955050axb, map);
            c952520atW2.LJI.putAll(map);
            EnumC955050axb enumC955050axb2 = EnumC955050axb.PIPELINE_UI_DRAW_END;
            if (enumC955050axb == enumC955050axb2 || enumC955050axb == EnumC955050axb.FAIL || enumC955050axb == EnumC955050axb.TIMEOUT) {
                if (enumC955050axb == enumC955050axb2 && (c952460atQ = LIZIZ) != null) {
                    c952490atT.LIZ(EnumC952500atU.ANCHOR_CONN_LAYOUT_RENDER, c952460atQ.LJI, new LinkedHashMap());
                }
                map5.remove(str);
            }
        }
    }

    public final synchronized void LIZJ(String str, EnumC955060axc enumC955060axc, Map map) {
        C952480atS c952480atS;
        if (!InteractionLayoutNewEventSetting.INSTANCE.getValue().isEnabled) {
            return;
        }
        Map<String, C952530atX> map2 = LJ;
        int size = map2.size();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(((LinkedHashMap) map2).keySet());
        for (int i = 0; i < size; i++) {
            String str2 = (String) ListProtector.get(arrayList, i);
            Map<String, C952530atX> map3 = LJ;
            C952530atX c952530atX = (C952530atX) ((LinkedHashMap) map3).get(str2);
            if (c952530atX != null && System.currentTimeMillis() - c952530atX.LJIIIIZZ > InteractionLayoutNewEventSetting.INSTANCE.getValue().layoutPipelineStageTimeout) {
                Map<String, String> map4 = c952530atX.LJI;
                map4.put("fail_reason", "timeout");
                LJIIIIZZ(c952530atX, EnumC955060axc.FAIL, map4);
                map3.remove(str2);
            }
        }
        Map<String, C952530atX> map5 = LJ;
        C952530atX c952530atX2 = (C952530atX) ((LinkedHashMap) map5).get(str);
        if (c952530atX2 == null) {
            if (enumC955060axc == EnumC955060axc.PIPELINE_TRIGGER || enumC955060axc == EnumC955060axc.PIPELINE_REAL_TRIGGER) {
                map5.put(str, new C952530atX(0));
                c952530atX2 = (C952530atX) ((LinkedHashMap) map5).get(str);
                if (c952530atX2 != null) {
                }
            }
        }
        LJIIIIZZ(c952530atX2, enumC955060axc, map);
        c952530atX2.LJI.putAll(map);
        EnumC955060axc enumC955060axc2 = EnumC955060axc.PIPELINE_UI_DRAW_END;
        if (enumC955060axc == enumC955060axc2 || enumC955060axc == EnumC955060axc.FAIL || enumC955060axc == EnumC955060axc.TIMEOUT) {
            if (enumC955060axc == enumC955060axc2 && (c952480atS = LIZJ) != null) {
                LIZLLL(EnumC952510atV.AUDIENCE_ROOM_ENTER_RENDER, c952480atS.LJI, new LinkedHashMap());
            }
            map5.remove(str);
        }
    }
}
