package com.bytedance.android.live.wallet.viewmodel.recharge.component.incentive;

import X.C01GW;
import X.C452501pT;
import X.C500260Jjc;
import X.EnumC1805450x5D;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.AFwS216S0000000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class KycIncentiveFooterViewModel extends ViewModel {
    public final C01GW LL = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(69));
    public String LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;

    public final MutableLiveData<EnumC1805450x5D> vQ2() {
        return (MutableLiveData) this.LL.getValue();
    }

    public final boolean xQ2() {
        return C500260Jjc.LJJIIZ(this.LLILLJJLI) && C500260Jjc.LJJIFFI(Boolean.valueOf(this.LLILLL)) && C500260Jjc.LJJIIZ(this.LLILLJJLI);
    }

    public final boolean wQ2() {
        return vQ2().getValue() != null;
    }
}
