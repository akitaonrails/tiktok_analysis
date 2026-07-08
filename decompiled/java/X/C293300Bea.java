package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ui.experiment.PhotoModeFullPageTextOptConfig;

/* JADX INFO: renamed from: X.0Bea, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C293300Bea {
    public static final PhotoModeFullPageTextOptConfig LIZ = new PhotoModeFullPageTextOptConfig(false, 0, 0.0f);

    public static final PhotoModeFullPageTextOptConfig LIZ() {
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            PhotoModeFullPageTextOptConfig photoModeFullPageTextOptConfig = LIZ;
            PhotoModeFullPageTextOptConfig photoModeFullPageTextOptConfig2 = (PhotoModeFullPageTextOptConfig) c0c64LJIILLIIL.LJJII(PhotoModeFullPageTextOptConfig.class, photoModeFullPageTextOptConfig, "photo_mode_full_page_text_opt", true);
            return photoModeFullPageTextOptConfig2 != null ? photoModeFullPageTextOptConfig2 : photoModeFullPageTextOptConfig;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return LIZ;
        }
    }
}
