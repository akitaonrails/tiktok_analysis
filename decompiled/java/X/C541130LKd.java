package X;

import com.ss.android.ugc.aweme.aigc.asynctask.models.AutoCutAgentProgress;

/* JADX INFO: renamed from: X.0LKd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.AutoCut2MAETask", f = "AutoCut2MAETask.kt", l = {615, 636, 650, 654, 664}, m = "handleServerTaskDetail")
public final class C541130LKd extends AbstractC23140094w {
    public AutoCutAgentProgress LL;
    public C541110LKb LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C541110LKb LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C541130LKd(C541110LKb c541110LKb, InterfaceC1364105Vn<? super C541130LKd> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c541110LKb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("AutoCut2MAETask@5514.handleServerTaskDetail$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJJJJZI = this.LLILZIL.LJJJJZI(null, this);
        C1C7U.LIZIZ("AutoCut2MAETask@5514.handleServerTaskDetail$1");
        return objLJJJJZI;
    }
}
