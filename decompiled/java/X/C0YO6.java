package X;

/* JADX INFO: renamed from: X.0YO6, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.statusmessages.DefaultStatusMessagesReceivingCompletenessUseCase", f = "DefaultStatusMessagesReceivingCompletenessUseCase.kt", l = {48}, m = "checkStatusMessages-bMdYcbs")
public final class C0YO6 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0YO4 LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YO6(C0YO4 c0yo4, InterfaceC1364105Vn<? super C0YO6> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0yo4;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DefaultStatusMessagesReceivingCompletenessUseCase@20f5.checkStatusMessages$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(0, 0L, 0L, 0, null, null, this);
        if (objLIZ == C099R.LJFF()) {
            C1C7U.LIZIZ("DefaultStatusMessagesReceivingCompletenessUseCase@20f5.checkStatusMessages$1");
            return objLIZ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZ);
        C1C7U.LIZIZ("DefaultStatusMessagesReceivingCompletenessUseCase@20f5.checkStatusMessages$1");
        return c189200o6M1boximpl;
    }
}
