package X;

import com.ss.android.ugc.aweme.services.draft.IMigrateDraftService;
import com.ss.android.ugc.aweme.services.draft.MigrateType;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CRV, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ugc.M2MigrationFailurePopTask$buildPopupView$builder$1$1$1", f = "M2MigrationFailurePopTask.kt", l = {56}, m = "invokeSuspend")
public final class C0CRV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C565760MGw LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CRV(C565760MGw c565760MGw, InterfaceC1364105Vn<? super C0CRV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c565760MGw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CRV(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("M2MigrationFailurePopTask@e1a9.buildPopupView$builder$1$1$1");
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
            IMigrateDraftService iMigrateDraftService = (IMigrateDraftService) this.LLILLJJLI.LLILZIL.getValue();
            if (iMigrateDraftService != null) {
                MigrateType migrateType = MigrateType.MANUAL;
                String str = this.LLILLJJLI.LLILZ;
                this.LL = 1;
                if (iMigrateDraftService.migrateDraft(migrateType, str, this) == objLJFF) {
                    C1C7U.LIZIZ("M2MigrationFailurePopTask@e1a9.buildPopupView$builder$1$1$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("M2MigrationFailurePopTask@e1a9.buildPopupView$builder$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
