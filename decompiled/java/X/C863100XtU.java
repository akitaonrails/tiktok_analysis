package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XtU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.base.BaseCustomDiskCache$cleanJournalIfNeeded$1", f = "BaseCustomDiskCache.kt", l = {}, m = "invokeSuspend")
public final class C863100XtU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C13T3 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C863100XtU(C13T3 c13t3, InterfaceC1364105Vn<? super C863100XtU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c13t3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C863100XtU(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseCustomDiskCache@90d9.cleanJournalIfNeeded$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AnonymousClass0956 anonymousClass0956 = this.LL.LJIIIIZZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C13T3 c13t3 = this.LL;
        c13t3.LJIIIIZZ = C23250099c.LIZLLL(c13t3.LJII, null, null, new C863110XtV(c13t3, null), 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseCustomDiskCache@90d9.cleanJournalIfNeeded$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
