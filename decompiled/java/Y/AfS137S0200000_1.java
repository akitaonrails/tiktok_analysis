package Y;

import X.AnonymousClass0378;
import X.C013C;
import X.C03S2;
import X.C04AG;
import X.C04HG;
import X.C04HR;
import X.C05XL;
import X.C09JN;
import X.C0PEM;
import X.C0X52;
import X.C11JF;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1724230uyD;
import X.C1741890vQh;
import X.C1756210vnn;
import X.C189200o6;
import X.C19EG;
import X.C1AF0;
import X.C1C7U;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2341109Fh;
import X.C259800zU;
import X.C786410Ut5;
import X.C842503Qx;
import X.C857203Wo;
import X.C857603Ws;
import X.C876103bb;
import X.C876203bc;
import X.C886203dE;
import X.C887503dR;
import X.C888603dc;
import X.C894803ec;
import X.C928203k0;
import X.C975203ra;
import X.C975803rg;
import X.DialogC1389620mGW;
import X.EnumC1756200vnm;
import X.EnumC837803Pc;
import X.EnumC872903b5;
import X.EnumC882203ca;
import X.InterfaceC1364105Vn;
import X.InterfaceC1631620sYq;
import X.InterfaceC975703rf;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressListData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.NoticeDialogMessage;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.MembershipOpenCashierParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentHalfFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Balance;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BalanceResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ListPaymentMethodResp;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentListResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentPrice;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUp;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.ui.SeaPdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS245S0300000_1;
import kotlin.jvm.internal.AwS37S0500000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public class AfS137S0200000_1 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;

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
        }
    }

    public static final void accept$0(AfS137S0200000_1 afS137S0200000_1, Object obj) {
        C1C7U.LIZ("HandleClickOnProfile@337f.clickCouponOnRequestReceive$2");
        C786410Ut5.LJIIJ((DialogC1389620mGW) afS137S0200000_1.l0);
        Activity activityLIZ = C1388190mED.LIZ((Context) afS137S0200000_1.l1);
        if (activityLIZ != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIIZ(2131824748);
            c1389890mGx.LIZ(true);
            c1389890mGx.LJIIJJI();
        }
        C1C7U.LIZIZ("HandleClickOnProfile@337f.clickCouponOnRequestReceive$2");
    }

    public static final void accept$1(AfS137S0200000_1 afS137S0200000_1, Object obj) {
        C1C7U.LIZ("OrderSubmitFetcher@a6d2.requestByChunkPbTask$2");
        ARunnableS101S0100000_1 aRunnableS101S0100000_1 = new ARunnableS101S0100000_1((BillInfoResponse) obj, 0);
        C03S2.LIZ.getClass();
        if (C03S2.LIZ() && !C928203k0.LJ(C928203k0.LIZ, null, (BillInfoRequest) afS137S0200000_1.l0, 1)) {
            ((C857603Ws) afS137S0200000_1.l1).LIZ.LIZ(new C857203Wo(aRunnableS101S0100000_1, null, null), false);
        } else {
            aRunnableS101S0100000_1.run();
        }
        C1C7U.LIZIZ("OrderSubmitFetcher@a6d2.requestByChunkPbTask$2");
    }

    public static final void accept$10(AfS137S0200000_1 afS137S0200000_1, Object obj) {
        Object obj2;
        C1C7U.LIZ("PdpRecommendMgr@a78b.addCartBundle$3");
        Response response = (Response) obj;
        if (response != null) {
            obj2 = response.data;
        } else {
            obj2 = null;
        }
        if (((InterfaceC1631620sYq) afS137S0200000_1.l0) == null) {
            ((C04HR) afS137S0200000_1.l1).LIZ.uS2(obj2);
        }
        C1C7U.LIZIZ("PdpRecommendMgr@a78b.addCartBundle$3");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$11(Y.AfS137S0200000_1 r7, java.lang.Object r8) {
        /*
            java.lang.String r6 = "CCIProcess@f414.getPaymentAuth$job$1"
            X.C1C7U.LIZ(r6)
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r8 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r8
            r5 = 0
            if (r8 == 0) goto L4f
            T r0 = r8.data
            com.ss.android.ugc.aweme.ecommerce.base.payment.dto.PaymentData r0 = (com.ss.android.ugc.aweme.ecommerce.base.payment.dto.PaymentData) r0
            if (r0 == 0) goto L4f
            com.google.gson.n r3 = r0.cashier
            if (r3 == 0) goto L4f
            com.google.gson.Gson r2 = X.C1741890vQh.LJFF()     // Catch: com.google.gson.s -> L4b
            X.04Zw r0 = X.C1120604Zw.LIZ     // Catch: com.google.gson.s -> L4b
            r0.getClass()     // Catch: com.google.gson.s -> L4b
            X.04a9 r0 = X.C1120604Zw.LIZIZ()     // Catch: com.google.gson.s -> L4b
            if (r0 == 0) goto L3b
            boolean r1 = r0.LJII     // Catch: com.google.gson.s -> L4b
            r0 = 1
            if (r1 != r0) goto L3b
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier> r0 = com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier.class
            X.13JW r0 = X.C13LE.LJII(r0)     // Catch: com.google.gson.s -> L4b
            java.lang.reflect.Type r0 = X.C2371409Qy.LIZJ(r0)     // Catch: com.google.gson.s -> L4b
        L32:
            java.lang.Object r4 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r2, r3, r0)     // Catch: com.google.gson.s -> L4b
            boolean r0 = r4 instanceof com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier     // Catch: com.google.gson.s -> L4b
            if (r0 != 0) goto L46
            goto L45
        L3b:
            X.03cU r0 = new X.03cU     // Catch: com.google.gson.s -> L4b
            r0.<init>()     // Catch: com.google.gson.s -> L4b
            java.lang.reflect.Type r0 = r0.getType()     // Catch: com.google.gson.s -> L4b
            goto L32
        L45:
            r4 = r5
        L46:
            com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier r4 = (com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier) r4     // Catch: com.google.gson.s -> L4b
            if (r4 == 0) goto L4f
            goto L59
        L4b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L4f:
            java.lang.Object r0 = r7.l0
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            if (r0 == 0) goto L6e
            r0.invoke()
            goto L6e
        L59:
            java.lang.String r3 = r4.nonce
            java.lang.String r2 = r4.merchantId
            java.lang.String r1 = r4.merchantUserId
            if (r3 == 0) goto L4f
            if (r2 == 0) goto L4f
            if (r1 == 0) goto L4f
            java.lang.Object r0 = r7.l1
            X.0sYr r0 = (X.InterfaceC1631630sYr) r0
            if (r0 == 0) goto L6e
            r0.invoke(r3, r2, r1, r4)
        L6e:
            X.C1C7U.LIZIZ(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS137S0200000_1.accept$11(Y.AfS137S0200000_1, java.lang.Object):void");
    }

    public static final void accept$12(AfS137S0200000_1 afS137S0200000_1, Object obj) {
        String str;
        Map<String, ? extends Object> map;
        Integer num;
        Integer num2;
        C1C7U.LIZ("SeaPdpFragment@244c.initData$6");
        ProductPackStruct productPackStruct = (ProductPackStruct) obj;
        C1756210vnn.LJ(((SeaPdpFragment) afS137S0200000_1.l0).FS().LLIZ, productPackStruct, EnumC1756200vnm.AFTER_PAGE_CREATE);
        Map<String, Object> mapLJ = ((IPdpStarter.PdpEnterParam) afS137S0200000_1.l1).trackParams;
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        HashMap map2 = new HashMap(mapLJ);
        if (((SeaPdpFragment) afS137S0200000_1.l0).FS().LLJLIL != null) {
            new AwS245S0300000_1((SeaPdpFragment) afS137S0200000_1.l0, (SeaPdpFragment) productPackStruct, (ProductPackStruct) map2, (HashMap<String, Object>) 37).invoke();
        }
        SeaPdpViewModel seaPdpViewModelFS = ((SeaPdpFragment) afS137S0200000_1.l0).FS();
        Integer num3 = ((IPdpStarter.PdpEnterParam) afS137S0200000_1.l1).bizType;
        if (num3 != null) {
            ProductPackStruct productPackStruct2 = seaPdpViewModelFS.LLJIJIL;
            if (productPackStruct2 != null && productPackStruct2.bizType != null) {
                if (productPackStruct2 != null) {
                    num = productPackStruct2.bizType;
                } else {
                    num = null;
                }
                if (!Intrinsics.LJFF(num3, num)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("pdp biz type difference, schema bizType: ");
                    sbLIZ.append(num3);
                    sbLIZ.append(", server bizType: ");
                    ProductPackStruct productPackStruct3 = seaPdpViewModelFS.LLJIJIL;
                    if (productPackStruct3 != null) {
                        num2 = productPackStruct3.bizType;
                    } else {
                        num2 = null;
                    }
                    sbLIZ.append(num2);
                    C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        } else {
            seaPdpViewModelFS.getClass();
        }
        ((SeaPdpFragment) afS137S0200000_1.l0).FS().LLLLZIL = true;
        SeaPdpViewModel.SS2(((SeaPdpFragment) afS137S0200000_1.l0).FS(), productPackStruct, null, false, false, true, false, false, false, false, false, 2016);
        ((SeaPdpFragment) afS137S0200000_1.l0).FS().uS2(productPackStruct);
        C11JF c11jf = ((SeaPdpFragment) afS137S0200000_1.l0).LLJJJIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        SeaPdpFragment seaPdpFragment = (SeaPdpFragment) afS137S0200000_1.l0;
        seaPdpFragment.LLJJJIL = null;
        PopUp popUp = productPackStruct.popUp;
        if (popUp != null && (map = ((IPdpStarter.PdpEnterParam) afS137S0200000_1.l1).trackParams) != null) {
            seaPdpFragment.YS(popUp, map);
        }
        String str2 = ((IPdpStarter.PdpEnterParam) afS137S0200000_1.l1).chainKey;
        if ((str2 == null || str2.length() == 0) && (str = productPackStruct.chainKey) != null && str.length() > 0) {
            Map<String, Object> map3 = ((IPdpStarter.PdpEnterParam) afS137S0200000_1.l1).visitReportParams;
            if (map3 != null) {
                map3.put("chain_key", productPackStruct.chainKey);
            }
            ((IPdpStarter.PdpEnterParam) afS137S0200000_1.l1).setChainKey(productPackStruct.chainKey);
        }
        ((SeaPdpFragment) afS137S0200000_1.l0).mS();
        C1756210vnn.LJFF(((SeaPdpFragment) afS137S0200000_1.l0).FS().LLIZ, productPackStruct);
        C1C7U.LIZIZ("SeaPdpFragment@244c.initData$6");
    }

    public static final void accept$13(AfS137S0200000_1 afS137S0200000_1, Object obj) {
        Object obj2;
        C1C7U.LIZ("SeaPdpRecommendMgr@82f2.addCartBundle$3");
        Response response = (Response) obj;
        if (response != null) {
            obj2 = response.data;
        } else {
            obj2 = null;
        }
        if (((InterfaceC1631620sYq) afS137S0200000_1.l0) == null) {
            ((C04AG) afS137S0200000_1.l1).LIZ.FS2(obj2);
        }
        C1C7U.LIZIZ("SeaPdpRecommendMgr@82f2.addCartBundle$3");
    }

    public static final void accept$2(AfS137S0200000_1 afS137S0200000_1, Object obj) {
        C1C7U.LIZ("OrderSubmitFetcher@a6d2.requestByChunkTask$2");
        ARunnableS101S0100000_1 aRunnableS101S0100000_1 = new ARunnableS101S0100000_1((BillInfoResponse) obj, 1);
        C03S2.LIZ.getClass();
        if (C03S2.LIZ() && !C928203k0.LJ(C928203k0.LIZ, null, (BillInfoRequest) afS137S0200000_1.l0, 1)) {
            ((C857603Ws) afS137S0200000_1.l1).LIZ.LIZ(new C857203Wo(aRunnableS101S0100000_1, null, null), false);
        } else {
            aRunnableS101S0100000_1.run();
        }
        C1C7U.LIZIZ("OrderSubmitFetcher@a6d2.requestByChunkTask$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$3(AfS137S0200000_1 afS137S0200000_1, Object obj) {
        NoticeDialogMessage noticeDialogMessage;
        C1C7U.LIZ("IAddressListViewModel@9425.getAddressList$1");
        Response response = (Response) ((C0X52) obj).LIZIZ;
        AddressListData addressListData = (AddressListData) response.data;
        if (response.isClaimOverdue() && addressListData != null && (noticeDialogMessage = addressListData.noticeDialogMessage) != null) {
            AnonymousClass0378.LIZ().LIZ("ec_show_notice_dialog", C1741890vQh.LJIIIIZZ(noticeDialogMessage));
        }
        ((InterfaceC975703rf) afS137S0200000_1.l0).UC2(false);
        if (response.isCodeOK() && addressListData != null) {
            C975803rg.LJFF((InterfaceC975703rf) afS137S0200000_1.l0, addressListData);
            Function0 function0 = (Function0) afS137S0200000_1.l1;
            if (function0 != null) {
                function0.invoke();
            }
            String strZM2 = ((InterfaceC975703rf) afS137S0200000_1.l0).ZM2();
            if (strZM2 == null || strZM2.length() == 0) {
                InterfaceC975703rf interfaceC975703rf = (InterfaceC975703rf) afS137S0200000_1.l0;
                interfaceC975703rf.W6(C0PEM.LIZJ, new C975203ra(addressListData, interfaceC975703rf, null));
            }
        } else {
            ((InterfaceC975703rf) afS137S0200000_1.l0).SB1(3);
        }
        C1C7U.LIZIZ("IAddressListViewModel@9425.getAddressList$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.util.ArrayList] */
    public static final void accept$4(AfS137S0200000_1 afS137S0200000_1, Object obj) {
        List<Balance> list;
        C1C7U.LIZ("PaymentViewModel@e450.handlePaymentMethodNoBalance$disposable$1");
        BalanceResponseData balanceResponseData = (BalanceResponseData) ((Response) obj).data;
        if (balanceResponseData != null) {
            list = balanceResponseData.balances;
        } else {
            list = null;
        }
        C013C c013c = new C013C();
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = new ArrayList();
        PaymentViewModel paymentViewModel = (PaymentViewModel) afS137S0200000_1.l0;
        paymentViewModel.withState(new AwS37S0500000_1((List) list, (List<Balance>) c013c, (C013C) c259800zU, (C259800zU<List<Object>>) paymentViewModel, (PaymentViewModel) afS137S0200000_1.l1, (EnterParams) 1));
        C1C7U.LIZIZ("PaymentViewModel@e450.handlePaymentMethodNoBalance$disposable$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$5(AfS137S0200000_1 afS137S0200000_1, Object obj) {
        PaymentMethodsData paymentMethodsData;
        boolean z;
        Integer numValueOf;
        Integer numValueOf2;
        Address address;
        String str;
        String str2;
        PaymentMethod paymentMethod;
        PaymentMethod paymentMethod2;
        Address address2;
        boolean z2;
        boolean z3;
        List<PaymentMethod> list;
        List<PaymentMethod> list2;
        C1C7U.LIZ("MembershipCashierLauncher@64ba.open$6");
        Response response = (Response) obj;
        ((C876203bc) afS137S0200000_1.l0).LIZ();
        ListPaymentMethodResp listPaymentMethodResp = (ListPaymentMethodResp) response.data;
        if (listPaymentMethodResp != null) {
            paymentMethodsData = listPaymentMethodResp.pmd;
        } else {
            paymentMethodsData = null;
        }
        C886203dE c886203dE = C886203dE.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("paymentList response isCodeOk=");
        sbLIZ.append(response.isCodeOK());
        sbLIZ.append(", hasPaymentData=");
        if (paymentMethodsData != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(", paymentMethodsSize=");
        if (paymentMethodsData != null && (list2 = paymentMethodsData.paymentMethods) != null) {
            numValueOf = Integer.valueOf(list2.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", storedMethodsSize=");
        if (paymentMethodsData != null && (list = paymentMethodsData.storedMethods) != null) {
            numValueOf2 = Integer.valueOf(list.size());
        } else {
            numValueOf2 = null;
        }
        sbLIZ.append(numValueOf2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c886203dE.getClass();
        C886203dE.LJI(strLIZIZ);
        if (response.isCodeOK() && paymentMethodsData != null) {
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(((C876203bc) afS137S0200000_1.l0).LIZ);
            if (c19egLIZIZ == null) {
                C886203dE.LJI("paymentList success but activity is null");
                C876203bc.LIZJ((C876203bc) afS137S0200000_1.l0);
            } else if (C886203dE.LJIIIZ((MembershipOpenCashierParams) afS137S0200000_1.l1)) {
                C886203dE.LJI("open branch add card directly");
                C876203bc c876203bc = (C876203bc) afS137S0200000_1.l0;
                MembershipOpenCashierParams membershipOpenCashierParams = (MembershipOpenCashierParams) afS137S0200000_1.l1;
                ListPaymentMethodResp listPaymentMethodResp2 = (ListPaymentMethodResp) response.data;
                if (listPaymentMethodResp2 != null) {
                    address2 = listPaymentMethodResp2.shippingAddress;
                } else {
                    address2 = null;
                }
                c876203bc.getClass();
                C1724230uyD.LIZ.LIZJ(paymentMethodsData);
                PaymentMethod paymentMethodLIZIZ = C886203dE.LIZIZ(paymentMethodsData, membershipOpenCashierParams);
                if (paymentMethodLIZIZ == null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("openAddCardFragment method not found paymentMethodCode=");
                    sbLIZ2.append(membershipOpenCashierParams.paymentMethodCode);
                    sbLIZ2.append(", hasPaymentMethodToken=");
                    String str3 = membershipOpenCashierParams.paymentMethodToken;
                    if (str3 != null && str3.length() != 0) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    sbLIZ2.append(!z3);
                    C886203dE.LJI(C2188811AlT.LIZIZ(sbLIZ2));
                    C876203bc.LIZJ(c876203bc);
                } else {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("openAddCardFragment paymentMethodId=");
                    sbLIZ3.append(paymentMethodLIZIZ.id);
                    sbLIZ3.append(", hasToken=");
                    String str4 = paymentMethodLIZIZ.token;
                    if (str4 != null && str4.length() != 0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    sbLIZ3.append(!z2);
                    C886203dE.LJI(C2188811AlT.LIZIZ(sbLIZ3));
                    FragmentManager supportFragmentManager = c19egLIZIZ.getSupportFragmentManager();
                    String str5 = membershipOpenCashierParams.entrance;
                    PaymentInfo paymentInfoLIZ = C886203dE.LIZ(paymentMethodsData, membershipOpenCashierParams);
                    HashMap map = new HashMap();
                    HashMap<String, Object> map2 = membershipOpenCashierParams.LIZ;
                    if (map2 != null) {
                        map.putAll(map2);
                    }
                    String str6 = membershipOpenCashierParams.source;
                    if (str6 != null) {
                        map.put("source", str6);
                    }
                    String str7 = membershipOpenCashierParams.currency;
                    n nVar = new n();
                    nVar.LJJIIJ("pi_is_save", "true");
                    nVar.LJJIIJ("pi_ocr", "false");
                    nVar.LJJIIJ("seller_id", membershipOpenCashierParams.merchantUserId);
                    nVar.LJJIIJ("amount", membershipOpenCashierParams.amount);
                    EnterParams enterParams = new EnterParams(null, null, null, paymentMethodsData, null, false, paymentInfoLIZ, map, null, null, address2, null, str7, "bind_not_pay", null, null, null, str5, null, null, false, nVar, null, Boolean.FALSE, null, null, Boolean.FALSE, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, false, null, false, false, false);
                    enterParams.LJJIJIIJI = EnumC837803Pc.MEMBERSHIP;
                    C894803ec.LIZ(supportFragmentManager, paymentMethodLIZIZ, enterParams, null, "ADD_NEW_CARD", EnumC872903b5.ADD_CCDC);
                    C886203dE.LJI("openAddCardFragment show");
                }
            } else {
                C886203dE.LJI("open branch payment fragment");
                C876203bc c876203bc2 = (C876203bc) afS137S0200000_1.l0;
                MembershipOpenCashierParams membershipOpenCashierParams2 = (MembershipOpenCashierParams) afS137S0200000_1.l1;
                ListPaymentMethodResp listPaymentMethodResp3 = (ListPaymentMethodResp) response.data;
                if (listPaymentMethodResp3 != null) {
                    address = listPaymentMethodResp3.shippingAddress;
                } else {
                    address = null;
                }
                c876203bc2.getClass();
                PaymentInfo paymentInfoLIZ2 = C886203dE.LIZ(paymentMethodsData, membershipOpenCashierParams2);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("openPaymentFragment selectedPaymentMethodId=");
                if (paymentInfoLIZ2 != null && (paymentMethod2 = paymentInfoLIZ2.paymentMethod) != null) {
                    str = paymentMethod2.id;
                } else {
                    str = null;
                }
                sbLIZ4.append(str);
                sbLIZ4.append(", token=");
                if (paymentInfoLIZ2 != null && (paymentMethod = paymentInfoLIZ2.paymentMethod) != null) {
                    str2 = paymentMethod.token;
                } else {
                    str2 = null;
                }
                sbLIZ4.append(str2);
                C886203dE.LJI(C2188811AlT.LIZIZ(sbLIZ4));
                PaymentHalfFragment paymentHalfFragment = new PaymentHalfFragment();
                int iOrdinal = EnumC882203ca.SAVE.ordinal();
                String str8 = membershipOpenCashierParams2.currency;
                String str9 = membershipOpenCashierParams2.entrance;
                HashMap map3 = new HashMap();
                HashMap<String, Object> map4 = membershipOpenCashierParams2.LIZ;
                if (map4 != null) {
                    map3.putAll(map4);
                }
                String str10 = membershipOpenCashierParams2.source;
                if (str10 != null) {
                    map3.put("source", str10);
                }
                n nVar2 = new n();
                nVar2.LJJIIJ("pi_is_save", "true");
                nVar2.LJJIIJ("pi_ocr", "false");
                nVar2.LJJIIJ("seller_id", membershipOpenCashierParams2.merchantUserId);
                nVar2.LJJIIJ("amount", membershipOpenCashierParams2.amount);
                EnterParams enterParams2 = new EnterParams(null, null, Integer.valueOf(iOrdinal), paymentMethodsData, null, false, paymentInfoLIZ2, map3, null, null, address, null, str8, "bind_not_pay", null, null, null, str9, null, null, false, nVar2, null, Boolean.FALSE, null, null, Boolean.FALSE, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, false, null, false, false, false);
                enterParams2.LJJIJIIJI = EnumC837803Pc.MEMBERSHIP;
                paymentHalfFragment.LLJIJIL = enterParams2;
                paymentHalfFragment.LLJILJILJ = new AwS545S0100000_1(paymentHalfFragment, 1183);
                paymentHalfFragment.show(c19egLIZIZ.getSupportFragmentManager(), "payment_fragment");
                C886203dE.LJI("openPaymentFragment show");
            }
        } else {
            C876203bc.LIZJ((C876203bc) afS137S0200000_1.l0);
        }
        C1C7U.LIZIZ("MembershipCashierLauncher@64ba.open$6");
    }

    public static final void accept$6(AfS137S0200000_1 afS137S0200000_1, Object obj) {
        C1C7U.LIZ("BindHelper@eb8d.scheduleBindCards$3");
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LIZJ(obj);
        C876103bb c876103bb = (C876103bb) afS137S0200000_1.l0;
        c876103bb.getClass();
        try {
            C786410Ut5.LJIIJ((DialogC1389620mGW) c876103bb.LIZIZ.getValue());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C876103bb c876103bb2 = (C876103bb) afS137S0200000_1.l0;
        C876103bb.LIZIZ(c876103bb2, c876103bb2.LIZ);
        C888603dc c888603dc = C888603dc.LIZ;
        C887503dR c887503dR = (C887503dR) afS137S0200000_1.l1;
        c888603dc.getClass();
        C888603dc.LJIIIIZZ("request_list_payment", c887503dR, "exception", null);
        C1C7U.LIZIZ("BindHelper@eb8d.scheduleBindCards$3");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$7(AfS137S0200000_1 afS137S0200000_1, Object obj) {
        PaymentMethodsData paymentMethodsData;
        List<PaymentPrice> list;
        C1C7U.LIZ("PayHelper$Companion@af2c.getPaymentListSuspend$3$1");
        Response response = (Response) obj;
        ((Function1) afS137S0200000_1.l0).invoke(response);
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) afS137S0200000_1.l1;
        PaymentListResponseData paymentListResponseData = (PaymentListResponseData) response.data;
        if (paymentListResponseData != null) {
            paymentMethodsData = paymentListResponseData.paymentMethodsData;
            list = paymentListResponseData.paymentPrice;
        } else {
            paymentMethodsData = null;
            list = null;
        }
        C842503Qx c842503Qx = new C842503Qx((Integer) null, paymentMethodsData, (PaymentInfo) null, list);
        C189200o6.m2constructorimpl(c842503Qx);
        interfaceC1364105Vn.resumeWith(c842503Qx);
        C1C7U.LIZIZ("PayHelper$Companion@af2c.getPaymentListSuspend$3$1");
    }

    public static final void accept$8(AfS137S0200000_1 afS137S0200000_1, Object obj) {
        C1C7U.LIZ("MiniOspViewModel@8f4.queryRequestByChunk$1$2");
        MiniOspViewModel miniOspViewModel = (MiniOspViewModel) afS137S0200000_1.l0;
        miniOspViewModel.getClass();
        miniOspViewModel.withState(new AwS580S0100000_1(miniOspViewModel, 429));
        ((MiniOspViewModel) afS137S0200000_1.l0).setState(AFwS228S0000000_1.get$arr$(457));
        ((C05XL) afS137S0200000_1.l1).LJIIZILJ(Unit.LIZ);
        C1AF0.LJ((Throwable) obj);
        C1C7U.LIZIZ("MiniOspViewModel@8f4.queryRequestByChunk$1$2");
    }

    public static final void accept$9(AfS137S0200000_1 afS137S0200000_1, Object obj) {
        C1C7U.LIZ("CartRepository@3cbd.addToCartBundle$source$2");
        C04HG c04hg = (C04HG) afS137S0200000_1.l0;
        View view = (View) afS137S0200000_1.l1;
        c04hg.getClass();
        if (view != null) {
            C786410Ut5.LJJZZIII((Handler) c04hg.LJFF.getValue(), new ARunnableS101S0100000_1(new AwS545S0100000_1(view, 1533), 38));
        }
        C1C7U.LIZIZ("CartRepository@3cbd.addToCartBundle$source$2");
    }

    public AfS137S0200000_1(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
