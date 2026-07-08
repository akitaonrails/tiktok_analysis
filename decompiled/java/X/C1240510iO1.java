package X;

/* JADX INFO: renamed from: X.0iO1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.searchengine.message.AbstractMessageSearchEngine", f = "AbstractMessageSearchEngine.kt", l = {60}, m = "getSearchResult")
public final class C1240510iO1 extends AbstractC23140094w {
    public long LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AbstractC1240480iNy LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1240510iO1(AbstractC1240480iNy abstractC1240480iNy, InterfaceC1364105Vn<? super C1240510iO1> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = abstractC1240480iNy;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AbstractMessageSearchEngine@4354.getSearchResult$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLL.LIZJ(null, null, null, this);
        C1C7U.LIZIZ("AbstractMessageSearchEngine@4354.getSearchResult$1");
        return objLIZJ;
    }
}
