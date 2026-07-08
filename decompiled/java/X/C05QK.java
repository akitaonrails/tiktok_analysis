package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05QK, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.utils.InboxClassPreloadUtil$preloadClass$1", f = "InboxClassPreloadUtil.kt", l = {}, m = "invokeSuspend")
public final class C05QK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C05QK(InterfaceC1364105Vn<? super C05QK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05QK(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InboxClassPreloadUtil@888c.preloadClass$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        System.currentTimeMillis();
        C202079145d.LIZJ(C1BWL.LIZ());
        C202079145d.LIZ("snapboost_list_inbox.txt").LIZIZ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InboxClassPreloadUtil@888c.preloadClass$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C05QK(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
