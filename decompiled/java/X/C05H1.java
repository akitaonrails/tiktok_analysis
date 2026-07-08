package X;

/* JADX INFO: renamed from: X.05H1, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.landing.LandMallProtocol$Companion", f = "LandMallProtocol.kt", l = {181, 182}, m = "awaitLandingGet")
public final class C05H1 extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C05H2 LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05H1(C05H2 c05h2, InterfaceC1364105Vn<? super C05H1> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c05h2;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LandMallProtocol$Companion@47b7.awaitLandingGet$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(this);
        C1C7U.LIZIZ("LandMallProtocol$Companion@47b7.awaitLandingGet$1");
        return objLIZ;
    }
}
