package X;

/* JADX INFO: renamed from: X.0NPz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tab.tabclean.TabMemoryCleanManager", f = "TabMemoryCleanManager.kt", l = {321, 325, 339, 358, 361, 376}, m = "cleanTab")
public final class C593610NPz extends AbstractC23140094w {
    public EnumC593570NPv LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public C1591190rVd LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C1591140rVY LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C593610NPz(C1591140rVY c1591140rVY, InterfaceC1364105Vn<? super C593610NPz> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = c1591140rVY;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("TabMemoryCleanManager@af6d.cleanTab$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLIZ.LIZLLL(null, this);
        C1C7U.LIZIZ("TabMemoryCleanManager@af6d.cleanTab$1");
        return objLIZLLL;
    }
}
