package Y;

import X.AbstractC1604290rql;
import X.C001U;
import X.C0CAU;
import X.C0RD4;
import X.C0RRR;
import X.C0SZ8;
import X.C0X35;
import X.C0ZPH;
import X.C1010120cOQ;
import X.C1017070cZd;
import X.C1022290ci3;
import X.C1054950dYj;
import X.C1386360mBG;
import X.C1389890mGx;
import X.C13LP;
import X.C1440005kM;
import X.C1557380qd6;
import X.C1558360qeg;
import X.C1567820qtw;
import X.C1567900qu4;
import X.C1568050quJ;
import X.C1576640r8A;
import X.C1578690rBT;
import X.C1583510rJF;
import X.C1586480rO2;
import X.C1587030rOv;
import X.C1587220rPE;
import X.C1587270rPJ;
import X.C1587710rQ1;
import X.C1587810rQB;
import X.C1589640rT8;
import X.C1591060rVQ;
import X.C1592370rXX;
import X.C1599630rjF;
import X.C1599920rji;
import X.C15O7;
import X.C1600950rlN;
import X.C1604250rqh;
import X.C1607740rwK;
import X.C1608880ryA;
import X.C1610840s1K;
import X.C1620590sH3;
import X.C19EG;
import X.C20270314Td;
import X.C20441214yg;
import X.C2188811AlT;
import X.C291001Au;
import X.C319860CgK;
import X.C337180DJs;
import X.C582610Mt9;
import X.C695930RRn;
import X.C736510Sun;
import X.C786410Ut5;
import X.EnumC1256840ioM;
import X.InterfaceC1264960j1S;
import X.InterfaceC1577520r9a;
import X.InterfaceC1588500rRI;
import X.InterfaceC1589720rTG;
import X.InterfaceC1600130rk3;
import X.InterfaceC1608890ryB;
import X.InterfaceC20660615sy;
import X.InterfaceC662550Pyn;
import X.InterfaceC712570RxH;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.widget.NextLiveData;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hox.Hox;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.tiktok.homepage.mainfragment.NonPersonalizedVM;
import com.ss.android.ugc.aweme.base.ui.assem.FeedSkylightBottomAssem;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.OnThisDayData;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility;
import com.ss.android.ugc.aweme.detail.ui.DetailFragment;
import com.ss.android.ugc.aweme.detail.ui.friends.FriendsDetailPageComponent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment;
import com.ss.android.ugc.aweme.feed.vm.VideoStateViewModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility;
import com.ss.android.ugc.aweme.friendstab.protocol.ISocialTabProtocol;
import com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.ITabStrip;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.ISkylightOutBridge;
import com.ss.android.ugc.aweme.main.IMainPageFragment;
import com.ss.android.ugc.aweme.main.assems.mainfragment.HomeViewPagerAssem;
import com.ss.android.ugc.aweme.main.assems.mainfragment.NonPersonalizedAssem;
import com.ss.android.ugc.aweme.notice.api.ab.AddOptionForGuidanceExp;
import com.ss.android.ugc.aweme.profile.ListLiveCircleItemVM;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.series.feed.ISeriesFeedService;
import com.ss.android.ugc.aweme.series.feed.profile.assme.SeriesProfileTabAssem;
import com.ss.android.ugc.aweme.series.feed.tab.feed.SeriesFeedVM;
import com.ss.android.ugc.aweme.series.feed.tab.v2.DramaTopTabMainFragment;
import com.ss.android.ugc.aweme.series.innerfeed.panel.PaidContentVideoPanel;
import com.ss.android.ugc.aweme.series.seriesdetail.assem.SeriesDetailDescriptionAssem;
import com.ss.android.ugc.aweme.series.serieslist.viewmodel.SeriesListAssemViewModel;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.stemfeed.ui.StemFeedFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView;
import com.ss.android.ugc.aweme.story.avatar.service.IStoryAvatarPreloadService;
import com.ss.android.ugc.aweme.story.inbox.StoryInboxPreloadComponent;
import com.ss.android.ugc.aweme.story.reveal.IStoryRevealService;
import com.ss.android.ugc.aweme.story.userpanel.ui.dm.DmListContentAssem;
import com.ss.android.ugc.feed.platform.panel.autoscroll.AutoScrollComponent;
import com.ss.android.ugc.feed.platform.panel.plugindownloading.PluginDownloadBarComponent;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.tts.oecverify.BdTuring;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS34S0010000_21;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes25.dex */
public class AObserverS226S0100000_24 implements Observer {
    public final int $t;
    public Object l0;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) throws Throwable {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
            case 4:
                onChanged$4(this, obj);
                break;
            case 5:
                onChanged$5(this, obj);
                break;
            case 6:
                onChanged$6(this, obj);
                break;
            case 7:
                onChanged$7(this, obj);
                break;
            case 8:
                onChanged$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onChanged$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onChanged$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onChanged$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onChanged$12(this, obj);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onChanged$13(this, obj);
                break;
            case 14:
                onChanged$14(this, obj);
                break;
            case 15:
                onChanged$15(this, obj);
                break;
            case 16:
                onChanged$16(this, obj);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onChanged$17(this, obj);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onChanged$18(this, obj);
                break;
            case 19:
                onChanged$19(this, obj);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onChanged$20(this, obj);
                break;
            case 21:
                onChanged$21(this, obj);
                break;
            case 22:
                onChanged$22(this, obj);
                break;
            case 23:
                onChanged$23(this, obj);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                onChanged$24(this, obj);
                break;
            case 25:
                onChanged$25(this, obj);
                break;
            case 26:
                onChanged$26(this, obj);
                break;
            case 27:
                onChanged$27(this, obj);
                break;
            case 28:
                onChanged$28(this, obj);
                break;
            case 29:
                onChanged$29(this, obj);
                break;
            case 30:
                onChanged$30(this, obj);
                break;
            case 31:
                onChanged$31(this, obj);
                break;
            case 32:
                onChanged$32(this, obj);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                onChanged$33(this, obj);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                onChanged$34(this, obj);
                break;
            case 35:
                onChanged$35(this, obj);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                onChanged$36(this, obj);
                break;
            case 37:
                onChanged$37(this, obj);
                break;
        }
    }

    public AObserverS226S0100000_24(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onChanged$0(AObserverS226S0100000_24 aObserverS226S0100000_24, Object obj) {
        int iIntValue;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Integer num = (Integer) obj;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        C1592370rXX c1592370rXX = (C1592370rXX) aObserverS226S0100000_24.l0;
        if (c1592370rXX.LLJILJIL != iIntValue) {
            c1592370rXX.LLJILJIL = iIntValue;
            C1592370rXX c1592370rXX2 = (C1592370rXX) aObserverS226S0100000_24.l0;
            ViewGroup.LayoutParams layoutParams = c1592370rXX2.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null && marginLayoutParams.getMarginEnd() != iIntValue) {
                marginLayoutParams.setMarginEnd(iIntValue);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1592370rXX2);
                c1592370rXX2.setLayoutParams(marginLayoutParams);
            }
            ((C1592370rXX) aObserverS226S0100000_24.l0).LIZIZ();
            ((C1592370rXX) aObserverS226S0100000_24.l0).LIZ();
        }
    }

    public static final void onChanged$1(AObserverS226S0100000_24 aObserverS226S0100000_24, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        if (iIntValue != 0) {
            if (iIntValue == 1) {
                FriendsDetailPageComponent friendsDetailPageComponent = (FriendsDetailPageComponent) aObserverS226S0100000_24.l0;
                if (friendsDetailPageComponent.LLLL > 0) {
                    friendsDetailPageComponent.Fp();
                    return;
                }
                return;
            }
            return;
        }
        ((FriendsDetailPageComponent) aObserverS226S0100000_24.l0).LLLL = System.currentTimeMillis();
    }

    public static final void onChanged$10(AObserverS226S0100000_24 aObserverS226S0100000_24, Object obj) {
        String string;
        String strLIZIZ;
        C0ZPH c0zph = (C0ZPH) obj;
        if (!c0zph.LIZ) {
            C20270314Td c20270314Td = (C20270314Td) aObserverS226S0100000_24.l0;
            C1620590sH3 c1620590sH3 = IStoryAvatarPreloadService.LIZ;
            String str = c0zph.LIZIZ;
            c1620590sH3.getClass();
            if (str == null || (string = a0.LJLIIIL(str).toString()) == null) {
                string = "";
            }
            if (string.length() == 0) {
                strLIZIZ = "isActive_false";
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("isActive_false:");
                sbLIZ.append(string);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            c20270314Td.LIZ(strLIZIZ);
        }
    }

    public static final void onChanged$11(AObserverS226S0100000_24 aObserverS226S0100000_24, Object obj) {
        MutableLiveData<C582610Mt9> mutableLiveData;
        VideoStateViewModel videoStateViewModel = ((StoryInboxPreloadComponent) aObserverS226S0100000_24.l0).LL;
        if (videoStateViewModel != null && (mutableLiveData = videoStateViewModel.LLILZIL) != null) {
            mutableLiveData.removeObserver(aObserverS226S0100000_24);
        }
        ((StoryInboxPreloadComponent) aObserverS226S0100000_24.l0).bo();
    }

    public static final void onChanged$12(AObserverS226S0100000_24 aObserverS226S0100000_24, Object obj) {
        C1600950rlN c1600950rlNEp;
        AutoScrollComponent autoScrollComponent = (AutoScrollComponent) aObserverS226S0100000_24.l0;
        autoScrollComponent.LLJJIJIL = 1;
        if (!C1386360mBG.LJIIJJI(autoScrollComponent.bp()) && (c1600950rlNEp = autoScrollComponent.ep()) != null && c1600950rlNEp.LIZJ == 1) {
            c1600950rlNEp.LIZIZ = System.currentTimeMillis();
            c1600950rlNEp.LIZJ = 0;
        }
    }

    public static final void onChanged$13(AObserverS226S0100000_24 aObserverS226S0100000_24, Object obj) {
        C1600950rlN c1600950rlNEp;
        AutoScrollComponent autoScrollComponent = (AutoScrollComponent) aObserverS226S0100000_24.l0;
        autoScrollComponent.LLJJIJIL = 1;
        if (!C1386360mBG.LJIIJJI(autoScrollComponent.bp()) && (c1600950rlNEp = autoScrollComponent.ep()) != null && c1600950rlNEp.LIZJ == 1) {
            c1600950rlNEp.LIZIZ = System.currentTimeMillis();
            c1600950rlNEp.LIZJ = 0;
        }
    }

    public static final void onChanged$14(AObserverS226S0100000_24 aObserverS226S0100000_24, Object obj) {
        List<ISocialTabProtocol> listB9;
        String tag;
        boolean zGw0;
        IStoryRevealService iStoryRevealService;
        IFriendsTabLayoutAbility iFriendsTabLayoutAbilityLJFF;
        Pair pair = (Pair) obj;
        if (pair != null) {
            C1589640rT8 c1589640rT8 = C1589640rT8.LIZIZ;
            if (!c1589640rT8.V1()) {
                C1587220rPE.LIZ.getClass();
                String str = "FRIENDS_FEED";
                if (C1587220rPE.LIZLLL()) {
                    C1587270rPJ.LL.getClass();
                    C1587270rPJ.LIZ();
                    if (AddOptionForGuidanceExp.LIZJ > 0 && Intrinsics.LJFF(pair.getSecond(), "publish_landing")) {
                        return;
                    }
                    if (c1589640rT8.F2() || ((iFriendsTabLayoutAbilityLJFF = C1587270rPJ.LJFF()) != null && iFriendsTabLayoutAbilityLJFF.Gw0())) {
                        C1587270rPJ.LJII();
                    }
                } else if (c1589640rT8.F2()) {
                    C1587270rPJ c1587270rPJ = C1587270rPJ.LL;
                    C19EG c19eg = (C19EG) aObserverS226S0100000_24.l0;
                    c1587270rPJ.getClass();
                    C1587270rPJ.LIZJ(c19eg);
                } else {
                    C1587270rPJ c1587270rPJ2 = C1587270rPJ.LL;
                    C19EG c19eg2 = (C19EG) aObserverS226S0100000_24.l0;
                    c1587270rPJ2.getClass();
                    ISocial2TabProtocolAbility iSocial2TabProtocolAbilityLJI = C1583510rJF.LJI(C1558360qeg.LJI(c19eg2, null));
                    if (iSocial2TabProtocolAbilityLJI != null && (listB9 = iSocial2TabProtocolAbilityLJI.b9()) != null && listB9.size() == 1) {
                        ISocialTabProtocol iSocialTabProtocol = (ISocialTabProtocol) C13LP.LJJJLZIJ(0, listB9);
                        if (iSocialTabProtocol != null) {
                            tag = iSocialTabProtocol.getTag();
                        } else {
                            tag = null;
                        }
                        if (Intrinsics.LJFF(tag, "FRIENDS_FEED")) {
                            C1587270rPJ.LIZJ((C19EG) aObserverS226S0100000_24.l0);
                        }
                    }
                }
                ISocial2TabProtocolAbility iSocial2TabProtocolAbilityLJFF = C1583510rJF.LJFF((C19EG) aObserverS226S0100000_24.l0);
                if ((iSocial2TabProtocolAbilityLJFF != null && iSocial2TabProtocolAbilityLJFF.tF0()) || c1589640rT8.F2()) {
                    if (c1589640rT8.LIZ() && !C319860CgK.LIZ()) {
                        ((IMainPageFragment) ServiceManager.get().getService(IMainPageFragment.class)).LJ((C19EG) aObserverS226S0100000_24.l0);
                        C1587270rPJ c1587270rPJ3 = C1587270rPJ.LL;
                        C19EG c19eg3 = (C19EG) aObserverS226S0100000_24.l0;
                        c1587270rPJ3.getClass();
                        C1587270rPJ.LJI(c19eg3);
                    }
                } else {
                    C1587270rPJ c1587270rPJ4 = C1587270rPJ.LL;
                    IFriendsTabLayoutAbility iFriendsTabLayoutAbilityLJFF2 = C1587270rPJ.LJFF();
                    if (iFriendsTabLayoutAbilityLJFF2 != null) {
                        zGw0 = iFriendsTabLayoutAbilityLJFF2.Gw0();
                    } else {
                        zGw0 = false;
                    }
                    if (c1589640rT8.LIZ() && zGw0 && !C319860CgK.LIZ()) {
                        ((IMainPageFragment) ServiceManager.get().getService(IMainPageFragment.class)).LJ((C19EG) aObserverS226S0100000_24.l0);
                        C1587270rPJ.LJI((C19EG) aObserverS226S0100000_24.l0);
                    }
                }
                C1587270rPJ c1587270rPJ5 = C1587270rPJ.LL;
                C19EG c19eg4 = (C19EG) aObserverS226S0100000_24.l0;
                c1587270rPJ5.getClass();
                if (C319860CgK.LIZ() || (iStoryRevealService = (IStoryRevealService) PluggableExtentionKt.pluggableSpi$default(IStoryRevealService.class, false, false, false, 14, null)) == null || !iStoryRevealService.LJIILIIL()) {
                    return;
                }
                if (!c1589640rT8.F2()) {
                    str = "FRIENDS_TAB";
                }
                Fragment fragmentKi = Hox.LLJILJIL.LIZ(c19eg4).Ki(str);
                if (!(fragmentKi instanceof InterfaceC20660615sy) || fragmentKi == null) {
                    return;
                }
                C786410Ut5.LJJZZIII(C0CAU.LIZ, new ARunnableS110S0100000_10(fragmentKi, 95));
            }
        }
    }

    public static final void onChanged$15(AObserverS226S0100000_24 aObserverS226S0100000_24, Object obj) {
        if (Intrinsics.LJFF(((C1567820qtw) obj).LIZ, Boolean.TRUE)) {
            C337180DJs.LIZJ((View) aObserverS226S0100000_24.l0);
        } else {
            C337180DJs.LIZ((View) aObserverS226S0100000_24.l0);
        }
    }

    public static final void onChanged$16(AObserverS226S0100000_24 aObserverS226S0100000_24, Object obj) {
        BaseShortVideoContext baseShortVideoContext;
        VideoPublishEditModel videoPublishEditModel;
        CreativeModel creativeModel;
        OnThisDayData onThisDayData;
        Integer num;
        InterfaceC712570RxH interfaceC712570RxH;
        Object obj2 = ((C0RD4) obj).LIZIZ;
        if (obj2 == null) {
            obj2 = null;
        }
        PublishModel publishModel = (PublishModel) ((Pair) obj2).getSecond();
        if (publishModel != null) {
            baseShortVideoContext = publishModel.editModel;
        } else {
            baseShortVideoContext = null;
        }
        if ((baseShortVideoContext instanceof VideoPublishEditModel) && (videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext) != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (onThisDayData = creativeModel.onThisDayData) != null && onThisDayData.isFromOnThisDay()) {
            if (videoPublishEditModel.getTtStoryUploadModel() != null) {
                num = 0;
            } else {
                num = null;
            }
            C1599920rji.LIZ.getClass();
            if (!C1599920rji.LIZIZ()) {
                C1599630rjF.LIZ.LJ((LifecycleOwner) aObserverS226S0100000_24.l0, true, num);
                C1599920rji.LIZLLL();
                return;
            }
            InterfaceC1600130rk3 interfaceC1600130rk3LIZLLL = ((ISkylightOutBridge) ServiceManager.get().getService(ISkylightOutBridge.class)).LIZLLL((LifecycleOwner) aObserverS226S0100000_24.l0);
            if (!(interfaceC1600130rk3LIZLLL instanceof InterfaceC712570RxH) || (interfaceC712570RxH = (InterfaceC712570RxH) interfaceC1600130rk3LIZLLL) == null) {
                return;
            }
            interfaceC712570RxH.sA1(0, null, false, false);
        }
    }

    public static final void onChanged$17(AObserverS226S0100000_24 aObserverS226S0100000_24, Object obj) {
        C1578690rBT c1578690rBTVR = ((DramaTopTabMainFragment) aObserverS226S0100000_24.l0).VR();
        int iIntValue = ((Integer) obj).intValue();
        View view = c1578690rBTVR.LLJJJ;
        if (view != null && iIntValue == view.getHeight()) {
            return;
        }
        c1578690rBTVR.LLJJJIL = iIntValue;
        View view2 = c1578690rBTVR.LLJJJ;
        if (view2 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = iIntValue;
            C786410Ut5.W5(view2, layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public static final void onChanged$18(AObserverS226S0100000_24 aObserverS226S0100000_24, Object obj) {
        AbstractC1604290rql abstractC1604290rql = (AbstractC1604290rql) obj;
        PluginDownloadBarComponent pluginDownloadBarComponent = (PluginDownloadBarComponent) aObserverS226S0100000_24.l0;
        pluginDownloadBarComponent.getClass();
        C0X35.LJIILL(new ARunnableS124S0100000_24(pluginDownloadBarComponent, 100));
        if (abstractC1604290rql != null) {
            ((PluginDownloadBarComponent) aObserverS226S0100000_24.l0).Jo(abstractC1604290rql);
        }
    }

    public static final void onChanged$19(AObserverS226S0100000_24 aObserverS226S0100000_24, Object obj) {
        if (Intrinsics.LJFF("NOTIFICATION", obj)) {
            C1604250rqh c1604250rqh = C1604250rqh.LIZ;
            C19EG c19eg = (C19EG) aObserverS226S0100000_24.l0;
            c1604250rqh.getClass();
            C1604250rqh.LIZIZ(c19eg, true);
            return;
        }
        if (!Intrinsics.LJFF("HOME", obj)) {
            return;
        }
        C1604250rqh c1604250rqh2 = C1604250rqh.LIZ;
        C19EG c19eg2 = (C19EG) aObserverS226S0100000_24.l0;
        c1604250rqh2.getClass();
        C1604250rqh.LIZIZ(c19eg2, false);
    }

    public static final void onChanged$2(AObserverS226S0100000_24 aObserverS226S0100000_24, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C15O7.LIZJ(new ACallableS429S0100000_24((C1586480rO2) aObserverS226S0100000_24.l0, 0));
        }
    }

    public static final void onChanged$20(AObserverS226S0100000_24 aObserverS226S0100000_24, Object obj) {
        Integer num = (Integer) obj;
        ((FeedSkylightBottomAssem) aObserverS226S0100000_24.l0).LLIZLLLIL = num.intValue();
        ((FeedSkylightBottomAssem) aObserverS226S0100000_24.l0).Go(num.intValue());
    }

    public static final void onChanged$21(AObserverS226S0100000_24 aObserverS226S0100000_24, Object obj) {
        DetailFragmentPanel detailFragmentPanelJQ;
        C0SZ8 c0sz8LJLIL;
        DetailFragmentPanel detailFragmentPanelJQ2;
        C0SZ8 c0sz8LJLIL2;
        IAdSceneService iAdSceneService;
        String aid;
        DetailFragment detailFragment = (DetailFragment) aObserverS226S0100000_24.l0;
        Integer num = (Integer) obj;
        String strCQ2 = detailFragment.LLILLL.CQ2(num.intValue());
        if ("page_profile".equals(strCQ2)) {
            HomePageDataViewModel homePageDataViewModel = detailFragment.LLILZIL;
            String str = homePageDataViewModel.LLILZ;
            Aweme aweme = homePageDataViewModel.LLILZIL;
            String str2 = "";
            if (aweme == null) {
                aid = "";
            } else {
                aid = aweme.getAid();
            }
            C1054950dYj.LIZIZ = str;
            if (aid != null) {
                str2 = aid;
            }
            C1054950dYj.LIZJ = str2;
            C1054950dYj.LIZ = SystemClock.uptimeMillis();
        }
        String strCQ22 = detailFragment.LLILLL.CQ2(num.intValue());
        if ("page_feed".equals(strCQ22) || "page_profile".equals(strCQ22)) {
            if (num.intValue() == 0) {
                C1440005kM.LIZ(new IEvent() { // from class: X.0Oqy
                    @Override // com.ss.android.ugc.governance.eventbus.IEvent
                    public final /* synthetic */ IEvent post() {
                        C1440005kM.LIZ(this);
                        return this;
                    }

                    @Override // com.ss.android.ugc.governance.eventbus.IEvent
                    public final /* synthetic */ IEvent postSticky() {
                        C1440005kM.LIZIZ(this);
                        return this;
                    }
                });
                if (detailFragment.LLJILJILJ != null && detailFragment.OR()) {
                    detailFragment.LLJILJILJ.onResume();
                }
                DefaultLifecycleObserver defaultLifecycleObserver = detailFragment.LLJJJJJIL;
                if (defaultLifecycleObserver != null) {
                    defaultLifecycleObserver.onStart(detailFragment);
                    detailFragment.LLJJJJJIL.onResume(detailFragment);
                }
                IDetailPageAbility iDetailPageAbilityZP = detailFragment.ZP();
                if (iDetailPageAbilityZP != null && (detailFragmentPanelJQ2 = iDetailPageAbilityZP.JQ()) != null && (c0sz8LJLIL2 = detailFragmentPanelJQ2.LJLIL()) != null) {
                    c0sz8LJLIL2.p(1);
                }
            } else if (num.intValue() == 1) {
                if (detailFragment.LLJILJILJ != null && detailFragment.OR()) {
                    detailFragment.LLJILJILJ.onPause();
                }
                DefaultLifecycleObserver defaultLifecycleObserver2 = detailFragment.LLJJJJJIL;
                if (defaultLifecycleObserver2 != null) {
                    defaultLifecycleObserver2.onPause(detailFragment);
                    detailFragment.LLJJJJJIL.onStop(detailFragment);
                }
                C736510Sun.LIZ = String.valueOf(num);
                IDetailPageAbility iDetailPageAbilityZP2 = detailFragment.ZP();
                if (iDetailPageAbilityZP2 != null && (detailFragmentPanelJQ = iDetailPageAbilityZP2.JQ()) != null && (c0sz8LJLIL = detailFragmentPanelJQ.LJLIL()) != null) {
                    c0sz8LJLIL.LJLIIIL(6);
                }
            }
        }
        if (!detailFragment.LLILZIL.LLJILLL && detailFragment.LL != null && TextUtils.equals(strCQ2, "page_profile") && detailFragment.LLJI != null && (iAdSceneService = detailFragment.LLJILLL) != null) {
            iAdSceneService.LIZIZ();
            C1022290ci3.LJIIJJI(detailFragment.getContext(), detailFragment.LLJI);
        }
    }

    public static final void onChanged$22(AObserverS226S0100000_24 aObserverS226S0100000_24, Object obj) {
        Aweme aweme;
        AwemeCommerceStruct commerceVideoAuthInfo;
        Aweme aweme2;
        IAdSceneService iAdSceneService;
        DetailFragment detailFragment = (DetailFragment) aObserverS226S0100000_24.l0;
        ScrollSwitchStateManager scrollSwitchStateManager = detailFragment.LLILLL;
        if (scrollSwitchStateManager != null && scrollSwitchStateManager.FQ2("page_feed") && detailFragment.ZP() != null && (aweme2 = detailFragment.LLJI) != null && AwemeExtKt.isAdTraffic(aweme2) && (iAdSceneService = detailFragment.LLJILLL) != null) {
            iAdSceneService.LIZIZ();
            C1022290ci3.LJIILLIIL(detailFragment.getContext(), detailFragment.LLILZIL.getEventType());
        }
        if ((TextUtils.equals(detailFragment.LLIZ.getEventType(), "others_homepage") || TextUtils.equals(detailFragment.LLIZ.getEventType(), "paid_series_detail_page")) && (aweme = detailFragment.LLJI) != null && AwemeExtKt.isAdTraffic(aweme)) {
            AwemeExtKt.getAuthorUid(detailFragment.LLJI);
            if (!AwemeExtKt.getAuthorUid(detailFragment.LLJI).equals(detailFragment.getCurrentUid())) {
                return;
            }
        }
        Aweme aweme3 = detailFragment.LLJI;
        if (!C1017070cZd.LLFII(aweme3) || aweme3 == null || (commerceVideoAuthInfo = aweme3.getCommerceVideoAuthInfo()) == null || !commerceVideoAuthInfo.isPersonalPageForbidden()) {
            if (!detailFragment.LLJJJ) {
                return;
            }
            AwemeRawAd awemeRawAd = detailFragment.LLJI.getAwemeRawAd();
            if (awemeRawAd != null && C1010120cOQ.LJIJJ(awemeRawAd) && (!TextUtils.isEmpty(awemeRawAd.getWebUrl()) || !TextUtils.isEmpty(awemeRawAd.getOpenUrl()))) {
                return;
            }
        }
        C1389890mGx c1389890mGx = new C1389890mGx(detailFragment);
        c1389890mGx.LJIIIZ(2131824738);
        c1389890mGx.LJIIJJI();
    }

    public static final void onChanged$23(AObserverS226S0100000_24 aObserverS226S0100000_24, Object obj) {
        if (Intrinsics.LJFF(obj, Boolean.TRUE)) {
            C1607740rwK c1607740rwK = (C1607740rwK) aObserverS226S0100000_24.l0;
            c1607740rwK.LLILLL = true;
            HandlerHook.viewRemoveCallbacks(c1607740rwK, c1607740rwK.LLILZ);
            if (c1607740rwK.LLILLJJLI) {
                HandlerHook.viewPostDelay(c1607740rwK, new ARunnableS124S0100000_24(c1607740rwK, 129), 200L);
            }
        }
    }

    public static final void onChanged$24(AObserverS226S0100000_24 aObserverS226S0100000_24, Object obj) {
        C1587810rQB c1587810rQB = (C1587810rQB) ((C1587710rQ1) aObserverS226S0100000_24.l0).LL;
        if (c1587810rQB != null) {
            c1587810rQB.LLJIJIL = 0;
            c1587810rQB.LLJ = 0;
            c1587810rQB.LLJI = 0;
            c1587810rQB.LLIZLLLIL = 0;
            c1587810rQB.LLJILJIL = 0;
            c1587810rQB.LLJILJILJ = 0;
        }
    }

    public static final void onChanged$25(AObserverS226S0100000_24 aObserverS226S0100000_24, Object obj) {
        Pair pair = (Pair) obj;
        if (pair != null) {
            C1587030rOv c1587030rOv = (C1587030rOv) aObserverS226S0100000_24.l0;
            c1587030rOv.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onFriendsTabSelected ");
            sbLIZ.append(pair);
            C2188811AlT.LIZIZ(sbLIZ);
            c1587030rOv.LJIIL((String) pair.getFirst(), (String) pair.getSecond());
            C1587220rPE.LIZ.getClass();
            C1587220rPE.LJ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00bf A[PHI: r6
      0x00bf: PHI (r6v6 androidx.fragment.app.Fragment) = (r6v2 androidx.fragment.app.Fragment), (r6v7 androidx.fragment.app.Fragment) binds: [B:47:0x0104, B:28:0x00bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$26(Y.AObserverS226S0100000_24 r9, java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS226S0100000_24.onChanged$26(Y.AObserverS226S0100000_24, java.lang.Object):void");
    }

    public static final void onChanged$27(AObserverS226S0100000_24 aObserverS226S0100000_24, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        InterfaceC1589720rTG interfaceC1589720rTG = ((HomeViewPagerAssem) aObserverS226S0100000_24.l0).LLJI;
        if (interfaceC1589720rTG != null) {
            interfaceC1589720rTG.LLIFFJFJJ(zBooleanValue);
        }
    }

    public static final void onChanged$28(AObserverS226S0100000_24 aObserverS226S0100000_24, Object obj) {
        ((PaidContentVideoPanel) aObserverS226S0100000_24.l0).C1((String) obj);
    }

    public static final void onChanged$29(AObserverS226S0100000_24 aObserverS226S0100000_24, Object obj) {
        ((DmListContentAssem) aObserverS226S0100000_24.l0).Vo(((Boolean) obj).booleanValue());
    }

    public static final void onChanged$3(AObserverS226S0100000_24 aObserverS226S0100000_24, Object obj) {
        ITabStrip iTabStripSo;
        if (Intrinsics.LJFF(obj, Boolean.TRUE) && (iTabStripSo = ((HomeViewPagerAssem) aObserverS226S0100000_24.l0).So()) != null) {
            iTabStripSo.bv(true, true);
        }
    }

    public static final void onChanged$30(AObserverS226S0100000_24 aObserverS226S0100000_24, Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            AbstractStickerView abstractStickerView = (AbstractStickerView) aObserverS226S0100000_24.l0;
            if (bool.booleanValue()) {
                abstractStickerView.LLJLILLLLZIIL.onNext(C1557380qd6.LIZ);
            } else {
                abstractStickerView.getClass();
            }
        }
    }

    public static final void onChanged$31(AObserverS226S0100000_24 aObserverS226S0100000_24, Object obj) {
        SeriesListAssemViewModel seriesListAssemViewModel = (SeriesListAssemViewModel) aObserverS226S0100000_24.l0;
        seriesListAssemViewModel.getClass();
        seriesListAssemViewModel.withState(new AwS390S0200000_24(seriesListAssemViewModel, (SeriesListAssemViewModel) obj, (Map<Long, C1576640r8A>) 108));
    }

    public static final void onChanged$32(AObserverS226S0100000_24 aObserverS226S0100000_24, Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            C1608880ryA c1608880ryA = (C1608880ryA) aObserverS226S0100000_24.l0;
            EnumC1256840ioM enumC1256840ioM = c1608880ryA.LIZLLL;
            if (enumC1256840ioM == EnumC1256840ioM.START_ANIMATION || enumC1256840ioM == EnumC1256840ioM.RESUME_ANIMATION) {
                InterfaceC1608890ryB interfaceC1608890ryB = c1608880ryA.LIZIZ;
                if (interfaceC1608890ryB != null && interfaceC1608890ryB.LIZLLL()) {
                    InterfaceC1608890ryB interfaceC1608890ryB2 = ((C1608880ryA) aObserverS226S0100000_24.l0).LIZIZ;
                    if (interfaceC1608890ryB2 != null) {
                        interfaceC1608890ryB2.xs();
                        return;
                    }
                    return;
                }
                InterfaceC1608890ryB interfaceC1608890ryB3 = ((C1608880ryA) aObserverS226S0100000_24.l0).LIZIZ;
                if (interfaceC1608890ryB3 == null) {
                    return;
                }
                interfaceC1608890ryB3.LIZ();
                return;
            }
            return;
        }
        InterfaceC1608890ryB interfaceC1608890ryB4 = ((C1608880ryA) aObserverS226S0100000_24.l0).LIZIZ;
        if (interfaceC1608890ryB4 != null) {
            interfaceC1608890ryB4.Ir();
        }
        InterfaceC1608890ryB interfaceC1608890ryB5 = ((C1608880ryA) aObserverS226S0100000_24.l0).LIZIZ;
        if (interfaceC1608890ryB5 == null) {
            return;
        }
        interfaceC1608890ryB5.LJ();
    }

    public static final void onChanged$33(AObserverS226S0100000_24 aObserverS226S0100000_24, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((C1610840s1K) aObserverS226S0100000_24.l0).getClass();
            User user = ((C1610840s1K) aObserverS226S0100000_24.l0).LLIZ;
            if (user != null && user.isLive()) {
                C1610840s1K c1610840s1K = (C1610840s1K) aObserverS226S0100000_24.l0;
                if (!c1610840s1K.LLJILLL && c1610840s1K.LLJJ) {
                    c1610840s1K.LIZIZ(user);
                    return;
                }
                return;
            }
            return;
        }
        ((C1610840s1K) aObserverS226S0100000_24.l0).getClass();
    }

    public static final void onChanged$34(AObserverS226S0100000_24 aObserverS226S0100000_24, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C1610840s1K c1610840s1K = (C1610840s1K) aObserverS226S0100000_24.l0;
            c1610840s1K.LLJILLL = true;
            User user = c1610840s1K.LLIZ;
            if (user != null && user.isLive()) {
                C1610840s1K c1610840s1K2 = (C1610840s1K) aObserverS226S0100000_24.l0;
                C786410Ut5.s0(c1610840s1K2, 0);
                if (c1610840s1K2.LLJIJIL) {
                    InterfaceC1608890ryB interfaceC1608890ryB = c1610840s1K2.LLILZIL;
                    if (interfaceC1608890ryB != null) {
                        interfaceC1608890ryB.LJIIIZ();
                    }
                    InterfaceC662550Pyn interfaceC662550Pyn = c1610840s1K2.LLILZLL;
                    if (interfaceC662550Pyn != null) {
                        interfaceC662550Pyn.LIZ();
                    }
                }
                ListLiveCircleItemVM listLiveCircleItemVM = c1610840s1K2.LLJ;
                if (listLiveCircleItemVM != null) {
                    listLiveCircleItemVM.zQ2();
                    return;
                }
                return;
            }
            return;
        }
        C1610840s1K c1610840s1K3 = (C1610840s1K) aObserverS226S0100000_24.l0;
        c1610840s1K3.LLJILLL = false;
        if (!c1610840s1K3.LLJIJIL) {
            return;
        }
        InterfaceC1608890ryB interfaceC1608890ryB2 = c1610840s1K3.LLILZIL;
        if (interfaceC1608890ryB2 != null) {
            interfaceC1608890ryB2.LJIIJ();
        }
        InterfaceC662550Pyn interfaceC662550Pyn2 = ((C1610840s1K) aObserverS226S0100000_24.l0).LLILZLL;
        if (interfaceC662550Pyn2 == null) {
            return;
        }
        interfaceC662550Pyn2.LJIIZILJ();
    }

    public static final void onChanged$35(AObserverS226S0100000_24 aObserverS226S0100000_24, Object obj) {
        FeedFollowFragment feedFollowFragment = (FeedFollowFragment) aObserverS226S0100000_24.l0;
        if (!feedFollowFragment.LLJJLIIIJLLLLLLLZ) {
            feedFollowFragment.Oi(false);
        } else {
            feedFollowFragment.LLJJLIIIJLLLLLLLZ = false;
        }
    }

    public static final void onChanged$36(AObserverS226S0100000_24 aObserverS226S0100000_24, Object obj) {
        FeedFollowFragment feedFollowFragment = (FeedFollowFragment) aObserverS226S0100000_24.l0;
        FollowStatus followStatus = (FollowStatus) obj;
        InterfaceC1588500rRI interfaceC1588500rRICS = feedFollowFragment.cS();
        if (interfaceC1588500rRICS != null) {
            interfaceC1588500rRICS.LJI(followStatus);
        }
        String userId = followStatus.getUserId();
        if (userId != null && !userId.isEmpty()) {
            int followStatus2 = followStatus.getFollowStatus();
            if (followStatus2 != 0) {
                if (followStatus2 != 1 && followStatus2 != 2) {
                    return;
                }
                feedFollowFragment.gS().remove(userId);
                return;
            }
            feedFollowFragment.gS().add(userId);
        }
    }

    public static final void onChanged$37(AObserverS226S0100000_24 aObserverS226S0100000_24, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        C1591060rVQ c1591060rVQ = (C1591060rVQ) aObserverS226S0100000_24.l0;
        c1591060rVQ.LJIIIIZZ = c1591060rVQ.LIZIZ.CQ2(iIntValue);
    }

    public static final void onChanged$4(AObserverS226S0100000_24 aObserverS226S0100000_24, Object obj) {
        boolean zBooleanValue;
        Boolean bool = (Boolean) obj;
        NonPersonalizedVM nonPersonalizedVMTp = ((NonPersonalizedAssem) aObserverS226S0100000_24.l0).tp();
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        nonPersonalizedVMTp.setState(new AwS34S0010000_21(zBooleanValue, 36));
    }

    public static final void onChanged$5(AObserverS226S0100000_24 aObserverS226S0100000_24, Object obj) {
        NextLiveData nextLiveData;
        NextLiveData nextLiveData2;
        NextLiveData nextLiveData3;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C1610840s1K c1610840s1K = (C1610840s1K) aObserverS226S0100000_24.l0;
        User user = c1610840s1K.LLIZ;
        if (user != null && zBooleanValue && !user.isLive()) {
            C786410Ut5.s0(c1610840s1K, 8);
            InterfaceC1608890ryB interfaceC1608890ryB = c1610840s1K.LLILZIL;
            if (interfaceC1608890ryB != null) {
                interfaceC1608890ryB.LJIIIIZZ();
            }
            InterfaceC1608890ryB interfaceC1608890ryB2 = c1610840s1K.LLILZIL;
            if (interfaceC1608890ryB2 != null) {
                interfaceC1608890ryB2.LJII();
            }
            InterfaceC662550Pyn interfaceC662550Pyn = c1610840s1K.LLILZLL;
            if (interfaceC662550Pyn != null) {
                interfaceC662550Pyn.LJIIZILJ();
            }
            c1610840s1K.LLIZ = null;
            ListLiveCircleItemVM listLiveCircleItemVM = c1610840s1K.LLJ;
            if (listLiveCircleItemVM != null) {
                listLiveCircleItemVM.vQ2(user);
            }
            ListLiveCircleItemVM listLiveCircleItemVM2 = c1610840s1K.LLJ;
            if (listLiveCircleItemVM2 != null && (nextLiveData3 = listLiveCircleItemVM2.LL) != null) {
                nextLiveData3.removeObserver(aObserverS226S0100000_24);
            }
            ListLiveCircleItemVM listLiveCircleItemVM3 = c1610840s1K.LLJ;
            if (listLiveCircleItemVM3 != null && (nextLiveData2 = listLiveCircleItemVM3.LLILLJJLI) != null) {
                nextLiveData2.removeObserver(c1610840s1K.getPageVisibleObserver());
            }
            ListLiveCircleItemVM listLiveCircleItemVM4 = c1610840s1K.LLJ;
            if (listLiveCircleItemVM4 != null && (nextLiveData = listLiveCircleItemVM4.LLILLJJLI) != null) {
                nextLiveData.removeObserver(c1610840s1K.getNodeVisibleObserver());
            }
            InterfaceC1264960j1S interfaceC1264960j1S = c1610840s1K.LLJJIII;
            if (interfaceC1264960j1S != null) {
                interfaceC1264960j1S.LIZ();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(' ');
            sbLIZ.append(user.getUid());
            sbLIZ.append(" avatar set live end.,");
            String nickname = user.getNickname();
            if (nickname == null) {
                nickname = "";
            }
            sbLIZ.append(nickname);
            C20441214yg.LIZIZ("LYP_LOG", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static final void onChanged$6(AObserverS226S0100000_24 aObserverS226S0100000_24, Object obj) {
        int i;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvGo = ((SeriesProfileTabAssem) aObserverS226S0100000_24.l0).Go();
        if (Intrinsics.LJFF(((C1567820qtw) obj).LIZ, Boolean.TRUE)) {
            i = 0;
        } else {
            i = 4;
        }
        C786410Ut5.LJLLLLLL(i, viewOnAttachStateChangeListenerC20604515jvGo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onChanged$7(AObserverS226S0100000_24 aObserverS226S0100000_24, Object obj) {
        InterfaceC1577520r9a interfaceC1577520r9aLIZIZ;
        MutableLiveData<C291001Au<C001U>> mutableLiveDataLJII;
        C291001Au c291001Au = (C291001Au) obj;
        if (c291001Au != null && c291001Au.LIZ != 0) {
            if (C695930RRn.LIZLLL(((C1567900qu4) ((SeriesFeedVM) aObserverS226S0100000_24.l0).getState()).LL.LLILZ)) {
                ((SeriesFeedVM) aObserverS226S0100000_24.l0).AQ2(new C1568050quJ(null));
            }
            ISeriesFeedService iSeriesFeedServiceLIZIZ = C0RRR.LIZIZ();
            if (iSeriesFeedServiceLIZIZ != null && (interfaceC1577520r9aLIZIZ = iSeriesFeedServiceLIZIZ.LIZIZ()) != null && (mutableLiveDataLJII = interfaceC1577520r9aLIZIZ.LJII()) != null) {
                mutableLiveDataLJII.setValue(null);
            }
        }
    }

    public static final void onChanged$8(AObserverS226S0100000_24 aObserverS226S0100000_24, Object obj) {
        ((SeriesDetailDescriptionAssem) aObserverS226S0100000_24.l0).bp((String) obj);
    }

    public static final void onChanged$9(AObserverS226S0100000_24 aObserverS226S0100000_24, Object obj) {
        StemFeedFragment stemFeedFragment = (StemFeedFragment) aObserverS226S0100000_24.l0;
        if (!stemFeedFragment.LLJ) {
            stemFeedFragment.Oi(false);
        } else {
            stemFeedFragment.LLJ = false;
        }
    }
}
