package X;

/* JADX INFO: renamed from: X.05n4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.lazyload.GenericLazyLoadRepository", f = "GenericLazyLoadRepository.kt", l = {42, 45, 54, 59, 65, 71}, m = "fetch")
public final class C1456805n4 extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1456705n3 LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1456805n4(C1456705n3 c1456705n3, InterfaceC1364105Vn<? super C1456805n4> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1456705n3;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GenericLazyLoadRepository@3ec6.fetch$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLL.LIZIZ(this);
        C1C7U.LIZIZ("GenericLazyLoadRepository@3ec6.fetch$1");
        return objLIZIZ;
    }
}
