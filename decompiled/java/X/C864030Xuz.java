package X;

/* JADX INFO: renamed from: X.0Xuz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.retry.RetryRequestOperationDelegate", f = "RetryRequestOperationDelegate.kt", l = {49}, m = "runRequest")
public final class C864030Xuz extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C864020Xuy LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C864030Xuz(C864020Xuy c864020Xuy, InterfaceC1364105Vn<? super C864030Xuz> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c864020Xuy;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RetryRequestOperationDelegate@606f.runRequest$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, null, 0, null, this);
        C1C7U.LIZIZ("RetryRequestOperationDelegate@606f.runRequest$1");
        return objLIZ;
    }
}
