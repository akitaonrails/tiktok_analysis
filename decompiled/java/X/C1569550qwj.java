package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStore;
import com.ss.android.ugc.aweme.live.smoothhost.LiveMultiTabWrapperActivity;

/* JADX INFO: renamed from: X.0qwj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1569550qwj extends ViewModelStore implements InterfaceC1569560qwk {
    public final /* synthetic */ LiveMultiTabWrapperActivity LIZ;

    @Override // X.InterfaceC1569560qwk
    public final void LIZ(String str) {
        LiveMultiTabWrapperActivity liveMultiTabWrapperActivity = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("use SAAViewModelProviders instead: get: ");
        sbLIZ.append(str);
        liveMultiTabWrapperActivity.LLLZIL("getViewModelStore", C2188811AlT.LIZIZ(sbLIZ));
    }

    public C1569550qwj(LiveMultiTabWrapperActivity liveMultiTabWrapperActivity, ViewModelStore viewModelStore) {
        this.LIZ = liveMultiTabWrapperActivity;
        for (String str : viewModelStore.keys()) {
            ViewModel viewModel = viewModelStore.get(str);
            if (viewModel != null) {
                put(str, viewModel);
            }
        }
    }
}
