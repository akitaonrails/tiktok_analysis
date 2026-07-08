package X;

/* JADX INFO: renamed from: X.0Jcv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.profile.dao.LiveProfileRepositoryForAudience", f = "LiveProfileRepositoryForAudience.kt", l = {121}, m = "awaitRequest")
public final class C496110Jcv extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C496050Jcp LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C496110Jcv(C496050Jcp c496050Jcp, InterfaceC1364105Vn<? super C496110Jcv> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c496050Jcp;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveProfileRepositoryForAudience@66ce.awaitRequest$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLJJLI.LIZLLL(null, this);
        C1C7U.LIZIZ("LiveProfileRepositoryForAudience@66ce.awaitRequest$1");
        return objLIZLLL;
    }
}
