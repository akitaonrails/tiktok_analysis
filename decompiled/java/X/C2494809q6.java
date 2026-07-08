package X;

/* JADX INFO: renamed from: X.09q6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.album.nextstep.interceptor.Check4KVideoInterceptor", f = "Check4KVideoInterceptor.kt", l = {44, 48, 51, 53, 57, 61}, m = "intercept")
public final class C2494809q6 extends AbstractC23140094w {
    public C525700KjY LL;
    public InterfaceC2495009q8 LLILLJJLI;
    public Object LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C2494909q7 LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2494809q6(C2494909q7 c2494909q7, InterfaceC1364105Vn<? super C2494809q6> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c2494909q7;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("Check4KVideoInterceptor@473b.intercept$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJLIIIL = this.LLILZIL.LJLIIIL(null, null, this);
        C1C7U.LIZIZ("Check4KVideoInterceptor@473b.intercept$1");
        return objLJLIIIL;
    }
}
