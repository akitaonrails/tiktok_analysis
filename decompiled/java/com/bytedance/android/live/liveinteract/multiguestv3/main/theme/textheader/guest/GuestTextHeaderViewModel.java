package com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.guest;

import X.AbstractC301401Eu;
import X.C01GW;
import X.C452501pT;
import X.C513601zK;
import X.C5182020e;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.viewmodel.BaseTextHeaderViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: loaded from: classes.dex */
public final class GuestTextHeaderViewModel extends BaseTextHeaderViewModel {
    public final C01GW LLJILJIL;
    public int LLJILJILJ;
    public final C513601zK LLJILLL;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.viewmodel.BaseTextHeaderViewModel
    public final String AQ2() {
        return "GuestTextHeaderViewModel";
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.viewmodel.BaseTextHeaderViewModel
    public final AbstractC301401Eu wQ2() {
        return (AbstractC301401Eu) this.LLJILJIL.getValue();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.viewmodel.BaseTextHeaderViewModel
    public final void onDestroy() {
        super.onDestroy();
        this.LLILZ.removeObserver(this.LLJILLL);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.viewmodel.BaseTextHeaderViewModel
    public final void onInit() {
        super.onInit();
        this.LLILZ.observeForever(this.LLJILLL);
    }

    public GuestTextHeaderViewModel(DataChannel dataChannel) {
        super(dataChannel);
        this.LLJILJIL = C452501pT.LIZIZ(new C5182020e(dataChannel, 73));
        this.LLJILLL = new C513601zK(this, 34);
    }
}
