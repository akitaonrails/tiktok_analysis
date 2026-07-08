package X;

/* JADX INFO: renamed from: X.03bh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.backup.BackupPaymentFlowCoordinator", f = "BackupPaymentFlowCoordinator.kt", l = {918}, m = "fetchRemotePageData")
public final class C876703bh extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C875203bS LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C876703bh(C875203bS c875203bS, InterfaceC1364105Vn<? super C876703bh> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c875203bS;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BackupPaymentFlowCoordinator@88b3.fetchRemotePageData$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLJJLI.LIZLLL(null, this);
        C1C7U.LIZIZ("BackupPaymentFlowCoordinator@88b3.fetchRemotePageData$1");
        return objLIZLLL;
    }
}
