package com.bytedance.android.live.effect.playcondition;

import X.AbstractC20358214lI;
import X.C01GW;
import X.C1161920gLG;
import X.C20352714kP;
import X.C20361214lm;
import X.C452501pT;
import X.C937280aUw;
import X.EnumC771230UNd;
import X.EnumC773040UUc;
import X.InterfaceC946300ajU;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.effect.playentity.VoiceEntityConfig;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class VoiceEffectFinishSettingCondition extends AbstractC20358214lI {
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS575S0100000_31(this, 104));

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final String LIZJ() {
        return "voice_effect_finish_setting";
    }

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final void LIZLLL() {
        String str;
        C20361214lm c20361214lm = this.LIZJ;
        VoiceEntityConfig voiceEntityConfig = null;
        if (c20361214lm != null && (str = c20361214lm.LJI) != null) {
            voiceEntityConfig = (VoiceEntityConfig) C937280aUw.LIZJ(VoiceEntityConfig.class, str, new VoiceEntityConfig(null));
        }
        if (LJIIJJI(voiceEntityConfig, false)) {
            return;
        }
        ((C20352714kP) this.LJFF.getValue()).LIZ = this.LIZJ;
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).addHostToolsCallback(EnumC773040UUc.VOICE_EFFECTS, (C20352714kP) this.LJFF.getValue());
        LIZ();
    }

    @Override // X.AbstractC20358214lI, com.bytedance.android.livesdk.condition.PlayCondition
    public final void LJIIIIZZ() {
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).removeHostToolsCallback(EnumC773040UUc.VOICE_EFFECTS, (C20352714kP) this.LJFF.getValue());
        super.LJIIIIZZ();
    }

    @Override // X.AbstractC20358214lI
    public final void LJIIJ(C20361214lm c20361214lm) {
        String str = c20361214lm.LJI;
        VoiceEntityConfig voiceEntityConfig = null;
        if (str != null) {
            voiceEntityConfig = (VoiceEntityConfig) C937280aUw.LIZJ(VoiceEntityConfig.class, str, new VoiceEntityConfig(null));
        }
        LJIIJJI(voiceEntityConfig, true);
    }

    public final boolean LJIIJJI(VoiceEntityConfig voiceEntityConfig, boolean z) {
        String str;
        IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
        EnumC773040UUc enumC773040UUc = EnumC773040UUc.VOICE_EFFECTS;
        EnumC771230UNd enumC771230UNd = iBroadcastService.getHostToolsCurrentStatus(enumC773040UUc).LIZ;
        String str2 = iBroadcastService.getHostToolsCurrentStatus(enumC773040UUc).LIZIZ;
        if (voiceEntityConfig != null && (str = voiceEntityConfig.resourceId) != null) {
            if (enumC771230UNd == EnumC771230UNd.APPLYING && Intrinsics.LJFF(str, str2)) {
                LJIIIZ("status == IPlayBook.DetailStatus.APPLYING && config.resourceId == resourceId");
                InterfaceC946300ajU interfaceC946300ajU = this.LJ;
                if (interfaceC946300ajU != null) {
                    interfaceC946300ajU.LIZ(true, z);
                }
                return true;
            }
            return false;
        }
        if (enumC771230UNd == EnumC771230UNd.APPLYING) {
            LJIIIZ("status == IPlayBook.DetailStatus.APPLYING");
            InterfaceC946300ajU interfaceC946300ajU2 = this.LJ;
            if (interfaceC946300ajU2 != null) {
                interfaceC946300ajU2.LIZ(true, z);
            }
            return true;
        }
        return false;
    }
}
