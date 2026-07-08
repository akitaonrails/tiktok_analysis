package X;

/* JADX INFO: renamed from: X.0YTc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.ies.im.core.send.MessageTask", f = "MessageTask.kt", l = {405}, m = "prepareMsgList$imsdk_wrapper_release")
public final class C874700YTc extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0YTZ LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C874700YTc(C0YTZ c0ytz, InterfaceC1364105Vn<? super C874700YTc> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0ytz;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageTask@276.prepareMsgList$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJII = this.LLILLL.LJII(this);
        C1C7U.LIZIZ("MessageTask@276.prepareMsgList$1");
        return objLJII;
    }
}
