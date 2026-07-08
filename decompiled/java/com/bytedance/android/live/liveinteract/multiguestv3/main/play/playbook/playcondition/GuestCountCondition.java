package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playcondition;

import X.AbstractC20358214lI;
import X.AbstractC922600a7G;
import X.C01GW;
import X.C19748512Ol;
import X.C452501pT;
import X.C930540aK4;
import X.C948450amx;
import X.C963320bAw;
import X.InterfaceC946300ajU;
import Y.ARunnableS115S0100000_15;
import com.bytedance.android.live.liveinteract.api.MultiGuestAnchorUserManangerEvent;
import com.bytedance.android.livesdk.condition.Condition;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes16.dex */
public final class GuestCountCondition extends AbstractC20358214lI {
    public Integer LJFF;
    public final C01GW LJI = C452501pT.LIZIZ(new AwS559S0100000_15(this, 305));
    public final ARunnableS115S0100000_15 LJII = new ARunnableS115S0100000_15(this, 55);

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final String LIZJ() {
        return "guest_count";
    }

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final void LIZLLL() {
        String str;
        Condition condition = this.LIZ;
        Integer num = null;
        if (condition != null && (str = condition.params) != null && !a0.LJJJIL(str)) {
            try {
                GuestCountConditionParam guestCountConditionParam = (GuestCountConditionParam) C19748512Ol.LIZIZ.LJII(str, GuestCountConditionParam.class);
                if (guestCountConditionParam != null) {
                    num = guestCountConditionParam.micCount;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        this.LJFF = num;
        if (num == null) {
            InterfaceC946300ajU interfaceC946300ajU = this.LJ;
            if (interfaceC946300ajU != null) {
                interfaceC946300ajU.LIZ(true, false);
                return;
            }
            return;
        }
        if (!C930540aK4.LIZJ()) {
            InterfaceC946300ajU interfaceC946300ajU2 = this.LJ;
            if (interfaceC946300ajU2 != null) {
                interfaceC946300ajU2.LIZ(true, false);
                return;
            }
            return;
        }
        if (C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_ANCHOR_USER_MANAGER") != null) {
            this.LJII.run();
            return;
        }
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel != null) {
            dataChannel.BQ2(this.LIZLLL, MultiGuestAnchorUserManangerEvent.class, new AwS594S0100000_15(this, 385));
        }
    }

    @Override // X.AbstractC20358214lI, com.bytedance.android.livesdk.condition.PlayCondition
    public final void LJIIIIZZ() {
        super.LJIIIIZZ();
        this.LJFF = null;
        AbstractC922600a7G abstractC922600a7G = (AbstractC922600a7G) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
        if (abstractC922600a7G != null) {
            abstractC922600a7G.LJJIIJ((C963320bAw) this.LJI.getValue());
        }
    }
}
