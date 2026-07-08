package X;

import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import java.lang.ref.ReferenceQueue;

/* JADX INFO: renamed from: X.1DTR, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public class C1DTR extends AbstractC1779220wOu implements InterfaceC2256331DTb<InterfaceC1779210wOt> {
    public final C1DTS<InterfaceC1779210wOt> LL;

    @Override // X.InterfaceC2256331DTb
    public final void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
    }

    @Override // X.InterfaceC2256331DTb
    public final void LIZ(InterfaceC1779210wOt interfaceC1779210wOt) {
        interfaceC1779210wOt.addOnPropertyChangedCallback(this);
    }

    @Override // X.InterfaceC2256331DTb
    public final void LIZIZ(InterfaceC1779210wOt interfaceC1779210wOt) {
        interfaceC1779210wOt.removeOnPropertyChangedCallback(this);
    }

    @Override // X.AbstractC1779220wOu
    public final void LIZJ(int i, InterfaceC1779210wOt interfaceC1779210wOt) {
        C1DTS<InterfaceC1779210wOt> c1dts = this.LL;
        ViewDataBinding viewDataBinding = (ViewDataBinding) c1dts.get();
        if (viewDataBinding == null) {
            c1dts.LIZ();
            return;
        }
        C1DTS<InterfaceC1779210wOt> c1dts2 = this.LL;
        if (c1dts2.LIZJ != interfaceC1779210wOt) {
            return;
        }
        int i2 = c1dts2.LIZIZ;
        if (!viewDataBinding.LLJILLL && viewDataBinding.LJIIJJI(i2, i, interfaceC1779210wOt)) {
            viewDataBinding.LJIILIIL();
        }
    }

    public C1DTR(ViewDataBinding viewDataBinding, int i, ReferenceQueue<ViewDataBinding> referenceQueue) {
        this.LL = new C1DTS<>(viewDataBinding, i, this, referenceQueue);
    }
}
