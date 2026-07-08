package X;

import X.C09JG;
import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;

/* JADX INFO: renamed from: X.0LTQ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.AbsTask", f = "AbsTask.kt", l = {201, 203, 206, 209}, m = "store$suspendImpl")
public final class C0LTQ<IN extends C09JG, OUT extends AbsTaskOutput> extends AbstractC23140094w {
    public C0LTN LL;
    public C0LXL LLILLJJLI;
    public Object LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C0LTN<IN, OUT> LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0LTQ(C0LTN<? super IN, ? extends OUT> c0ltn, InterfaceC1364105Vn<? super C0LTQ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c0ltn;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AbsTask@769c.store$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJJJJI = C0LTN.LJJJJI(this.LLILZIL, this);
        C1C7U.LIZIZ("AbsTask@769c.store$1");
        return objLJJJJI;
    }
}
