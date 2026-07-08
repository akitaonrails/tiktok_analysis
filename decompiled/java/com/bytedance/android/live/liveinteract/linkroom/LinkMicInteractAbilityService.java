package com.bytedance.android.live.liveinteract.linkroom;

import X.C01EL;
import X.C1161920gLG;
import X.C920350a3d;
import X.C924810aAp;
import X.C941700ac4;
import X.InterfaceC924740aAi;
import X.InterfaceC941720ac6;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.LinkMicAbilityManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.record.PlayRecordManager;
import com.bytedance.android.livesdk.service.ILinkMicInteractAbilityService;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: loaded from: classes16.dex */
public class LinkMicInteractAbilityService implements ILinkMicInteractAbilityService {
    @Override // com.bytedance.android.livesdk.service.ILinkMicInteractAbilityService
    public final String IY() {
        return ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).w9() ? "co_host" : C924810aAp.LJ().LJJII > 0 ? "multi_guest" : "solo_live";
    }

    @Override // com.bytedance.android.livesdk.service.ILinkMicInteractAbilityService
    public final InterfaceC941720ac6 LI() {
        LinkMicAbilityManager.LJIIIZ.getClass();
        return C941700ac4.LIZIZ();
    }

    @Override // com.bytedance.android.livesdk.service.ILinkMicInteractAbilityService
    public final void Ob2() {
        LinkMicAbilityManager.LJIIIZ.getClass();
        C941700ac4.LIZLLL();
    }

    @Override // com.bytedance.android.livesdk.service.ILinkMicInteractAbilityService
    public final void En0(boolean z) {
        if (z) {
            PlayRecordManager.LIZLLL.getClass();
            InterfaceC924740aAi interfaceC924740aAiLIZ = C920350a3d.LIZ();
            if (interfaceC924740aAiLIZ != null) {
                interfaceC924740aAiLIZ.LIZ("karaoke");
            }
            LinkMicAbilityManager.LJIIIZ.getClass();
            InterfaceC941720ac6 interfaceC941720ac6LIZIZ = C941700ac4.LIZIZ();
            if (interfaceC941720ac6LIZIZ != null) {
                interfaceC941720ac6LIZIZ.LJIL(C01EL.START, "karaoke");
                return;
            }
            return;
        }
        PlayRecordManager.LIZLLL.getClass();
        InterfaceC924740aAi interfaceC924740aAiLIZ2 = C920350a3d.LIZ();
        if (interfaceC924740aAiLIZ2 != null) {
            interfaceC924740aAiLIZ2.LIZIZ("karaoke");
        }
        LinkMicAbilityManager.LJIIIZ.getClass();
        InterfaceC941720ac6 interfaceC941720ac6LIZIZ2 = C941700ac4.LIZIZ();
        if (interfaceC941720ac6LIZIZ2 == null) {
            return;
        }
        interfaceC941720ac6LIZIZ2.LJIL(C01EL.END, "karaoke");
    }

    @Override // com.bytedance.android.livesdk.service.ILinkMicInteractAbilityService
    public final void Ub0(DataChannel dataChannel) {
        LinkMicAbilityManager.LJIIIZ.getClass();
        C941700ac4.LIZ(dataChannel);
    }
}
