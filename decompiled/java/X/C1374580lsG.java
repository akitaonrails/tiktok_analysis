package X;

import com.ss.android.ugc.IExternalShareSmartSort;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.share.SharePlatformConfig;
import com.ss.android.ugc.aweme.share.SharePlatformLists;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lsG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1374580lsG {
    public static final C1374580lsG LIZ = new C1374580lsG();
    public static SharePlatformLists LIZIZ;

    public static boolean LIZ() {
        IExternalShareSmartSort iExternalShareSmartSort = (IExternalShareSmartSort) PluggableExtentionKt.pluggableSpi$default(IExternalShareSmartSort.class, false, false, false, 14, null);
        if (iExternalShareSmartSort != null) {
            return iExternalShareSmartSort.LIZ();
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static SharePlatformConfig LIZIZ(String str) {
        SharePlatformLists sharePlatformLists;
        SharePlatformLists sharePlatformLists2;
        SharePlatformLists sharePlatformLists3;
        SharePlatformLists sharePlatformLists4;
        SharePlatformLists sharePlatformLists5;
        if (!LIZ()) {
            return null;
        }
        switch (str.hashCode()) {
            case -1540089692:
                if (str.equals("quick_share_button") && (sharePlatformLists5 = LIZIZ) != null) {
                    return sharePlatformLists5.quickShareButtonPlatforms;
                }
                return null;
            case 215594289:
                if (str.equals("self_share_panel") && (sharePlatformLists4 = LIZIZ) != null) {
                    return sharePlatformLists4.selfSharePanelPlatforms;
                }
                return null;
            case 403708324:
                if (str.equals("share_panel") && (sharePlatformLists3 = LIZIZ) != null) {
                    return sharePlatformLists3.sharePanelPlatforms;
                }
                return null;
            case 1135295447:
                if (str.equals("self_post_list_popup") && (sharePlatformLists2 = LIZIZ) != null) {
                    return sharePlatformLists2.selfPostListPopupPlatforms;
                }
                return null;
            case 1542296867:
                if (str.equals("after_post") && (sharePlatformLists = LIZIZ) != null) {
                    return sharePlatformLists.afterPostPopupPlatforms;
                }
                return null;
            default:
                return null;
        }
    }

    public static String LIZJ(String str, String str2, boolean z) {
        if (Intrinsics.LJFF(str, "after_post")) {
            return "after_post";
        }
        if (Intrinsics.LJFF(str2, "self_post_list_popup")) {
            return "self_post_list_popup";
        }
        if (Intrinsics.LJFF(str, "quick_share_button")) {
            return "quick_share_button";
        }
        if (Intrinsics.LJFF(str, "share_panel")) {
            if (!z) {
                return "share_panel";
            }
            return "self_share_panel";
        }
        return "";
    }
}
