package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.randommatch.model.RandomMatchDataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0JeN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C497010JeN {
    public static WeakReference<DataChannel> LIZ;

    public static int LIZ() {
        DataChannel dataChannel;
        C948850anb c948850anb;
        WeakReference<DataChannel> weakReference = LIZ;
        return ((weakReference == null || (dataChannel = weakReference.get()) == null || (c948850anb = (C948850anb) dataChannel.gg0(RandomMatchDataChannel.class)) == null) ? null : c948850anb.LIZ) == EnumC948930anj.MATCHING ? 1 : 0;
    }

    public static void LIZIZ() {
        String strLJIIJ = C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ());
        HashMap map = new HashMap();
        String str = C925600aC6.LIZ;
        if (str == null) {
            str = "";
        }
        map.put("request_page", str);
        map.put("event_action_type", "click");
        map.put("is_in_matching", String.valueOf(LIZ()));
        map.put("link_id", strLJIIJ);
        C01Z4.LIZ(null, map);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_guest_randmatch_entrance");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    public static void LIZJ() {
        String strLJIIJ = C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ());
        HashMap map = new HashMap();
        String str = C925600aC6.LIZ;
        if (str == null) {
            str = "";
        }
        map.put("request_page", str);
        map.put("event_action_type", "show");
        map.put("is_in_matching", String.valueOf(LIZ()));
        map.put("link_id", strLJIIJ);
        C01Z4.LIZ(null, map);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_guest_randmatch_entrance");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }
}
