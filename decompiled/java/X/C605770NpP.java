package X;

/* JADX INFO: renamed from: X.0NpP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.edit.cover.manager.framework.TaskScheduler", f = "TaskScheduler.kt", l = {174}, m = "processScheduling")
public final class C605770NpP extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C20179013xU LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C605770NpP(C20179013xU c20179013xU, InterfaceC1364105Vn<? super C605770NpP> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c20179013xU;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("TaskScheduler@23c5.processScheduling$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLJJLI.LIZLLL(this);
        C1C7U.LIZIZ("TaskScheduler@23c5.processScheduling$1");
        return objLIZLLL;
    }
}
