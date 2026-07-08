package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.api.PdpApi;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleBrief;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleDealRequest;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleInfoResponse;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS580S0100000_1;
import njp.a;

/* JADX INFO: renamed from: X.04AE, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.manager.recommend.SeaPdpRecommendMgr$fetchBundleDealData$1", f = "SeaPdpRecommendMgr.kt", l = {212}, m = "invokeSuspend")
public final class C04AE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public SeaPdpViewModel LL;
    public int LLILLJJLI;
    public final /* synthetic */ C04AG LLILLL;
    public final /* synthetic */ Context LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C04AE(C04AG c04ag, Context context, InterfaceC1364105Vn<? super C04AE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c04ag;
        this.LLILZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C04AE(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String string;
        String str2;
        Map map;
        List listLJJLJ;
        SeaPdpViewModel seaPdpViewModel;
        List<String> list;
        String str3;
        String str4;
        BundleBrief bundleBrief;
        Map<String, Object> map2;
        Object obj2;
        SellerInfo sellerInfo;
        Object objLIZIZ = obj;
        C1C7U.LIZ("SeaPdpRecommendMgr@82f2.fetchBundleDealData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                seaPdpViewModel = this.LL;
                C155000ia.LIZIZ(objLIZIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZIZ);
            SeaPdpViewModel seaPdpViewModel2 = this.LLILLL.LIZ;
            ProductPackStruct productPackStruct = seaPdpViewModel2.LLJIJIL;
            if (productPackStruct != null && (sellerInfo = productPackStruct.sellerInfo) != null) {
                str = sellerInfo.sellerId;
            } else {
                str = null;
            }
            IPdpStarter.PdpEnterParam pdpEnterParam = seaPdpViewModel2.LLIZ;
            if (pdpEnterParam != null && (map2 = pdpEnterParam.trackParams) != null && (obj2 = map2.get("author_id")) != null) {
                string = obj2.toString();
            } else {
                string = null;
            }
            C1017603yQ c1017603yQ = InterfaceC1018003yU.LIZ;
            IPdpStarter.PdpEnterParam pdpEnterParam2 = this.LLILLL.LIZ.LLIZ;
            c1017603yQ.getClass();
            int iLIZ = C1017603yQ.LIZ(pdpEnterParam2);
            IPdpStarter.PdpEnterParam pdpEnterParam3 = this.LLILLL.LIZ.LLIZ;
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
            seaPdpViewModel = this.LLILLL.LIZ;
            C1758570vrb c1758570vrb = PdpApi.LIZ;
            ProductPackStruct productPackStruct2 = seaPdpViewModel.LLJIJIL;
            if (productPackStruct2 != null && (bundleBrief = productPackStruct2.bundleBrief) != null) {
                list = bundleBrief.bundleIdList;
            } else {
                list = null;
            }
            Integer numLJ = C2286608xc.LJ(iLIZ);
            ProductPackStruct productPackStruct3 = this.LLILLL.LIZ.LLJIJIL;
            if (productPackStruct3 != null) {
                str3 = productPackStruct3.defaultAddressId;
                str4 = productPackStruct3.productId;
            } else {
                str3 = null;
                str4 = null;
            }
            BundleDealRequest bundleDealRequest = new BundleDealRequest(list, str, str2, string, numLJ, listLJJLJ, str3, str4);
            this.LL = seaPdpViewModel;
            this.LLILLJJLI = 1;
            objLIZIZ = c1758570vrb.LIZIZ(bundleDealRequest, this);
            if (objLIZIZ == objLJFF) {
                C1C7U.LIZIZ("SeaPdpRecommendMgr@82f2.fetchBundleDealData$1");
                return objLJFF;
            }
        }
        seaPdpViewModel.g = (BundleInfoResponse) objLIZIZ;
        C04AG c04ag = this.LLILLL;
        SeaPdpViewModel seaPdpViewModel3 = c04ag.LIZ;
        seaPdpViewModel3.i = true;
        seaPdpViewModel3.setState(new AwS580S0100000_1(c04ag, 990));
        C04AG c04ag2 = this.LLILLL;
        SeaPdpViewModel seaPdpViewModel4 = c04ag2.LIZ;
        C1DFH c1dfh = C0PEM.LIZ;
        C948503nH.LJFF(seaPdpViewModel4, C2107308Nj.LIZ, new C04AF(c04ag2, this.LLILZ, null));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaPdpRecommendMgr@82f2.fetchBundleDealData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
