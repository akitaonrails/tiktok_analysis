package X;

import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xm8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1832060xm8 extends C09AY implements Function0<ViewModelProvider.Factory> {
    public final /* synthetic */ HasDefaultViewModelProviderFactory LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1832060xm8(HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory) {
        super(0);
        this.LL = hasDefaultViewModelProviderFactory;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ ViewModelProvider.Factory invoke() {
        return this.LL.getDefaultViewModelProviderFactory();
    }
}
