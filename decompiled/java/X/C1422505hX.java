package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05hX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.page.mix.container.repo.MixSearchCacheUtil$preloadCache$1$1", f = "MixSearchCacheUtil.kt", l = {}, m = "invokeSuspend")
public final class C1422505hX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1422405hW>, Object> {
    public final /* synthetic */ C677540Qhs LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1422505hX(C677540Qhs c677540Qhs, InterfaceC1364105Vn<? super C1422505hX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c677540Qhs;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1422505hX(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MixSearchCacheUtil@d925.preloadCache$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1422805ha c1422805ha = C1422805ha.LIZ;
        C677540Qhs c677540Qhs = this.LL;
        c1422805ha.getClass();
        C1422405hW c1422405hWLIZIZ = C1422805ha.LIZIZ(c677540Qhs);
        C1422805ha.LIZLLL = c1422405hWLIZIZ;
        C1422805ha.LJ = true;
        C1C7U.LIZIZ("MixSearchCacheUtil@d925.preloadCache$1$1");
        return c1422405hWLIZIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1422405hW> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
