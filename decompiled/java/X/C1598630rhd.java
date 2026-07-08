package X;

/* JADX INFO: renamed from: X.0rhd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListCoordinatorRepo", f = "SkylightListCoordinatorRepo.kt", l = {54}, m = "fetchSkylightData")
public final class C1598630rhd extends AbstractC23140094w {
    public C1598490rhP LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1598560rhW LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1598630rhd(C1598560rhW c1598560rhW, InterfaceC1364105Vn<? super C1598630rhd> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1598560rhW;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SkylightListCoordinatorRepo@6240.fetchSkylightData$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, this);
        C1C7U.LIZIZ("SkylightListCoordinatorRepo@6240.fetchSkylightData$1");
        return objLIZ;
    }
}
