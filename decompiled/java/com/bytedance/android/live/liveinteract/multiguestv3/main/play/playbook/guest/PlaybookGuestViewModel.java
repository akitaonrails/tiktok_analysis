package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.guest;

import X.AbstractC20384214pU;
import X.C20381614p4;
import android.content.Context;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes16.dex */
public final class PlaybookGuestViewModel extends BasePlaybookViewModel {
    public final C20381614p4 LLJIJIL;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookViewModel
    public final String xQ2() {
        return "PlaybookGuestViewModel";
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookViewModel
    public final void onInit() {
        super.onInit();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookViewModel
    public final /* bridge */ /* synthetic */ AbstractC20384214pU wQ2() {
        return this.LLJIJIL;
    }

    public PlaybookGuestViewModel(DataChannel dataChannel, WeakReference<Context> weakReference) {
        super(dataChannel);
        this.LLJIJIL = new C20381614p4(dataChannel, weakReference);
    }
}
