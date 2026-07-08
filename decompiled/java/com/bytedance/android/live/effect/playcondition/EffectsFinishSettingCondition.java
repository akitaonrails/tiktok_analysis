package com.bytedance.android.live.effect.playcondition;

import X.AbstractC20358214lI;
import X.C01GW;
import X.C1161920gLG;
import X.C20352914kR;
import X.C20353014kS;
import X.C20361214lm;
import X.C452501pT;
import X.EnumC771230UNd;
import X.EnumC773040UUc;
import X.InterfaceC946300ajU;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.livesdk.model.SharedEffect;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class EffectsFinishSettingCondition extends AbstractC20358214lI {
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS575S0100000_31(this, 91));

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final String LIZJ() {
        return "effects_finish_setting";
    }

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final void LIZLLL() {
        C20361214lm c20361214lm = this.LIZJ;
        if (LJIIJJI(c20361214lm != null ? C20352914kR.LIZ(c20361214lm) : null, false)) {
            return;
        }
        ((C20353014kS) this.LJFF.getValue()).LIZ = this.LIZJ;
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).addHostToolsCallback(EnumC773040UUc.EFFECTS, (C20353014kS) this.LJFF.getValue());
        LIZ();
    }

    @Override // X.AbstractC20358214lI, com.bytedance.android.livesdk.condition.PlayCondition
    public final void LJIIIIZZ() {
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).removeHostToolsCallback(EnumC773040UUc.EFFECTS, (C20353014kS) this.LJFF.getValue());
        super.LJIIIIZZ();
    }

    @Override // X.AbstractC20358214lI
    public final void LJIIJ(C20361214lm c20361214lm) {
        LJIIJJI(C20352914kR.LIZ(c20361214lm), true);
    }

    public final boolean LJIIJJI(SharedEffect sharedEffect, boolean z) {
        IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
        EnumC773040UUc enumC773040UUc = EnumC773040UUc.EFFECTS;
        EnumC771230UNd enumC771230UNd = iBroadcastService.getHostToolsCurrentStatus(enumC773040UUc).LIZ;
        String str = iBroadcastService.getHostToolsCurrentStatus(enumC773040UUc).LIZIZ;
        if (sharedEffect == null) {
            if (enumC771230UNd == EnumC771230UNd.APPLYING) {
                LJIIIZ("status == IPlayBook.DetailStatus.APPLYING");
                InterfaceC946300ajU interfaceC946300ajU = this.LJ;
                if (interfaceC946300ajU != null) {
                    interfaceC946300ajU.LIZ(true, z);
                }
                return true;
            }
            return false;
        }
        if (enumC771230UNd == EnumC771230UNd.APPLYING && Intrinsics.LJFF(str, sharedEffect.id)) {
            LJIIIZ("status == IPlayBook.DetailStatus.APPLYING && resourceId == config.id");
            InterfaceC946300ajU interfaceC946300ajU2 = this.LJ;
            if (interfaceC946300ajU2 != null) {
                interfaceC946300ajU2.LIZ(true, z);
            }
            return true;
        }
        return false;
    }
}
