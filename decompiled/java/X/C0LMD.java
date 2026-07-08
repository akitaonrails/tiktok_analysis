package X;

import com.ss.android.ugc.aweme.aigc.asynctask.SaveDraftTaskInput;

/* JADX INFO: renamed from: X.0LMD, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.aicreation.childtask.AICreationSaveDraftTask", f = "AICreationSaveDraftTask.kt", l = {58, 70}, m = "beginTask")
public final class C0LMD extends AbstractC23140094w {
    public SaveDraftTaskInput LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0LMB LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LMD(C0LMB c0lmb, InterfaceC1364105Vn<? super C0LMD> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0lmb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AICreationSaveDraftTask@c95e.beginTask$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJJLIIL = this.LLILLL.LJJJLIIL(null, this);
        C1C7U.LIZIZ("AICreationSaveDraftTask@c95e.beginTask$1");
        return objLJJJLIIL;
    }
}
