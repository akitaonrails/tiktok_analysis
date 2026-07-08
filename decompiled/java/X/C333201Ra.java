package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Ra, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.entitycard.api.SearchEntityCardCacheManager$get$2$2", f = "SearchEntityCardCacheManager.kt", l = {}, m = "invokeSuspend")
public final class C333201Ra extends C09AX implements Function2<InterfaceC346201Wa<? extends C0O7A<C628380Okm>>, InterfaceC1364105Vn<? super InterfaceC346201Wa<? extends C0O7A<C628380Okm>>>, Object> {
    public /* synthetic */ Object LL;

    public C333201Ra(InterfaceC1364105Vn<? super C333201Ra> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C333201Ra c333201Ra = new C333201Ra(interfaceC1364105Vn);
        c333201Ra.LL = obj;
        return c333201Ra;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchEntityCardCacheManager@717d.get$2$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Object obj2 = this.LL;
        C1C7U.LIZIZ("SearchEntityCardCacheManager@717d.get$2$2");
        return obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346201Wa<? extends C0O7A<C628380Okm>> interfaceC346201Wa, InterfaceC1364105Vn<? super InterfaceC346201Wa<? extends C0O7A<C628380Okm>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC346201Wa, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
