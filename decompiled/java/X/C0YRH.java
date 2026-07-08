package X;

/* JADX INFO: renamed from: X.0YRH, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.messagegap.resolve.queue.MessageGapWorkQueue", f = "MessageGapWorkQueue.kt", l = {87, 64}, m = "start")
public final class C0YRH extends AbstractC23140094w {
    public AnonymousClass0954 LL;
    public InterfaceC824740WWy LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C0YRG LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YRH(C0YRG c0yrg, InterfaceC1364105Vn<? super C0YRH> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c0yrg;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageGapWorkQueue@91a0.start$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILZ.LIZIZ(this);
        C1C7U.LIZIZ("MessageGapWorkQueue@91a0.start$1");
        return objLIZIZ;
    }
}
