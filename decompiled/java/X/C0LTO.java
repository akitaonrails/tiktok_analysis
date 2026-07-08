package X;

import X.C09JG;
import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;

/* JADX INFO: renamed from: X.0LTO, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.AbsTask", f = "AbsTask.kt", l = {139, 141, 142}, m = "runChildTask$suspendImpl")
public final class C0LTO<IN extends C09JG, OUT extends AbsTaskOutput> extends AbstractC23140094w {
    public InterfaceC542770LQl LL;
    public Object LLILLJJLI;
    public C09JG LLILLL;
    public Object LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C0LTN<IN, OUT> LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0LTO(C0LTN<? super IN, ? extends OUT> c0ltn, InterfaceC1364105Vn<? super C0LTO> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c0ltn;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AbsTask@769c.runChildTask$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLJJIL = C0LTN.LJJIL(this.LLILZLL, null, null, this);
        C1C7U.LIZIZ("AbsTask@769c.runChildTask$1");
        return objLJJIL;
    }
}
