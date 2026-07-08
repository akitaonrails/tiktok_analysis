package X;

/* JADX INFO: renamed from: X.0e0V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.auth.fb.FacebookRepositoryImpl", f = "FacebookRepositoryImpl.kt", l = {41}, m = "sync")
public final class C1072170e0V extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1072160e0U LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1072170e0V(C1072160e0U c1072160e0U, InterfaceC1364105Vn<? super C1072170e0V> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1072160e0U;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FacebookRepositoryImpl@c461.sync$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(null, this);
        C1C7U.LIZIZ("FacebookRepositoryImpl@c461.sync$1");
        return objLIZIZ;
    }
}
