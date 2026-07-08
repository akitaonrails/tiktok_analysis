package X;

import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallMixAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wBl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallMixAssem$loadCacheData$2$1", f = "ShopMallMixAssem.kt", l = {}, m = "invokeSuspend")
public final class C1771070wBl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ShopMallMixAssem LL;
    public final /* synthetic */ AbstractC1771170wBv LLILLJJLI;
    public final /* synthetic */ C1771590wCb LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1771070wBl(ShopMallMixAssem shopMallMixAssem, AbstractC1771170wBv abstractC1771170wBv, C1771590wCb c1771590wCb, InterfaceC1364105Vn<? super C1771070wBl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = shopMallMixAssem;
        this.LLILLJJLI = abstractC1771170wBv;
        this.LLILLL = c1771590wCb;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1771070wBl(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShopMallMixAssem@a45d.loadCacheData$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.Zo(this.LLILLJJLI, this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShopMallMixAssem@a45d.loadCacheData$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
