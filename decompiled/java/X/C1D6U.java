package X;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: renamed from: X.1D6U, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D6U implements InterfaceC2250311D5x {
    public final Set<C1D61> LIZ = Collections.singleton(C1D6D.ON_DATA_INIT);

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
        return this.LIZ;
    }

    @Override // X.InterfaceC2250311D5x
    public final AbstractC1156450gCR<?> executeDependencyReady(C1D63 c1d63) {
        return C1156460gCS.LIZ;
    }

    @Override // X.InterfaceC2250311D5x
    public final AbstractC1156450gCR<?> executeImmediate(C1D63 c1d63) {
        C650530PfP c650530PfP;
        C1537910q7h c1537910q7h;
        C1537480q70 c1537480q70 = c1d63.LIZJ;
        InterfaceC1531560pxS interfaceC1531560pxS = null;
        if (c1537480q70 != null) {
            c650530PfP = (C650530PfP) c1537480q70.LJFF(C650530PfP.class);
        } else {
            c650530PfP = null;
        }
        C1537480q70 c1537480q702 = c1d63.LIZJ;
        if (c1537480q702 != null) {
            interfaceC1531560pxS = c1537480q702.hybridParams;
        }
        if ((interfaceC1531560pxS instanceof C1537830q7Z) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null) {
            c1537910q7h.LJJIL = c650530PfP;
        }
        return new C1156440gCQ(EnumC115000c8.SUCCESS);
    }
}
