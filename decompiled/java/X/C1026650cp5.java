package X;

/* JADX INFO: renamed from: X.0cp5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.router.api.commonapi.CRouterBaseProcessor", f = "CRouterBaseProcessor.kt", l = {69, 90}, m = "intercept")
public final class C1026650cp5 extends AbstractC23140094w {
    public InterfaceC1026710cpB LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AbstractC1026640cp4<AbstractC1026880cpS> LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1026650cp5(AbstractC1026640cp4<AbstractC1026880cpS> abstractC1026640cp4, InterfaceC1364105Vn<? super C1026650cp5> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = abstractC1026640cp4;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CRouterBaseProcessor@f4e5.intercept$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLL.LIZIZ(null, this);
        C1C7U.LIZIZ("CRouterBaseProcessor@f4e5.intercept$1");
        return objLIZIZ;
    }
}
