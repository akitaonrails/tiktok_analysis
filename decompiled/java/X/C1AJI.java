package X;

import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.1AJI, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AJI {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(List list) {
        ArrayList arrayList = new ArrayList();
        for (RoomSticker roomSticker : (ArrayList) list) {
            RoomSticker roomStickerLIZ = RoomSticker.LIZ(roomSticker);
            roomStickerLIZ.id = roomSticker.id;
            roomStickerLIZ.LIZ = roomSticker.LIZ;
            roomStickerLIZ.type = roomSticker.type;
            roomStickerLIZ.content = roomSticker.content;
            roomStickerLIZ.textColor = roomSticker.textColor;
            roomStickerLIZ.textSize = roomSticker.textSize;
            roomStickerLIZ.xPosition = roomSticker.xPosition;
            roomStickerLIZ.yPosition = roomSticker.yPosition;
            roomStickerLIZ.screenWidth = roomSticker.screenWidth;
            roomStickerLIZ.screenHeight = roomSticker.screenHeight;
            roomStickerLIZ.LIZJ = roomSticker.LIZJ;
            roomStickerLIZ.LIZIZ = roomSticker.LIZIZ;
            arrayList.add(roomStickerLIZ);
        }
        return arrayList;
    }

    public static boolean LIZIZ(DataChannel dataChannel) {
        if (!C781520UlC.LJII((Room) dataChannel.gg0(RoomChannel.class)) && !C781520UlC.LJIIJ((Room) dataChannel.gg0(RoomChannel.class))) {
            return false;
        }
        return true;
    }
}
