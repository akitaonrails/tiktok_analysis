package X;

import Y.ARunnableS18S1100000_13;
import Y.ARunnableS18S1200000_13;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttvideoengine.utils.EngineThreadPool;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WPO, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WPO implements C0WPR {
    public static volatile Method LIZIZ;
    public static volatile Method LIZJ;
    public static volatile Method LIZLLL;
    public static final AtomicInteger LJ = new AtomicInteger(0);
    public Context LIZ;

    static {
        LIZ();
    }

    public static void LIZ() {
        if (LIZIZ == null || LIZJ == null || LIZLLL == null) {
            try {
                Class<?> cls = Class.forName("com.ss.android.common.applog.AppLog");
                LIZIZ = cls.getMethod("getCurrentSessionId", new Class[0]);
                LIZJ = cls.getMethod("recordMiscLog", Context.class, String.class, JSONObject.class);
                LIZLLL = Class.forName("com.ss.android.common.lib.AppLogNewUtils").getMethod("onEventV3", String.class, JSONObject.class);
                LJ.set(1);
                int i = C2187451AjH.LIZ;
                C1471660oOq.LIZJ("AppLogEngineUploader", "upload AppLog Success!");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("upload error (AppLog)");
                sbLIZ.append(e);
                C1471660oOq.LIZIZ("AppLogEngineUploader", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        if (LIZIZ == null || LIZJ == null || LIZLLL == null) {
            try {
                Class<?> cls2 = Class.forName("com.bytedance.applog.AppLog");
                LIZIZ = cls2.getMethod("getSessionId", new Class[0]);
                LIZJ = cls2.getMethod("onMiscEvent", String.class, JSONObject.class);
                LIZLLL = cls2.getMethod("onEventV3", String.class, JSONObject.class);
                LJ.set(2);
                int i3 = C2187451AjH.LIZ;
                C1471660oOq.LIZJ("AppLogEngineUploader", "upload BDTracker Success!");
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                int i4 = C2187451AjH.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("upload error (bdtracker)");
                sbLIZ2.append(e2);
                C1471660oOq.LIZIZ("AppLogEngineUploader", C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
    }

    public final void LIZIZ(String str, JSONObject jSONObject) {
        if (str != null && jSONObject != null) {
            EngineThreadPool.addExecuteTask(new ARunnableS18S1200000_13(this, jSONObject, str, 7));
            return;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onEvent, invalid parameter, event: ");
        sbLIZ.append(str);
        sbLIZ.append(", ");
        sbLIZ.append(jSONObject);
        C1471660oOq.LIZIZ("AppLogEngineUploader", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZJ(String str, JSONObject jSONObject) {
        if (str != null && jSONObject != null) {
            EngineThreadPool.addExecuteTask(new ARunnableS18S1100000_13(str, jSONObject, 14));
            return;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onEventV2, invalid parameter, event: ");
        sbLIZ.append(str);
        sbLIZ.append(", ");
        sbLIZ.append(jSONObject);
        C1471660oOq.LIZIZ("AppLogEngineUploader", C2188811AlT.LIZIZ(sbLIZ));
    }
}
