package com.bytedance.android.live.rank.impl.setting;

import X.C0USP;
import X.C1119010fE3;
import X.C1119120fEE;
import X.C1119170fEJ;
import X.C1161920gLG;
import X.C20743716Ff;
import X.C2281441ERq;
import X.C2281451ERr;
import X.C475510Ikn;
import X.C497740JfY;
import X.C758170Tod;
import X.C786410Ut5;
import X.EnumC1118970fDz;
import X.InterfaceC1119160fEI;
import X.InterfaceC2281461ERs;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.rank.impl.setting.PreviewRankingSettingFragmentSheet;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdk.rank.api.RankingSwitchChannel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes18.dex */
public final class PreviewRankingSettingFragmentSheet extends LiveSheetFragment implements InterfaceC2281461ERs {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiOy49I2slJD8/ZjYpPTHELIOSs6JiJiGT02PiwpPh0yJi4lJygALTE4ICE0DjctLiI2JjEfISo2PA==";
    public ConstraintLayout LLJLLL;
    public C20743716Ff LLJZ;
    public ConstraintLayout LLJZIJLIL;
    public C20743716Ff LLL;
    public ConstraintLayout LLLF;
    public C20743716Ff LLLFF;
    public ConstraintLayout LLLFFI;
    public C20743716Ff LLLFZ;
    public ConstraintLayout LLLI;
    public C20743716Ff LLLII;

    @Override // X.InterfaceC2281461ERs
    public final void Qk() {
        View viewFindViewById = this.LLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.iln) : null;
            this.LLL = (C20743716Ff) viewFindViewById;
        }
        final C20743716Ff c20743716Ff = (C20743716Ff) viewFindViewById;
        final EnumC1118970fDz enumC1118970fDz = !c20743716Ff.isChecked() ? EnumC1118970fDz.RANK_SWITCH_STATUS_ON : EnumC1118970fDz.RANK_SWITCH_STATUS_OFF;
        ((IRankService) C1161920gLG.LIZJ(IRankService.class)).XI2().LJIIIIZZ(getContext(), 28L, enumC1118970fDz.getValue(), true, "live_take_page", "live_preview_page", new InterfaceC1119160fEI() { // from class: X.0fDt
            @Override // X.InterfaceC1119160fEI
            public final void onCancel() {
            }

            @Override // X.InterfaceC1119160fEI
            public final void LIZ() {
                C0USP c0usp;
                DataChannel dataChannelLJ = C475510Ikn.LJ(this.LIZ);
                if (dataChannelLJ != null && (c0usp = (C0USP) dataChannelLJ.gg0(RankingSwitchChannel.class)) != null) {
                    C20743716Ff c20743716Ff2 = c20743716Ff;
                    EnumC1118970fDz enumC1118970fDz2 = enumC1118970fDz;
                    PreviewRankingSettingFragmentSheet previewRankingSettingFragmentSheet = this.LIZ;
                    c20743716Ff2.toggle();
                    c0usp.LIZIZ = (int) enumC1118970fDz2.getValue();
                    DataChannel dataChannelLJ2 = C475510Ikn.LJ(previewRankingSettingFragmentSheet);
                    if (dataChannelLJ2 != null) {
                        dataChannelLJ2.zW(RankingSwitchChannel.class, c0usp);
                    }
                    C766270U4b.LIZLLL(enumC1118970fDz2 == EnumC1118970fDz.RANK_SWITCH_STATUS_ON ? 2131855571 : 2131855589);
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_rankings_setting_click");
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LJJII(DataChannelGlobal.LLILZ.gg0(C1148180fz6.class), "enter_from");
                c474500IjALIZ.LJJII(enumC1118970fDz == EnumC1118970fDz.RANK_SWITCH_STATUS_ON ? "open" : "close", "ranking_status");
                c474500IjALIZ.LJJII("anchor", "user_type");
                c474500IjALIZ.LJJII("friends_ranking", "rank_type");
                c474500IjALIZ.LJIILJJIL(C500260Jjc.LJJIJLIJ() ? "live_take_page" : "live_take_detail");
                c474500IjALIZ.LIZ();
            }

            @Override // X.InterfaceC1119160fEI
            public final void onFailed() {
                C766270U4b.LIZLLL(2131842705);
            }
        });
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131842815));
        ArrayList arrayList = new ArrayList();
        C758170Tod c758170TodVR = VR();
        if (c758170TodVR != null) {
            arrayList.add(c758170TodVR);
        }
        c1119170fEJ.LJ = arrayList;
        return c1119170fEJ;
    }

    public final C20743716Ff uS() {
        View viewFindViewById = this.LLLFZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.gfm) : null;
            this.LLLFZ = (C20743716Ff) viewFindViewById;
        }
        return (C20743716Ff) viewFindViewById;
    }

    public final C20743716Ff wS() {
        View viewFindViewById = this.LLLFF;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.irs) : null;
            this.LLLFF = (C20743716Ff) viewFindViewById;
        }
        return (C20743716Ff) viewFindViewById;
    }

    public final C20743716Ff yS() {
        View viewFindViewById = this.LLJZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.izv) : null;
            this.LLJZ = (C20743716Ff) viewFindViewById;
        }
        return (C20743716Ff) viewFindViewById;
    }

    public final C20743716Ff zS() {
        View viewFindViewById = this.LLLII;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.pjz) : null;
            this.LLLII = (C20743716Ff) viewFindViewById;
        }
        return (C20743716Ff) viewFindViewById;
    }

    @Override // X.InterfaceC2281461ERs
    public final void Ck() {
        final EnumC1118970fDz enumC1118970fDz = !yS().isChecked() ? EnumC1118970fDz.RANK_SWITCH_STATUS_ON : EnumC1118970fDz.RANK_SWITCH_STATUS_OFF;
        ((IRankService) C1161920gLG.LIZJ(IRankService.class)).XI2().LJIIIIZZ(getContext(), 5L, enumC1118970fDz.getValue(), true, "live_take_page", "live_preview_page", new InterfaceC1119160fEI() { // from class: X.0fDw
            @Override // X.InterfaceC1119160fEI
            public final void onCancel() {
            }

            @Override // X.InterfaceC1119160fEI
            public final void LIZ() {
                C0USP c0usp;
                DataChannel dataChannelLJ = C475510Ikn.LJ(this.LIZ);
                if (dataChannelLJ != null && (c0usp = (C0USP) dataChannelLJ.gg0(RankingSwitchChannel.class)) != null) {
                    PreviewRankingSettingFragmentSheet previewRankingSettingFragmentSheet = this.LIZ;
                    EnumC1118970fDz enumC1118970fDz2 = enumC1118970fDz;
                    previewRankingSettingFragmentSheet.yS().toggle();
                    c0usp.LIZ = (int) enumC1118970fDz2.getValue();
                    DataChannel dataChannelLJ2 = C475510Ikn.LJ(previewRankingSettingFragmentSheet);
                    if (dataChannelLJ2 != null) {
                        dataChannelLJ2.zW(RankingSwitchChannel.class, c0usp);
                    }
                    C2281441ERq.LIZ(previewRankingSettingFragmentSheet);
                    C766270U4b.LIZLLL(enumC1118970fDz2 == EnumC1118970fDz.RANK_SWITCH_STATUS_ON ? 2131855615 : 2131855614);
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_rankings_setting_click");
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LJJII(DataChannelGlobal.LLILZ.gg0(C1148180fz6.class), "enter_from");
                c474500IjALIZ.LJJII(enumC1118970fDz == EnumC1118970fDz.RANK_SWITCH_STATUS_ON ? "open" : "close", "ranking_status");
                c474500IjALIZ.LJJII("anchor", "user_type");
                c474500IjALIZ.LJJII("gift_ranking", "rank_type");
                c474500IjALIZ.LJIILJJIL(C500260Jjc.LJJIJLIJ() ? "live_take_page" : "live_take_detail");
                c474500IjALIZ.LIZ();
            }

            @Override // X.InterfaceC1119160fEI
            public final void onFailed() {
                C766270U4b.LIZLLL(2131842705);
            }
        });
    }

    @Override // X.InterfaceC2281461ERs
    public final void Nq() {
        final C0USP c0usp;
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ == null || (c0usp = (C0USP) dataChannelLJ.gg0(RankingSwitchChannel.class)) == null) {
            return;
        }
        final EnumC1118970fDz enumC1118970fDz = !wS().isChecked() ? EnumC1118970fDz.RANK_SWITCH_STATUS_ON : EnumC1118970fDz.RANK_SWITCH_STATUS_OFF;
        ((IRankService) C1161920gLG.LIZJ(IRankService.class)).XI2();
        C1119120fEE.LJFF(13L, enumC1118970fDz.getValue(), new InterfaceC1119160fEI() { // from class: X.0fDx
            @Override // X.InterfaceC1119160fEI
            public final void onCancel() {
            }

            @Override // X.InterfaceC1119160fEI
            public final void LIZ() {
                this.LIZ.wS().toggle();
                c0usp.LIZLLL = (int) enumC1118970fDz.getValue();
                DataChannel dataChannelLJ2 = C475510Ikn.LJ(this.LIZ);
                if (dataChannelLJ2 != null) {
                    dataChannelLJ2.zW(RankingSwitchChannel.class, c0usp);
                }
                PreviewRankingSettingFragmentSheet previewRankingSettingFragmentSheet = this.LIZ;
                previewRankingSettingFragmentSheet.getClass();
                C2281441ERq.LIZ(previewRankingSettingFragmentSheet);
                C766270U4b.LIZLLL(enumC1118970fDz == EnumC1118970fDz.RANK_SWITCH_STATUS_ON ? 2131855615 : 2131855614);
            }

            @Override // X.InterfaceC1119160fEI
            public final void onFailed() {
                C766270U4b.LIZLLL(2131842705);
            }
        });
    }

    @Override // X.InterfaceC2281461ERs
    public final EnumC1118970fDz Uy() {
        C0USP c0usp;
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        long value = (dataChannelLJ == null || (c0usp = (C0USP) dataChannelLJ.gg0(RankingSwitchChannel.class)) == null) ? EnumC1118970fDz.RANK_SWITCH_STATUS_HIDE.getValue() : c0usp.LIZLLL;
        EnumC1118970fDz.Companion.getClass();
        return C1119010fE3.LIZ(value);
    }

    @Override // X.InterfaceC2281461ERs
    public final void ZQ() {
        final C0USP c0usp;
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ == null || (c0usp = (C0USP) dataChannelLJ.gg0(RankingSwitchChannel.class)) == null) {
            return;
        }
        final EnumC1118970fDz enumC1118970fDz = !zS().isChecked() ? EnumC1118970fDz.RANK_SWITCH_STATUS_ON : EnumC1118970fDz.RANK_SWITCH_STATUS_OFF;
        ((IRankService) C1161920gLG.LIZJ(IRankService.class)).XI2();
        C1119120fEE.LJFF(14L, enumC1118970fDz.getValue(), new InterfaceC1119160fEI() { // from class: X.0fDu
            @Override // X.InterfaceC1119160fEI
            public final void onCancel() {
            }

            @Override // X.InterfaceC1119160fEI
            public final void LIZ() {
                this.LIZ.zS().toggle();
                c0usp.LJ = (int) enumC1118970fDz.getValue();
                DataChannel dataChannelLJ2 = C475510Ikn.LJ(this.LIZ);
                if (dataChannelLJ2 != null) {
                    dataChannelLJ2.zW(RankingSwitchChannel.class, c0usp);
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
    public final EnumC1118970fDz ka() {
        C0USP c0usp;
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        long value = (dataChannelLJ == null || (c0usp = (C0USP) dataChannelLJ.gg0(RankingSwitchChannel.class)) == null) ? EnumC1118970fDz.RANK_SWITCH_STATUS_HIDE.getValue() : c0usp.LIZ;
        EnumC1118970fDz.Companion.getClass();
        return C1119010fE3.LIZ(value);
    }

    @Override // X.InterfaceC2281461ERs
    public final EnumC1118970fDz lf() {
        C0USP c0usp;
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        long value = (dataChannelLJ == null || (c0usp = (C0USP) dataChannelLJ.gg0(RankingSwitchChannel.class)) == null) ? EnumC1118970fDz.RANK_SWITCH_STATUS_HIDE.getValue() : c0usp.LJ;
        EnumC1118970fDz.Companion.getClass();
        return C1119010fE3.LIZ(value);
    }

    @Override // X.InterfaceC2281461ERs
    public final void mw() {
        final EnumC1118970fDz enumC1118970fDz = !uS().isChecked() ? EnumC1118970fDz.RANK_SWITCH_STATUS_ON : EnumC1118970fDz.RANK_SWITCH_STATUS_OFF;
        ((IRankService) C1161920gLG.LIZJ(IRankService.class)).XI2();
        C1119120fEE.LJFF(10L, enumC1118970fDz.getValue(), new InterfaceC1119160fEI() { // from class: X.0fDy
            @Override // X.InterfaceC1119160fEI
            public final void onCancel() {
            }

            @Override // X.InterfaceC1119160fEI
            public final void LIZ() {
                C0USP c0usp;
                DataChannel dataChannelLJ = C475510Ikn.LJ(this.LIZ);
                if (dataChannelLJ == null || (c0usp = (C0USP) dataChannelLJ.gg0(RankingSwitchChannel.class)) == null) {
                    return;
                }
                PreviewRankingSettingFragmentSheet previewRankingSettingFragmentSheet = this.LIZ;
                EnumC1118970fDz enumC1118970fDz2 = enumC1118970fDz;
                C1810690xDf c1810690xDf = C1810690xDf.LIZ;
                DataChannel dataChannelLJ2 = C475510Ikn.LJ(previewRankingSettingFragmentSheet);
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                String str = (String) dataChannelGlobal.gg0(C1148180fz6.class);
                EnumC1118970fDz enumC1118970fDz3 = EnumC1118970fDz.RANK_SWITCH_STATUS_ON;
                String str2 = enumC1118970fDz2 == enumC1118970fDz3 ? "open" : "close";
                c1810690xDf.getClass();
                C1810690xDf.LJIILIIL(dataChannelLJ2, "before_live", str, str2);
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_sale_rankings_setting_click");
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LJJII(dataChannelGlobal.gg0(C1148180fz6.class), "enter_from");
                c474500IjALIZ.LJJII(enumC1118970fDz2 != enumC1118970fDz3 ? "close" : "open", FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                c474500IjALIZ.LJJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()), "author_id");
                c474500IjALIZ.LIZ();
                previewRankingSettingFragmentSheet.uS().toggle();
                c0usp.LIZJ = (int) enumC1118970fDz2.getValue();
                DataChannel dataChannelLJ3 = C475510Ikn.LJ(previewRankingSettingFragmentSheet);
                if (dataChannelLJ3 != null) {
                    dataChannelLJ3.zW(RankingSwitchChannel.class, c0usp);
                }
                C766270U4b.LIZLLL(enumC1118970fDz2 == enumC1118970fDz3 ? 2131855615 : 2131855614);
            }

            @Override // X.InterfaceC1119160fEI
            public final void onFailed() {
                C766270U4b.LIZLLL(2131842705);
            }
        });
    }

    @Override // X.InterfaceC2281461ERs
    public final EnumC1118970fDz nB() {
        C0USP c0usp;
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        long value = (dataChannelLJ == null || (c0usp = (C0USP) dataChannelLJ.gg0(RankingSwitchChannel.class)) == null) ? EnumC1118970fDz.RANK_SWITCH_STATUS_HIDE.getValue() : c0usp.LIZJ;
        EnumC1118970fDz.Companion.getClass();
        return C1119010fE3.LIZ(value);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJLLL = null;
        this.LLJZ = null;
        this.LLJZIJLIL = null;
        this.LLL = null;
        this.LLLF = null;
        this.LLLFF = null;
        this.LLLFFI = null;
        this.LLLFZ = null;
        this.LLLI = null;
        this.LLLII = null;
    }

    @Override // X.InterfaceC2281461ERs
    public final EnumC1118970fDz tm() {
        C0USP c0usp;
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        long value = (dataChannelLJ == null || (c0usp = (C0USP) dataChannelLJ.gg0(RankingSwitchChannel.class)) == null) ? EnumC1118970fDz.RANK_SWITCH_STATUS_HIDE.getValue() : c0usp.LIZIZ;
        EnumC1118970fDz.Companion.getClass();
        return C1119010fE3.LIZ(value);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(2, null);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = this.LLJLLL;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.izw);
            } else {
                viewFindViewById = null;
            }
            this.LLJLLL = (ConstraintLayout) viewFindViewById;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById;
        C20743716Ff c20743716FfYS = yS();
        View viewFindViewById3 = this.LLJZIJLIL;
        if (viewFindViewById3 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById3 = view3.findViewById(R.id.ilo);
            } else {
                viewFindViewById3 = null;
            }
            this.LLJZIJLIL = (ConstraintLayout) viewFindViewById3;
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) viewFindViewById3;
        View viewFindViewById4 = this.LLL;
        if (viewFindViewById4 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById4 = view4.findViewById(R.id.iln);
            } else {
                viewFindViewById4 = null;
            }
            this.LLL = (C20743716Ff) viewFindViewById4;
        }
        C20743716Ff c20743716Ff = (C20743716Ff) viewFindViewById4;
        View viewFindViewById5 = this.LLLF;
        if (viewFindViewById5 == null) {
            View view5 = getView();
            if (view5 != null) {
                viewFindViewById5 = view5.findViewById(R.id.irt);
            } else {
                viewFindViewById5 = null;
            }
            this.LLLF = (ConstraintLayout) viewFindViewById5;
        }
        ConstraintLayout constraintLayout3 = (ConstraintLayout) viewFindViewById5;
        C20743716Ff c20743716FfWS = wS();
        View viewFindViewById6 = this.LLLFFI;
        if (viewFindViewById6 == null) {
            View view6 = getView();
            if (view6 != null) {
                viewFindViewById6 = view6.findViewById(R.id.gfn);
            } else {
                viewFindViewById6 = null;
            }
            this.LLLFFI = (ConstraintLayout) viewFindViewById6;
        }
        ConstraintLayout constraintLayout4 = (ConstraintLayout) viewFindViewById6;
        C20743716Ff c20743716FfUS = uS();
        View view7 = this.LLLI;
        if (view7 == null) {
            View view8 = getView();
            if (view8 != null) {
                viewFindViewById2 = view8.findViewById(R.id.pk0);
            }
            this.LLLI = (ConstraintLayout) viewFindViewById2;
            view7 = viewFindViewById2;
        }
        C2281441ERq.LIZIZ(this, new C2281451ERr(constraintLayout, c20743716FfYS, constraintLayout2, c20743716Ff, constraintLayout3, c20743716FfWS, constraintLayout4, c20743716FfUS, (ConstraintLayout) view7, zS()));
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.g_w, viewGroup, false);
    }
}
