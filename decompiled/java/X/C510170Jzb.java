package X;

import com.bytedance.android.livesdk.chatroom.api.SpotlightInfo;
import com.bytedance.android.livesdk.chatroom.api.SpotlightItem;
import java.util.List;
import webcast.api.pgc_sub.PGCGetSubPrivilegeDetailResponse;

/* JADX INFO: renamed from: X.0Jzb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C510170Jzb {
    public static boolean LIZ(PGCGetSubPrivilegeDetailResponse.Data data, List list) {
        int size;
        List<SpotlightItem> list2;
        SpotlightInfo spotlightInfo = data.spotlightInfo;
        if (spotlightInfo != null && (list2 = spotlightInfo.itemList) != null) {
            size = list2.size();
        } else {
            size = 0;
        }
        if (size <= 0 && (list == null || !(!list.isEmpty()))) {
            return false;
        }
        return true;
    }
}
