package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.01hh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C404301hh {
    public static final void LIZ(Map map) {
        InterfaceC920220a3Q dataSource;
        ConcurrentHashSet<String> concurrentHashSet = C924950aB3.LIZ;
        if (C931790aM5.LIZIZ()) {
            dataSource = C940770aaZ.LIZ().getDataSource();
        } else {
            dataSource = null;
        }
        map.put("layout_id", C917520Zz4.LIZJ());
        if (dataSource != null) {
            map.put("panel_layout_type", String.valueOf(dataSource.getPanelLayoutType()));
            String strLIZ = dataSource.LIZ();
            if (strLIZ != null) {
                map.put("layout_key", strLIZ);
            }
        }
    }

    public static final void LIZIZ(Map map) {
        String string;
        MultiGuestDataHolder multiGuestDataHolder;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            HashMap map2 = (HashMap) map;
            map2.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            map2.put("room_id", room.getIdStr());
            map2.put("user_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
            map2.put("layout_id", C917520Zz4.LIZJ());
            Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("MULTI_GUEST_DATA_HOLDER");
            if (!(objLJIIIZ instanceof MultiGuestDataHolder) || (multiGuestDataHolder = (MultiGuestDataHolder) objLJIIIZ) == null || (string = Integer.valueOf(multiGuestDataHolder.LJJIFFI).toString()) == null) {
                string = CardStruct.IStatusCode.DEFAULT;
            }
            map2.put("guest_cnt", string);
            map2.put("live_type", room.getStreamType().logStreamingType);
            LIZ(map);
        }
    }
}
