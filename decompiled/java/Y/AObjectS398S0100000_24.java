package Y;

import X.C0BY2;
import X.C0XQ7;
import X.C1017370ca7;
import X.C1588490rRH;
import X.C1589530rSx;
import X.C1601380rm4;
import X.C1601390rm5;
import X.C1A73;
import X.C2277891EDz;
import X.C293570Bf1;
import X.C300920Bqs;
import X.C590380NDo;
import X.C707370Rot;
import X.C849850XVn;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.applog.AppLog;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.featurecenter.ICommerceFeatureCenter;
import com.ss.android.ugc.aweme.detail.ui.DetailActivity;
import com.ss.android.ugc.aweme.detail.ui.saf.DetailSafRootFragment;
import com.ss.android.ugc.aweme.ecommerce.mall.ShopMallMixFragment;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.MixMallShopCartAssem;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.MixMallTabRefreshAssem;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.MixMallThemeAssem;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.MixStatusViewAssem;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallMixViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.panel.FullFeedFragmentPanel;
import com.ss.android.ugc.aweme.feed.panel.RecommendFeedFragmentPanel;
import com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment;
import com.ss.android.ugc.aweme.feed.ui.FeedRecommendFragment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.creative.edit.impl.filter.IMEditFilterAssem;
import com.ss.android.ugc.aweme.im.creative.edit.impl.filter.IMEditFilterPanelAssem;
import com.ss.android.ugc.aweme.im.creative.edit.impl.filter.IMEditFilterPanelVM;
import com.ss.android.ugc.aweme.im.creative.edit.impl.filter.IMEditFilterToolVM;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.tts.oecverify.BdTuring;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS135S0201000_9;

/* JADX INFO: loaded from: classes25.dex */
public class AObjectS398S0100000_24 implements Function0 {
    public final int $t;
    public Object l0;

    public static final Object invoke$0(AObjectS398S0100000_24 aObjectS398S0100000_24) {
        return ((MainActivity) aObjectS398S0100000_24.l0).lambda$beforeSuperOnCreate$0();
    }

    public static final Object invoke$1(AObjectS398S0100000_24 aObjectS398S0100000_24) {
        return ((MainActivity) aObjectS398S0100000_24.l0).lambda$beforeSuperOnCreate$1();
    }

    public static final Object invoke$8(AObjectS398S0100000_24 aObjectS398S0100000_24) {
        DetailSafRootFragment detailSafRootFragment = (DetailSafRootFragment) aObjectS398S0100000_24.l0;
        String str = DetailActivity._pnsPageId;
        return detailSafRootFragment;
    }

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
            default:
                return null;
        }
    }

    public static final Object invoke$10(AObjectS398S0100000_24 aObjectS398S0100000_24) {
        ((RecommendFeedFragmentPanel) aObjectS398S0100000_24.l0).b0.LIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$11(AObjectS398S0100000_24 aObjectS398S0100000_24) {
        boolean z;
        List<Aweme> list = ((C1589530rSx) aObjectS398S0100000_24.l0).LIZ;
        if (list != null && !list.isEmpty()) {
            Iterator<Aweme> it2 = list.iterator();
            while (it2.hasNext()) {
                if (C2277891EDz.LIZIZ.LJIILJJIL().LIZJ(it2.next())) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$12(AObjectS398S0100000_24 aObjectS398S0100000_24) {
        C1588490rRH c1588490rRH = (C1588490rRH) aObjectS398S0100000_24.l0;
        c1588490rRH.LIZ.oS();
        c1588490rRH.LIZ.LLL = false;
        return Unit.LIZ;
    }

    public static final Object invoke$13(AObjectS398S0100000_24 aObjectS398S0100000_24) {
        View view;
        FeedRecommendFragment feedRecommendFragment = (FeedRecommendFragment) aObjectS398S0100000_24.l0;
        feedRecommendFragment.getClass();
        C849850XVn c849850XVn = C849850XVn.LIZIZ;
        if (c849850XVn.LIZJ().LIZJ()) {
            if (C0XQ7.LJFF().isLogin()) {
                c849850XVn.LIZJ().LJ();
            }
            if (!c849850XVn.LIZJ().LJJIJIIJI() && c849850XVn.LIZJ().LJIJJLI() && (view = feedRecommendFragment.getView()) != null) {
                HandlerHook.viewPostDelay(view, new ARunnableS119S0100000_19(feedRecommendFragment, 213), 1000L);
            }
        }
        feedRecommendFragment.nS();
        return null;
    }

    public static final Object invoke$14(AObjectS398S0100000_24 aObjectS398S0100000_24) {
        ((FeedRecommendFragment) aObjectS398S0100000_24.l0).nS();
        return null;
    }

    public static final Object invoke$15(AObjectS398S0100000_24 aObjectS398S0100000_24) {
        ((FeedFollowFragment) aObjectS398S0100000_24.l0).LLJJJ.LLLIILIL();
        return Unit.LIZ;
    }

    public static final Object invoke$16(AObjectS398S0100000_24 aObjectS398S0100000_24) {
        ((FeedFollowFragment) aObjectS398S0100000_24.l0).oS();
        return Unit.LIZ;
    }

    public static final Object invoke$17(AObjectS398S0100000_24 aObjectS398S0100000_24) {
        T t;
        FeedRecommendFragment feedRecommendFragment = (FeedRecommendFragment) aObjectS398S0100000_24.l0;
        C1601390rm5 c1601390rm5 = feedRecommendFragment.LLJLIL;
        if (c1601390rm5 == null || (t = c1601390rm5.LL) == 0 || t.getData() == null || feedRecommendFragment.LLIZLLLIL == null) {
            return null;
        }
        AwS135S0201000_9 awS135S0201000_9 = new AwS135S0201000_9(feedRecommendFragment.LLIZLLLIL.LLJLILLLLZIIL + 1, (FeedItemList) feedRecommendFragment.LLJLIL.LL.getData(), ((C1601380rm4) feedRecommendFragment.LLJLIL.LL).LLILZ, 7);
        if (!C590380NDo.LIZIZ()) {
            return null;
        }
        return awS135S0201000_9.invoke();
    }

    public static final Object invoke$18(AObjectS398S0100000_24 aObjectS398S0100000_24) {
        C1601390rm5 c1601390rm5 = (C1601390rm5) aObjectS398S0100000_24.l0;
        c1601390rm5.getClass();
        if (C293570Bf1.LIZ()) {
            c1601390rm5.LJIL(c1601390rm5.LLJILJIL, c1601390rm5.LLJIJIL);
            return null;
        }
        return null;
    }

    public static final Object invoke$19(AObjectS398S0100000_24 aObjectS398S0100000_24) {
        boolean z;
        List<Aweme> items = ((C1601380rm4) aObjectS398S0100000_24.l0).getItems();
        if (items != null && !items.isEmpty()) {
            Iterator<Aweme> it2 = items.iterator();
            while (it2.hasNext()) {
                if (C2277891EDz.LIZIZ.LJIILJJIL().LIZJ(it2.next())) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$2(AObjectS398S0100000_24 aObjectS398S0100000_24) {
        MixMallThemeAssem mixMallThemeAssem = (MixMallThemeAssem) aObjectS398S0100000_24.l0;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = MixMallThemeAssem.LLILZ;
        return new ShopMallMixViewModel((ShopMallMixFragment) mixMallThemeAssem.LL.getValue());
    }

    public static final Object invoke$20(AObjectS398S0100000_24 aObjectS398S0100000_24) {
        FeedItemList feedItemList = (FeedItemList) aObjectS398S0100000_24.l0;
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi(ILiveOuterService.class);
        if (iLiveOuterService != null) {
            iLiveOuterService.R4(feedItemList.getItems());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$21(AObjectS398S0100000_24 aObjectS398S0100000_24) {
        IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi(IExternalService.class);
        if (iExternalService != null) {
            iExternalService.infoService().preloadTemplateLib(((FeedItemList) aObjectS398S0100000_24.l0).getItems());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$22(AObjectS398S0100000_24 aObjectS398S0100000_24) {
        ICommerceFeatureCenter iCommerceFeatureCenterLJFF;
        C1017370ca7 c1017370ca7 = (C1017370ca7) aObjectS398S0100000_24.l0;
        c1017370ca7.getClass();
        ICommerceService iCommerceService = (ICommerceService) PluggableExtentionKt.pluggableSpi(ICommerceService.class);
        if (iCommerceService != null && (iCommerceFeatureCenterLJFF = iCommerceService.LJFF()) != null) {
            iCommerceFeatureCenterLJFF.init();
        }
        AppLog.addEventObserver(c1017370ca7.LIZLLL);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AObjectS398S0100000_24 aObjectS398S0100000_24) {
        MixStatusViewAssem mixStatusViewAssem = (MixStatusViewAssem) aObjectS398S0100000_24.l0;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = MixStatusViewAssem.LLJJIJI;
        return new ShopMallMixViewModel(mixStatusViewAssem.Ho());
    }

    public static final Object invoke$4(AObjectS398S0100000_24 aObjectS398S0100000_24) {
        MixMallShopCartAssem mixMallShopCartAssem = (MixMallShopCartAssem) aObjectS398S0100000_24.l0;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = MixMallShopCartAssem.LLJJ;
        return new ShopMallMixViewModel(mixMallShopCartAssem.Go());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$5(AObjectS398S0100000_24 aObjectS398S0100000_24) {
        MixMallTabRefreshAssem mixMallTabRefreshAssem = (MixMallTabRefreshAssem) aObjectS398S0100000_24.l0;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = MixMallTabRefreshAssem.LLJJ;
        return new ShopMallMixViewModel((ShopMallMixFragment) mixMallTabRefreshAssem.LL.getValue());
    }

    public static final Object invoke$6(AObjectS398S0100000_24 aObjectS398S0100000_24) {
        return new IMEditFilterToolVM(((C1A73) ((IMEditFilterAssem) aObjectS398S0100000_24.l0).LLIZLLLIL.getValue()).LIZ);
    }

    public static final Object invoke$7(AObjectS398S0100000_24 aObjectS398S0100000_24) {
        IMEditFilterPanelAssem iMEditFilterPanelAssem = (IMEditFilterPanelAssem) aObjectS398S0100000_24.l0;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = IMEditFilterPanelAssem.LLJJLIIIJLLLLLLLZ;
        return new IMEditFilterPanelVM(iMEditFilterPanelAssem.ip().LJI, iMEditFilterPanelAssem.ip().LJFF, iMEditFilterPanelAssem.ip().LJ, iMEditFilterPanelAssem.ip().LIZIZ, iMEditFilterPanelAssem.ip().LJII, iMEditFilterPanelAssem.ip().LJIIIIZZ);
    }

    public static final Object invoke$9(AObjectS398S0100000_24 aObjectS398S0100000_24) {
        if (((Number) C0BY2.LIZ.getValue()).intValue() >= 0) {
            C707370Rot.LIZ.LIZIZ("LivePageEnter").observeForever(((FullFeedFragmentPanel) aObjectS398S0100000_24.l0).G);
        }
        if (((Number) C300920Bqs.LIZ.getValue()).intValue() >= 0) {
            C707370Rot.LIZ.LIZIZ("LiveBroadcastPageEnter").observeForever(((FullFeedFragmentPanel) aObjectS398S0100000_24.l0).H);
            return null;
        }
        return null;
    }

    public AObjectS398S0100000_24(FeedItemList feedItemList, int i) {
        this.$t = i;
        if (20 - i != 0) {
            this.l0 = feedItemList;
        } else {
            this.l0 = feedItemList;
        }
    }

    public AObjectS398S0100000_24(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
