package X;

import com.ss.android.ugc.aweme.ecommerce.fyp.affiliate.button.settings.PopularVideoConfig;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: renamed from: X.0zL1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1892130zL1 {
    public static final PopularVideoConfig LIZ = new PopularVideoConfig(Mp4ScreenVideoLoadTimeout.CONTROL, 0.5f, 2000);

    public static final PopularVideoConfig LIZ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        PopularVideoConfig popularVideoConfig = LIZ;
        PopularVideoConfig popularVideoConfig2 = (PopularVideoConfig) c0c64LJIILLIIL.LJJII(PopularVideoConfig.class, popularVideoConfig, "ec_anchor_bottom_button_popular_video_config", true);
        return popularVideoConfig2 != null ? popularVideoConfig2 : popularVideoConfig;
    }
}
