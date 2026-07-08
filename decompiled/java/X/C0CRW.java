package X;

import com.ss.android.ugc.aweme.services.draft.IMigrateDraftService;
import com.ss.android.ugc.aweme.services.draft.MigrateType;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CRW, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ugc.M2MigrationBaseViewHolder$startMigrateDrafts$1", f = "M2MigrationBaseViewHolder.kt", l = {75}, m = "invokeSuspend")
public final class C0CRW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0M6M LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CRW(C0M6M c0m6m, String str, InterfaceC1364105Vn<? super C0CRW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0m6m;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CRW(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("M2MigrationBaseViewHolder@869b.startMigrateDrafts$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            IMigrateDraftService iMigrateDraftService = (IMigrateDraftService) this.LLILLJJLI.LLILLJJLI.getValue();
            if (iMigrateDraftService != null) {
                MigrateType migrateType = MigrateType.MANUAL;
                String str = this.LLILLL;
                this.LL = 1;
                if (iMigrateDraftService.migrateDraft(migrateType, str, this) == objLJFF) {
                    C1C7U.LIZIZ("M2MigrationBaseViewHolder@869b.startMigrateDrafts$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("M2MigrationBaseViewHolder@869b.startMigrateDrafts$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
