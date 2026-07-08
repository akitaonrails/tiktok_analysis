package X;

import com.bytedance.android.livesdk.chatroom.api.SpotlightInfo;
import com.bytedance.android.livesdk.chatroom.api.SpotlightItem;
import com.bytedance.android.livesdk.comp.api.subscription.setting.LiveSubOnlySpacePreviewSetting;
import java.util.List;
import webcast.api.sub.GetSubPrivilegeDetailResponse;
import webcast.api.sub.PrivilegeTag;

/* JADX INFO: renamed from: X.0Jfs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C497940Jfs {
    public static boolean LIZ(GetSubPrivilegeDetailResponse.Data data, List list) {
        int size;
        List<PrivilegeTag> list2;
        List<SpotlightItem> list3;
        SpotlightInfo spotlightInfo = data.spotlightInfo;
        if (spotlightInfo != null && (list3 = spotlightInfo.itemList) != null) {
            size = list3.size();
        } else {
            size = 0;
        }
        if (size <= 0 && ((list == null || !(!list.isEmpty())) && (LiveSubOnlySpacePreviewSetting.INSTANCE.getValue() != 0 || (list2 = data.tagList) == null || list2.size() <= 0))) {
            return false;
        }
        return true;
    }
}
