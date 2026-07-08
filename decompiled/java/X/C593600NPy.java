package X;

/* JADX INFO: renamed from: X.0NPy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tab.tabclean.TabMemoryCleanManager", f = "TabMemoryCleanManager.kt", l = {613}, m = "onCleanStart")
public final class C593600NPy extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1591140rVY LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C593600NPy(C1591140rVY c1591140rVY, InterfaceC1364105Vn<? super C593600NPy> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1591140rVY;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("TabMemoryCleanManager@af6d.onCleanStart$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJIIIIZZ = this.LLILLJJLI.LJIIIIZZ(this);
        C1C7U.LIZIZ("TabMemoryCleanManager@af6d.onCleanStart$1");
        return objLJIIIIZZ;
    }
}
