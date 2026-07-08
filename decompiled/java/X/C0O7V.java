package X;

import Y.AgS75S0400000_9;

/* JADX INFO: renamed from: X.0O7V, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.bytedance.mota.queue.PQSupervisor$PendingQueue$enqueueOp$1$2$1", f = "PQSupervisor.kt", l = {234, 134, 140, 146, 148}, m = "emit")
public final class C0O7V extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public C0O7X LLILLL;
    public InterfaceC346701Wf LLILZ;
    public C0O76 LLILZIL;
    public C1DEV LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ AgS75S0400000_9<T> LLIZLLLIL;
    public int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0O7V(AgS75S0400000_9<? super T> agS75S0400000_9, InterfaceC1364105Vn<? super C0O7V> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZLLLIL = agS75S0400000_9;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("PQSupervisor$PendingQueue@9082.enqueueOp$1$2$1$emit$1");
        this.LLIZ = obj;
        this.LLJ |= Integer.MIN_VALUE;
        Object objLIZ$0 = this.LLIZLLLIL.LIZ$0(null, this);
        C1C7U.LIZIZ("PQSupervisor$PendingQueue@9082.enqueueOp$1$2$1$emit$1");
        return objLIZ$0;
    }
}
