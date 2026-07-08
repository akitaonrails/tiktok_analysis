package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playcondition;

import X.AbstractC20358214lI;
import X.C01GW;
import X.C20349514jt;
import X.C452501pT;
import X.C500260Jjc;
import X.C941700ac4;
import X.InterfaceC941720ac6;
import X.InterfaceC946300ajU;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.LinkMicAbilityManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.AigcWallpaperInCountDownChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class AIWallpaperOngoingCondition extends AbstractC20358214lI {
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS575S0100000_31(this, 155));

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final String LIZJ() {
        return "ai_wallpaper_ongoing";
    }

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final void LIZLLL() {
        DataChannel dataChannel = this.LIZIZ;
        if (!C500260Jjc.LJJJI(dataChannel != null ? (Boolean) dataChannel.gg0(AigcWallpaperInCountDownChannel.class) : null)) {
            DataChannel dataChannel2 = this.LIZIZ;
            if (dataChannel2 != null) {
                dataChannel2.BQ2(this.LIZLLL, AigcWallpaperInCountDownChannel.class, new AwS610S0100000_31(this, 45));
            }
            LIZ();
            return;
        }
        LJIIIZ("get status");
        InterfaceC946300ajU interfaceC946300ajU = this.LJ;
        if (interfaceC946300ajU != null) {
            interfaceC946300ajU.LIZ(true, false);
        }
    }

    @Override // X.AbstractC20358214lI, com.bytedance.android.livesdk.condition.PlayCondition
    public final void LJIIIIZZ() {
        LinkMicAbilityManager.LJIIIZ.getClass();
        InterfaceC941720ac6 interfaceC941720ac6LIZIZ = C941700ac4.LIZIZ();
        if (interfaceC941720ac6LIZIZ != null) {
            interfaceC941720ac6LIZIZ.LJIIJJI((C20349514jt) this.LJFF.getValue());
        }
        super.LJIIIIZZ();
    }
}
