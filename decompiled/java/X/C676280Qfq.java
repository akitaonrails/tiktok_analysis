package X;

import com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchBaseVM;
import com.ss.android.ugc.aweme.ecommerce.search.vision.entrance.PhotoSearchEntranceConfig;
import com.ss.android.ugc.aweme.ecommerce.search.vision.result.PhotoSearchSingleDetectionFragment;

/* JADX INFO: renamed from: X.0Qfq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C676280Qfq {
    public static boolean LIZ(PhotoSearchSingleDetectionFragment photoSearchSingleDetectionFragment) {
        PhotoSearchBaseVM photoSearchBaseVM;
        PhotoSearchEntranceConfig photoSearchEntranceConfig;
        boolean zLIZ = false;
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() && (photoSearchBaseVM = photoSearchSingleDetectionFragment.LLJJJIL) != null && (photoSearchEntranceConfig = photoSearchBaseVM.LLILLJJLI) != null && photoSearchEntranceConfig.enableRepeatSearchGuide) {
            C675950QfJ.LIZ.getClass();
            if (C675950QfJ.LIZ().getLong("last_show_repeat_search_guide_time", -1L) <= 0) {
                C677180QhI c677180QhI = C677180QhI.LIZ;
                PhotoSearchBaseVM photoSearchBaseVM2 = photoSearchSingleDetectionFragment.LLJJJIL;
                c677180QhI.getClass();
                zLIZ = C677180QhI.LIZ(photoSearchSingleDetectionFragment, photoSearchBaseVM2);
                if (zLIZ) {
                    C675950QfJ.LIZ().storeLong("last_show_repeat_search_guide_time", System.currentTimeMillis());
                }
            }
        }
        return zLIZ;
    }
}
