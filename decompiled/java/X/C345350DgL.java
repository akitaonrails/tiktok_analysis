package X;

/* JADX INFO: renamed from: X.0DgL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.album.nextstep.interceptor.LegacyTaskBridgeInterceptor", f = "LegacyTaskBridgeInterceptor.kt", l = {44, 51, 57}, m = "intercept")
public final class C345350DgL extends AbstractC23140094w {
    public Object LL;
    public InterfaceC2495009q8 LLILLJJLI;
    public long LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C345340DgK LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C345350DgL(C345340DgK c345340DgK, InterfaceC1364105Vn<? super C345350DgL> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c345340DgK;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LegacyTaskBridgeInterceptor@278c.intercept$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJLIIIL = this.LLILZIL.LJLIIIL(null, null, this);
        C1C7U.LIZIZ("LegacyTaskBridgeInterceptor@278c.intercept$1");
        return objLJLIIIL;
    }
}
