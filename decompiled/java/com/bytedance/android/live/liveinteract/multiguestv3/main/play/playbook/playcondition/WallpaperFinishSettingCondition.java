package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playcondition;

import X.AbstractC20358214lI;
import X.C1555540qa8;
import X.C20361214lm;
import X.C2188811AlT;
import X.C2217371BqR;
import X.C935540aS8;
import X.C937280aUw;
import X.C956790b0P;
import X.InterfaceC665370Q7z;
import X.InterfaceC946300ajU;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.ToolsTypeStateUpdateEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.common.ISharedBgAbility;
import com.bytedance.android.livesdk.model.SharedEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class WallpaperFinishSettingCondition extends AbstractC20358214lI {
    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final String LIZJ() {
        return "wallpaper_finish_setting";
    }

    @Override // com.bytedance.android.livesdk.condition.PlayCondition
    public final void LIZLLL() {
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModelGL0;
        InterfaceC665370Q7z interfaceC665370Q7z;
        DataChannel dataChannel = this.LIZIZ;
        ISharedBgAbility iSharedBgAbility = null;
        if (dataChannel != null && (interfaceC665370Q7z = (InterfaceC665370Q7z) dataChannel.gg0(C956790b0P.class)) != null) {
            iSharedBgAbility = (ISharedBgAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z, ISharedBgAbility.class, null);
        }
        if (LJIIJJI("getStatus", false)) {
            return;
        }
        DataChannel dataChannel2 = this.LIZIZ;
        if (dataChannel2 != null) {
            dataChannel2.BQ2(this.LIZLLL, ToolsTypeStateUpdateEvent.class, new AwS594S0100000_15(this, 394));
        }
        if (iSharedBgAbility != null && (multiGuestSharedBgAnchorViewModelGL0 = iSharedBgAbility.GL0()) != null) {
            MultiGuestSharedBgAnchorViewModel.HQ2(multiGuestSharedBgAnchorViewModelGL0, new C2217371BqR() { // from class: X.0abM
                @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C935540aS8) obj).LLILLL);
                }

                @Override // X.C2217371BqR, X.AbstractC2217331BqN
                public final void set(Object obj, Object obj2) {
                    ((C935540aS8) obj).LLILLL = ((Boolean) obj2).booleanValue();
                }
            }, this.LIZLLL, new AwS594S0100000_15(this, 395));
        }
        LIZ();
    }

    @Override // X.AbstractC20358214lI
    public final void LJIIJ(C20361214lm c20361214lm) {
        LJIIJJI("onPlaybookTaskUpdate", true);
    }

    public final boolean LJIIJJI(String str, boolean z) {
        String str2;
        ISharedBgAbility iSharedBgAbility;
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModelGL0;
        C935540aS8 state;
        C935540aS8 state2;
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModelGL02;
        C935540aS8 state3;
        InterfaceC665370Q7z interfaceC665370Q7z;
        C20361214lm c20361214lm = this.LIZJ;
        String str3 = null;
        if (c20361214lm != null) {
            str2 = c20361214lm.LJI;
        } else {
            str2 = null;
        }
        SharedEffect sharedEffect = (SharedEffect) C937280aUw.LIZJ(SharedEffect.class, str2, new SharedEffect("", "", null));
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel != null && (interfaceC665370Q7z = (InterfaceC665370Q7z) dataChannel.gg0(C956790b0P.class)) != null) {
            iSharedBgAbility = (ISharedBgAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z, ISharedBgAbility.class, null);
        } else {
            iSharedBgAbility = null;
        }
        if (sharedEffect.id.length() == 0) {
            if (iSharedBgAbility != null && (multiGuestSharedBgAnchorViewModelGL02 = iSharedBgAbility.GL0()) != null && (state3 = multiGuestSharedBgAnchorViewModelGL02.getState()) != null && state3.LLILLL) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("true and parameter isEmpty source: ");
                sbLIZ.append(str);
                LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
                InterfaceC946300ajU interfaceC946300ajU = this.LJ;
                if (interfaceC946300ajU != null) {
                    interfaceC946300ajU.LIZ(true, z);
                }
                return true;
            }
        } else if (iSharedBgAbility != null && (multiGuestSharedBgAnchorViewModelGL0 = iSharedBgAbility.GL0()) != null && (state = multiGuestSharedBgAnchorViewModelGL0.getState()) != null && state.LLILLL) {
            String str4 = sharedEffect.id;
            MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModelGL03 = iSharedBgAbility.GL0();
            if (multiGuestSharedBgAnchorViewModelGL03 != null && (state2 = multiGuestSharedBgAnchorViewModelGL03.getState()) != null) {
                str3 = state2.LLILZ;
            }
            if (Intrinsics.LJFF(str4, str3)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("true and parameter isNotEmpty, config.id: ");
                sbLIZ2.append(sharedEffect.id);
                sbLIZ2.append(", source: ");
                sbLIZ2.append(str);
                LJIIIZ(C2188811AlT.LIZIZ(sbLIZ2));
                InterfaceC946300ajU interfaceC946300ajU2 = this.LJ;
                if (interfaceC946300ajU2 != null) {
                    interfaceC946300ajU2.LIZ(true, z);
                }
                return true;
            }
        }
        return false;
    }
}
