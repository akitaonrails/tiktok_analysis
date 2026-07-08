package Y;

import X.C03O0;
import X.C044M;
import X.C049Y;
import X.C0I7D;
import X.C10358043g;
import X.C1391190mJ3;
import X.C13LZ;
import X.C1440005kM;
import X.C1741890vQh;
import X.C1748720vbi;
import X.C197039127h;
import X.C19EG;
import X.C20684815ws;
import X.C2097608Jq;
import X.C23250099c;
import X.C23271099x;
import X.C343970De7;
import X.C736680Sv4;
import X.C7735030j;
import X.C786410Ut5;
import X.C874103bH;
import X.C886303dF;
import X.C887603dS;
import X.C890103dr;
import X.C893803eS;
import X.C908703gr;
import X.C919503ib;
import X.C941003m4;
import X.C948503nH;
import X.EnumC1011903xV;
import android.content.Context;
import android.os.IBinder;
import android.text.Editable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.CQRCodeFailActivity;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.locationservices.LocationServicesHistoryCell;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.locationservices.LocationServicesManager;
import com.ss.android.ugc.aweme.ecommerce.base.common.view.CommerceBottomSheetDialogFragment;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.auction.AuctionAddressPayFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.auction.AuctionAddressPayVM;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentCacheHelper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCFillCVVAssem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCFillCVVViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.view.bizum.ConfirmBizumPaymentBottomSheetFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.view.blik.ConfirmBlikPaymentBottomSheetFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.payment.viewholder.ccdc.USBARegionInputElementViewHolderV2;
import com.ss.android.ugc.aweme.ecommerce.base.sku.BaseSkuFragment;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuHeaderReusedAssem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuPanelBaseReusedAssem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SeaSkuPanelHeaderWidget;
import com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.SeaSkuSpecViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.counter.SeaSkuCounterCell;
import com.ss.android.ugc.aweme.ecommerce.base.sku.strategy.SkuPanelAssem;
import com.ss.android.ugc.aweme.ecommerce.core.utils.KeyBoardVisibilityUtil;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommerce.us.logistic.module.logisticselectzipcode.EULogisticSelectByZipcodeVH;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.topic.trendingtopic.ui.VideoTrendingTopicGuideFragment;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.tts.oecverify.BdTuring;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes2.dex */
public class ACListenerS136S0100000_1 implements View.OnClickListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
            case 5:
                onClick$5(this, view);
                break;
            case 6:
                onClick$6(this, view);
                break;
            case 7:
                onClick$7(this, view);
                break;
            case 8:
                onClick$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onClick$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onClick$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onClick$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onClick$12(this, view);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onClick$13(this, view);
                break;
            case 14:
                onClick$14(this, view);
                break;
            case 15:
                onClick$15(this, view);
                break;
            case 16:
                onClick$16(this, view);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onClick$17(this, view);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onClick$18(this, view);
                break;
            case 19:
                onClick$19(this, view);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onClick$20(this, view);
                break;
            case 21:
                onClick$21(this, view);
                break;
            case 22:
                onClick$22(this, view);
                break;
            case 23:
                onClick$23(this, view);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                onClick$24(this, view);
                break;
            case 25:
                onClick$25(this, view);
                break;
            case 26:
                onClick$26(this, view);
                break;
            case 27:
                onClick$27(this, view);
                break;
            case 28:
                onClick$28(this, view);
                break;
            case 29:
                onClick$29(this, view);
                break;
            case 30:
                onClick$30(this, view);
                break;
            case 31:
                onClick$31(this, view);
                break;
        }
    }

    public ACListenerS136S0100000_1(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(ACListenerS136S0100000_1 aCListenerS136S0100000_1, View view) {
        AddressSelectViewModel addressSelectViewModelA6 = ((EULogisticSelectByZipcodeVH) aCListenerS136S0100000_1.l0).a6();
        addressSelectViewModelA6.getClass();
        addressSelectViewModelA6.setState(AFwS228S0000000_1.get$arr$(860));
        C1748720vbi.LIZLLL(((EULogisticSelectByZipcodeVH) aCListenerS136S0100000_1.l0).itemView, new C049Y(), AFwS228S0000000_1.get$arr$(8));
    }

    public static final void onClick$1(ACListenerS136S0100000_1 aCListenerS136S0100000_1, View view) {
        C20684815ws.onEventV3("deeplink_preview_error_toast_click");
        ((CQRCodeFailActivity) aCListenerS136S0100000_1.l0).finish();
    }

    public static final void onClick$10(ACListenerS136S0100000_1 aCListenerS136S0100000_1, View view) {
        SeaSkuPanelHeaderWidget seaSkuPanelHeaderWidget = (SeaSkuPanelHeaderWidget) aCListenerS136S0100000_1.l0;
        seaSkuPanelHeaderWidget.withState(seaSkuPanelHeaderWidget.LJII(), new AwS580S0100000_1((SeaSkuPanelHeaderWidget) aCListenerS136S0100000_1.l0, 290));
    }

    public static final void onClick$11(ACListenerS136S0100000_1 aCListenerS136S0100000_1, View view) {
        SeaSkuPanelHeaderWidget seaSkuPanelHeaderWidget = (SeaSkuPanelHeaderWidget) aCListenerS136S0100000_1.l0;
        seaSkuPanelHeaderWidget.withState(seaSkuPanelHeaderWidget.LJII(), new AwS580S0100000_1((SeaSkuPanelHeaderWidget) aCListenerS136S0100000_1.l0, 291));
    }

    public static final void onClick$12(ACListenerS136S0100000_1 aCListenerS136S0100000_1, View view) {
        C7735030j c7735030jL5;
        String strValueOf;
        C908703gr c908703gr = ((SeaSkuCounterCell) aCListenerS136S0100000_1.l0).N5().LLJILJILJ;
        if (c908703gr != null && c908703gr.LIZ.cS()) {
            return;
        }
        SeaSkuCounterCell seaSkuCounterCell = (SeaSkuCounterCell) aCListenerS136S0100000_1.l0;
        if (!seaSkuCounterCell.LLJJIJI || (c7735030jL5 = seaSkuCounterCell.L5()) == null) {
            return;
        }
        SeaSkuCounterCell seaSkuCounterCell2 = (SeaSkuCounterCell) aCListenerS136S0100000_1.l0;
        int i = seaSkuCounterCell2.LLJJIJIIJIL;
        if (i < c7735030jL5.LIZIZ) {
            int i2 = i + 1;
            seaSkuCounterCell2.LLJJIJIIJIL = i2;
            if (i2 == 0) {
                strValueOf = "";
            } else {
                strValueOf = String.valueOf(i2);
            }
            seaSkuCounterCell2.U5(strValueOf);
            SeaSkuSpecViewModel.DQ2(((SeaSkuCounterCell) aCListenerS136S0100000_1.l0).N5(), ((SeaSkuCounterCell) aCListenerS136S0100000_1.l0).LLJJIJIIJIL, 6);
            SeaSkuCounterCell seaSkuCounterCell3 = (SeaSkuCounterCell) aCListenerS136S0100000_1.l0;
            seaSkuCounterCell3.T5(C13LZ.LJ(seaSkuCounterCell3.LLJJIJIIJIL, c7735030jL5.LIZ, c7735030jL5.LIZIZ), c7735030jL5);
        } else {
            seaSkuCounterCell2.P5(c7735030jL5);
        }
        C908703gr c908703gr2 = ((SeaSkuCounterCell) aCListenerS136S0100000_1.l0).N5().LLJILJILJ;
        if (c908703gr2 != null) {
            c908703gr2.LIZLLL("tiktokec_button_click", new C049Y(), new AwS545S0100000_1((SeaSkuCounterCell) aCListenerS136S0100000_1.l0, 1446), EnumC1011903xV.LOG_VIEW, ((SeaSkuCounterCell) aCListenerS136S0100000_1.l0).LLJIJIL, null);
        }
    }

    public static final void onClick$13(ACListenerS136S0100000_1 aCListenerS136S0100000_1, View view) {
        C7735030j c7735030jL5;
        String strValueOf;
        C908703gr c908703gr = ((SeaSkuCounterCell) aCListenerS136S0100000_1.l0).N5().LLJILJILJ;
        if (c908703gr != null && c908703gr.LIZ.cS()) {
            return;
        }
        SeaSkuCounterCell seaSkuCounterCell = (SeaSkuCounterCell) aCListenerS136S0100000_1.l0;
        if (!seaSkuCounterCell.LLJJIJI || (c7735030jL5 = seaSkuCounterCell.L5()) == null) {
            return;
        }
        SeaSkuCounterCell seaSkuCounterCell2 = (SeaSkuCounterCell) aCListenerS136S0100000_1.l0;
        int i = seaSkuCounterCell2.LLJJIJIIJIL;
        if (i > c7735030jL5.LIZ) {
            int i2 = i - 1;
            seaSkuCounterCell2.LLJJIJIIJIL = i2;
            if (i2 == 0) {
                strValueOf = "";
            } else {
                strValueOf = String.valueOf(i2);
            }
            seaSkuCounterCell2.U5(strValueOf);
            SeaSkuSpecViewModel.DQ2(((SeaSkuCounterCell) aCListenerS136S0100000_1.l0).N5(), ((SeaSkuCounterCell) aCListenerS136S0100000_1.l0).LLJJIJIIJIL, 6);
            SeaSkuCounterCell seaSkuCounterCell3 = (SeaSkuCounterCell) aCListenerS136S0100000_1.l0;
            seaSkuCounterCell3.T5(C13LZ.LJ(seaSkuCounterCell3.LLJJIJIIJIL, c7735030jL5.LIZ, c7735030jL5.LIZIZ), c7735030jL5);
        } else {
            seaSkuCounterCell2.R5(c7735030jL5);
        }
        C908703gr c908703gr2 = ((SeaSkuCounterCell) aCListenerS136S0100000_1.l0).N5().LLJILJILJ;
        if (c908703gr2 != null) {
            c908703gr2.LIZLLL("tiktokec_button_click", new C049Y(), new AwS545S0100000_1((SeaSkuCounterCell) aCListenerS136S0100000_1.l0, 1449), EnumC1011903xV.LOG_VIEW, ((SeaSkuCounterCell) aCListenerS136S0100000_1.l0).LLJI, null);
        }
    }

    public static final void onClick$14(ACListenerS136S0100000_1 aCListenerS136S0100000_1, View view) {
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF((VideoTrendingTopicGuideFragment) aCListenerS136S0100000_1.l0, C343970De7.LIZ);
    }

    public static final void onClick$15(ACListenerS136S0100000_1 aCListenerS136S0100000_1, View view) {
        String str;
        ((AuctionAddressPayFragment) aCListenerS136S0100000_1.l0).VR().LLJJIII = ((AuctionAddressPayFragment) aCListenerS136S0100000_1.l0).VR().LLJJ;
        ((AuctionAddressPayFragment) aCListenerS136S0100000_1.l0).VR().LLJJIJI = ((AuctionAddressPayFragment) aCListenerS136S0100000_1.l0).VR().LLJJI;
        if (!((AuctionAddressPayFragment) aCListenerS136S0100000_1.l0).VR().LLJIJIL && !((AuctionAddressPayFragment) aCListenerS136S0100000_1.l0).VR().LLJILJIL) {
            str = "done";
        } else {
            str = "confirm";
        }
        C03O0 c03o0 = C03O0.LIZ;
        HashMap mapLJI = C2097608Jq.LJI(new Pair("page_name", "live_auction_info_needed"), new Pair("button_name", str));
        c03o0.getClass();
        C03O0.LJJIII("livesdk_tiktokec_button_click", mapLJI);
        if (((AuctionAddressPayFragment) aCListenerS136S0100000_1.l0).VR().LLJILJIL) {
            AuctionAddressPayVM auctionAddressPayVMVR = ((AuctionAddressPayFragment) aCListenerS136S0100000_1.l0).VR();
            C19EG activity = ((AuctionAddressPayFragment) aCListenerS136S0100000_1.l0).getActivity();
            AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1((AuctionAddressPayFragment) aCListenerS136S0100000_1.l0, 1514);
            auctionAddressPayVMVR.setState(AFwS228S0000000_1.get$arr$(419));
            C948503nH.LJI(auctionAddressPayVMVR, C23271099x.INSTANCE, new C886303dF(auctionAddressPayVMVR, activity, null, awS545S0100000_1, null));
            return;
        }
        if (((AuctionAddressPayFragment) aCListenerS136S0100000_1.l0).VR().LLJIJIL) {
            ((AuctionAddressPayFragment) aCListenerS136S0100000_1.l0).VR().LLJIJIL = false;
            ((AuctionAddressPayFragment) aCListenerS136S0100000_1.l0).VR().CQ2(new AwS545S0100000_1((AuctionAddressPayFragment) aCListenerS136S0100000_1.l0, 1515));
            return;
        }
        AuctionAddressPayFragment auctionAddressPayFragment = (AuctionAddressPayFragment) aCListenerS136S0100000_1.l0;
        auctionAddressPayFragment.getClass();
        String str2 = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF(auctionAddressPayFragment, C343970De7.LIZ);
        auctionAddressPayFragment.LLJJI = "done";
    }

    public static final void onClick$16(ACListenerS136S0100000_1 aCListenerS136S0100000_1, View view) {
        ((SkuPanelAssem) aCListenerS136S0100000_1.l0).Go().dismissAllowingStateLoss();
    }

    public static final void onClick$17(ACListenerS136S0100000_1 aCListenerS136S0100000_1, View view) {
        Function0 function0 = (Function0) aCListenerS136S0100000_1.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onClick$18(ACListenerS136S0100000_1 aCListenerS136S0100000_1, View view) {
        ((Function0) aCListenerS136S0100000_1.l0).invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$19(ACListenerS136S0100000_1 aCListenerS136S0100000_1, View view) {
        C044M c044m = (C044M) aCListenerS136S0100000_1.l0;
        C736680Sv4.LJIJJ(((SkuPanelBaseReusedAssem) c044m).getViewModel(), new AwS580S0100000_1(c044m, 559));
        C10358043g.LIZ((C044M) aCListenerS136S0100000_1.l0);
    }

    public static final void onClick$2(ACListenerS136S0100000_1 aCListenerS136S0100000_1, View view) {
        Fragment currentFragment = ((LocationServicesHistoryCell) aCListenerS136S0100000_1.l0).getCurrentFragment();
        if (currentFragment != null) {
            LocationServicesHistoryCell locationServicesHistoryCell = (LocationServicesHistoryCell) aCListenerS136S0100000_1.l0;
            LocationServicesManager locationServicesManager = LocationServicesManager.LIZ;
            Context context = locationServicesHistoryCell.itemView.getContext();
            locationServicesManager.getClass();
            LocationServicesManager.LJFF(context, currentFragment);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$20(ACListenerS136S0100000_1 aCListenerS136S0100000_1, View view) {
        C044M c044m = (C044M) aCListenerS136S0100000_1.l0;
        C736680Sv4.LJIJJ(((SkuPanelBaseReusedAssem) c044m).getViewModel(), new AwS367S0200000_1(c044m, view, 226));
        C10358043g.LIZ((C044M) aCListenerS136S0100000_1.l0);
    }

    public static final void onClick$21(ACListenerS136S0100000_1 aCListenerS136S0100000_1, View view) {
        String lowerCase;
        Context context = ((USBARegionInputElementViewHolderV2) aCListenerS136S0100000_1.l0).itemView.getContext();
        Pair[] pairArr = new Pair[5];
        pairArr[0] = new Pair("geoname_ids", Collections.singletonList(((USBARegionInputElementViewHolderV2) aCListenerS136S0100000_1.l0).I5().IQ2().geoNameId));
        pairArr[1] = new Pair("is_full_screen", CardStruct.IStatusCode.DEFAULT);
        pairArr[2] = new Pair("is_show_searchbar", C893803eS.LIZ(!((Boolean) ((USBARegionInputElementViewHolderV2) aCListenerS136S0100000_1.l0).LLILLJJLI.getValue()).booleanValue()));
        pairArr[3] = new Pair("without_next_level", String.valueOf(((Boolean) ((USBARegionInputElementViewHolderV2) aCListenerS136S0100000_1.l0).LLILLJJLI.getValue()).booleanValue()));
        HashMap map = new HashMap();
        USBARegionInputElementViewHolderV2 uSBARegionInputElementViewHolderV2 = (USBARegionInputElementViewHolderV2) aCListenerS136S0100000_1.l0;
        C890103dr.LIZ.getClass();
        map.putAll(C890103dr.LIZJ);
        map.put("page_name", "ccdc_card_info");
        String str = uSBARegionInputElementViewHolderV2.I5().IQ2().code;
        if (str == null || (lowerCase = str.toLowerCase(Locale.ROOT)) == null) {
            PaymentCacheHelper.LIZ.getClass();
            String str2 = PaymentCacheHelper.LJIIIIZZ().code;
            if (str2 != null) {
                lowerCase = str2.toLowerCase(Locale.ROOT);
            } else {
                lowerCase = "";
            }
        }
        map.put("location", lowerCase);
        pairArr[4] = new Pair("trackParams", map);
        C919503ib.LIZIZ(context, "aweme://ec/geo_select_v2", C2097608Jq.LJIIIIZZ(pairArr), false).open();
    }

    public static final void onClick$22(ACListenerS136S0100000_1 aCListenerS136S0100000_1, View view) {
        ((C874103bH) aCListenerS136S0100000_1.l0).getSubPromotionViewClickListener().invoke(((C874103bH) aCListenerS136S0100000_1.l0).getSubPaymentMethod());
    }

    public static final void onClick$23(ACListenerS136S0100000_1 aCListenerS136S0100000_1, View view) {
        ((Function0) aCListenerS136S0100000_1.l0).invoke();
    }

    public static final void onClick$24(ACListenerS136S0100000_1 aCListenerS136S0100000_1, View view) {
        ((Function0) aCListenerS136S0100000_1.l0).invoke();
    }

    public static final void onClick$25(ACListenerS136S0100000_1 aCListenerS136S0100000_1, View view) {
        ((Function0) aCListenerS136S0100000_1.l0).invoke();
    }

    public static final void onClick$26(ACListenerS136S0100000_1 aCListenerS136S0100000_1, View view) {
        ((Function0) aCListenerS136S0100000_1.l0).invoke();
    }

    public static final void onClick$27(ACListenerS136S0100000_1 aCListenerS136S0100000_1, View view) {
        ((C941003m4) aCListenerS136S0100000_1.l0).setInputType("");
        ((C941003m4) aCListenerS136S0100000_1.l0).getInputWithIndicatorEditTextFromXml().setText("");
        C0I7D inputWithIndicatorEditTextFromXml = ((C941003m4) aCListenerS136S0100000_1.l0).getInputWithIndicatorEditTextFromXml();
        inputWithIndicatorEditTextFromXml.setFocusableInTouchMode(true);
        inputWithIndicatorEditTextFromXml.requestFocus();
    }

    public static final void onClick$28(ACListenerS136S0100000_1 aCListenerS136S0100000_1, View view) {
        ((Function0) aCListenerS136S0100000_1.l0).invoke();
    }

    public static final void onClick$29(ACListenerS136S0100000_1 aCListenerS136S0100000_1, View view) {
        C03O0.LJJJJLL(C03O0.LIZ, "go_back", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, ((OrderSubmitFragment) aCListenerS136S0100000_1.l0).ZR().LLJJIJI, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, -2, 8388605);
        C19EG activity = ((OrderSubmitFragment) aCListenerS136S0100000_1.l0).getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public static final void onClick$3(ACListenerS136S0100000_1 aCListenerS136S0100000_1, View view) {
        CommerceBottomSheetDialogFragment.WR((CommerceBottomSheetDialogFragment) aCListenerS136S0100000_1.l0);
    }

    public static final void onClick$30(ACListenerS136S0100000_1 aCListenerS136S0100000_1, View view) {
        C03O0.LJJJJLL(C03O0.LIZ, "retry", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, ((OrderSubmitFragment) aCListenerS136S0100000_1.l0).ZR().LLJJIJI, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, -2, 8388605);
        C03O0.LJIIIZ++;
        OrderSubmitAssemViewModel.OS2(((OrderSubmitFragment) aCListenerS136S0100000_1.l0).ZR(), false, false, null, false, false, false, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, 8388607);
    }

    public static final void onClick$31(ACListenerS136S0100000_1 aCListenerS136S0100000_1, View view) {
        final C197039127h c197039127h = (C197039127h) aCListenerS136S0100000_1.l0;
        C1440005kM.LIZ(new IEvent(c197039127h) { // from class: X.037y
            public final C197039127h LIZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C7932037y) && Intrinsics.LJFF(this.LIZ, ((C7932037y) obj).LIZ);
            }

            public final int hashCode() {
                C197039127h c197039127h2 = this.LIZ;
                if (c197039127h2 == null) {
                    return 0;
                }
                return c197039127h2.hashCode();
            }

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

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PurchaseClickEvent(purchaseButton=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZ = c197039127h;
            }
        });
    }

    public static final void onClick$4(ACListenerS136S0100000_1 aCListenerS136S0100000_1, View view) {
        String string;
        String string2;
        ElementDTO elementDTONo = ((CCDCFillCVVAssem) aCListenerS136S0100000_1.l0).No();
        if (elementDTONo != null) {
            CCDCFillCVVAssem cCDCFillCVVAssem = (CCDCFillCVVAssem) aCListenerS136S0100000_1.l0;
            Editable text = cCDCFillCVVAssem.Ho().getText();
            if (text == null || (string2 = text.toString()) == null || (string = a0.LJLIIIL(string2).toString()) == null) {
                string = "";
            }
            PaymentElement paymentElementLIZ = elementDTONo.LIZ();
            paymentElementLIZ.setParamValue(string);
            CCDCFillCVVViewModel cCDCFillCVVViewModelLo = cCDCFillCVVAssem.Lo();
            cCDCFillCVVViewModelLo.setState(AFwS228S0000000_1.get$arr$(597));
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(cCDCFillCVVViewModelLo), null, null, new C887603dS(cCDCFillCVVViewModelLo, paymentElementLIZ, null), 3);
        }
    }

    public static final void onClick$5(ACListenerS136S0100000_1 aCListenerS136S0100000_1, View view) {
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJ((RelativeLayout) aCListenerS136S0100000_1.l0, C343970De7.LIZ);
    }

    public static final void onClick$6(ACListenerS136S0100000_1 aCListenerS136S0100000_1, View view) {
        Function0<Unit> function0 = ((ConfirmBizumPaymentBottomSheetFragment) aCListenerS136S0100000_1.l0).LL;
        if (function0 != null) {
            function0.invoke();
        }
        ((ConfirmBizumPaymentBottomSheetFragment) aCListenerS136S0100000_1.l0).u3();
    }

    public static final void onClick$7(ACListenerS136S0100000_1 aCListenerS136S0100000_1, View view) {
        Function0<Unit> function0 = ((ConfirmBlikPaymentBottomSheetFragment) aCListenerS136S0100000_1.l0).LL;
        if (function0 != null) {
            function0.invoke();
        }
        ((ConfirmBlikPaymentBottomSheetFragment) aCListenerS136S0100000_1.l0).u3();
    }

    public static final void onClick$8(ACListenerS136S0100000_1 aCListenerS136S0100000_1, View view) {
        Object objH2;
        BaseSkuFragment baseSkuFragment = (BaseSkuFragment) aCListenerS136S0100000_1.l0;
        KeyBoardVisibilityUtil keyBoardVisibilityUtil = baseSkuFragment.LLJILJIL;
        if (keyBoardVisibilityUtil != null) {
            if (keyBoardVisibilityUtil.LLILZ) {
                Context context = baseSkuFragment.getContext();
                IBinder windowToken = null;
                if (context != null) {
                    objH2 = C786410Ut5.H2(context, "input_method");
                } else {
                    objH2 = null;
                }
                InputMethodManager inputMethodManager = (InputMethodManager) objH2;
                View view2 = baseSkuFragment.getView();
                if (view2 != null) {
                    windowToken = view2.getWindowToken();
                }
                inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
                ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZ("ec_sku_panel_keyboard_show", C1741890vQh.LJIIIIZZ(new SkuPanelStarter.SkuKeyboardVisibilityParams(false, 0)));
                return;
            }
            baseSkuFragment.dismissAllowingStateLoss();
        }
    }

    public static final void onClick$9(ACListenerS136S0100000_1 aCListenerS136S0100000_1, View view) {
        C736680Sv4.LJIJJ(((SkuHeaderReusedAssem) aCListenerS136S0100000_1.l0).getViewModel(), new AwS580S0100000_1((SkuHeaderReusedAssem) aCListenerS136S0100000_1.l0, 269));
    }
}
