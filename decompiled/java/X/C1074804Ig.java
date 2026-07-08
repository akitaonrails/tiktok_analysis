package X;

import com.ss.android.ugc.aweme.ecommerce.core.ab.SeaReviewGalleryOptimizeConfigModel;
import kotlin.jvm.internal.AFwS185S0000000_1;

/* JADX INFO: renamed from: X.04Ig, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1074804Ig {
    public static final SeaReviewGalleryOptimizeConfigModel LIZ = new SeaReviewGalleryOptimizeConfigModel(0, 0, 0, null, 0, null, null, null, null, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(373));

    public static SeaReviewGalleryOptimizeConfigModel LIZIZ() {
        return (SeaReviewGalleryOptimizeConfigModel) LIZIZ.getValue();
    }

    public static boolean LIZ() {
        Integer num;
        SeaReviewGalleryOptimizeConfigModel seaReviewGalleryOptimizeConfigModelLIZIZ = LIZIZ();
        return (seaReviewGalleryOptimizeConfigModelLIZIZ == null || (num = seaReviewGalleryOptimizeConfigModelLIZIZ.enableUiOptimize) == null || num.intValue() != 1) ? false : true;
    }
}
