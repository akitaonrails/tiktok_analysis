package X;

import X.C09JG;
import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;

/* JADX INFO: renamed from: X.0LSI, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.aicreation.infra.AbstractAICreationChildTask", f = "AbstractAICreationChildTask.kt", l = {65}, m = "mobTaskStart$suspendImpl")
public final class C0LSI<IN extends C09JG, OUT extends AbsTaskOutput> extends AbstractC23140094w {
    public C0LSD LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0LSD<IN, OUT> LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0LSI(C0LSD<? super IN, ? extends OUT> c0lsd, InterfaceC1364105Vn<? super C0LSI> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0lsd;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AbstractAICreationChildTask@bc6d.mobTaskStart$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJJJZI = C0LSD.LJJJJZI(this.LLILLL, this);
        C1C7U.LIZIZ("AbstractAICreationChildTask@bc6d.mobTaskStart$1");
        return objLJJJJZI;
    }
}
