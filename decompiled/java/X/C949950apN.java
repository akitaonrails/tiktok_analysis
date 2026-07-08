package X;

import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.dataChannel.InteractModeChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0apN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C949950apN {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ() {
        Integer num;
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        DataChannel dataChannel = C464550IJp.LIZIZ().LIZIZ;
        return (dataChannel == null || (num = (Integer) dataChannel.gg0(InteractModeChannel.class)) == null || (num.intValue() & 2) != 2) ? false : true;
    }

    public static int LIZIZ() {
        Integer num;
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        DataChannel dataChannel = C464550IJp.LIZIZ().LIZIZ;
        if (dataChannel == null || (num = (Integer) dataChannel.gg0(InteractModeChannel.class)) == null) {
            return 0;
        }
        return num.intValue();
    }

    public static void LIZJ(int i) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        DataChannel dataChannel = C464550IJp.LIZIZ().LIZIZ;
        if (dataChannel != null) {
            dataChannel.zW(InteractModeChannel.class, Integer.valueOf(i));
        }
    }
}
