package X;

import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import java.lang.ref.ReferenceQueue;

/* JADX INFO: renamed from: X.1DTT, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public class C1DTT extends AbstractC2190721AoY implements InterfaceC2256331DTb<InterfaceC2190711AoX> {
    public final C1DTS<InterfaceC2190711AoX> LL;

    @Override // X.InterfaceC2256331DTb
    public final void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
    }

    @Override // X.InterfaceC2256331DTb
    public final void LIZ(InterfaceC2190711AoX interfaceC2190711AoX) {
        interfaceC2190711AoX.LJJLIIJ();
    }

    @Override // X.InterfaceC2256331DTb
    public final void LIZIZ(InterfaceC2190711AoX interfaceC2190711AoX) {
        interfaceC2190711AoX.LJJJJ();
    }

    public C1DTT(ViewDataBinding viewDataBinding, int i, ReferenceQueue<ViewDataBinding> referenceQueue) {
        this.LL = new C1DTS<>(viewDataBinding, i, this, referenceQueue);
    }
}
