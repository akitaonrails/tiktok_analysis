package X;

import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.045G, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C045G {
    public static final C045G LIZ = new C045G();

    public static void LIZ(String str, Function0 function0) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event_name", str);
        Object objInvoke = function0.invoke();
        if (objInvoke != null) {
            jSONObject.put("params", objInvoke);
        }
        String strJ3 = C786410Ut5.J3(jSONObject);
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            iEventCenter.LIZ("ec_track_event_report", strJ3);
        }
    }
}
