package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Ncj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C597910Ncj {
    public static final void LIZ(C1525630pnt c1525630pnt) {
        try {
            byte[] bArr = c1525630pnt.LIZ;
            if (bArr == null) {
                return;
            }
            String strLJIIIIZZ = C1741890vQh.LJIIIIZZ(new String(bArr, Charsets.UTF_8));
            IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
            if (iEventCenter != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("message_type", "pre_live_bytesync_message");
                jSONObject.put("data", strLJIIIIZZ);
                iEventCenter.LIZ("ec_content_message_event", C786410Ut5.J3(jSONObject));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
