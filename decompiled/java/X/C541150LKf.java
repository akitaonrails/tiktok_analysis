package X;

import com.ss.android.ugc.aweme.aigc.asynctask.AutoCutServerTaskInput;

/* JADX INFO: renamed from: X.0LKf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.AutoCut2MAETask", f = "AutoCut2MAETask.kt", l = {250, 260, 264, 267}, m = "stepLoopProgress")
public final class C541150LKf extends AbstractC23140094w {
    public AutoCutServerTaskInput LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C541110LKb LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C541150LKf(C541110LKb c541110LKb, InterfaceC1364105Vn<? super C541150LKf> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c541110LKb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AutoCut2MAETask@5514.stepLoopProgress$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJJJZ = this.LLILZ.LJJJZ(null, this);
        C1C7U.LIZIZ("AutoCut2MAETask@5514.stepLoopProgress$1");
        return objLJJJZ;
    }
}
