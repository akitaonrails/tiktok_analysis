package X;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0kCU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1310240kCU implements InterfaceC1310510kCv {
    public final /* synthetic */ AtomicInteger LIZ;
    public final /* synthetic */ InterfaceC1310510kCv LIZIZ = null;

    public final void LIZ() {
        InterfaceC1310510kCv interfaceC1310510kCv;
        if (this.LIZ.decrementAndGet() != 0 || (interfaceC1310510kCv = this.LIZIZ) == null) {
            return;
        }
        ((C1310240kCU) interfaceC1310510kCv).LIZ();
    }

    public C1310240kCU(AtomicInteger atomicInteger) {
        this.LIZ = atomicInteger;
    }
}
