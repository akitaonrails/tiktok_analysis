package X;

import android.provider.Settings;
import android.view.accessibility.AccessibilityManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS208S0000000_20;

/* JADX INFO: renamed from: X.0rmZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1601690rmZ {
    public static volatile AccessibilityManager LIZ;
    public static volatile Boolean LIZIZ;

    public static final boolean LIZIZ() {
        if (LIZIZ == null) {
            try {
                C844470XAv.LIZ.getClass();
                LIZIZ = Boolean.valueOf(Settings.Secure.getInt(C844470XAv.LIZ().getContentResolver(), "touch_exploration_enabled", 0) != 0);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            }
        }
        Boolean bool = LIZIZ;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean LIZJ() {
        if (LIZ == null) {
            LIZLLL();
        }
        AccessibilityManager accessibilityManager = LIZ;
        if (accessibilityManager != null) {
            return accessibilityManager.isTouchExplorationEnabled();
        }
        return false;
    }

    public static void LIZLLL() {
        C844470XAv.LIZ.getClass();
        Object objH2 = C786410Ut5.H2(C844470XAv.LIZ(), "accessibility");
        LIZ = objH2 instanceof AccessibilityManager ? (AccessibilityManager) objH2 : null;
        AccessibilityManager accessibilityManager = LIZ;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        C0S78.LIZJ(AFwS208S0000000_20.get$arr$(81), true);
    }

    public static int LIZ(Aweme aweme) {
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        if (aweme == null || (photoModeImageInfo = aweme.getPhotoModeImageInfo()) == null || (imageList = photoModeImageInfo.getImageList()) == null || imageList.isEmpty()) {
            return 0;
        }
        Iterator<PhotoModeImageUrlModel> it2 = imageList.iterator();
        while (it2.hasNext()) {
            if (it2.next().altText != null) {
                return 1;
            }
        }
        return 0;
    }
}
