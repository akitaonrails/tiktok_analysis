package X;

import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Vp9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C809450Vp9 {
    public static final WeakHandler.IHandler LIZ = new WeakHandler.IHandler() { // from class: X.0Vp7
        @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
        public final void handleMsg(Message message) {
            if (message != null && message.what == 1001) {
                String strLIZJ = C809470VpB.LJIIIIZZ(C809360Vp0.LIZ).LIZJ(((Integer) HandlerHook.getMessageObj(message.obj)).intValue());
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZJ);
                sbLIZ.append(" register timeout");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 108);
                    jSONObject.put("pushType", HandlerHook.getMessageObj(message.obj));
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                C809410Vp5.LIZIZ("push_monitor_register_result", jSONObject, null, null);
                C809760Vpe.LIZ("1004", jSONObject, strLIZIZ, 108);
            }
        }
    };
    public static final WeakHandler LIZIZ = new WeakHandler(Looper.getMainLooper(), LIZ);
    public static final Map<Integer, Boolean> LIZJ = new ConcurrentHashMap(2);

    public static void LIZ(int i, String str, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, i);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (i == 0) {
            i = 0;
        }
        C809760Vpe.LIZ("1005", jSONObject, str, i);
        C809410Vp5.LIZIZ("outer_switch_upload_result", jSONObject2, null, jSONObject);
    }

    public static void LIZIZ(int i, String str, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, i);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (i == 0) {
            i = 0;
        }
        C809760Vpe.LIZ("1003", jSONObject, str, i);
        C809410Vp5.LIZIZ("push_monitor_update_sender", jSONObject2, null, jSONObject);
    }
}
