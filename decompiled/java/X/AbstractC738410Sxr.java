package X;

import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: renamed from: X.0Sxr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC738410Sxr implements HasDefaultViewModelProviderFactory {
    public AbstractC738140SxQ LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C738420Sxs());
    public final ViewModelProvider.NewInstanceFactory LLILLL = new ViewModelProvider.NewInstanceFactory();

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final /* synthetic */ AbstractC903280Zc6 getDefaultViewModelCreationExtras() {
        return C738350Sxl.LIZ(this);
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return this.LLILLL;
    }
}
