package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NFR, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.component.ReachBottomCachePoolDelegate$getCache$1", f = "ReachBottomCachePoolDelegate.kt", l = {}, m = "invokeSuspend")
public final class C0NFR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0NEK LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NFR(C0NEK c0nek, InterfaceC1364105Vn<? super C0NFR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0nek;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NFR(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ReachBottomCachePoolDelegate@e62e.getCache$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZ(new C591480NHu(false, (C0NHH) null, "no cache available", 8));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ReachBottomCachePoolDelegate@e62e.getCache$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
