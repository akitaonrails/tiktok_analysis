package X;

/* JADX INFO: renamed from: X.0iyk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.usercard.source.MafUserPagingSource", f = "MafUserPagingSource.kt", l = {375}, m = "fetch")
public final class C1263280iyk extends AbstractC23140094w {
    public C1263190iyb LL;
    public long LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C1263110iyT LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1263280iyk(C1263110iyT c1263110iyT, InterfaceC1364105Vn<? super C1263280iyk> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c1263110iyT;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MafUserPagingSource@b859.fetch$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZ.LIZ(null, this);
        C1C7U.LIZIZ("MafUserPagingSource@b859.fetch$1");
        return objLIZ;
    }
}
