package X;

import X.C09JG;
import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;

/* JADX INFO: renamed from: X.0LSG, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.aicreation.infra.AbstractAICreationChildTask", f = "AbstractAICreationChildTask.kt", l = {77}, m = "mobTaskResult$suspendImpl")
public final class C0LSG<IN extends C09JG, OUT extends AbsTaskOutput> extends AbstractC23140094w {
    public C0LSD LL;
    public boolean LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C0LSD<IN, OUT> LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0LSG(C0LSD<? super IN, ? extends OUT> c0lsd, InterfaceC1364105Vn<? super C0LSG> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c0lsd;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AbstractAICreationChildTask@bc6d.mobTaskResult$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJJJJZ = C0LSD.LJJJJZ(this.LLILZ, false, this);
        C1C7U.LIZIZ("AbstractAICreationChildTask@bc6d.mobTaskResult$1");
        return objLJJJJZ;
    }
}
