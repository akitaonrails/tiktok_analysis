package X;

import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JJV, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JJV extends C09AY implements Function0<ViewModelProvider.Factory> {
    public final /* synthetic */ HasDefaultViewModelProviderFactory LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JJV(HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory) {
        super(0);
        this.LL = hasDefaultViewModelProviderFactory;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ ViewModelProvider.Factory invoke() {
        return this.LL.getDefaultViewModelProviderFactory();
    }
}
