package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0JG1, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JG1 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C474500IjA c474500IjA) {
        String str;
        Long lValueOf;
        String str2;
        User owner;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room roomLJJLI = C500260Jjc.LJJLI();
        if (C915980Zwa.LIZLLL().J8()) {
            str = "anchor";
        } else {
            str = "user";
        }
        c474500IjA.LJJII(str, "user_type");
        Long lValueOf2 = null;
        if (roomLJJLI != null && (owner = roomLJJLI.getOwner()) != null) {
            lValueOf = Long.valueOf(owner.getId());
        } else {
            lValueOf = null;
        }
        c474500IjA.LJJII(lValueOf, "anchor_id");
        if (roomLJJLI != null) {
            lValueOf2 = Long.valueOf(roomLJJLI.getId());
        }
        c474500IjA.LJJII(lValueOf2, "room_id");
        c474500IjA.LJJII(Long.valueOf(C915980Zwa.LIZLLL().getChannelId()), "channel_id");
        if (C915980Zwa.LIZLLL().L6()) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjA.LJJII(str2, "is_enlarge_mode");
    }
}
