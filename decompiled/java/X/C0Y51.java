package X;

import Y.AComparatorS22S0000000_3;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Y51, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.db.deferred.DeferredMigrationManager$executePending$1", f = "DeferredMigrationManager.kt", l = {}, m = "invokeSuspend")
public final class C0Y51 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0Y5P LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Y51(C0Y5P c0y5p, InterfaceC1364105Vn<? super C0Y51> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0y5p;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0Y51(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DeferredMigrationManager@7392.executePending$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<C1921507fp> list = this.LL.LIZLLL;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (ArrayList) list) {
            if (!r6.LIZIZ.LJIILLIIL(((C1921507fp) obj2).LIZ)) {
                arrayList.add(obj2);
            }
        }
        List<C1921507fp> listLJLLLL = C13LP.LJLLLL(new AComparatorS22S0000000_3(22), arrayList);
        if (listLJLLLL.isEmpty()) {
            C868780Y6i.LJ(this.LL.LIZ.LIZLLL(), "DeferredMigrationManager", "No pending deferred migrations", 4);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("DeferredMigrationManager@7392.executePending$1");
            return unit;
        }
        C868780Y6i c868780Y6iLIZLLL = this.LL.LIZ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Starting ");
        sbLIZ.append(listLJLLLL.size());
        sbLIZ.append(" deferred migration(s)");
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "DeferredMigrationManager", C2188811AlT.LIZIZ(sbLIZ), 4);
        for (C1921507fp c1921507fp : listLJLLLL) {
            C0Y5P c0y5p = this.LL;
            c0y5p.getClass();
            long jUptimeMillis = SystemClock.uptimeMillis();
            try {
                InterfaceC870450YCt interfaceC870450YCtLJI = c0y5p.LIZJ.LJI();
                if (interfaceC870450YCtLJI == null) {
                    C868780Y6i c868780Y6iLIZLLL2 = c0y5p.LIZ.LIZLLL();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("DB null for migration ");
                    sbLIZ2.append(c1921507fp.LIZ);
                    c868780Y6iLIZLLL2.LJIIIIZZ("DeferredMigrationManager", C2188811AlT.LIZIZ(sbLIZ2), null);
                    c0y5p.LIZ(jUptimeMillis, c1921507fp.LIZ, "db_null", false);
                } else {
                    Iterator<String> it2 = c1921507fp.LIZIZ.iterator();
                    while (it2.hasNext()) {
                        interfaceC870450YCtLJI.LJIILJJIL(it2.next());
                    }
                    c0y5p.LIZIZ.LJI(c1921507fp.LIZ);
                    C868780Y6i c868780Y6iLIZLLL3 = c0y5p.LIZ.LIZLLL();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Migration ");
                    sbLIZ3.append(c1921507fp.LIZ);
                    sbLIZ3.append(" completed in ");
                    sbLIZ3.append(SystemClock.uptimeMillis() - jUptimeMillis);
                    sbLIZ3.append("ms");
                    C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL3, "DeferredMigrationManager", C2188811AlT.LIZIZ(sbLIZ3), 4);
                    c0y5p.LIZ(jUptimeMillis, c1921507fp.LIZ, null, true);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C868780Y6i c868780Y6iLIZLLL4 = c0y5p.LIZ.LIZLLL();
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("Migration ");
                sbLIZ4.append(c1921507fp.LIZ);
                sbLIZ4.append(" failed: ");
                sbLIZ4.append(e.getMessage());
                c868780Y6iLIZLLL4.LJIIIIZZ("DeferredMigrationManager", C2188811AlT.LIZIZ(sbLIZ4), null);
                c0y5p.LIZ(jUptimeMillis, c1921507fp.LIZ, e.getClass().getSimpleName(), false);
            }
        }
        C868780Y6i.LJIILJJIL(this.LL.LIZ.LIZLLL(), "DeferredMigrationManager", "Deferred migrations completed", 4);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("DeferredMigrationManager@7392.executePending$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
