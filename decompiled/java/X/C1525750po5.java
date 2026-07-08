package X;

import android.os.Build;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0po5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1525750po5 {
    public static C1525750po5 LIZIZ;
    public C1526570ppP LIZ;

    public static C1525750po5 LIZ() {
        if (LIZIZ == null) {
            synchronized (C1525750po5.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C1525750po5();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }

    public static void LIZIZ(JSONObject jSONObject) throws JSONException {
        jSONObject.put("aid", CastIntegerProtector.parseInt(((InterfaceC1525760po6) C808470VnZ.LIZ(InterfaceC1525760po6.class)).config().LIZ));
        InterfaceC1526260pou interfaceC1526260pou = (InterfaceC1526260pou) C808470VnZ.LIZ(InterfaceC1526260pou.class);
        jSONObject.put("did", CastLongProtector.parseLong(interfaceC1526260pou.LIZIZ().LIZ));
        jSONObject.put("encode_uid", interfaceC1526260pou.LIZIZ().LIZIZ);
        jSONObject.put("platform", "android");
        jSONObject.put("platform_version", String.valueOf(Build.VERSION.SDK_INT));
        jSONObject.put("sdk_version", String.valueOf(-1));
        jSONObject.put("app_version", "");
        jSONObject.put("params_for_special", "bytesync_sdk");
    }

    public static void LIZJ(String str, JSONObject jSONObject) {
        try {
            LIZIZ(jSONObject);
            LIZ().LIZ.getClass();
            AppLogNewUtils.onEventV3(str, jSONObject);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onEventV3: eventName = ");
            sbLIZ.append(str);
            sbLIZ.append(" ");
            sbLIZ.append(C786410Ut5.J3(jSONObject));
            C1527890prX.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onEventV3 err: ");
            sbLIZ2.append(th);
            C1527890prX.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }
}
