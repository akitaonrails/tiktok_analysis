package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Constructor;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.12we, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19919012we {
    public static final InterfaceC19919212wg LIZ;

    static {
        InterfaceC19919212wg interfaceC19919212wg;
        Object objNewInstance;
        try {
            try {
                Constructor<?> declaredConstructor = Class.forName("com.bytedance.applog.map.impl.EventMapServiceImpl").getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                objNewInstance = declaredConstructor.newInstance(new Object[0]);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                interfaceC19919212wg = new InterfaceC19919212wg() { // from class: X.12wf
                    @Override // X.InterfaceC19919212wg
                    public final JSONObject LIZ(JSONObject jSONObject) {
                        return jSONObject;
                    }
                };
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            interfaceC19919212wg = new InterfaceC19919212wg() { // from class: X.12wf
                @Override // X.InterfaceC19919212wg
                public final JSONObject LIZ(JSONObject jSONObject) {
                    return jSONObject;
                }
            };
            LIZ = interfaceC19919212wg;
        }
        if (objNewInstance == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.bytedance.applog.map.api.EventMapService");
        }
        interfaceC19919212wg = (InterfaceC19919212wg) objNewInstance;
        LIZ = interfaceC19919212wg;
    }
}
