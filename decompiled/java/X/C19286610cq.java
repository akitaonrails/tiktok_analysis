package X;

import androidx.lifecycle.SharedViewModelProvider;
import androidx.lifecycle.ViewModel;

/* JADX INFO: renamed from: X.10cq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19286610cq<VM extends ViewModel> implements C01GW<VM> {
    public final C01GW<C194451115t> LL;
    public final C13IQ<VM> LLILLJJLI;
    public boolean LLILLL;

    @Override // X.C01GW
    public final Object getValue() {
        ViewModel viewModel = new SharedViewModelProvider(this.LL.getValue().getDefaultViewModelProviderFactory()).get(this.LL.getValue().getLifecycle(), (Class<ViewModel>) C09R7.LIZ(this.LLILLJJLI));
        this.LLILLL = true;
        return viewModel;
    }

    @Override // X.C01GW
    public final boolean isInitialized() {
        return this.LLILLL;
    }

    public C19286610cq(C01GW c01gw, C19719912Dl c19719912Dl) {
        this.LL = c01gw;
        this.LLILLJJLI = c19719912Dl;
    }
}
