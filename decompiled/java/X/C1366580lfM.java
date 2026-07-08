package X;

import com.ss.android.ugc.aweme.im.sharepanel.api.experiment.ScreenshotInternalShareConfig;

/* JADX INFO: renamed from: X.0lfM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1366580lfM {
    public static final ScreenshotInternalShareConfig LIZ = new ScreenshotInternalShareConfig(0, 0, 0);

    public static ScreenshotInternalShareConfig LIZ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        ScreenshotInternalShareConfig screenshotInternalShareConfig = LIZ;
        ScreenshotInternalShareConfig screenshotInternalShareConfig2 = (ScreenshotInternalShareConfig) c0c64LJIILLIIL.LJJII(ScreenshotInternalShareConfig.class, screenshotInternalShareConfig, "im_internal_share_screenshot", true);
        return screenshotInternalShareConfig2 != null ? screenshotInternalShareConfig2 : screenshotInternalShareConfig;
    }

    public static boolean LIZIZ() {
        return LIZ().screenshotType > 0 && C1865360ydq.LIZ();
    }

    public static boolean LIZJ() {
        return LIZ().screenshotType == 1 && C1865360ydq.LIZ();
    }

    public static boolean LIZLLL() {
        return LIZ().screenshotType == 2 && C1865360ydq.LIZ();
    }
}
