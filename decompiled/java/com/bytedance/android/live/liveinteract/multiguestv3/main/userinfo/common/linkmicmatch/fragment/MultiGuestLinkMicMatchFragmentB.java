package com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.linkmicmatch.fragment;

import X.C0GSX;
import X.C1143680frq;
import X.C12ES;
import X.C1324720kZq;
import X.C16F5;
import X.C16FS;
import X.C417600GZa;
import X.C439101nJ;
import X.C497740JfY;
import X.C781520UlC;
import X.C786410Ut5;
import X.C930050aJH;
import X.C930940aKi;
import X.C942580adU;
import X.InterfaceC1813060xHU;
import X.ViewOnClickListenerC1836610xtT;
import Y.ACListenerS150S0100000_15;
import Y.AObserverS219S0100000_15;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.linkmicmatch.viewmodel.MultiGuestLinkMicMatchViewModel;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestRecommendRoomInfo;
import com.bytedance.android.live.uikit.setting.LiveSheetMigrationMultiWatchLinkedMicSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestLinkMicMatchFragmentB extends BaseMultiGuestLinkMicMatchFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSwiZzogLTclJyHELIOSk8ZiYjJCI8JmsgICE4JSwvJC4nKy1iLz0yLygpJzt9BTAgPSYUPSA/PQM6Ji4BICweKTEvIQkhKSIhLCEnCg==";
    public C16F5 animationApplyTv;
    public ConstraintLayout animationViewCl;
    public C16FS btRequestLinkMicMatch;
    public LinearLayout content;
    public C417600GZa ivBeauty;
    public LiveIconView ivLinkMicMatchRefresh;
    public C1324720kZq ivLiveAnim;
    public C1324720kZq ivTargetAvatar;
    public C0GSX ivTargetAvatarCircle;
    public C0GSX lcvLiveAnimStroke;
    public View outerView;
    public C16F5 tvLinkMicMatchBigTitle;
    public C16F5 tvLinkMicMatchCancelText;
    public C16F5 tvLinkMicMatchSubTitle;
    public C16F5 tvLinkMicMatchTargetName;
    public C16F5 tvLinkMicMatchTargetReason;
    public C16F5 tvLinkMicMatchTargetTag;
    public C16F5 tvLinkMicMatchTargetUserInfo;
    public static final C930050aJH Companion = new Object() { // from class: X.0aJH
    };
    public static final int $stable = 8;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.linkmicmatch.fragment.BaseMultiGuestLinkMicMatchFragment
    public final int getLayoutId() {
        return R.layout.gk_;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final FrameLayout.LayoutParams getCustomLayoutParams() {
        return LiveSheetMigrationMultiWatchLinkedMicSetting.INSTANCE.enable(C781520UlC.LJFF(PlaybookUtilKt.LJJIII())) ? new FrameLayout.LayoutParams(-1, -2) : super.getCustomLayoutParams();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.linkmicmatch.fragment.BaseMultiGuestLinkMicMatchFragment
    public final void initData() {
        MutableLiveData<Boolean> mutableLiveData;
        MutableLiveData<List<Long>> mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3;
        MutableLiveData<List<MultiGuestRecommendRoomInfo>> mutableLiveData4;
        MultiGuestLinkMicMatchViewModel multiGuestLinkMicMatchViewModel = this.viewModel;
        if (multiGuestLinkMicMatchViewModel != null && (mutableLiveData4 = multiGuestLinkMicMatchViewModel.LL) != null) {
            mutableLiveData4.observe(this, new AObserverS219S0100000_15(this, 53));
        }
        MultiGuestLinkMicMatchViewModel multiGuestLinkMicMatchViewModel2 = this.viewModel;
        if (multiGuestLinkMicMatchViewModel2 != null && (mutableLiveData3 = multiGuestLinkMicMatchViewModel2.LLILLJJLI) != null) {
            mutableLiveData3.observe(this, new AObserverS219S0100000_15(this, 54));
        }
        MultiGuestLinkMicMatchViewModel multiGuestLinkMicMatchViewModel3 = this.viewModel;
        if (multiGuestLinkMicMatchViewModel3 != null && (mutableLiveData2 = multiGuestLinkMicMatchViewModel3.LLILLL) != null) {
            mutableLiveData2.observe(this, new AObserverS219S0100000_15(this, 55));
        }
        MultiGuestLinkMicMatchViewModel multiGuestLinkMicMatchViewModel4 = this.viewModel;
        if (multiGuestLinkMicMatchViewModel4 != null && (mutableLiveData = multiGuestLinkMicMatchViewModel4.LLILZ) != null) {
            mutableLiveData.observe(this, new AObserverS219S0100000_15(this, 56));
        }
        MultiGuestLinkMicMatchViewModel multiGuestLinkMicMatchViewModel5 = this.viewModel;
        if (multiGuestLinkMicMatchViewModel5 != null) {
            multiGuestLinkMicMatchViewModel5.wQ2(1);
        }
        ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT = this.stateView;
        if (viewOnClickListenerC1836610xtT != null) {
            viewOnClickListenerC1836610xtT.LJI();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.linkmicmatch.fragment.BaseMultiGuestLinkMicMatchFragment
    public final void kS() {
        ImageModel avatarThumb;
        User owner;
        if (this.goLiveView != null) {
            MultiGuestLinkMicMatchViewModel multiGuestLinkMicMatchViewModel = this.viewModel;
            iS(false, (multiGuestLinkMicMatchViewModel == null || multiGuestLinkMicMatchViewModel.LLILZLL == null) ? false : true);
            return;
        }
        C16FS c16fs = this.btRequestLinkMicMatch;
        if (c16fs != null) {
            c16fs.LJIIL();
        }
        if (this.roomList.isEmpty()) {
            return;
        }
        int size = this.roomList.size();
        int i = this.currentIndex;
        if (size > i) {
            MultiGuestRecommendRoomInfo multiGuestRecommendRoomInfo = (MultiGuestRecommendRoomInfo) ListProtector.get(this.roomList, i);
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            String nickName = (room == null || (owner = room.getOwner()) == null) ? null : owner.getNickName();
            C16F5 c16f5 = this.tvLinkMicMatchBigTitle;
            if (c16f5 != null) {
                c16f5.setText(C497740JfY.LJIJJ(2131854178, nickName));
            }
            C16F5 c16f52 = this.animationApplyTv;
            if (c16f52 != null) {
                int i2 = this.applyCount;
                c16f52.setText(i2 <= 1 ? C497740JfY.LJIIL(2131755543, 1, Integer.valueOf(i2)) : C497740JfY.LJIIL(2131755543, 2, Integer.valueOf(i2)));
            }
            User user = multiGuestRecommendRoomInfo.hostInfo;
            if (user != null && (avatarThumb = user.getAvatarThumb()) != null) {
                C1143680frq.LJJI(this.ivTargetAvatar, avatarThumb, false);
            }
            C16F5 c16f53 = this.tvLinkMicMatchTargetName;
            if (c16f53 != null) {
                User user2 = multiGuestRecommendRoomInfo.hostInfo;
                c16f53.setText(user2 != null ? user2.getNickName() : null);
            }
            C16F5 c16f54 = this.tvLinkMicMatchTargetUserInfo;
            if (c16f54 != null) {
                c16f54.setText(BaseMultiGuestLinkMicMatchFragment.UR(multiGuestRecommendRoomInfo));
            }
            if (BaseMultiGuestLinkMicMatchFragment.RR(multiGuestRecommendRoomInfo).length() == 0) {
                C16F5 c16f55 = this.tvLinkMicMatchTargetReason;
                if (c16f55 != null) {
                    C786410Ut5.LLJJJJ(c16f55, 8);
                }
            } else {
                C16F5 c16f56 = this.tvLinkMicMatchTargetReason;
                if (c16f56 != null) {
                    c16f56.setText(BaseMultiGuestLinkMicMatchFragment.RR(multiGuestRecommendRoomInfo));
                }
                C16F5 c16f57 = this.tvLinkMicMatchTargetReason;
                if (c16f57 != null) {
                    C786410Ut5.LLJJJJ(c16f57, 0);
                }
            }
            if (multiGuestRecommendRoomInfo.hostRecoTags.size() > 0) {
                C16F5 c16f58 = this.tvLinkMicMatchTargetTag;
                if (c16f58 != null) {
                    c16f58.setText(BaseMultiGuestLinkMicMatchFragment.SR((String) ListProtector.get(multiGuestRecommendRoomInfo.hostRecoTags, 0)));
                }
                C16F5 c16f59 = this.tvLinkMicMatchTargetTag;
                if (c16f59 != null) {
                    C786410Ut5.LLJJJJ(c16f59, 0);
                }
            } else {
                C16F5 c16f510 = this.tvLinkMicMatchTargetTag;
                if (c16f510 != null) {
                    C786410Ut5.LLJJJJ(c16f510, 8);
                }
            }
            Integer num = this.waitingSize;
            int iIntValue = num != null ? num.intValue() : 0;
            MultiGuestLinkMicMatchViewModel multiGuestLinkMicMatchViewModel2 = this.viewModel;
            C942580adU.LJI("in_request_panel", multiGuestRecommendRoomInfo, iIntValue, multiGuestLinkMicMatchViewModel2 != null ? multiGuestLinkMicMatchViewModel2.LLILZIL : null, false, null);
            MultiGuestLinkMicMatchViewModel multiGuestLinkMicMatchViewModel3 = this.viewModel;
            C942580adU.LIZLLL(multiGuestRecommendRoomInfo, "recommend_link_room_head", multiGuestLinkMicMatchViewModel3 != null ? multiGuestLinkMicMatchViewModel3.LLILZIL : null);
            MultiGuestLinkMicMatchViewModel multiGuestLinkMicMatchViewModel4 = this.viewModel;
            C942580adU.LIZLLL(multiGuestRecommendRoomInfo, "recommend_link_room_request", multiGuestLinkMicMatchViewModel4 != null ? multiGuestLinkMicMatchViewModel4.LLILZIL : null);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.linkmicmatch.fragment.BaseMultiGuestLinkMicMatchFragment
    public final void WR(View view) {
        this.triggerType = 1;
        View viewFindViewById = view.findViewById(R.id.pw6);
        if (LiveSheetMigrationMultiWatchLinkedMicSetting.INSTANCE.enable(C781520UlC.LJFF(PlaybookUtilKt.LJJIII()))) {
            C439101nJ.LJI(viewFindViewById);
        } else {
            C12ES.LJIILL(0, viewFindViewById);
        }
        this.outerView = viewFindViewById;
        this.stateView = (ViewOnClickListenerC1836610xtT) view.findViewById(R.id.w09);
        BaseMultiGuestLinkMicMatchFragment.VR(view, 271.0f);
        this.content = (LinearLayout) view.findViewById(R.id.eu1);
        this.ivBeauty = (C417600GZa) view.findViewById(R.id.l_t);
        this.tvLinkMicMatchBigTitle = (C16F5) view.findViewById(R.id.zu3);
        this.animationApplyTv = (C16F5) view.findViewById(R.id.b45);
        this.tvLinkMicMatchCancelText = (C16F5) view.findViewById(R.id.zu4);
        this.tvLinkMicMatchSubTitle = (C16F5) view.findViewById(R.id.zue);
        this.animationViewCl = (ConstraintLayout) view.findViewById(R.id.b4f);
        this.ivLinkMicMatchRefresh = (LiveIconView) view.findViewById(R.id.lmp);
        this.ivTargetAvatarCircle = (C0GSX) view.findViewById(R.id.lx4);
        this.ivTargetAvatar = (C1324720kZq) view.findViewById(R.id.lx2);
        this.lcvLiveAnimStroke = (C0GSX) view.findViewById(R.id.mi9);
        this.ivLiveAnim = (C1324720kZq) view.findViewById(R.id.lmz);
        this.tvLinkMicMatchTargetName = (C16F5) view.findViewById(R.id.zuf);
        this.tvLinkMicMatchTargetTag = (C16F5) view.findViewById(R.id.zuh);
        this.tvLinkMicMatchTargetUserInfo = (C16F5) view.findViewById(R.id.zui);
        this.tvLinkMicMatchTargetReason = (C16F5) view.findViewById(R.id.zug);
        this.btRequestLinkMicMatch = (C16FS) view.findViewById(R.id.cli);
        ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT = this.stateView;
        if (viewOnClickListenerC1836610xtT != null) {
            viewOnClickListenerC1836610xtT.setErrorClickListener(new InterfaceC1813060xHU() { // from class: X.0ajI
                @Override // X.InterfaceC1813060xHU
                public final void LIZIZ() {
                    ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT2 = this.LIZ.stateView;
                    if (viewOnClickListenerC1836610xtT2 != null) {
                        viewOnClickListenerC1836610xtT2.LJI();
                    }
                    MultiGuestLinkMicMatchViewModel multiGuestLinkMicMatchViewModel = this.LIZ.viewModel;
                    if (multiGuestLinkMicMatchViewModel != null) {
                        multiGuestLinkMicMatchViewModel.wQ2(1);
                    }
                }
            });
        }
        C417600GZa c417600GZa = this.ivBeauty;
        if (c417600GZa != null) {
            C786410Ut5.z8(c417600GZa, new ACListenerS150S0100000_15(this, 145));
        }
        LiveIconView liveIconView = this.ivLinkMicMatchRefresh;
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, new ACListenerS150S0100000_15(this, 146));
        }
        C16FS c16fs = this.btRequestLinkMicMatch;
        if (c16fs != null) {
            C786410Ut5.h8(c16fs, new ACListenerS150S0100000_15(this, 147));
        }
        C1324720kZq c1324720kZq = this.ivTargetAvatar;
        if (c1324720kZq != null) {
            C786410Ut5.e8(c1324720kZq, new ACListenerS150S0100000_15(this, 148));
        }
        C16F5 c16f5 = this.tvLinkMicMatchCancelText;
        if (c16f5 != null) {
            C786410Ut5.l8(c16f5, new ACListenerS150S0100000_15(this, 149));
        }
        BaseMultiGuestLinkMicMatchFragment.hS(this.lcvLiveAnimStroke);
        C1324720kZq c1324720kZq2 = this.ivLiveAnim;
        if (c1324720kZq2 != null) {
            dS(c1324720kZq2);
        }
    }
}
