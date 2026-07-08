package X;

/* JADX INFO: renamed from: X.0iyj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.usercard.source.UserCardDataSource", f = "UserCardDataSource.kt", l = {250}, m = "load")
public final class C1263270iyj extends AbstractC23140094w {
    public InterfaceC1263400iyw LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1263080iyQ LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1263270iyj(C1263080iyQ c1263080iyQ, InterfaceC1364105Vn<? super C1263270iyj> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1263080iyQ;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UserCardDataSource@8e56.load$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJIILIIL = this.LLILLL.LJIILIIL(false, null, this);
        C1C7U.LIZIZ("UserCardDataSource@8e56.load$1");
        return objLJIILIIL;
    }
}
