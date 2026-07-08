package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CjN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C321750CjN extends C09AY implements Function0<C08I7<String, C1351190lGX>> {
    public C321750CjN() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C08I7<String, C1351190lGX> invoke() {
        int iLJ = 30;
        try {
            SettingsManager.LIZLLL().getClass();
            iLJ = SettingsManager.LJ("tt_quick_comment_cache_limit", 30);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return new C08I7<>(iLJ);
    }
}
