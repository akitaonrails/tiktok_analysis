package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0pdN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1519110pdN extends C09AY implements Function0<InterfaceC1519070pdJ> {
    public C1519110pdN() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1519070pdJ invoke() {
        try {
            return C100C.LIZ.LJI();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
