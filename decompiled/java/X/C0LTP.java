package X;

import X.C09JG;
import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;

/* JADX INFO: renamed from: X.0LTP, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.AbsTask", f = "AbsTask.kt", l = {546, 70}, m = "setTaskInfoSafely$suspendImpl")
public final class C0LTP<IN extends C09JG, OUT extends AbsTaskOutput> extends AbstractC23140094w {
    public Object LL;
    public C0LSZ LLILLJJLI;
    public C1DEV LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C0LTN<IN, OUT> LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0LTP(C0LTN<? super IN, ? extends OUT> c0ltn, InterfaceC1364105Vn<? super C0LTP> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c0ltn;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AbsTask@769c.setTaskInfoSafely$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJJJI = C0LTN.LJJJI(this.LLILZIL, null, this);
        C1C7U.LIZIZ("AbsTask@769c.setTaskInfoSafely$1");
        return objLJJJI;
    }
}
