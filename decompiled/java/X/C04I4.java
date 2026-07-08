package X;

import Y.AfS170S0100000_1;
import Y.AkS467S0100000_1;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.ReviewApi;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ListReviewData;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuSupply;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.04I4, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.review.PdpReviewMgr$fetchReviewData$1", f = "PdpReviewMgr.kt", l = {}, m = "invokeSuspend")
public final class C04I4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1073304Hr LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C04I4(C1073304Hr c1073304Hr, InterfaceC1364105Vn<? super C04I4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1073304Hr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C04I4(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        SellerInfo sellerInfo;
        String str;
        String productId;
        ProductPackStruct productPackStruct;
        Integer num;
        List<SkuItem> list;
        SkuItem skuItem;
        SkuSupply skuSupply;
        C1C7U.LIZ("PdpReviewMgr@811a.fetchReviewData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1073304Hr c1073304Hr = this.LL;
        ProductPackStruct productPackStruct2 = c1073304Hr.LIZ.LLJILLL;
        if (productPackStruct2 != null && (sellerInfo = productPackStruct2.sellerInfo) != null && (str = sellerInfo.sellerId) != null) {
            if (C041G.LJIILLIIL(c1073304Hr.LIZ.LLJILLL) && (productPackStruct = c1073304Hr.LIZ.LLJILLL) != null && (num = productPackStruct.bizType) != null && num.intValue() == 0) {
                ProductPackStruct productPackStruct3 = c1073304Hr.LIZ.LLJILLL;
                if (productPackStruct3 == null || (list = productPackStruct3.skus) == null || (skuItem = (SkuItem) C13LP.LJJJLZIJ(0, list)) == null || (skuSupply = skuItem.skuSupply) == null || (productId = skuSupply.productId) == null) {
                    productId = "";
                }
            } else {
                productId = c1073304Hr.LIZ.getProductId();
            }
            ReviewApi.ReviewRequest reviewRequest = new ReviewApi.ReviewRequest(productId, null, 3, 1, true, C2286608xc.LJ(1), null, true, str, true, C2286608xc.LJ(C04I1.PDPPAGE.getValue()), null, null, null);
            C1073304Hr c1073304Hr2 = this.LL;
            ReviewApi.LIZ.getClass();
            C11ON c11onLJJJJZI = ((ReviewApi) C1760770vv9.LIZIZ.create(ReviewApi.class)).LJIIIIZZ(reviewRequest).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.04B8
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj2) {
                    String str2 = (String) obj2;
                    Response response = (Response) GsonProtectorUtils.fromJson(C08JS.LIZIZ(), str2, new TypeToken<Response<ListReviewData>>() { // from class: X.04Co
                    }.getType());
                    C1060104Cp c1060104Cp = new C1060104Cp(response);
                    try {
                        JSONObject jSONObjectOptJSONObject = new JSONObject(str2).optJSONObject("data");
                        if (jSONObjectOptJSONObject != null) {
                            c1060104Cp.LIZ = C786410Ut5.J3(jSONObjectOptJSONObject);
                            c1060104Cp.LIZIZ = jSONObjectOptJSONObject.optString("shop_review_entry");
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1019103yf.LIZ(EnumC1014603xw.ERR10004, e, null);
                    }
                    return new Response(response.code, response.message, c1060104Cp, response.chunkIndex, response.logId);
                }
            }).LJL(C11S5.LIZ()).LJJJJZI(new AkS467S0100000_1(c1073304Hr2, 4));
            if (c11onLJJJJZI != null) {
                c11onLJJJJZI.LJJLJLI(new AfS170S0100000_1(this.LL, 31));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PdpReviewMgr@811a.fetchReviewData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
