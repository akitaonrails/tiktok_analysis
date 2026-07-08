package X;

import com.bytedance.android.live.liveinteract.platform.common.datachannel.MultiGuestPreApprovedChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestEnableHostPreApproveTypeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestPreApproveConfigSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0aB7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C924990aB7 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ() {
        return MultiGuestEnableHostPreApproveTypeSetting.isEnable() && LIZJ();
    }

    public static boolean LIZJ() {
        return MultiGuestPreApproveConfigSetting.isPreApproveEnabled() && !C917810ZzX.LJIIIIZZ();
    }

    public static boolean LIZ(DataChannel dataChannel) {
        Pair pair;
        if (!LIZJ() || dataChannel == null || (pair = (Pair) dataChannel.gg0(MultiGuestPreApprovedChannel.class)) == null || !((Boolean) pair.getFirst()).booleanValue()) {
            return false;
        }
        return true;
    }
}
