package X;

import kotlin.Unit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Cji, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public /* synthetic */ class C321960Cji extends C2217421BqW implements InterfaceC1631620sYq<String, Long, Integer, Unit> {
    public C321960Cji(C1862360yZ0 c1862360yZ0) {
        super(3, c1862360yZ0, C1862360yZ0.class, "onInboxMessageFromWs", "onInboxMessageFromWs(Ljava/lang/String;JI)V", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(String str, Long l, Integer num) throws JSONException {
        long jLongValue = l.longValue();
        int iIntValue = num.intValue();
        this.receiver.getClass();
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("message_id", str);
        jSONObject.put("cost_time", jLongValue);
        jSONObject.put("result", iIntValue);
        c20235014FoLIZ.LIZIZ("tikbot_active_message_cost_by_ws", jSONObject);
        return Unit.LIZ;
    }
}
