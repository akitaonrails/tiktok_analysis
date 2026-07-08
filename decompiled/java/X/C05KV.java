package X;

import com.ss.android.ugc.aweme.preload.api.IIMPreloadService;

/* JADX INFO: renamed from: X.05KV, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.service.impl.core.IMUserPreloader", f = "IMUserPreloader.kt", l = {149, 102}, m = "flushBatch")
public final class C05KV extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public IIMPreloadService LLILLL;
    public InterfaceC1335605Ko LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C05KW LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05KV(C05KW c05kw, InterfaceC1364105Vn<? super C05KV> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c05kw;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMUserPreloader@15f4.flushBatch$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILZLL.LIZJ(this);
        C1C7U.LIZIZ("IMUserPreloader@15f4.flushBatch$1");
        return objLIZJ;
    }
}
