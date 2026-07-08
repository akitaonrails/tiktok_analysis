package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mpp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.slark.impl.ECViewTracker$onPreDrawListener$1$onPreDraw$2", f = "ECViewTracker.kt", l = {}, m = "invokeSuspend")
public final class C1411510mpp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1413350msn LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1411510mpp(C1413350msn c1413350msn, InterfaceC1364105Vn<? super C1411510mpp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1413350msn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1411510mpp(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECViewTracker@f1ce.onPreDrawListener$1$onPreDraw$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZ();
        this.LL.LJIIIIZZ = null;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECViewTracker@f1ce.onPreDrawListener$1$onPreDraw$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
