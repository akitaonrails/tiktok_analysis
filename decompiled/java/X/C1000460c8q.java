package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.dynamic.DynamicAdConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0c8q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1000460c8q extends C09AY implements Function0<Integer> {
    public C1000460c8q() {
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
        return Integer.valueOf(dynamicAdConfig != null ? dynamicAdConfig.getLynxViewPreRenderGap() : 6);
    }
}
