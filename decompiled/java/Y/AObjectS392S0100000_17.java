package Y;

import X.AbstractC1106180etM;
import X.AbstractC1110520f0M;
import X.C0QSJ;
import X.C0UZS;
import X.C1078190eAD;
import X.C1078200eAE;
import X.C1078610eAt;
import X.C1082790eHd;
import X.C1099200ei6;
import X.C1103540ep6;
import X.C1106110etF;
import X.C1110490f0J;
import X.C1111930f2d;
import X.C1146990fxB;
import X.C1147000fxC;
import X.C1151310g49;
import X.C1161920gLG;
import X.C11JF;
import X.C11NZ;
import X.C1701940uOG;
import X.C20743416Fc;
import X.C500260Jjc;
import X.C687700QyG;
import X.C786410Ut5;
import X.EnumC1083180eIG;
import X.InterfaceC1112050f2p;
import X.InterfaceC2217461Bqa;
import X.InterfaceC420801kM;
import android.os.SystemClock;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.feed.api.TopLiveSkylightVisibilityChannel;
import com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.android.livesdk.chatroom.ui.LandscapeAudienceInteractionFragment;
import com.bytedance.android.livesdk.chatroom.ui.PortraitAudienceInteractionFragment;
import com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget;
import com.bytedance.android.livesdk.dataChannel.MuteMicChannel;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.PackageListAbility;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.PanelHostAbility;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.TouchPointAbility;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.packages.PackageListAssem;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.packages.PackageListViewModel;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.recharge.RechargeBtnAssem;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.recharge.RechargeBtnViewModel;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.recharge.banner.RechargeBannerAssem;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.recharge.banner.RechargeBannerViewModel;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.rechargeconsumption.banner.TaskProgressBannerAssem;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.rechargeconsumption.banner.TaskProgressViewModel;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.rechargeconsumption.panels.RechargeTaskPanel;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarNoTitleShareCountEnable;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarUIConfigOpt;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenFirstMessagesReleaseSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes18.dex */
public class AObjectS392S0100000_17 implements Function0 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case 16:
                return invoke$16(this);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this);
            case 21:
                return invoke$21(this);
            case 22:
                return invoke$22(this);
            case 23:
                return invoke$23(this);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this);
            case 25:
                return invoke$25(this);
            case 26:
                return invoke$26(this);
            case 27:
                return invoke$27(this);
            case 28:
                return invoke$28(this);
            case 29:
                return invoke$29(this);
            case 30:
                return invoke$30(this);
            case 31:
                return invoke$31(this);
            case 32:
                return invoke$32(this);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this);
            case 35:
                return invoke$35(this);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this);
            case 37:
                return invoke$37(this);
            case 38:
                return invoke$38(this);
            case 39:
                return invoke$39(this);
            case 40:
                return invoke$40(this);
            case 41:
                return invoke$41(this);
            case 42:
                return invoke$42(this);
            case 43:
                return invoke$43(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS392S0100000_17 aObjectS392S0100000_17) {
        RechargeTaskPanel rechargeTaskPanel = (RechargeTaskPanel) aObjectS392S0100000_17.l0;
        String str = RechargeTaskPanel._pnsPageId;
        return new TaskProgressViewModel(rechargeTaskPanel.yS());
    }

    public static final Object invoke$1(AObjectS392S0100000_17 aObjectS392S0100000_17) {
        ((C1110490f0J) aObjectS392S0100000_17.l0).LLLFFI();
        return Unit.LIZ;
    }

    public static final Object invoke$10(AObjectS392S0100000_17 aObjectS392S0100000_17) {
        ((AbsAudienceInteractionFragment) aObjectS392S0100000_17.l0).YS();
        return null;
    }

    public static final Object invoke$11(AObjectS392S0100000_17 aObjectS392S0100000_17) {
        ((AbsAudienceInteractionFragment) aObjectS392S0100000_17.l0).sT();
        return null;
    }

    public static final Object invoke$12(AObjectS392S0100000_17 aObjectS392S0100000_17) {
        ((AbsAudienceInteractionFragment) aObjectS392S0100000_17.l0).G8();
        return null;
    }

    public static final Object invoke$13(AObjectS392S0100000_17 aObjectS392S0100000_17) {
        PortraitAudienceInteractionFragment portraitAudienceInteractionFragment = (PortraitAudienceInteractionFragment) aObjectS392S0100000_17.l0;
        portraitAudienceInteractionFragment.RU(portraitAudienceInteractionFragment.LLILLJJLI);
        return null;
    }

    public static final Object invoke$14(AObjectS392S0100000_17 aObjectS392S0100000_17) {
        ((AbsAudienceInteractionFragment) aObjectS392S0100000_17.l0).bf();
        return null;
    }

    public static final Object invoke$15(AObjectS392S0100000_17 aObjectS392S0100000_17) {
        PortraitAudienceInteractionFragment portraitAudienceInteractionFragment = (PortraitAudienceInteractionFragment) aObjectS392S0100000_17.l0;
        portraitAudienceInteractionFragment.getClass();
        new C1078200eAE(portraitAudienceInteractionFragment).LIZ();
        return null;
    }

    public static final Object invoke$16(AObjectS392S0100000_17 aObjectS392S0100000_17) {
        ((AbsAudienceInteractionFragment) aObjectS392S0100000_17.l0).XS();
        return null;
    }

    public static final Object invoke$17(AObjectS392S0100000_17 aObjectS392S0100000_17) {
        ((AbsAudienceInteractionFragment) aObjectS392S0100000_17.l0).ET();
        return null;
    }

    public static final Object invoke$18(AObjectS392S0100000_17 aObjectS392S0100000_17) {
        PortraitAudienceInteractionFragment portraitAudienceInteractionFragment = (PortraitAudienceInteractionFragment) aObjectS392S0100000_17.l0;
        portraitAudienceInteractionFragment.getClass();
        new C1078190eAD(portraitAudienceInteractionFragment).LIZ();
        return null;
    }

    public static final Object invoke$19(AObjectS392S0100000_17 aObjectS392S0100000_17) {
        ((PortraitAudienceInteractionFragment) aObjectS392S0100000_17.l0).si();
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS392S0100000_17 aObjectS392S0100000_17) {
        return Boolean.valueOf(((AbsAudienceInteractionFragment) aObjectS392S0100000_17.l0).HS());
    }

    public static final Object invoke$20(AObjectS392S0100000_17 aObjectS392S0100000_17) {
        ((AbsAudienceInteractionFragment) aObjectS392S0100000_17.l0).gT();
        return null;
    }

    public static final Object invoke$21(AObjectS392S0100000_17 aObjectS392S0100000_17) {
        TextView textView = ((CommentWidget) aObjectS392S0100000_17.l0).LLIZLLLIL;
        if (textView != null) {
            textView.requestLayout();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$22(AObjectS392S0100000_17 aObjectS392S0100000_17) {
        return ((InterfaceC1112050f2p) aObjectS392S0100000_17.l0).pw();
    }

    public static final Object invoke$23(AObjectS392S0100000_17 aObjectS392S0100000_17) {
        C1111930f2d c1111930f2d = (C1111930f2d) aObjectS392S0100000_17.l0;
        c1111930f2d.LLLLLZ.LIZIZ.removeCallbacks(c1111930f2d.LLZLI);
        c1111930f2d.LJLLLL(c1111930f2d.LLJIJIL);
        c1111930f2d.LLLLLLZ = SystemClock.elapsedRealtime();
        c1111930f2d.LLZ.getClass();
        if (LivePublicScreenFirstMessagesReleaseSetting.INSTANCE.hideFoldArea()) {
            c1111930f2d.LLLLLZ.LIZIZ.removeCallbacks(c1111930f2d.LLZLL);
            c1111930f2d.LLLLLZ.LIZ(c1111930f2d.LLJILJILJ, c1111930f2d.LLZLL);
        }
        c1111930f2d.LLLLILI = true;
        return Unit.LIZ;
    }

    public static final Object invoke$24(AObjectS392S0100000_17 aObjectS392S0100000_17) {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) aObjectS392S0100000_17.l0;
        String str = LiveRoomUserInfoWidget.Q;
        liveRoomUserInfoWidget.J2();
        return Unit.LIZ;
    }

    public static final Object invoke$25(AObjectS392S0100000_17 aObjectS392S0100000_17) {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) aObjectS392S0100000_17.l0;
        String str = LiveRoomUserInfoWidget.Q;
        if (liveRoomUserInfoWidget.dataChannel != null) {
            liveRoomUserInfoWidget.LLLLZ.LIZ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$26(AObjectS392S0100000_17 aObjectS392S0100000_17) {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) aObjectS392S0100000_17.l0;
        String str = LiveRoomUserInfoWidget.Q;
        liveRoomUserInfoWidget.J2();
        return Unit.LIZ;
    }

    public static final Object invoke$27(AObjectS392S0100000_17 aObjectS392S0100000_17) {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) aObjectS392S0100000_17.l0;
        String str = LiveRoomUserInfoWidget.Q;
        liveRoomUserInfoWidget.G1(256);
        return Unit.LIZ;
    }

    public static final Object invoke$28(AObjectS392S0100000_17 aObjectS392S0100000_17) {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) aObjectS392S0100000_17.l0;
        String str = LiveRoomUserInfoWidget.Q;
        liveRoomUserInfoWidget.H1(16);
        return Unit.LIZ;
    }

    public static final Object invoke$29(AObjectS392S0100000_17 aObjectS392S0100000_17) {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) aObjectS392S0100000_17.l0;
        String str = LiveRoomUserInfoWidget.Q;
        liveRoomUserInfoWidget.H1(256);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AObjectS392S0100000_17 aObjectS392S0100000_17) {
        return ((AbsAudienceInteractionFragment) aObjectS392S0100000_17.l0).LLJIJIL.gg0(C0UZS.class);
    }

    public static final Object invoke$30(AObjectS392S0100000_17 aObjectS392S0100000_17) {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) aObjectS392S0100000_17.l0;
        String str = LiveRoomUserInfoWidget.Q;
        liveRoomUserInfoWidget.G1(16);
        return Unit.LIZ;
    }

    public static final Object invoke$31(AObjectS392S0100000_17 aObjectS392S0100000_17) {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) aObjectS392S0100000_17.l0;
        String str = LiveRoomUserInfoWidget.Q;
        liveRoomUserInfoWidget.c2();
        return Unit.LIZ;
    }

    public static final Object invoke$32(AObjectS392S0100000_17 aObjectS392S0100000_17) {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) aObjectS392S0100000_17.l0;
        String str = LiveRoomUserInfoWidget.Q;
        liveRoomUserInfoWidget.t2();
        return Unit.LIZ;
    }

    public static final Object invoke$33(AObjectS392S0100000_17 aObjectS392S0100000_17) {
        C1099200ei6 c1099200ei6 = ((LiveRoomUserInfoWidget) aObjectS392S0100000_17.l0).LLLLZ;
        if (c1099200ei6 != null) {
            c1099200ei6.LIZ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$34(AObjectS392S0100000_17 aObjectS392S0100000_17) {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) aObjectS392S0100000_17.l0;
        String str = LiveRoomUserInfoWidget.Q;
        liveRoomUserInfoWidget.U2();
        return Unit.LIZ;
    }

    public static final Object invoke$35(AObjectS392S0100000_17 aObjectS392S0100000_17) {
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) aObjectS392S0100000_17.l0;
        String str = LiveRoomUserInfoWidget.Q;
        DataChannel dataChannel = liveRoomUserInfoWidget.dataChannel;
        if (dataChannel != null) {
            Boolean bool = Boolean.TRUE;
            liveRoomUserInfoWidget.x2(bool.equals(dataChannel.gg0(MuteMicChannel.class)));
            liveRoomUserInfoWidget.Q2(liveRoomUserInfoWidget.LLZLL, bool, bool);
            liveRoomUserInfoWidget.LLLLZ.LIZ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$36(AObjectS392S0100000_17 aObjectS392S0100000_17) {
        int repostIconRes;
        C20743416Fc c20743416Fc;
        FrameLayout frameLayout;
        C1106110etF c1106110etF = (C1106110etF) aObjectS392S0100000_17.l0;
        if (c1106110etF.LLJJ != null && !c1106110etF.LLJLILLLLZIIL) {
            c1106110etF.LIZIZ();
            c1106110etF.LIZ();
            c1106110etF.LLJLILLLLZIIL = true;
            ViewGroup.LayoutParams layoutParams = c1106110etF.LLJJ.getLayoutParams();
            if (layoutParams != null) {
                c1106110etF.LLL = layoutParams.width;
                c1106110etF.LLLF = layoutParams.height;
                layoutParams.width = -1;
                layoutParams.height = -1;
                C786410Ut5.w6(c1106110etF.LLJJ, layoutParams);
            }
            boolean z = false;
            if (LiveToolbarNoTitleShareCountEnable.INSTANCE.isEnable() && c1106110etF.LLJJ.getVisibility() == 8) {
                C786410Ut5.LLJJIJIL(c1106110etF.LLJJ, 0);
                if (c1106110etF.LJFF() && (frameLayout = c1106110etF.LLLILZJ) != null && (frameLayout instanceof C1103540ep6)) {
                    ((C1103540ep6) frameLayout).LIZ();
                }
                AbstractC1106180etM abstractC1106180etM = c1106110etF.LLJJJJJIL;
                if (abstractC1106180etM != null && abstractC1106180etM.getVisibility() == 0) {
                    C786410Ut5.Y1(c1106110etF.LLJJJJJIL, 8);
                }
                AbstractC1106180etM abstractC1106180etM2 = c1106110etF.LLJJJJLIIL;
                if (abstractC1106180etM2 != null && abstractC1106180etM2.getVisibility() == 0) {
                    C786410Ut5.Y1(c1106110etF.LLJJJJLIIL, 8);
                }
            }
            if (LiveToolbarUIConfigOpt.INSTANCE.overlayTextOnTheShare() && (c20743416Fc = c1106110etF.LLJJIJIL) != null) {
                C500260Jjc.LJIILIIL(c20743416Fc);
            }
            IHostShare iHostShare = (IHostShare) C1161920gLG.LIZJ(IHostShare.class);
            if (iHostShare != null && (repostIconRes = iHostShare.getRepostIconRes()) != 0) {
                c1106110etF.LLJJ.setIcon(repostIconRes);
                c1106110etF.LLJJ.LJ();
            }
            FrameLayout frameLayout2 = c1106110etF.LLLILZJ;
            if (frameLayout2 != null && (frameLayout2 instanceof C1103540ep6)) {
                if (frameLayout2.getBackground() != null) {
                    z = true;
                }
                c1106110etF.LLJZIJLIL = z;
                c1106110etF.LLLILZJ.setBackground(null);
            } else {
                c1106110etF.LLJZIJLIL = false;
            }
            c1106110etF.LLJLLIL = c1106110etF.LLJJ.getOutlineProvider();
            c1106110etF.LLJLLL = c1106110etF.LLJJ.getClipToOutline();
            c1106110etF.LLJZ = c1106110etF.LLJJ.getScaleType();
            c1106110etF.LLJJ.setScaleType(ImageView.ScaleType.CENTER_CROP);
            c1106110etF.LLJJ.setOutlineProvider(c1106110etF.LLLFF);
            c1106110etF.LLJJ.setClipToOutline(true);
            c1106110etF.LLJJ.invalidateOutline();
            c1106110etF.LLJJ.animate().cancel();
            C786410Ut5.i5(c1106110etF.LLJJ, 0.0f);
            c1106110etF.LLJJ.animate().alpha(1.0f).setDuration(200L).start();
            InterfaceC420801kM interfaceC420801kMLJJLL = C11NZ.LJLJJLL(5200L, TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS186S0100000_17(c1106110etF, 105), new AfS132S0000000_7(37));
            c1106110etF.LLJLL = (C11JF) interfaceC420801kMLJJLL;
            c1106110etF.LLJILJILJ.LIZ(interfaceC420801kMLJJLL);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$37(AObjectS392S0100000_17 aObjectS392S0100000_17) {
        C1106110etF c1106110etF = (C1106110etF) aObjectS392S0100000_17.l0;
        c1106110etF.LJ(c1106110etF.LL.getContext());
        return Unit.LIZ;
    }

    public static final Object invoke$38(AObjectS392S0100000_17 aObjectS392S0100000_17) {
        ((AbstractC1110520f0M) aObjectS392S0100000_17.l0).LLLFFI();
        return Unit.LIZ;
    }

    public static final Object invoke$39(AObjectS392S0100000_17 aObjectS392S0100000_17) {
        PanelHostAbility panelHostAbility;
        PackageListAssem packageListAssem = (PackageListAssem) aObjectS392S0100000_17.l0;
        C1147000fxC c1147000fxC = PackageListAssem.LLJJLIIIJLLLLLLLZ;
        C0QSJ c0qsjLo = packageListAssem.Lo();
        TouchPointAbility touchPointAbility = null;
        if (c0qsjLo != null) {
            panelHostAbility = (PanelHostAbility) c0qsjLo.getAbility(PanelHostAbility.class);
            C687700QyG.LJ(panelHostAbility, PanelHostAbility.class);
        } else {
            panelHostAbility = null;
        }
        C0QSJ c0qsjLo2 = packageListAssem.Lo();
        if (c0qsjLo2 != null) {
            touchPointAbility = (TouchPointAbility) c0qsjLo2.getAbility(TouchPointAbility.class);
        }
        return new PackageListViewModel(panelHostAbility, touchPointAbility);
    }

    public static final Object invoke$4(AObjectS392S0100000_17 aObjectS392S0100000_17) {
        return ((AbsAudienceInteractionFragment) aObjectS392S0100000_17.l0).LLJIJIL.gg0(C0UZS.class);
    }

    public static final Object invoke$40(AObjectS392S0100000_17 aObjectS392S0100000_17) {
        PanelHostAbility panelHostAbility;
        TouchPointAbility touchPointAbility;
        RechargeBtnAssem rechargeBtnAssem = (RechargeBtnAssem) aObjectS392S0100000_17.l0;
        C1151310g49 c1151310g49 = RechargeBtnAssem.LLJJI;
        C0QSJ c0qsjGo = rechargeBtnAssem.Go();
        PackageListAbility packageListAbility = null;
        if (c0qsjGo != null) {
            panelHostAbility = (PanelHostAbility) c0qsjGo.getAbility(PanelHostAbility.class);
            C687700QyG.LJ(panelHostAbility, PanelHostAbility.class);
        } else {
            panelHostAbility = null;
        }
        C0QSJ c0qsjGo2 = rechargeBtnAssem.Go();
        if (c0qsjGo2 != null) {
            touchPointAbility = (TouchPointAbility) c0qsjGo2.getAbility(TouchPointAbility.class);
        } else {
            touchPointAbility = null;
        }
        C0QSJ c0qsjGo3 = rechargeBtnAssem.Go();
        if (c0qsjGo3 != null) {
            packageListAbility = (PackageListAbility) c0qsjGo3.getAbility(PackageListAbility.class);
            C687700QyG.LJ(packageListAbility, PackageListAbility.class);
        }
        return new RechargeBtnViewModel(panelHostAbility, touchPointAbility, packageListAbility);
    }

    public static final Object invoke$41(AObjectS392S0100000_17 aObjectS392S0100000_17) {
        TouchPointAbility touchPointAbility;
        RechargeBannerAssem rechargeBannerAssem = (RechargeBannerAssem) aObjectS392S0100000_17.l0;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = RechargeBannerAssem.LLJJ;
        C0QSJ c0qsjLo = rechargeBannerAssem.Lo();
        if (c0qsjLo != null) {
            touchPointAbility = (TouchPointAbility) c0qsjLo.getAbility(TouchPointAbility.class);
        } else {
            touchPointAbility = null;
        }
        return new RechargeBannerViewModel(touchPointAbility);
    }

    public static final Object invoke$42(AObjectS392S0100000_17 aObjectS392S0100000_17) {
        ((PublicScreenWidget) aObjectS392S0100000_17.l0).LLJLLIL.LIZJ();
        return Unit.LIZ;
    }

    public static final Object invoke$43(AObjectS392S0100000_17 aObjectS392S0100000_17) {
        TaskProgressBannerAssem taskProgressBannerAssem = (TaskProgressBannerAssem) aObjectS392S0100000_17.l0;
        C1146990fxB c1146990fxB = TaskProgressBannerAssem.LLJILJILJ;
        return new TaskProgressViewModel(taskProgressBannerAssem.Go());
    }

    public static final Object invoke$5(AObjectS392S0100000_17 aObjectS392S0100000_17) {
        return ((AbsAudienceInteractionFragment) aObjectS392S0100000_17.l0).LLJIJIL.gg0(C0UZS.class);
    }

    public static final Object invoke$6(AObjectS392S0100000_17 aObjectS392S0100000_17) {
        return Boolean.valueOf(((AbsAudienceInteractionFragment) aObjectS392S0100000_17.l0).LLJJIJIL);
    }

    public static final Object invoke$7(AObjectS392S0100000_17 aObjectS392S0100000_17) {
        LandscapeAudienceInteractionFragment landscapeAudienceInteractionFragment = (LandscapeAudienceInteractionFragment) aObjectS392S0100000_17.l0;
        String str = LandscapeAudienceInteractionFragment._pnsPageId;
        Room room = landscapeAudienceInteractionFragment.LLJILJIL;
        if (room != null) {
            C1078610eAt.LIZ(room.getId(), false, EnumC1083180eIG.BACK_BUTTON);
        }
        landscapeAudienceInteractionFragment.LLIZLLLIL.LJIIIZ.LJI(true, EnumC1083180eIG.OTHER);
        landscapeAudienceInteractionFragment.LLZZ.hide();
        DataChannel dataChannel = landscapeAudienceInteractionFragment.LLJIJIL;
        if (dataChannel != null) {
            dataChannel.SX0(C1082790eHd.class, Boolean.FALSE);
            return null;
        }
        return null;
    }

    public static final Object invoke$8(AObjectS392S0100000_17 aObjectS392S0100000_17) {
        ((AbsAudienceInteractionFragment) aObjectS392S0100000_17.l0).getClass();
        Object objGg0 = DataChannelGlobal.LLILZ.gg0(TopLiveSkylightVisibilityChannel.class);
        if (objGg0 == null) {
            return Boolean.FALSE;
        }
        return objGg0;
    }

    public static final Object invoke$9(AObjectS392S0100000_17 aObjectS392S0100000_17) {
        return ((AbsAudienceInteractionFragment) aObjectS392S0100000_17.l0).VT();
    }

    public AObjectS392S0100000_17(C1106110etF c1106110etF, int i) {
        this.$t = i;
        if (36 - i != 0) {
            this.l0 = c1106110etF;
        } else {
            this.l0 = c1106110etF;
        }
    }

    public AObjectS392S0100000_17(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
