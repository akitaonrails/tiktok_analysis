package X;

import Y.AkS467S0100000_1;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.api.proto.ComposePbAndJson;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.api.OrderSubmitApi;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcTransactionPbSwitch;
import com.ss.android.ugc.aweme.ecommerce.debug.IEcomDebugService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IEcUgPopupDependencyService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.ecommerce.debug.IEComOfflineService;
import com.ss.android.ugc.tiktok.ConvertHelper;
import kotlin.jvm.internal.AwS4S1000100_1;

/* JADX INFO: renamed from: X.03Ws, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C857603Ws extends C11T3<BillInfoRequest, BillInfoResponse, BillInfoRequest, BillInfoResponse> {
    public final C03X2 LIZ;
    public BillInfoResponse LIZIZ;
    public BillInfoResponse LIZJ;
    public String LIZLLL;
    public C11JF LJ;

    public C857603Ws(C03X2 c03x2) {
        this.LIZ = c03x2;
    }

    @Override // X.C11T3
    public final C11NZ<BillInfoResponse> requestActual(BillInfoRequest billInfoRequest) {
        C11NZ<BillInfoResponse> billInfo;
        final BillInfoRequest billInfoRequest2 = billInfoRequest;
        IEcUgPopupDependencyService iEcUgPopupDependencyService = (IEcUgPopupDependencyService) PluggableExtentionKt.pluggableSpi$default(IEcUgPopupDependencyService.class, false, false, false, 14, null);
        if (iEcUgPopupDependencyService != null) {
            iEcUgPopupDependencyService.checkPageSourceInfo(billInfoRequest2.getPageSourceInfo());
        }
        boolean z = EcTransactionPbSwitch.LIZ().ospEnableNormalPb;
        boolean z2 = EcTransactionPbSwitch.LIZ().ospEnableExpressPb;
        C928203k0 c928203k0 = C928203k0.LIZ;
        Integer flowType = billInfoRequest2.getFlowType();
        c928203k0.getClass();
        if (C928203k0.LJIILLIIL(flowType) && (billInfoRequest2.getBuyType() == 0 || billInfoRequest2.getBuyType() == 2 || billInfoRequest2.getBuyType() == 1)) {
            if (z2) {
                OrderSubmitApi.LIZ.getClass();
                billInfo = ((OrderSubmitApi) C859403Xk.LIZIZ.create(OrderSubmitApi.class)).getBillInfoForHalfPagePb(billInfoRequest2, C859403Xk.LIZLLL(billInfoRequest2.getBizType())).LJJJJZI(new AkS467S0100000_1(this, 1));
            } else {
                OrderSubmitApi.LIZ.getClass();
                billInfo = ((OrderSubmitApi) C859403Xk.LIZIZ.create(OrderSubmitApi.class)).getBillInfoForHalfPage(billInfoRequest2, C859403Xk.LIZLLL(billInfoRequest2.getBizType()));
            }
        } else if (z) {
            OrderSubmitApi.LIZ.getClass();
            billInfo = ((OrderSubmitApi) C859403Xk.LIZIZ.create(OrderSubmitApi.class)).getBillInfoPb(billInfoRequest2, C859403Xk.LIZLLL(billInfoRequest2.getBizType())).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.03Wt
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    Object objLIZJ = ((ComposePbAndJson) obj).LIZJ(new InterfaceC1487280oo2() { // from class: X.03uf
                        @Override // X.InterfaceC1487280oo2
                        public final Object apply(Object obj2) {
                            C994803uk c994803uk = (C994803uk) obj2;
                            try {
                                return new BillInfoResponse(c994803uk.code.intValue(), c994803uk.message, ConvertHelper.shop$serv$proto$GetBillInfoResponseData$$com$ss$android$ugc$aweme$ecommerce$base$osp$repository$dto$BillInfoData(c994803uk.data, null), null);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                C1019103yf.LIZ(EnumC1014603xw.ERR_OSP_BEAN_COPY, th, null);
                                return new BillInfoResponse(c994803uk.code.intValue(), c994803uk.message, null, null);
                            }
                        }
                    });
                    C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("convert json: ");
                    sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    c2341109Fh.getClass();
                    C2341109Fh.LIZ(strLIZIZ);
                    return objLIZJ;
                }
            });
        } else {
            OrderSubmitApi.LIZ.getClass();
            billInfo = ((OrderSubmitApi) C859403Xk.LIZIZ.create(OrderSubmitApi.class)).getBillInfo(billInfoRequest2, C859403Xk.LIZLLL(billInfoRequest2.getBizType()));
        }
        return billInfo.LJJJJZI(new InterfaceC1487280oo2() { // from class: X.03Wl
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                BillInfoResponse billInfoResponseMerge = (BillInfoResponse) obj;
                BillInfoResponse billInfoResponse = this.LL.LIZIZ;
                if (billInfoResponse != null && billInfoResponseMerge.isValid()) {
                    billInfoResponseMerge = billInfoResponse.merge(billInfoResponseMerge, billInfoRequest2);
                    if (billInfoResponseMerge.isValid()) {
                        this.LL.LIZIZ = billInfoResponseMerge;
                    }
                } else if (billInfoResponseMerge.isValid()) {
                    this.LL.LIZIZ = billInfoResponseMerge;
                    return billInfoResponseMerge;
                }
                return billInfoResponseMerge;
            }
        }).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIJIIJIL(new C09JN() { // from class: X.03X1
            @Override // X.C09JN
            public final void accept(Object obj) {
                BillInfoData billInfoData;
                PaymentMethodsData paymentMethodsData;
                C1C7U.LIZ("OrderSubmitFetcher@a6d2.requestActual$2");
                BillInfoResponse billInfoResponse = (BillInfoResponse) obj;
                if (billInfoResponse.isValid() && (billInfoData = (BillInfoData) billInfoResponse.data) != null && (paymentMethodsData = billInfoData.paymentMethods) != null) {
                    C914303hl c914303hl = C914303hl.LIZ;
                    String str = paymentMethodsData.saleRegion;
                    c914303hl.getClass();
                    C914303hl.LJFF(str, "order_submit");
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C1724230uyD.LIZ.LIZJ(paymentMethodsData);
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    C1417405gi.LIZ.getClass();
                    C1018703yb.LIZLLL("rd_tiktokec_warm_webview", new AwS4S1000100_1("order_submit", jCurrentTimeMillis2, 2));
                }
                C1C7U.LIZIZ("OrderSubmitFetcher@a6d2.requestActual$2");
            }
        }).LJJIJIIJI(new C09JN() { // from class: X.00Pu
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("OrderSubmitFetcher@a6d2.requestActual$3");
                C1C7U.LIZIZ("OrderSubmitFetcher@a6d2.requestActual$3");
            }
        });
    }

    @Override // X.C11T3, X.C11T4
    public final Object convertKeyActual(Object obj) {
        return obj;
    }

    public static BillInfoResponse LJFF(C857603Ws c857603Ws, ComposePbAndJson composePbAndJson) {
        c857603Ws.getClass();
        final boolean z = false;
        return (BillInfoResponse) composePbAndJson.LIZJ(new InterfaceC1487280oo2() { // from class: X.03uj
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                Integer num;
                Integer num2;
                C994803uk c994803uk = (C994803uk) obj;
                try {
                    BillInfoData billInfoDataShop$serv$proto$GetBillInfoResponseData$$com$ss$android$ugc$aweme$ecommerce$base$osp$repository$dto$BillInfoData = ConvertHelper.shop$serv$proto$GetBillInfoResponseData$$com$ss$android$ugc$aweme$ecommerce$base$osp$repository$dto$BillInfoData(c994803uk.data, null);
                    int iIntValue = c994803uk.code.intValue();
                    String str = c994803uk.message;
                    if (z) {
                        num2 = c994803uk.chunk_index;
                    } else {
                        num2 = null;
                    }
                    return new BillInfoResponse(iIntValue, str, billInfoDataShop$serv$proto$GetBillInfoResponseData$$com$ss$android$ugc$aweme$ecommerce$base$osp$repository$dto$BillInfoData, num2);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1019103yf.LIZ(EnumC1014603xw.ERR_OSP_BEAN_COPY, th, null);
                    int iIntValue2 = c994803uk.code.intValue();
                    String str2 = c994803uk.message;
                    if (z) {
                        num = c994803uk.chunk_index;
                    } else {
                        num = null;
                    }
                    return new BillInfoResponse(iIntValue2, str2, null, num);
                }
            }
        });
    }

    @Override // X.C11T3, X.C11T4
    public final Object convertValActual(Object obj, Object obj2) {
        return obj2;
    }

    public static void LJ(String str, BillInfoResponse billInfoResponse, long j) {
        if (str == null) {
            return;
        }
        if (C7879035x.LIZLLL() || C7879035x.LJ()) {
            IEcomDebugService iEcomDebugService = (IEcomDebugService) ServiceManager.get().getService(IEcomDebugService.class);
            ServiceManager.get().getService(IEComOfflineService.class);
            iEcomDebugService.LIZLLL();
        }
    }
}
