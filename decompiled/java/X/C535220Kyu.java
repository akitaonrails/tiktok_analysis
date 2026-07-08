package X;

/* JADX INFO: renamed from: X.0Kyu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.aicontent.aiself.AiSelfContentDataSource", f = "AiSelfContentDataSource.kt", l = {134, 148}, m = "shouldRequest")
public final class C535220Kyu extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C535210Kyt LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C535220Kyu(C535210Kyt c535210Kyt, InterfaceC1364105Vn<? super C535220Kyu> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c535210Kyt;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AiSelfContentDataSource@b1a8.shouldRequest$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLJJLI.LIZJ(false, this);
        C1C7U.LIZIZ("AiSelfContentDataSource@b1a8.shouldRequest$1");
        return objLIZJ;
    }
}
