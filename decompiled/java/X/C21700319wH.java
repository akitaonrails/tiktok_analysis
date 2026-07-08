package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelStoreOwner;

/* JADX INFO: renamed from: X.19wH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21700319wH implements InterfaceC21700119wF {
    public static final C21700319wH LIZ = new C21700319wH();

    @Override // X.InterfaceC21700119wF
    public final HasDefaultViewModelProviderFactory LIZ(Fragment fragment) {
        throw null;
    }

    @Override // X.InterfaceC21700119wF
    public final ViewModelStoreOwner LIZIZ(Fragment fragment) {
        Fragment parentFragment = fragment.getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        return fragment;
    }
}
