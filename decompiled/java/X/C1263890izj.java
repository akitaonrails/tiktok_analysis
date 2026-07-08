package X;

/* JADX INFO: renamed from: X.0izj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.repo.MaFUserRepository", f = "MaFUserRepository.kt", l = {86}, m = "dislikeUser")
public final class C1263890izj extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1263860izg LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1263890izj(C1263860izg c1263860izg, InterfaceC1364105Vn<? super C1263890izj> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1263860izg;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MaFUserRepository@f903.dislikeUser$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLJJLI.LIZJ(null, 0, 0, this);
        C1C7U.LIZIZ("MaFUserRepository@f903.dislikeUser$1");
        return objLIZJ;
    }
}
