package X;

/* JADX INFO: renamed from: X.0Z0C, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tars.impl.TarsPipeLine", f = "TarsPipeLine.kt", l = {284, 295}, m = "preloadResourceAsync")
public final class C0Z0C extends AbstractC23140094w {
    public C099F LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0Z0A LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Z0C(C0Z0A c0z0a, InterfaceC1364105Vn<? super C0Z0C> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0z0a;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("TarsPipeLine@e947.preloadResourceAsync$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJ = this.LLILLL.LJ(null, this);
        C1C7U.LIZIZ("TarsPipeLine@e947.preloadResourceAsync$1");
        return objLJ;
    }
}
