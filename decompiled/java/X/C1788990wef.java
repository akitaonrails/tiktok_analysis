package X;

/* JADX INFO: renamed from: X.0wef, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.iap.arch.action.ActionRetryExtKt$retryWith$1", f = "ActionRetryExt.kt", l = {64, 69}, m = "perform")
public final class C1788990wef extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public boolean LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C1788980wee LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1788990wef(C1788980wee c1788980wee, InterfaceC1364105Vn<? super C1788990wef> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c1788980wee;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("ActionRetryExtKt@2786.retryWith$1$perform$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZLL.LIZ(null, this);
        C1C7U.LIZIZ("ActionRetryExtKt@2786.retryWith$1$perform$1");
        return objLIZ;
    }
}
