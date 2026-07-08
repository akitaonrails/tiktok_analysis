package X;

import android.os.Looper;
import com.bytedance.android.livesdk.livesetting.level.FansClubDynamicGuidanceBusinessStrategySetting;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: renamed from: X.0eXi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1092760eXi {
    public final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());
    public final List<String> LIZIZ = FansClubDynamicGuidanceBusinessStrategySetting.INSTANCE.getValue();
    public DataChannel LIZJ;
    public boolean LIZLLL;

    public final void LIZ(int i, String str, String str2, String str3) {
        DataChannel dataChannel = this.LIZJ;
        if (dataChannel != null) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("live_fan_club_guide_client_trigger_show");
            c474500IjALIZ.LJIJJLI(dataChannel);
            c474500IjALIZ.LJJII(str2, "biz_type");
            c474500IjALIZ.LJJII(str, "biz_scene");
            c474500IjALIZ.LJJII(Integer.valueOf(i), FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
            c474500IjALIZ.LJJII(str3, "error_msg");
            c474500IjALIZ.LIZ();
        }
    }
}
