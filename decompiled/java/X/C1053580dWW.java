package X;

/* JADX INFO: renamed from: X.0dWW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.history.AdWebHistoryManager", f = "AdWebHistoryManager.kt", l = {60}, m = "loadFirstPageFromLocal")
public final class C1053580dWW extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1053550dWT LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1053580dWW(C1053550dWT c1053550dWT, InterfaceC1364105Vn<? super C1053580dWW> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1053550dWT;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AdWebHistoryManager@40b0.loadFirstPageFromLocal$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILLL.LJFF(this);
        C1C7U.LIZIZ("AdWebHistoryManager@40b0.loadFirstPageFromLocal$1");
        return objLJFF;
    }
}
