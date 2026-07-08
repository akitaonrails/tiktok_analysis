package com.benchmark.strategy.nativePort;

import X.C2079408Cq;
import X.C2188811AlT;
import X.C786410Ut5;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class ByteBenchFeatureCenterPort {
    public static native void native_registerComponent(String str);

    public static native void native_registerFeaturePool(String str, String str2);

    public static native void native_setEventSource(String str);

    public static native void native_unregisterFeaturePool(String str, String str2);

    public static native void native_unregisterFeaturePoolAll(String str);

    public static native void native_updateNumberFeatureValue(String str, double d);

    public static native void native_updateStrFeatureValue(String str, String str2);

    static {
        new HashMap();
    }

    public static void LIZ(JSONObject jSONObject) {
        if (!C2079408Cq.LIZIZ) {
            return;
        }
        native_registerFeaturePool("shoot_page", C786410Ut5.J3(jSONObject));
    }

    public static void LIZJ(List list) {
        if (C2079408Cq.LIZIZ && !list.isEmpty()) {
            String strLIZIZ = (String) ListProtector.get(list, 0);
            for (int i = 1; i < list.size(); i++) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZIZ);
                sbLIZ.append(",");
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ2);
                sbLIZ2.append((String) ListProtector.get(list, i));
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            native_unregisterFeaturePool("shoot_page", strLIZIZ);
        }
    }

    public static void LIZIZ(String str, JSONObject jSONObject) {
        if (!C2079408Cq.LIZIZ) {
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("event_name", str);
            jSONObject2.putOpt("params", jSONObject);
            native_setEventSource(C786410Ut5.J3(jSONObject2));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
