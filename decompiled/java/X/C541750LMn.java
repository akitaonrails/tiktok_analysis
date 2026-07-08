package X;

import com.ss.android.ugc.aweme.aigc.asynctask.AIGCServerTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.DownloadItemResult;

/* JADX INFO: renamed from: X.0LMn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.aicreation.childtask.AICreationDownloadListTask", f = "AICreationDownloadListTask.kt", l = {60, 66, 75, 92, 138, 156, 182, 199, 223, 224}, m = "run")
public final class C541750LMn extends AbstractC23140094w {
    public Object LL;
    public int[] LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public AIGCServerTaskOutput LLILZIL;
    public DownloadItemResult LLILZLL;
    public int LLIZ;
    public /* synthetic */ Object LLIZLLLIL;
    public final /* synthetic */ C541740LMm LLJ;
    public int LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C541750LMn(C541740LMm c541740LMm, InterfaceC1364105Vn<? super C541750LMn> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJ = c541740LMm;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AICreationDownloadListTask@242.run$1");
        this.LLIZLLLIL = obj;
        this.LLJI |= Integer.MIN_VALUE;
        Object objLJFF = this.LLJ.LJFF(null, this);
        C1C7U.LIZIZ("AICreationDownloadListTask@242.run$1");
        return objLJFF;
    }
}
