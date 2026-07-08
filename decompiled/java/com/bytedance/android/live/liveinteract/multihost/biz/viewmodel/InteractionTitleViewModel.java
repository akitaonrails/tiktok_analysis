package com.bytedance.android.live.liveinteract.multihost.biz.viewmodel;

import X.C1155220gAS;
import X.C1559260qg8;
import X.C15F4;
import X.C15F6;
import X.C15F9;
import X.C20441214yg;
import X.C915980Zwa;
import X.C931800aM6;
import X.C975230bU9;
import X.EnumC944980ahM;
import X.InterfaceC0148002o;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTimeLeftChannel;
import com.bytedance.android.live.liveinteract.multihost.event.MultiCoHostStateChannel;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.AwS645S0100000_31;
import kotlin.jvm.internal.AwS82S0210000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class InteractionTitleViewModel extends AssemViewModel<C15F9> {
    public final C1559260qg8 LL = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C1155220gAS.class, (Class<Object>) null, (String) 13), true);
    public DataChannel LLILLJJLI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        C931800aM6.LIZ.getClass();
        return new C15F9((C931800aM6.LIZIZ() && C915980Zwa.LJI().LIZ().LLIIJI() == EnumC944980ahM.CONNECTION_SUCCEED) ? C15F4.LIZ : null, 5);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        super.onCleared();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        this.LLILLJJLI = ((C1155220gAS) this.LL.getValue()).LLILLJJLI;
        C20441214yg.LIZIZ("TitleViewModel", "interactTitleViewModel onPrepared");
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.CQ2(MultiCoHostStateChannel.class, this, new AwS610S0100000_31(this, 73));
            C975230bU9.LJII(dataChannel, this, new AwS645S0100000_31(this, 15));
            dataChannel.CQ2(BattleTimeLeftChannel.class, this, new AwS610S0100000_31(this, 74));
        }
    }

    public static void vQ2(InteractionTitleViewModel interactionTitleViewModel, C15F6 c15f6) {
        interactionTitleViewModel.getClass();
        interactionTitleViewModel.withState(new AwS82S0210000_31(c15f6, false, interactionTitleViewModel, 4));
    }
}
