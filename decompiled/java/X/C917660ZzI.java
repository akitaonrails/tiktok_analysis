package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0ZzI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C917660ZzI {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZ() {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings2 = C924810aAp.LJ().LJJIII;
        return (multiLiveAnchorPanelSettings2 == null || multiLiveAnchorPanelSettings2.LIZLLL != 3 || (multiLiveAnchorPanelSettings = C924810aAp.LJ().LJJIII) == null || multiLiveAnchorPanelSettings.fixMicNumAction != 1) ? CardStruct.IStatusCode.DEFAULT : "1";
    }

    public static void LIZIZ(String str, String str2) {
        int i;
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        MultiGuestDataHolder multiGuestDataHolder = C920830a4P.LIZ;
        if (multiGuestDataHolder != null) {
            i = multiGuestDataHolder.LJJIFFI;
        } else {
            i = 0;
        }
        map.put("guest_cnt", String.valueOf(i));
        if (C931790aM5.LIZIZ()) {
            map.put("layout_key", C940770aaZ.LIZ().getDataSource().LIZ());
        }
        if (str == null) {
            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = C924810aAp.LJ().LJJIII;
            if (multiLiveAnchorPanelSettings != null && multiLiveAnchorPanelSettings.LIZLLL == 3) {
                str = "off";
            } else {
                str = "on";
            }
        }
        map.put("switch_to", str);
        map.put("panel_layout_type", String.valueOf(C940770aaZ.LIZ().getDataSource().getPanelLayoutType()));
        map.put("layout_id", C940770aaZ.LIZ().getDataSource().LJIL());
        map.put("from_page", str2);
        C0KX4.LIZ("livesdk_multi_show_available_spot_on_and_off", map, null, true);
    }

    public static void LIZJ(String str, String str2) {
        int i;
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        MultiGuestDataHolder multiGuestDataHolder = C920830a4P.LIZ;
        if (multiGuestDataHolder != null) {
            i = multiGuestDataHolder.LJJIFFI;
        } else {
            i = 0;
        }
        map.put("guest_cnt", String.valueOf(i));
        map.put("is_show_avaliable_spot", str);
        map.put("layout_key", C940770aaZ.LIZ().getDataSource().LIZ());
        map.put("panel_layout_type", String.valueOf(C940770aaZ.LIZ().getDataSource().getPanelLayoutType()));
        map.put("layout_id", C940770aaZ.LIZ().getDataSource().LJIL());
        map.put("from_page", str2);
        C0KX4.LIZ("livesdk_multi_show_available_spot_show", map, null, true);
    }
}
