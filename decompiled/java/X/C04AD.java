package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleBrief;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleDealRequest;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleInfoResponse;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS580S0100000_1;
import njp.a;

/* JADX INFO: renamed from: X.04AD, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.recommend.PdpRecommendMgr$fetchBundleDealData$1", f = "PdpRecommendMgr.kt", l = {492}, m = "invokeSuspend")
public final class C04AD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public PdpViewModel LL;
    public int LLILLJJLI;
    public final /* synthetic */ C04HR LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C04AD(C04HR c04hr, InterfaceC1364105Vn<? super C04AD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c04hr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C04AD(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String string;
        String str2;
        Map map;
        List listLJJLJ;
        PdpViewModel pdpViewModel;
        List<String> list;
        String str3;
        BundleBrief bundleBrief;
        Map<String, Object> map2;
        Object obj2;
        SellerInfo sellerInfo;
        Object objLIZIZ = obj;
        C1C7U.LIZ("PdpRecommendMgr@a78b.fetchBundleDealData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                pdpViewModel = this.LL;
                C155000ia.LIZIZ(objLIZIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZIZ);
            PdpViewModel pdpViewModel2 = this.LLILLL.LIZ;
            ProductPackStruct productPackStruct = pdpViewModel2.LLJILLL;
            String str4 = null;
            if (productPackStruct != null && (sellerInfo = productPackStruct.sellerInfo) != null) {
                str = sellerInfo.sellerId;
            } else {
                str = null;
            }
            IPdpStarter.PdpEnterParam pdpEnterParam = pdpViewModel2.LLJI;
            if (pdpEnterParam != null && (map2 = pdpEnterParam.trackParams) != null && (obj2 = map2.get("author_id")) != null) {
                string = obj2.toString();
            } else {
                string = null;
            }
            C1013003xg c1013003xg = IPdpStarter.LIZ;
            IPdpStarter.PdpEnterParam pdpEnterParam2 = this.LLILLL.LIZ.LLJI;
            c1013003xg.getClass();
            int iLIZJ = C1013003xg.LIZJ(pdpEnterParam2);
            IPdpStarter.PdpEnterParam pdpEnterParam3 = this.LLILLL.LIZ.LLJI;
            if (pdpEnterParam3 != null) {
                str2 = pdpEnterParam3.chainKey;
            } else {
                str2 = null;
            }
            int i2 = C1742080vR0.LIZ;
            if (pdpEnterParam3 == null || (map = pdpEnterParam3.trackParams) == null) {
                map = new HashMap();
            }
            int[] iArrLJFF = C1742080vR0.LJFF(map);
            if (iArrLJFF == null || (listLJJLJ = C13LQ.LJJLJ(iArrLJFF)) == null) {
                listLJJLJ = C13BV.INSTANCE;
            }
            pdpViewModel = this.LLILLL.LIZ;
            C1758570vrb c1758570vrb = PdpApi.LIZ;
            ProductPackStruct productPackStruct2 = pdpViewModel.LLJILLL;
            if (productPackStruct2 != null && (bundleBrief = productPackStruct2.bundleBrief) != null) {
                list = bundleBrief.bundleIdList;
            } else {
                list = null;
            }
            Integer numLJ = C2286608xc.LJ(iLIZJ);
            ProductPackStruct productPackStruct3 = this.LLILLL.LIZ.LLJILLL;
            if (productPackStruct3 != null) {
                str3 = productPackStruct3.defaultAddressId;
                str4 = productPackStruct3.productId;
            } else {
                str3 = null;
            }
            BundleDealRequest bundleDealRequest = new BundleDealRequest(list, str, str2, string, numLJ, listLJJLJ, str3, str4);
            this.LL = pdpViewModel;
            this.LLILLJJLI = 1;
            objLIZIZ = c1758570vrb.LIZIZ(bundleDealRequest, this);
            if (objLIZIZ == objLJFF) {
                C1C7U.LIZIZ("PdpRecommendMgr@a78b.fetchBundleDealData$1");
                return objLJFF;
            }
        }
        pdpViewModel.q = (BundleInfoResponse) objLIZIZ;
        C04HR c04hr = this.LLILLL;
        PdpViewModel pdpViewModel3 = c04hr.LIZ;
        pdpViewModel3.s = true;
        pdpViewModel3.setState(new AwS580S0100000_1(c04hr, 507));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PdpRecommendMgr@a78b.fetchBundleDealData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
