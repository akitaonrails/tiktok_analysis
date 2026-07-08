package X;

import X.C09JG;
import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;

/* JADX INFO: renamed from: X.0LTS, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.AbsTask", f = "AbsTask.kt", l = {79}, m = "setTaskInfo$suspendImpl")
public final class C0LTS<IN extends C09JG, OUT extends AbsTaskOutput> extends AbstractC23140094w {
    public C0LTN LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0LTN<IN, OUT> LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0LTS(C0LTN<? super IN, ? extends OUT> c0ltn, InterfaceC1364105Vn<? super C0LTS> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0ltn;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AbsTask@769c.setTaskInfo$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJJ = C0LTN.LJJJ(this.LLILLL, null, this);
        C1C7U.LIZIZ("AbsTask@769c.setTaskInfo$1");
        return objLJJJ;
    }
}
