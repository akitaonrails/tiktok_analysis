package X;

import com.ss.android.ugc.aweme.tools.draft.migratedraft.MigrateDraftService;

/* JADX INFO: renamed from: X.0WJN, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.migratedraft.MigrateDraftService", f = "MigrateDraftService.kt", l = {221}, m = "runAMEDraftMigrate")
public final class C0WJN extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ MigrateDraftService LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0WJN(MigrateDraftService migrateDraftService, InterfaceC1364105Vn<? super C0WJN> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = migrateDraftService;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MigrateDraftService@b006.runAMEDraftMigrate$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLJJLI.LIZJ(this);
        C1C7U.LIZIZ("MigrateDraftService@b006.runAMEDraftMigrate$1");
        return objLIZJ;
    }
}
