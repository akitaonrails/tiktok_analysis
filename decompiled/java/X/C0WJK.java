package X;

import com.ss.android.ugc.aweme.tools.draft.migratedraft.MigrateDraftService;

/* JADX INFO: renamed from: X.0WJK, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.migratedraft.MigrateDraftService", f = "MigrateDraftService.kt", l = {207, 211}, m = "migratePublicFiles")
public final class C0WJK extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ MigrateDraftService LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0WJK(MigrateDraftService migrateDraftService, InterfaceC1364105Vn<? super C0WJK> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = migrateDraftService;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MigrateDraftService@b006.migratePublicFiles$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, null, null, this);
        C1C7U.LIZIZ("MigrateDraftService@b006.migratePublicFiles$1");
        return objLIZ;
    }
}
