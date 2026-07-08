package X;

import org.json.JSONException;

/* JADX INFO: renamed from: X.0Z0U, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tars.impl.TarsPipelineExecution", f = "TarsPipelineExecution.kt", l = {148}, m = "subscribeByCoroutine")
public final class C0Z0U extends AbstractC23140094w {
    public C882890YkJ LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0Z0P LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Z0U(C0Z0P c0z0p, InterfaceC1364105Vn<? super C0Z0U> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0z0p;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("TarsPipelineExecution@e84c.subscribeByCoroutine$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILLL.LJFF(null, this);
        C1C7U.LIZIZ("TarsPipelineExecution@e84c.subscribeByCoroutine$1");
        return objLJFF;
    }
}
