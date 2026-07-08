package X;

import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallMixAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wBk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallMixAssem$loadCacheData$2", f = "ShopMallMixAssem.kt", l = {593}, m = "invokeSuspend")
public final class C1771060wBk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ShopMallMixAssem LLILLJJLI;
    public final /* synthetic */ C1771590wCb LLILLL;
    public final /* synthetic */ Function2<Boolean, Boolean, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1771060wBk(ShopMallMixAssem shopMallMixAssem, C1771590wCb c1771590wCb, Function2<? super Boolean, ? super Boolean, Unit> function2, InterfaceC1364105Vn<? super C1771060wBk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = shopMallMixAssem;
        this.LLILLL = c1771590wCb;
        this.LLILZ = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1771060wBk(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShopMallMixAssem@a45d.loadCacheData$2");
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
            AbstractC1771170wBv abstractC1771170wBvNo = this.LLILLJJLI.No(this.LLILLL);
            this.LLILZ.invoke(Boolean.valueOf(abstractC1771170wBvNo instanceof C1771140wBs), false);
            ShopMallMixAssem.So(abstractC1771170wBvNo, this.LLILLJJLI.Lo().globalContext, this.LLILLJJLI.Lo().LLILLL);
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C1771070wBl c1771070wBl = new C1771070wBl(this.LLILLJJLI, abstractC1771170wBvNo, this.LLILLL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c1771070wBl) == objLJFF) {
                C1C7U.LIZIZ("ShopMallMixAssem@a45d.loadCacheData$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShopMallMixAssem@a45d.loadCacheData$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
