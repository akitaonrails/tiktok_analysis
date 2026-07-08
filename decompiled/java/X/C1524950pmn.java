package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pmn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class C1524950pmn extends C2217421BqW implements Function2<JSONObject, Integer, C2220181Buy> {
    public C1524950pmn(C1524940pmm c1524940pmm) {
        super(2, c1524940pmm, C1524940pmm.class, "operateUDPSocket", "operateUDPSocket(Lorg/json/JSONObject;I)Lcom/bytedance/amg/minigameruntime/common/JSResponse;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C2220181Buy invoke(JSONObject jSONObject, Integer num) throws JSONException {
        C1525120pn4 c1525120pn4;
        JSONObject jSONObject2 = jSONObject;
        num.intValue();
        C1524940pmm c1524940pmm = (C1524940pmm) this.receiver;
        c1524940pmm.getClass();
        try {
            C1525000pms c1525000pms = c1524940pmm.LIZIZ;
            if (c1525000pms != null && (c1525120pn4 = c1525000pms.LIZIZ(jSONObject2).LIZ) != null) {
                return C1524940pmm.LIZ(c1525120pn4);
            }
            return C2220181Buy.LJFF;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1304110k2b.LIZ("operate udp socket failed", th);
            int iOptInt = jSONObject2.optInt("socketId", 0);
            String message = th.getMessage();
            if (message == null) {
                message = "operate fail";
            }
            c1524940pmm.LIZIZ(iOptInt, -1, message);
            return C2220181Buy.LJFF;
        }
    }
}
