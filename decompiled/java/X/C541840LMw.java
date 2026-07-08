package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0LMw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.experiment.aicreation.AIGCDownloadMock", f = "AIGCDownloadReliabilityExp.kt", l = {254}, m = "applyMockDelayIfNeed")
public final class C541840LMw extends AbstractC23140094w {
    public Function1 LL;
    public long LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C541830LMv LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C541840LMw(C541830LMv c541830LMv, InterfaceC1364105Vn<? super C541840LMw> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c541830LMv;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCDownloadMock@827a.applyMockDelayIfNeed$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZ.LIZ(this, null);
        C1C7U.LIZIZ("AIGCDownloadMock@827a.applyMockDelayIfNeed$1");
        return objLIZ;
    }
}
