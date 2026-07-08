package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ab.LynxMiddleViewPreloadConfig;

/* JADX INFO: renamed from: X.07Ka, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1843807Ka {
    public static final C1843807Ka LIZ = new C1843807Ka();
    public static final LynxMiddleViewPreloadConfig LIZIZ = new LynxMiddleViewPreloadConfig(0, 4500L);

    public static LynxMiddleViewPreloadConfig LIZ() {
        try {
            LynxMiddleViewPreloadConfig lynxMiddleViewPreloadConfig = (LynxMiddleViewPreloadConfig) C0C64.LJIILLIIL().LJJII(LynxMiddleViewPreloadConfig.class, LIZIZ, "ec_middle_mall_preload", true);
            return lynxMiddleViewPreloadConfig == null ? new LynxMiddleViewPreloadConfig(0, 4500L) : lynxMiddleViewPreloadConfig;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new LynxMiddleViewPreloadConfig(0, 4500L);
        }
    }
}
