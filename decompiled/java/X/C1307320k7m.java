package X;

import com.bytedance.android.starship.engine.graph.foundation.Task;

/* JADX INFO: renamed from: X.0k7m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.bytedance.android.starship.engine.graph.scheduling.SerialScheduler", f = "SerialScheduler.kt", l = {325, 331, 364, 365}, m = "process")
public final class C1307320k7m extends AbstractC23140094w {
    public InterfaceC497601wk LL;
    public Task LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C1307280k7i LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1307320k7m(C1307280k7i c1307280k7i, InterfaceC1364105Vn<? super C1307320k7m> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c1307280k7i;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SerialScheduler@9e09.process$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJIIIIZZ = this.LLILZ.LJIIIIZZ(null, this);
        C1C7U.LIZIZ("SerialScheduler@9e09.process$1");
        return objLJIIIIZZ;
    }
}
