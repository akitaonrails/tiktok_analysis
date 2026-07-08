package X;

/* JADX INFO: renamed from: X.0OJm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.utils.periodic.BulletinSubscribePeriodicHandler", f = "BulletinSubscribePeriodicHandler.kt", l = {116}, m = "fetchBulletinEvents")
public final class C617400OJm extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C617360OJi LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C617400OJm(C617360OJi c617360OJi, InterfaceC1364105Vn<? super C617400OJm> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c617360OJi;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinSubscribePeriodicHandler@f270.fetchBulletinEvents$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(this);
        C1C7U.LIZIZ("BulletinSubscribePeriodicHandler@f270.fetchBulletinEvents$1");
        return objLIZIZ;
    }
}
