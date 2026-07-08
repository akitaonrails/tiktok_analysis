package X;

/* JADX INFO: renamed from: X.0YFy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.stranger.DefaultMessageRequestManager", f = "DefaultMessageRequestManager.kt", l = {251}, m = "handleMessageRequestDataUpdate")
public final class C871280YFy extends AbstractC23140094w {
    public long LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C871200YFq LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C871280YFy(C871200YFq c871200YFq, InterfaceC1364105Vn<? super C871280YFy> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c871200YFq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultMessageRequestManager@9541.handleMessageRequestDataUpdate$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJI = this.LLILLL.LJJI(this);
        C1C7U.LIZIZ("DefaultMessageRequestManager@9541.handleMessageRequestDataUpdate$1");
        return objLJJI;
    }
}
