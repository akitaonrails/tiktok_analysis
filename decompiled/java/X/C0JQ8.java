package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JQ8, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JQ8 extends C09AY implements Function0<ViewModelProvider.Factory> {
    public final /* synthetic */ Fragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JQ8(Fragment fragment) {
        super(0);
        this.LL = fragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ ViewModelProvider.Factory invoke() {
        return this.LL.getDefaultViewModelProviderFactory();
    }
}
