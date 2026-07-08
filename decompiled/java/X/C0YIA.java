package X;

import com.bytedance.im.core.proto.Request;

/* JADX INFO: renamed from: X.0YIA, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.fetcher.DefaultRemoteFetcher", f = "DefaultRemoteFetcher.kt", l = {149, 154, 166, 171, 176, 182, 192, 196, 208, 223, 234, 239, 244}, m = "fetch")
public final class C0YIA extends AbstractC23140094w {
    public Object LL;
    public Request LLILLJJLI;
    public Object LLILLL;
    public C871820YIa LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C0YI6 LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YIA(C0YI6 c0yi6, InterfaceC1364105Vn<? super C0YIA> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c0yi6;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("DefaultRemoteFetcher@8679.fetch$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLLLIILIL = this.LLILZLL.LLLIILIL(null, false, this);
        C1C7U.LIZIZ("DefaultRemoteFetcher@8679.fetch$1");
        return objLLLIILIL;
    }
}
