package X;

/* JADX INFO: renamed from: X.0Ykq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.ies.im.core.sdk.MainSafeSDKManager", f = "MainSafeSDKManager.kt", l = {407, 295, 308, 326, 337}, m = "refreshSDK")
public final class C883220Ykq extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C883090Ykd LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C883220Ykq(C883090Ykd c883090Ykd, InterfaceC1364105Vn<? super C883220Ykq> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c883090Ykd;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("MainSafeSDKManager@313d.refreshSDK$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJIILIIL = this.LLILZIL.LJIILIIL(null, null, this);
        C1C7U.LIZIZ("MainSafeSDKManager@313d.refreshSDK$1");
        return objLJIILIIL;
    }
}
