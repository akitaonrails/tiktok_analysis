package X;

import com.bytedance.android.starship.engine.graph.foundation.Task;

/* JADX INFO: renamed from: X.0k7o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.bytedance.android.starship.engine.graph.scheduling.SerialScheduler", f = "SerialScheduler.kt", l = {439}, m = "postExecutionFailed")
public final class C1307340k7o extends AbstractC23140094w {
    public Task LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1307280k7i LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1307340k7o(C1307280k7i c1307280k7i, InterfaceC1364105Vn<? super C1307340k7o> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1307280k7i;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SerialScheduler@9e09.postExecutionFailed$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJII = this.LLILLL.LJII(null, this);
        C1C7U.LIZIZ("SerialScheduler@9e09.postExecutionFailed$1");
        return objLJII;
    }
}
