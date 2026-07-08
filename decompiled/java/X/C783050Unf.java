package X;

import com.ss.android.ugc.aweme.feed.landscape.experiments.LandscapeAutoRotationDegreeConfig;

/* JADX INFO: renamed from: X.0Unf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C783050Unf {
    public static final LandscapeAutoRotationDegreeConfig LIZ;

    static {
        LandscapeAutoRotationDegreeConfig landscapeAutoRotationDegreeConfig = new LandscapeAutoRotationDegreeConfig(5, 1, 45);
        LandscapeAutoRotationDegreeConfig landscapeAutoRotationDegreeConfig2 = (LandscapeAutoRotationDegreeConfig) C0C64.LJIILLIIL().LJJII(LandscapeAutoRotationDegreeConfig.class, landscapeAutoRotationDegreeConfig, "landscape_feed_rotation_degree", true);
        if (landscapeAutoRotationDegreeConfig2 != null) {
            landscapeAutoRotationDegreeConfig = landscapeAutoRotationDegreeConfig2;
        }
        LIZ = landscapeAutoRotationDegreeConfig;
    }
}
