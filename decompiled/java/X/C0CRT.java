package X;

import com.ss.android.ugc.aweme.services.draft.IMigrateDraftService;
import com.ss.android.ugc.aweme.services.draft.MigrateType;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CRT, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.external.ui.DraftMigrationPushHandler$interceptInnerPushClick$1", f = "DraftMigrationPushHandler.kt", l = {86}, m = "invokeSuspend")
public final class C0CRT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C563990MAb LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CRT(C563990MAb c563990MAb, InterfaceC1364105Vn<? super C0CRT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c563990MAb;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CRT(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftMigrationPushHandler@13db.interceptInnerPushClick$1");
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
            IMigrateDraftService iMigrateDraftService = (IMigrateDraftService) this.LLILLJJLI.LLIZLLLIL.getValue();
            if (iMigrateDraftService != null) {
                MigrateType migrateType = MigrateType.MANUAL;
                this.LL = 1;
                if (iMigrateDraftService.migrateDraft(migrateType, "in_app_push", this) == objLJFF) {
                    C1C7U.LIZIZ("DraftMigrationPushHandler@13db.interceptInnerPushClick$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftMigrationPushHandler@13db.interceptInnerPushClick$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
