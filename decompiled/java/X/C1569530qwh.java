package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStore;

/* JADX INFO: renamed from: X.0qwh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1569530qwh extends ViewModelStore implements InterfaceC1569560qwk {
    public final /* synthetic */ C199Y LIZ;

    @Override // X.InterfaceC1569560qwk
    public final void LIZ(String str) {
        C199Y c199y = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("viewModelStore get: ");
        sbLIZ.append(str);
        C199Y.throwSAFLifecycleCheckException$default(c199y, C2188811AlT.LIZIZ(sbLIZ), false, false, null, 14, null);
    }

    public C1569530qwh(C199Y c199y, ViewModelStore viewModelStore) {
        this.LIZ = c199y;
        for (String str : viewModelStore.keys()) {
            ViewModel viewModel = viewModelStore.get(str);
            if (viewModel != null) {
                put(str, viewModel);
            }
        }
    }
}
