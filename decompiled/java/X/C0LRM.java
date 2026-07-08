package X;

import com.ss.android.ugc.aweme.aigc.asynctask.GeneralI2VPostProcessingTaskOutput;

/* JADX INFO: renamed from: X.0LRM, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.GeneralI2VTask", f = "GeneralI2VTask.kt", l = {361, 389, 390, 394}, m = "stepPostProcessing")
public final class C0LRM extends AbstractC23140094w {
    public GeneralI2VPostProcessingTaskOutput LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0LRF LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LRM(C0LRF c0lrf, InterfaceC1364105Vn<? super C0LRM> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0lrf;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GeneralI2VTask@5977.stepPostProcessing$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJJJZ = this.LLILLL.LJJJJZ(this);
        C1C7U.LIZIZ("GeneralI2VTask@5977.stepPostProcessing$1");
        return objLJJJJZ;
    }
}
