package X;

import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeACLShare;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lsu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1374980lsu {
    public static Integer LIZ(Aweme aweme) {
        ACLCommonShare downloadGeneral;
        ACLCommonShare downloadMaskPanel;
        if (Intrinsics.LJFF(C1379220lzk.LIZ, "long_press_download")) {
            AwemeACLShare awemeACLShare = aweme.awemeACLShareInfo;
            if (awemeACLShare != null && (downloadMaskPanel = awemeACLShare.getDownloadMaskPanel()) != null) {
                return Integer.valueOf(downloadMaskPanel.getCode());
            }
            return null;
        }
        AwemeACLShare awemeACLShare2 = aweme.awemeACLShareInfo;
        if (awemeACLShare2 != null && (downloadGeneral = awemeACLShare2.getDownloadGeneral()) != null) {
            return Integer.valueOf(downloadGeneral.getCode());
        }
        return null;
    }
}
