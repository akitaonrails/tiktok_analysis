package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0PQV, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.general.clicksearch.network.EcClickSearchApiHelper$sendRequest$1$1", f = "EcClickSearchApiHelper.kt", l = {}, m = "invokeSuspend")
public final class C0PQV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ EnumC645610PTz LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Function1<C0PQX, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0PQV(EnumC645610PTz enumC645610PTz, String str, Function1<? super C0PQX, Unit> function1, InterfaceC1364105Vn<? super C0PQV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = enumC645610PTz;
        this.LLILLJJLI = str;
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0PQV(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcClickSearchApiHelper@6a3d.sendRequest$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1202104n5.LIZ().LJJ(this.LL, this.LLILLJJLI, "request", "reuse fetching data", Boolean.TRUE);
        C0PUO c0puo = C0PUO.LIZ;
        Function1<C0PQX, Unit> function1 = this.LLILLL;
        c0puo.getClass();
        if (C0PUO.LIZJ(function1)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("EcClickSearchApiHelper@6a3d.sendRequest$1$1");
            return unit;
        }
        C1202104n5.LIZ().LJJ(this.LL, this.LLILLJJLI, "networkFail", "same request, wait but find no cache data", Boolean.TRUE);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EcClickSearchApiHelper@6a3d.sendRequest$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
