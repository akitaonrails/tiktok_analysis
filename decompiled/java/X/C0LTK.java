package X;

import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;

/* JADX INFO: renamed from: X.0LTK, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.RefreshFrameTask", f = "RefreshFrameTask.kt", l = {71, DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE}, m = "run")
public final class C0LTK extends AbstractC23140094w {
    public C0LSB LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0LTJ LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LTK(C0LTJ c0ltj, InterfaceC1364105Vn<? super C0LTK> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0ltj;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("RefreshFrameTask@9a30.run$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILLL.LJFF(null, this);
        C1C7U.LIZIZ("RefreshFrameTask@9a30.run$1");
        return objLJFF;
    }
}
