package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0CRr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.middle.preload.SugInputTracker$handleInputDebounce$1", f = "SugInputTracker.kt", l = {}, m = "invokeSuspend")
public final class C313770CRr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C313770CRr(InterfaceC1364105Vn<? super C313770CRr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C313770CRr(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SugInputTracker@89a0.handleInputDebounce$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0QNZ.LIZIZ(0);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SugInputTracker@89a0.handleInputDebounce$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C313770CRr(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
