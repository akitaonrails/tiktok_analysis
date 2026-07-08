package X;

import android.text.TextUtils;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0IKB, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IKB {
    public static final void LIZ(List<? extends Room> list, List<EnterRoomConfig> list2, int i, Map<String, String> map) {
        int size;
        Room room;
        boolean zBooleanValue;
        String str;
        EnterRoomConfig.RoomsData roomsData;
        EnterRoomConfig.RoomsData roomsData2;
        Boolean bool;
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return;
        }
        String str2 = C0IL2.LIZ.LIZ().mEnterRoomConfig.mRoomsData.enterFromMerge;
        if ((!TextUtils.equals(str2, "homepage_hot") && !TextUtils.equals(str2, "homepage_follow") && !TextUtils.equals(str2, "live_merge")) || (size = arrayList.size() - 1) < 0 || (room = (Room) ListProtector.get(arrayList, size)) == null) {
            return;
        }
        EnterRoomConfig enterRoomConfig = (EnterRoomConfig) C13LP.LJJJLZIJ(size, list2);
        if (enterRoomConfig != null && (roomsData = enterRoomConfig.mRoomsData) != null && roomsData.roomId == room.getId() && (roomsData2 = enterRoomConfig.mRoomsData) != null && (bool = roomsData2.hasCommerceGoods) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = room.hasCommerceGoods;
        }
        HashMap map2 = (HashMap) map;
        map2.put("slide_entrance_gid", String.valueOf(room.getId()));
        map2.put("slide_room_position", String.valueOf(size));
        if (zBooleanValue) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map2.put("slide_entrance_is_ecom_room", str);
        map2.put("slide_req_num", String.valueOf(i + 1));
    }
}
