package X;

/* JADX INFO: renamed from: X.0YFw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.stranger.DefaultMessageRequestManager", f = "DefaultMessageRequestManager.kt", l = {595}, m = "getConvMapWithoutMuteOrBlock")
public final class C871260YFw extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C871200YFq LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C871260YFw(C871200YFq c871200YFq, InterfaceC1364105Vn<? super C871260YFw> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = c871200YFq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultMessageRequestManager@9541.getConvMapWithoutMuteOrBlock$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objLJIL = this.LLIZ.LJIL(null, null, this);
        C1C7U.LIZIZ("DefaultMessageRequestManager@9541.getConvMapWithoutMuteOrBlock$1");
        return objLJIL;
    }
}
