package X;

import com.ss.android.ugc.aweme.aigc.asynctask.I2VServerTaskInput;

/* JADX INFO: renamed from: X.0LVv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.EditorProT2ITask", f = "EditorProT2ITask.kt", l = {190, 201, 205, 208}, m = "stepLoopProgress")
public final class C544170LVv extends AbstractC23140094w {
    public I2VServerTaskInput LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C543990LVd LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C544170LVv(C543990LVd c543990LVd, InterfaceC1364105Vn<? super C544170LVv> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c543990LVd;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditorProT2ITask@3dc4.stepLoopProgress$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJJJLIIL = this.LLILZ.LJJJLIIL(null, this);
        C1C7U.LIZIZ("EditorProT2ITask@3dc4.stepLoopProgress$1");
        return objLJJJLIIL;
    }
}
