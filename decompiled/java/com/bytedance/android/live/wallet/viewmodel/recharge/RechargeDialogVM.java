package com.bytedance.android.live.wallet.viewmodel.recharge;

import X.C01GW;
import X.C07LT;
import X.C0J1N;
import X.C1146860fwy;
import X.C1161920gLG;
import X.C11O8;
import X.C11RD;
import X.C1548820qPI;
import X.C1797270ws1;
import X.C1803830x2b;
import X.C1804840x4E;
import X.C1805400x58;
import X.C1864820ycy;
import X.C292401Bi;
import X.C452501pT;
import X.C784440Upu;
import X.InterfaceC1805160x4k;
import X.InterfaceC1806200x6Q;
import Y.AfS196S0100000_27;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import webcast.api.profit.IapListResult;

/* JADX INFO: loaded from: classes28.dex */
public final class RechargeDialogVM extends ViewModel {
    public final C1803830x2b LL;
    public final InterfaceC1805160x4k LLILLJJLI;
    public final DataChannel LLILLL;
    public final C01GW LLILZ = C292401Bi.LIZ(new AwS571S0100000_27(this, 127));
    public final C01GW LLILZIL = C292401Bi.LIZ(new AwS571S0100000_27(this, 126));
    public final MutableLiveData<Boolean> LLILZLL = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLIZ = new MutableLiveData<>();
    public final MutableLiveData<Integer> LLIZLLLIL = new MutableLiveData<>();
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(68));
    public boolean LLJI;
    public final C1864820ycy LLJIJIL;

    public final void vQ2() {
        IapListResult.IapCustomData iapCustomData;
        IapListResult.ListResultExtra listResultExtraVx1 = ((IWalletService) C1161920gLG.LIZJ(IWalletService.class)).walletCenter().vx1();
        this.LLIZ.setValue((listResultExtraVx1 == null || (iapCustomData = listResultExtraVx1.iapCustomData) == null) ? Boolean.FALSE : Boolean.valueOf(iapCustomData.enableFailureCustomEntranceGuide));
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C1548820qPI.LJIIIIZZ("DiamondsRefreshed", this.LLJIJIL);
    }

    public final void wQ2() {
        IapListResult.ListResultExtra listResultExtraLJII;
        boolean z = false;
        IapListResult.ActivityInfo activityInfo = null;
        C1804840x4E c1804840x4ELJIILIIL = C1797270ws1.LIZJ().LJIILIIL(C07LT.LIZ(0), null, null);
        MutableLiveData<Boolean> mutableLiveData = this.LLILZLL;
        InterfaceC1806200x6Q interfaceC1806200x6Q = (InterfaceC1806200x6Q) this.LLJ.getValue();
        if (c1804840x4ELJIILIIL != null && (listResultExtraLJII = c1804840x4ELJIILIIL.LJII()) != null) {
            activityInfo = listResultExtraLJII.activityInfo;
        }
        if (C1805400x58.LIZJ(interfaceC1806200x6Q, activityInfo) && !this.LLJI) {
            z = true;
        }
        mutableLiveData.setValue(Boolean.valueOf(z));
    }

    public final void xQ2() {
        this.LLIZLLLIL.setValue(Integer.valueOf((int) Math.ceil((C1797270ws1.LIZJ().LJIILIIL(C07LT.LIZ(0), null, null) != null ? r0.LJIILIIL() : 0) / 3.0f)));
    }

    public RechargeDialogVM(C1803830x2b c1803830x2b, InterfaceC1805160x4k interfaceC1805160x4k, DataChannel dataChannel, boolean z) {
        LifecycleOwner lifecycleOwnerLJJJJ;
        this.LL = c1803830x2b;
        this.LLILLJJLI = interfaceC1805160x4k;
        this.LLILLL = dataChannel;
        C11O8 c11o8LIZJ = C1797270ws1.LIZLLL().LIZJ();
        if (interfaceC1805160x4k != null) {
            lifecycleOwnerLJJJJ = interfaceC1805160x4k.LJJJJ();
        } else {
            lifecycleOwnerLJJJJ = null;
        }
        ((C0J1N) c11o8LIZJ.LIZJ(C11RD.LJ(lifecycleOwnerLJJJJ))).LIZJ(new AfS196S0100000_27(this, 38));
        C784440Upu.LIZ().LIZJ(interfaceC1805160x4k != null ? interfaceC1805160x4k.LJJJJ() : null, C1146860fwy.class).LIZJ(new AfS196S0100000_27(this, 39));
        if (z) {
            wQ2();
            xQ2();
            vQ2();
        }
        this.LLJIJIL = new C1864820ycy(this, 1);
    }
}
