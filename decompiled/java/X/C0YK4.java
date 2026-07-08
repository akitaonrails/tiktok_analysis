package X;

/* JADX INFO: renamed from: X.0YK4, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.receivebuffer.SingleInboxMessageReceiveBuffer", f = "SingleInboxMessageReceiveBuffer.kt", l = {214}, m = "processGetMsgByUserItem-gIAlu-s")
public final class C0YK4 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C872150YJh LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YK4(C872150YJh c872150YJh, InterfaceC1364105Vn<? super C0YK4> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c872150YJh;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("SingleInboxMessageReceiveBuffer@ad98.processGetMsgByUserItem$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLJJLI.LIZJ(null, this);
        if (objLIZJ == C099R.LJFF()) {
            C1C7U.LIZIZ("SingleInboxMessageReceiveBuffer@ad98.processGetMsgByUserItem$1");
            return objLIZJ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZJ);
        C1C7U.LIZIZ("SingleInboxMessageReceiveBuffer@ad98.processGetMsgByUserItem$1");
        return c189200o6M1boximpl;
    }
}
