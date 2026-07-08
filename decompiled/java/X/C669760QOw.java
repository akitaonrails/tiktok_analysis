package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ab.EcVideoSearchConfig;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0QOw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C669760QOw {
    public static final C669760QOw LIZ = new C669760QOw();
    public static final EcVideoSearchConfig LIZIZ = new EcVideoSearchConfig(0, 12, LSPassThroughRecordSizeConfig.DEFAULT, "tiktok_video", "mall_video_tab");

    public static EcVideoSearchConfig LIZ() {
        Object c098200Yq;
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            c098200Yq = LIZIZ;
            EcVideoSearchConfig ecVideoSearchConfig = (EcVideoSearchConfig) c0c64LJIILLIIL.LJJII(EcVideoSearchConfig.class, c098200Yq, "ec_search_video_tab_config", true);
            if (ecVideoSearchConfig != null) {
                c098200Yq = ecVideoSearchConfig;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        EcVideoSearchConfig ecVideoSearchConfig2 = (EcVideoSearchConfig) c098200Yq;
        return ecVideoSearchConfig2 == null ? LIZIZ : ecVideoSearchConfig2;
    }
}
