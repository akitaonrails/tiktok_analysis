package com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.guest;

import X.C01IS;
import X.C01IT;
import X.C01JB;
import X.C0PEM;
import X.C1DFH;
import X.C2107308Nj;
import X.C23250099c;
import X.InterfaceC497601wk;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.BaseCountDownForAllV2ViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: loaded from: classes.dex */
public final class CountDownForAllV2GuestViewModel extends BaseCountDownForAllV2ViewModel {
    public final C01IT LLILLL;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.BaseCountDownForAllV2ViewModel
    public final String BQ2() {
        return "CountDownForAllV2GuestViewModel";
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.BaseCountDownForAllV2ViewModel
    public final /* bridge */ /* synthetic */ C01IS vQ2() {
        return this.LLILLL;
    }

    public CountDownForAllV2GuestViewModel(DataChannel dataChannel) {
        this.LLILLL = new C01IT(dataChannel);
        InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(viewModelScope, C2107308Nj.LIZ, null, new C01JB(this, null), 2);
    }
}
