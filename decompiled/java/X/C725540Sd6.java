package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Sd6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C725540Sd6 extends AbstractC2238911Ck5<InterfaceC725550Sd7<?>, Object> {
    @Override // X.AbstractC2238911Ck5
    public final void LIZ(C2238881Ck2<InterfaceC725550Sd7<?>> c2238881Ck2, Object obj, C1576580r84<?> c1576580r84) {
        try {
            Object objLIZ = c2238881Ck2.LIZ.newInstance().LIZ();
            if (objLIZ != null) {
                c2238881Ck2.LIZLLL = objLIZ;
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
