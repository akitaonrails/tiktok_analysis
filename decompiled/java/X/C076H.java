package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.076H, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C076H extends C09AY implements Function0<Integer> {
    public C076H() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        int iLJ = 1;
        try {
            SettingsManager.LIZLLL().getClass();
            iLJ = SettingsManager.LJ("tt_story_guide_card_previous_preload_count", 1);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return Integer.valueOf(iLJ);
    }
}
