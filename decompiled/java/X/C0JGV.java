package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0JGV, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JGV {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(long j, String str, String str2) {
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.putAll(((InterfaceC2183451Acp) C1161920gLG.LIZJ(IInteractService.class)).LJJ(null));
        map.put("trigger", str);
        map.put("guest_id", String.valueOf(j));
        if (str2 == null && (str2 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).sE(j)) == null) {
            str2 = "";
        }
        map.put("link_id", str2);
        C0KX4.LIZ("livesdk_multi_view_guest_start", map, null, true);
    }

    public static void LIZ(String str, long j, long j2, String str2, Room room) {
        HashMap map = new HashMap();
        C01Z4.LIZ(room, map);
        map.putAll(((InterfaceC2183451Acp) C1161920gLG.LIZJ(IInteractService.class)).LJJ(null));
        map.put("trigger", str);
        map.put("guest_id", String.valueOf(j));
        map.put("link_id", str2);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_view_guest_duration");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJJII(Long.valueOf(j2), "duration");
        c474500IjALIZ.LIZ();
    }
}
