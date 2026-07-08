package Y;

import X.AbstractC1905540zge;
import X.C034S;
import X.C03PI;
import X.C03S2;
import X.C03WX;
import X.C03X2;
import X.C043A;
import X.C043B;
import X.C044E;
import X.C04CV;
import X.C054G;
import X.C098200Yq;
import X.C09AJ;
import X.C09JN;
import X.C0X52;
import X.C1019103yf;
import X.C1055604Aw;
import X.C1073304Hr;
import X.C1120604Zw;
import X.C11JF;
import X.C1233040iBy;
import X.C1388190mED;
import X.C1758140vqu;
import X.C189200o6;
import X.C19EG;
import X.C1AF0;
import X.C1AQS;
import X.C1C7U;
import X.C7740030o;
import X.C786410Ut5;
import X.C842503Qx;
import X.C857203Wo;
import X.C875203bS;
import X.C876103bb;
import X.C876203bc;
import X.C886203dE;
import X.DialogC1389620mGW;
import X.EnumC1014603xw;
import X.EnumC10383044f;
import X.EnumC1756020vnU;
import X.InterfaceC1364105Vn;
import X.InterfaceC20236714Gf;
import X.InterfaceC919403ia;
import X.InterfaceC975703rf;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.goda.v2.model.dto.GodaV2Data;
import com.bytedance.goda.v2.model.dto.GodaV2Protocol;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.bundlepanel.BundlePanelFragment;
import com.ss.android.ugc.aweme.ecommerce.base.bundlepanel.BundlePanelVM;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentBindingPollingManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ListPaymentMethodResp;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetailReview;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopReviewEntry;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ListReviewData;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewAspectPercentageCard;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewCardUI;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.SearchDistrictsData;
import com.ss.android.ugc.aweme.ecommerce.core.router.EcomPaymentInterceptor;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS16S0010000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public class AfS170S0100000_1 implements C09JN {
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
            case 23:
                accept$23(this, obj);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                accept$24(this, obj);
                break;
            case 25:
                accept$25(this, obj);
                break;
            case 26:
                accept$26(this, obj);
                break;
            case 27:
                accept$27(this, obj);
                break;
            case 28:
                accept$28(this, obj);
                break;
            case 29:
                accept$29(this, obj);
                break;
            case 30:
                accept$30(this, obj);
                break;
            case 31:
                accept$31(this, obj);
                break;
            case 32:
                accept$32(this, obj);
                break;
        }
    }

    public AfS170S0100000_1(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void accept$0(AfS170S0100000_1 afS170S0100000_1, Object obj) {
        C1C7U.LIZ("OrderSubmitRepository@9af5.pollOrderStatus$2$1");
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) afS170S0100000_1.l0;
        C189200o6.m2constructorimpl(obj);
        interfaceC1364105Vn.resumeWith(obj);
        C1C7U.LIZIZ("OrderSubmitRepository@9af5.pollOrderStatus$2$1");
    }

    public static final void accept$1(AfS170S0100000_1 afS170S0100000_1, Object obj) {
        C1C7U.LIZ("OrderSubmitRepository@9af5.pollOrderStatus$2$2");
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) afS170S0100000_1.l0;
        C098200Yq c098200Yq = new C098200Yq((Throwable) obj);
        C189200o6.m2constructorimpl(c098200Yq);
        interfaceC1364105Vn.resumeWith(c098200Yq);
        C1C7U.LIZIZ("OrderSubmitRepository@9af5.pollOrderStatus$2$2");
    }

    public static final void accept$10(AfS170S0100000_1 afS170S0100000_1, Object obj) {
        C1C7U.LIZ("MembershipCashierLauncher@64ba.open$7");
        ((C876203bc) afS170S0100000_1.l0).LIZ();
        C886203dE.LIZ.getClass();
        C886203dE.LJFF("paymentList request failed", (Throwable) obj);
        C876203bc.LIZJ((C876203bc) afS170S0100000_1.l0);
        C1C7U.LIZIZ("MembershipCashierLauncher@64ba.open$7");
    }

    public static final void accept$11(AfS170S0100000_1 afS170S0100000_1, Object obj) {
        C1C7U.LIZ("BindHelper@eb8d.scheduleBindCards$1");
        DialogC1389620mGW dialogC1389620mGW = (DialogC1389620mGW) ((C876103bb) afS170S0100000_1.l0).LIZIZ.getValue();
        dialogC1389620mGW.setCanceledOnTouchOutside(false);
        C786410Ut5.J4(dialogC1389620mGW);
        C1C7U.LIZIZ("BindHelper@eb8d.scheduleBindCards$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$12(AfS170S0100000_1 afS170S0100000_1, Object obj) {
        PaymentMethodsData paymentMethodsData;
        C1C7U.LIZ("BindHelper@eb8d.fetchPaymentData$2$1");
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) afS170S0100000_1.l0;
        ListPaymentMethodResp listPaymentMethodResp = (ListPaymentMethodResp) ((Response) obj).data;
        if (listPaymentMethodResp != null) {
            paymentMethodsData = listPaymentMethodResp.pmd;
        } else {
            paymentMethodsData = null;
        }
        C842503Qx c842503Qx = new C842503Qx((Integer) null, paymentMethodsData, (PaymentInfo) null, 8);
        C189200o6.m2constructorimpl(c842503Qx);
        interfaceC1364105Vn.resumeWith(c842503Qx);
        C1C7U.LIZIZ("BindHelper@eb8d.fetchPaymentData$2$1");
    }

    public static final void accept$13(AfS170S0100000_1 afS170S0100000_1, Object obj) {
        C1C7U.LIZ("BindHelper@eb8d.fetchPaymentData$2$2");
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) afS170S0100000_1.l0;
        C098200Yq c098200Yq = new C098200Yq((Throwable) obj);
        C189200o6.m2constructorimpl(c098200Yq);
        interfaceC1364105Vn.resumeWith(c098200Yq);
        C1C7U.LIZIZ("BindHelper@eb8d.fetchPaymentData$2$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$14(Y.AfS170S0100000_1 r8, java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS170S0100000_1.accept$14(Y.AfS170S0100000_1, java.lang.Object):void");
    }

    public static final void accept$15(AfS170S0100000_1 afS170S0100000_1, Object obj) {
        C1C7U.LIZ("PaymentBindingPollingManager@a081.queryBindStatus$disposable$2");
        InterfaceC919403ia interfaceC919403ia = ((PaymentBindingPollingManager) afS170S0100000_1.l0).LJ;
        if (interfaceC919403ia != null) {
            interfaceC919403ia.LIZJ();
        }
        C1C7U.LIZIZ("PaymentBindingPollingManager@a081.queryBindStatus$disposable$2");
    }

    public static final void accept$16(AfS170S0100000_1 afS170S0100000_1, Object obj) {
        C1C7U.LIZ("PayHelper$Companion@af2c.getPaymentListSuspend$3$2");
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) afS170S0100000_1.l0;
        C098200Yq c098200Yq = new C098200Yq((Throwable) obj);
        C189200o6.m2constructorimpl(c098200Yq);
        interfaceC1364105Vn.resumeWith(c098200Yq);
        C1C7U.LIZIZ("PayHelper$Companion@af2c.getPaymentListSuspend$3$2");
    }

    public static final void accept$17(AfS170S0100000_1 afS170S0100000_1, Object obj) {
        GodaV2Protocol<?> godaV2Protocol;
        C1C7U.LIZ("ISkuPanelViewModel@f37b.getProductInfo$1");
        ProductPackStruct productPackStruct = (ProductPackStruct) obj;
        ((C043B) afS170S0100000_1.l0).U50(productPackStruct.godaProtocolJSON);
        if (C044E.LIZ() && (godaV2Protocol = productPackStruct.godaV2Protocol) != null) {
            C04CV c04cv = new C04CV(false, false, godaV2Protocol.localExtra);
            C1055604Aw c1055604AwDr0 = ((C043B) afS170S0100000_1.l0).Dr0();
            if (c1055604AwDr0 != null) {
                c1055604AwDr0.LIZIZ(productPackStruct.godaV2Protocol, c04cv);
            }
        }
        String str = productPackStruct.productId;
        if (str != null) {
            productPackStruct.godaProtocolJSON = null;
            C054G c054g = C1758140vqu.LIZ;
            C1758140vqu.LJFF(str, productPackStruct, EnumC1756020vnU.LAST_USED_CACHE, null);
        }
        ((C043B) afS170S0100000_1.l0).BX(false);
        C043A.LJ((C043B) afS170S0100000_1.l0, productPackStruct, true);
        ((C043B) afS170S0100000_1.l0).dispose();
        ((C043B) afS170S0100000_1.l0).Fk(false);
        C1C7U.LIZIZ("ISkuPanelViewModel@f37b.getProductInfo$1");
    }

    public static final void accept$18(AfS170S0100000_1 afS170S0100000_1, Object obj) {
        C1C7U.LIZ("ISkuPanelViewModel@f37b.getProductInfo$2");
        ((C043B) afS170S0100000_1.l0).BX(false);
        ((C043B) afS170S0100000_1.l0).LJJJZ(AFwS228S0000000_1.get$arr$(374));
        ((C043B) afS170S0100000_1.l0).dispose();
        ((C043B) afS170S0100000_1.l0).Fk(false);
        C043A.LJII((C043B) afS170S0100000_1.l0, EnumC10383044f.FAIL);
        C1C7U.LIZIZ("ISkuPanelViewModel@f37b.getProductInfo$2");
    }

    public static final void accept$19(AfS170S0100000_1 afS170S0100000_1, Object obj) {
        C1C7U.LIZ("EcomPaymentInterceptor@4b8f.onInterceptRoute$5");
        EcomPaymentInterceptor ecomPaymentInterceptor = (EcomPaymentInterceptor) afS170S0100000_1.l0;
        ecomPaymentInterceptor.LL = 2;
        if (ecomPaymentInterceptor.LLILLJJLI) {
            ecomPaymentInterceptor.LJIIIIZZ(null);
        }
        C1C7U.LIZIZ("EcomPaymentInterceptor@4b8f.onInterceptRoute$5");
    }

    public static final void accept$2(AfS170S0100000_1 afS170S0100000_1, Object obj) {
        C1C7U.LIZ("OrderSubmitRepository@9af5.fetchBillInfo$2$1");
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) afS170S0100000_1.l0;
        C189200o6.m2constructorimpl(obj);
        interfaceC1364105Vn.resumeWith(obj);
        C1C7U.LIZIZ("OrderSubmitRepository@9af5.fetchBillInfo$2$1");
    }

    public static final void accept$20(AfS170S0100000_1 afS170S0100000_1, Object obj) {
        C1C7U.LIZ("EcomPaymentInterceptor@4b8f.onInterceptRoute$8");
        EcomPaymentInterceptor ecomPaymentInterceptor = (EcomPaymentInterceptor) afS170S0100000_1.l0;
        ecomPaymentInterceptor.LL = 2;
        if (ecomPaymentInterceptor.LLILLJJLI) {
            ecomPaymentInterceptor.LJIIIIZZ(null);
        }
        C1C7U.LIZIZ("EcomPaymentInterceptor@4b8f.onInterceptRoute$8");
    }

    public static final void accept$21(AfS170S0100000_1 afS170S0100000_1, Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("BackupPaymentFlowCoordinator@88b3.fetchRemotePageData$response$1$disposable$1");
        String str = (String) obj;
        if (((InterfaceC20236714Gf) afS170S0100000_1.l0).isActive()) {
            try {
                C875203bS.LIZ.getClass();
                c098200Yq = C875203bS.LJIIIIZZ(str);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) afS170S0100000_1.l0;
            if (C189200o6.m8isSuccessimpl(c098200Yq)) {
                C189200o6.m2constructorimpl(c098200Yq);
                interfaceC20236714Gf.resumeWith(c098200Yq);
            }
            InterfaceC20236714Gf interfaceC20236714Gf2 = (InterfaceC20236714Gf) afS170S0100000_1.l0;
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C1AF0.LJ(thM5exceptionOrNullimpl);
                C189200o6.m2constructorimpl(null);
                interfaceC20236714Gf2.resumeWith(null);
            }
        }
        C1C7U.LIZIZ("BackupPaymentFlowCoordinator@88b3.fetchRemotePageData$response$1$disposable$1");
    }

    public static final void accept$22(AfS170S0100000_1 afS170S0100000_1, Object obj) {
        C1C7U.LIZ("BackupPaymentFlowCoordinator@88b3.fetchRemotePageData$response$1$disposable$2");
        Throwable th = (Throwable) obj;
        if (((InterfaceC20236714Gf) afS170S0100000_1.l0).isActive()) {
            C1AF0.LJ(th);
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) afS170S0100000_1.l0;
            C189200o6.m2constructorimpl(null);
            interfaceC20236714Gf.resumeWith(null);
        }
        C1C7U.LIZIZ("BackupPaymentFlowCoordinator@88b3.fetchRemotePageData$response$1$disposable$2");
    }

    public static final void accept$23(AfS170S0100000_1 afS170S0100000_1, Object obj) {
        C1C7U.LIZ("BundlePanelVM@2892.getProductInfo$2");
        ((BundlePanelVM) afS170S0100000_1.l0).setState(AFwS228S0000000_1.get$arr$(387));
        BundlePanelVM bundlePanelVM = (BundlePanelVM) afS170S0100000_1.l0;
        C11JF c11jf = bundlePanelVM.LLIZLLLIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        bundlePanelVM.LLIZLLLIL = null;
        C1C7U.LIZIZ("BundlePanelVM@2892.getProductInfo$2");
    }

    public static final void accept$24(AfS170S0100000_1 afS170S0100000_1, Object obj) {
        C1C7U.LIZ("OrderSubmitAssemViewModel@f79d.pay$1$job$2");
        ((OrderSubmitAssemViewModel) afS170S0100000_1.l0).nT2();
        C1C7U.LIZIZ("OrderSubmitAssemViewModel@f79d.pay$1$job$2");
    }

    public static final void accept$25(AfS170S0100000_1 afS170S0100000_1, Object obj) {
        C1C7U.LIZ("MiniOspViewModel@8f4.handleBillInfoChunkAsync$1$2");
        Throwable th = (Throwable) obj;
        C03WX c03wx = ((MiniOspViewModel) afS170S0100000_1.l0).LLJJL;
        if (c03wx != null && Intrinsics.LJFF(c03wx.LIZJ, Boolean.TRUE)) {
            ((MiniOspViewModel) afS170S0100000_1.l0).setState(AFwS228S0000000_1.get$arr$(499));
        } else {
            ((MiniOspViewModel) afS170S0100000_1.l0).setState(AFwS228S0000000_1.get$arr$(503));
            MiniOspViewModel miniOspViewModel = (MiniOspViewModel) afS170S0100000_1.l0;
            miniOspViewModel.getClass();
            miniOspViewModel.withState(new AwS580S0100000_1(miniOspViewModel, 429));
        }
        ((MiniOspViewModel) afS170S0100000_1.l0).setState(AFwS228S0000000_1.get$arr$(510));
        MiniOspViewModel miniOspViewModel2 = (MiniOspViewModel) afS170S0100000_1.l0;
        miniOspViewModel2.getClass();
        miniOspViewModel2.setState(new AwS16S0010000_1(false, 23));
        C1AF0.LJ(th);
        C1C7U.LIZIZ("MiniOspViewModel@8f4.handleBillInfoChunkAsync$1$2");
    }

    public static final void accept$26(AfS170S0100000_1 afS170S0100000_1, Object obj) {
        C03X2 c03x2;
        C1C7U.LIZ("OrderSubmitAssemViewModel@f79d.handleBillInfoChunkAsync$2$2");
        ARunnableS70S0200000_1 aRunnableS70S0200000_1 = new ARunnableS70S0200000_1((OrderSubmitAssemViewModel) afS170S0100000_1.l0, (Throwable) obj, 12);
        C03S2.LIZ.getClass();
        if (C03S2.LIZ()) {
            C03WX c03wx = ((OrderSubmitAssemViewModel) afS170S0100000_1.l0).LLLJIL;
            if (c03wx != null && (c03x2 = c03wx.LIZLLL) != null) {
                c03x2.LIZ(new C857203Wo(aRunnableS70S0200000_1, null, null), true);
            }
        } else {
            aRunnableS70S0200000_1.run();
        }
        C1C7U.LIZIZ("OrderSubmitAssemViewModel@f79d.handleBillInfoChunkAsync$2$2");
    }

    public static final void accept$27(AfS170S0100000_1 afS170S0100000_1, Object obj) {
        C1C7U.LIZ("DeleteAction@98c.tryCheckTCMOrderDeleteStatus$result$1$2$1$1");
        C1233040iBy c1233040iBy = new C1233040iBy((Context) afS170S0100000_1.l0);
        c1233040iBy.LIZIZ(2131850551);
        c1233040iBy.LIZLLL();
        C1C7U.LIZIZ("DeleteAction@98c.tryCheckTCMOrderDeleteStatus$result$1$2$1$1");
    }

    public static final void accept$28(AfS170S0100000_1 afS170S0100000_1, Object obj) {
        C1C7U.LIZ("DeleteAction@98c.tryCheckTCMOrderDeleteStatus$result$1$2$1$2");
        C1233040iBy c1233040iBy = new C1233040iBy((Context) afS170S0100000_1.l0);
        c1233040iBy.LIZIZ(2131850550);
        c1233040iBy.LIZLLL();
        C1C7U.LIZIZ("DeleteAction@98c.tryCheckTCMOrderDeleteStatus$result$1$2$1$2");
    }

    public static final void accept$29(AfS170S0100000_1 afS170S0100000_1, Object obj) {
        if (obj instanceof C0X52) {
            obj = ((C0X52) obj).LIZIZ;
        }
        Object obj2 = null;
        if (!Response.class.isAssignableFrom(SearchDistrictsData.class) && (obj instanceof Response)) {
            Response response = (Response) obj;
            if (response.isCodeOK()) {
                Object obj3 = response.data;
                if (obj3 == null) {
                    obj3 = Boolean.TRUE;
                }
                if (obj3 instanceof SearchDistrictsData) {
                    obj2 = obj3;
                }
            }
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) afS170S0100000_1.l0;
            C189200o6.m2constructorimpl(obj2);
            interfaceC20236714Gf.resumeWith(obj2);
            return;
        }
        InterfaceC20236714Gf interfaceC20236714Gf2 = (InterfaceC20236714Gf) afS170S0100000_1.l0;
        if (!(obj instanceof SearchDistrictsData)) {
            obj = null;
        }
        C189200o6.m2constructorimpl(obj);
        interfaceC20236714Gf2.resumeWith(obj);
    }

    public static final void accept$3(AfS170S0100000_1 afS170S0100000_1, Object obj) {
        C1C7U.LIZ("OrderSubmitRepository@9af5.fetchBillInfo$2$2");
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) afS170S0100000_1.l0;
        C098200Yq c098200Yq = new C098200Yq((Throwable) obj);
        C189200o6.m2constructorimpl(c098200Yq);
        interfaceC1364105Vn.resumeWith(c098200Yq);
        C1C7U.LIZIZ("OrderSubmitRepository@9af5.fetchBillInfo$2$2");
    }

    public static final void accept$30(AfS170S0100000_1 afS170S0100000_1, Object obj) {
        IECommerceHostService iECommerceHostService;
        boolean z;
        String name;
        Throwable th = (Throwable) obj;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (((IApplicationDependencyService) iECommerceHostService).isLocalTest()) {
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) afS170S0100000_1.l0;
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            interfaceC20236714Gf.resumeWith(c098200Yq);
            return;
        }
        InterfaceC20236714Gf interfaceC20236714Gf2 = (InterfaceC20236714Gf) afS170S0100000_1.l0;
        C189200o6.m2constructorimpl(null);
        interfaceC20236714Gf2.resumeWith(null);
    }

    public static final void accept$31(AfS170S0100000_1 afS170S0100000_1, Object obj) {
        boolean zBooleanValue;
        Integer num;
        String str;
        String str2;
        C1C7U.LIZ("PdpReviewMgr@811a.fetchReviewData$1$1");
        ListReviewData listReviewData = (ListReviewData) obj;
        if (listReviewData != null) {
            C1073304Hr c1073304Hr = (C1073304Hr) afS170S0100000_1.l0;
            Float f = listReviewData.rating;
            Integer num2 = listReviewData.reviewCount;
            List<ReviewItemStruct> list = listReviewData.reviewItems;
            List<ReviewFilterStruct> list2 = listReviewData.reviewFilter;
            String str3 = listReviewData.reviewCountStr;
            String str4 = listReviewData.reviewCountStrV2;
            List<ReviewAspectPercentageCard> list3 = listReviewData.reviewAspectPercentageCard;
            ReviewCardUI reviewCardUI = listReviewData.reviewABTest;
            Boolean bool = listReviewData.hasMore;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            c1073304Hr.LIZLLL = new ProductDetailReview(f, num2, list, null, list2, str3, str4, list3, reviewCardUI, Boolean.valueOf(zBooleanValue), listReviewData.platformLinkInfo, null, null, null, null, null, null, null);
            C1073304Hr c1073304Hr2 = (C1073304Hr) afS170S0100000_1.l0;
            ShopReviewEntry shopReviewEntry = listReviewData.shopReviewEntry;
            if (shopReviewEntry != null) {
                num = shopReviewEntry.reviewCount;
                str = shopReviewEntry.reviewCountStr;
            } else {
                num = null;
                str = null;
            }
            List<ReviewFilterStruct> list4 = listReviewData.reviewFilter;
            if (shopReviewEntry != null) {
                str2 = shopReviewEntry.shopSchema;
            } else {
                str2 = null;
            }
            c1073304Hr2.LJ = new ShopReviewEntry(num, str, list4, str2, null);
            ((C1073304Hr) afS170S0100000_1.l0).LJII = "success";
        }
        ((C1073304Hr) afS170S0100000_1.l0).getClass();
        C1073304Hr c1073304Hr3 = (C1073304Hr) afS170S0100000_1.l0;
        c1073304Hr3.LIZ.setState(new AwS580S0100000_1(c1073304Hr3, 623));
        C1C7U.LIZIZ("PdpReviewMgr@811a.fetchReviewData$1$1");
    }

    public static final void accept$32(AfS170S0100000_1 afS170S0100000_1, Object obj) {
        C1C7U.LIZ("MallApi$Companion@1496.setReminder$1$1");
        ((C09AJ) afS170S0100000_1.l0).onNext(obj);
        ((C09AJ) afS170S0100000_1.l0).onComplete();
        C1C7U.LIZIZ("MallApi$Companion@1496.setReminder$1$1");
    }

    public static final void accept$4(AfS170S0100000_1 afS170S0100000_1, Object obj) {
        C1C7U.LIZ("IAddressListViewModel@9425.getAddressList$2");
        ((InterfaceC975703rf) afS170S0100000_1.l0).SB1(3);
        C1019103yf.LIZ(EnumC1014603xw.ERR80, (Throwable) obj, null);
        C1C7U.LIZIZ("IAddressListViewModel@9425.getAddressList$2");
    }

    public static final void accept$5(AfS170S0100000_1 afS170S0100000_1, Object obj) {
        n nVar;
        Map<String, GodaV2Data> map;
        GodaV2Data godaV2Data;
        C1C7U.LIZ("BundlePanelVM@2892.getProductInfo$1");
        ProductPackStruct productPackStruct = (ProductPackStruct) obj;
        BundlePanelVM bundlePanelVM = (BundlePanelVM) afS170S0100000_1.l0;
        String str = productPackStruct.productId;
        Gson gson = C7740030o.LIZ().getGson();
        GodaV2Protocol<?> godaV2Protocol = productPackStruct.godaV2Protocol;
        if (godaV2Protocol != null && (map = godaV2Protocol.data) != null && (godaV2Data = map.get("virtual_bundle")) != null) {
            nVar = godaV2Data.itemData;
        } else {
            nVar = null;
        }
        bundlePanelVM.LLILZIL = new BundlePanelFragment.RenderParams(str, productPackStruct, GsonProtectorUtils.fromJson(gson, nVar, new AbstractC1905540zge<Map<String, ? extends Object>>() { // from class: X.03zW
        }.getType()));
        BundlePanelVM bundlePanelVM2 = (BundlePanelVM) afS170S0100000_1.l0;
        bundlePanelVM2.xQ2(bundlePanelVM2.LLILZIL);
        BundlePanelVM bundlePanelVM3 = (BundlePanelVM) afS170S0100000_1.l0;
        C11JF c11jf = bundlePanelVM3.LLIZLLLIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        bundlePanelVM3.LLIZLLLIL = null;
        C1C7U.LIZIZ("BundlePanelVM@2892.getProductInfo$1");
    }

    public static final void accept$6(AfS170S0100000_1 afS170S0100000_1, Object obj) {
        C1C7U.LIZ("PaymentViewModel@e450.removeBindMethod$1$2");
        if (((Response) obj).isCodeOK()) {
            PaymentViewModel.LR2((PaymentViewModel) afS170S0100000_1.l0);
        } else {
            ((PaymentViewModel) afS170S0100000_1.l0).setState(AFwS228S0000000_1.get$arr$(263));
        }
        C1C7U.LIZIZ("PaymentViewModel@e450.removeBindMethod$1$2");
    }

    public static final void accept$7(AfS170S0100000_1 afS170S0100000_1, Object obj) {
        C1C7U.LIZ("PaymentViewModel@e450.removeBindMethod$1$3");
        ((PaymentViewModel) afS170S0100000_1.l0).setState(AFwS228S0000000_1.get$arr$(175));
        C1C7U.LIZIZ("PaymentViewModel@e450.removeBindMethod$1$3");
    }

    public static final void accept$8(AfS170S0100000_1 afS170S0100000_1, Object obj) {
        C1C7U.LIZ("PayHelper@ece4.genPaymentListObservable$1");
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(((C03PI) afS170S0100000_1.l0).LIZ);
        if (c19egLIZIZ != null && !c19egLIZIZ.isFinishing() && !c19egLIZIZ.isDestroyed()) {
            DialogC1389620mGW dialogC1389620mGW = (DialogC1389620mGW) ((C03PI) afS170S0100000_1.l0).LJIILLIIL.getValue();
            dialogC1389620mGW.setCanceledOnTouchOutside(false);
            C786410Ut5.J4(dialogC1389620mGW);
        }
        C1C7U.LIZIZ("PayHelper@ece4.genPaymentListObservable$1");
    }

    public static final void accept$9(AfS170S0100000_1 afS170S0100000_1, Object obj) {
        C1C7U.LIZ("MembershipCashierLauncher@64ba.open$5");
        C786410Ut5.J4((DialogC1389620mGW) ((C876203bc) afS170S0100000_1.l0).LIZIZ.getValue());
        C1C7U.LIZIZ("MembershipCashierLauncher@64ba.open$5");
    }
}
