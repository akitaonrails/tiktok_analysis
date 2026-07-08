package X;

import X.C05YF;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;

/* JADX INFO: renamed from: X.0tQD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@InterfaceC1294060jmO
public abstract class AbstractC1664710tQD<T extends C05YF> extends AbstractC2255721DQs<T> implements ViewModelStoreOwner {
    public final C1DRG LL;
    public ViewModelStore LLILLJJLI;

    private final ViewModelStore X1() {
        if (!Z1().isAtLeast(Lifecycle.State.INITIALIZED)) {
            throw new IllegalStateException("can't access ViewModels when component is destroyed");
        }
        if (this.LLILLJJLI == null) {
            this.LLILLJJLI = new ViewModelStore();
        }
        ViewModelStore viewModelStore = this.LLILLJJLI;
        if (viewModelStore == null) {
            return null;
        }
        return viewModelStore;
    }

    private final Lifecycle.State Z1() {
        return getLifecycle().getCurrentState();
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public ViewModelStore getViewModelStore() {
        return X1();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        ViewModelStore viewModelStore = this.LLILLJJLI;
        if (viewModelStore != null) {
            viewModelStore.clear();
        }
    }

    public final C1DRG W1() {
        return this.LL;
    }

    public AbstractC1664710tQD(C1DRG c1drg) {
        this.LL = c1drg;
    }
}
