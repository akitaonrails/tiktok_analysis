package X;

/* JADX INFO: renamed from: X.0NPw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tab.tabclean.TabMemoryCleanManager", f = "TabMemoryCleanManager.kt", l = {556, 557, 570}, m = "tryIdleClean")
public final class C593580NPw extends AbstractC23140094w {
    public Object LL;
    public C1591190rVd LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C1591140rVY LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C593580NPw(C1591140rVY c1591140rVY, InterfaceC1364105Vn<? super C593580NPw> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c1591140rVY;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TabMemoryCleanManager@af6d.tryIdleClean$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJIIL = this.LLILZ.LJIIL(null, this);
        C1C7U.LIZIZ("TabMemoryCleanManager@af6d.tryIdleClean$1");
        return objLJIIL;
    }
}
