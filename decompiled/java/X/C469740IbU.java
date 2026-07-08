package X;

import android.content.Context;
import com.bytedance.android.feed.api.ILiveFeedApiService;
import com.bytedance.android.livesdk.livesetting.feed.LiveTopLiveMultiGuestApplyTime;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.feed.ToplivePageItem;

/* JADX INFO: renamed from: X.0IbU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C469740IbU {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(String str, ToplivePageItem toplivePageItem, String str2) {
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("enter_method", str2);
        pairArr[1] = new Pair("enter_from_merge", "live_merge");
        String str3 = toplivePageItem.cardType;
        if (str3 == null) {
            str3 = "";
        }
        pairArr[2] = new Pair("related_live_tag", str3);
        ((ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class)).Ze1(C2097608Jq.LJIIJ(pairArr));
    }

    public static void LIZ(ToplivePageItem toplivePageItem, List list, Context context, int i, String str) {
        Room room;
        long id;
        ArrayList<EnterRoomConfig> arrayList;
        if (toplivePageItem != null && (room = toplivePageItem.room) != null) {
            room.getId();
            if (context == null) {
                return;
            }
            EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
            C464330IIt.LJ(toplivePageItem.room, enterRoomConfig);
            if (Intrinsics.LJFF(toplivePageItem.itemId, "multi_guest_button")) {
                enterRoomConfig.mRoomsData.delayOpenMultiGuestApplyDialogTime = Integer.valueOf(LiveTopLiveMultiGuestApplyTime.INSTANCE.getValue());
            }
            if (list != null && list.size() > 0) {
                EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
                roomsData.hasMoreExtra = Boolean.FALSE;
                roomsData.maxTimeExtra = 1L;
            }
            EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
            roomsData2.enterMethod = toplivePageItem.enterMethod;
            roomsData2.enterFromMerge = "live_merge";
            roomsData2.enterType = "click";
            EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
            logData.positionOutsideLiveRoom = i;
            Room room2 = toplivePageItem.room;
            if (room2 != null) {
                id = room2.getId();
            } else {
                id = 0;
            }
            String str2 = toplivePageItem.enterMethod;
            if (list != null) {
                list.size();
                arrayList = new ArrayList<>(list.size());
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Room room3 = ((ToplivePageItem) it2.next()).room;
                    if (room3 != null && room3.getId() != id) {
                        EnterRoomConfig enterRoomConfig2 = new EnterRoomConfig();
                        C464330IIt.LJ(room3, enterRoomConfig2);
                        EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig2.mRoomsData;
                        roomsData3.enterMethod = str2;
                        roomsData3.enterFromMerge = "live_merge";
                        enterRoomConfig2.mLogData.requestId = str;
                        arrayList.add(enterRoomConfig2);
                    }
                }
            } else {
                arrayList = null;
            }
            logData.moreConfig = arrayList;
            ((IHostWatch) C1161920gLG.LIZJ(IHostWatch.class)).watchLive(context, enterRoomConfig);
        }
    }
}
