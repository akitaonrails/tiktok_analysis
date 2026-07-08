package X;

/* JADX INFO: renamed from: X.0OJn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.utils.periodic.BulletinSubscribePeriodicRequestManager$OwnerConfig", f = "BulletinSubscribePeriodicRequestManager.kt", l = {179}, m = "fetchBulletinEvents")
public final class C617410OJn extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C617390OJl LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C617410OJn(C617390OJl c617390OJl, InterfaceC1364105Vn<? super C617410OJn> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c617390OJl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinSubscribePeriodicRequestManager$OwnerConfig@d979.fetchBulletinEvents$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(this);
        C1C7U.LIZIZ("BulletinSubscribePeriodicRequestManager$OwnerConfig@d979.fetchBulletinEvents$1");
        return objLIZIZ;
    }
}
