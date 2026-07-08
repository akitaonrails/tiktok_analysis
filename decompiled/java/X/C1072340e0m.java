package X;

/* JADX INFO: renamed from: X.0e0m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.auth.contact.ContactRepositoryImpl", f = "ContactRepositoryImpl.kt", l = {19}, m = "sync")
public final class C1072340e0m extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1072330e0l LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1072340e0m(C1072330e0l c1072330e0l, InterfaceC1364105Vn<? super C1072340e0m> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1072330e0l;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ContactRepositoryImpl@59a7.sync$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(null, this);
        C1C7U.LIZIZ("ContactRepositoryImpl@59a7.sync$1");
        return objLIZIZ;
    }
}
