package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AwS24S2000000_27;

/* JADX INFO: renamed from: X.0xvR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1837830xvR {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(365));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(364));

    public final void LIZ(InterfaceC1837420xum interfaceC1837420xum, String str, String str2) {
        AwS24S2000000_27 awS24S2000000_27 = new AwS24S2000000_27(str, str2, 8);
        synchronized (this.LIZ.getValue()) {
            try {
                Object linkedHashMap = (Map) ((ConcurrentHashMap) this.LIZ.getValue()).get(interfaceC1837420xum);
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                    ((ConcurrentHashMap) this.LIZ.getValue()).put(interfaceC1837420xum, linkedHashMap);
                }
                awS24S2000000_27.invoke(linkedHashMap);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
