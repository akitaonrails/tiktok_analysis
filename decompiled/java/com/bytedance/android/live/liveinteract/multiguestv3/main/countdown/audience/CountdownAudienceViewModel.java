package com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.audience;

import X.C20441214yg;
import X.C299601Ec;
import X.C421401kS;
import X.C500260Jjc;
import X.InterfaceC420801kM;
import com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.BaseCountdownViewModel;

/* JADX INFO: loaded from: classes.dex */
public final class CountdownAudienceViewModel extends BaseCountdownViewModel {
    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.BaseCountdownViewModel
    public final String getTag() {
        return "CountdownAudienceViewModel";
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.BaseCountdownViewModel
    public final void AQ2(C299601Ec c299601Ec) {
        Boolean boolValueOf;
        if (C500260Jjc.LJJJI(c299601Ec.LJIIJJI)) {
            C421401kS c421401kS = this.LLILLJJLI;
            InterfaceC420801kM interfaceC420801kM = c421401kS.LIZ.get(c299601Ec.LIZJ);
            if (interfaceC420801kM != null) {
                boolValueOf = Boolean.valueOf(interfaceC420801kM.isDisposed());
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJIFFI(boolValueOf)) {
                C20441214yg.LJIIIZ("CountdownAudienceViewModel", "timer is running, wait timeout");
                return;
            }
        }
        super.AQ2(c299601Ec);
    }
}
