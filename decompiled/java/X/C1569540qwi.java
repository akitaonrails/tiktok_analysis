package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStore;
import com.ss.android.ugc.aweme.adaptation.saa.SAAActivity;

/* JADX INFO: renamed from: X.0qwi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1569540qwi extends ViewModelStore implements InterfaceC1569560qwk {
    public final /* synthetic */ SAAActivity LIZ;

    @Override // X.InterfaceC1569560qwk
    public final void LIZ(String str) {
        SAAActivity sAAActivity = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("use SAAViewModelProviders instead: get: ");
        sbLIZ.append(str);
        sAAActivity.LLLZZIL("getViewModelStore", C2188811AlT.LIZIZ(sbLIZ));
    }

    public C1569540qwi(SAAActivity sAAActivity, ViewModelStore viewModelStore) {
        this.LIZ = sAAActivity;
        for (String str : viewModelStore.keys()) {
            ViewModel viewModel = viewModelStore.get(str);
            if (viewModel != null) {
                put(str, viewModel);
            }
        }
    }
}
