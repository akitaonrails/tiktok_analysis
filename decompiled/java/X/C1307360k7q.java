package X;

/* JADX INFO: renamed from: X.0k7q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.bytedance.android.starship.engine.graph.scheduling.SerialScheduler", f = "SerialScheduler.kt", l = {220}, m = "stop")
public final class C1307360k7q extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1307280k7i LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1307360k7q(C1307280k7i c1307280k7i, InterfaceC1364105Vn<? super C1307360k7q> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1307280k7i;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SerialScheduler@9e09.stop$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(this);
        C1C7U.LIZIZ("SerialScheduler@9e09.stop$1");
        return objLIZIZ;
    }
}
