package X;

/* JADX INFO: renamed from: X.0Ykp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.ies.im.core.sdk.MainSafeSDKManager", f = "MainSafeSDKManager.kt", l = {407}, m = "transition")
public final class C883210Ykp extends AbstractC23140094w {
    public AbstractC883060Yka LL;
    public C1DEV LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C883090Ykd LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C883210Ykp(C883090Ykd c883090Ykd, InterfaceC1364105Vn<? super C883210Ykp> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c883090Ykd;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MainSafeSDKManager@313d.transition$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJIILJJIL = this.LLILZ.LJIILJJIL(null, this);
        C1C7U.LIZIZ("MainSafeSDKManager@313d.transition$1");
        return objLJIILJJIL;
    }
}
