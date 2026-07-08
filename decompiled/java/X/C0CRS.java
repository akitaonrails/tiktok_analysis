package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.draft.IMigrateDraftService;
import com.ss.android.ugc.aweme.services.draft.MigrateType;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CRS, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.migratedraft.launch.MigrateDraftLegoTask$doMigrate$1", f = "MigrateDraftLegoTask.kt", l = {66, 69}, m = "invokeSuspend")
public final class C0CRS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;

    public C0CRS(InterfaceC1364105Vn<? super C0CRS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0CRS c0crs = new C0CRS(interfaceC1364105Vn);
        c0crs.LLILLJJLI = obj;
        return c0crs;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MigrateDraftLegoTask@760f.doMigrate$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                C189200o6.m2constructorimpl(Unit.LIZ);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("MigrateDraftLegoTask@760f.doMigrate$1");
                return unit;
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            long jLongValue = ((Number) C0AZI.LIZ.getValue()).longValue();
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(jLongValue, this) == objLJFF) {
                C1C7U.LIZIZ("MigrateDraftLegoTask@760f.doMigrate$1");
                return objLJFF;
            }
        }
        IMigrateDraftService iMigrateDraftService = (IMigrateDraftService) PluggableExtentionKt.pluggableSpi$default(IMigrateDraftService.class, false, false, false, 14, null);
        if (iMigrateDraftService == null) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("MigrateDraftLegoTask@760f.doMigrate$1");
            return unit2;
        }
        MigrateType migrateType = MigrateType.AUTO;
        this.LL = 2;
        if (iMigrateDraftService.migrateDraft(migrateType, "silent", this) == objLJFF) {
            C1C7U.LIZIZ("MigrateDraftLegoTask@760f.doMigrate$1");
            return objLJFF;
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("MigrateDraftLegoTask@760f.doMigrate$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
