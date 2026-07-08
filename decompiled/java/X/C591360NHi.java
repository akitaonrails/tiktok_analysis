package X;

/* JADX INFO: renamed from: X.0NHi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.ghouse.CacheFetcher$compose$1", f = "CacheFetcher.kt", l = {22, 23}, m = "fetchCache")
public final class C591360NHi extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C591350NHh LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C591360NHi(C591350NHh c591350NHh, InterfaceC1364105Vn<? super C591360NHi> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c591350NHh;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CacheFetcher@7b6e.compose$1$fetchCache$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, this);
        C1C7U.LIZIZ("CacheFetcher@7b6e.compose$1$fetchCache$1");
        return objLIZ;
    }
}
