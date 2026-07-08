package X;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.1D6X, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D6X implements InterfaceC2250311D5x {
    public final C099F LIZ = C090F.LIZIZ();
    public final Set<C1D61> LIZIZ = Collections.singleton(C1D6D.ON_BEFORE_VIEW_CREATE);

    @Override // X.InterfaceC2250311D5x
    public final void destroy() {
    }

    @Override // X.InterfaceC2250311D5x
    public final int getPriority() {
        return 10;
    }

    @Override // X.InterfaceC2250311D5x
    public final Set<C13IQ<? extends InterfaceC2250311D5x>> getDependencies() {
        return C08CX.INSTANCE;
    }

    @Override // X.InterfaceC2250311D5x
    public final Set<C1D61> getLifecycleStages() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC2250311D5x
    public final AbstractC1156450gCR<?> executeDependencyReady(C1D63 c1d63) {
        return C1156460gCS.LIZ;
    }

    @Override // X.InterfaceC2250311D5x
    public final AbstractC1156450gCR<?> executeImmediate(C1D63 c1d63) {
        C1537910q7h c1537910q7h;
        C1537480q70 c1537480q70 = c1d63.LIZJ;
        InterfaceC1531560pxS interfaceC1531560pxS = null;
        if (c1537480q70 != null) {
            interfaceC1531560pxS = c1537480q70.hybridParams;
        }
        if ((interfaceC1531560pxS instanceof C1537830q7Z) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null) {
            c1537910q7h.LJIJJLI = new C1537260q6e() { // from class: X.1D6Z
                @Override // X.C1537260q6e
                public final void LIZ(Map<String, ? extends Object> map) {
                    this.LIZ.LIZ.LJJLIIIJILLIZJL(map);
                }
            };
        }
        return new C1156440gCQ(this.LIZ);
    }
}
