package X;

/* JADX INFO: renamed from: X.0Tdp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.usermanage.MuteManager", f = "MuteManager.kt", l = {177}, m = "setMuteDuration")
public final class C751470Tdp extends AbstractC23140094w {
    public C745220TLc LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C751460Tdo LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C751470Tdp(C751460Tdo c751460Tdo, InterfaceC1364105Vn<? super C751470Tdp> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c751460Tdo;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MuteManager@8a97.setMuteDuration$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILLL.LJFF(null, null, this);
        C1C7U.LIZIZ("MuteManager@8a97.setMuteDuration$1");
        return objLJFF;
    }
}
