package com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.guidence;

import X.C11JL;
import X.C11QJ;
import X.C1701940uOG;
import X.C19487111Lx;
import X.C987100bnI;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestAcceptGuideMessageReceivedEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class ApplyGuideManageMoreAbilityImpl implements IApplyGuideManageMoreAbility {
    public final DataChannel LL;
    public C19487111Lx LLILLJJLI;
    public C11JL LLILLL;
    public final List<Long> LLILZ = new ArrayList();

    public ApplyGuideManageMoreAbilityImpl(DataChannel dataChannel) {
        this.LL = dataChannel;
        dataChannel.CQ2(MultiGuestAcceptGuideMessageReceivedEvent.class, this, new AwS594S0100000_15(this, 199));
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.guidence.IApplyGuideManageMoreAbility
    public final void OV0(long j) {
        ((ArrayList) this.LLILZ).add(Long.valueOf(j));
        if (this.LLILLJJLI == null) {
            this.LLILLJJLI = (C19487111Lx) C11QJ.LL.LJ(1L, TimeUnit.SECONDS).LJIILJJIL(C1701940uOG.LIZIZ()).LJII(new C987100bnI(this, 5)).LJIIZILJ();
        }
    }
}
