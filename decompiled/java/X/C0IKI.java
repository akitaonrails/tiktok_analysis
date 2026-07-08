package X;

import Y.ARunnableS76S0200000_7;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveDrawerFollowSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.Skin;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IKI, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IKI {
    public static ARunnableS76S0200000_7 LIZ;
    public static DataChannel LIZIZ;
    public static Room LIZJ;

    public static boolean LIZ() {
        return LiveDrawerFollowSetting.INSTANCE.isGameEntranceExp() && LIZIZ();
    }

    public static boolean LIZIZ() {
        Skin skin;
        DataChannel dataChannel = LIZIZ;
        String str = null;
        Room room = dataChannel != null ? (Room) dataChannel.gg0(RoomChannel.class) : null;
        LIZJ = room;
        if (room != null && (skin = room.skin) != null) {
            str = skin.scene;
        }
        return Intrinsics.LJFF("game_drawer_is_game", str);
    }
}
