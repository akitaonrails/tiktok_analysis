package X;

import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.MixMallTabRefreshAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0qyH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.mixhome.MixMallTabRefreshAssem$playShopTabRefreshAnim$1$1$1", f = "MixMallTabRefreshAssem.kt", l = {292}, m = "invokeSuspend")
public final class C1570510qyH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C19EG LLILLJJLI;
    public final /* synthetic */ MixMallTabRefreshAssem LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1570510qyH(C19EG c19eg, MixMallTabRefreshAssem mixMallTabRefreshAssem, InterfaceC1364105Vn<? super C1570510qyH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c19eg;
        this.LLILLL = mixMallTabRefreshAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1570510qyH(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MixMallTabRefreshAssem@7e11.playShopTabRefreshAnim$1$1$1");
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
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LIZ("mixhome ShopTab TabRefresh shop tab refresh anim");
            AbstractC1591090rVT abstractC1591090rVTY01 = C1591880rWk.LIZIZ.LJIILL(this.LLILLJJLI).y01();
            if (abstractC1591090rVTY01 != null) {
                abstractC1591090rVTY01.LJJIJIIJIL("SHOP_MALL");
            }
            C1440005kM.LIZ(new C1564680qos(12));
            MixMallTabRefreshAssem mixMallTabRefreshAssem = this.LLILLL;
            EnumC1303770k23 enumC1303770k23 = EnumC1303770k23.SHOP_TAB;
            this.LL = 1;
            if (mixMallTabRefreshAssem.ko(enumC1303770k23, this) == objLJFF) {
                C1C7U.LIZIZ("MixMallTabRefreshAssem@7e11.playShopTabRefreshAnim$1$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MixMallTabRefreshAssem@7e11.playShopTabRefreshAnim$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
