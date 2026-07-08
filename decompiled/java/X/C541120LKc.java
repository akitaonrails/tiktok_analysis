package X;

/* JADX INFO: renamed from: X.0LKc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.AutoCut2MAETask", f = "AutoCut2MAETask.kt", l = {100, 101, 105, 121, 122, 123, 124}, m = "run")
public final class C541120LKc extends AbstractC23140094w {
    public C09JG LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C541110LKb LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C541120LKc(C541110LKb c541110LKb, InterfaceC1364105Vn<? super C541120LKc> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c541110LKb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AutoCut2MAETask@5514.run$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILLL.LJFF(null, this);
        C1C7U.LIZIZ("AutoCut2MAETask@5514.run$1");
        return objLJFF;
    }
}
