package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.058y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C13054058y {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Runnable runnable) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C13053058x(runnable, null), 3);
    }

    @InterfaceC1294060jmO
    public static HashMap LIZIZ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            try {
                HashMap map = (HashMap) C20484080s.LIZ(str, HashMap.class);
                HashMap map2 = new HashMap();
                for (Map.Entry entry : map.entrySet()) {
                    map2.put(entry.getKey().toString(), entry.getValue());
                }
                return map2;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }
}
