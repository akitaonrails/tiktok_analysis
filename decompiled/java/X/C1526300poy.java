package X;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0poy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1526300poy {
    public static volatile C0VCC LIZ;
    public static volatile boolean LIZIZ;
    public static String LIZJ = "";

    public static final void LIZLLL(String str, Throwable th) {
        JSONObject jSONObject = new JSONObject();
        C1499090p75.LIZJ("errMsg", str, jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        C1499090p75.LIZJ("stack", Log.getStackTraceString(th), jSONObject2);
        C1499090p75.LIZJ("type", th.getClass().getName(), jSONObject2);
        C1527890prX.LIZ(Intrinsics.LJIIJJI(jSONObject, "[Monitor] -> syncsdk_exception,"));
        try {
            C1AF0.LJFF(th, str);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    public static final void LIZJ(int i, int i2, int i3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("compress_ratio", i / i2);
            jSONObject.put("compress_msg_type", i3);
            LIZ("sync_sdk_compress", jSONObject, null, null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LIZLLL(null, e);
        }
    }

    public static final void LIZ(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        String strLJIIJJI;
        if (LIZIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[Monitor] ");
            sbLIZ.append(str);
            sbLIZ.append(", ");
            sbLIZ.append(jSONObject);
            sbLIZ.append(", ");
            sbLIZ.append(jSONObject2);
            sbLIZ.append(", ");
            sbLIZ.append(jSONObject3);
            C1527890prX.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            C0VCC c0vcc = LIZ;
            if (TextUtils.isEmpty(LIZJ)) {
                strLJIIJJI = "";
            } else {
                strLJIIJJI = Intrinsics.LJIIJJI(LIZJ, "_");
            }
            c0vcc.LJIIJ(Intrinsics.LJIIJJI(strLJIIJJI, str), jSONObject, jSONObject2, jSONObject3);
        }
    }
}
