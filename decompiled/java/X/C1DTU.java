package X;

import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import java.lang.ref.ReferenceQueue;

/* JADX INFO: renamed from: X.1DTU, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public class C1DTU extends AbstractC2174011A6l implements InterfaceC2256331DTb<InterfaceC2174001A6k> {
    public final C1DTS<InterfaceC2174001A6k> LL;

    @Override // X.InterfaceC2256331DTb
    public final void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
    }

    @Override // X.InterfaceC2256331DTb
    public final void LIZ(InterfaceC2174001A6k interfaceC2174001A6k) {
        interfaceC2174001A6k.LJIJ();
    }

    @Override // X.InterfaceC2256331DTb
    public final void LIZIZ(InterfaceC2174001A6k interfaceC2174001A6k) {
        interfaceC2174001A6k.LJIILJJIL();
    }

    public C1DTU(ViewDataBinding viewDataBinding, int i, ReferenceQueue<ViewDataBinding> referenceQueue) {
        this.LL = new C1DTS<>(viewDataBinding, i, this, referenceQueue);
    }
}
