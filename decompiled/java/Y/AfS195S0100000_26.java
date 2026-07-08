package Y;

import X.C09C2;
import X.C09JN;
import X.C11JF;
import X.C11PQ;
import X.C1245240iVe;
import X.C1741260vPg;
import X.C1749710vdJ;
import X.C1750480veY;
import X.C1756150vnh;
import X.C1758120vqs;
import X.C1761300vw0;
import X.C1761680vwc;
import X.C1761690vwd;
import X.C1767930w6h;
import X.C1767960w6k;
import X.C1767980w6m;
import X.C1C7U;
import X.C20684815ws;
import X.C2341109Fh;
import X.C2344009Gk;
import X.C756302xN;
import X.InterfaceC1726310v1Z;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.ata.DynamicAdExplainDialog;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.CommercePageTrackingServiceImpl;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.commercialize.tcm.api.TcmBarStatus;
import com.ss.android.ugc.aweme.commercialize.tcm.api.TcmBarStatusResponse;
import com.ss.android.ugc.aweme.commercialize.tcm.view.TcmOrderStatusBottomBarTrigger;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.review.gallery.GalleryViewerViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.review.sea.SeaReviewLynxViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.DistrictData;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.viewmodel.DistrictPickerViewModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.setting.serverpush.compose.login.PushSettingsLoginVM;
import com.ss.android.ugc.aweme.setting.serverpush.model.FetchPushOffReasonsResp;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushOffReasonsData;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import com.tts.oecverify.BdTuring;
import java.util.Collection;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS38S0001000_26;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS396S0200000_30;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public class AfS195S0100000_26 implements C09JN {
    public final int $t;
    public Object l0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
            case 7:
                accept$7(this, obj);
                break;
            case 8:
                accept$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                accept$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                accept$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                accept$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                accept$12(this, obj);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                accept$13(this, obj);
                break;
            case 14:
                accept$14(this, obj);
                break;
            case 15:
                accept$15(this, obj);
                break;
            case 16:
                accept$16(this, obj);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                accept$17(this, obj);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                accept$18(this, obj);
                break;
            case 19:
                accept$19(this, obj);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                accept$20(this, obj);
                break;
            case 21:
                accept$21(this, obj);
                break;
            case 22:
                accept$22(this, obj);
                break;
        }
    }

    public AfS195S0100000_26(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void accept$0(AfS195S0100000_26 afS195S0100000_26, Object obj) {
        C1C7U.LIZ("PdpPreloadMgr@12da.observeProductInfoRequest$2");
        Throwable th = (Throwable) obj;
        C11JF c11jf = ((C1749710vdJ) afS195S0100000_26.l0).LIZIZ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C1749710vdJ c1749710vdJ = (C1749710vdJ) afS195S0100000_26.l0;
        c1749710vdJ.LIZIZ = null;
        if (th instanceof C1758120vqs) {
            PdpViewModel.zS2(c1749710vdJ.LIZ, null, Integer.valueOf(((C1758120vqs) th).getCode()), false, false, true, false, false, false, false, false, 992);
        } else {
            PdpViewModel.zS2(c1749710vdJ.LIZ, null, null, false, false, false, false, false, false, false, false, 1020);
        }
        C1756150vnh c1756150vnh = ((C1749710vdJ) afS195S0100000_26.l0).LIZ.LLLLIL;
        if (c1756150vnh != null) {
            c1756150vnh.LIZ(false);
        }
        C1C7U.LIZIZ("PdpPreloadMgr@12da.observeProductInfoRequest$2");
    }

    public static final void accept$1(AfS195S0100000_26 afS195S0100000_26, Object obj) {
        C1C7U.LIZ("TriggerAssemHost@69ff.register$1");
        ((Function1) afS195S0100000_26.l0).invoke(obj);
        C1C7U.LIZIZ("TriggerAssemHost@69ff.register$1");
    }

    public static final void accept$10(AfS195S0100000_26 afS195S0100000_26, Object obj) {
        Boolean boolValueOf;
        C1761690vwd c1761690vwd;
        C1C7U.LIZ("GalleryViewerViewModel@cd31.refreshReviewImage$2");
        Pair pair = (Pair) obj;
        NextLiveData<Boolean> nextLiveData = ((GalleryViewerViewModel) afS195S0100000_26.l0).LLJ;
        C1761680vwc c1761680vwc = (C1761680vwc) pair.getSecond();
        Integer numValueOf = null;
        if (c1761680vwc != null && (c1761690vwd = c1761680vwc.LIZIZ) != null) {
            boolValueOf = Boolean.valueOf(c1761690vwd.LIZ);
        } else {
            boolValueOf = null;
        }
        nextLiveData.postValue(boolValueOf);
        GalleryViewerViewModel galleryViewerViewModel = (GalleryViewerViewModel) afS195S0100000_26.l0;
        C1761680vwc c1761680vwc2 = (C1761680vwc) pair.getSecond();
        if (c1761680vwc2 != null) {
            numValueOf = Integer.valueOf(c1761680vwc2.LIZ);
        }
        galleryViewerViewModel.LLJI = numValueOf;
        GalleryViewerViewModel galleryViewerViewModel2 = (GalleryViewerViewModel) afS195S0100000_26.l0;
        galleryViewerViewModel2.LLJJJ = false;
        CopyOnWriteArrayList<C1761300vw0> value = galleryViewerViewModel2.LLJJIII.getValue();
        if (value != null) {
            value.addAll((Collection) pair.getFirst());
        } else {
            ((GalleryViewerViewModel) afS195S0100000_26.l0).LLJJIII.postValue(new CopyOnWriteArrayList<>((Collection) pair.getFirst()));
        }
        C1C7U.LIZIZ("GalleryViewerViewModel@cd31.refreshReviewImage$2");
    }

    public static final void accept$11(AfS195S0100000_26 afS195S0100000_26, Object obj) {
        Boolean boolValueOf;
        C1761690vwd c1761690vwd;
        C1C7U.LIZ("GalleryViewerViewModel@cd31.refreshReviewImage$4");
        Pair pair = (Pair) obj;
        NextLiveData<Boolean> nextLiveData = ((GalleryViewerViewModel) afS195S0100000_26.l0).LLJ;
        C1761680vwc c1761680vwc = (C1761680vwc) pair.getSecond();
        Integer numValueOf = null;
        if (c1761680vwc != null && (c1761690vwd = c1761680vwc.LIZIZ) != null) {
            boolValueOf = Boolean.valueOf(c1761690vwd.LIZ);
        } else {
            boolValueOf = null;
        }
        nextLiveData.postValue(boolValueOf);
        GalleryViewerViewModel galleryViewerViewModel = (GalleryViewerViewModel) afS195S0100000_26.l0;
        C1761680vwc c1761680vwc2 = (C1761680vwc) pair.getSecond();
        if (c1761680vwc2 != null) {
            numValueOf = Integer.valueOf(c1761680vwc2.LIZ);
        }
        galleryViewerViewModel.LLJI = numValueOf;
        GalleryViewerViewModel galleryViewerViewModel2 = (GalleryViewerViewModel) afS195S0100000_26.l0;
        galleryViewerViewModel2.LLJJJ = false;
        CopyOnWriteArrayList<C1761300vw0> value = galleryViewerViewModel2.LLJJIII.getValue();
        if (value != null) {
            value.addAll((Collection) pair.getFirst());
        } else {
            ((GalleryViewerViewModel) afS195S0100000_26.l0).LLJJIII.postValue(new CopyOnWriteArrayList<>((Collection) pair.getFirst()));
        }
        C1C7U.LIZIZ("GalleryViewerViewModel@cd31.refreshReviewImage$4");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$12(AfS195S0100000_26 afS195S0100000_26, Object obj) {
        boolean zBooleanValue;
        C1C7U.LIZ("DistrictPickerViewModel@d831.getDistricts$dispose$1");
        Response response = (Response) obj;
        DistrictData districtData = (DistrictData) response.data;
        if (response.isCodeOK() && districtData != null) {
            DistrictPickerViewModel districtPickerViewModel = (DistrictPickerViewModel) afS195S0100000_26.l0;
            Boolean bool = districtData.hasNextLevel;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            districtPickerViewModel.LLJI = zBooleanValue;
            DistrictPickerViewModel districtPickerViewModel2 = (DistrictPickerViewModel) afS195S0100000_26.l0;
            districtPickerViewModel2.setState(new AwS392S0200000_26(districtPickerViewModel2, districtData, 201));
        } else {
            DistrictPickerViewModel districtPickerViewModel3 = (DistrictPickerViewModel) afS195S0100000_26.l0;
            districtPickerViewModel3.getClass();
            districtPickerViewModel3.setState(new AwS38S0001000_26(3, 13));
        }
        C1C7U.LIZIZ("DistrictPickerViewModel@d831.getDistricts$dispose$1");
    }

    public static final void accept$13(AfS195S0100000_26 afS195S0100000_26, Object obj) {
        C1C7U.LIZ("DistrictPickerViewModel@d831.getDistricts$dispose$2");
        DistrictPickerViewModel districtPickerViewModel = (DistrictPickerViewModel) afS195S0100000_26.l0;
        districtPickerViewModel.getClass();
        districtPickerViewModel.setState(new AwS38S0001000_26(3, 13));
        C1C7U.LIZIZ("DistrictPickerViewModel@d831.getDistricts$dispose$2");
    }

    public static final void accept$14(AfS195S0100000_26 afS195S0100000_26, Object obj) {
        C1C7U.LIZ("TcmOrderStatusBottomBarTrigger@8015.requestTcmStatusBarView$1$1");
        ((TcmOrderStatusBottomBarTrigger) afS195S0100000_26.l0).LLJLL = ((TcmBarStatus) GsonProtectorUtils.fromJson(C09C2.LIZ(), ((TcmBarStatusResponse) obj).data, new TypeToken<TcmBarStatus>() { // from class: X.0vDb
        }.getType())).barStatus;
        TcmOrderStatusBottomBarTrigger tcmOrderStatusBottomBarTrigger = (TcmOrderStatusBottomBarTrigger) afS195S0100000_26.l0;
        switch (tcmOrderStatusBottomBarTrigger.LLJLL) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case BdTuring.TYPE_ECAF /* 9 */:
                PriorityAbility priorityAbility = (PriorityAbility) tcmOrderStatusBottomBarTrigger.LLJLIL.getValue();
                if (priorityAbility != null) {
                    priorityAbility.nw0((TcmOrderStatusBottomBarTrigger) afS195S0100000_26.l0, true);
                }
                break;
        }
        TcmOrderStatusBottomBarTrigger tcmOrderStatusBottomBarTrigger2 = (TcmOrderStatusBottomBarTrigger) afS195S0100000_26.l0;
        ((C11PQ) tcmOrderStatusBottomBarTrigger2.LLJL.LLILLJJLI.getValue()).onNext(Integer.valueOf(tcmOrderStatusBottomBarTrigger2.LLJLL));
        C1C7U.LIZIZ("TcmOrderStatusBottomBarTrigger@8015.requestTcmStatusBarView$1$1");
    }

    public static final void accept$15(AfS195S0100000_26 afS195S0100000_26, Object obj) {
        C1C7U.LIZ("TcmOrderStatusBottomBarTrigger@8015.requestTcmStatusBarView$1$2");
        TcmOrderStatusBottomBarTrigger tcmOrderStatusBottomBarTrigger = (TcmOrderStatusBottomBarTrigger) afS195S0100000_26.l0;
        ((C11PQ) tcmOrderStatusBottomBarTrigger.LLJL.LLILLJJLI.getValue()).onNext(Integer.valueOf(tcmOrderStatusBottomBarTrigger.LLJLL));
        C1C7U.LIZIZ("TcmOrderStatusBottomBarTrigger@8015.requestTcmStatusBarView$1$2");
    }

    public static final void accept$16(AfS195S0100000_26 afS195S0100000_26, Object obj) {
        C1C7U.LIZ("RecommendRepo@8c93.getMoreMusicList$2$2");
        ((CountDownLatch) afS195S0100000_26.l0).countDown();
        C1C7U.LIZIZ("RecommendRepo@8c93.getMoreMusicList$2$2");
    }

    public static final void accept$17(AfS195S0100000_26 afS195S0100000_26, Object obj) {
        C1C7U.LIZ("SeaReviewLynxViewModel@1aa7.fetchFirstScreenReviewData$1");
        ((SeaReviewLynxViewModel) afS195S0100000_26.l0).setState(new AwS605S0100000_26((n) obj, 903));
        C1C7U.LIZIZ("SeaReviewLynxViewModel@1aa7.fetchFirstScreenReviewData$1");
    }

    public static final void accept$18(AfS195S0100000_26 afS195S0100000_26, Object obj) {
        C1C7U.LIZ("SeaReviewLynxViewModel@1aa7.fetchFirstScreenReviewData$2");
        ((SeaReviewLynxViewModel) afS195S0100000_26.l0).setState(AFwS268S0000000_26.get$arr$(761));
        C1C7U.LIZIZ("SeaReviewLynxViewModel@1aa7.fetchFirstScreenReviewData$2");
    }

    public static final void accept$19(AfS195S0100000_26 afS195S0100000_26, Object obj) {
        C1C7U.LIZ("SeaReviewLynxViewModel@1aa7.fetchFirstScreenReviewData$3");
        ((SeaReviewLynxViewModel) afS195S0100000_26.l0).setState(new AwS605S0100000_26((n) obj, 904));
        C1C7U.LIZIZ("SeaReviewLynxViewModel@1aa7.fetchFirstScreenReviewData$3");
    }

    public static final void accept$2(AfS195S0100000_26 afS195S0100000_26, Object obj) {
        InterfaceC1726310v1Z interfaceC1726310v1Z;
        C1C7U.LIZ("PowerPreloadInitHelper@30e2.init$config$3$toShot$2");
        Throwable th = (Throwable) obj;
        if ((th instanceof Exception) && (interfaceC1726310v1Z = (InterfaceC1726310v1Z) afS195S0100000_26.l0) != null) {
            interfaceC1726310v1Z.LIZ((Exception) th);
        }
        C1C7U.LIZIZ("PowerPreloadInitHelper@30e2.init$config$3$toShot$2");
    }

    public static final void accept$20(AfS195S0100000_26 afS195S0100000_26, Object obj) {
        C1C7U.LIZ("SeaReviewLynxViewModel@1aa7.fetchFirstScreenReviewData$4");
        ((SeaReviewLynxViewModel) afS195S0100000_26.l0).setState(AFwS268S0000000_26.get$arr$(762));
        C1C7U.LIZIZ("SeaReviewLynxViewModel@1aa7.fetchFirstScreenReviewData$4");
    }

    public static final void accept$21(AfS195S0100000_26 afS195S0100000_26, Object obj) {
        C1C7U.LIZ("EcMallTabStatusHandlerForTrackStayMall@46a2.onMallCreate$1");
        C1741260vPg c1741260vPgLIZIZ = ((C1767930w6h) afS195S0100000_26.l0).LIZ.LLJJJIL.LIZIZ();
        boolean zLIZLLL = c1741260vPgLIZIZ.LIZLLL();
        if (((Boolean) obj).booleanValue()) {
            if (zLIZLLL) {
                C1767960w6k.LIZ.getClass();
                if (C1767960w6k.LJ()) {
                    C1767930w6h c1767930w6h = (C1767930w6h) afS195S0100000_26.l0;
                    c1767930w6h.LIZ.LLJJJ.getClass();
                    c1767930w6h.LIZLLL(c1741260vPgLIZIZ, C1767980w6m.LJII);
                }
            }
        } else if (zLIZLLL) {
            C1767960w6k.LIZ.getClass();
            if (C1767960w6k.LJ() && C1767960w6k.LJIIL == -1) {
                C1767960w6k.LJIIL = System.currentTimeMillis();
                C2341109Fh.LIZ.getClass();
                C2341109Fh.LIZ("ShopMainLifeCycle stay_time startCalStayTime");
            }
        }
        C1C7U.LIZIZ("EcMallTabStatusHandlerForTrackStayMall@46a2.onMallCreate$1");
    }

    public static final void accept$22(AfS195S0100000_26 afS195S0100000_26, Object obj) {
        FetchPushOffReasonsResp fetchPushOffReasonsResp;
        PushOffReasonsData pushOffReasonsData;
        C1C7U.LIZ("PushSettingsLoginVM@db7f.requestPushOffReasons$2");
        BaseResponse baseResponse = (BaseResponse) obj;
        if ((baseResponse instanceof FetchPushOffReasonsResp) && (fetchPushOffReasonsResp = (FetchPushOffReasonsResp) baseResponse) != null && (pushOffReasonsData = fetchPushOffReasonsResp.data) != null) {
            ((C1750480veY) ((PushSettingsLoginVM) afS195S0100000_26.l0).LL.getValue()).LIZ.storeLong("key_next_push_off_dialog_showtime", System.currentTimeMillis() + ((long) (pushOffReasonsData.interval * LSPassThroughRecordSizeConfig.DEFAULT)));
            C1245240iVe c1245240iVe = C1245240iVe.LIZ;
            String str = ((PushSettingsLoginVM) afS195S0100000_26.l0).LLILLJJLI;
            c1245240iVe.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "push_setting_page");
            c2344009Gk.LJIIIIZZ("label", str);
            C20684815ws.LJIILLIIL("push_feedback_pop_up_show", c2344009Gk.LIZ);
            PushSettingsLoginVM pushSettingsLoginVM = (PushSettingsLoginVM) afS195S0100000_26.l0;
            pushSettingsLoginVM.setState(new AwS396S0200000_30(pushSettingsLoginVM, pushOffReasonsData, 68));
        }
        C1C7U.LIZIZ("PushSettingsLoginVM@db7f.requestPushOffReasons$2");
    }

    public static final void accept$3(AfS195S0100000_26 afS195S0100000_26, Object obj) {
        InterfaceC1726310v1Z interfaceC1726310v1Z;
        C1C7U.LIZ("PowerPreloadInitHelper@30e2.init$config$5$toShot$2");
        Throwable th = (Throwable) obj;
        if ((th instanceof Exception) && (interfaceC1726310v1Z = (InterfaceC1726310v1Z) afS195S0100000_26.l0) != null) {
            interfaceC1726310v1Z.LIZ((Exception) th);
        }
        C1C7U.LIZIZ("PowerPreloadInitHelper@30e2.init$config$5$toShot$2");
    }

    public static final void accept$4(AfS195S0100000_26 afS195S0100000_26, Object obj) {
        C1C7U.LIZ("CommercePageTrackingServiceImpl@e6.monitorAppStatus$1");
        if (((Boolean) obj).booleanValue()) {
            CommercePageTrackingServiceImpl commercePageTrackingServiceImpl = (CommercePageTrackingServiceImpl) afS195S0100000_26.l0;
            commercePageTrackingServiceImpl.LJIILIIL = true;
            commercePageTrackingServiceImpl.LJIIJJI = SystemClock.uptimeMillis();
        } else {
            CommercePageTrackingServiceImpl commercePageTrackingServiceImpl2 = (CommercePageTrackingServiceImpl) afS195S0100000_26.l0;
            commercePageTrackingServiceImpl2.LJIILIIL = false;
            commercePageTrackingServiceImpl2.LJIIL = SystemClock.uptimeMillis() - ((CommercePageTrackingServiceImpl) afS195S0100000_26.l0).LJIIJJI;
        }
        C1C7U.LIZIZ("CommercePageTrackingServiceImpl@e6.monitorAppStatus$1");
    }

    public static final void accept$5(AfS195S0100000_26 afS195S0100000_26, Object obj) {
        C1C7U.LIZ("DynamicAdExplainDialog@d378.monitorAppBackground$1");
        if (((Boolean) obj).booleanValue()) {
            ((DynamicAdExplainDialog) afS195S0100000_26.l0).MR();
        }
        C1C7U.LIZIZ("DynamicAdExplainDialog@d378.monitorAppBackground$1");
    }

    public static final void accept$6(AfS195S0100000_26 afS195S0100000_26, Object obj) {
        C1C7U.LIZ("PdpFragment@ab0c.initData$5");
        Throwable th = (Throwable) obj;
        C11JF c11jf = ((PdpFragment) afS195S0100000_26.l0).LLJLIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        PdpFragment pdpFragment = (PdpFragment) afS195S0100000_26.l0;
        pdpFragment.LLJLIL = null;
        if (th instanceof C1758120vqs) {
            PdpViewModel.zS2(pdpFragment.JS(), null, Integer.valueOf(((C1758120vqs) th).getCode()), false, false, true, false, false, false, false, false, 992);
        } else {
            PdpViewModel.zS2(pdpFragment.JS(), null, null, false, false, false, false, false, false, false, false, 1020);
        }
        C1756150vnh c1756150vnhWS = ((PdpFragment) afS195S0100000_26.l0).wS();
        if (c1756150vnhWS != null) {
            c1756150vnhWS.LIZ(false);
        }
        C1C7U.LIZIZ("PdpFragment@ab0c.initData$5");
    }

    public static final void accept$7(AfS195S0100000_26 afS195S0100000_26, Object obj) {
        C1C7U.LIZ("NewsAnchorPublishRepo@bd0e.requestLinkVerify$4");
        ((Function1) afS195S0100000_26.l0).invoke(obj);
        C1C7U.LIZIZ("NewsAnchorPublishRepo@bd0e.requestLinkVerify$4");
    }

    public static final void accept$8(AfS195S0100000_26 afS195S0100000_26, Object obj) {
        Boolean boolValueOf;
        C1761690vwd c1761690vwd;
        C1C7U.LIZ("GalleryViewerViewModel@cd31.loadMoreReviewImage$1");
        Pair pair = (Pair) obj;
        NextLiveData<Boolean> nextLiveData = ((GalleryViewerViewModel) afS195S0100000_26.l0).LLJ;
        C1761680vwc c1761680vwc = (C1761680vwc) pair.getSecond();
        Integer numValueOf = null;
        if (c1761680vwc != null && (c1761690vwd = c1761680vwc.LIZIZ) != null) {
            boolValueOf = Boolean.valueOf(c1761690vwd.LIZ);
        } else {
            boolValueOf = null;
        }
        nextLiveData.postValue(boolValueOf);
        GalleryViewerViewModel galleryViewerViewModel = (GalleryViewerViewModel) afS195S0100000_26.l0;
        C1761680vwc c1761680vwc2 = (C1761680vwc) pair.getSecond();
        if (c1761680vwc2 != null) {
            numValueOf = Integer.valueOf(c1761680vwc2.LIZ);
        }
        galleryViewerViewModel.LLJI = numValueOf;
        CopyOnWriteArrayList<C1761300vw0> value = ((GalleryViewerViewModel) afS195S0100000_26.l0).LLJJIII.getValue();
        if (C756302xN.LIZ((Collection) pair.getFirst())) {
            ((GalleryViewerViewModel) afS195S0100000_26.l0).LLJJJ = false;
            if (value != null) {
                value.addAll((Collection) pair.getFirst());
                ((GalleryViewerViewModel) afS195S0100000_26.l0).LLJJIII.postValue(value);
            } else {
                ((GalleryViewerViewModel) afS195S0100000_26.l0).LLJJIII.postValue(new CopyOnWriteArrayList<>((Collection) pair.getFirst()));
            }
        }
        C1C7U.LIZIZ("GalleryViewerViewModel@cd31.loadMoreReviewImage$1");
    }

    public static final void accept$9(AfS195S0100000_26 afS195S0100000_26, Object obj) {
        Boolean boolValueOf;
        C1761690vwd c1761690vwd;
        C1C7U.LIZ("GalleryViewerViewModel@cd31.loadMoreReviewImage$2");
        Pair pair = (Pair) obj;
        NextLiveData<Boolean> nextLiveData = ((GalleryViewerViewModel) afS195S0100000_26.l0).LLJ;
        C1761680vwc c1761680vwc = (C1761680vwc) pair.getSecond();
        Integer numValueOf = null;
        if (c1761680vwc != null && (c1761690vwd = c1761680vwc.LIZIZ) != null) {
            boolValueOf = Boolean.valueOf(c1761690vwd.LIZ);
        } else {
            boolValueOf = null;
        }
        nextLiveData.postValue(boolValueOf);
        GalleryViewerViewModel galleryViewerViewModel = (GalleryViewerViewModel) afS195S0100000_26.l0;
        C1761680vwc c1761680vwc2 = (C1761680vwc) pair.getSecond();
        if (c1761680vwc2 != null) {
            numValueOf = Integer.valueOf(c1761680vwc2.LIZ);
        }
        galleryViewerViewModel.LLJI = numValueOf;
        CopyOnWriteArrayList<C1761300vw0> value = ((GalleryViewerViewModel) afS195S0100000_26.l0).LLJJIII.getValue();
        if (C756302xN.LIZ((Collection) pair.getFirst())) {
            ((GalleryViewerViewModel) afS195S0100000_26.l0).LLJJJ = false;
            if (value != null) {
                value.addAll((Collection) pair.getFirst());
                ((GalleryViewerViewModel) afS195S0100000_26.l0).LLJJIII.postValue(value);
            } else {
                ((GalleryViewerViewModel) afS195S0100000_26.l0).LLJJIII.postValue(new CopyOnWriteArrayList<>((Collection) pair.getFirst()));
            }
        }
        C1C7U.LIZIZ("GalleryViewerViewModel@cd31.loadMoreReviewImage$2");
    }
}
