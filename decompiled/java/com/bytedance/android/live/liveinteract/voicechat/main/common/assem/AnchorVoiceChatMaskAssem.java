package com.bytedance.android.live.liveinteract.voicechat.main.common.assem;

import X.AbstractC922600a7G;
import X.AbstractC938650aX9;
import X.C01GW;
import X.C11JF;
import X.C1555540qa8;
import X.C20441214yg;
import X.C2217371BqR;
import X.C2217381BqS;
import X.C452501pT;
import X.C931740aM0;
import X.C933460aOm;
import X.C933610aP1;
import X.C933680aP8;
import X.C933690aP9;
import X.C933770aPH;
import X.C938670aXB;
import X.C948450amx;
import X.C956790b0P;
import X.InterfaceC665370Q7z;
import X.InterfaceC922630a7J;
import X.InterfaceC927720aFW;
import X.InterfaceC948490an1;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.LinkInRoomAnchorInviteGuestEvent;
import com.bytedance.android.live.liveinteract.linkroom.dataholder.LinkControlDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.guidence.IGuidenceAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.guidence.MultiGuestGuidenceViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestAnchorSideShowGuidenceEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestHideGuideLinkMicEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.sharerevnue.ISharedRevenueAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.sharerevnue.MultiGuestAnchorShareRevenueViewModel;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreModelKt;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class AnchorVoiceChatMaskAssem extends VoiceChatMaskAssem {
    public static final /* synthetic */ int LLJZ = 0;
    public IGuidenceAbility LLJLIL;
    public C11JF LLJLILLLLZIIL;
    public boolean LLJLL;
    public ISharedRevenueAbility LLJLLIL;
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 530));

    @InterfaceC948490an1(name = "MULTI_GUEST_DATA_HOLDER")
    public MultiGuestDataHolder dataHolder;

    @InterfaceC948490an1(name = "LINK_CONTROL_DATA_HOLDER")
    public LinkControlDataHolder linkControlDataHolder;

    @Override // com.bytedance.android.live.liveinteract.voicechat.main.common.assem.VoiceChatMaskAssem
    public final int lp() {
        return 0;
    }

    public AnchorVoiceChatMaskAssem() {
        C948450amx.LIZIZ.LIZJ(this);
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.main.common.assem.VoiceChatMaskAssem, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        LinkControlDataHolder linkControlDataHolder = this.linkControlDataHolder;
        if (linkControlDataHolder != null) {
            linkControlDataHolder.LIZ.remove(this.LLJLLL.getValue());
        }
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.main.common.assem.VoiceChatMaskAssem
    public final void yp() {
        MultiGuestGuidenceViewModel viewModel;
        C933680aP8 state;
        if (LinkCoreModelKt.currentUserIsAnchor()) {
            C20441214yg.LIZIZ("live_guidence", "AnchorVoiceChatMaskAssem_onWindowRefreshFinished list");
            IGuidenceAbility iGuidenceAbility = this.LLJLIL;
            Fp((iGuidenceAbility == null || (viewModel = iGuidenceAbility.getViewModel()) == null || (state = viewModel.getState()) == null) ? null : state.LL);
        }
    }

    public final void Ap(C933610aP1 c933610aP1) {
        IGuidenceAbility iGuidenceAbility;
        MultiGuestGuidenceViewModel viewModel;
        C933680aP8 state;
        C933690aP9 c933690aP9;
        IGuidenceAbility iGuidenceAbility2;
        MultiGuestGuidenceViewModel viewModel2;
        C933680aP8 state2;
        C933460aOm c933460aOm;
        if (c933610aP1 != null && (iGuidenceAbility = this.LLJLIL) != null && (viewModel = iGuidenceAbility.getViewModel()) != null && (state = viewModel.getState()) != null && (c933690aP9 = state.LLILLJJLI) != null && (iGuidenceAbility2 = this.LLJLIL) != null && (viewModel2 = iGuidenceAbility2.getViewModel()) != null && (state2 = viewModel2.getState()) != null && (c933460aOm = state2.LL) != null) {
            C931740aM0.LIZ(8, c933690aP9.LIZ, c933460aOm.LIZIZ, String.valueOf(c933610aP1.LIZ), c933460aOm.LIZ, false, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x008c, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Fp(X.C933460aOm r14) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.voicechat.main.common.assem.AnchorVoiceChatMaskAssem.Fp(X.0aOm):void");
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.main.common.assem.VoiceChatMaskAssem
    public final AbstractC938650aX9 kp(String str) {
        if (str == null) {
            return null;
        }
        return new C938670aXB(this.LLJJIJIIJIL, str);
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.main.common.assem.VoiceChatMaskAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        MultiGuestGuidenceViewModel viewModel;
        MultiGuestGuidenceViewModel viewModel2;
        MultiGuestGuidenceViewModel viewModel3;
        InterfaceC665370Q7z interfaceC665370Q7z;
        MultiGuestAnchorShareRevenueViewModel multiGuestAnchorShareRevenueViewModelKn1;
        super.onViewCreated(view);
        DataChannel dataChannel = this.LLJJIJIIJIL;
        if (dataChannel != null && (interfaceC665370Q7z = (InterfaceC665370Q7z) dataChannel.gg0(C956790b0P.class)) != null) {
            this.LLJLIL = (IGuidenceAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z, IGuidenceAbility.class, null);
            ISharedRevenueAbility iSharedRevenueAbility = (ISharedRevenueAbility) C1555540qa8.LIZIZ(interfaceC665370Q7z, ISharedRevenueAbility.class, null);
            this.LLJLLIL = iSharedRevenueAbility;
            if (iSharedRevenueAbility != null && (multiGuestAnchorShareRevenueViewModelKn1 = iSharedRevenueAbility.Kn1()) != null) {
                MultiGuestAnchorShareRevenueViewModel.vQ2(multiGuestAnchorShareRevenueViewModelKn1, this, AFwS250S0000000_15.get$arr$(215));
            }
        }
        IGuidenceAbility iGuidenceAbility = this.LLJLIL;
        if (iGuidenceAbility != null && (viewModel3 = iGuidenceAbility.getViewModel()) != null) {
            MultiGuestGuidenceViewModel.vQ2(viewModel3, new C2217371BqR() { // from class: X.0aP3
                @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C933680aP8) obj).LL;
                }

                @Override // X.C2217371BqR, X.AbstractC2217331BqN
                public final void set(Object obj, Object obj2) {
                    ((C933680aP8) obj).LL = (C933460aOm) obj2;
                }
            }, this, new AwS594S0100000_15(this, 542));
        }
        IGuidenceAbility iGuidenceAbility2 = this.LLJLIL;
        if (iGuidenceAbility2 != null && (viewModel2 = iGuidenceAbility2.getViewModel()) != null) {
            MultiGuestGuidenceViewModel.vQ2(viewModel2, new C2217371BqR() { // from class: X.0aP4
                @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C933680aP8) obj).LLILLJJLI;
                }

                @Override // X.C2217371BqR, X.AbstractC2217331BqN
                public final void set(Object obj, Object obj2) {
                    ((C933680aP8) obj).LLILLJJLI = (C933690aP9) obj2;
                }
            }, this, new AwS594S0100000_15(this, 543));
        }
        IGuidenceAbility iGuidenceAbility3 = this.LLJLIL;
        if (iGuidenceAbility3 != null && (viewModel = iGuidenceAbility3.getViewModel()) != null) {
            MultiGuestGuidenceViewModel.vQ2(viewModel, new C2217381BqS() { // from class: X.0aOw
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C933680aP8) obj).LLILLL;
                }
            }, this, new AwS594S0100000_15(this, 544));
        }
        AbstractC922600a7G abstractC922600a7G = (AbstractC922600a7G) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
        if (abstractC922600a7G != null) {
            abstractC922600a7G.LJJIJIL(new InterfaceC922630a7J() { // from class: X.0a4w
                @Override // X.InterfaceC922630a7J
                public final void Ue(Throwable th) {
                }

                @Override // X.InterfaceC922630a7J
                public final void L2(InterfaceC921200a50<LinkPlayerInfo, MultiLiveGuestInfoList> interfaceC921200a50, int i) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<LinkPlayerInfo> it2 = interfaceC921200a50.LJIILL().iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next().mUser);
                    }
                    this.LL.zp(arrayList);
                }

                @Override // X.InterfaceC922630a7J
                public final void rn(InterfaceC921200a50<LinkListUser, LinkMessage> interfaceC921200a50, int i) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<LinkListUser> it2 = interfaceC921200a50.LJIILL().iterator();
                    while (it2.hasNext()) {
                        User user = it2.next().user;
                        if (user != null) {
                            arrayList.add(user);
                        }
                    }
                    this.LL.zp(arrayList);
                }
            });
        }
        LinkControlDataHolder linkControlDataHolder = this.linkControlDataHolder;
        if (linkControlDataHolder != null) {
            linkControlDataHolder.LIZ.add((InterfaceC927720aFW) this.LLJLLL.getValue());
        }
        DataChannel dataChannel2 = this.LLJJIJIIJIL;
        if (dataChannel2 != null) {
            dataChannel2.BQ2(this, MultiGuestAnchorSideShowGuidenceEvent.class, new AwS594S0100000_15(this, 545));
        }
        DataChannel dataChannel3 = this.LLJJIJIIJIL;
        if (dataChannel3 != null) {
            dataChannel3.BQ2(this, MultiGuestHideGuideLinkMicEvent.class, new AwS594S0100000_15(this, 540));
            dataChannel3.BQ2(this, LinkInRoomAnchorInviteGuestEvent.class, new AwS594S0100000_15(this, 541));
        }
    }

    public final void zp(List<? extends User> list) {
        MultiGuestGuidenceViewModel viewModel;
        C933680aP8 state;
        C933460aOm c933460aOm;
        User user;
        MultiGuestGuidenceViewModel viewModel2;
        IGuidenceAbility iGuidenceAbility;
        MultiGuestGuidenceViewModel viewModel3;
        C933680aP8 state2;
        C933460aOm c933460aOm2;
        IGuidenceAbility iGuidenceAbility2 = this.LLJLIL;
        if (iGuidenceAbility2 != null && (viewModel = iGuidenceAbility2.getViewModel()) != null && (state = viewModel.getState()) != null && (c933460aOm = state.LL) != null && (user = c933460aOm.LIZ) != null) {
            for (Object obj : (ArrayList) list) {
                if (((User) obj).getId() == user.getId()) {
                    if (obj != null) {
                        if (this.LLJLL && (iGuidenceAbility = this.LLJLIL) != null && (viewModel3 = iGuidenceAbility.getViewModel()) != null && (state2 = viewModel3.getState()) != null && (c933460aOm2 = state2.LL) != null && c933460aOm2.LIZ != null) {
                            this.LLJLL = false;
                            Ap(new C933610aP1(2));
                        }
                        IGuidenceAbility iGuidenceAbility3 = this.LLJLIL;
                        if (iGuidenceAbility3 != null && (viewModel2 = iGuidenceAbility3.getViewModel()) != null) {
                            viewModel2.wQ2(null);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final void Bp(int i, Long l) {
        Long lValueOf;
        MultiGuestGuidenceViewModel viewModel;
        IGuidenceAbility iGuidenceAbility;
        MultiGuestGuidenceViewModel viewModel2;
        C933680aP8 state;
        C933460aOm c933460aOm;
        MultiGuestGuidenceViewModel viewModel3;
        C933680aP8 state2;
        C933460aOm c933460aOm2;
        User user;
        if (l != null) {
            IGuidenceAbility iGuidenceAbility2 = this.LLJLIL;
            if (iGuidenceAbility2 != null && (viewModel3 = iGuidenceAbility2.getViewModel()) != null && (state2 = viewModel3.getState()) != null && (c933460aOm2 = state2.LL) != null && (user = c933460aOm2.LIZ) != null) {
                lValueOf = Long.valueOf(user.getId());
            } else {
                lValueOf = null;
            }
            if (Intrinsics.LJFF(lValueOf, l)) {
                if (this.LLJLL && (iGuidenceAbility = this.LLJLIL) != null && (viewModel2 = iGuidenceAbility.getViewModel()) != null && (state = viewModel2.getState()) != null && (c933460aOm = state.LL) != null && c933460aOm.LIZ != null) {
                    this.LLJLL = false;
                    Ap(new C933610aP1(i));
                }
                IGuidenceAbility iGuidenceAbility3 = this.LLJLIL;
                if (iGuidenceAbility3 != null && (viewModel = iGuidenceAbility3.getViewModel()) != null) {
                    viewModel.wQ2(null);
                }
            }
        }
    }

    public final void Ep(int i, boolean z) {
        MultiGuestGuidenceViewModel viewModel;
        C20441214yg.LIZIZ("live_guidence", "AnchorVoiceChatMaskAssem_hideInviteGuidence");
        this.LLJLL = false;
        IGuidenceAbility iGuidenceAbility = this.LLJLIL;
        if (iGuidenceAbility != null && (viewModel = iGuidenceAbility.getViewModel()) != null) {
            viewModel.xQ2(i, z);
        }
        for (C933770aPH c933770aPH : op().values()) {
            c933770aPH.LLILZIL = null;
            c933770aPH.LIZJ();
        }
    }
}
