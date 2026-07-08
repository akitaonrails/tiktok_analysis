package X;

import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.00hp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C150300hp {
    public static final /* synthetic */ int LIZ = 0;

    public static Map LIZ() {
        long id;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        long id2 = 0;
        if (room != null) {
            id = room.getId();
            if (room.getOwner() != null) {
                id2 = room.getOwner().getId();
            }
        } else {
            id = 0;
        }
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("room_id", String.valueOf(id));
        pairArr[1] = new Pair("anchor_id", String.valueOf(id2));
        pairArr[2] = new Pair("user_id", String.valueOf(currentUserId));
        pairArr[3] = new Pair("is_anchor", C150200ho.LIZ() ? "1" : CardStruct.IStatusCode.DEFAULT);
        return C2097608Jq.LJIIIIZZ(pairArr);
    }
}
