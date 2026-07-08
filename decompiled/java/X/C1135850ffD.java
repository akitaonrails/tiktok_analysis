package X;

import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ffD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1135850ffD {
    public boolean LIZ;
    public final Map<String, Long> LIZIZ;
    public final HashMap<String, Long> LIZJ;

    public final C1136330ffz LIZIZ() {
        Long l = this.LIZIZ.get("send");
        long j = 0;
        long jLongValue = l != null ? l.longValue() : 0L;
        Long l2 = this.LIZIZ.get("create");
        long jLongValue2 = l2 != null ? l2.longValue() : 0L;
        Long l3 = this.LIZIZ.get("receive");
        long jLongValue3 = l3 != null ? l3.longValue() : 0L;
        Long l4 = this.LIZIZ.get("enqueue");
        long jLongValue4 = l4 != null ? l4.longValue() : 0L;
        Long l5 = this.LIZIZ.get("dequeue");
        long jLongValue5 = l5 != null ? l5.longValue() : 0L;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("calculateDurationCommon:\nsendTs(");
        sbLIZ.append(jLongValue);
        sbLIZ.append(")\ncreateGiftMsgTs(");
        sbLIZ.append(jLongValue2);
        sbLIZ.append(")\ncreateTrayMsgTs(");
        sbLIZ.append(jLongValue3);
        sbLIZ.append(")\nenqueueTs(");
        sbLIZ.append(jLongValue4);
        sbLIZ.append(")\ndequeueTs(");
        sbLIZ.append(jLongValue5);
        sbLIZ.append(")\n");
        C20441214yg.LIZIZ("LiveGiftGeneralTrayMessageTimestampInfo", C2188811AlT.LIZIZ(sbLIZ));
        long j2 = (jLongValue <= 0 || jLongValue2 <= 0) ? 0L : jLongValue2 - jLongValue;
        long j3 = (jLongValue2 <= 0 || jLongValue3 <= 0) ? 0L : jLongValue3 - jLongValue2;
        long j4 = (jLongValue <= 0 || jLongValue4 <= 0) ? 0L : jLongValue4 - jLongValue;
        long j5 = (jLongValue2 <= 0 || jLongValue4 <= 0) ? 0L : jLongValue4 - jLongValue2;
        if (jLongValue4 > 0 && jLongValue5 > 0) {
            long j6 = jLongValue5 - jLongValue4;
            if (j6 >= 0) {
                j = j6;
            }
        }
        C1136330ffz c1136330ffz = new C1136330ffz(jLongValue, jLongValue2, jLongValue5, j2, j3, j4, j5, j);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("calculateDurationCommon res:\n");
        sbLIZ2.append(c1136330ffz);
        C20441214yg.LIZIZ("LiveGiftGeneralTrayMessageTimestampInfo", C2188811AlT.LIZIZ(sbLIZ2));
        return c1136330ffz;
    }

    public C1135850ffD(int i) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashMap<String, Long> map = new HashMap<>();
        this.LIZ = false;
        this.LIZIZ = linkedHashMap;
        this.LIZJ = map;
    }

    public final void LIZ(JSONObject jSONObject) throws JSONException {
        C1136330ffz c1136330ffzLIZIZ = LIZIZ();
        jSONObject.put("send_receive_dur", c1136330ffzLIZIZ.LIZLLL);
        jSONObject.put("msg_create_receive_dur", c1136330ffzLIZIZ.LJ);
        jSONObject.put("send_enqueue_dur", c1136330ffzLIZIZ.LJFF);
        jSONObject.put("receive_enqueue_dur", c1136330ffzLIZIZ.LJI);
        jSONObject.put("in_queue_dur", c1136330ffzLIZIZ.LJII);
    }

    public final Long LIZJ(String str) {
        return this.LIZIZ.get(str);
    }

    public final void LIZLLL(Map<String, Long> map) {
        this.LIZIZ.clear();
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            this.LIZIZ.put(entry.getKey(), entry.getValue());
        }
    }

    public final void LJ(InterfaceC1136020ffU interfaceC1136020ffU) {
        long j = interfaceC1136020ffU.LJJIFFI().LIZIZ;
        if (j > 0) {
            this.LIZIZ.put("create", Long.valueOf(j));
        }
        if (this.LIZ) {
            long jLJIJI = C1135800ff8.LJIJI(interfaceC1136020ffU);
            if (jLJIJI > 0) {
                this.LIZIZ.put("send", Long.valueOf(jLJIJI));
            }
        } else {
            long jLJIIZILJ = C1135800ff8.LJIIZILJ(interfaceC1136020ffU);
            if (jLJIIZILJ > 0) {
                this.LIZIZ.put("send", Long.valueOf(jLJIIZILJ));
            }
        }
        LJI("receive");
    }

    public final void LJFF(GiftMessage giftMessage) {
        CommonMessageData commonMessageData = giftMessage.baseMessage;
        if (commonMessageData != null) {
            long j = commonMessageData.createTime;
            if (j > 0) {
                this.LIZIZ.put("create", Long.valueOf(j));
            }
        }
        if (this.LIZ) {
            long jLJIJJ = C1135800ff8.LJIJJ(giftMessage);
            if (jLJIJJ > 0) {
                this.LIZIZ.put("send", Long.valueOf(jLJIJJ));
            }
        } else {
            long jLJIJ = C1135800ff8.LJIJ(giftMessage);
            if (jLJIJ > 0) {
                this.LIZIZ.put("send", Long.valueOf(jLJIJ));
            }
        }
        LJI("receive");
    }

    public final void LJI(String str) {
        if (this.LIZ) {
            this.LIZIZ.put(str, Long.valueOf(System.currentTimeMillis()));
        } else {
            this.LIZIZ.put(str, Long.valueOf(C158B.LIZ()));
        }
    }
}
