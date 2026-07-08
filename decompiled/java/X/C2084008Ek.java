package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;

/* JADX INFO: renamed from: X.08Ek, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2084008Ek {
    public static final int LIZ() {
        try {
            C844470XAv.LIZ.getClass();
            int iN3 = C786410Ut5.n3(C844470XAv.LIZ().getResources(), "status_bar_height", "dimen", "android");
            dimensionPixelSize = iN3 > 0 ? C844470XAv.LIZ().getResources().getDimensionPixelSize(iN3) : 0;
            C189200o6.m2constructorimpl(Unit.LIZ);
            return dimensionPixelSize;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return dimensionPixelSize;
        }
    }
}
