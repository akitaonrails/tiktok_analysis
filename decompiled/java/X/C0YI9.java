package X;

import com.bytedance.im.core.proto.Request;

/* JADX INFO: renamed from: X.0YI9, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.fetcher.DefaultRemoteFetcher", f = "DefaultRemoteFetcher.kt", l = {303, 317}, m = "fetchByWs")
public final class C0YI9 extends AbstractC23140094w {
    public C05XL LL;
    public C0YCX LLILLJJLI;
    public C871820YIa LLILLL;
    public Request LLILZ;
    public int LLILZIL;
    public long LLILZLL;
    public long LLIZ;
    public long LLIZLLLIL;
    public /* synthetic */ Object LLJ;
    public final /* synthetic */ C0YI6 LLJI;
    public int LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YI9(C0YI6 c0yi6, InterfaceC1364105Vn<? super C0YI9> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJI = c0yi6;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultRemoteFetcher@8679.fetchByWs$1");
        this.LLJ = obj;
        this.LLJIJIL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLJI.LIZIZ(null, null, null, this);
        C1C7U.LIZIZ("DefaultRemoteFetcher@8679.fetchByWs$1");
        return objLIZIZ;
    }
}
