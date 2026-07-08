package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.00gy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C145000gy extends C09AY implements Function0<Boolean> {
    public C145000gy() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        Boolean bool;
        try {
            SettingsManager.LIZLLL().getClass();
            Boolean boolValueOf = Boolean.valueOf(SettingsManager.LIZ("tt_story_status_repo_memory_leak_fix", false));
            C189200o6.m2constructorimpl(boolValueOf);
            bool = boolValueOf;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            bool = c098200Yq;
        }
        return C189200o6.m7isFailureimpl(bool) ? Boolean.FALSE : bool;
    }
}
