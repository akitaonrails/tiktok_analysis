package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.078J, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C078J extends C09AY implements Function0<Integer> {
    public C078J() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        int iLJ = 30;
        try {
            SettingsManager.LIZLLL().getClass();
            iLJ = SettingsManager.LJ("tako_feed_video_consume_count", 30);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
        return Integer.valueOf(iLJ);
    }
}
