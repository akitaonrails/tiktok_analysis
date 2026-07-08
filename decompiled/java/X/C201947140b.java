package X;

import com.ss.android.ugc.aweme.aigc.C2PASoundUploadConfig;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: renamed from: X.140b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C201947140b {
    public static final C2PASoundUploadConfig LIZ = new C2PASoundUploadConfig(Mp4ScreenVideoLoadTimeout.CONTROL, Mp4ScreenVideoLoadTimeout.CONTROL, 10000);

    public static final C2PASoundUploadConfig LIZ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        C2PASoundUploadConfig c2PASoundUploadConfig = LIZ;
        C2PASoundUploadConfig c2PASoundUploadConfig2 = (C2PASoundUploadConfig) c0c64LJIILLIIL.LJJII(C2PASoundUploadConfig.class, c2PASoundUploadConfig, "c2pa_sound_upload_settings", true);
        return c2PASoundUploadConfig2 != null ? c2PASoundUploadConfig2 : c2PASoundUploadConfig;
    }
}
