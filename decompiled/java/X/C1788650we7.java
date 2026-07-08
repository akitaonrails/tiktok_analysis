package X;

/* JADX INFO: renamed from: X.0we7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.iap.arch.action.ActionRetryExtKt$retry$1", f = "ActionRetryExt.kt", l = {14}, m = "perform")
public final class C1788650we7 extends AbstractC23140094w {
    public Object LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C1788640we6 LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1788650we7(C1788640we6 c1788640we6, InterfaceC1364105Vn<? super C1788650we7> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c1788640we6;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ActionRetryExtKt@2786.retry$1$perform$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZ.LIZ(null, this);
        C1C7U.LIZIZ("ActionRetryExtKt@2786.retry$1$perform$1");
        return objLIZ;
    }
}
