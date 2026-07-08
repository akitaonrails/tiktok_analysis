package X;

import com.ss.android.ugc.aweme.business.common.dc.SkylightCacheCleanupScheduler;

/* JADX INFO: renamed from: X.0Nxs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.business.common.dc.SkylightCacheCleanupScheduler", f = "SkylightCacheCleanupScheduler.kt", l = {129, 134}, m = "cleanupExpiredRowsIfNeeded")
public final class C611020Nxs extends AbstractC23140094w {
    public long LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ SkylightCacheCleanupScheduler LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C611020Nxs(SkylightCacheCleanupScheduler skylightCacheCleanupScheduler, InterfaceC1364105Vn<? super C611020Nxs> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = skylightCacheCleanupScheduler;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SkylightCacheCleanupScheduler@ae1d.cleanupExpiredRowsIfNeeded$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(0L, this);
        C1C7U.LIZIZ("SkylightCacheCleanupScheduler@ae1d.cleanupExpiredRowsIfNeeded$1");
        return objLIZ;
    }
}
