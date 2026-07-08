package X;

/* JADX INFO: renamed from: X.0ri5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.skylight.platform.ActiveStatusSkylightFetcher", f = "ActiveStatusSkylightFetcher.kt", l = {126}, m = "fetch")
public final class C1598910ri5 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1598840rhy LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1598910ri5(C1598840rhy c1598840rhy, InterfaceC1364105Vn<? super C1598910ri5> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1598840rhy;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ActiveStatusSkylightFetcher@76a5.fetch$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLJJLI.LIZJ(null, this);
        C1C7U.LIZIZ("ActiveStatusSkylightFetcher@76a5.fetch$1");
        return objLIZJ;
    }
}
