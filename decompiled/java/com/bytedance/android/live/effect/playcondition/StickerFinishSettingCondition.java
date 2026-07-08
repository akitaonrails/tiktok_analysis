package com.bytedance.android.live.effect.playcondition;

import X.AbstractC20358214lI;
import X.C01GW;
import X.C1161920gLG;
import X.C20348614jk;
import X.C20361214lm;
import X.C452501pT;
import X.C937280aUw;
import X.EnumC771230UNd;
import X.EnumC773040UUc;
import X.InterfaceC946300ajU;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.livesdk.model.RoomEffect;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class StickerFinishSettingCondition extends AbstractC20358214lI {
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS575S0100000_31(this, 101));

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final String LIZJ() {
        return "sticker_finish_setting";
    }

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final void LIZLLL() {
        String str;
        C20361214lm c20361214lm = this.LIZJ;
        RoomEffect roomEffect = null;
        if (c20361214lm != null && (str = c20361214lm.LJI) != null) {
            roomEffect = (RoomEffect) C937280aUw.LIZJ(RoomEffect.class, str, new RoomEffect("", null));
        }
        if (LJIIJJI(roomEffect, false)) {
            return;
        }
        ((C20348614jk) this.LJFF.getValue()).LIZ = this.LIZJ;
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).addHostToolsCallback(EnumC773040UUc.STICKER, (C20348614jk) this.LJFF.getValue());
        LIZ();
    }

    @Override // X.AbstractC20358214lI, com.bytedance.android.livesdk.condition.PlayCondition
    public final void LJIIIIZZ() {
        ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).removeHostToolsCallback(EnumC773040UUc.STICKER, (C20348614jk) this.LJFF.getValue());
        super.LJIIIIZZ();
    }

    @Override // X.AbstractC20358214lI
    public final void LJIIJ(C20361214lm c20361214lm) {
        String str = c20361214lm.LJI;
        RoomEffect roomEffect = null;
        if (str != null) {
            roomEffect = (RoomEffect) C937280aUw.LIZJ(RoomEffect.class, str, new RoomEffect("", null));
        }
        LJIIJJI(roomEffect, true);
    }

    public final boolean LJIIJJI(RoomEffect roomEffect, boolean z) {
        IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
        EnumC773040UUc enumC773040UUc = EnumC773040UUc.STICKER;
        EnumC771230UNd enumC771230UNd = iBroadcastService.getHostToolsCurrentStatus(enumC773040UUc).LIZ;
        String str = iBroadcastService.getHostToolsCurrentStatus(enumC773040UUc).LIZIZ;
        if (roomEffect != null && roomEffect.id.length() != 0) {
            if (Intrinsics.LJFF(roomEffect.id, str) && enumC771230UNd == EnumC771230UNd.APPLYING) {
                LJIIIZ("config.id == resourceId && status == IPlayBook.DetailStatus.APPLYING");
                InterfaceC946300ajU interfaceC946300ajU = this.LJ;
                if (interfaceC946300ajU != null) {
                    interfaceC946300ajU.LIZ(true, z);
                }
                return true;
            }
        } else if (enumC771230UNd == EnumC771230UNd.APPLYING) {
            LJIIIZ("only status == IPlayBook.DetailStatus.APPLYING");
            InterfaceC946300ajU interfaceC946300ajU2 = this.LJ;
            if (interfaceC946300ajU2 != null) {
                interfaceC946300ajU2.LIZ(true, z);
            }
            return true;
        }
        return false;
    }
}
