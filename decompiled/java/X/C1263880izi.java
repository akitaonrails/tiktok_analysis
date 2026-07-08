package X;

/* JADX INFO: renamed from: X.0izi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.repo.MaFUserRepository", f = "MaFUserRepository.kt", l = {41}, m = "loadInner")
public final class C1263880izi extends AbstractC23140094w {
    public C1263870izh LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1263860izg LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1263880izi(C1263860izg c1263860izg, InterfaceC1364105Vn<? super C1263880izi> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1263860izg;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MaFUserRepository@f903.loadInner$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJI = this.LLILLL.LJI(null, this);
        C1C7U.LIZIZ("MaFUserRepository@f903.loadInner$1");
        return objLJI;
    }
}
