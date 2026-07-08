package com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.linkmicmatch.fragment;

import X.C0GSX;
import X.C0UO0;
import X.C1143680frq;
import X.C1324720kZq;
import X.C16F5;
import X.C16FS;
import X.C19490011Na;
import X.C497740JfY;
import X.C786410Ut5;
import X.C942580adU;
import X.C946200ajK;
import X.InterfaceC1813060xHU;
import X.InterfaceC420801kM;
import X.ViewOnClickListenerC1836610xtT;
import Y.ACListenerS150S0100000_15;
import Y.AObserverS219S0100000_15;
import Y.AfS184S0100000_15;
import Y.AfS3S0100100_7;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.linkmicmatch.viewmodel.MultiGuestLinkMicMatchViewModel;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestRecommendRoomInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLinkMicMatchConfigSettings;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestLinkMicMatchFragmentAuto extends BaseMultiGuestLinkMicMatchFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSwiZzogLTclJyk8HELIOSZiYjJCI8JmsgICE4JSwvJC4nKy1iLz0yLygpJzt9BTAgPSYUPSA/PQM6Ji4BICweKTEvIQkhKSIhLCEnCTA4Jg==";
    public C16FS btRequestLinkMicMatch;
    public LiveIconView ivClose;
    public LiveIconView ivLinkMicMatchRefresh;
    public C1324720kZq ivLiveAnim;
    public FrameLayout ivRefreshBg;
    public C1324720kZq ivTargetAvatar;
    public C0GSX ivTargetAvatarCircle;
    public C0GSX lcvLiveAnimStroke;
    public View outerView;
    public InterfaceC420801kM progressTask;
    public C16F5 tvLinkMicMatchBigTitle;
    public C16F5 tvLinkMicMatchTargetName;
    public C16F5 tvLinkMicMatchTargetReason;
    public C16F5 tvLinkMicMatchTargetTag;
    public C16F5 tvLinkMicMatchTargetUserInfo;
    public static final C946200ajK Companion = new Object() { // from class: X.0ajK
    };
    public static final int $stable = 8;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.linkmicmatch.fragment.BaseMultiGuestLinkMicMatchFragment
    public final void cS() {
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.linkmicmatch.fragment.BaseMultiGuestLinkMicMatchFragment
    public final int getLayoutId() {
        return R.layout.gk9;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.linkmicmatch.fragment.BaseMultiGuestLinkMicMatchFragment
    public final void initData() {
        MutableLiveData<Boolean> mutableLiveData;
        MutableLiveData<List<Long>> mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3;
        MutableLiveData<List<MultiGuestRecommendRoomInfo>> mutableLiveData4;
        MultiGuestLinkMicMatchViewModel multiGuestLinkMicMatchViewModel = this.viewModel;
        if (multiGuestLinkMicMatchViewModel != null && (mutableLiveData4 = multiGuestLinkMicMatchViewModel.LL) != null) {
            mutableLiveData4.observe(this, new AObserverS219S0100000_15(this, 49));
        }
        MultiGuestLinkMicMatchViewModel multiGuestLinkMicMatchViewModel2 = this.viewModel;
        if (multiGuestLinkMicMatchViewModel2 != null && (mutableLiveData3 = multiGuestLinkMicMatchViewModel2.LLILLJJLI) != null) {
            mutableLiveData3.observe(this, new AObserverS219S0100000_15(this, 50));
        }
        MultiGuestLinkMicMatchViewModel multiGuestLinkMicMatchViewModel3 = this.viewModel;
        if (multiGuestLinkMicMatchViewModel3 != null && (mutableLiveData2 = multiGuestLinkMicMatchViewModel3.LLILLL) != null) {
            mutableLiveData2.observe(this, new AObserverS219S0100000_15(this, 51));
        }
        MultiGuestLinkMicMatchViewModel multiGuestLinkMicMatchViewModel4 = this.viewModel;
        if (multiGuestLinkMicMatchViewModel4 != null && (mutableLiveData = multiGuestLinkMicMatchViewModel4.LLILZ) != null) {
            mutableLiveData.observe(this, new AObserverS219S0100000_15(this, 52));
        }
        MultiGuestLinkMicMatchViewModel multiGuestLinkMicMatchViewModel5 = this.viewModel;
        if (multiGuestLinkMicMatchViewModel5 != null) {
            multiGuestLinkMicMatchViewModel5.wQ2(2);
        }
        ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT = this.stateView;
        if (viewOnClickListenerC1836610xtT != null) {
            viewOnClickListenerC1836610xtT.LJI();
        }
        if (this.progressTask == null) {
            long audiencePanelDismissSec = MultiGuestLinkMicMatchConfigSettings.INSTANCE.getAudiencePanelDismissSec();
            this.progressTask = C19490011Na.LIZLLL(1L, audiencePanelDismissSec, 0L, 1L, TimeUnit.SECONDS).LJIILIIL(new C0UO0()).LJJLL(new AfS3S0100100_7(audiencePanelDismissSec, this, 7), new AfS184S0100000_15(this, 102));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.linkmicmatch.fragment.BaseMultiGuestLinkMicMatchFragment
    public final void kS() {
        ImageModel avatarThumb;
        z = false;
        boolean z = false;
        if (this.goLiveView != null) {
            MultiGuestLinkMicMatchViewModel multiGuestLinkMicMatchViewModel = this.viewModel;
            if (multiGuestLinkMicMatchViewModel != null && multiGuestLinkMicMatchViewModel.LLILZLL != null) {
                z = true;
            }
            iS(true, z);
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
            C16F5 c16f5 = this.tvLinkMicMatchTargetName;
            if (c16f5 != null) {
                User user = multiGuestRecommendRoomInfo.hostInfo;
                c16f5.setText(user != null ? user.getNickName() : null);
            }
            if (multiGuestRecommendRoomInfo.hostRecoTags.size() > 0) {
                C16F5 c16f52 = this.tvLinkMicMatchTargetTag;
                if (c16f52 != null) {
                    c16f52.setText(BaseMultiGuestLinkMicMatchFragment.SR((String) ListProtector.get(multiGuestRecommendRoomInfo.hostRecoTags, 0)));
                }
                C16F5 c16f53 = this.tvLinkMicMatchTargetTag;
                if (c16f53 != null) {
                    C786410Ut5.LLJJJJ(c16f53, 0);
                }
            } else {
                C16F5 c16f54 = this.tvLinkMicMatchTargetTag;
                if (c16f54 != null) {
                    C786410Ut5.LLJJJJ(c16f54, 8);
                }
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
            C16F5 c16f58 = this.tvLinkMicMatchTargetUserInfo;
            if (c16f58 != null) {
                c16f58.setText(BaseMultiGuestLinkMicMatchFragment.UR(multiGuestRecommendRoomInfo));
            }
            User user2 = multiGuestRecommendRoomInfo.hostInfo;
            if (user2 != null && (avatarThumb = user2.getAvatarThumb()) != null) {
                C1143680frq.LJJI(this.ivTargetAvatar, avatarThumb, false);
            }
            Integer num = this.waitingSize;
            int iIntValue = num != null ? num.intValue() : 0;
            MultiGuestLinkMicMatchViewModel multiGuestLinkMicMatchViewModel2 = this.viewModel;
            C942580adU.LJI("individual_panel", multiGuestRecommendRoomInfo, iIntValue, multiGuestLinkMicMatchViewModel2 != null ? multiGuestLinkMicMatchViewModel2.LLILZIL : null, false, null);
            MultiGuestLinkMicMatchViewModel multiGuestLinkMicMatchViewModel3 = this.viewModel;
            C942580adU.LIZLLL(multiGuestRecommendRoomInfo, "recommend_link_room_head", multiGuestLinkMicMatchViewModel3 != null ? multiGuestLinkMicMatchViewModel3.LLILZIL : null);
            MultiGuestLinkMicMatchViewModel multiGuestLinkMicMatchViewModel4 = this.viewModel;
            C942580adU.LIZLLL(multiGuestRecommendRoomInfo, "recommend_link_room_request", multiGuestLinkMicMatchViewModel4 != null ? multiGuestLinkMicMatchViewModel4.LLILZIL : null);
        }
    }

    public final void mS() {
        InterfaceC420801kM interfaceC420801kM = this.progressTask;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        this.progressTask = null;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.common.linkmicmatch.fragment.BaseMultiGuestLinkMicMatchFragment
    public final void WR(View view) {
        this.triggerType = 2;
        this.outerView = view.findViewById(R.id.pw6);
        this.stateView = (ViewOnClickListenerC1836610xtT) view.findViewById(R.id.w08);
        BaseMultiGuestLinkMicMatchFragment.VR(view, 270.0f);
        this.ivClose = (LiveIconView) view.findViewById(R.id.lc0);
        this.tvLinkMicMatchBigTitle = (C16F5) view.findViewById(R.id.zu3);
        this.ivTargetAvatarCircle = (C0GSX) view.findViewById(R.id.lx4);
        this.ivTargetAvatar = (C1324720kZq) view.findViewById(R.id.lx2);
        this.lcvLiveAnimStroke = (C0GSX) view.findViewById(R.id.mi9);
        this.ivLiveAnim = (C1324720kZq) view.findViewById(R.id.lmz);
        this.ivLinkMicMatchRefresh = (LiveIconView) view.findViewById(R.id.lmp);
        this.tvLinkMicMatchTargetName = (C16F5) view.findViewById(R.id.zuf);
        this.tvLinkMicMatchTargetTag = (C16F5) view.findViewById(R.id.zuh);
        this.tvLinkMicMatchTargetUserInfo = (C16F5) view.findViewById(R.id.zui);
        this.tvLinkMicMatchTargetReason = (C16F5) view.findViewById(R.id.zug);
        this.btRequestLinkMicMatch = (C16FS) view.findViewById(R.id.cli);
        this.ivRefreshBg = (FrameLayout) view.findViewById(R.id.i70);
        ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT = this.stateView;
        if (viewOnClickListenerC1836610xtT != null) {
            viewOnClickListenerC1836610xtT.setErrorClickListener(new InterfaceC1813060xHU() { // from class: X.0ajG
                @Override // X.InterfaceC1813060xHU
                public final void LIZIZ() {
                    this.LIZ.mS();
                    ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT2 = this.LIZ.stateView;
                    if (viewOnClickListenerC1836610xtT2 != null) {
                        viewOnClickListenerC1836610xtT2.LJI();
                    }
                    MultiGuestLinkMicMatchViewModel multiGuestLinkMicMatchViewModel = this.LIZ.viewModel;
                    if (multiGuestLinkMicMatchViewModel != null) {
                        multiGuestLinkMicMatchViewModel.wQ2(2);
                    }
                }
            });
        }
        LiveIconView liveIconView = this.ivClose;
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, new ACListenerS150S0100000_15(this, 141));
        }
        FrameLayout frameLayout = this.ivRefreshBg;
        if (frameLayout != null) {
            C786410Ut5.O7(frameLayout, new ACListenerS150S0100000_15(this, 142));
        }
        C16F5 c16f5 = this.tvLinkMicMatchBigTitle;
        if (c16f5 != null) {
            c16f5.setText(C497740JfY.LJIJI(2131854193));
        }
        C16FS c16fs = this.btRequestLinkMicMatch;
        if (c16fs != null) {
            C786410Ut5.h8(c16fs, new ACListenerS150S0100000_15(this, 143));
        }
        C1324720kZq c1324720kZq = this.ivTargetAvatar;
        if (c1324720kZq != null) {
            C786410Ut5.e8(c1324720kZq, new ACListenerS150S0100000_15(this, 144));
        }
        BaseMultiGuestLinkMicMatchFragment.hS(this.lcvLiveAnimStroke);
        C1324720kZq c1324720kZq2 = this.ivLiveAnim;
        if (c1324720kZq2 != null) {
            dS(c1324720kZq2);
        }
    }
}
