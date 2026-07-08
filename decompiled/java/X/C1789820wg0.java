package X;

/* JADX INFO: renamed from: X.0wg0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.iap.core.query.action.GetNextAvailableSkusAction", f = "GetNextAvailableSkusAction.kt", l = {44}, m = "perform")
public final class C1789820wg0 extends AbstractC23140094w {
    public C1789850wg3 LL;
    public long LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C1789810wfz LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1789820wg0(C1789810wfz c1789810wfz, InterfaceC1364105Vn<? super C1789820wg0> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c1789810wfz;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GetNextAvailableSkusAction@7131.perform$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZ.LIZ(null, this);
        C1C7U.LIZIZ("GetNextAvailableSkusAction@7131.perform$1");
        return objLIZ;
    }
}
