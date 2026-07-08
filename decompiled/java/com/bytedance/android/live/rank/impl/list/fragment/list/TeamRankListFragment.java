package com.bytedance.android.live.rank.impl.list.fragment.list;

import X.AbstractViewOnClickListenerC1105820esm;
import X.C0JT6;
import X.C1324720kZq;
import X.C16F5;
import X.C16FS;
import X.C1810690xDf;
import X.C19ME;
import X.C20736316Cj;
import X.C475510Ikn;
import X.C497740JfY;
import X.C748880TZe;
import X.C750320Tby;
import X.C786410Ut5;
import X.InterfaceC1094280eaA;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.SendGiftEvent;
import com.bytedance.android.live.rank.impl.list.controller.RankListController;
import com.bytedance.android.live.rank.impl.list.fragment.list.TeamRankListFragment;
import com.bytedance.android.live.rank.impl.list.view.PopularityRankingEducationDialog;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankListViewModel;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankRootViewModel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.fansclub.LiveReverseFanClubSetting;
import com.bytedance.android.livesdk.livesetting.rank.LivePopularityRankingBonusTimeConfig;
import com.bytedance.android.livesdk.livesetting.rank.LivePopularityRankingBottomBarLayoutSetting;
import com.bytedance.android.livesdk.livesetting.rank.LivePopularityRankingNewUISetting;
import com.bytedance.android.livesdk.livesetting.rank.LivePopularityRankingPerceptionImprovementSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.rank.impl.CloseRankDialogEvent;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class TeamRankListFragment extends RankListFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiOy49I2slJD8/ZiklHELIOSOjt9LjctLiI2JjFiJSYgPGsYLC4+GiQiIgM6OzEKOy40JSAiPQ==";
    public boolean LLLILZJ;
    public String LLLILZLLLI = "";

    @Override // com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment
    public final void OR(C16FS c16fs, final RankListV2Response.BottomBarButton bottomBarButton) {
        DataChannel dataChannelLJ;
        boolean z;
        RankListV2Response.RankView rankView;
        RankListViewModel rankListViewModelLJIIIZ;
        RankListViewModel rankListViewModelLJIIIZ2;
        RankListV2Response.RankView rankView2;
        RankListV2Response.RankInfo rankInfo;
        C786410Ut5.LLJJJ(c16fs, 0);
        DataChannel dataChannelLJ2 = C475510Ikn.LJ(this);
        if (dataChannelLJ2 != null && Intrinsics.LJFF(dataChannelLJ2.gg0(C750320Tby.class), Boolean.FALSE) && Intrinsics.LJFF(bottomBarButton.buttonType, "join")) {
            C786410Ut5.LLJJJ(c16fs, 8);
        } else {
            DataChannel dataChannelLJ3 = C475510Ikn.LJ(this);
            if (dataChannelLJ3 != null && Intrinsics.LJFF(dataChannelLJ3.gg0(C750320Tby.class), Boolean.FALSE) && Intrinsics.LJFF(bottomBarButton.buttonType, "view_team") && (dataChannelLJ = C475510Ikn.LJ(this)) != null) {
                dataChannelLJ.SX0(C750320Tby.class, Boolean.TRUE);
            }
        }
        C786410Ut5.h8(c16fs, new AbstractViewOnClickListenerC1105820esm() { // from class: X.0xBq
            @Override // X.AbstractViewOnClickListenerC1105820esm
            public final void LIZ() {
                RankListViewModel rankListViewModelLJIIIZ3;
                if (Intrinsics.LJFF(InterfaceC1093910eZZ.LLLLLLZZ.LIZ(), Boolean.TRUE) && LiveReverseFanClubSetting.INSTANCE.getValue()) {
                    C766270U4b.LIZLLL(2131852360);
                    return;
                }
                Function0<Unit> function0 = this.LLILZIL.LLIZ;
                if (function0 != null) {
                    function0.invoke();
                }
                C1810690xDf c1810690xDf = C1810690xDf.LIZ;
                DataChannel dataChannelLJ4 = C475510Ikn.LJ(this.LLILZIL);
                String str = bottomBarButton.buttonType;
                TeamRankListFragment teamRankListFragment = this.LLILZIL;
                String str2 = teamRankListFragment.LLILLL.LIZIZ.rankName;
                RankListController rankListController = teamRankListFragment.LLILZIL;
                RankListV2Response.RankView rankView3 = (rankListController == null || (rankListViewModelLJIIIZ3 = rankListController.LJIIIZ()) == null) ? null : rankListViewModelLJIIIZ3.LLILLJJLI;
                c1810690xDf.getClass();
                C1810690xDf.LJIIJ(dataChannelLJ4, str, str2, "click", "", rankView3);
                this.LLILZIL.dS(bottomBarButton.buttonType, true);
                boolean z2 = C1105900esu.LIZIZ;
                C1105900esu.LJ(C475510Ikn.LJ(this.LLILZIL), bottomBarButton.schemaUrl, true, false, "", new LinkedHashMap());
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1200L);
            }
        });
        if (!Intrinsics.LJFF(this.LLLILZLLLI, bottomBarButton.buttonType)) {
            this.LLLILZLLLI = bottomBarButton.buttonType;
            this.LLLILZJ = false;
        }
        RankListController rankListController = this.LLILZIL;
        if (rankListController != null && (rankListViewModelLJIIIZ2 = rankListController.LJIIIZ()) != null && (rankView2 = rankListViewModelLJIIIZ2.LLILLJJLI) != null && (rankInfo = rankView2.ownerRank) != null && rankInfo.LIZ) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = !z;
        if (!this.LLLILZJ && z2) {
            C1810690xDf c1810690xDf = C1810690xDf.LIZ;
            DataChannel dataChannelLJ4 = C475510Ikn.LJ(this);
            String str = bottomBarButton.buttonType;
            String str2 = this.LLILLL.LIZIZ.rankName;
            RankListController rankListController2 = this.LLILZIL;
            if (rankListController2 != null && (rankListViewModelLJIIIZ = rankListController2.LJIIIZ()) != null) {
                rankView = rankListViewModelLJIIIZ.LLILLJJLI;
            } else {
                rankView = null;
            }
            c1810690xDf.getClass();
            C1810690xDf.LJIIJ(dataChannelLJ4, str, str2, "show", "", rankView);
            dS(bottomBarButton.buttonType, false);
            this.LLLILZJ = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b1  */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dS(java.lang.String r15, boolean r16) {
        /*
            Method dump skipped, instruction units count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.rank.impl.list.fragment.list.TeamRankListFragment.dS(java.lang.String, boolean):void");
    }

    @Override // com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment, com.bytedance.android.live.rank.impl.list.fragment.list.VisibilityFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams3;
        C0JT6<Boolean> c0jt6;
        Boolean boolLIZ;
        FragmentManager fragmentManager;
        super.onViewCreated(view, bundle);
        if (LivePopularityRankingPerceptionImprovementSetting.INSTANCE.educationPanelOpt() && ((boolLIZ = (c0jt6 = InterfaceC1094280eaA.pd).LIZ()) == null || !boolLIZ.booleanValue())) {
            c0jt6.LIZJ(Boolean.TRUE);
            DataChannel dataChannelLJ = C475510Ikn.LJ(this);
            if (dataChannelLJ != null && (fragmentManager = (FragmentManager) dataChannelLJ.gg0(C748880TZe.class)) != null) {
                new PopularityRankingEducationDialog().show(fragmentManager, "live_popularity_ranking_education_dialog");
            }
        }
        if (LivePopularityRankingBottomBarLayoutSetting.INSTANCE.getValue()) {
            if (LivePopularityRankingNewUISetting.INSTANCE.getValue()) {
                if (cS()) {
                    int iLJIIIZ = C497740JfY.LJIIIZ(R.dimen.ax1);
                    View view2 = this.LLJJJIL;
                    if (view2 != null) {
                        ViewGroup.LayoutParams layoutParams4 = view2.getLayoutParams();
                        if (layoutParams4 != null) {
                            LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) layoutParams4;
                            layoutParams5.height = -2;
                            C786410Ut5.W5(view2, layoutParams5);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        }
                    }
                    FrameLayout frameLayout = this.LLLF;
                    if (frameLayout != null && (layoutParams3 = frameLayout.getLayoutParams()) != null) {
                        layoutParams3.width = C497740JfY.LJIIIZ(R.dimen.ax5);
                    }
                    FrameLayout frameLayout2 = this.LLJL;
                    ViewGroup.LayoutParams layoutParams6 = null;
                    if (frameLayout2 != null) {
                        layoutParams6 = frameLayout2.getLayoutParams();
                    }
                    if ((layoutParams6 instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams6) != null) {
                        marginLayoutParams.setMarginStart(C497740JfY.LJIIIZ(R.dimen.ax3));
                        marginLayoutParams.width = iLJIIIZ;
                        marginLayoutParams.height = iLJIIIZ;
                    }
                    bS();
                    ImageView imageView = this.LLJJLIIIJLLLLLLLZ;
                    if (imageView != null && (layoutParams2 = imageView.getLayoutParams()) != null) {
                        layoutParams2.width = C497740JfY.LJIIIZ(R.dimen.ax2);
                        layoutParams2.height = C497740JfY.LJIIIZ(R.dimen.ax2);
                    }
                    C1324720kZq c1324720kZq = this.LLJLIL;
                    if (c1324720kZq != null && (layoutParams = c1324720kZq.getLayoutParams()) != null) {
                        layoutParams.width = iLJIIIZ;
                        layoutParams.height = iLJIIIZ;
                    }
                    TextView textView = this.LLJJL;
                    if (textView != null) {
                        textView.setTextAppearance(R.style.rh);
                        textView.setTextColor(C20736316Cj.LIZIZ(R.attr.ezq, getContext()));
                        textView.setTextSize(0, (int) C497740JfY.LIZIZ(14.0f));
                    }
                    C16F5 c16f5 = this.LLLI;
                    if (c16f5 != null) {
                        c16f5.setTextAppearance(R.style.ro);
                        c16f5.setTextColor(C20736316Cj.LIZIZ(R.attr.ezs, getContext()));
                        c16f5.setTextSize(0, (int) C497740JfY.LIZIZ(11.0f));
                    }
                    C16F5 c16f52 = this.LLJLLL;
                    if (c16f52 != null) {
                        c16f52.setTextAppearance(R.style.ro);
                        c16f52.setTextColor(C20736316Cj.LIZIZ(R.attr.ezs, getContext()));
                        c16f52.setTextSize(0, (int) C497740JfY.LIZIZ(11.0f));
                    }
                }
            } else {
                View view3 = this.LLJJJIL;
                if (view3 != null) {
                    ViewGroup.LayoutParams layoutParams7 = view3.getLayoutParams();
                    if (layoutParams7 != null) {
                        LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) layoutParams7;
                        layoutParams8.height = -2;
                        C786410Ut5.W5(view3, layoutParams8);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    }
                }
            }
            View view4 = this.LLJLILLLLZIIL;
            if (view4 != null) {
                ViewGroup.LayoutParams layoutParams9 = view4.getLayoutParams();
                if (layoutParams9 != null) {
                    C19ME c19me = (C19ME) layoutParams9;
                    ((ViewGroup.MarginLayoutParams) c19me).height = -2;
                    View view5 = this.LLJJJIL;
                    if (view5 != null) {
                        int id = view5.getId();
                        c19me.topToTop = id;
                        c19me.bottomToBottom = id;
                    }
                    C786410Ut5.W5(view4, c19me);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
        }
    }

    @Override // com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment
    public final void NR(C16FS c16fs, final RankListV2Response.BottomBarButton bottomBarButton, final User user) {
        boolean z;
        RankListV2Response.RankView rankView;
        RankListViewModel rankListViewModelLJIIIZ;
        RankListViewModel rankListViewModelLJIIIZ2;
        RankListV2Response.RankView rankView2;
        RankListV2Response.RankInfo rankInfo;
        Room room;
        RoomAuthStatus roomAuthStatus;
        RankRootViewModel rankRootViewModelLIZ;
        RankListController rankListController = this.LLILZIL;
        boolean z2 = false;
        if ((rankListController != null && (rankRootViewModelLIZ = rankListController.LIZ()) != null && rankRootViewModelLIZ.LLILLL) || user == null) {
            C786410Ut5.LLJJJ(c16fs, 8);
            this.LLLILZJ = false;
            return;
        }
        C786410Ut5.LLJJJ(c16fs, 0);
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null && (room = (Room) dataChannelLJ.gg0(RoomChannel.class)) != null && (roomAuthStatus = room.getRoomAuthStatus()) != null && roomAuthStatus.isEnableGift()) {
            z = true;
        } else {
            z = false;
        }
        c16fs.setEnabled(z);
        C786410Ut5.h8(c16fs, new AbstractViewOnClickListenerC1105820esm() { // from class: X.0xC1
            @Override // X.AbstractViewOnClickListenerC1105820esm
            public final void LIZ() {
                RankListViewModel rankListViewModelLJIIIZ3;
                C1810690xDf c1810690xDf = C1810690xDf.LIZ;
                DataChannel dataChannelLJ2 = C475510Ikn.LJ(this.LLILZIL);
                String str = bottomBarButton.buttonType;
                TeamRankListFragment teamRankListFragment = this.LLILZIL;
                String str2 = teamRankListFragment.LLILLL.LIZIZ.rankName;
                RankListController rankListController2 = teamRankListFragment.LLILZIL;
                RankListV2Response.RankView rankView3 = (rankListController2 == null || (rankListViewModelLJIIIZ3 = rankListController2.LJIIIZ()) == null) ? null : rankListViewModelLJIIIZ3.LLILLJJLI;
                c1810690xDf.getClass();
                C1810690xDf.LJIIJ(dataChannelLJ2, str, str2, "click", "", rankView3);
                DataChannel dataChannelLJ3 = C475510Ikn.LJ(this.LLILZIL);
                if (dataChannelLJ3 != null) {
                    dataChannelLJ3.FQ2(CloseRankDialogEvent.class);
                }
                DataChannel dataChannelLJ4 = C475510Ikn.LJ(this.LLILZIL);
                if (dataChannelLJ4 != null) {
                    C1121570fIB c1121570fIB = new C1121570fIB(user);
                    TeamRankListFragment teamRankListFragment2 = this.LLILZIL;
                    c1121570fIB.LJIIIZ = LivePopularityRankingBonusTimeConfig.INSTANCE.getValue().giftId;
                    C1810410xDD c1810410xDD = teamRankListFragment2.LLILLL;
                    c1121570fIB.LIZJ = c1810410xDD.LIZIZ.rankName;
                    c1121570fIB.LJFF = C1790710whR.LIZ(c1810410xDD);
                    dataChannelLJ4.LC0(SendGiftEvent.class, c1121570fIB);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1200L);
            }
        });
        if (!Intrinsics.LJFF(this.LLLILZLLLI, bottomBarButton.buttonType)) {
            this.LLLILZLLLI = bottomBarButton.buttonType;
            this.LLLILZJ = false;
        }
        RankListController rankListController2 = this.LLILZIL;
        if (rankListController2 != null && (rankListViewModelLJIIIZ2 = rankListController2.LJIIIZ()) != null && (rankView2 = rankListViewModelLJIIIZ2.LLILLJJLI) != null && (rankInfo = rankView2.ownerRank) != null && rankInfo.LIZ) {
            z2 = true;
        }
        boolean z3 = !z2;
        if (!this.LLLILZJ && z3) {
            this.LLLILZJ = true;
            C1810690xDf c1810690xDf = C1810690xDf.LIZ;
            DataChannel dataChannelLJ2 = C475510Ikn.LJ(this);
            String str = bottomBarButton.buttonType;
            String str2 = this.LLILLL.LIZIZ.rankName;
            RankListController rankListController3 = this.LLILZIL;
            if (rankListController3 != null && (rankListViewModelLJIIIZ = rankListController3.LJIIIZ()) != null) {
                rankView = rankListViewModelLJIIIZ.LLILLJJLI;
            } else {
                rankView = null;
            }
            c1810690xDf.getClass();
            C1810690xDf.LJIIJ(dataChannelLJ2, str, str2, "show", "", rankView);
        }
    }
}
