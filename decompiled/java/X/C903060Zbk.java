package X;

import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: X.0Zbk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C903060Zbk implements HasDefaultViewModelProviderFactory {
    public final InterfaceC1808360x9u LL;
    public final C913940ZtI LLILLJJLI = new C913940ZtI(this, 1);

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final /* synthetic */ AbstractC903280Zc6 getDefaultViewModelCreationExtras() {
        return C738350Sxl.LIZ(this);
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return this.LLILLJJLI;
    }

    public C903060Zbk(InterfaceC1808360x9u interfaceC1808360x9u) {
        this.LL = interfaceC1808360x9u;
    }
}
