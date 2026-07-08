package X;

import com.ss.android.ugc.aweme.aigc.asynctask.experiment.aicreation.AIGCDownloadRetryExp;
import com.ss.android.ugc.aweme.aigc.asynctask.experiment.aicreation.AIGCDownloadTimeoutExp;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0LMo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.aicreation.childtask.AICreationDownloadListTask", f = "AICreationDownloadListTask.kt", l = {274, 282, 307}, m = "downloadFileWithRetry")
public final class C541760LMo extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Function2 LLILZ;
    public AIGCDownloadRetryExp.AIGCDownloadRetryConfig LLILZIL;
    public AIGCDownloadTimeoutExp.AIGCDownloadTimeoutConfig LLILZLL;
    public Object LLIZ;
    public C118300cf LLIZLLLIL;
    public int LLJ;
    public long LLJI;
    public /* synthetic */ Object LLJIJIL;
    public final /* synthetic */ C541740LMm LLJILJIL;
    public int LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C541760LMo(C541740LMm c541740LMm, InterfaceC1364105Vn<? super C541760LMo> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJILJIL = c541740LMm;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AICreationDownloadListTask@242.downloadFileWithRetry$1");
        this.LLJIJIL = obj;
        this.LLJILJILJ |= Integer.MIN_VALUE;
        Object objLJJJLZIJ = this.LLJILJIL.LJJJLZIJ(null, null, null, null, this);
        C1C7U.LIZIZ("AICreationDownloadListTask@242.downloadFileWithRetry$1");
        return objLJJJLZIJ;
    }
}
