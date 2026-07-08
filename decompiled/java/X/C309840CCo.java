package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CCo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C309840CCo extends C09AY implements Function0<Boolean> {
    public C309840CCo() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        try {
            boolean z = false;
            if (C0CD2.LJFF().getBoolean("optimize_backgroundstartup_bootfinish_4270", false)) {
                if (C2104108Md.LIZLLL(C1BWL.LIZ())) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return Boolean.FALSE;
        }
    }
}
