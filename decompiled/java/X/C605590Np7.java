package X;

/* JADX INFO: renamed from: X.0Np7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.datacenter.TaskScheduler", f = "TaskScheduler.kt", l = {215, 232}, m = "waitForActivation")
public final class C605590Np7 extends AbstractC23140094w {
    public Object LL;
    public AbstractC605420Noq LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C605550Np3 LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C605590Np7(C605550Np3 c605550Np3, InterfaceC1364105Vn<? super C605590Np7> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c605550Np3;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TaskScheduler@5940.waitForActivation$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILZ.LJFF(null, null, this);
        C1C7U.LIZIZ("TaskScheduler@5940.waitForActivation$1");
        return objLJFF;
    }
}
