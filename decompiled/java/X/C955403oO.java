package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.03oO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.core.engine.PageTemplateManger$loadTemplate$2", f = "PageTemplateManger.kt", l = {}, m = "invokeSuspend")
public final class C955403oO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C955403oO(InterfaceC1364105Vn<? super C955403oO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C955403oO(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PageTemplateManger@d473.loadTemplate$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AnonymousClass0408.LIZ.getClass();
        AnonymousClass0408.LIZIZ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PageTemplateManger@d473.loadTemplate$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C955403oO(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
