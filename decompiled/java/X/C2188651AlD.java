package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.1AlD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2188651AlD {
    public static final Object LIZ = new Object();
    public static final List<InterfaceC2188721AlK> LIZIZ = new ArrayList();

    public static final InterfaceC2188721AlK[] LIZ() {
        InterfaceC2188721AlK[] interfaceC2188721AlKArr;
        synchronized (LIZ) {
            try {
                interfaceC2188721AlKArr = (InterfaceC2188721AlK[]) LIZIZ.toArray(new InterfaceC2188721AlK[0]);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return interfaceC2188721AlKArr;
    }
}
