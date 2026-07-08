package X;

import com.bytedance.android.livesdk.dataChannel.LiveBanCapabilityChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AFwS245S0000000_12;

/* JADX INFO: renamed from: X.0UE8, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UE8 {
    public static DataChannel LIZ;

    public static boolean LIZ() {
        Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(LIZ);
        DataChannel dataChannel = LIZ;
        C0KX8 c0kx8 = dataChannel != null ? (C0KX8) dataChannel.gg0(LiveBanCapabilityChannel.class) : null;
        if (c0kx8 == null || !c0kx8.LIZJ) {
            return (roomLJJLIIIIJ == null || roomLJJLIIIIJ.cppVersion != 1 || C753070TgP.LIZJ(LIZ, AFwS245S0000000_12.get$arr$(240), null, null, C497740JfY.LJIJI(2131840772), Boolean.FALSE) == C0UFE.ON) ? false : true;
        }
        C766270U4b.LIZLLL(2131844185);
        return true;
    }
}
