package X;

import Y.AfS0S0200100_1;
import Y.AfS0S0400100_1;
import Y.AfS0S0900000_1;
import Y.AfS137S0200000_1;
import Y.AfS170S0100000_1;
import Y.AfS1S0800000_1;
import Y.AkS467S0100000_1;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.api.proto.ComposePbAndJson;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.preview.preload.dto.PreloadBillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.api.OrderSubmitApi;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddOnWriteImpressionRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoSetting;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CheckLawfulRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChunkDebugInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CreateOrderRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CreateOrderSku;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OrderShopRequestParam;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PollOrderStatusRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShippingAddress;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcTransactionPbSwitch;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcTransactionRequestOpt;
import com.ss.android.ugc.aweme.ecommerce.core.module.ModuleManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.tiktok.ConvertHelper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03WX, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03WX extends C11SY {
    public static final HashMap<String, C03WX> LJIIL = new HashMap<>();
    public Boolean LIZJ;
    public C11JF LJFF;
    public C11JF LJI;
    public AnonymousClass0957<BillInfoResponse> LJII;
    public AnonymousClass0957<? extends C11NZ<BillInfoResponse>> LJIIIIZZ;
    public BillInfoRequest LJIIJ;
    public C11JF LJIIJJI;
    public final C03X2 LIZLLL = new C03X2();
    public final C01GW LJ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 4));
    public final C03O1 LJIIIZ = new C03O1();

    public final void LJJIJL() {
        C11JF c11jf = this.LJFF;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LJFF = null;
        C11JF c11jf2 = this.LJIIJJI;
        if (c11jf2 != null) {
            c11jf2.dispose();
        }
        this.LJIIJJI = null;
        C11JF c11jf3 = this.LJI;
        if (c11jf3 != null) {
            c11jf3.dispose();
        }
        this.LJI = null;
    }

    public final C857603Ws LJJJJI() {
        return (C857603Ws) this.LJ.getValue();
    }

    public static void LJJIJLIJ(BillInfoRequest billInfoRequest) {
        if (billInfoRequest.getOrderShop() == null || billInfoRequest.getOrderShop().isEmpty()) {
            EnumC1014603xw enumC1014603xw = EnumC1014603xw.ERR21;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("orderShop is null ");
            sbLIZ.append(billInfoRequest);
            RuntimeException runtimeException = new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
            C03O0.LIZ.getClass();
            C1019103yf.LIZ(enumC1014603xw, runtimeException, C03O0.LIZIZ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJJJJZ(BillInfoResponse billInfoResponse) {
        BillInfoData billInfoData;
        BillInfoSetting billInfoSetting;
        Integer num;
        if (billInfoResponse != null && (billInfoData = (BillInfoData) billInfoResponse.data) != null && (billInfoSetting = billInfoData.settings) != null && (num = billInfoSetting.clientTemplate) != null) {
            int iIntValue = num.intValue();
            AnonymousClass0408.LIZ.getClass();
            ((Keva) AnonymousClass0408.LJFF.getValue()).storeInt("order_submit", iIntValue);
        }
    }

    public final void LJJIZ(String str) {
        HashMap<String, C03WX> map = LJIIL;
        C03WX c03wx = map.get(str);
        if (c03wx != null) {
            c03wx.LJJIJL();
        }
        map.remove(str);
        C857603Ws c857603WsLJJJJI = LJJJJI();
        C11JF c11jf = c857603WsLJJJJI.LJ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        c857603WsLJJJJI.LJ = null;
    }

    public static Object LJJIJIL(AddOnWriteImpressionRequest addOnWriteImpressionRequest, InterfaceC1364105Vn interfaceC1364105Vn) {
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        OrderSubmitApi.LIZ.getClass();
        ((OrderSubmitApi) C859403Xk.LIZIZ.create(OrderSubmitApi.class)).LJFF(addOnWriteImpressionRequest).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new C1077404Jg(c23260099m, 0));
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    public static Object LJJIL(CheckLawfulRequest checkLawfulRequest, InterfaceC1364105Vn interfaceC1364105Vn) {
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        OrderSubmitApi.LIZ.getClass();
        ((OrderSubmitApi) C859403Xk.LIZIZ.create(OrderSubmitApi.class)).LIZ(checkLawfulRequest).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new C1077404Jg(c23260099m, 1));
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    public static boolean LJJJJIZL(BillInfoResponse billInfoResponse, Throwable th) {
        Integer numValueOf;
        Boolean bool = C856503Wh.LIZIZ().enableAutoRetry;
        if (bool == null || bool.booleanValue()) {
            List list = C856503Wh.LIZIZ().errorCodeList;
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            String string = null;
            if (billInfoResponse != null) {
                numValueOf = Integer.valueOf(billInfoResponse.code);
            } else {
                numValueOf = null;
            }
            if (list.contains(String.valueOf(numValueOf))) {
                return true;
            }
            if (th != null) {
                Integer numLIZ = C2371809Rc.LIZ(th);
                if (numLIZ != null) {
                    string = numLIZ.toString();
                }
                Iterable iterable = C856503Wh.LIZIZ().httpCodeList;
                if (iterable == null) {
                    iterable = C13BV.INSTANCE;
                }
                if (C13LP.LJJJJ(string, iterable)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final Object LJJJI(BillInfoRequest billInfoRequest, C856103Wd c856103Wd) {
        C11JF c11jf = this.LJFF;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(c856103Wd));
        billInfoRequest.appendEntranceInfo(null);
        this.LJFF = (C11JF) LJJJJI().request(billInfoRequest).LJL(C11S5.LIZ()).LJJLL(new AfS170S0100000_1(c23260099m, 2), new AfS170S0100000_1(c23260099m, 3));
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(c856103Wd);
        }
        return objLIZ;
    }

    public final Object LJJJIL(final BillInfoRequest billInfoRequest, C856203We c856203We) {
        C19476611Hw c19476611HwLJL;
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(c856203We));
        billInfoRequest.appendEntranceInfo(null);
        if (EcTransactionPbSwitch.LIZ().ospEnableChunkPb) {
            final C857603Ws c857603WsLJJJJI = LJJJJI();
            C11JF c11jf = c857603WsLJJJJI.LJ;
            if (c11jf != null) {
                c11jf.dispose();
            }
            final int i = 1;
            c19476611HwLJL = C11NZ.LJIJJLI(new InterfaceC1478005qU(c857603WsLJJJJI, billInfoRequest, i) { // from class: X.04Jf
                public final int $t;
                public Object l0;
                public Object l1;

                @Override // X.InterfaceC1478005qU
                public final void subscribe(C09AJ<BillInfoResponse> c09aj) {
                    switch (this.$t) {
                        case 0:
                            subscribe$0(this, c09aj);
                            break;
                        case 1:
                            subscribe$1(this, c09aj);
                            break;
                    }
                }

                public static final void subscribe$0(C1077304Jf c1077304Jf, C09AJ c09aj) {
                    C11NZ<C1515820pY4<BillInfoResponse>> billInfoByChunkObservable;
                    C1C7U.LIZ("OrderSubmitFetcher@a6d2.requestByChunkObservable$observer$1");
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C238400w2 c238400w2 = new C238400w2();
                    c238400w2.element = System.currentTimeMillis();
                    C857603Ws c857603Ws = (C857603Ws) c1077304Jf.l0;
                    C928203k0 c928203k0 = C928203k0.LIZ;
                    Integer flowType = ((BillInfoRequest) c1077304Jf.l1).getFlowType();
                    c928203k0.getClass();
                    if (C928203k0.LJIILLIIL(flowType) && ((BillInfoRequest) c1077304Jf.l1).getBuyType() == 0) {
                        C859403Xk c859403Xk = OrderSubmitApi.LIZ;
                        BillInfoRequest billInfoRequest2 = (BillInfoRequest) c1077304Jf.l1;
                        c859403Xk.getClass();
                        billInfoByChunkObservable = ((OrderSubmitApi) C859403Xk.LIZIZ.create(OrderSubmitApi.class)).getBillInfoForHalfPageByChunkObservable(billInfoRequest2, C859403Xk.LIZLLL(billInfoRequest2.getBizType()));
                    } else {
                        C859403Xk c859403Xk2 = OrderSubmitApi.LIZ;
                        BillInfoRequest billInfoRequest3 = (BillInfoRequest) c1077304Jf.l1;
                        c859403Xk2.getClass();
                        billInfoByChunkObservable = ((OrderSubmitApi) C859403Xk.LIZIZ.create(OrderSubmitApi.class)).getBillInfoByChunkObservable(billInfoRequest3, C859403Xk.LIZLLL(billInfoRequest3.getBizType()));
                    }
                    C19476611Hw c19476611HwLJL2 = billInfoByChunkObservable.LJL(C11S5.LIZ());
                    C857603Ws c857603Ws2 = (C857603Ws) c1077304Jf.l0;
                    BillInfoRequest billInfoRequest4 = (BillInfoRequest) c1077304Jf.l1;
                    C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
                    c857603Ws.LJ = (C11JF) c19476611HwLJL2.LJJLL(new AfS0S0400100_1(jCurrentTimeMillis, c857603Ws2, billInfoRequest4, c19482611Ke, c238400w2, 0), new AfS0S0200100_1(c19482611Ke, jCurrentTimeMillis, billInfoRequest4, 1));
                    C1C7U.LIZIZ("OrderSubmitFetcher@a6d2.requestByChunkObservable$observer$1");
                }

                public static final void subscribe$1(C1077304Jf c1077304Jf, C09AJ c09aj) {
                    C11NZ<C1515820pY4<ComposePbAndJson<C994803uk, BillInfoResponse>>> billInfoByChunkPbObservable;
                    C1C7U.LIZ("OrderSubmitFetcher@a6d2.requestByChunkPbObservable$observer$1");
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C238400w2 c238400w2 = new C238400w2();
                    c238400w2.element = System.currentTimeMillis();
                    C857603Ws c857603Ws = (C857603Ws) c1077304Jf.l0;
                    C928203k0 c928203k0 = C928203k0.LIZ;
                    Integer flowType = ((BillInfoRequest) c1077304Jf.l1).getFlowType();
                    c928203k0.getClass();
                    if (C928203k0.LJIILLIIL(flowType) && ((BillInfoRequest) c1077304Jf.l1).getBuyType() == 0) {
                        C859403Xk c859403Xk = OrderSubmitApi.LIZ;
                        BillInfoRequest billInfoRequest2 = (BillInfoRequest) c1077304Jf.l1;
                        c859403Xk.getClass();
                        billInfoByChunkPbObservable = ((OrderSubmitApi) C859403Xk.LIZIZ.create(OrderSubmitApi.class)).getBillInfoForHalfPageByChunkPbObservable(billInfoRequest2, C859403Xk.LIZLLL(billInfoRequest2.getBizType()));
                    } else {
                        C859403Xk c859403Xk2 = OrderSubmitApi.LIZ;
                        BillInfoRequest billInfoRequest3 = (BillInfoRequest) c1077304Jf.l1;
                        c859403Xk2.getClass();
                        billInfoByChunkPbObservable = ((OrderSubmitApi) C859403Xk.LIZIZ.create(OrderSubmitApi.class)).getBillInfoByChunkPbObservable(billInfoRequest3, C859403Xk.LIZLLL(billInfoRequest3.getBizType()));
                    }
                    C19476611Hw c19476611HwLJL2 = billInfoByChunkPbObservable.LJL(C11S5.LIZ());
                    C857603Ws c857603Ws2 = (C857603Ws) c1077304Jf.l0;
                    BillInfoRequest billInfoRequest4 = (BillInfoRequest) c1077304Jf.l1;
                    C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
                    c857603Ws.LJ = (C11JF) c19476611HwLJL2.LJJLL(new AfS0S0400100_1(jCurrentTimeMillis, c857603Ws2, billInfoRequest4, c19482611Ke, c238400w2, 1), new AfS0S0200100_1(c19482611Ke, jCurrentTimeMillis, billInfoRequest4, 2));
                    C1C7U.LIZIZ("OrderSubmitFetcher@a6d2.requestByChunkPbObservable$observer$1");
                }

                {
                    this.$t = i;
                    this.l0 = c857603WsLJJJJI;
                    this.l1 = billInfoRequest;
                }
            }).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIJIIJIL(new C09JN() { // from class: X.03Wg
                @Override // X.C09JN
                public final void accept(Object obj) {
                    PaymentMethodsData paymentMethodsData;
                    C1C7U.LIZ("OrderSubmitFetcher@a6d2.requestByChunkPbObservable$observer$2");
                    BillInfoData billInfoData = (BillInfoData) ((Response) obj).data;
                    if (billInfoData != null && (paymentMethodsData = billInfoData.paymentMethods) != null) {
                        C1724230uyD.LIZ.LIZJ(paymentMethodsData);
                        C914303hl c914303hl = C914303hl.LIZ;
                        String str = paymentMethodsData.saleRegion;
                        c914303hl.getClass();
                        C914303hl.LJFF(str, "order_submit");
                    }
                    C1C7U.LIZIZ("OrderSubmitFetcher@a6d2.requestByChunkPbObservable$observer$2");
                }
            }).LJL(C11S5.LIZ());
        } else {
            final C857603Ws c857603WsLJJJJI2 = LJJJJI();
            C11JF c11jf2 = c857603WsLJJJJI2.LJ;
            if (c11jf2 != null) {
                c11jf2.dispose();
            }
            final int i2 = 0;
            c19476611HwLJL = C11NZ.LJIJJLI(new InterfaceC1478005qU(c857603WsLJJJJI2, billInfoRequest, i2) { // from class: X.04Jf
                public final int $t;
                public Object l0;
                public Object l1;

                @Override // X.InterfaceC1478005qU
                public final void subscribe(C09AJ<BillInfoResponse> c09aj) {
                    switch (this.$t) {
                        case 0:
                            subscribe$0(this, c09aj);
                            break;
                        case 1:
                            subscribe$1(this, c09aj);
                            break;
                    }
                }

                public static final void subscribe$0(C1077304Jf c1077304Jf, C09AJ c09aj) {
                    C11NZ<C1515820pY4<BillInfoResponse>> billInfoByChunkObservable;
                    C1C7U.LIZ("OrderSubmitFetcher@a6d2.requestByChunkObservable$observer$1");
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C238400w2 c238400w2 = new C238400w2();
                    c238400w2.element = System.currentTimeMillis();
                    C857603Ws c857603Ws = (C857603Ws) c1077304Jf.l0;
                    C928203k0 c928203k0 = C928203k0.LIZ;
                    Integer flowType = ((BillInfoRequest) c1077304Jf.l1).getFlowType();
                    c928203k0.getClass();
                    if (C928203k0.LJIILLIIL(flowType) && ((BillInfoRequest) c1077304Jf.l1).getBuyType() == 0) {
                        C859403Xk c859403Xk = OrderSubmitApi.LIZ;
                        BillInfoRequest billInfoRequest2 = (BillInfoRequest) c1077304Jf.l1;
                        c859403Xk.getClass();
                        billInfoByChunkObservable = ((OrderSubmitApi) C859403Xk.LIZIZ.create(OrderSubmitApi.class)).getBillInfoForHalfPageByChunkObservable(billInfoRequest2, C859403Xk.LIZLLL(billInfoRequest2.getBizType()));
                    } else {
                        C859403Xk c859403Xk2 = OrderSubmitApi.LIZ;
                        BillInfoRequest billInfoRequest3 = (BillInfoRequest) c1077304Jf.l1;
                        c859403Xk2.getClass();
                        billInfoByChunkObservable = ((OrderSubmitApi) C859403Xk.LIZIZ.create(OrderSubmitApi.class)).getBillInfoByChunkObservable(billInfoRequest3, C859403Xk.LIZLLL(billInfoRequest3.getBizType()));
                    }
                    C19476611Hw c19476611HwLJL2 = billInfoByChunkObservable.LJL(C11S5.LIZ());
                    C857603Ws c857603Ws2 = (C857603Ws) c1077304Jf.l0;
                    BillInfoRequest billInfoRequest4 = (BillInfoRequest) c1077304Jf.l1;
                    C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
                    c857603Ws.LJ = (C11JF) c19476611HwLJL2.LJJLL(new AfS0S0400100_1(jCurrentTimeMillis, c857603Ws2, billInfoRequest4, c19482611Ke, c238400w2, 0), new AfS0S0200100_1(c19482611Ke, jCurrentTimeMillis, billInfoRequest4, 1));
                    C1C7U.LIZIZ("OrderSubmitFetcher@a6d2.requestByChunkObservable$observer$1");
                }

                public static final void subscribe$1(C1077304Jf c1077304Jf, C09AJ c09aj) {
                    C11NZ<C1515820pY4<ComposePbAndJson<C994803uk, BillInfoResponse>>> billInfoByChunkPbObservable;
                    C1C7U.LIZ("OrderSubmitFetcher@a6d2.requestByChunkPbObservable$observer$1");
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C238400w2 c238400w2 = new C238400w2();
                    c238400w2.element = System.currentTimeMillis();
                    C857603Ws c857603Ws = (C857603Ws) c1077304Jf.l0;
                    C928203k0 c928203k0 = C928203k0.LIZ;
                    Integer flowType = ((BillInfoRequest) c1077304Jf.l1).getFlowType();
                    c928203k0.getClass();
                    if (C928203k0.LJIILLIIL(flowType) && ((BillInfoRequest) c1077304Jf.l1).getBuyType() == 0) {
                        C859403Xk c859403Xk = OrderSubmitApi.LIZ;
                        BillInfoRequest billInfoRequest2 = (BillInfoRequest) c1077304Jf.l1;
                        c859403Xk.getClass();
                        billInfoByChunkPbObservable = ((OrderSubmitApi) C859403Xk.LIZIZ.create(OrderSubmitApi.class)).getBillInfoForHalfPageByChunkPbObservable(billInfoRequest2, C859403Xk.LIZLLL(billInfoRequest2.getBizType()));
                    } else {
                        C859403Xk c859403Xk2 = OrderSubmitApi.LIZ;
                        BillInfoRequest billInfoRequest3 = (BillInfoRequest) c1077304Jf.l1;
                        c859403Xk2.getClass();
                        billInfoByChunkPbObservable = ((OrderSubmitApi) C859403Xk.LIZIZ.create(OrderSubmitApi.class)).getBillInfoByChunkPbObservable(billInfoRequest3, C859403Xk.LIZLLL(billInfoRequest3.getBizType()));
                    }
                    C19476611Hw c19476611HwLJL2 = billInfoByChunkPbObservable.LJL(C11S5.LIZ());
                    C857603Ws c857603Ws2 = (C857603Ws) c1077304Jf.l0;
                    BillInfoRequest billInfoRequest4 = (BillInfoRequest) c1077304Jf.l1;
                    C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
                    c857603Ws.LJ = (C11JF) c19476611HwLJL2.LJJLL(new AfS0S0400100_1(jCurrentTimeMillis, c857603Ws2, billInfoRequest4, c19482611Ke, c238400w2, 1), new AfS0S0200100_1(c19482611Ke, jCurrentTimeMillis, billInfoRequest4, 2));
                    C1C7U.LIZIZ("OrderSubmitFetcher@a6d2.requestByChunkPbObservable$observer$1");
                }

                {
                    this.$t = i2;
                    this.l0 = c857603WsLJJJJI2;
                    this.l1 = billInfoRequest;
                }
            }).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIJIIJIL(new C09JN() { // from class: X.03Wf
                @Override // X.C09JN
                public final void accept(Object obj) {
                    PaymentMethodsData paymentMethodsData;
                    C1C7U.LIZ("OrderSubmitFetcher@a6d2.requestByChunkObservable$observer$2");
                    BillInfoData billInfoData = (BillInfoData) ((Response) obj).data;
                    if (billInfoData != null && (paymentMethodsData = billInfoData.paymentMethods) != null) {
                        C1724230uyD.LIZ.LIZJ(paymentMethodsData);
                        C914303hl c914303hl = C914303hl.LIZ;
                        String str = paymentMethodsData.saleRegion;
                        c914303hl.getClass();
                        C914303hl.LJFF(str, "order_submit");
                    }
                    C1C7U.LIZIZ("OrderSubmitFetcher@a6d2.requestByChunkObservable$observer$2");
                }
            }).LJL(C11S5.LIZ());
        }
        C189200o6.m2constructorimpl(c19476611HwLJL);
        c23260099m.resumeWith(c19476611HwLJL);
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(c856203We);
        }
        return objLIZ;
    }

    public final Object LJJJJ(final BillInfoRequest billInfoRequest, C856203We c856203We) {
        final C15O7<C1515820pY4<BillInfoResponse>> billInfoByChunk;
        C11RO c11roLIZIZ;
        C19476611Hw c19476611HwLJL;
        final C15O7<C1515820pY4<ComposePbAndJson<C994803uk, BillInfoResponse>>> billInfoByChunkPb;
        C11RO c11roLIZIZ2;
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(c856203We));
        billInfoRequest.appendEntranceInfo(null);
        if (EcTransactionPbSwitch.LIZ().ospEnableChunkPb) {
            final C857603Ws c857603WsLJJJJI = LJJJJI();
            c857603WsLJJJJI.getClass();
            final long jCurrentTimeMillis = System.currentTimeMillis();
            ModuleManager.LJJJJLL = jCurrentTimeMillis;
            final C238400w2 c238400w2 = new C238400w2();
            c238400w2.element = System.currentTimeMillis();
            C928203k0 c928203k0 = C928203k0.LIZ;
            Integer flowType = billInfoRequest.getFlowType();
            c928203k0.getClass();
            if (C928203k0.LJIILLIIL(flowType) && billInfoRequest.getBuyType() == 0) {
                OrderSubmitApi.LIZ.getClass();
                billInfoByChunkPb = ((OrderSubmitApi) C859403Xk.LIZIZ.create(OrderSubmitApi.class)).getBillInfoForHalfPageByChunkPb(billInfoRequest, C859403Xk.LIZLLL(billInfoRequest.getBizType()));
            } else {
                OrderSubmitApi.LIZ.getClass();
                billInfoByChunkPb = ((OrderSubmitApi) C859403Xk.LIZIZ.create(OrderSubmitApi.class)).getBillInfoByChunkPb(billInfoRequest, C859403Xk.LIZLLL(billInfoRequest.getBizType()));
            }
            C19482711Kf c19482711KfLJIJJLI = C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.03X5
                @Override // X.InterfaceC1478005qU
                public final void subscribe(C09AJ<BillInfoResponse> c09aj) {
                    C1C7U.LIZ("OrderSubmitFetcher@a6d2.requestByChunkPbTask$1");
                    C15O7<C1515820pY4<ComposePbAndJson<C994803uk, BillInfoResponse>>> c15o7 = billInfoByChunkPb;
                    final C857603Ws c857603Ws = c857603WsLJJJJI;
                    final C238400w2 c238400w22 = c238400w2;
                    final long j = jCurrentTimeMillis;
                    final BillInfoRequest billInfoRequest2 = billInfoRequest;
                    final C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
                    c15o7.LJI(new InterfaceC2385309Wh() { // from class: X.03X7
                        @Override // X.InterfaceC2385309Wh
                        public final Object then(C15O7 c15o72) {
                            C1C7U.LIZ("OrderSubmitFetcher@a6d2.requestByChunkPbTask$1$1");
                            if (c15o72.LJIILL()) {
                                c19482611Ke.onError(c15o72.LJIIJJI());
                                c15o72 = C15O7.LJIIIZ(c15o72.LJIIJJI());
                            } else {
                                try {
                                    C1515820pY4 c1515820pY4 = (C1515820pY4) c15o72.LJIIL();
                                    final C857603Ws c857603Ws2 = c857603Ws;
                                    final C09AJ<BillInfoResponse> c09aj2 = c19482611Ke;
                                    final C238400w2 c238400w23 = c238400w22;
                                    final long j2 = j;
                                    final BillInfoRequest billInfoRequest3 = billInfoRequest2;
                                    c1515820pY4.LIZLLL(new C0POE<ComposePbAndJson<C994803uk, BillInfoResponse>>() { // from class: X.03Wv
                                        @Override // X.C0POE
                                        public final void onComplete() {
                                            C2341109Fh.LIZ.getClass();
                                            C2341109Fh.LJ("onComplete");
                                            c09aj2.onComplete();
                                            C857603Ws c857603Ws3 = c857603Ws2;
                                            C857603Ws.LJ(c857603Ws3.LIZLLL, c857603Ws3.LIZJ, System.currentTimeMillis() - j2);
                                        }

                                        @Override // X.C0POE
                                        public final void onFailed(Throwable th) {
                                            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append("onFailed, ");
                                            sbLIZ.append(th.getMessage());
                                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                            c2341109Fh.getClass();
                                            C2341109Fh.LJ(strLIZIZ);
                                            c09aj2.onError(th);
                                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                                            C03O0 c03o0 = C03O0.LIZ;
                                            String message = th.getMessage();
                                            Long lValueOf = Long.valueOf(jCurrentTimeMillis2 - j2);
                                            Boolean firstLoad = billInfoRequest3.getFirstLoad();
                                            c03o0.getClass();
                                            C03O0.LJJIJLIJ(message, lValueOf, firstLoad);
                                        }

                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // X.C0POE
                                        public final void onNext(ComposePbAndJson<C994803uk, BillInfoResponse> composePbAndJson) {
                                            String str;
                                            Boolean bool;
                                            Boolean bool2;
                                            ComposePbAndJson<C994803uk, BillInfoResponse> composePbAndJson2 = composePbAndJson;
                                            if (composePbAndJson2 == null) {
                                                C2341109Fh.LIZ.getClass();
                                                C2341109Fh.LIZJ("empty chunk");
                                                return;
                                            }
                                            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append("onNext: ");
                                            sbLIZ.append(composePbAndJson2);
                                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                            c2341109Fh.getClass();
                                            C2341109Fh.LJ(strLIZIZ);
                                            BillInfoResponse billInfoResponseLIZJ = composePbAndJson2.LIZJ(new InterfaceC1487280oo2() { // from class: X.03ug
                                                @Override // X.InterfaceC1487280oo2
                                                public final Object apply(Object obj) {
                                                    C994803uk c994803uk = (C994803uk) obj;
                                                    try {
                                                        return new BillInfoResponse(c994803uk.code.intValue(), c994803uk.message, ConvertHelper.shop$serv$proto$GetBillInfoResponseData$$com$ss$android$ugc$aweme$ecommerce$base$osp$repository$dto$BillInfoData(c994803uk.data, null), c994803uk.chunk_index);
                                                    } catch (Throwable th) {
                                                        TryCatchGuardChecker.doCheck(th);
                                                        C1019103yf.LIZ(EnumC1014603xw.ERR_OSP_BEAN_COPY, th, null);
                                                        return new BillInfoResponse(c994803uk.code.intValue(), c994803uk.message, null, c994803uk.chunk_index);
                                                    }
                                                }
                                            });
                                            C857603Ws c857603Ws3 = c857603Ws2;
                                            BillInfoData billInfoData = (BillInfoData) billInfoResponseLIZJ.data;
                                            if (billInfoData == null || (str = billInfoData.requestId) == null) {
                                                str = c857603Ws3.LIZLLL;
                                            }
                                            c857603Ws3.LIZLLL = str;
                                            BillInfoResponse billInfoResponse = c857603Ws3.LIZJ;
                                            if (billInfoResponse == null) {
                                                billInfoResponse = billInfoResponseLIZJ;
                                            }
                                            c857603Ws3.LIZJ = billInfoResponse.mergeChunk(billInfoResponseLIZJ);
                                            BillInfoData billInfoData2 = (BillInfoData) billInfoResponseLIZJ.data;
                                            if (billInfoData2 != null) {
                                                billInfoData2.LIZ = Boolean.TRUE;
                                            }
                                            c09aj2.onNext(billInfoResponseLIZJ);
                                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                                            BillInfoData billInfoData3 = (BillInfoData) billInfoResponseLIZJ.data;
                                            if (billInfoData3 != null && Intrinsics.LJFF(billInfoData3.beginRenderChunk, Boolean.TRUE)) {
                                                ModuleManager.LJJJJLI = jCurrentTimeMillis2;
                                            } else {
                                                BillInfoData billInfoData4 = (BillInfoData) billInfoResponseLIZJ.data;
                                                if (billInfoData4 != null && Intrinsics.LJFF(billInfoData4.lastChunk, Boolean.TRUE)) {
                                                    ModuleManager.LJJJJL = jCurrentTimeMillis2;
                                                }
                                            }
                                            C238400w2 c238400w24 = c238400w23;
                                            long j3 = jCurrentTimeMillis2 - c238400w24.element;
                                            long j4 = jCurrentTimeMillis2 - j2;
                                            c238400w24.element = jCurrentTimeMillis2;
                                            C03O0 c03o0 = C03O0.LIZ;
                                            Boolean bool3 = Boolean.TRUE;
                                            Long lValueOf = Long.valueOf(j3);
                                            Long lValueOf2 = Long.valueOf(j4);
                                            Integer num = billInfoResponseLIZJ.chunkIndex;
                                            BillInfoData billInfoData5 = (BillInfoData) billInfoResponseLIZJ.data;
                                            Long l = null;
                                            if (billInfoData5 != null) {
                                                bool = billInfoData5.beginRenderChunk;
                                                bool2 = billInfoData5.lastChunk;
                                                ChunkDebugInfo chunkDebugInfo = billInfoData5.chunkDebugInfo;
                                                if (chunkDebugInfo != null) {
                                                    l = chunkDebugInfo.costTime;
                                                }
                                            } else {
                                                bool = null;
                                                bool2 = null;
                                            }
                                            Boolean firstLoad = billInfoRequest3.getFirstLoad();
                                            c03o0.getClass();
                                            C03O0.LJJIJL(bool3, lValueOf, lValueOf2, num, bool, bool2, l, firstLoad);
                                        }
                                    });
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    c19482611Ke.onError(e);
                                    C1AF0.LIZJ("ChunkDataObserver throw Exception");
                                }
                            }
                            C1C7U.LIZIZ("OrderSubmitFetcher@a6d2.requestByChunkPbTask$1$1");
                            return c15o72;
                        }
                    });
                    C1C7U.LIZIZ("OrderSubmitFetcher@a6d2.requestByChunkPbTask$1");
                }
            });
            C03S2.LIZ.getClass();
            if (C03S2.LIZ() && !C928203k0.LJ(c928203k0, null, billInfoRequest, 1)) {
                c11roLIZIZ2 = C11S5.LIZ();
            } else {
                c11roLIZIZ2 = C1701940uOG.LIZIZ();
            }
            c19476611HwLJL = c19482711KfLJIJJLI.LJJJLZIJ(c11roLIZIZ2).LJJIJIIJIL(new AfS137S0200000_1(c857603WsLJJJJI, billInfoRequest, 1)).LJL(C11S5.LIZ());
        } else {
            final C857603Ws c857603WsLJJJJI2 = LJJJJI();
            c857603WsLJJJJI2.getClass();
            final long jCurrentTimeMillis2 = System.currentTimeMillis();
            ModuleManager.LJJJJLL = jCurrentTimeMillis2;
            final C238400w2 c238400w22 = new C238400w2();
            c238400w22.element = System.currentTimeMillis();
            C928203k0 c928203k02 = C928203k0.LIZ;
            Integer flowType2 = billInfoRequest.getFlowType();
            c928203k02.getClass();
            if (C928203k0.LJIILLIIL(flowType2) && billInfoRequest.getBuyType() == 0) {
                OrderSubmitApi.LIZ.getClass();
                billInfoByChunk = ((OrderSubmitApi) C859403Xk.LIZIZ.create(OrderSubmitApi.class)).getBillInfoForHalfPageByChunk(billInfoRequest, C859403Xk.LIZLLL(billInfoRequest.getBizType()));
            } else {
                OrderSubmitApi.LIZ.getClass();
                billInfoByChunk = ((OrderSubmitApi) C859403Xk.LIZIZ.create(OrderSubmitApi.class)).getBillInfoByChunk(billInfoRequest, C859403Xk.LIZLLL(billInfoRequest.getBizType()));
            }
            C19482711Kf c19482711KfLJIJJLI2 = C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.03X6
                @Override // X.InterfaceC1478005qU
                public final void subscribe(C09AJ<BillInfoResponse> c09aj) {
                    C1C7U.LIZ("OrderSubmitFetcher@a6d2.requestByChunkTask$1");
                    C15O7<C1515820pY4<BillInfoResponse>> c15o7 = billInfoByChunk;
                    final C857603Ws c857603Ws = c857603WsLJJJJI2;
                    final C238400w2 c238400w23 = c238400w22;
                    final long j = jCurrentTimeMillis2;
                    final BillInfoRequest billInfoRequest2 = billInfoRequest;
                    final C19482611Ke c19482611Ke = (C19482611Ke) c09aj;
                    c15o7.LJI(new InterfaceC2385309Wh() { // from class: X.03X8
                        @Override // X.InterfaceC2385309Wh
                        public final Object then(C15O7 c15o72) {
                            C1C7U.LIZ("OrderSubmitFetcher@a6d2.requestByChunkTask$1$1");
                            if (c15o72.LJIILL()) {
                                c19482611Ke.onError(c15o72.LJIIJJI());
                                c15o72 = C15O7.LJIIIZ(c15o72.LJIIJJI());
                            } else {
                                try {
                                    C1515820pY4 c1515820pY4 = (C1515820pY4) c15o72.LJIIL();
                                    final C857603Ws c857603Ws2 = c857603Ws;
                                    final C09AJ<BillInfoResponse> c09aj2 = c19482611Ke;
                                    final C238400w2 c238400w24 = c238400w23;
                                    final long j2 = j;
                                    final BillInfoRequest billInfoRequest3 = billInfoRequest2;
                                    c1515820pY4.LIZLLL(new C0POE<BillInfoResponse>() { // from class: X.03Wx
                                        @Override // X.C0POE
                                        public final void onComplete() {
                                            C2341109Fh.LIZ.getClass();
                                            C2341109Fh.LJ("onComplete");
                                            c09aj2.onComplete();
                                            C857603Ws c857603Ws3 = c857603Ws2;
                                            C857603Ws.LJ(c857603Ws3.LIZLLL, c857603Ws3.LIZJ, System.currentTimeMillis() - j2);
                                        }

                                        @Override // X.C0POE
                                        public final void onFailed(Throwable th) {
                                            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append("onFailed, ");
                                            sbLIZ.append(th.getMessage());
                                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                            c2341109Fh.getClass();
                                            C2341109Fh.LJ(strLIZIZ);
                                            c09aj2.onError(th);
                                            long jCurrentTimeMillis3 = System.currentTimeMillis();
                                            C03O0 c03o0 = C03O0.LIZ;
                                            String message = th.getMessage();
                                            Long lValueOf = Long.valueOf(jCurrentTimeMillis3 - j2);
                                            Boolean firstLoad = billInfoRequest3.getFirstLoad();
                                            c03o0.getClass();
                                            C03O0.LJJIJLIJ(message, lValueOf, firstLoad);
                                        }

                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // X.C0POE
                                        public final void onNext(BillInfoResponse billInfoResponse) {
                                            String str;
                                            Boolean bool;
                                            Boolean bool2;
                                            BillInfoResponse billInfoResponse2 = billInfoResponse;
                                            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append("onNext: ");
                                            sbLIZ.append(billInfoResponse2);
                                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                            c2341109Fh.getClass();
                                            C2341109Fh.LJ(strLIZIZ);
                                            C857603Ws c857603Ws3 = c857603Ws2;
                                            BillInfoData billInfoData = (BillInfoData) billInfoResponse2.data;
                                            if (billInfoData == null || (str = billInfoData.requestId) == null) {
                                                str = c857603Ws3.LIZLLL;
                                            }
                                            c857603Ws3.LIZLLL = str;
                                            BillInfoResponse billInfoResponse3 = c857603Ws3.LIZJ;
                                            if (billInfoResponse3 == null) {
                                                billInfoResponse3 = billInfoResponse2;
                                            }
                                            c857603Ws3.LIZJ = billInfoResponse3.mergeChunk(billInfoResponse2);
                                            BillInfoData billInfoData2 = (BillInfoData) billInfoResponse2.data;
                                            if (billInfoData2 != null) {
                                                billInfoData2.LIZ = Boolean.TRUE;
                                            }
                                            c09aj2.onNext(billInfoResponse2);
                                            long jCurrentTimeMillis3 = System.currentTimeMillis();
                                            BillInfoData billInfoData3 = (BillInfoData) billInfoResponse2.data;
                                            if (billInfoData3 != null && Intrinsics.LJFF(billInfoData3.beginRenderChunk, Boolean.TRUE)) {
                                                ModuleManager.LJJJJLI = jCurrentTimeMillis3;
                                            } else {
                                                BillInfoData billInfoData4 = (BillInfoData) billInfoResponse2.data;
                                                if (billInfoData4 != null && Intrinsics.LJFF(billInfoData4.lastChunk, Boolean.TRUE)) {
                                                    ModuleManager.LJJJJL = jCurrentTimeMillis3;
                                                }
                                            }
                                            C238400w2 c238400w25 = c238400w24;
                                            long j3 = jCurrentTimeMillis3 - c238400w25.element;
                                            long j4 = jCurrentTimeMillis3 - j2;
                                            c238400w25.element = jCurrentTimeMillis3;
                                            C03O0 c03o0 = C03O0.LIZ;
                                            Boolean bool3 = Boolean.TRUE;
                                            Long lValueOf = Long.valueOf(j3);
                                            Long lValueOf2 = Long.valueOf(j4);
                                            Integer num = billInfoResponse2.chunkIndex;
                                            BillInfoData billInfoData5 = (BillInfoData) billInfoResponse2.data;
                                            Long l = null;
                                            if (billInfoData5 != null) {
                                                bool = billInfoData5.beginRenderChunk;
                                                bool2 = billInfoData5.lastChunk;
                                                ChunkDebugInfo chunkDebugInfo = billInfoData5.chunkDebugInfo;
                                                if (chunkDebugInfo != null) {
                                                    l = chunkDebugInfo.costTime;
                                                }
                                            } else {
                                                bool = null;
                                                bool2 = null;
                                            }
                                            Boolean firstLoad = billInfoRequest3.getFirstLoad();
                                            c03o0.getClass();
                                            C03O0.LJJIJL(bool3, lValueOf, lValueOf2, num, bool, bool2, l, firstLoad);
                                        }
                                    });
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    c19482611Ke.onError(e);
                                    C1AF0.LIZJ("ChunkDataObserver throw Exception");
                                }
                            }
                            C1C7U.LIZIZ("OrderSubmitFetcher@a6d2.requestByChunkTask$1$1");
                            return c15o72;
                        }
                    });
                    C1C7U.LIZIZ("OrderSubmitFetcher@a6d2.requestByChunkTask$1");
                }
            });
            C03S2.LIZ.getClass();
            if (C03S2.LIZ() && !C928203k0.LJ(c928203k02, null, billInfoRequest, 1)) {
                c11roLIZIZ = C11S5.LIZ();
            } else {
                c11roLIZIZ = C1701940uOG.LIZIZ();
            }
            c19476611HwLJL = c19482711KfLJIJJLI2.LJJJLZIJ(c11roLIZIZ).LJJIJIIJIL(new AfS137S0200000_1(c857603WsLJJJJI2, billInfoRequest, 2)).LJL(C11S5.LIZ());
        }
        C189200o6.m2constructorimpl(c19476611HwLJL);
        c23260099m.resumeWith(c19476611HwLJL);
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(c856203We);
        }
        return objLIZ;
    }

    public final Object LJJJJJL(PollOrderStatusRequest pollOrderStatusRequest, InterfaceC1364105Vn<? super C03NA> interfaceC1364105Vn) {
        C11JF c11jf = this.LJIIJJI;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LJIIJJI = null;
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        OrderSubmitApi.LIZ.getClass();
        this.LJIIJJI = (C11JF) ((OrderSubmitApi) C859403Xk.LIZIZ.create(OrderSubmitApi.class)).pollOrderStatus(pollOrderStatusRequest, C859403Xk.LIZLLL(pollOrderStatusRequest.LIZ)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS170S0100000_1(c23260099m, 0), new AfS170S0100000_1(c23260099m, 1));
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    public static Object LJJJ(CreateOrderRequest createOrderRequest, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        List<OrderShopRequestParam> list = createOrderRequest.orderShop;
        if (list == null || list.isEmpty()) {
            EnumC1014603xw enumC1014603xw = EnumC1014603xw.ERR22;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("orderShop is null ");
            sbLIZ.append(createOrderRequest);
            RuntimeException runtimeException = new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
            C03O0.LIZ.getClass();
            C1019103yf.LIZ(enumC1014603xw, runtimeException, C03O0.LIZIZ);
        }
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        List<OrderShopRequestParam> list2 = createOrderRequest.orderShop;
        if (list2 != null) {
            Iterator<OrderShopRequestParam> it2 = list2.iterator();
            while (it2.hasNext()) {
                List<CreateOrderSku> list3 = it2.next().createOrderSku;
                if (list3 != null) {
                    for (CreateOrderSku createOrderSku : list3) {
                        String str2 = createOrderSku.entranceInfo;
                        if (str2 != null) {
                            createOrderSku.entranceInfo = C848530XQl.LIZIZ(C848530XQl.LIZ, null, str2);
                        }
                    }
                }
            }
        }
        OrderSubmitApi.LIZ.getClass();
        ((OrderSubmitApi) C859403Xk.LIZIZ.create(OrderSubmitApi.class)).createOrder(createOrderRequest, C859403Xk.LIZLLL(createOrderRequest.LIZ), str).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new C1077404Jg(c23260099m, 2));
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJLI(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest r6, kotlin.jvm.functions.Function0<kotlin.Unit> r7, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r8, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof X.C856103Wd
            if (r0 == 0) goto L22
            r4 = r9
            X.03Wd r4 = (X.C856103Wd) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r3 = r4.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILZ
            r0 = 1
            if (r1 == 0) goto L30
            if (r1 != r0) goto L28
            kotlin.jvm.functions.Function1 r8 = r4.LL
            goto L43
        L22:
            X.03Wd r4 = new X.03Wd
            r4.<init>(r5, r9)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r3)
            if (r7 == 0) goto L38
            r7.invoke()     // Catch: java.lang.Throwable -> L49
        L38:
            r4.LL = r8     // Catch: java.lang.Throwable -> L49
            r4.LLILZ = r0     // Catch: java.lang.Throwable -> L49
            java.lang.Object r3 = r5.LJJJI(r6, r4)     // Catch: java.lang.Throwable -> L49
            if (r3 != r2) goto L46
            return r2
        L43:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Throwable -> L49
        L46:
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse r3 = (com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse) r3     // Catch: java.lang.Throwable -> L49
            return r3
        L49:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r8.invoke(r0)
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03WX.LJJJJLI(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJLL(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest r7, boolean r8, kotlin.jvm.functions.Function1 r9, X.InterfaceC1364105Vn r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof X.C856203We
            if (r0 == 0) goto L25
            r5 = r10
            X.03We r5 = (X.C856203We) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r4 = r5.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r2 = r5.LLILZ
            r1 = 2
            r0 = 1
            if (r2 == 0) goto L36
            if (r2 == r0) goto L33
            if (r2 != r1) goto L2b
            kotlin.jvm.functions.Function1 r9 = r5.LL
            goto L57
        L25:
            X.03We r5 = new X.03We
            r5.<init>(r6, r10)
            goto L12
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L33:
            kotlin.jvm.functions.Function1 r9 = r5.LL
            goto L46
        L36:
            X.C155000ia.LIZIZ(r4)
            if (r8 != 0) goto L4c
            r5.LL = r9     // Catch: java.lang.Throwable -> L5d
            r5.LLILZ = r0     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r4 = r6.LJJJJ(r7, r5)     // Catch: java.lang.Throwable -> L5d
            if (r4 != r3) goto L49
            return r3
        L46:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Throwable -> L5d
        L49:
            X.11NZ r4 = (X.C11NZ) r4     // Catch: java.lang.Throwable -> L5d
            return r4
        L4c:
            r5.LL = r9     // Catch: java.lang.Throwable -> L5d
            r5.LLILZ = r1     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r4 = r6.LJJJIL(r7, r5)     // Catch: java.lang.Throwable -> L5d
            if (r4 != r3) goto L5a
            return r3
        L57:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Throwable -> L5d
        L5a:
            X.11NZ r4 = (X.C11NZ) r4     // Catch: java.lang.Throwable -> L5d
            return r4
        L5d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r9.invoke(r0)
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03WX.LJJJJLL(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest, boolean, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJZ(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest r14, boolean r15, java.util.HashMap<java.lang.String, java.lang.Object> r16, boolean r17, boolean r18, X.InterfaceC1364105Vn<? super X.C11NZ<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse>> r19) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03WX.LJJJZ(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest, boolean, java.util.HashMap, boolean, boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0104 A[Catch: all -> 0x0176, TryCatch #0 {all -> 0x0176, blocks: (B:34:0x0100, B:36:0x0104, B:37:0x0108, B:39:0x010e, B:46:0x0136, B:48:0x013e, B:49:0x0146, B:50:0x014b, B:52:0x0153, B:53:0x0159, B:45:0x0126), top: B:88:0x0100 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010e A[Catch: all -> 0x0176, TryCatch #0 {all -> 0x0176, blocks: (B:34:0x0100, B:36:0x0104, B:37:0x0108, B:39:0x010e, B:46:0x0136, B:48:0x013e, B:49:0x0146, B:50:0x014b, B:52:0x0153, B:53:0x0159, B:45:0x0126), top: B:88:0x0100 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0126 A[Catch: all -> 0x0176, TryCatch #0 {all -> 0x0176, blocks: (B:34:0x0100, B:36:0x0104, B:37:0x0108, B:39:0x010e, B:46:0x0136, B:48:0x013e, B:49:0x0146, B:50:0x014b, B:52:0x0153, B:53:0x0159, B:45:0x0126), top: B:88:0x0100 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0153 A[Catch: all -> 0x0176, TryCatch #0 {all -> 0x0176, blocks: (B:34:0x0100, B:36:0x0104, B:37:0x0108, B:39:0x010e, B:46:0x0136, B:48:0x013e, B:49:0x0146, B:50:0x014b, B:52:0x0153, B:53:0x0159, B:45:0x0126), top: B:88:0x0100 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0241  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJL(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest r24, boolean r25, java.util.HashMap<java.lang.String, java.lang.Object> r26, boolean r27, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r28, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse> r29) {
        /*
            Method dump skipped, instruction units count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03WX.LJJL(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest, boolean, java.util.HashMap, boolean, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0165 A[Catch: all -> 0x01da, TryCatch #0 {all -> 0x01da, blocks: (B:40:0x015d, B:42:0x0165, B:43:0x0169, B:45:0x016f, B:51:0x0196, B:53:0x019e, B:54:0x01a6, B:55:0x01ab, B:57:0x01b7, B:58:0x01bd, B:50:0x0186), top: B:136:0x015d }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016f A[Catch: all -> 0x01da, TryCatch #0 {all -> 0x01da, blocks: (B:40:0x015d, B:42:0x0165, B:43:0x0169, B:45:0x016f, B:51:0x0196, B:53:0x019e, B:54:0x01a6, B:55:0x01ab, B:57:0x01b7, B:58:0x01bd, B:50:0x0186), top: B:136:0x015d }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0186 A[Catch: all -> 0x01da, TryCatch #0 {all -> 0x01da, blocks: (B:40:0x015d, B:42:0x0165, B:43:0x0169, B:45:0x016f, B:51:0x0196, B:53:0x019e, B:54:0x01a6, B:55:0x01ab, B:57:0x01b7, B:58:0x01bd, B:50:0x0186), top: B:136:0x015d }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b7 A[Catch: all -> 0x01da, TryCatch #0 {all -> 0x01da, blocks: (B:40:0x015d, B:42:0x0165, B:43:0x0169, B:45:0x016f, B:51:0x0196, B:53:0x019e, B:54:0x01a6, B:55:0x01ab, B:57:0x01b7, B:58:0x01bd, B:50:0x0186), top: B:136:0x015d }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0284  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJZI(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest r32, boolean r33, java.util.HashMap<java.lang.String, java.lang.Object> r34, boolean r35, java.lang.Integer r36, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r37, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse> r38) {
        /*
            Method dump skipped, instruction units count: 852
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03WX.LJJJJZI(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest, boolean, java.util.HashMap, boolean, java.lang.Integer, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJLL(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest r29, boolean r30, java.util.HashMap<java.lang.String, java.lang.Object> r31, boolean r32, boolean r33, java.lang.Integer r34, X.InterfaceC1364105Vn<? super X.C11NZ<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse>> r35) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03WX.LJJJLL(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest, boolean, java.util.HashMap, boolean, boolean, java.lang.Integer, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJLI(com.ss.android.ugc.aweme.ecommerce.base.osp.preview.preload.dto.PreloadBillInfoRequest r14, X.InterfaceC1748810vbr r15, java.lang.Integer r16, X.C03RX r17, X.C03RW r18, X.EnumC840403Qc r19, X.InterfaceC1364105Vn r20) {
        /*
            r13 = this;
            r3 = r20
            boolean r0 = r3 instanceof X.C856003Wc
            r4 = r13
            if (r0 == 0) goto L23
            r12 = r3
            X.03Wc r12 = (X.C856003Wc) r12
            int r2 = r12.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r12.LLILLL = r2
        L15:
            java.lang.Object r3 = r12.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r12.LLILLL
            r0 = 1
            if (r1 == 0) goto L31
            if (r1 != r0) goto L29
            goto L48
        L23:
            X.03Wc r12 = new X.03Wc
            r12.<init>(r4, r3)
            goto L15
        L29:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L31:
            X.C155000ia.LIZIZ(r3)
            r12.LLILLL = r0     // Catch: java.lang.Throwable -> L4e
            r9 = 0
            r6 = r19
            r7 = r18
            r5 = r17
            r11 = r16
            r10 = r15
            r8 = r14
            java.lang.Object r3 = r4.LJJJJL(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L4e
            if (r3 != r2) goto L4b
            return r2
        L48:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Throwable -> L4e
        L4b:
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse r3 = (com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse) r3     // Catch: java.lang.Throwable -> L4e
            return r3
        L4e:
            r4 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r4)
            X.03xw r3 = X.EnumC1014603xw.ERR23
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "tryPreloadBillInfo excetpion: "
            r1.append(r0)
            java.lang.String r0 = r4.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            X.03O0 r0 = X.C03O0.LIZ
            r0.getClass()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = X.C03O0.LIZIZ
            X.C1019103yf.LIZ(r3, r2, r0)
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03WX.LJJLI(com.ss.android.ugc.aweme.ecommerce.base.osp.preview.preload.dto.PreloadBillInfoRequest, X.0vbr, java.lang.Integer, X.03RX, X.03RW, X.03Qc, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJJJJJ(C03WX c03wx, HashMap map, BillInfoResponse billInfoResponse, boolean z, boolean z2, Integer num, Integer num2, int i) {
        Address address;
        int i2;
        T t;
        T tValueOf;
        BillInfoData billInfoData;
        PackedSku packedSkuLIZJ;
        Map<String, String> map2;
        String str;
        BillInfoData billInfoData2;
        ExceptionUX exceptionUX;
        T t2;
        BillInfoData billInfoData3;
        BillInfoData billInfoData4;
        ShippingAddress shippingAddress;
        Integer num3 = num2;
        Integer num4 = num;
        if ((i & 16) != 0) {
            num4 = null;
        }
        if ((i & 32) != 0) {
            num3 = null;
        }
        c03wx.getClass();
        if (billInfoResponse != null && (billInfoData4 = (BillInfoData) billInfoResponse.data) != null && (shippingAddress = billInfoData4.shippingAddress) != null) {
            address = shippingAddress.shippingAddress;
        } else {
            address = null;
        }
        if (address != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        C259800zU c259800zU = new C259800zU();
        String str2 = "";
        c259800zU.element = "";
        C259800zU c259800zU2 = new C259800zU();
        c259800zU2.element = "";
        if (billInfoResponse != null && ((billInfoResponse.isValid() && (t2 = billInfoResponse.data) != 0 && (!(t2 instanceof BillInfoData) || (billInfoData3 = (BillInfoData) t2) == null || billInfoData3.exceptionUX == null)) || ((billInfoData2 = (BillInfoData) billInfoResponse.data) != null && (exceptionUX = billInfoData2.exceptionUX) != null && Intrinsics.LJFF(exceptionUX.renderPage, Boolean.TRUE)))) {
            t = "1";
        } else {
            t = CardStruct.IStatusCode.DEFAULT;
        }
        c259800zU.element = t;
        if (billInfoResponse == null) {
            tValueOf = "No internet connection";
        } else if (billInfoResponse.isValid()) {
            tValueOf = "";
        } else {
            tValueOf = String.valueOf(billInfoResponse.code);
        }
        c259800zU2.element = tValueOf;
        if ((map.get("previous_page") instanceof String) && TextUtils.equals((String) map.get("previous_page"), "product_detail")) {
            if (billInfoResponse != null && (billInfoData = (BillInfoData) billInfoResponse.data) != null && (packedSkuLIZJ = C7806033c.LIZJ(billInfoData)) != null && (map2 = packedSkuLIZJ.extra) != null && (str = map2.get("mix_product_type")) != null) {
                str2 = str;
            }
            map.put("is_mix_product", str2);
        }
        C03O7 c03o7 = new C03O7(num3, c03wx, map, z, z2, c259800zU, c259800zU2, billInfoResponse, num4, i2);
        if (EcTransactionRequestOpt.LIZ() && !((EcTransactionRequestOpt.EcTransactionRequestOptConfig) EcTransactionRequestOpt.LIZIZ.getValue()).fixConcurrentModification) {
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C01N2(c03o7, null), 2);
        } else {
            c03o7.invoke();
        }
    }

    public final Object LJJJJL(C03RX c03rx, EnumC840403Qc enumC840403Qc, C03RW c03rw, final C03R6 c03r6, C03W6 c03w6, InterfaceC1748810vbr interfaceC1748810vbr, final Integer num, InterfaceC1364105Vn interfaceC1364105Vn) {
        C11NZ<BillInfoResponse> c11nzLJ;
        C11NZ<BillInfoResponse> c11nzLJII;
        C11JF c11jf = this.LJI;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        if (c03r6 instanceof PreloadBillInfoRequest) {
            ModuleManager.LJJJJJ = System.currentTimeMillis();
            C857603Ws c857603WsLJJJJI = LJJJJI();
            PreloadBillInfoRequest preloadBillInfoRequest = (PreloadBillInfoRequest) c03r6;
            c857603WsLJJJJI.getClass();
            if (EcTransactionPbSwitch.LIZ().ospEnablePreloadPb) {
                OrderSubmitApi.LIZ.getClass();
                c11nzLJII = ((OrderSubmitApi) C859403Xk.LIZIZ.create(OrderSubmitApi.class)).LJIIIZ(preloadBillInfoRequest).LJJJJZI(new AkS467S0100000_1(c857603WsLJJJJI, 2));
            } else {
                OrderSubmitApi.LIZ.getClass();
                c11nzLJII = ((OrderSubmitApi) C859403Xk.LIZIZ.create(OrderSubmitApi.class)).LJII(preloadBillInfoRequest);
            }
            final int i = 0;
            this.LJI = (C11JF) c11nzLJII.LJJJLZIJ(C1701940uOG.LIZIZ()).LJL(C11S5.LIZ()).LJJIIZ(new InterfaceC781210Ukh(c03r6, num, i) { // from class: X.04Jc
                public final int $t;
                public Object l0;
                public Object l1;

                @Override // X.InterfaceC781210Ukh
                public final void run() {
                    switch (this.$t) {
                        case 0:
                            run$0(this);
                            break;
                        case 1:
                            run$1(this);
                            break;
                    }
                }

                public static final void run$0(C1077004Jc c1077004Jc) {
                    boolean z = C843303Rf.LIZ;
                    C843303Rf.LJ((Integer) c1077004Jc.l1, ((C03R6) c1077004Jc.l0).genCacheKey(null));
                }

                public static final void run$1(C1077004Jc c1077004Jc) {
                    boolean z = C843303Rf.LIZ;
                    C843303Rf.LJ((Integer) c1077004Jc.l1, ((C03R6) c1077004Jc.l0).genCacheKey(null));
                }

                {
                    this.$t = i;
                    this.l0 = c03r6;
                    this.l1 = num;
                }
            }).LJJLL(new AfS0S0900000_1(enumC840403Qc, c03rx, c03rw, interfaceC1748810vbr, c03r6, num, this, c03w6, c23260099m, 0), new AfS1S0800000_1(c03rx, enumC840403Qc, c03rw, c03r6, c03w6, interfaceC1748810vbr, num, c23260099m, 0));
        } else if (c03r6 instanceof BillInfoRequest) {
            ModuleManager.LJJJJJ = System.currentTimeMillis();
            C857603Ws c857603WsLJJJJI2 = LJJJJI();
            BillInfoRequest billInfoRequest = (BillInfoRequest) c03r6;
            c857603WsLJJJJI2.getClass();
            if (EcTransactionPbSwitch.LIZ().ospEnablePreloadPb) {
                OrderSubmitApi.LIZ.getClass();
                c11nzLJ = ((OrderSubmitApi) C859403Xk.LIZIZ.create(OrderSubmitApi.class)).LJIIIIZZ(billInfoRequest).LJJJJZI(new AkS467S0100000_1(c857603WsLJJJJI2, 3));
            } else {
                OrderSubmitApi.LIZ.getClass();
                c11nzLJ = ((OrderSubmitApi) C859403Xk.LIZIZ.create(OrderSubmitApi.class)).LJ(billInfoRequest);
            }
            final int i2 = 1;
            this.LJI = (C11JF) c11nzLJ.LJJJLZIJ(C1701940uOG.LIZIZ()).LJL(C11S5.LIZ()).LJJIIZ(new InterfaceC781210Ukh(c03r6, num, i2) { // from class: X.04Jc
                public final int $t;
                public Object l0;
                public Object l1;

                @Override // X.InterfaceC781210Ukh
                public final void run() {
                    switch (this.$t) {
                        case 0:
                            run$0(this);
                            break;
                        case 1:
                            run$1(this);
                            break;
                    }
                }

                public static final void run$0(C1077004Jc c1077004Jc) {
                    boolean z = C843303Rf.LIZ;
                    C843303Rf.LJ((Integer) c1077004Jc.l1, ((C03R6) c1077004Jc.l0).genCacheKey(null));
                }

                public static final void run$1(C1077004Jc c1077004Jc) {
                    boolean z = C843303Rf.LIZ;
                    C843303Rf.LJ((Integer) c1077004Jc.l1, ((C03R6) c1077004Jc.l0).genCacheKey(null));
                }

                {
                    this.$t = i2;
                    this.l0 = c03r6;
                    this.l1 = num;
                }
            }).LJJLL(new AfS0S0900000_1(enumC840403Qc, c03rx, c03rw, interfaceC1748810vbr, c03r6, num, this, c03w6, c23260099m, 1), new AfS1S0800000_1(c03rx, enumC840403Qc, c03rw, c03r6, c03w6, interfaceC1748810vbr, num, c23260099m, 1));
        }
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }
}
