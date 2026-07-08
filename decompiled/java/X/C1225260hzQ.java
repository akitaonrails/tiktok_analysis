package X;

/* JADX INFO: renamed from: X.0hzQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.newselector.template.selectstar.LocalConvSearchDataSourceProtocol", f = "LocalConvSearchDataSourceProtocol.kt", l = {37}, m = "onSearch")
public final class C1225260hzQ extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1225250hzP LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1225260hzQ(C1225250hzP c1225250hzP, InterfaceC1364105Vn<? super C1225260hzQ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1225250hzP;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LocalConvSearchDataSourceProtocol@9a34.onSearch$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJIIZ = this.LLILLJJLI.LJJIIZ(null, this);
        C1C7U.LIZIZ("LocalConvSearchDataSourceProtocol@9a34.onSearch$1");
        return objLJJIIZ;
    }
}
