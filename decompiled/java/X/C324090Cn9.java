package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.api.ShopApi;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.api.ShopPromoPriorityFilter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Cn9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.showcase.store.ShopPrefetchDataManager$loadProductsFilterData$2", f = "ShopPrefetchDataManager.kt", l = {163}, m = "invokeSuspend")
public final class C324090Cn9 extends C09AX implements Function1<InterfaceC1364105Vn<? super n>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C1739060vM8 LLILLL;
    public final /* synthetic */ C1738990vM1 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C324090Cn9(C1739060vM8 c1739060vM8, C1738990vM1 c1738990vM1, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = c1739060vM8;
        this.LLILZ = c1738990vM1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C324090Cn9(this.LLILLL, this.LLILZ, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super n> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ShopPromoPriorityFilter shopPromoPriorityFilter;
        C1C7U.LIZ("ShopPrefetchDataManager@c051.loadProductsFilterData$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            ShopApi shopApi = (ShopApi) C0NSL.LIZ().create(ShopApi.class);
            String str = this.LLILLJJLI;
            C1739060vM8 c1739060vM8 = this.LLILLL;
            C1738990vM1 c1738990vM1 = this.LLILZ;
            c1739060vM8.getClass();
            if (Intrinsics.LJFF(c1738990vM1.LIZLLL, "coupon_center_page")) {
                shopPromoPriorityFilter = new ShopPromoPriorityFilter(EnumC1996107rr.VOUCHER.getValue(), c1738990vM1.LJFF);
            } else {
                shopPromoPriorityFilter = new ShopPromoPriorityFilter(EnumC1996107rr.UNKNOWN.getValue(), "");
            }
            String strLJIIIIZZ = C1741890vQh.LJIIIIZZ(shopPromoPriorityFilter);
            C1738990vM1 c1738990vM12 = this.LLILZ;
            String str2 = c1738990vM12.LIZ;
            Long lLJFF = C2286608xc.LJFF(c1738990vM12.LJIILIIL);
            this.LL = 1;
            obj = shopApi.getShopHomepageProductFilterListJSON(str, strLJIIIIZZ, str2, lLJFF, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ShopPrefetchDataManager@c051.loadProductsFilterData$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ShopPrefetchDataManager@c051.loadProductsFilterData$2");
        return obj;
    }
}
