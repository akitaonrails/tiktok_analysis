package X;

import com.bytedance.android.starship.engine.graph.foundation.Task;

/* JADX INFO: renamed from: X.0k7n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.bytedance.android.starship.engine.graph.scheduling.SerialScheduler", f = "SerialScheduler.kt", l = {410}, m = "postExecution")
public final class C1307330k7n extends AbstractC23140094w {
    public Task LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1307280k7i LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1307330k7n(C1307280k7i c1307280k7i, InterfaceC1364105Vn<? super C1307330k7n> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1307280k7i;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SerialScheduler@9e09.postExecution$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLL.LIZLLL(null, this);
        C1C7U.LIZIZ("SerialScheduler@9e09.postExecution$1");
        return objLIZLLL;
    }
}
