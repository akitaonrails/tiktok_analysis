package X;

import com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.global.AIGCWorkflowConfig;

/* JADX INFO: renamed from: X.0Lrw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.plugin.AIGCWorkflowBaseTracker", f = "AIGCWorkflowBaseTracker.kt", l = {210}, m = "trackTaskCancel")
public final class C556380Lrw extends AbstractC23140094w {
    public Object LL;
    public AIGCWorkflowConfig LLILLJJLI;
    public long LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ AbstractC556310Lrp LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C556380Lrw(AbstractC556310Lrp abstractC556310Lrp, InterfaceC1364105Vn<? super C556380Lrw> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = abstractC556310Lrp;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCWorkflowBaseTracker@ac32.trackTaskCancel$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJIIL = this.LLILZIL.LJIIL(null, 0L, null, null, this);
        C1C7U.LIZIZ("AIGCWorkflowBaseTracker@ac32.trackTaskCancel$1");
        return objLJIIL;
    }
}
