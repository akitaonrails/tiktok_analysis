package X;

import Y.ARunnableS92S0000000_13;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Vp8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C809440Vp8 {
    public static WeakHandler LIZIZ;
    public static long LIZLLL;
    public static final WeakHandler.IHandler LIZ = new WeakHandler.IHandler() { // from class: X.0VpA
        @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
        public final void handleMsg(Message message) {
            if (message != null && message.what == 2) {
                RunnableC823120WQs.LIZIZ(new ARunnableS92S0000000_13(0));
            }
        }
    };
    public static volatile AtomicBoolean LIZJ = new AtomicBoolean(false);

    public static Handler LIZ() {
        if (LIZIZ == null) {
            LIZIZ = new WeakHandler(Looper.getMainLooper(), LIZ);
        }
        return LIZIZ;
    }

    public static void LIZIZ(int i, long j) {
        String str;
        if (i != 201) {
            str = "init success";
        } else {
            str = "not invoke start() method/not invoke start() when 30s passed";
        }
        if (i == 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Push init error:");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Push init error:");
            sbLIZ2.append(str);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, i);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("delta", j);
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        C809410Vp5.LIZIZ("push_monitor_applog_timeout", jSONObject, jSONObject2, null);
        if (i == 0) {
            i = 0;
        }
        C809760Vpe.LIZ("1002", null, str, i);
    }
}
