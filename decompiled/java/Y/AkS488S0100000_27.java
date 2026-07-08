package Y;

import X.AbstractC1794600wni;
import X.C118300cf;
import X.C11NZ;
import X.C1791570wip;
import X.C1792260wjw;
import X.C1792270wjx;
import X.C1792290wjz;
import X.C1792340wk4;
import X.C1792470wkH;
import X.C1792480wkI;
import X.C1792490wkJ;
import X.C1792500wkK;
import X.C1792840wks;
import X.C1792940wl2;
import X.C1794240wn8;
import X.C1803440x1y;
import X.C1811850xFX;
import X.C1811860xFY;
import X.C20441214yg;
import X.InterfaceC1487280oo2;
import com.bytedance.globalpayment.iap.common.ability.api.IapFlowApi;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.BaseResponse;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.activecontract.MoneyV1ActiveContractResponse;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.commonsku.MoneyV1NextAvailableSKUsRequest;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.commonsku.MoneyV1NextAvailableSKUsResponse;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.storesubs.IAPStoreSubResponse;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.storesubs.StoreSubPurchases;
import com.bytedance.globalpayment.iap.model.SKUInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.series.vip.model.SeriesSubscriptionModels$ContractOrderStatus;
import com.ss.android.ugc.aweme.series.vip.model.SeriesSubscriptionModels$OrderStatusResponse;
import com.ss.android.ugc.aweme.series.vip.model.SeriesSubscriptionModels$TradeContractInfo;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public class AkS488S0100000_27 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l0;

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
            case 6:
                return apply$6(this, obj);
            case 7:
                return apply$7(this, obj);
            case 8:
                return apply$8(this, obj);
            default:
                return null;
        }
    }

    public AkS488S0100000_27(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object apply$0(AkS488S0100000_27 akS488S0100000_27, Object obj) throws JSONException {
        C1792470wkH c1792470wkH = (C1792470wkH) akS488S0100000_27.l0;
        final C1792480wkI c1792480wkI = new C1792480wkI(c1792470wkH.LIZIZ, c1792470wkH.LIZ, (List) obj);
        final C118300cf c118300cf = new C118300cf();
        MoneyV1NextAvailableSKUsRequest moneyV1NextAvailableSKUsRequest = new MoneyV1NextAvailableSKUsRequest(c1792480wkI.LIZ, c1792480wkI.LIZIZ, c1792480wkI.LIZJ, null, 8, null);
        C1792500wkK c1792500wkK = c1792480wkI.LIZLLL;
        List<String> list = c1792480wkI.LIZIZ;
        List<String> list2 = c1792480wkI.LIZJ;
        c1792500wkK.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sku_id", list.toString());
        jSONObject.put("channel_sku_ids", list2.toString());
        c1792500wkK.LIZLLL(jSONObject);
        return ((IapFlowApi) ((C1791570wip) ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LJI()).LIZ(IapFlowApi.class)).getNextAvailableSKUs(moneyV1NextAvailableSKUsRequest).LJJJJZI(new AkS488S0100000_27(c1792480wkI, 3)).LJJLIIIJLJLI(new InterfaceC1487280oo2() { // from class: X.0wkG
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj2) {
                final C11NZ c11nz = (C11NZ) obj2;
                final C118300cf c118300cf2 = c118300cf;
                final C1792480wkI c1792480wkI2 = c1792480wkI;
                return c11nz.LJJJ(new InterfaceC1487280oo2() { // from class: X.0wkL
                    @Override // X.InterfaceC1487280oo2
                    public final Object apply(Object obj3) throws JSONException {
                        Throwable th = (Throwable) obj3;
                        C118300cf c118300cf3 = c118300cf2;
                        int i = c118300cf3.element;
                        if (i < 1) {
                            c118300cf3.element = i + 1;
                            return C11NZ.LJLJJLL(500L, TimeUnit.MILLISECONDS);
                        }
                        if (th instanceof C1792490wkJ) {
                            LIZJ(((C1792490wkJ) th).getResult(), null);
                            return c11nz;
                        }
                        C1792480wkI c1792480wkI3 = c1792480wkI2;
                        String message = th.getMessage();
                        if (message == null) {
                            message = "exceptions";
                        }
                        c1792480wkI3.getClass();
                        C1792490wkJ c1792490wkJ = new C1792490wkJ(new C1792840wks(205, -1, message));
                        LIZJ(c1792490wkJ.getResult(), null);
                        return C11NZ.LJJIJLIJ(c1792490wkJ);
                    }
                }, false);
            }
        });
    }

    public static final Object apply$1(AkS488S0100000_27 akS488S0100000_27, Object obj) {
        SeriesSubscriptionModels$ContractOrderStatus seriesSubscriptionModels$ContractOrderStatus;
        Function1 function1 = (Function1) akS488S0100000_27.l0;
        SeriesSubscriptionModels$TradeContractInfo seriesSubscriptionModels$TradeContractInfo = ((SeriesSubscriptionModels$OrderStatusResponse) obj).contract;
        if (seriesSubscriptionModels$TradeContractInfo != null) {
            seriesSubscriptionModels$ContractOrderStatus = seriesSubscriptionModels$TradeContractInfo.status;
        } else {
            seriesSubscriptionModels$ContractOrderStatus = null;
        }
        return function1.invoke(seriesSubscriptionModels$ContractOrderStatus);
    }

    public static final Object apply$2(AkS488S0100000_27 akS488S0100000_27, Object obj) {
        C1811860xFY c1811860xFY = (C1811860xFY) akS488S0100000_27.l0;
        Throwable th = (Throwable) obj;
        c1811860xFY.getClass();
        if (th instanceof C1811850xFX) {
            C1811850xFX c1811850xFX = (C1811850xFX) th;
            if (c1811850xFX.getStatusCode() >= 500 && c1811850xFX.getStatusCode() <= 599) {
                return C11NZ.LJJIJLIJ(th);
            }
        }
        int i = c1811860xFY.LLILLL + 1;
        c1811860xFY.LLILLL = i;
        if (i <= c1811860xFY.LL) {
            return C11NZ.LJLJJLL(c1811860xFY.LLILLJJLI, TimeUnit.MILLISECONDS);
        }
        return C11NZ.LJJIJLIJ(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object apply$3(AkS488S0100000_27 akS488S0100000_27, Object obj) throws JSONException, C1792490wkJ {
        boolean z;
        BaseResponse baseResponse = (BaseResponse) obj;
        Map<String, SKUInfo> map = ((MoneyV1NextAvailableSKUsResponse) baseResponse.data).nextAvailableSkus;
        if (baseResponse.statusCode == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C1792480wkI c1792480wkI = (C1792480wkI) akS488S0100000_27.l0;
            C1792500wkK c1792500wkK = c1792480wkI.LIZLLL;
            List<String> list = c1792480wkI.LIZIZ;
            List<String> list2 = c1792480wkI.LIZJ;
            c1792500wkK.getClass();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sku_id", list.toString());
            jSONObject.put("channel_sku_ids", list2.toString());
            try {
                String strLJIILL = new Gson().LJIILL(map);
                strLJIILL.toString();
                jSONObject.put("sku_list", strLJIILL);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            c1792500wkK.LJ(jSONObject);
            return map;
        }
        C1792480wkI c1792480wkI2 = (C1792480wkI) akS488S0100000_27.l0;
        int i = baseResponse.statusCode;
        c1792480wkI2.getClass();
        throw new C1792490wkJ(new C1792840wks(205, i, "failure on query common sku"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$4(AkS488S0100000_27 akS488S0100000_27, Object obj) {
        C1792840wks c1792840wks;
        BaseResponse baseResponse = (BaseResponse) obj;
        MoneyV1ActiveContractResponse moneyV1ActiveContractResponse = (MoneyV1ActiveContractResponse) baseResponse.data;
        int i = baseResponse.statusCode;
        if (i == 0) {
            c1792840wks = null;
        } else {
            C1792290wjz c1792290wjz = (C1792290wjz) akS488S0100000_27.l0;
            String str = moneyV1ActiveContractResponse.message;
            c1792290wjz.getClass();
            c1792840wks = new C1792840wks(201, i, str);
        }
        return new C1792270wjx((MoneyV1ActiveContractResponse) baseResponse.data, c1792840wks);
    }

    public static final Object apply$5(AkS488S0100000_27 akS488S0100000_27, Object obj) {
        C1792290wjz c1792290wjz = (C1792290wjz) akS488S0100000_27.l0;
        String message = ((Throwable) obj).getMessage();
        if (message == null) {
            message = "exceptions";
        }
        c1792290wjz.getClass();
        return new C1792270wjx(null, new C1792840wks(201, -1, message));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object apply$6(AkS488S0100000_27 akS488S0100000_27, Object obj) {
        AbstractC1794600wni next;
        boolean z;
        BaseResponse baseResponse = (BaseResponse) obj;
        C1792340wk4 c1792340wk4 = (C1792340wk4) akS488S0100000_27.l0;
        List<StoreSubPurchases> list = ((IAPStoreSubResponse) baseResponse.data).storeSubs;
        List<AbstractC1794600wni> list2 = c1792340wk4.LIZ;
        C1792840wks c1792840wks = null;
        if (list != null) {
            for (StoreSubPurchases storeSubPurchases : list) {
                Iterator<AbstractC1794600wni> it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(next.LIZJ, storeSubPurchases.productID)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                AbstractC1794600wni abstractC1794600wni = next;
                if (abstractC1794600wni != null) {
                    z = abstractC1794600wni.LJI;
                } else {
                    z = false;
                }
                storeSubPurchases.LIZ = z;
            }
        }
        int i = baseResponse.statusCode;
        if (i != 0) {
            ((C1792340wk4) akS488S0100000_27.l0).getClass();
            c1792840wks = new C1792840wks(201, i, "Empty Store Purchases");
        }
        return new C1792260wjw(c1792840wks, list);
    }

    public static final Object apply$7(AkS488S0100000_27 akS488S0100000_27, Object obj) {
        C1792340wk4 c1792340wk4 = (C1792340wk4) akS488S0100000_27.l0;
        String message = ((Throwable) obj).getMessage();
        if (message == null) {
            message = "exceptions";
        }
        c1792340wk4.getClass();
        return new C1792260wjw(new C1792840wks(201, -1, message), null);
    }

    public static final Object apply$8(AkS488S0100000_27 akS488S0100000_27, Object obj) {
        Throwable th = (Throwable) obj;
        ((C1792940wl2) akS488S0100000_27.l0).getClass();
        C1803440x1y.LIZIZ("ttlive_wallet_recharge_query_iap_currency", th);
        C20441214yg.LJI("CurrencyQueryTask", th);
        return "";
    }
}
