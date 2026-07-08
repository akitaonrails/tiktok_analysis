package X;

import com.bytedance.ies.im.core.opt.FetchMessagesWorker;

/* JADX INFO: renamed from: X.0YMP, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.ies.im.core.opt.FetchMessagesWorker", f = "FetchMessagesWorker.kt", l = {108, 132}, m = "doWork")
public final class C0YMP extends AbstractC23140094w {
    public C0YHX LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ FetchMessagesWorker LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YMP(FetchMessagesWorker fetchMessagesWorker, InterfaceC1364105Vn<? super C0YMP> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = fetchMessagesWorker;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FetchMessagesWorker@ca47.doWork$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJII = this.LLILLL.LJII(this);
        C1C7U.LIZIZ("FetchMessagesWorker@ca47.doWork$1");
        return objLJII;
    }
}
