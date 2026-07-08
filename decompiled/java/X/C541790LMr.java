package X;

import com.ss.android.ugc.aweme.aigc.asynctask.CreationDownloadTaskInput;

/* JADX INFO: renamed from: X.0LMr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.aicreation.childtask.AICreationDownloadListTask", f = "AICreationDownloadListTask.kt", l = {366, 380}, m = "beginTask")
public final class C541790LMr extends AbstractC23140094w {
    public CreationDownloadTaskInput LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C541740LMm LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C541790LMr(C541740LMm c541740LMm, InterfaceC1364105Vn<? super C541790LMr> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c541740LMm;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AICreationDownloadListTask@242.beginTask$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJJLIIL = this.LLILLL.LJJJLIIL(null, this);
        C1C7U.LIZIZ("AICreationDownloadListTask@242.beginTask$1");
        return objLJJJLIIL;
    }
}
