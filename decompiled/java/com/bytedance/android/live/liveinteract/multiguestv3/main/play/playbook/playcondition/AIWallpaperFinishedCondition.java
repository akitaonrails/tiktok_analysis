package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playcondition;

import X.AbstractC20358214lI;
import X.C01GW;
import X.C20349414js;
import X.C452501pT;
import X.C500260Jjc;
import X.C941700ac4;
import X.InterfaceC941720ac6;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.LinkMicAbilityManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.AigcWallpaperInCountDownChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class AIWallpaperFinishedCondition extends AbstractC20358214lI {
    public boolean LJFF;
    public final C01GW LJI = C452501pT.LIZIZ(new AwS575S0100000_31(this, 154));

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final String LIZJ() {
        return "ai_wallpaper_finished";
    }

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final void LIZLLL() {
        DataChannel dataChannel;
        LinkMicAbilityManager.LJIIIZ.getClass();
        InterfaceC941720ac6 interfaceC941720ac6LIZIZ = C941700ac4.LIZIZ();
        if (interfaceC941720ac6LIZIZ != null) {
            interfaceC941720ac6LIZIZ.LIZ((C20349414js) this.LJI.getValue());
        }
        DataChannel dataChannel2 = this.LIZIZ;
        boolean zLJJJI = C500260Jjc.LJJJI(dataChannel2 != null ? (Boolean) dataChannel2.gg0(AigcWallpaperInCountDownChannel.class) : null);
        this.LJFF = zLJJJI;
        if (C500260Jjc.LJJIJIIJIL(Boolean.valueOf(zLJJJI)) && (dataChannel = this.LIZIZ) != null) {
            dataChannel.BQ2(this.LIZLLL, AigcWallpaperInCountDownChannel.class, new AwS610S0100000_31(this, 44));
        }
        LIZ();
    }

    @Override // X.AbstractC20358214lI, com.bytedance.android.livesdk.condition.PlayCondition
    public final void LJIIIIZZ() {
        LinkMicAbilityManager.LJIIIZ.getClass();
        InterfaceC941720ac6 interfaceC941720ac6LIZIZ = C941700ac4.LIZIZ();
        if (interfaceC941720ac6LIZIZ != null) {
            interfaceC941720ac6LIZIZ.LJIIJJI((C20349414js) this.LJI.getValue());
        }
        super.LJIIIIZZ();
    }
}
