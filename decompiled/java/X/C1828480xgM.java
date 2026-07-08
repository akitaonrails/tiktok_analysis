package X;

import androidx.lifecycle.ViewModelProvider;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xgM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1828480xgM extends C09AY implements Function0<ViewModelProvider.Factory> {
    public final /* synthetic */ C03K6 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1828480xgM(C03K6 c03k6) {
        super(0);
        this.LL = c03k6;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ ViewModelProvider.Factory invoke() {
        if (this.LL.getCurrentLifeCycleOwner() instanceof AbstractC738140SxQ) {
            return ((AbstractC738140SxQ) this.LL.getCurrentLifeCycleOwner()).getDefaultViewModelProviderFactory();
        }
        throw new IllegalStateException("Check failed.");
    }
}
