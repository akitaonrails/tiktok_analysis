package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0hoc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1218560hoc extends C09AY implements Function0<ViewModelProvider.Factory> {
    public final /* synthetic */ Fragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1218560hoc(Fragment fragment) {
        super(0);
        this.LL = fragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ ViewModelProvider.Factory invoke() {
        return this.LL.getDefaultViewModelProviderFactory();
    }
}
