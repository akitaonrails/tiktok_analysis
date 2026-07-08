package com.bytedance.android.live.rank.impl.setting;

import X.AbstractViewOnClickListenerC1105820esm;
import X.C01GW;
import X.C098200Yq;
import X.C1119010fE3;
import X.C1119120fEE;
import X.C1161920gLG;
import X.C1685300txQ;
import X.C16FV;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20743716Ff;
import X.C2281441ERq;
import X.C2281451ERr;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC1118970fDz;
import X.InterfaceC1119160fEI;
import X.InterfaceC2281461ERs;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.rank.impl.setting.AnchorRankingSettingFragment;
import com.bytedance.android.livesdk.dataChannel.BroadcastDialogPageChannel;
import com.bytedance.android.livesdk.dataChannel.DeleteStickerChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes18.dex */
public final class AnchorRankingSettingFragment extends BaseFragment implements InterfaceC2281461ERs {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiOy49I2slJD8/ZjHELIOSYpPTs6JiJiCCEwICo+Gy49IywiLhw2PDElJygVOiQrJCo9PA==";
    public C16FV LL;
    public ConstraintLayout LLILLJJLI;
    public C20743716Ff LLILLL;
    public ConstraintLayout LLILZ;
    public C20743716Ff LLILZIL;
    public ConstraintLayout LLILZLL;
    public C20743716Ff LLIZ;
    public ConstraintLayout LLIZLLLIL;
    public C20743716Ff LLJ;
    public ConstraintLayout LLJI;
    public C20743716Ff LLJIJIL;
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 78));

    public final C20743716Ff NR() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.gfm) : null;
            this.LLJ = (C20743716Ff) viewFindViewById;
        }
        return (C20743716Ff) viewFindViewById;
    }

    public final C20743716Ff OR() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.irs) : null;
            this.LLIZ = (C20743716Ff) viewFindViewById;
        }
        return (C20743716Ff) viewFindViewById;
    }

    public final C20743716Ff PR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.izv) : null;
            this.LLILLL = (C20743716Ff) viewFindViewById;
        }
        return (C20743716Ff) viewFindViewById;
    }

    @Override // X.InterfaceC2281461ERs
    public final void Qk() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.iln) : null;
            this.LLILZIL = (C20743716Ff) viewFindViewById;
        }
        final C20743716Ff c20743716Ff = (C20743716Ff) viewFindViewById;
        final EnumC1118970fDz enumC1118970fDz = !c20743716Ff.isChecked() ? EnumC1118970fDz.RANK_SWITCH_STATUS_ON : EnumC1118970fDz.RANK_SWITCH_STATUS_OFF;
        ((IRankService) C1161920gLG.LIZJ(IRankService.class)).XI2().LJIIIIZZ(getContext(), 28L, enumC1118970fDz.getValue(), true, "live_page", "live_settings_page", new InterfaceC1119160fEI() { // from class: X.0fDs
            @Override // X.InterfaceC1119160fEI
            public final void onCancel() {
            }

            @Override // X.InterfaceC1119160fEI
            public final void LIZ() {
                RoomAuthStatus roomAuthStatus;
                c20743716Ff.toggle();
                Room roomSR = this.SR();
                if (roomSR != null && (roomAuthStatus = roomSR.getRoomAuthStatus()) != null) {
                    roomAuthStatus.friendrankswitch = (int) enumC1118970fDz.getValue();
                }
                EnumC1118970fDz enumC1118970fDz2 = enumC1118970fDz;
                EnumC1118970fDz enumC1118970fDz3 = EnumC1118970fDz.RANK_SWITCH_STATUS_ON;
                C766270U4b.LIZLLL(enumC1118970fDz2 == enumC1118970fDz3 ? 2131855571 : 2131855589);
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_rankings_setting_click");
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LJJII(DataChannelGlobal.LLILZ.gg0(C1148180fz6.class), "enter_from");
                c474500IjALIZ.LJJII(enumC1118970fDz == enumC1118970fDz3 ? "open" : "close", "ranking_status");
                c474500IjALIZ.LJJII("anchor", "user_type");
                c474500IjALIZ.LJJII("friends_ranking", "rank_type");
                c474500IjALIZ.LJIILJJIL(C500260Jjc.LJJIJLIJ() ? "live_take_page" : "live_take_detail");
                c474500IjALIZ.LIZ();
                EnumC1811400xEo.FRIEND_RANKING.getType();
                enumC1118970fDz.getValue();
                Map<String, Object> map = C1338270kvh.LIZ;
            }

            @Override // X.InterfaceC1119160fEI
            public final void onFailed() {
                C766270U4b.LIZLLL(2131842705);
            }
        });
    }

    public final C20743716Ff RR() {
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.pjz) : null;
            this.LLJIJIL = (C20743716Ff) viewFindViewById;
        }
        return (C20743716Ff) viewFindViewById;
    }

    public final Room SR() {
        return (Room) this.LLJILJIL.getValue();
    }

    @Override // X.InterfaceC2281461ERs
    public final EnumC1118970fDz Uy() {
        RoomAuthStatus roomAuthStatus;
        C1119010fE3 c1119010fE3 = EnumC1118970fDz.Companion;
        Room roomSR = SR();
        long j = (roomSR == null || (roomAuthStatus = roomSR.mRoomAuthStatus) == null) ? 0L : roomAuthStatus.gamerankingswitch;
        c1119010fE3.getClass();
        return C1119010fE3.LIZ(j);
    }

    @Override // X.InterfaceC2281461ERs
    public final EnumC1118970fDz ka() {
        RoomAuthStatus roomAuthStatus;
        C1119010fE3 c1119010fE3 = EnumC1118970fDz.Companion;
        Room roomSR = SR();
        long giftRankSwitchStatus = (roomSR == null || (roomAuthStatus = roomSR.mRoomAuthStatus) == null) ? 0L : roomAuthStatus.getGiftRankSwitchStatus();
        c1119010fE3.getClass();
        return C1119010fE3.LIZ(giftRankSwitchStatus);
    }

    @Override // X.InterfaceC2281461ERs
    public final EnumC1118970fDz lf() {
        RoomAuthStatus roomAuthStatus;
        C1119010fE3 c1119010fE3 = EnumC1118970fDz.Companion;
        Room roomSR = SR();
        long j = (roomSR == null || (roomAuthStatus = roomSR.mRoomAuthStatus) == null) ? 0L : roomAuthStatus.rankingchangealterswitch;
        c1119010fE3.getClass();
        return C1119010fE3.LIZ(j);
    }

    @Override // X.InterfaceC2281461ERs
    public final EnumC1118970fDz nB() {
        RoomAuthStatus roomAuthStatus;
        C1119010fE3 c1119010fE3 = EnumC1118970fDz.Companion;
        Room roomSR = SR();
        long j = (roomSR == null || (roomAuthStatus = roomSR.mRoomAuthStatus) == null) ? 0L : roomAuthStatus.ecRankSwitchStatus;
        c1119010fE3.getClass();
        return C1119010fE3.LIZ(j);
    }

    @Override // X.InterfaceC2281461ERs
    public final EnumC1118970fDz tm() {
        RoomAuthStatus roomAuthStatus;
        C1119010fE3 c1119010fE3 = EnumC1118970fDz.Companion;
        Room roomSR = SR();
        long j = (roomSR == null || (roomAuthStatus = roomSR.mRoomAuthStatus) == null) ? 0L : roomAuthStatus.friendrankswitch;
        c1119010fE3.getClass();
        return C1119010fE3.LIZ(j);
    }

    @Override // X.InterfaceC2281461ERs
    public final void Ck() {
        final EnumC1118970fDz enumC1118970fDz = !PR().isChecked() ? EnumC1118970fDz.RANK_SWITCH_STATUS_ON : EnumC1118970fDz.RANK_SWITCH_STATUS_OFF;
        ((IRankService) C1161920gLG.LIZJ(IRankService.class)).XI2().LJIIIIZZ(getContext(), 5L, enumC1118970fDz.getValue(), true, "live_page", "live_settings_page", new InterfaceC1119160fEI() { // from class: X.0fE2
            @Override // X.InterfaceC1119160fEI
            public final void onCancel() {
            }

            @Override // X.InterfaceC1119160fEI
            public final void LIZ() {
                DataChannel dataChannelLJ;
                RoomAuthStatus roomAuthStatus;
                this.LIZ.PR().toggle();
                Room roomSR = this.LIZ.SR();
                if (roomSR != null && (roomAuthStatus = roomSR.getRoomAuthStatus()) != null) {
                    roomAuthStatus.setGiftRankSwitchStatus((int) enumC1118970fDz.getValue());
                }
                EnumC1118970fDz enumC1118970fDz2 = enumC1118970fDz;
                EnumC1118970fDz enumC1118970fDz3 = EnumC1118970fDz.RANK_SWITCH_STATUS_ON;
                C766270U4b.LIZLLL(enumC1118970fDz2 == enumC1118970fDz3 ? 2131855615 : 2131855614);
                AnchorRankingSettingFragment anchorRankingSettingFragment = this.LIZ;
                anchorRankingSettingFragment.getClass();
                C2281441ERq.LIZ(anchorRankingSettingFragment);
                if (enumC1118970fDz == EnumC1118970fDz.RANK_SWITCH_STATUS_OFF && (dataChannelLJ = C475510Ikn.LJ(this.LIZ)) != null && C500260Jjc.LJIIZILJ(dataChannelLJ)) {
                    InterfaceC1846850y9z interfaceC1846850y9z = (InterfaceC1846850y9z) dataChannelLJ.gg0(C1119080fEA.class);
                    if (interfaceC1846850y9z != null && interfaceC1846850y9z.LJIIIZ()) {
                        C1119410fEh.LIZ = "";
                        dataChannelLJ.zW(DeleteStickerChannel.class, 8);
                    }
                    InterfaceC1846850y9z interfaceC1846850y9z2 = (InterfaceC1846850y9z) dataChannelLJ.gg0(C1119110fED.class);
                    if (interfaceC1846850y9z2 != null && interfaceC1846850y9z2.LJIIIZ()) {
                        C1119410fEh.LIZJ = "";
                        dataChannelLJ.zW(DeleteStickerChannel.class, 9);
                    }
                    InterfaceC1846850y9z interfaceC1846850y9z3 = (InterfaceC1846850y9z) dataChannelLJ.gg0(C1119100fEC.class);
                    if (interfaceC1846850y9z3 != null && interfaceC1846850y9z3.LJIIIZ()) {
                        C1119410fEh.LIZLLL = "";
                        dataChannelLJ.zW(DeleteStickerChannel.class, 10);
                    }
                    InterfaceC1846850y9z interfaceC1846850y9z4 = (InterfaceC1846850y9z) dataChannelLJ.gg0(C1119070fE9.class);
                    if (interfaceC1846850y9z4 != null && interfaceC1846850y9z4.LJIIIZ()) {
                        C1119410fEh.LJ = "";
                        dataChannelLJ.zW(DeleteStickerChannel.class, 11);
                    }
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_rankings_setting_click");
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LJJII(DataChannelGlobal.LLILZ.gg0(C1148180fz6.class), "enter_from");
                c474500IjALIZ.LJJII(enumC1118970fDz == enumC1118970fDz3 ? "open" : "close", "ranking_status");
                c474500IjALIZ.LJJII("anchor", "user_type");
                c474500IjALIZ.LJJII("gift_ranking", "rank_type");
                c474500IjALIZ.LJIILJJIL(C500260Jjc.LJJIJLIJ() ? "live_take_page" : "live_take_detail");
                c474500IjALIZ.LIZ();
                this.LIZ.PR();
                EnumC1811400xEo.GIFT_RANK.getType();
                enumC1118970fDz.getValue();
                Map<String, Object> map = C1338270kvh.LIZ;
            }

            @Override // X.InterfaceC1119160fEI
            public final void onFailed() {
                C766270U4b.LIZLLL(2131842705);
            }
        });
    }

    @Override // X.InterfaceC2281461ERs
    public final void Nq() {
        final EnumC1118970fDz enumC1118970fDz = !OR().isChecked() ? EnumC1118970fDz.RANK_SWITCH_STATUS_ON : EnumC1118970fDz.RANK_SWITCH_STATUS_OFF;
        ((IRankService) C1161920gLG.LIZJ(IRankService.class)).XI2();
        C1119120fEE.LJFF(13L, enumC1118970fDz.getValue(), new InterfaceC1119160fEI() { // from class: X.0fE1
            @Override // X.InterfaceC1119160fEI
            public final void onCancel() {
            }

            @Override // X.InterfaceC1119160fEI
            public final void LIZ() {
                DataChannel dataChannelLJ;
                InterfaceC1846850y9z interfaceC1846850y9z;
                RoomAuthStatus roomAuthStatus;
                this.LIZ.OR().toggle();
                Room roomSR = this.LIZ.SR();
                if (roomSR != null && (roomAuthStatus = roomSR.getRoomAuthStatus()) != null) {
                    roomAuthStatus.gamerankingswitch = (int) enumC1118970fDz.getValue();
                }
                EnumC1118970fDz enumC1118970fDz2 = enumC1118970fDz;
                EnumC1118970fDz enumC1118970fDz3 = EnumC1118970fDz.RANK_SWITCH_STATUS_ON;
                C766270U4b.LIZLLL(enumC1118970fDz2 == enumC1118970fDz3 ? 2131855615 : 2131855614);
                AnchorRankingSettingFragment anchorRankingSettingFragment = this.LIZ;
                anchorRankingSettingFragment.getClass();
                C2281441ERq.LIZ(anchorRankingSettingFragment);
                if (enumC1118970fDz == EnumC1118970fDz.RANK_SWITCH_STATUS_OFF && (dataChannelLJ = C475510Ikn.LJ(this.LIZ)) != null && C500260Jjc.LJIIZILJ(dataChannelLJ) && (interfaceC1846850y9z = (InterfaceC1846850y9z) dataChannelLJ.gg0(C1119090fEB.class)) != null && interfaceC1846850y9z.LJIIIZ()) {
                    C1119410fEh.LIZIZ = "";
                    dataChannelLJ.zW(DeleteStickerChannel.class, 12);
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_rankings_setting_click");
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LJJII(DataChannelGlobal.LLILZ.gg0(C1148180fz6.class), "enter_from");
                c474500IjALIZ.LJJII(enumC1118970fDz == enumC1118970fDz3 ? "open" : "close", "ranking_status");
                c474500IjALIZ.LJJII("anchor", "user_type");
                c474500IjALIZ.LJJII("game_ranking", "rank_type");
                c474500IjALIZ.LJIILJJIL(C500260Jjc.LJJIJLIJ() ? "live_take_page" : "live_take_detail");
                c474500IjALIZ.LIZ();
                this.LIZ.OR();
                EnumC1811400xEo.GAME_RANK.getType();
                enumC1118970fDz.getValue();
                Map<String, Object> map = C1338270kvh.LIZ;
            }

            @Override // X.InterfaceC1119160fEI
            public final void onFailed() {
                C766270U4b.LIZLLL(2131842705);
            }
        });
    }

    @Override // X.InterfaceC2281461ERs
    public final void ZQ() {
        final EnumC1118970fDz enumC1118970fDz = !RR().isChecked() ? EnumC1118970fDz.RANK_SWITCH_STATUS_ON : EnumC1118970fDz.RANK_SWITCH_STATUS_OFF;
        ((IRankService) C1161920gLG.LIZJ(IRankService.class)).XI2();
        C1119120fEE.LJFF(14L, enumC1118970fDz.getValue(), new InterfaceC1119160fEI() { // from class: X.0fDv
            @Override // X.InterfaceC1119160fEI
            public final void onCancel() {
            }

            @Override // X.InterfaceC1119160fEI
            public final void LIZ() {
                RoomAuthStatus roomAuthStatus;
                this.LIZ.RR().toggle();
                Room roomSR = this.LIZ.SR();
                if (roomSR != null && (roomAuthStatus = roomSR.mRoomAuthStatus) != null) {
                    roomAuthStatus.rankingchangealterswitch = (int) enumC1118970fDz.getValue();
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_ranking_changes_alert_click");
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LJJII(enumC1118970fDz == EnumC1118970fDz.RANK_SWITCH_STATUS_ON ? "open" : "close", "ranking_status");
                c474500IjALIZ.LJJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
                c474500IjALIZ.LIZ();
            }

            @Override // X.InterfaceC1119160fEI
            public final void onFailed() {
                C766270U4b.LIZLLL(2131842705);
            }
        });
    }

    @Override // X.InterfaceC2281461ERs
    public final void mw() {
        final EnumC1118970fDz enumC1118970fDz = !NR().isChecked() ? EnumC1118970fDz.RANK_SWITCH_STATUS_ON : EnumC1118970fDz.RANK_SWITCH_STATUS_OFF;
        ((IRankService) C1161920gLG.LIZJ(IRankService.class)).XI2();
        C1119120fEE.LJFF(10L, enumC1118970fDz.getValue(), new InterfaceC1119160fEI() { // from class: X.0fE0
            @Override // X.InterfaceC1119160fEI
            public final void onCancel() {
            }

            @Override // X.InterfaceC1119160fEI
            public final void LIZ() {
                Room room;
                RoomAuthStatus roomAuthStatus;
                this.LIZ.NR().toggle();
                Room roomSR = this.LIZ.SR();
                if (roomSR != null && (roomAuthStatus = roomSR.getRoomAuthStatus()) != null) {
                    roomAuthStatus.ecRankSwitchStatus = (int) enumC1118970fDz.getValue();
                }
                EnumC1118970fDz enumC1118970fDz2 = enumC1118970fDz;
                EnumC1118970fDz enumC1118970fDz3 = EnumC1118970fDz.RANK_SWITCH_STATUS_ON;
                C766270U4b.LIZLLL(enumC1118970fDz2 == enumC1118970fDz3 ? 2131855615 : 2131855614);
                C1810690xDf c1810690xDf = C1810690xDf.LIZ;
                DataChannel dataChannelLJ = C475510Ikn.LJ(this.LIZ);
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                String str = (String) dataChannelGlobal.gg0(C1148180fz6.class);
                String str2 = enumC1118970fDz == enumC1118970fDz3 ? "open" : "close";
                c1810690xDf.getClass();
                C1810690xDf.LJIILIIL(dataChannelLJ, "during_live", str, str2);
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_sale_rankings_setting_click");
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LJJII(dataChannelGlobal.gg0(C1148180fz6.class), "enter_from");
                c474500IjALIZ.LJJII(enumC1118970fDz != enumC1118970fDz3 ? "close" : "open", FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                DataChannel dataChannelLJ2 = C475510Ikn.LJ(this.LIZ);
                c474500IjALIZ.LJJII((dataChannelLJ2 == null || (room = (Room) dataChannelLJ2.gg0(RoomChannel.class)) == null) ? null : Long.valueOf(room.getOwnerUserId()), "author_id");
                c474500IjALIZ.LIZ();
                this.LIZ.NR();
                EnumC1811400xEo.E_COMMERCE.getType();
                enumC1118970fDz.getValue();
                Map<String, Object> map = C1338270kvh.LIZ;
            }

            @Override // X.InterfaceC1119160fEI
            public final void onFailed() {
                C766270U4b.LIZLLL(2131842705);
            }
        });
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("no_back");
        } else {
            z = false;
        }
        View viewFindViewById = null;
        if (!z) {
            View viewFindViewById2 = this.LL;
            if (viewFindViewById2 == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById2 = view2.findViewById(R.id.bmy);
                } else {
                    viewFindViewById2 = null;
                }
                this.LL = (C16FV) viewFindViewById2;
            }
            C786410Ut5.m8((C16FV) viewFindViewById2, new AbstractViewOnClickListenerC1105820esm() { // from class: X.0UHt
                @Override // X.AbstractViewOnClickListenerC1105820esm
                public final void LIZ() {
                    DataChannel dataChannelLJ = C475510Ikn.LJ(this.LLILZIL);
                    if (dataChannelLJ != null) {
                        EnumC748580TYa enumC748580TYa = EnumC748580TYa.GUIDE;
                        enumC748580TYa.pre();
                        dataChannelLJ.zW(BroadcastDialogPageChannel.class, enumC748580TYa);
                    }
                }

                {
                    super(1200L);
                }
            });
        } else {
            View viewFindViewById3 = this.LL;
            if (viewFindViewById3 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById3 = view3.findViewById(R.id.bmy);
                } else {
                    viewFindViewById3 = null;
                }
                this.LL = (C16FV) viewFindViewById3;
            }
            C786410Ut5.LLJJJJJIL((C16FV) viewFindViewById3, 8);
        }
        View viewFindViewById4 = this.LLILLJJLI;
        if (viewFindViewById4 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById4 = view4.findViewById(R.id.izw);
            } else {
                viewFindViewById4 = null;
            }
            this.LLILLJJLI = (ConstraintLayout) viewFindViewById4;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById4;
        C20743716Ff c20743716FfPR = PR();
        View viewFindViewById5 = this.LLILZ;
        if (viewFindViewById5 == null) {
            View view5 = getView();
            if (view5 != null) {
                viewFindViewById5 = view5.findViewById(R.id.ilo);
            } else {
                viewFindViewById5 = null;
            }
            this.LLILZ = (ConstraintLayout) viewFindViewById5;
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) viewFindViewById5;
        View viewFindViewById6 = this.LLILZIL;
        if (viewFindViewById6 == null) {
            View view6 = getView();
            if (view6 != null) {
                viewFindViewById6 = view6.findViewById(R.id.iln);
            } else {
                viewFindViewById6 = null;
            }
            this.LLILZIL = (C20743716Ff) viewFindViewById6;
        }
        C20743716Ff c20743716Ff = (C20743716Ff) viewFindViewById6;
        View viewFindViewById7 = this.LLILZLL;
        if (viewFindViewById7 == null) {
            View view7 = getView();
            if (view7 != null) {
                viewFindViewById7 = view7.findViewById(R.id.irt);
            } else {
                viewFindViewById7 = null;
            }
            this.LLILZLL = (ConstraintLayout) viewFindViewById7;
        }
        ConstraintLayout constraintLayout3 = (ConstraintLayout) viewFindViewById7;
        C20743716Ff c20743716FfOR = OR();
        View viewFindViewById8 = this.LLIZLLLIL;
        if (viewFindViewById8 == null) {
            View view8 = getView();
            if (view8 != null) {
                viewFindViewById8 = view8.findViewById(R.id.gfn);
            } else {
                viewFindViewById8 = null;
            }
            this.LLIZLLLIL = (ConstraintLayout) viewFindViewById8;
        }
        ConstraintLayout constraintLayout4 = (ConstraintLayout) viewFindViewById8;
        C20743716Ff c20743716FfNR = NR();
        View view9 = this.LLJI;
        if (view9 == null) {
            View view10 = getView();
            if (view10 != null) {
                viewFindViewById = view10.findViewById(R.id.pk0);
            }
            this.LLJI = (ConstraintLayout) viewFindViewById;
            view9 = viewFindViewById;
        }
        C2281441ERq.LIZIZ(this, new C2281451ERr(constraintLayout, c20743716FfPR, constraintLayout2, c20743716Ff, constraintLayout3, c20743716FfOR, constraintLayout4, c20743716FfNR, (ConstraintLayout) view9, RR()));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.g_v, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
