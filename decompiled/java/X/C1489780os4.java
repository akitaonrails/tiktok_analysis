package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0os4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1489780os4 {
    public static InterfaceC1489790os5 LIZ;
    public static String LIZIZ;
    public static final ReadWriteLock LIZJ = new ReentrantReadWriteLock();
    public static C0C9C LIZLLL;

    public static InterfaceC1489790os5 LIZ() {
        InterfaceC1489790os5 interfaceC1489790os5;
        synchronized (C1489780os4.class) {
            try {
                interfaceC1489790os5 = LIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return interfaceC1489790os5;
    }

    public static void LIZIZ() {
        C0C9B c0c9b = new C0C9C() { // from class: X.0C9B
            @Override // X.C0C9C
            public final void LIZ(String str, Map<String, ? extends Object> map) throws JSONException {
                ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
                if (iSparkHostApi != null && iSparkHostApi.LLIIIILZ()) {
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (value instanceof String) {
                            jSONObject.put(key, value);
                        } else if (value instanceof Number) {
                            jSONObject.put(key, value);
                        } else if (value instanceof Boolean) {
                            jSONObject.put(key, ((Boolean) value).booleanValue());
                        } else {
                            jSONObject.put(key, value.toString());
                        }
                    }
                    ISparkHostApi iSparkHostApi2 = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
                    if (iSparkHostApi2 != null) {
                        iSparkHostApi2.onEventV3(str, jSONObject);
                    }
                }
            }
        };
        synchronized (C1489780os4.class) {
            try {
                LIZLLL = c0c9b;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LIZJ(InterfaceC1489790os5 interfaceC1489790os5) {
        synchronized (C1489780os4.class) {
            try {
                LIZ = interfaceC1489790os5;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
