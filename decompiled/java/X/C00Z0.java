package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.00Z0, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00Z0 {
    public static final C01GW LIZ = C452501pT.LIZIZ(new Function0() { // from class: X.00Yz
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object c098200Yq;
            try {
                SettingsManager.LIZLLL().getClass();
                c098200Yq = Boolean.valueOf(SettingsManager.LIZ("ug_share_prop_kmp_async_storage", false));
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Boolean bool = Boolean.FALSE;
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = bool;
            }
            return Boolean.valueOf(((Boolean) c098200Yq).booleanValue());
        }
    });
}
