package X;

/* JADX INFO: renamed from: X.0YRI, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.messagegap.resolve.queue.MessageGapWorkQueue", f = "MessageGapWorkQueue.kt", l = {48}, m = "enqueueMsgList")
public final class C0YRI extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0YRG LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YRI(C0YRG c0yrg, InterfaceC1364105Vn<? super C0YRI> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0yrg;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageGapWorkQueue@91a0.enqueueMsgList$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, this);
        C1C7U.LIZIZ("MessageGapWorkQueue@91a0.enqueueMsgList$1");
        return objLIZ;
    }
}
