package X;

import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0hqv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1219990hqv extends C09AY implements Function0<ViewModelProvider.Factory> {
    public final /* synthetic */ HasDefaultViewModelProviderFactory LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1219990hqv(HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory) {
        super(0);
        this.LL = hasDefaultViewModelProviderFactory;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ViewModelProvider.Factory invoke() {
        return this.LL.getDefaultViewModelProviderFactory();
    }
}
