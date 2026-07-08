package X;

/* JADX INFO: renamed from: X.0pa4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.proto.hybrid.def.GeckoPbDefinitionsProvider", f = "GeckoPbDefinitionsProvider.kt", l = {49}, m = "awaitSafely")
public final class C1517060pa4 extends AbstractC23140094w {
    public Object LL;
    public AnonymousClass0957 LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C1517030pa1 LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1517060pa4(C1517030pa1 c1517030pa1, InterfaceC1364105Vn<? super C1517060pa4> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c1517030pa1;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GeckoPbDefinitionsProvider@7922.awaitSafely$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILZ.LIZIZ(null, this, null);
        C1C7U.LIZIZ("GeckoPbDefinitionsProvider@7922.awaitSafely$1");
        return objLIZIZ;
    }
}
