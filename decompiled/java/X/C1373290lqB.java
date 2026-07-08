package X;

import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.AwemeACLShare;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lqB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1373290lqB {
    public static final List<String> LIZ = C1697810uHb.LJIIJJI("save", "save_photo", "gif", "live_photo");

    public static final boolean LIZ(String str, String str2, AwemeACLShare awemeACLShare) {
        ACLCommonShare aCLCommonShareLIZIZ = LIZIZ(str, str2, awemeACLShare);
        if (aCLCommonShareLIZIZ == null || aCLCommonShareLIZIZ.getShowType() != 0) {
            return true;
        }
        return false;
    }

    public static final ACLCommonShare LIZIZ(String str, String str2, AwemeACLShare awemeACLShare) {
        List<ACLCommonShare> shareActionList;
        if (LIZ.contains(str)) {
            if (Intrinsics.LJFF(str2, "long_press")) {
                if (awemeACLShare == null) {
                    return null;
                }
                return awemeACLShare.getDownloadMaskPanel();
            }
            if (awemeACLShare == null) {
                return null;
            }
            return awemeACLShare.getDownloadGeneral();
        }
        if (awemeACLShare == null) {
            return null;
        }
        if (Intrinsics.LJFF(str2, "long_press")) {
            shareActionList = awemeACLShare.getPressActionList();
        } else {
            shareActionList = awemeACLShare.getShareActionList();
        }
        if (shareActionList == null) {
            return null;
        }
        for (ACLCommonShare aCLCommonShare : shareActionList) {
            if (Intrinsics.LJFF(aCLCommonShare.getActionId(), str)) {
                return aCLCommonShare;
            }
        }
        return null;
    }

    public static final InterfaceC1370310llN LIZJ(InterfaceC1370310llN interfaceC1370310llN, String str, AwemeACLShare awemeACLShare) {
        ACLCommonShare aCLCommonShareLIZIZ = LIZIZ(interfaceC1370310llN.key(), str, awemeACLShare);
        if (aCLCommonShareLIZIZ != null) {
            return new C1372710lpF(interfaceC1370310llN, aCLCommonShareLIZIZ);
        }
        return interfaceC1370310llN;
    }
}
