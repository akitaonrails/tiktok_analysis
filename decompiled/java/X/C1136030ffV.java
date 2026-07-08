package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ffV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1136030ffV {
    public static final void LIZ(C1138600fje c1138600fje, Map<String, String> map) {
        long jLongValue;
        if (map == null) {
            return;
        }
        Long l = c1138600fje.LJIILJJIL.get("sendReceivedDuration");
        if (l != null) {
            map.put("send_receive_dur", String.valueOf(l.longValue()));
        }
        Long l2 = c1138600fje.LJIILJJIL.get("createReceivedDuration");
        if (l2 != null) {
            map.put("msg_create_receive_dur", String.valueOf(l2.longValue()));
        }
        Long l3 = c1138600fje.LJIILJJIL.get("sendEnqueueDuration");
        if (l3 != null) {
            map.put("send_enqueue_dur", String.valueOf(l3.longValue()));
        }
        Long l4 = c1138600fje.LJIILJJIL.get("receivedEnqueueDuration");
        if (l4 != null) {
            map.put("receive_enqueue_dur", String.valueOf(l4.longValue()));
        }
        Long l5 = c1138600fje.LJIILJJIL.get("enqueueDequeueDuration");
        if (l5 != null) {
            jLongValue = l5.longValue();
            map.put("in_queue_dur", String.valueOf(jLongValue));
        } else {
            jLongValue = 0;
        }
        Long l6 = c1138600fje.LJIILJJIL.get("playStart");
        if (l6 != null) {
            long jLongValue2 = l6.longValue();
            if (jLongValue2 > 0) {
                Long l7 = c1138600fje.LJIILJJIL.get("sendTs");
                if (l7 != null) {
                    map.put("send_effect_start_total_dur", String.valueOf(jLongValue2 - l7.longValue()));
                }
                Long l8 = c1138600fje.LJIILJJIL.get("receiveTs");
                if (l8 != null) {
                    long jLongValue3 = jLongValue2 - l8.longValue();
                    map.put("receive_effect_start_dur", String.valueOf(jLongValue3));
                    map.put("receive_effect_start_without_queue_dur", String.valueOf(jLongValue3 - jLongValue));
                }
                Long l9 = c1138600fje.LJIILJJIL.get("dequeueTs");
                if (l9 != null) {
                    map.put("dequeue_effect_start_dur", String.valueOf(jLongValue2 - l9.longValue()));
                }
            }
        }
        Long l10 = c1138600fje.LJIILJJIL.get("playEnd");
        if (l10 != null) {
            long jLongValue4 = l10.longValue();
            if (jLongValue4 > 0) {
                Long l11 = c1138600fje.LJIILJJIL.get("playPrepare");
                if (l11 != null) {
                    map.put("playPrepare_playEnd_dur", String.valueOf(jLongValue4 - l11.longValue()));
                }
                Long l12 = c1138600fje.LJIILJJIL.get("playPrepared");
                if (l12 != null) {
                    map.put("playPrepared_playEnd_dur", String.valueOf(jLongValue4 - l12.longValue()));
                }
                Long l13 = c1138600fje.LJIILJJIL.get("playLoad");
                if (l13 != null) {
                    map.put("playLoad_playEnd_dur", String.valueOf(jLongValue4 - l13.longValue()));
                }
                Long l14 = c1138600fje.LJIILJJIL.get("playStart");
                if (l14 != null) {
                    map.put("playStart_playEnd_dur", String.valueOf(jLongValue4 - l14.longValue()));
                }
                Long l15 = c1138600fje.LJIILJJIL.get("playLoaded");
                if (l15 != null) {
                    map.put("playLoaded_playEnd_dur", String.valueOf(jLongValue4 - l15.longValue()));
                }
                Long l16 = c1138600fje.LJIILJJIL.get("playFirstFrame");
                if (l16 != null) {
                    map.put("playFirstFrame_playEnd_dur", String.valueOf(jLongValue4 - l16.longValue()));
                }
            }
        }
    }

    public static final void LIZIZ(C1138600fje c1138600fje, JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZ(c1138600fje, linkedHashMap);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            try {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJII(e);
            }
        }
    }
}
