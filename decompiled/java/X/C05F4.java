package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.api.FollowShopAndClaimRequest;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.api.ShopApi;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05F4, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.shop.PdpShopMgr$followAndClaimVoucher$1", f = "PdpShopMgr.kt", l = {57, 58}, m = "invokeSuspend")
public final class C05F4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Function2 LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ FollowShopAndClaimRequest LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Function2<Boolean, String, Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05F4(FollowShopAndClaimRequest followShopAndClaimRequest, String str, Function2<? super Boolean, ? super String, Unit> function2, InterfaceC1364105Vn<? super C05F4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = followShopAndClaimRequest;
        this.LLILZIL = str;
        this.LLILZLL = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05F4(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Function2<Boolean, String, Unit> function2;
        C1C7U.LIZ("PdpShopMgr@d226.followAndClaimVoucher$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        try {
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("PdpShopMgr@d226.followAndClaimVoucher$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function2 = this.LLILLJJLI;
            str = (String) this.LL;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            FollowShopAndClaimRequest followShopAndClaimRequest = this.LLILZ;
            str = this.LLILZIL;
            function2 = this.LLILZLL;
            ShopApi shopApi = (ShopApi) C0NSL.LIZ().create(ShopApi.class);
            this.LL = str;
            this.LLILLJJLI = function2;
            this.LLILLL = 1;
            obj = shopApi.followAndClaim(followShopAndClaimRequest, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PdpShopMgr@d226.followAndClaimVoucher$1");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C05F6 c05f6 = new C05F6((Response) obj, str, function2, null);
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c05f6) == objLJFF) {
            C1C7U.LIZIZ("PdpShopMgr@d226.followAndClaimVoucher$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PdpShopMgr@d226.followAndClaimVoucher$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
