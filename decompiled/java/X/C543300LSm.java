package X;

import com.ss.android.ugc.aweme.aigc.asynctask.ImagesUploadTaskOutput;

/* JADX INFO: renamed from: X.0LSm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.TransitionFrameTask", f = "TransitionFrameTask.kt", l = {166, 172, 186, 189, 193}, m = "stepServerI2V")
public final class C543300LSm extends AbstractC23140094w {
    public Object LL;
    public ImagesUploadTaskOutput LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C543200LSc LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C543300LSm(C543200LSc c543200LSc, InterfaceC1364105Vn<? super C543300LSm> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c543200LSc;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TransitionFrameTask@2e86.stepServerI2V$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJJJLIIL = this.LLILZ.LJJJLIIL(null, null, this);
        C1C7U.LIZIZ("TransitionFrameTask@2e86.stepServerI2V$1");
        return objLJJJLIIL;
    }
}
