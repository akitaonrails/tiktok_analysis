package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CKa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C311780CKa extends C09AY implements Function0<Unit> {
    public C311780CKa() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C0CKZ c0ckz = C0CKZ.LIZLLL;
        try {
            c0ckz.LIZLLL(Integer.valueOf(C0CKZ.LJI), "ab_timeline_stage_code");
            c0ckz.LIZLLL(Boolean.valueOf(C0CKZ.LJFF ? true : C1150504el.LIZ().LJII), "ab_is_cold_boot_track_report");
            C0CKZ.LJFF(c0ckz);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        return Unit.LIZ;
    }
}
