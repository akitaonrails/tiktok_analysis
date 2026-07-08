package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.dynamic.DynamicAdConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0c8p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1000450c8p extends C09AY implements Function0<Integer> {
    public C1000450c8p() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        DynamicAdConfig dynamicAdConfig;
        C1000470c8r.LIZ.getClass();
        try {
            SettingsManager.LIZLLL().getClass();
            dynamicAdConfig = (DynamicAdConfig) SettingsManager.LJII("dynamic_ad_config", DynamicAdConfig.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            dynamicAdConfig = null;
        }
        int lynxViewReleaseGap = dynamicAdConfig != null ? dynamicAdConfig.getLynxViewReleaseGap() : 8;
        C1000380c8i.LIZ.getClass();
        if (lynxViewReleaseGap <= C1000380c8i.LJFF()) {
            lynxViewReleaseGap = C1000380c8i.LJFF() + 1;
        }
        return Integer.valueOf(lynxViewReleaseGap);
    }
}
