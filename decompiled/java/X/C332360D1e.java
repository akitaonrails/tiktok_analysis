package X;

/* JADX INFO: renamed from: X.0D1e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.im.core.client.DefaultSendMessageQueue", f = "DefaultSendMessageQueue.kt", l = {120, 121}, m = "dispatchRetryNetworkRequest")
public final class C332360D1e extends AbstractC23140094w {
    public InterfaceC824740WWy LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0D2I<Object> LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C332360D1e(C0D2I<Object> c0d2i, InterfaceC1364105Vn<? super C332360D1e> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0d2i;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultSendMessageQueue@501f.dispatchRetryNetworkRequest$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJ = this.LLILLL.LJ(null, this);
        C1C7U.LIZIZ("DefaultSendMessageQueue@501f.dispatchRetryNetworkRequest$1");
        return objLJ;
    }
}
