package X;

/* JADX INFO: renamed from: X.0k7l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.bytedance.android.starship.engine.graph.scheduling.SerialScheduler", f = "SerialScheduler.kt", l = {137}, m = "load")
public final class C1307310k7l extends AbstractC23140094w {
    public Object LL;
    public InterfaceC1307210k7b LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C1307280k7i LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1307310k7l(C1307280k7i c1307280k7i, InterfaceC1364105Vn<? super C1307310k7l> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c1307280k7i;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SerialScheduler@9e09.load$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJIIJJI = this.LLILZ.LJIIJJI(null, null, this);
        C1C7U.LIZIZ("SerialScheduler@9e09.load$1");
        return objLJIIJJI;
    }
}
