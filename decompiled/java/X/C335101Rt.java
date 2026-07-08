package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.ugc.live.sdk.message.data.IMessage;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.01Rt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C335101Rt {
    public static final void LIZ(IMessage iMessage) {
        try {
            JSONObject jSONObject = new JSONObject(C1741890vQh.LJIIIIZZ(iMessage));
            IEventCenter iEventCenter = (IEventCenter) ServiceManager.get().getService(IEventCenter.class);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("message_type", iMessage.getMethodName());
            jSONObject2.put("data", jSONObject);
            iEventCenter.LIZ("ec_content_message_event", C786410Ut5.J3(jSONObject2));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
