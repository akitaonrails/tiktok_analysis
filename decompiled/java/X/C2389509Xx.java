package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.09Xx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2389509Xx implements InterfaceC2389609Xy {
    public boolean LIZ;
    public final Object LIZIZ = new Object();

    public final void LIZ() {
        if ("ActionReaper".equals(C786410Ut5.u3().getName())) {
            return;
        }
        synchronized (this.LIZIZ) {
            try {
                if (!this.LIZ) {
                    try {
                        Thread.sleep(1500L);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    this.LIZ = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static final void LIZIZ(List<C2259691DcV> list, boolean z) {
        HashMap map = new HashMap();
        C0XDN.LIZJ(map, z);
        for (Map.Entry entry : map.entrySet()) {
            list.add(new C2259691DcV((String) entry.getKey(), (String) entry.getValue()));
        }
    }
}
