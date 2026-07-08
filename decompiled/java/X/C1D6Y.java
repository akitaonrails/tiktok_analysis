package X;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: renamed from: X.1D6Y, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D6Y implements InterfaceC2250311D5x {
    public final Set<C1D6D> LIZ = Collections.singleton(C1D6D.ON_VIEW_CREATE);

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
    public final Set<C1D6D> getLifecycleStages() {
        return this.LIZ;
    }

    @Override // X.InterfaceC2250311D5x
    public final AbstractC1156450gCR<?> executeDependencyReady(C1D63 c1d63) {
        return C1156460gCS.LIZ;
    }

    @Override // X.InterfaceC2250311D5x
    public final AbstractC1156450gCR<?> executeImmediate(C1D63 c1d63) {
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        C649430Pdd c649430Pdd = new C649430Pdd();
        c1537900q7g.getClass();
        C1537900q7g.LJIIIIZZ(c649430Pdd);
        return new C1156440gCQ(EnumC115000c8.SUCCESS);
    }
}
