package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.059g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.auth.ui.login.BaseLoginView$setupRegionChangedListener$2$onChange$1", f = "BaseLoginView.kt", l = {}, m = "invokeSuspend")
public final class C13062059g extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractC19309710gZ LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13062059g(AbstractC19309710gZ abstractC19309710gZ, InterfaceC1364105Vn<? super C13062059g> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractC19309710gZ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C13062059g(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseLoginView@3f6e.setupRegionChangedListener$2$onChange$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJFF();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseLoginView@3f6e.setupRegionChangedListener$2$onChange$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
