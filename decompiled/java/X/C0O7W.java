package X;

/* JADX INFO: renamed from: X.0O7W, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.bytedance.mota.queue.PQSupervisor$PendingQueue", f = "PQSupervisor.kt", l = {234}, m = "processQueue")
public final class C0O7W extends AbstractC23140094w {
    public C1DEV LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0O7T LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0O7W(C0O7T c0o7t, InterfaceC1364105Vn<? super C0O7W> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0o7t;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PQSupervisor$PendingQueue@9082.processQueue$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLL.LIZIZ(this);
        C1C7U.LIZIZ("PQSupervisor$PendingQueue@9082.processQueue$1");
        return objLIZIZ;
    }
}
