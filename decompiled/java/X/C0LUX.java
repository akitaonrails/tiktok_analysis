package X;

import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;

/* JADX INFO: renamed from: X.0LUX, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.aicreation.childtask.AICreationServerTask", f = "AICreationServerTask.kt", l = {71, DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE, 75, 76, 78}, m = "run")
public final class C0LUX extends AbstractC23140094w {
    public C09JG LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0LUW LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LUX(C0LUW c0luw, InterfaceC1364105Vn<? super C0LUX> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0luw;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AICreationServerTask@593.run$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILLL.LJFF(null, this);
        C1C7U.LIZIZ("AICreationServerTask@593.run$1");
        return objLJFF;
    }
}
