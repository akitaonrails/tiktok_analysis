package X;

/* JADX INFO: renamed from: X.0Noz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.datacenter.tasks.ListDbLoadTask", f = "ListDbLoadTask.kt", l = {46}, m = "execute")
public final class C605510Noz extends AbstractC23140094w {
    public C605550Np3 LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C605490Nox LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C605510Noz(C605490Nox c605490Nox, InterfaceC1364105Vn<? super C605510Noz> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c605490Nox;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ListDbLoadTask@e21b.execute$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLL.LIZIZ(null, this);
        C1C7U.LIZIZ("ListDbLoadTask@e21b.execute$1");
        return objLIZIZ;
    }
}
