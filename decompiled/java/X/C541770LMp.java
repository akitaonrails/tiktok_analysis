package X;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0LMp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.aicreation.childtask.AICreationDownloadListTask", f = "AICreationDownloadListTask.kt", l = {348, 358, 358}, m = "collectDownload")
public final class C541770LMp extends AbstractC23140094w {
    public int LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Function2 LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C541740LMm LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C541770LMp(C541740LMm c541740LMm, InterfaceC1364105Vn<? super C541770LMp> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = c541740LMm;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AICreationDownloadListTask@242.collectDownload$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objLJJJLL = this.LLIZ.LJJJLL(0, null, null, null, null, this);
        C1C7U.LIZIZ("AICreationDownloadListTask@242.collectDownload$1");
        return objLJJJLL;
    }
}
