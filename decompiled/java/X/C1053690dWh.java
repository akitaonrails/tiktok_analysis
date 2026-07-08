package X;

/* JADX INFO: renamed from: X.0dWh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.history.AdWebHistoryRepository", f = "AdWebHistoryRepository.kt", l = {57}, m = "loadHistoryFromServer")
public final class C1053690dWh extends AbstractC23140094w {
    public long LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1053650dWd LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1053690dWh(C1053650dWd c1053650dWd, InterfaceC1364105Vn<? super C1053690dWh> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1053650dWd;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AdWebHistoryRepository@2657.loadHistoryFromServer$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLL.LIZJ(0L, this);
        C1C7U.LIZIZ("AdWebHistoryRepository@2657.loadHistoryFromServer$1");
        return objLIZJ;
    }
}
