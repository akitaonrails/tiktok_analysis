package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0ZwT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C915910ZwT {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(String str, boolean z) {
        String str2;
        int i;
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        if (z) {
            str2 = "red_dot";
        } else {
            str2 = "guide_bubble";
        }
        map.put("show_type", str2);
        MultiGuestDataHolder multiGuestDataHolder = C920830a4P.LIZ;
        if (multiGuestDataHolder != null) {
            i = multiGuestDataHolder.LJJIFFI;
        } else {
            i = 0;
        }
        map.put("guest_cnt", String.valueOf(i));
        map.put("multi_host_label", str);
        map.put("link_id_list", C917520Zz4.LJ());
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_anchor_host_challenge_entrance_guide");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    public static void LIZ(String str, boolean z, boolean z2) {
        int i;
        String str2;
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("link_id_list", C917520Zz4.LJ());
        MultiGuestDataHolder multiGuestDataHolder = C920830a4P.LIZ;
        if (multiGuestDataHolder != null) {
            i = multiGuestDataHolder.LJJIFFI;
        } else {
            i = 0;
        }
        map.put("guest_cnt", String.valueOf(i));
        map.put("multi_host_label", str);
        map.put("link_id_list", C917520Zz4.LJ());
        if (z2) {
            map.put("action_type", "click");
        } else {
            map.put("action_type", "show");
            if (z) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_first_show", str2);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_anchor_host_challenge_entrance");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }
}
