package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.feed.platform.componentmanager.metric.device.ScreenConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SWx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C722810SWx extends C09AY implements Function0<ScreenConfig> {
    public C722810SWx() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ScreenConfig invoke() {
        try {
            return (ScreenConfig) C0C64.LJIILLIIL().LJJII(ScreenConfig.class, C722800SWw.LIZ, "fcp_device_screen_rating_config", true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C722800SWw.LIZ;
        }
    }
}
