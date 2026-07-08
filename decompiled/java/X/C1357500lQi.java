package X;

import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.ss.android.ugc.aweme.platform.AnchorEventCenter;

/* JADX INFO: renamed from: X.0lQi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1357500lQi implements ViewModelStoreOwner {
    public ViewModelStore LL;
    public InterfaceC665370Q7z LLILLJJLI;
    public AnchorEventCenter LLILLL;
    public final C1357530lQl LLILZ = new C1357530lQl();
    public C712520RxC LLILZIL;

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        ViewModelStore viewModelStore = this.LL;
        if (viewModelStore != null) {
            return viewModelStore;
        }
        ViewModelStore viewModelStore2 = new ViewModelStore();
        this.LL = viewModelStore2;
        return viewModelStore2;
    }
}
