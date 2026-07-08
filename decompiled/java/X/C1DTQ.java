package X;

import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.1DTQ, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public class C1DTQ implements Observer, InterfaceC2256331DTb<LiveData<?>> {
    public final C1DTS<LiveData<?>> LL;
    public WeakReference<LifecycleOwner> LLILLJJLI;

    @Override // X.InterfaceC2256331DTb
    public final void LIZ(LiveData<?> liveData) {
        LifecycleOwner lifecycleOwner;
        LiveData<?> liveData2 = liveData;
        WeakReference<LifecycleOwner> weakReference = this.LLILLJJLI;
        if (weakReference != null && (lifecycleOwner = weakReference.get()) != null) {
            liveData2.observe(lifecycleOwner, this);
        }
    }

    @Override // X.InterfaceC2256331DTb
    public final void LIZIZ(LiveData<?> liveData) {
        liveData.removeObserver(this);
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        C1DTS<LiveData<?>> c1dts = this.LL;
        ViewDataBinding viewDataBinding = (ViewDataBinding) c1dts.get();
        if (viewDataBinding == null) {
            c1dts.LIZ();
            return;
        }
        C1DTS<LiveData<?>> c1dts2 = this.LL;
        int i = c1dts2.LIZIZ;
        LiveData<?> liveData = c1dts2.LIZJ;
        if (viewDataBinding.LLJILLL || !viewDataBinding.LJIIJJI(i, 0, liveData)) {
            return;
        }
        viewDataBinding.LJIILIIL();
    }

    @Override // X.InterfaceC2256331DTb
    public final void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        LifecycleOwner lifecycleOwner2;
        WeakReference<LifecycleOwner> weakReference = this.LLILLJJLI;
        if (weakReference == null) {
            lifecycleOwner2 = null;
        } else {
            lifecycleOwner2 = weakReference.get();
        }
        LiveData<?> liveData = this.LL.LIZJ;
        if (liveData != null) {
            if (lifecycleOwner2 != null) {
                liveData.removeObserver(this);
            }
            if (lifecycleOwner != null) {
                liveData.observe(lifecycleOwner, this);
            } else {
                return;
            }
        } else if (lifecycleOwner == null) {
            return;
        }
        this.LLILLJJLI = new WeakReference<>(lifecycleOwner);
    }

    public C1DTQ(ViewDataBinding viewDataBinding, int i, ReferenceQueue<ViewDataBinding> referenceQueue) {
        this.LL = new C1DTS<>(viewDataBinding, i, this, referenceQueue);
    }
}
