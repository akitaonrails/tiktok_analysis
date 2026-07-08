package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS392S0200000_26;
import njp.a;

/* JADX INFO: renamed from: X.0vP4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.perf.preload.PdpPreloadMgr$renderCache$1$2", f = "PdpPreloadMgr.kt", l = {}, m = "invokeSuspend")
public final class C1740880vP4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1749710vdJ LL;
    public final /* synthetic */ ProductPackStruct LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1740880vP4(C1749710vdJ c1749710vdJ, ProductPackStruct productPackStruct, InterfaceC1364105Vn<? super C1740880vP4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1749710vdJ;
        this.LLILLJJLI = productPackStruct;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1740880vP4(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PdpPreloadMgr@12da.renderCache$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1749710vdJ c1749710vdJ = this.LL;
        c1749710vdJ.LIZ.iR2(new AwS392S0200000_26(c1749710vdJ, this.LLILLJJLI, 0));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PdpPreloadMgr@12da.renderCache$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
