package X;

import com.ss.android.ugc.aweme.creation.config.DMAlbumSelectConfig;
import com.ss.android.ugc.aweme.creation.config.DMBDImageUploadConfig;
import com.ss.android.ugc.aweme.creation.config.DMBDVideoUploadConfig;
import com.ss.android.ugc.aweme.creation.config.DMCameraSettingsConfig;
import com.ss.android.ugc.aweme.creation.config.DMRecordPageConfig;

/* JADX INFO: renamed from: X.1E9H, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1E9H {
    public static final DMCameraSettingsConfig LIZ = new DMCameraSettingsConfig(new DMBDImageUploadConfig(2, 10, 1, 2, 5, 1, -1), new DMBDVideoUploadConfig(2, 1, 40, 524288, 2, 30, 6, 40, 10000, 1, 1, 0, true), new DMAlbumSelectConfig(9, C538540LAe.LLJJJIL, 2), new DMRecordPageConfig(3));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1E9I());

    public static DMCameraSettingsConfig LIZ() {
        return (DMCameraSettingsConfig) LIZIZ.getValue();
    }
}
