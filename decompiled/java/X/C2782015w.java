package X;

import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Map;

/* JADX INFO: renamed from: X.015w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2782015w {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(DataChannel dataChannel, Map map) {
        LiveMode liveMode;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_takepage_component_click");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJIIZI(map);
        if (dataChannel != null) {
            liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class);
        } else {
            liveMode = null;
        }
        c474500IjALIZ.LJJII(C760180Trs.LIZ(liveMode), "live_type");
        c474500IjALIZ.LIZ();
    }

    public static void LIZIZ(DataChannel dataChannel, Map map) {
        LiveMode liveMode;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_takepage_component_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJIIZI(map);
        if (dataChannel != null) {
            liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class);
        } else {
            liveMode = null;
        }
        c474500IjALIZ.LJJII(C760180Trs.LIZ(liveMode), "live_type");
        c474500IjALIZ.LIZ();
    }
}
