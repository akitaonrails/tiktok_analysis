package X;

/* JADX INFO: renamed from: X.0k0e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "androidx.core.telecom.CallsManager", f = "CallsManager.kt", l = {568}, m = "pauseExecutionUntilCallIsReadyOrTimeout$core_telecom_release")
public final class C1302900k0e extends AbstractC23140094w {
    public C05XL LL;
    public C1302870k0b LLILLJJLI;
    public C259800zU LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C1302860k0a LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1302900k0e(C1302860k0a c1302860k0a, InterfaceC1364105Vn<? super C1302900k0e> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c1302860k0a;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        return this.LLILZIL.LIZJ(null, null, null, this);
    }
}
