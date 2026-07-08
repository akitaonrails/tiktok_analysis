package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.057U, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.common.utils.SearchInitTaskHelper$preloadPageClassReflect$1$1", f = "SearchInitTaskHelper.kt", l = {}, m = "invokeSuspend")
public final class C057U extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C057U(InterfaceC1364105Vn<? super C057U> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C057U(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchInitTaskHelper@c7c1.preloadPageClassReflect$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0S78.LIZ(AFwS187S0000000_2.get$arr$(1412), ((Boolean) C2267951Dpp.LIZJ.getValue()).booleanValue());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchInitTaskHelper@c7c1.preloadPageClassReflect$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C057U(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
