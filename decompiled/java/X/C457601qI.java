package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01qI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.subscription.pgc.api.status.FlowExtKt$collectIn$1$1", f = "FlowExt.kt", l = {}, m = "invokeSuspend")
public final class C457601qI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ InterfaceC346201Wa<Object> LLILLJJLI;
    public final /* synthetic */ Function2<Object, InterfaceC1364105Vn<? super Unit>, Object> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C457601qI(InterfaceC346201Wa interfaceC346201Wa, InterfaceC1364105Vn interfaceC1364105Vn, Function2 function2) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC346201Wa;
        this.LLILLL = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C457601qI c457601qI = new C457601qI(this.LLILLJJLI, interfaceC1364105Vn, this.LLILLL);
        c457601qI.LL = obj;
        return c457601qI;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FlowExtKt@560a.collectIn$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C23250099c.LIZLLL((InterfaceC497601wk) this.LL, null, null, new C457701qJ(this.LLILLJJLI, null, this.LLILLL), 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FlowExtKt@560a.collectIn$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
