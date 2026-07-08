package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10CN, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10CN extends C09AY implements Function0<InterfaceC1519030pdF> {
    public C10CN() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1519030pdF invoke() {
        try {
            return C100C.LIZ.LIZJ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
