package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0o3p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1458630o3p<T> {
    public final List<T> LIZ = Collections.synchronizedList(new ArrayList());

    public final C13EL LIZ() {
        C13EL c13el;
        synchronized (this.LIZ) {
            try {
                c13el = new C13EL(C13LP.LLIIII(this.LIZ));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c13el;
    }
}
