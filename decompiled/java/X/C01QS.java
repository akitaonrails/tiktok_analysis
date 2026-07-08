package X;

/* JADX INFO: renamed from: X.01QS, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.utils.BulletinExposerManager", f = "BulletinExposerManager.kt", l = {73}, m = "fetchBulletinListExpose")
public final class C01QS extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0OLA LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01QS(C0OLA c0ola, InterfaceC1364105Vn<? super C01QS> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0ola;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinExposerManager@fd9b.fetchBulletinListExpose$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(false, this);
        C1C7U.LIZIZ("BulletinExposerManager@fd9b.fetchBulletinListExpose$1");
        return objLIZ;
    }
}
