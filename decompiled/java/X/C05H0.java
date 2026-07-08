package X;

/* JADX INFO: renamed from: X.05H0, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.landing.LandMallProtocol$Companion", f = "LandMallProtocol.kt", l = {192}, m = "awaitLandingUpdate")
public final class C05H0 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C05H2 LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05H0(C05H2 c05h2, InterfaceC1364105Vn<? super C05H0> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c05h2;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LandMallProtocol$Companion@47b7.awaitLandingUpdate$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(0, this);
        C1C7U.LIZIZ("LandMallProtocol$Companion@47b7.awaitLandingUpdate$1");
        return objLIZIZ;
    }
}
