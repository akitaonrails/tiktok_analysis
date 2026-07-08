package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.10h0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.auth.factory.ComposePagerSignupManager$updateComposePager$1$2$1$1", f = "ComposePagerSignupManager.kt", l = {}, m = "invokeSuspend")
public final class C19312410h0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C19311910gv LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19312410h0(C19311910gv c19311910gv, InterfaceC1364105Vn<? super C19312410h0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c19311910gv;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C19312410h0(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ComposePagerSignupManager@c5c3.updateComposePager$1$2$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C19311910gv c19311910gv = this.LL;
        c19311910gv.LJIILLIIL(c19311910gv.LJJ());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ComposePagerSignupManager@c5c3.updateComposePager$1$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
