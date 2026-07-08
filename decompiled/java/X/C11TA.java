package X;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.11TA, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11TA {
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final void LIZ(InterfaceC1305030k45 interfaceC1305030k45, final C11SX c11sx) {
        C11TC c11tc = C11TC.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(interfaceC1305030k45.getClass());
        sbLIZ.append('_');
        sbLIZ.append(interfaceC1305030k45.hashCode());
        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C801330Vc3<InterfaceC19505211Sw<?, ?>> c801330Vc3 = c11tc.LIZ;
        ConcurrentHashMap<String, WeakReference<T>> concurrentHashMap = c801330Vc3.LIZ;
        final ReferenceQueue<InterfaceC19505211Sw<?, ?>> referenceQueue = c801330Vc3.LIZIZ;
        concurrentHashMap.put(strLIZIZ, (WeakReference<T>) new WeakReference<V>(strLIZIZ, c11sx, referenceQueue) { // from class: X.11TB
            public final K LIZ;

            /* JADX WARN: Multi-variable type inference failed */
            {
                super(c11sx, referenceQueue);
                this.LIZ = strLIZIZ;
            }
        });
    }
}
