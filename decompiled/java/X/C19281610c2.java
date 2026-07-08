package X;

/* JADX INFO: renamed from: X.10c2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.tiktok.kmp.eventbus.SharedEventManager", f = "SharedEventManager.kt", l = {145, 149}, m = "safeHandle")
public final class C19281610c2 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C19281310bz LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19281610c2(C19281310bz c19281310bz, InterfaceC1364105Vn<? super C19281610c2> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c19281310bz;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SharedEventManager@12aa.safeHandle$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLJJLI.LIZLLL(null, null, this);
        C1C7U.LIZIZ("SharedEventManager@12aa.safeHandle$1");
        return objLIZLLL;
    }
}
