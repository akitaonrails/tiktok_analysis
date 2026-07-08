package X;

import androidx.lifecycle.ViewModelStore;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rnJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1602150rnJ extends C09AY implements Function0<ViewModelStore> {
    public final /* synthetic */ C199Y LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1602150rnJ(C199Y c199y) {
        super(0);
        this.LL = c199y;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ViewModelStore invoke() {
        ViewModelStore viewModelStore = super/*androidx.activity.ComponentActivity*/.getViewModelStore();
        AbstractC1563340qmi abstractC1563340qmi = this.LL.internalLifecycleRegistry;
        return (abstractC1563340qmi == null || !abstractC1563340qmi.LJI(EnumC682280QpW.VIEWMODEL_STORE)) ? viewModelStore : new C1569530qwh(this.LL, viewModelStore);
    }
}
