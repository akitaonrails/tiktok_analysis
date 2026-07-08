package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0ZvE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C915140ZvE {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ() {
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_anchor_guest_showdown_entrance");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJJII("click", "action_type");
        MultiGuestDataHolder multiGuestDataHolder = C920830a4P.LIZ;
        int i = 0;
        if (multiGuestDataHolder != null && multiGuestDataHolder.LJJIFFI > 0) {
            i = 1;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i), "is_guest_connection");
        c474500IjALIZ.LJJII(C917520Zz4.LIZJ(), "layout_id");
        c474500IjALIZ.LJJII("multi_tool", "position");
        c474500IjALIZ.LIZ();
    }
}
