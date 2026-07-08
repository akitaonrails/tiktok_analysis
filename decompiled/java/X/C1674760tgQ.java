package X;

import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;

/* JADX INFO: renamed from: X.0tgQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1674760tgQ {
    public static final <VM extends ViewModel> VM LIZ(ViewModelStoreOwner viewModelStoreOwner, Class<VM> cls, String str, ViewModelProvider.Factory factory, AbstractC903280Zc6 abstractC903280Zc6) {
        ViewModelProvider viewModelProvider;
        if (factory != null) {
            viewModelProvider = new ViewModelProvider(viewModelStoreOwner.getViewModelStore(), factory, abstractC903280Zc6);
        } else if (viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory) {
            viewModelProvider = new ViewModelProvider(viewModelStoreOwner.getViewModelStore(), ((HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelProviderFactory(), abstractC903280Zc6);
        } else {
            viewModelProvider = new ViewModelProvider(viewModelStoreOwner);
        }
        if (str != null) {
            return (VM) viewModelProvider.get(str, cls);
        }
        return (VM) viewModelProvider.get(cls);
    }

    public static final ViewModel LIZIZ(Class cls, ViewModelStoreOwner viewModelStoreOwner, ViewModelProvider.Factory factory, AbstractC903280Zc6 abstractC903280Zc6, InterfaceC1680500tpg interfaceC1680500tpg) {
        interfaceC1680500tpg.LJJIJIIJIL(-1439476281);
        ViewModel viewModelLIZ = LIZ(viewModelStoreOwner, cls, null, factory, abstractC903280Zc6);
        interfaceC1680500tpg.LJJIJLIJ();
        return viewModelLIZ;
    }
}
