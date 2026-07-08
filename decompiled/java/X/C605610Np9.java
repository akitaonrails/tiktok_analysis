package X;

/* JADX INFO: renamed from: X.0Np9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.datacenter.TaskScheduler", f = "TaskScheduler.kt", l = {138, 160}, m = "runTask")
public final class C605610Np9 extends AbstractC23140094w {
    public Object LL;
    public AbstractC605390Non LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C605550Np3 LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C605610Np9(C605550Np3 c605550Np3, InterfaceC1364105Vn<? super C605610Np9> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c605550Np3;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TaskScheduler@5940.runTask$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILZ.LIZJ(null, null, this);
        C1C7U.LIZIZ("TaskScheduler@5940.runTask$1");
        return objLIZJ;
    }
}
