package X;

/* JADX INFO: renamed from: X.0NPx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tab.tabclean.TabMemoryCleanManager", f = "TabMemoryCleanManager.kt", l = {633}, m = "onCleanEnd")
public final class C593590NPx extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1591140rVY LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C593590NPx(C1591140rVY c1591140rVY, InterfaceC1364105Vn<? super C593590NPx> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1591140rVY;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("TabMemoryCleanManager@af6d.onCleanEnd$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJII = this.LLILLJJLI.LJII(0, null, this);
        C1C7U.LIZIZ("TabMemoryCleanManager@af6d.onCleanEnd$1");
        return objLJII;
    }
}
