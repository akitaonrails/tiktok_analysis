package X;

/* JADX INFO: renamed from: X.01Un, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.performance.TakoABPreloadHelper", f = "TakoABPreloadHelper.kt", l = {920}, m = "executePhaseInParallel")
public final class C342301Un extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C342201Um LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C342301Un(C342201Um c342201Um, InterfaceC1364105Vn<? super C342301Un> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c342201Um;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoABPreloadHelper@c9ee.executePhaseInParallel$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, 0, null, this);
        C1C7U.LIZIZ("TakoABPreloadHelper@c9ee.executePhaseInParallel$1");
        return objLIZ;
    }
}
