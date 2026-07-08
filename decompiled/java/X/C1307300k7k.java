package X;

/* JADX INFO: renamed from: X.0k7k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.bytedance.android.starship.engine.graph.scheduling.SerialScheduler", f = "SerialScheduler.kt", l = {160}, m = "unload")
public final class C1307300k7k extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public InterfaceC1307210k7b LLILLL;
    public long LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C1307280k7i LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1307300k7k(C1307280k7i c1307280k7i, InterfaceC1364105Vn<? super C1307300k7k> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c1307280k7i;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Exception {
        C1C7U.LIZ("SerialScheduler@9e09.unload$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLJIIIZ = this.LLILZLL.LJIIIZ(null, this);
        C1C7U.LIZIZ("SerialScheduler@9e09.unload$1");
        return objLJIIIZ;
    }
}
