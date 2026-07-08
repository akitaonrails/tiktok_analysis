package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H2R, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.ECBillboardContentView$startAutoSliding$1", f = "ECBillboardContentView.kt", l = {}, m = "invokeSuspend")
public final class C0H2R extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1733010vCN LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H2R(C1733010vCN c1733010vCN, InterfaceC1364105Vn<? super C0H2R> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1733010vCN;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0H2R c0h2r = new C0H2R(this.LLILLJJLI, interfaceC1364105Vn);
        c0h2r.LL = obj;
        return c0h2r;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECBillboardContentView@5ff7.startAutoSliding$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        C1733010vCN c1733010vCN = this.LLILLJJLI;
        c1733010vCN.LLJILJIL = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C435100H4i(c1733010vCN, null), 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECBillboardContentView@5ff7.startAutoSliding$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
