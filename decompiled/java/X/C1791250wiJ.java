package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0wiJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1791250wiJ {
    public final Object LIZ = new Object();
    public List<InterfaceC1364105Vn<Unit>> LIZIZ = new ArrayList();
    public List<InterfaceC1364105Vn<Unit>> LIZJ = new ArrayList();
    public boolean LIZLLL = true;

    public final boolean LIZ() {
        boolean z;
        synchronized (this.LIZ) {
            try {
                z = this.LIZLLL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }
}
