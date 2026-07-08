package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0JGU, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JGU {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Long l) {
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.putAll(((InterfaceC2183451Acp) C1161920gLG.LIZJ(IInteractService.class)).LJJ(l));
        if (l == null) {
            map.put("to_user_type", "empty_seat");
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_click_link_grid");
        c474500IjALIZ.LJJIIZI(map);
        MultiGuestDataHolder multiGuestDataHolder = C920830a4P.LIZ;
        int i = 0;
        if (multiGuestDataHolder != null && multiGuestDataHolder.LJJIFFI > 0) {
            i = 1;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i), "is_guest_connection");
        c474500IjALIZ.LIZ();
    }
}
