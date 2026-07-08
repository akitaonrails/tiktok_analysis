package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelStoreOwner;

/* JADX INFO: renamed from: X.19wE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21700019wE implements InterfaceC21700119wF {
    public static final C21700019wE LIZ = new C21700019wE();

    @Override // X.InterfaceC21700119wF
    public final HasDefaultViewModelProviderFactory LIZ(Fragment fragment) {
        return fragment.requireActivity();
    }

    @Override // X.InterfaceC21700119wF
    public final ViewModelStoreOwner LIZIZ(Fragment fragment) {
        return fragment.requireActivity();
    }
}
