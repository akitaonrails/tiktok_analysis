package X;

import com.ss.android.ugc.aweme.services.draft.MigrateType;
import com.ss.android.ugc.aweme.tools.draft.migratedraft.MigrateDraftService;

/* JADX INFO: renamed from: X.0WJJ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.migratedraft.MigrateDraftService", f = "MigrateDraftService.kt", l = {107, 125, 177, 179, 183}, m = "migrateDraft")
public final class C0WJJ extends AbstractC23140094w {
    public MigrateType LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public Object LLIZ;
    public Object LLIZLLLIL;
    public Object LLJ;
    public long LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public /* synthetic */ Object LLJILLL;
    public final /* synthetic */ MigrateDraftService LLJJ;
    public int LLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0WJJ(MigrateDraftService migrateDraftService, InterfaceC1364105Vn<? super C0WJJ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJJ = migrateDraftService;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("MigrateDraftService@b006.migrateDraft$1");
        this.LLJILLL = obj;
        this.LLJJI |= Integer.MIN_VALUE;
        Object objMigrateDraft = this.LLJJ.migrateDraft(null, null, this);
        C1C7U.LIZIZ("MigrateDraftService@b006.migrateDraft$1");
        return objMigrateDraft;
    }
}
