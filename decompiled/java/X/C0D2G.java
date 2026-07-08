package X;

/* JADX INFO: renamed from: X.0D2G, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.im.core.client.DefaultSendMessageQueue", f = "DefaultSendMessageQueue.kt", l = {104, 105}, m = "getNetworkResult")
public final class C0D2G extends AbstractC23140094w {
    public C0D2H LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0D2I<Object> LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D2G(C0D2I<Object> c0d2i, InterfaceC1364105Vn<? super C0D2G> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0d2i;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("DefaultSendMessageQueue@501f.getNetworkResult$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLL.LIZIZ(null, null, null, this);
        C1C7U.LIZIZ("DefaultSendMessageQueue@501f.getNetworkResult$1");
        return objLIZIZ;
    }
}
