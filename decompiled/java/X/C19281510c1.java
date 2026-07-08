package X;

/* JADX INFO: renamed from: X.10c1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.tiktok.kmp.eventbus.SharedEventManager", f = "SharedEventManager.kt", l = {125}, m = "processEvent")
public final class C19281510c1 extends AbstractC23140094w {
    public C19280810bu LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C19281310bz LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19281510c1(C19281310bz c19281310bz, InterfaceC1364105Vn<? super C19281510c1> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c19281310bz;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SharedEventManager@12aa.processEvent$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILZ.LIZJ(null, this);
        C1C7U.LIZIZ("SharedEventManager@12aa.processEvent$1");
        return objLIZJ;
    }
}
