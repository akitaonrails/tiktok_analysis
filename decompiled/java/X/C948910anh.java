package X;

import Y.AObserverS219S0100000_15;
import Y.AfS178S0100000_9;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.LinkMicMatchAutoShowMatchDialogEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestPreviewReadyDestroyEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.randommatch.RandomMatchGuestViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.randommatch.model.RandomMatchDataChannel;
import com.bytedance.android.livesdk.dataChannel.TopLiveHangoutInteractTypeData;
import com.bytedance.android.livesdk.hangout.HangoutRandomMatchPanelFragment;
import com.bytedance.android.livesdk.livesetting.linkmic.HangoutRoomFeedEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestSocialConfigSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.sheet.intro.TuxPanel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS629S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0anh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C948910anh implements InterfaceC1102810env {
    public DataChannel LL;
    public InterfaceC785120Ur0 LLILLJJLI;
    public RandomMatchGuestViewModel LLILLL;
    public boolean LLILZ;
    public C1324720kZq LLILZIL;
    public C11JF LLILZLL;
    public boolean LLIZ;
    public HangoutRandomMatchPanelFragment LLIZLLLIL;
    public final AObserverS219S0100000_15 LLJ = new AObserverS219S0100000_15(this, 130);

    @Override // X.InterfaceC1102810env
    public final void J() {
    }

    @Override // X.InterfaceC1102810env
    public final Integer LIZJ() {
        return null;
    }

    @Override // X.InterfaceC1102810env
    public final Integer LJ() {
        return null;
    }

    @Override // X.InterfaceC1102810env
    public final void LLILLJJLI() {
    }

    @Override // X.InterfaceC1102810env
    public final void LLILZ() {
    }

    @Override // X.InterfaceC1102810env
    public final boolean f1() {
        return false;
    }

    @Override // X.InterfaceC1102810env
    public final long g0() {
        return 500L;
    }

    @Override // X.InterfaceC1102810env
    public final boolean x0(View view) {
        return false;
    }

    @Override // X.InterfaceC1102810env
    public final C0KX7 LIZ() {
        return C0KX7.FIXED;
    }

    public static void LJI(String str) {
        C947520alS.LIZIZ(null, str, "click", "bottom_bar_change");
    }

    public final void LJFF(boolean z) {
        C1324720kZq c1324720kZq = this.LLILZIL;
        if (c1324720kZq != null) {
            if (z) {
                C1143920fsE c1143920fsE = new C1143920fsE();
                c1143920fsE.LIZ = c1324720kZq;
                c1143920fsE.LIZIZ = "tiktok_live_interaction_normal_2";
                c1143920fsE.LIZJ = "ttlive_icon_random_match_switch_ani.webp";
                c1143920fsE.LJFF = true;
                c1143920fsE.LJIIJJI = true;
                c1143920fsE.LJI = Integer.MAX_VALUE;
                c1143920fsE.LIZLLL();
                return;
            }
            C1143920fsE c1143920fsE2 = new C1143920fsE();
            c1143920fsE2.LIZ = c1324720kZq;
            c1143920fsE2.LIZIZ = "tiktok_live_interaction_normal_2";
            c1143920fsE2.LIZJ = "ttlive_icon_random_match_switch.png";
            c1143920fsE2.LIZLLL();
        }
    }

    public final void LJII(C948850anb c948850anb) {
        FragmentManager fragmentManager;
        String str;
        String str2;
        String str3;
        String str4;
        ImageModel avatarThumb;
        List urls;
        ImageModel avatarThumb2;
        List urls2;
        EnterRoomLinkSession enterRoomLinkSessionLIZ;
        EnterRoomConfig enterRoomConfig;
        EnterRoomConfig.RoomsData roomsData;
        DataChannel dataChannel = this.LL;
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
            HangoutRandomMatchPanelFragment hangoutRandomMatchPanelFragment = this.LLIZLLLIL;
            if (hangoutRandomMatchPanelFragment != null) {
                CountDownTimerC521500Kcm countDownTimerC521500Kcm = hangoutRandomMatchPanelFragment.LLJJLIIIJLLLLLLLZ;
                if (countDownTimerC521500Kcm != null) {
                    countDownTimerC521500Kcm.cancel();
                }
                C0KZA c0kza = hangoutRandomMatchPanelFragment.LLIZLLLIL;
                if (c0kza != null) {
                    c0kza.LIZLLL();
                }
                hangoutRandomMatchPanelFragment.dismiss();
            }
            C0INV c0inv = C0IL2.LIZ;
            if (c0inv == null || (enterRoomLinkSessionLIZ = c0inv.LIZ()) == null || (enterRoomConfig = enterRoomLinkSessionLIZ.mEnterRoomConfig) == null || (roomsData = enterRoomConfig.mRoomsData) == null || (str = roomsData.enterMethod) == null) {
                str = "";
            }
            if (a0.LJJIIZI(str, "random_chat", false)) {
                str2 = "hangout_mg_agg_playlabel_random_chat";
            } else if (a0.LJJIIZI(str, "dating", false)) {
                str2 = "hangout_mg_agg_playlabel_dating";
            } else {
                str2 = "hangout_random_match";
            }
            HangoutRandomMatchPanelFragment hangoutRandomMatchPanelFragmentLIZ = C0JSW.LIZ(str2, (int) MultiGuestSocialConfigSetting.INSTANCE.getConfig().joinTimeOutSecond, 12);
            this.LLIZLLLIL = hangoutRandomMatchPanelFragmentLIZ;
            User userLJIJJLI = UserService.getInstance().user().LJIJJLI();
            String nickName = null;
            if (userLJIJJLI != null && (avatarThumb2 = userLJIJJLI.getAvatarThumb()) != null && (urls2 = avatarThumb2.getUrls()) != null) {
                str3 = (String) C13LP.LJJJLL(urls2);
            } else {
                str3 = null;
            }
            hangoutRandomMatchPanelFragmentLIZ.LLJJIJI = str3;
            hangoutRandomMatchPanelFragmentLIZ.LLJJL = new AwS559S0100000_15(this, 1210);
            hangoutRandomMatchPanelFragmentLIZ.LLJJIII = new InterfaceC481680Iuk() { // from class: X.0anm
                @Override // X.InterfaceC481680Iuk
                public final void n() {
                }

                @Override // X.InterfaceC481680Iuk
                public final void o() {
                }

                @Override // X.InterfaceC481680Iuk
                public final void p() {
                }

                @Override // X.InterfaceC481680Iuk
                public final void l() {
                    RandomMatchGuestViewModel randomMatchGuestViewModel = this.LIZ.LLILLL;
                    if (randomMatchGuestViewModel != null) {
                        randomMatchGuestViewModel.zQ2("hangoutSuccessPanelDismiss");
                    }
                    this.LIZ.getClass();
                    C948910anh.LJI("opy_out");
                }

                @Override // X.InterfaceC481680Iuk
                public final void m() {
                    RandomMatchGuestViewModel randomMatchGuestViewModel = this.LIZ.LLILLL;
                    if (randomMatchGuestViewModel != null) {
                        randomMatchGuestViewModel.zQ2("hangoutSuccessPanelDismiss");
                    }
                    this.LIZ.getClass();
                    C948910anh.LJI("opy_out");
                }

                @Override // X.InterfaceC481680Iuk
                public final void q() {
                    RandomMatchGuestViewModel randomMatchGuestViewModel = this.LIZ.LLILLL;
                    if (randomMatchGuestViewModel != null) {
                        randomMatchGuestViewModel.zQ2("hangoutSuccessPanelDismiss");
                    }
                    this.LIZ.getClass();
                    C948910anh.LJI("opy_out");
                }

                @Override // X.InterfaceC481680Iuk
                public final void r(long j) {
                    RandomMatchGuestViewModel randomMatchGuestViewModel = this.LIZ.LLILLL;
                    if (randomMatchGuestViewModel != null) {
                        randomMatchGuestViewModel.wQ2();
                    }
                    this.LIZ.getClass();
                    C948910anh.LJI("join");
                }
            };
            long j = c948850anb.LJFF;
            User user = c948850anb.LJ;
            if (user != null && (avatarThumb = user.getAvatarThumb()) != null && (urls = avatarThumb.getUrls()) != null) {
                str4 = (String) C13LP.LJJJLL(urls);
            } else {
                str4 = null;
            }
            User user2 = c948850anb.LJ;
            if (user2 != null) {
                nickName = user2.getNickName();
            }
            hangoutRandomMatchPanelFragmentLIZ.LLJJJJJIL = true;
            hangoutRandomMatchPanelFragmentLIZ.LLJJJJLIIL = true;
            hangoutRandomMatchPanelFragmentLIZ.LLJJIJIIJIL = j;
            hangoutRandomMatchPanelFragmentLIZ.LLJJIJIL = str4;
            hangoutRandomMatchPanelFragmentLIZ.LLJJJ = nickName;
            hangoutRandomMatchPanelFragmentLIZ.NR(fragmentManager);
        }
    }

    @Override // X.InterfaceC1102810env
    public final void onClick(View view) {
        boolean zLJFF;
        EnumC948930anj enumC948930anj;
        MutableLiveData<C948850anb> mutableLiveData;
        C948850anb value;
        Context context;
        View viewFindViewById;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View contentView;
        MutableLiveData<C948850anb> mutableLiveData2;
        C948850anb value2;
        EnumC948930anj enumC948930anj2;
        FragmentManager fragmentManager;
        String str;
        String str2;
        ImageModel avatarThumb;
        List urls;
        EnterRoomLinkSession enterRoomLinkSessionLIZ;
        EnterRoomConfig enterRoomConfig;
        EnterRoomConfig.RoomsData roomsData;
        MutableLiveData<C948850anb> mutableLiveData3;
        C948850anb value3;
        C948850anb c948850anb;
        DataChannel dataChannel = this.LL;
        if (dataChannel != null) {
            zLJFF = Intrinsics.LJFF(dataChannel.gg0(TopLiveHangoutInteractTypeData.class), Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        DataChannel dataChannel2 = this.LL;
        EnumC948930anj enumC948930anj3 = null;
        str = null;
        str = null;
        String str3 = null;
        enumC948930anj3 = null;
        enumC948930anj3 = null;
        if (dataChannel2 != null && (c948850anb = (C948850anb) dataChannel2.gg0(RandomMatchDataChannel.class)) != null) {
            enumC948930anj = c948850anb.LIZ;
        } else {
            enumC948930anj = null;
        }
        EnumC948930anj enumC948930anj4 = EnumC948930anj.MATCHING;
        if (enumC948930anj != enumC948930anj4) {
            C947520alS.LIZIZ(null, "start", "click", "bottom_bar_change");
        }
        if (zLJFF && HangoutRoomFeedEnableSetting.INSTANCE.isEnable()) {
            RandomMatchGuestViewModel randomMatchGuestViewModel = this.LLILLL;
            if (randomMatchGuestViewModel != null && (mutableLiveData2 = randomMatchGuestViewModel.LLILLJJLI) != null && (value2 = mutableLiveData2.getValue()) != null && (enumC948930anj2 = value2.LIZ) != null) {
                int i = C948920ani.LIZ[enumC948930anj2.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        RandomMatchGuestViewModel randomMatchGuestViewModel2 = this.LLILLL;
                        if (randomMatchGuestViewModel2 != null && (mutableLiveData3 = randomMatchGuestViewModel2.LLILLJJLI) != null && (value3 = mutableLiveData3.getValue()) != null) {
                            LJII(value3);
                            return;
                        }
                        return;
                    }
                } else {
                    DataChannel dataChannel3 = this.LL;
                    if (dataChannel3 == null || (fragmentManager = (FragmentManager) dataChannel3.gg0(C748880TZe.class)) == null || this.LLIZLLLIL != null) {
                        return;
                    }
                    C0INV c0inv = C0IL2.LIZ;
                    if (c0inv == null || (enterRoomLinkSessionLIZ = c0inv.LIZ()) == null || (enterRoomConfig = enterRoomLinkSessionLIZ.mEnterRoomConfig) == null || (roomsData = enterRoomConfig.mRoomsData) == null || (str = roomsData.enterMethod) == null) {
                        str = "";
                    }
                    if (a0.LJJIIZI(str, "random_chat", false)) {
                        str2 = "hangout_mg_agg_playlabel_random_chat";
                    } else if (a0.LJJIIZI(str, "dating", false)) {
                        str2 = "hangout_mg_agg_playlabel_dating";
                    } else {
                        str2 = "hangout_random_match";
                    }
                    HangoutRandomMatchPanelFragment hangoutRandomMatchPanelFragmentLIZ = C0JSW.LIZ(str2, 0, 14);
                    this.LLIZLLLIL = hangoutRandomMatchPanelFragmentLIZ;
                    User userLJIJJLI = UserService.getInstance().user().LJIJJLI();
                    if (userLJIJJLI != null && (avatarThumb = userLJIJJLI.getAvatarThumb()) != null && (urls = avatarThumb.getUrls()) != null) {
                        str3 = (String) C13LP.LJJJLL(urls);
                    }
                    hangoutRandomMatchPanelFragmentLIZ.LLJJIJI = str3;
                    hangoutRandomMatchPanelFragmentLIZ.LLJJL = new AwS559S0100000_15(this, 1212);
                    hangoutRandomMatchPanelFragmentLIZ.LLJJIII = new InterfaceC481680Iuk() { // from class: X.0ann
                        @Override // X.InterfaceC481680Iuk
                        public final void n() {
                        }

                        @Override // X.InterfaceC481680Iuk
                        public final void p() {
                        }

                        @Override // X.InterfaceC481680Iuk
                        public final void r(long j) {
                        }

                        @Override // X.InterfaceC481680Iuk
                        public final void l() {
                            this.LIZ.getClass();
                            C948910anh.LJI("opy_out");
                        }

                        @Override // X.InterfaceC481680Iuk
                        public final void m() {
                            this.LIZ.getClass();
                            C948910anh.LJI("opy_out");
                        }

                        @Override // X.InterfaceC481680Iuk
                        public final void o() {
                            RandomMatchGuestViewModel randomMatchGuestViewModel3 = this.LIZ.LLILLL;
                            if (randomMatchGuestViewModel3 != null) {
                                randomMatchGuestViewModel3.vQ2(1);
                            }
                            this.LIZ.getClass();
                            C948910anh.LJI("cancel");
                        }

                        @Override // X.InterfaceC481680Iuk
                        public final void q() {
                            this.LIZ.getClass();
                            C948910anh.LJI("opy_out");
                        }
                    };
                    hangoutRandomMatchPanelFragmentLIZ.LLJJJJJIL = true;
                    hangoutRandomMatchPanelFragmentLIZ.LLJJJJLIIL = false;
                    hangoutRandomMatchPanelFragmentLIZ.NR(fragmentManager);
                    return;
                }
            }
            RandomMatchGuestViewModel randomMatchGuestViewModel3 = this.LLILLL;
            if (randomMatchGuestViewModel3 == null) {
                return;
            }
            randomMatchGuestViewModel3.CQ2(C948990anp.LIZ(1), C948880ane.LIZIZ);
            return;
        }
        C20337914i1<Boolean> c20337914i1 = InterfaceC1106030et7.S9;
        if (!c20337914i1.LIZIZ().booleanValue()) {
            c20337914i1.LJFF(Boolean.TRUE);
            DataChannel dataChannel4 = this.LL;
            if (dataChannel4 != null) {
                FragmentManager fragmentManager2 = (FragmentManager) dataChannel4.gg0(C748880TZe.class);
                InterfaceC785120Ur0 interfaceC785120Ur0 = this.LLILLJJLI;
                if (interfaceC785120Ur0 != null && (contentView = interfaceC785120Ur0.getContentView()) != null) {
                    context = contentView.getContext();
                } else {
                    context = null;
                }
                if (fragmentManager2 != null && context != null) {
                    LiveIconView liveIconView = new LiveIconView(context, null);
                    liveIconView.setIconAttr(R.attr.ebd);
                    liveIconView.setIconTintAttr(R.attr.c63);
                    int iLIZIZ = (int) C497740JfY.LIZIZ(32.0f);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iLIZIZ, iLIZIZ);
                    layoutParams.gravity = 17;
                    C786410Ut5.w6(liveIconView, layoutParams);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(1);
                    gradientDrawable.setColor(C20736316Cj.LIZIZ(R.attr.eyf, context));
                    FrameLayout frameLayout = new FrameLayout(context);
                    frameLayout.setBackground(gradientDrawable);
                    int iLIZIZ2 = (int) C497740JfY.LIZIZ(60.0f);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iLIZIZ2, iLIZIZ2);
                    layoutParams2.topMargin = (int) C497740JfY.LIZIZ(32.0f);
                    layoutParams2.gravity = 1;
                    C786410Ut5.a6(frameLayout, layoutParams2);
                    frameLayout.addView(liveIconView);
                    String strLJIJI = C497740JfY.LJIJI(2131854383);
                    String strLJIJI2 = C497740JfY.LJIJI(2131854382);
                    String strLJIJI3 = C497740JfY.LJIJI(2131854381);
                    C1391960mKI c1391960mKI = new C1391960mKI();
                    c1391960mKI.LJFF = frameLayout;
                    c1391960mKI.LIZ = false;
                    c1391960mKI.LJII = strLJIJI;
                    c1391960mKI.LJIIIIZZ = strLJIJI2;
                    c1391960mKI.LIZIZ(strLJIJI3, new AwS629S0100000_15(this, 101));
                    TuxPanel tuxPanel = c1391960mKI.LIZ().LIZ;
                    tuxPanel.showNow(fragmentManager2, "RandomMatchSwitchGuide");
                    View view2 = tuxPanel.getView();
                    if (view2 != null && (viewFindViewById = view2.findViewById(R.id.bru)) != null) {
                        ViewGroup.LayoutParams layoutParams3 = viewFindViewById.getLayoutParams();
                        if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                            marginLayoutParams.topMargin = 0;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        C948880ane c948880ane = C948880ane.LIZIZ;
        RandomMatchGuestViewModel randomMatchGuestViewModel4 = this.LLILLL;
        if (randomMatchGuestViewModel4 != null && (mutableLiveData = randomMatchGuestViewModel4.LLILLJJLI) != null && (value = mutableLiveData.getValue()) != null) {
            enumC948930anj3 = value.LIZ;
        }
        if (enumC948930anj3 == enumC948930anj4) {
            DataChannel dataChannel5 = this.LL;
            if (dataChannel5 == null) {
                return;
            }
            dataChannel5.LC0(LinkMicMatchAutoShowMatchDialogEvent.class, new C927160aEc(2, c948880ane));
            return;
        }
        RandomMatchGuestViewModel randomMatchGuestViewModel5 = this.LLILLL;
        if (randomMatchGuestViewModel5 == null) {
            return;
        }
        randomMatchGuestViewModel5.CQ2(C948990anp.LIZ(1), c948880ane);
    }

    @Override // X.InterfaceC1102810env
    public final void LIZIZ(C1099960ejK c1099960ejK, C945840aik c945840aik) {
        C1324720kZq c1324720kZq;
        String str;
        EnterRoomConfig enterRoomConfig;
        EnterRoomConfig.RoomsData roomsData;
        Fragment fragment;
        RandomMatchGuestViewModel randomMatchGuestViewModel;
        MutableLiveData<C948850anb> mutableLiveData;
        this.LL = c1099960ejK.LIZJ;
        this.LLILLJJLI = c945840aik;
        View view = c945840aik.LIZIZ;
        if (view != null) {
            c1324720kZq = (C1324720kZq) view.findViewById(R.id.y74);
        } else {
            c1324720kZq = null;
        }
        this.LLILZIL = c1324720kZq;
        C1324720kZq c1324720kZq2 = this.LLILZIL;
        if (c1324720kZq2 != null) {
            C786410Ut5.h5(c1324720kZq2, 0.75f);
        }
        LJFF(this.LLILZ);
        LifecycleOwner lifecycleOwner = c1099960ejK.LIZIZ;
        if ((lifecycleOwner instanceof Fragment) && (fragment = (Fragment) lifecycleOwner) != null) {
            DataChannel dataChannel = this.LL;
            if (dataChannel != null) {
                randomMatchGuestViewModel = (RandomMatchGuestViewModel) ViewModelProviders.of(fragment, new C948870and(dataChannel)).get(RandomMatchGuestViewModel.class);
            } else {
                randomMatchGuestViewModel = null;
            }
            this.LLILLL = randomMatchGuestViewModel;
            if (randomMatchGuestViewModel != null && (mutableLiveData = randomMatchGuestViewModel.LLILLJJLI) != null) {
                mutableLiveData.observe(fragment, this.LLJ);
            }
        }
        if (!InterfaceC1106030et7.T9.LIZIZ().booleanValue()) {
            AwS559S0100000_15 awS559S0100000_15 = new AwS559S0100000_15(this, 1211);
            EnterRoomLinkSession enterRoomLinkSessionLIZ = C0IL2.LIZ.LIZ();
            if (enterRoomLinkSessionLIZ != null && (enterRoomConfig = enterRoomLinkSessionLIZ.mEnterRoomConfig) != null && (roomsData = enterRoomConfig.mRoomsData) != null) {
                str = roomsData.shareIntent;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str, "multi_guest_invite_random_match_apply")) {
                this.LLILZLL = (C11JF) C11NZ.LJLJJLL(10L, TimeUnit.SECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS178S0100000_9(awS559S0100000_15, 87));
                DataChannel dataChannel2 = this.LL;
                if (dataChannel2 != null) {
                    dataChannel2.CQ2(MultiGuestPreviewReadyDestroyEvent.class, this, new AwS381S0200000_15(this, awS559S0100000_15, 192));
                }
            } else {
                awS559S0100000_15.invoke();
            }
        }
        C947520alS.LIZIZ(null, "start", "show", "bottom_bar_change");
    }

    @Override // X.InterfaceC1102810env
    public final void LIZLLL(C1099960ejK c1099960ejK, InterfaceC785120Ur0 interfaceC785120Ur0) {
        MutableLiveData<C948850anb> mutableLiveData;
        C11JF c11jf = this.LLILZLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLILZLL = null;
        RandomMatchGuestViewModel randomMatchGuestViewModel = this.LLILLL;
        if (randomMatchGuestViewModel != null && (mutableLiveData = randomMatchGuestViewModel.LLILLJJLI) != null) {
            mutableLiveData.removeObserver(this.LLJ);
        }
        DataChannel dataChannel = this.LL;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        this.LLILLL = null;
        this.LLILLJJLI = null;
    }
}
