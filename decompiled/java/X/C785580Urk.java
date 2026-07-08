package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Urk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C785580Urk {
    public static Map<Class, InterfaceC785570Urj<?>> LIZ;

    static {
        InterfaceC785570Urj<C0TLE> interfaceC785570Urj = new InterfaceC785570Urj<C0TLE>() { // from class: X.0Url
            @Override // X.InterfaceC785570Urj
            public final C0TLE LIZ() {
                try {
                    return (C0TLE) Class.forName("u71.j").newInstance();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    return null;
                }
            }
        };
        if (LIZ == null) {
            LIZ = new HashMap();
        }
        ((HashMap) LIZ).put(C0TLE.class, interfaceC785570Urj);
    }
}
