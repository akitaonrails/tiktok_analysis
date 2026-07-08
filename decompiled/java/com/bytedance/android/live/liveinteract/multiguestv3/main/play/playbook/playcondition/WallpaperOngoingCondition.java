package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playcondition;

import X.AbstractC20358214lI;
import X.C1555540qa8;
import X.C2217371BqR;
import X.C935540aS8;
import X.C956790b0P;
import X.InterfaceC665370Q7z;
import X.InterfaceC946300ajU;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.common.ISharedBgAbility;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class WallpaperOngoingCondition extends AbstractC20358214lI {
    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final String LIZJ() {
        return "wallpaper_ongoing";
    }

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final void LIZLLL() {
        InterfaceC665370Q7z interfaceC665370Q7z;
        ISharedBgAbility iSharedBgAbility;
        C935540aS8 state;
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel != null && (interfaceC665370Q7z = (InterfaceC665370Q7z) dataChannel.gg0(C956790b0P.class)) != null && (iSharedBgAbility = (ISharedBgAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z, ISharedBgAbility.class, null)) != null) {
            MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModelGL0 = iSharedBgAbility.GL0();
            if (multiGuestSharedBgAnchorViewModelGL0 != null && (state = multiGuestSharedBgAnchorViewModelGL0.getState()) != null && state.LLILLL) {
                LJIIIZ("in getStatus");
                InterfaceC946300ajU interfaceC946300ajU = this.LJ;
                if (interfaceC946300ajU != null) {
                    interfaceC946300ajU.LIZ(true, false);
                    return;
                }
                return;
            }
            MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModelGL02 = iSharedBgAbility.GL0();
            if (multiGuestSharedBgAnchorViewModelGL02 != null) {
                MultiGuestSharedBgAnchorViewModel.HQ2(multiGuestSharedBgAnchorViewModelGL02, new C2217371BqR() { // from class: X.0arD
                    @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return Boolean.valueOf(((C935540aS8) obj).LLILLL);
                    }

                    @Override // X.C2217371BqR, X.AbstractC2217331BqN
                    public final void set(Object obj, Object obj2) {
                        ((C935540aS8) obj).LLILLL = ((Boolean) obj2).booleanValue();
                    }
                }, this.LIZLLL, new AwS594S0100000_15(this, 397));
            }
        }
        LIZ();
    }
}
