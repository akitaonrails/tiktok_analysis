package X;

/* JADX INFO: renamed from: X.0OHr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.utils.periodic.BulletinPreloadManager", f = "BulletinItemListPeriodicRequestHandler.kt", l = {91, 101}, m = "preloadItemListAndSave")
public final class C616930OHr extends AbstractC23140094w {
    public Object LL;
    public C616940OHs LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C616920OHq LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C616930OHr(C616920OHq c616920OHq, InterfaceC1364105Vn<? super C616930OHr> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c616920OHq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinPreloadManager@b35c.preloadItemListAndSave$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZ.LIZ(null, this);
        C1C7U.LIZIZ("BulletinPreloadManager@b35c.preloadItemListAndSave$1");
        return objLIZ;
    }
}
