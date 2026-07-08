package X;

import com.ss.android.ugc.aweme.ecommerce.resource.EcomResourceBystander;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08ZS, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.showcase.mix.view.StoreMixTabFragment$transformResponse$1$2", f = "StoreMixTabFragment.kt", l = {}, m = "invokeSuspend")
public final class C08ZS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ArrayList<Object> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08ZS(ArrayList<Object> arrayList, InterfaceC1364105Vn<? super C08ZS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = arrayList;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C08ZS(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoreMixTabFragment@acc7.transformResponse$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EcomResourceBystander ecomResourceBystander = EcomResourceBystander.LIZ;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("data", this.LL));
        ecomResourceBystander.getClass();
        EcomResourceBystander.LJIILLIIL(mapLJIIJ, "/api/shop/v1/homepage/first_screen/bff/get", null, null, null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoreMixTabFragment@acc7.transformResponse$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
