package X;

/* JADX INFO: renamed from: X.0YCF, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.repair.completeness.commandmessage.StatusMessageCompletenessUseCase", f = "StatusMessageCompletenessUseCase.kt", l = {189}, m = "executeReceivingCompletenessCheck-hUnOzRk")
public final class C0YCF extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0YCE LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YCF(C0YCE c0yce, InterfaceC1364105Vn<? super C0YCF> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0yce;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StatusMessageCompletenessUseCase@b25f.executeReceivingCompletenessCheck$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(0L, 0L, null, 0, null, this);
        if (objLIZ == C099R.LJFF()) {
            C1C7U.LIZIZ("StatusMessageCompletenessUseCase@b25f.executeReceivingCompletenessCheck$1");
            return objLIZ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZ);
        C1C7U.LIZIZ("StatusMessageCompletenessUseCase@b25f.executeReceivingCompletenessCheck$1");
        return c189200o6M1boximpl;
    }
}
