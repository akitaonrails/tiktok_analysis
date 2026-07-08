package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.api.FollowShopAndClaimData;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.api.FollowShopAndClaimRequest;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.api.ShopApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05F3, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop.PdpShopMgr$followAndClaimVoucherWithRawRequest$1", f = "PdpShopMgr.kt", l = {86, 87}, m = "invokeSuspend")
public final class C05F3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ FollowShopAndClaimRequest LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Function1<Response<FollowShopAndClaimData>, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05F3(FollowShopAndClaimRequest followShopAndClaimRequest, String str, Function1<? super Response<FollowShopAndClaimData>, Unit> function1, InterfaceC1364105Vn<? super C05F3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = followShopAndClaimRequest;
        this.LLILLL = str;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05F3(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("PdpShopMgr@d226.followAndClaimVoucherWithRawRequest$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("PdpShopMgr@d226.followAndClaimVoucherWithRawRequest$1");
                return unit;
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            ShopApi shopApi = (ShopApi) C0NSL.LIZ().create(ShopApi.class);
            FollowShopAndClaimRequest followShopAndClaimRequest = this.LLILLJJLI;
            this.LL = 1;
            obj = shopApi.followAndClaim(followShopAndClaimRequest, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PdpShopMgr@d226.followAndClaimVoucherWithRawRequest$1");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C05F5 c05f5 = new C05F5((Response) obj, this.LLILLL, this.LLILZ, null);
        this.LL = 2;
        obj = C23250099c.LJI(this, abstractC2238408pq, c05f5);
        if (obj == objLJFF) {
            C1C7U.LIZIZ("PdpShopMgr@d226.followAndClaimVoucherWithRawRequest$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PdpShopMgr@d226.followAndClaimVoucherWithRawRequest$1");
        return unit2;
    }
}
