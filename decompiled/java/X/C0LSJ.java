package X;

import X.C09JG;
import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;

/* JADX INFO: renamed from: X.0LSJ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.aicreation.infra.AbstractAICreationParentWrapTask", f = "AbstractAICreationParentWrapTask.kt", l = {141}, m = "mobTaskStart$suspendImpl")
public final class C0LSJ<IN extends C09JG, OUT extends AbsTaskOutput> extends AbstractC23140094w {
    public C0LSC LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0LSC<IN, OUT> LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0LSJ(C0LSC<? super IN, ? extends OUT> c0lsc, InterfaceC1364105Vn<? super C0LSJ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0lsc;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AbstractAICreationParentWrapTask@b2cb.mobTaskStart$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJL = C0LSC.LJL(this.LLILLL, this);
        C1C7U.LIZIZ("AbstractAICreationParentWrapTask@b2cb.mobTaskStart$1");
        return objLJL;
    }
}
