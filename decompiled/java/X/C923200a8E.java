package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0a8E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C923200a8E {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(String str) {
        String str2;
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("action_type", str);
        MultiGuestDataHolder multiGuestDataHolder = C920830a4P.LIZ;
        if (multiGuestDataHolder != null && multiGuestDataHolder.LJJIFFI > 0) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_guest_connection", str2);
        C0KX4.LIZ("livesdk_multi_anchor_guest_group_tab", map, null, true);
    }

    public static void LIZ(int i, int i2, String str, String str2, long j, long j2) {
        String str3;
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("action_type", str);
        map.put("group_id", String.valueOf(j));
        map.put("group_active_user_num", String.valueOf(j2));
        MultiGuestDataHolder multiGuestDataHolder = C920830a4P.LIZ;
        if (multiGuestDataHolder != null && multiGuestDataHolder.LJJIFFI > 0) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_guest_connection", str3);
        C0KX4.LIZ("livesdk_multi_anchor_guest_group", map, null, true);
        ConcurrentHashSet<String> concurrentHashSet = C924950aB3.LIZ;
        C924950aB3.LIZLLL(new C924960aB4("outroom_group", str, i, i2, str2, null, null, null, null, null, null, null, null, null, C920500a3s.LIZ, null, null, null, null, null, null, null, 16760800));
    }
}
