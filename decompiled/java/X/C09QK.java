package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.09QK, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09QK {
    public static final Object LIZ = new Object();
    public static final List<InterfaceC2188711AlJ> LIZIZ = new ArrayList();

    public static final void LIZ(InterfaceC2188711AlJ interfaceC2188711AlJ) {
        synchronized (LIZ) {
            try {
                ((ArrayList) LIZIZ).remove(interfaceC2188711AlJ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
