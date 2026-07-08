package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Iif, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.lynx.hybrid.LynxTemplateTool$preloadTemplate$1", f = "LynxTemplateTool.kt", l = {}, m = "invokeSuspend")
public final class C474190Iif extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Runnable LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C474190Iif(Runnable runnable, InterfaceC1364105Vn<? super C474190Iif> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = runnable;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C474190Iif(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LynxTemplateTool@e279.preloadTemplate$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.run();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LynxTemplateTool@e279.preloadTemplate$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
