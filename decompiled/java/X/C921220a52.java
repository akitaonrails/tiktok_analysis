package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0a52, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C921220a52 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(int i) {
        return (i == 0 || i != 1) ? "by_default" : "by_coins";
    }

    public static void LIZIZ(String str, boolean z, InterfaceC921200a50 interfaceC921200a50) {
        int size;
        String str2;
        int i;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ2;
        List listLJI;
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        if (interfaceC921200a50 != null && (listLJI = interfaceC921200a50.LJI()) != null) {
            size = listLJI.size();
        } else {
            size = 0;
        }
        map.put("request_list_ucnt", String.valueOf(size));
        map.put("to_display_type", str);
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_first_time_click", str2);
        MultiGuestDataHolder multiGuestDataHolderLIZJ = C916490ZxP.LIZJ();
        int i2 = -1;
        if (multiGuestDataHolderLIZJ != null && (multiLiveAnchorPanelSettingsLIZIZ2 = multiGuestDataHolderLIZJ.LIZIZ()) != null) {
            i = multiLiveAnchorPanelSettingsLIZIZ2.layoutType;
        } else {
            i = -1;
        }
        MultiGuestDataHolder multiGuestDataHolderLIZJ2 = C916490ZxP.LIZJ();
        if (multiGuestDataHolderLIZJ2 != null && (multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolderLIZJ2.LIZIZ()) != null) {
            i2 = multiLiveAnchorPanelSettingsLIZIZ.fixMicNumAction;
        }
        EnumC918970a1P enumC918970a1PLJFF = C917140ZyS.LJFF(i, i2);
        map.put("layout_setting", C917520Zz4.LJII(enumC918970a1PLJFF).getFirst());
        map.put("window_setting", C917520Zz4.LJII(enumC918970a1PLJFF).getSecond());
        C0KX4.LIZ("livesdk_anchor_guest_request_display_confirm", map, null, true);
    }
}
