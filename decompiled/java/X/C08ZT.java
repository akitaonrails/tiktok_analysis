package X;

import com.ss.android.ugc.aweme.ecommerce.resource.EcomResourceBystander;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.ShopChunkResponse;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08ZT, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.showcase.mix.viewmodel.StoreMixViewModel$parseApiData$1", f = "StoreMixViewModel.kt", l = {}, m = "invokeSuspend")
public final class C08ZT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ShopChunkResponse LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08ZT(ShopChunkResponse shopChunkResponse, InterfaceC1364105Vn<? super C08ZT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = shopChunkResponse;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C08ZT(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoreMixViewModel@2837.parseApiData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(C1741890vQh.LJIIIIZZ(this.LL));
        EcomResourceBystander.LIZ.getClass();
        EcomResourceBystander.LJIILLIIL(mapLJIIJ, "/api/shop/v1/homepage/first_screen/bff/get", null, null, null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoreMixViewModel@2837.parseApiData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
