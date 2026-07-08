package Y;

import X.AbstractC1614570s7L;
import X.AbstractC19484711Kz;
import X.AbstractC19486711Lt;
import X.AbstractC2197911B0j;
import X.C0KPG;
import X.C0KPH;
import X.C118300cf;
import X.C11IW;
import X.C11JZ;
import X.C11NZ;
import X.C1613300s5I;
import X.C1614530s7H;
import X.C19475111Hh;
import X.C1954807lC;
import X.C1D1A;
import X.C2197881B0g;
import X.C2197921B0k;
import X.C2197961B0o;
import X.C2198021B0u;
import X.C290601Aq;
import X.C470590Icr;
import X.C500260Jjc;
import X.C517301zv;
import X.InterfaceC1487280oo2;
import X.InterfaceC2197871B0f;
import android.content.Context;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.api.revenue.enigma.iap.EnigmaIapApi;
import com.bytedance.android.livesdk.impl.revenue.enigma.iap.EnigmaPurchaseService;
import com.ss.android.ugc.aweme.series.vip.model.SeriesSubscriptionModels$ChangePlanResponse;
import com.ss.android.ugc.aweme.series.vip.model.SeriesSubscriptionModels$CreateContractResponse;
import com.ss.android.ugc.aweme.series.vip.model.SeriesSubscriptionModels$MpIapResult;
import com.ss.android.ugc.aweme.series.vip.model.SeriesSubscriptionModels$TradeOrderInfo;
import com.ss.android.ugc.aweme.series.vip.serviceimpl.SeriesSubscriptionServiceImpl;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS237S0000000_7;
import tikcast.api.privilege.enigma.EnigmaSubscriptionInfo;
import tikcast.api.privilege.enigma.EnigmaUserDetailsResponse;

/* JADX INFO: loaded from: classes35.dex */
public class AkS332S0200000_34 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            case 4:
                return apply$4(this, obj);
            case 5:
                return apply$5(this, obj);
            default:
                return null;
        }
    }

    public static final Object apply$0(AkS332S0200000_34 akS332S0200000_34, Object obj) {
        Throwable c2197961B0o;
        Throwable th = (Throwable) obj;
        if (!(th instanceof AbstractC2197911B0j)) {
            if (C500260Jjc.LJIIIZ(th) == ((EnigmaPurchaseService) akS332S0200000_34.l0).LLILLL) {
                c2197961B0o = new C2198021B0u(0, "failed on create order (repurchase)", th);
            } else {
                c2197961B0o = new C2197961B0o(th.getMessage(), th);
            }
            th = c2197961B0o;
        }
        return AbstractC19484711Kz.LJIILLIIL(th);
    }

    public static final Object apply$1(AkS332S0200000_34 akS332S0200000_34, Object obj) {
        Throwable th = (Throwable) obj;
        C290601Aq c290601Aq = (C290601Aq) akS332S0200000_34.l0;
        C2197881B0g.LIZIZ(c290601Aq.LIZIZ, "failed", ((C118300cf) akS332S0200000_34.l1).element, c290601Aq.LIZ.LJIIIIZZ);
        return AbstractC19486711Lt.LJIIJ(new C2198021B0u(((C118300cf) akS332S0200000_34.l1).element, th.getMessage(), th));
    }

    public static final Object apply$2(AkS332S0200000_34 akS332S0200000_34, Object obj) {
        C290601Aq c290601Aq = (C290601Aq) obj;
        EnigmaPurchaseService enigmaPurchaseService = (EnigmaPurchaseService) akS332S0200000_34.l0;
        InterfaceC2197871B0f interfaceC2197871B0f = (InterfaceC2197871B0f) akS332S0200000_34.l1;
        enigmaPurchaseService.getClass();
        return AbstractC19484711Kz.LJII(new C1D1A(c290601Aq, enigmaPurchaseService, interfaceC2197871B0f, 0)).LJIILL(new AfS203S0100000_34(c290601Aq, 0)).LJIIL(new AfS203S0100000_34(c290601Aq, 1)).LJIL(new C517301zv(c290601Aq, 7));
    }

    public static final Object apply$3(AkS332S0200000_34 akS332S0200000_34, Object obj) {
        Pair pair = (Pair) obj;
        EnigmaPurchaseService enigmaPurchaseService = (EnigmaPurchaseService) akS332S0200000_34.l0;
        final InterfaceC2197871B0f interfaceC2197871B0f = (InterfaceC2197871B0f) akS332S0200000_34.l1;
        enigmaPurchaseService.getClass();
        final C290601Aq c290601Aq = (C290601Aq) pair.getFirst();
        C0KPG c0kpg = (C0KPG) pair.getSecond();
        int i = C0KPH.LIZ[c0kpg.LIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 && i != 5) {
                        throw new C1954807lC();
                    }
                    return AbstractC19486711Lt.LJIIJ(new C2197921B0k(c0kpg));
                }
                return AbstractC19486711Lt.LJIIJ(new AbstractC2197911B0j() { // from class: X.1B0s
                    {
                        EnumC2197951B0n enumC2197951B0n = EnumC2197951B0n.PURCHASE_CANCELLED;
                    }
                });
            }
            return AbstractC19486711Lt.LJIIJ(new AbstractC2197911B0j() { // from class: X.1B0t
                {
                    EnumC2197951B0n enumC2197951B0n = EnumC2197951B0n.PURCHASE_PENDING;
                }
            });
        }
        final C118300cf c118300cf = new C118300cf();
        c118300cf.element = 1;
        C11NZ<C470590Icr<EnigmaUserDetailsResponse.Data>> userDetails = ((EnigmaIapApi) enigmaPurchaseService.LLILZIL.getValue()).getUserDetails();
        userDetails.getClass();
        final C11IW c11iw = new C11IW(new C11JZ(new C19475111Hh(userDetails), new InterfaceC1487280oo2() { // from class: X.01Ap
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj2) {
                EnigmaSubscriptionInfo enigmaSubscriptionInfo;
                BaseResponse baseResponse = (BaseResponse) obj2;
                EnigmaUserDetailsResponse.Data data = (EnigmaUserDetailsResponse.Data) baseResponse.data;
                if (data != null && (enigmaSubscriptionInfo = data.subInfo) != null && enigmaSubscriptionInfo.subStatus == 1) {
                    C290601Aq c290601Aq2 = c290601Aq;
                    C2197881B0g.LIZIZ(c290601Aq2.LIZIZ, "success", c118300cf.element, c290601Aq2.LIZ.LJIIIIZZ);
                    interfaceC2197871B0f.LLIIIZ();
                    return C11NZ.LJJJJZ(baseResponse);
                }
                c118300cf.element++;
                return C11NZ.LJJIJLIJ(new C290301An());
            }
        }).LJJLIIIJLJLI(new AkS7S0101100_7(enigmaPurchaseService.LLILLJJLI, enigmaPurchaseService.LL, AFwS237S0000000_7.get$arr$(34), 1)));
        final AkS332S0200000_34 akS332S0200000_342 = new AkS332S0200000_34(c290601Aq, c118300cf, 1);
        final AbstractC19486711Lt abstractC19486711Lt = new AbstractC19486711Lt(c11iw, akS332S0200000_342) { // from class: X.11Iu
            public final C11IV LL;
            public final InterfaceC1487280oo2<? super Throwable, ? extends C11IV> LLILLJJLI;

            @Override // X.AbstractC19486711Lt
            public final void LJIJJ(C11IY c11iy) {
                C19478911It c19478911It = new C19478911It(c11iy, this.LLILLJJLI);
                c11iy.onSubscribe(c19478911It);
                this.LL.LIZIZ(c19478911It);
            }

            {
                this.LL = c11iw;
                this.LLILLJJLI = akS332S0200000_342;
            }
        };
        final InterfaceC1487280oo2 interfaceC1487280oo2 = new InterfaceC1487280oo2() { // from class: X.1B0i
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj2) {
                Throwable c2197941B0m = (Throwable) obj2;
                if (!(c2197941B0m instanceof AbstractC2197911B0j)) {
                    c2197941B0m = new C2197941B0m(c2197941B0m);
                }
                return AbstractC19486711Lt.LJIIJ(c2197941B0m);
            }
        };
        return new AbstractC19486711Lt(abstractC19486711Lt, interfaceC1487280oo2) { // from class: X.11Iu
            public final C11IV LL;
            public final InterfaceC1487280oo2<? super Throwable, ? extends C11IV> LLILLJJLI;

            @Override // X.AbstractC19486711Lt
            public final void LJIJJ(C11IY c11iy) {
                C19478911It c19478911It = new C19478911It(c11iy, this.LLILLJJLI);
                c11iy.onSubscribe(c19478911It);
                this.LL.LIZIZ(c19478911It);
            }

            {
                this.LL = abstractC19486711Lt;
                this.LLILLJJLI = interfaceC1487280oo2;
            }
        };
    }

    public static final Object apply$4(AkS332S0200000_34 akS332S0200000_34, Object obj) {
        String str;
        AbstractC1614570s7L abstractC1614570s7LLJIIL;
        SeriesSubscriptionModels$ChangePlanResponse seriesSubscriptionModels$ChangePlanResponse = (SeriesSubscriptionModels$ChangePlanResponse) obj;
        int i = seriesSubscriptionModels$ChangePlanResponse.statusCode;
        String str2 = null;
        if (i != 0) {
            if (i == 4025061) {
                abstractC1614570s7LLJIIL = new C1614530s7H(((SeriesSubscriptionServiceImpl) akS332S0200000_34.l0).LIZJ, 2131848160);
            } else {
                abstractC1614570s7LLJIIL = ((SeriesSubscriptionServiceImpl) akS332S0200000_34.l0).LJIIL(seriesSubscriptionModels$ChangePlanResponse.statusMsg);
            }
            ((SeriesSubscriptionServiceImpl) akS332S0200000_34.l0).LIZ.onNext(abstractC1614570s7LLJIIL);
            return AbstractC19486711Lt.LJIIJ(new C1613300s5I(null, null));
        }
        SeriesSubscriptionModels$TradeOrderInfo seriesSubscriptionModels$TradeOrderInfo = seriesSubscriptionModels$ChangePlanResponse.order;
        if (seriesSubscriptionModels$TradeOrderInfo == null || (str = seriesSubscriptionModels$TradeOrderInfo.orderId) == null) {
            str = "";
        }
        SeriesSubscriptionModels$MpIapResult seriesSubscriptionModels$MpIapResult = seriesSubscriptionModels$ChangePlanResponse.iapResult;
        if (seriesSubscriptionModels$MpIapResult != null) {
            str2 = seriesSubscriptionModels$MpIapResult.inAppRequest;
        }
        if (str.length() != 0 && str2 != null && str2.length() != 0) {
            return ((SeriesSubscriptionServiceImpl) akS332S0200000_34.l0).LJIIJ((Context) akS332S0200000_34.l1, str2).LJIJ(new AkS109S1100000_34((SeriesSubscriptionServiceImpl) akS332S0200000_34.l0, str, 3));
        }
        return AbstractC19486711Lt.LJIIJ(new IllegalStateException("empty orderId/iapPayload"));
    }

    public static final Object apply$5(AkS332S0200000_34 akS332S0200000_34, Object obj) {
        String str;
        SeriesSubscriptionModels$CreateContractResponse seriesSubscriptionModels$CreateContractResponse = (SeriesSubscriptionModels$CreateContractResponse) obj;
        String str2 = null;
        if (seriesSubscriptionModels$CreateContractResponse.statusCode != 0) {
            SeriesSubscriptionServiceImpl seriesSubscriptionServiceImpl = (SeriesSubscriptionServiceImpl) akS332S0200000_34.l0;
            seriesSubscriptionServiceImpl.LIZ.onNext(seriesSubscriptionServiceImpl.LJIIL(seriesSubscriptionModels$CreateContractResponse.statusMsg));
            return AbstractC19486711Lt.LJIIJ(new C1613300s5I(null, null));
        }
        SeriesSubscriptionModels$TradeOrderInfo seriesSubscriptionModels$TradeOrderInfo = seriesSubscriptionModels$CreateContractResponse.order;
        if (seriesSubscriptionModels$TradeOrderInfo == null || (str = seriesSubscriptionModels$TradeOrderInfo.orderId) == null) {
            str = "";
        }
        SeriesSubscriptionModels$MpIapResult seriesSubscriptionModels$MpIapResult = seriesSubscriptionModels$CreateContractResponse.iapResult;
        if (seriesSubscriptionModels$MpIapResult != null) {
            str2 = seriesSubscriptionModels$MpIapResult.inAppRequest;
        }
        if (str.length() != 0 && str2 != null && str2.length() != 0) {
            return ((SeriesSubscriptionServiceImpl) akS332S0200000_34.l0).LJIIJ((Context) akS332S0200000_34.l1, str2).LJIJ(new AkS109S1100000_34((SeriesSubscriptionServiceImpl) akS332S0200000_34.l0, str, 4));
        }
        return AbstractC19486711Lt.LJIIJ(new IllegalStateException("empty orderId/iapPayload"));
    }

    public AkS332S0200000_34(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
