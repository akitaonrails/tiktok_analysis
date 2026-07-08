package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.08PU, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08PU extends C09AY implements Function0<Boolean> {
    public C08PU() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean zLJFF;
        try {
            C844470XAv.LIZ.getClass();
            zLJFF = C2162308dZ.LJFF(C844470XAv.LIZ(), "com.android.vending");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            zLJFF = false;
        }
        return Boolean.valueOf(zLJFF);
    }
}
