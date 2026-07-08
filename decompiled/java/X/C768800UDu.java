package X;

import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.scene.Scene;

/* JADX INFO: renamed from: X.0UDu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C768800UDu {
    public static long LIZ;
    public static long LIZIZ;
    public static String LIZJ;
    public static String LIZLLL;

    public static void LIZIZ(DataChannel dataChannel) {
        if (!C768810UDv.LIZ) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_take_mute_time");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis() - LIZ), "use_time");
        c474500IjALIZ.LJJII(LIZLLL, Scene.SCENE_SERVICE);
        c474500IjALIZ.LJJII(LIZJ, "method");
        c474500IjALIZ.LIZ();
    }

    public static void LIZ(DataChannel dataChannel, String str, boolean z) {
        if (z) {
            LIZ = System.currentTimeMillis();
            LIZJ = str;
            LIZLLL = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getBroadcastScene();
        } else {
            LIZIZ(dataChannel);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_take_mute_click");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "is_open");
        c474500IjALIZ.LJJII(LIZLLL, Scene.SCENE_SERVICE);
        c474500IjALIZ.LJJII(str, "method");
        c474500IjALIZ.LIZ();
    }
}
