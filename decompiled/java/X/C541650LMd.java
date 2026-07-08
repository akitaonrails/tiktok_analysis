package X;

import com.ss.android.ugc.aweme.aigc.asynctask.AIGCServerTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.DownloadItemResult;

/* JADX INFO: renamed from: X.0LMd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.CreationDownloadListTask", f = "CreationDownloadListTask.kt", l = {45, 51, 60, 75, 133, 134, 152, 175, 176, 194, 217, 218}, m = "run")
public final class C541650LMd extends AbstractC23140094w {
    public Object LL;
    public int[] LLILLJJLI;
    public C118300cf LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public AIGCServerTaskOutput LLIZ;
    public DownloadItemResult LLIZLLLIL;
    public C259800zU LLJ;
    public /* synthetic */ Object LLJI;
    public final /* synthetic */ C541640LMc LLJIJIL;
    public int LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C541650LMd(C541640LMc c541640LMc, InterfaceC1364105Vn<? super C541650LMd> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJIJIL = c541640LMc;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreationDownloadListTask@ec02.run$1");
        this.LLJI = obj;
        this.LLJILJIL |= Integer.MIN_VALUE;
        Object objLJFF = this.LLJIJIL.LJFF(null, this);
        C1C7U.LIZIZ("CreationDownloadListTask@ec02.run$1");
        return objLJFF;
    }
}
