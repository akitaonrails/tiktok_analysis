package com.bytedance.android.live.liveinteract.multiguestv3.main.common.switchspot;

import X.AbstractC928510aGn;
import X.C01GW;
import X.C13LP;
import X.C15BL;
import X.C16FS;
import X.C20743416Fc;
import X.C2188811AlT;
import X.C452501pT;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C933240aOQ;
import X.C933260aOS;
import X.C933270aOT;
import X.C940770aaZ;
import X.C941700ac4;
import X.C948450amx;
import X.C951190arN;
import X.C957020b0m;
import X.InterfaceC941720ac6;
import Y.AComparatorS34S0000000_15;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.LinkMicAbilityManager;
import com.bytedance.android.live.liveinteract.multiguestv3.service.usermanage.anchor.AnchorBusinessUserManager;
import com.bytedance.android.live.liveinteract.multiguestv3.service.usermanage.moderator.ModeratorBusinessUserManager;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreModelKt;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAbilityListDisableSwitchSpotSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.MultiGuestSpotExtra;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: loaded from: classes16.dex */
public final class SwitchSpotDialogFragment extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6HELIOSemE+KSwiZyw8JSgjJ2EgPyw4KicgOCo4ZxwkITEvIRwjJzEIIC4/JyIKOy40JSAiPQ==";
    public final PosIdentity LLJLLL;
    public final String LLJZ;
    public final DataChannel LLJZIJLIL;
    public C20743416Fc LLL;
    public RecyclerView LLLF;
    public C933270aOT LLLFF;
    public C16FS LLLFZ;
    public final C01GW LLLFFI = C452501pT.LIZIZ(new AwS559S0100000_15(this, 241));
    public final C01GW LLLI = C452501pT.LIZIZ(new AwS559S0100000_15(this, 240));
    public final C01GW LLLII = C452501pT.LIZIZ(new AwS559S0100000_15(this, 239));

    public final void BS() {
        String str;
        MultiGuestSpotExtra multiGuestSpotExtra;
        List<String> listLJIILLIIL;
        LinkMicAbilityManager.LJIIIZ.getClass();
        InterfaceC941720ac6 interfaceC941720ac6LIZIZ = C941700ac4.LIZIZ();
        Boolean boolValueOf = null;
        if (interfaceC941720ac6LIZIZ == null || (listLJIILLIIL = interfaceC941720ac6LIZIZ.LJIILLIIL()) == null) {
            str = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (String str2 : listLJIILLIIL) {
                if (MultiGuestAbilityListDisableSwitchSpotSetting.INSTANCE.getAbilityList().contains(str2)) {
                    arrayList.add(str2);
                }
            }
            str = (String) C13LP.LJJJLL(arrayList);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateConfirmBtnState toolsTypeIsRunning:");
        sbLIZ.append(str);
        C15BL.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        C16FS c16fs = this.LLLFZ;
        if (c16fs != null) {
            C933270aOT c933270aOT = this.LLLFF;
            if (c933270aOT != null && (multiGuestSpotExtra = c933270aOT.LIZIZ) != null) {
                boolValueOf = Boolean.valueOf(multiGuestSpotExtra.isSwitchSpotEnabled);
            }
            c16fs.setEnabled(C500260Jjc.LJJJI(boolValueOf) && str == null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        ((C951190arN) this.LLLFFI.getValue()).LLLIIIIL();
        C940770aaZ.LIZ().LJJ((C933240aOQ) this.LLLI.getValue());
        LinkMicAbilityManager.LJIIIZ.getClass();
        InterfaceC941720ac6 interfaceC941720ac6LIZIZ = C941700ac4.LIZIZ();
        if (interfaceC941720ac6LIZIZ != null) {
            interfaceC941720ac6LIZIZ.LJIIJJI((C933260aOS) this.LLLII.getValue());
        }
    }

    public final AbstractC928510aGn yS() {
        if (LinkCoreModelKt.currentUserIsAnchor()) {
            AnchorBusinessUserManager anchorBusinessUserManager = (AnchorBusinessUserManager) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
            if (anchorBusinessUserManager != null) {
                return anchorBusinessUserManager.LJJJLZIJ();
            }
            return null;
        }
        ModeratorBusinessUserManager moderatorBusinessUserManager = (ModeratorBusinessUserManager) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_MODERATOR_USER_MANAGER");
        if (moderatorBusinessUserManager != null) {
            return moderatorBusinessUserManager.LJJJLZIJ();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ES(java.util.List<X.C957020b0m> r12) {
        /*
            r11 = this;
            X.01GW r0 = r11.LLLFFI
            java.lang.Object r7 = r0.getValue()
            X.0fBO r7 = (X.C1117360fBO) r7
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r10 = r12.iterator()
        L11:
            boolean r0 = r10.hasNext()
            r4 = 0
            if (r0 == 0) goto L61
            java.lang.Object r9 = r10.next()
            X.0b0m r9 = (X.C957020b0m) r9
            tikcast.linkmic.common.PosIdentity r8 = r9.getPosIdentity()
            if (r8 == 0) goto L11
            X.0aOT r0 = r11.LLLFF
            if (r0 == 0) goto L5f
            tikcast.linkmic.common.MultiGuestSpotExtra r0 = r0.LIZIZ
            if (r0 == 0) goto L5f
            int r0 = r0.spotRank
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
        L32:
            X.0aOU r3 = new X.0aOU
            X.0aOT r2 = new X.0aOT
            tikcast.linkmic.common.MultiGuestSpotExtra r1 = r9.getMultiGuestExtra()
            com.bytedance.android.live.base.model.user.User r0 = r11.zS(r9)
            r2.<init>(r8, r1, r0)
            if (r5 == 0) goto L5d
            tikcast.linkmic.common.MultiGuestSpotExtra r0 = r9.getMultiGuestExtra()
            if (r0 == 0) goto L4f
            int r0 = r0.spotRank
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L4f:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r5)
            if (r0 == 0) goto L5d
            r0 = 1
        L56:
            r3.<init>(r2, r0)
            r6.add(r3)
            goto L11
        L5d:
            r0 = 0
            goto L56
        L5f:
            r5 = r4
            goto L32
        L61:
            r7.LLLII(r6)
            X.0aOT r0 = r11.LLLFF
            if (r0 == 0) goto L9b
            tikcast.linkmic.common.MultiGuestSpotExtra r0 = r0.LIZIZ
            if (r0 == 0) goto L9b
            int r0 = r0.spotRank
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            if (r3 == 0) goto L9b
            java.util.Iterator r2 = r12.iterator()
        L78:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L99
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.0b0m r0 = (X.C957020b0m) r0
            tikcast.linkmic.common.MultiGuestSpotExtra r0 = r0.getMultiGuestExtra()
            if (r0 == 0) goto L9f
            int r0 = r0.spotRank
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L91:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r3)
            if (r0 == 0) goto L78
            if (r1 != 0) goto L9b
        L99:
            r11.LLLFF = r4
        L9b:
            r11.BS()
            return
        L9f:
            r0 = r4
            goto L91
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.common.switchspot.SwitchSpotDialogFragment.ES(java.util.List):void");
    }

    public final List<C957020b0m> wS(List<C957020b0m> list) {
        ArrayList arrayList = new ArrayList();
        for (C957020b0m c957020b0m : list) {
            if (!Intrinsics.LJFF(c957020b0m.getPosIdentity(), this.LLJLLL)) {
                arrayList.add(c957020b0m);
            }
        }
        return C13LP.LJLLLL(new AComparatorS34S0000000_15(3), arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.android.live.base.model.user.User zS(X.C957020b0m r6) {
        /*
            r5 = this;
            tikcast.linkmic.common.PosIdentity r0 = r6.getPosIdentity()
            if (r0 == 0) goto L46
            int r1 = r0.type
            r0 = 1
            if (r1 != r0) goto L46
        Lb:
            r4 = 0
            if (r0 == 0) goto L41
            X.0aGn r0 = r5.yS()
            if (r0 == 0) goto L41
            java.util.List r0 = r0.LJIJJLI()
            if (r0 == 0) goto L41
            java.util.Iterator r3 = r0.iterator()
        L1e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L44
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo r0 = (com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo) r0
            java.lang.String r1 = r0.mInteractIdStr
            tikcast.linkmic.common.PosIdentity r0 = r6.getPosIdentity()
            if (r0 == 0) goto L42
            java.lang.String r0 = r0.value
        L35:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L1e
        L3b:
            com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo r2 = (com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo) r2
            if (r2 == 0) goto L41
            com.bytedance.android.live.base.model.user.User r4 = r2.mUser
        L41:
            return r4
        L42:
            r0 = r4
            goto L35
        L44:
            r2 = r4
            goto L3b
        L46:
            r0 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.common.switchspot.SwitchSpotDialogFragment.zS(X.0b0m):com.bytedance.android.live.base.model.user.User");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0106  */
    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r11, android.os.Bundle r12) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.common.switchspot.SwitchSpotDialogFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void uS(java.lang.String r20, X.C933270aOT r21) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.common.switchspot.SwitchSpotDialogFragment.uS(java.lang.String, X.0aOT):void");
    }

    public SwitchSpotDialogFragment(PosIdentity posIdentity, String str, DataChannel dataChannel) {
        this.LLJLLL = posIdentity;
        this.LLJZ = str;
        this.LLJZIJLIL = dataChannel;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.h9t, viewGroup, false);
    }
}
