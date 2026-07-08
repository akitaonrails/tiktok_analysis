package X;

/* JADX INFO: renamed from: X.0iyh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.usercard.source.MafUserPagingSource", f = "MafUserPagingSource.kt", l = {151, 151, 154}, m = "loadWithUpdate")
public final class C1263250iyh extends AbstractC23140094w {
    public C1263330iyp LL;
    public C1263190iyb LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C1263110iyT LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1263250iyh(C1263110iyT c1263110iyT, InterfaceC1364105Vn<? super C1263250iyh> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c1263110iyT;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MafUserPagingSource@b859.loadWithUpdate$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJ = this.LLILZ.LJ(null, this);
        C1C7U.LIZIZ("MafUserPagingSource@b859.loadWithUpdate$1");
        return objLJ;
    }
}
