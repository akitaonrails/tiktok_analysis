package com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.widget.previewlive.layoutwidiget;

import X.C11NJ;
import X.C948060amK;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: loaded from: classes8.dex */
public final class MultiGuestPreviewLiveLayoutViewModel extends ViewModel {
    public final C11NJ LL;
    public final C948060amK LLILLJJLI;

    public MultiGuestPreviewLiveLayoutViewModel() {
        this(null);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LL.LJ();
    }

    public MultiGuestPreviewLiveLayoutViewModel(DataChannel dataChannel) {
        this.LL = new C11NJ();
        this.LLILLJJLI = new C948060amK(dataChannel);
    }
}
