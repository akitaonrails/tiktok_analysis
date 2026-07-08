package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0877, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0877 extends C09AY implements Function0<String[]> {
    public AnonymousClass0877() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String[] invoke() {
        try {
            String[] strArr = (String[]) C0C64.LJIILLIIL().LJJIII("network_backend_api_caller_opt_list", 0, null);
            return strArr == null ? new String[0] : strArr;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return new String[0];
        }
    }
}
