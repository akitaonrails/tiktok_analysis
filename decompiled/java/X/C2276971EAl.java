package X;

import com.ss.android.ugc.aweme.experiment.PhotoModeConfig;
import com.ss.android.ugc.aweme.experiment.PhotoUiType;

/* JADX INFO: renamed from: X.1EAl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2276971EAl {
    public static final PhotoModeConfig LIZ = new PhotoModeConfig(false, PhotoUiType.NO_SWIPE_OR_PINCH, false, PhotoUiType.NO_SWIPE_OR_PINCH, false);

    public static boolean LIZ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        PhotoModeConfig photoModeConfig = LIZ;
        PhotoModeConfig photoModeConfig2 = (PhotoModeConfig) c0c64LJIILLIIL.LJJII(PhotoModeConfig.class, photoModeConfig, "photo_mode", true);
        if (photoModeConfig2 != null) {
            photoModeConfig = photoModeConfig2;
        }
        return photoModeConfig.isUploadEnabled();
    }
}
