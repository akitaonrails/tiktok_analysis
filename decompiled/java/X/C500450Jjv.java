package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Jjv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C500450Jjv {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(DataChannel dataChannel, Long l, String str, String str2) {
        Long lValueOf;
        User owner;
        String str3;
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJJII(str2, "guide_type");
        if (l != null) {
            c474500IjALIZ.LJJII(Long.valueOf(l.longValue()), "guide_playbook_id");
        }
        if (Intrinsics.LJFF(str, "livesdk_pk_guide_show")) {
            if (C915980Zwa.LIZLLL().L6()) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjALIZ.LJJII(str3, "is_enlarge_mode");
        }
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room roomLJJLI = C500260Jjc.LJJLI();
        Long lValueOf2 = null;
        if (roomLJJLI != null && (owner = roomLJJLI.getOwner()) != null) {
            lValueOf = Long.valueOf(owner.getId());
        } else {
            lValueOf = null;
        }
        List<C954460awe> listLLILZLL = C915980Zwa.LJII().LLILZLL(true);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLILZLL, 10));
        Iterator<C954460awe> it2 = listLLILZLL.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(it2.next().LJ));
        }
        c474500IjALIZ.LJJII(C915980Zwa.LJFF().my(), "sub_match_type");
        c474500IjALIZ.LJJII(lValueOf, "anchor_id");
        if (roomLJJLI != null) {
            lValueOf2 = Long.valueOf(roomLJJLI.getId());
        }
        c474500IjALIZ.LJJII(lValueOf2, "room_id");
        c474500IjALIZ.LJJII(Long.valueOf(C915980Zwa.LIZLLL().getChannelId()), "channel_id");
        c474500IjALIZ.LJJII(Long.valueOf(C915980Zwa.LIZLLL().getBattleId()), "pk_id");
        c474500IjALIZ.LJJII(arrayList.toString(), "uid_list");
        c474500IjALIZ.LJJII(Integer.valueOf(arrayList.size()), "current_connection_cnts");
        c474500IjALIZ.LJJII(C915980Zwa.LIZLLL().pY0(dataChannel), "live_status");
        c474500IjALIZ.LIZ();
    }
}
