package X;

import X.C09JG;
import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;

/* JADX INFO: renamed from: X.0LTR, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.AbsTask", f = "AbsTask.kt", l = {501}, m = "mobTaskResult$suspendImpl")
public final class C0LTR<IN extends C09JG, OUT extends AbsTaskOutput> extends AbstractC23140094w {
    public C0LTN LL;
    public boolean LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C0LTN<IN, OUT> LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0LTR(C0LTN<? super IN, ? extends OUT> c0ltn, InterfaceC1364105Vn<? super C0LTR> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c0ltn;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AbsTask@769c.mobTaskResult$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJJIJIIJI = C0LTN.LJJIJIIJI(this.LLILZ, false, this);
        C1C7U.LIZIZ("AbsTask@769c.mobTaskResult$1");
        return objLJJIJIIJI;
    }
}
