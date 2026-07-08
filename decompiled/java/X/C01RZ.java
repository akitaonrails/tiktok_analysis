package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01RZ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.entitycard.api.SearchEntityCardCacheManager$request$2", f = "SearchEntityCardCacheManager.kt", l = {}, m = "invokeSuspend")
public final class C01RZ extends C09AX implements Function2<C0O7A<C628380Okm>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ Function2<C0O7A<C628380Okm>, Boolean, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C01RZ(Function2<? super C0O7A<C628380Okm>, ? super Boolean, Unit> function2, InterfaceC1364105Vn<? super C01RZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C01RZ c01rz = new C01RZ(this.LLILLJJLI, interfaceC1364105Vn);
        c01rz.LL = obj;
        return c01rz;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchEntityCardCacheManager@717d.request$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LLILLJJLI.invoke((C0O7A<C628380Okm>) this.LL, false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchEntityCardCacheManager@717d.request$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C0O7A<C628380Okm> c0o7a, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c0o7a, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
