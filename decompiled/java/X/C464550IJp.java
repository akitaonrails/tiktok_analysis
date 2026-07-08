package X;

import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* JADX INFO: renamed from: X.0IJp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C464550IJp {
    public static LinkCrossRoomDataHolder LIZIZ() {
        if (LinkCrossRoomDataHolder.LJLLI == null) {
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            LinkCrossRoomDataHolder.LJLLI = new LinkCrossRoomDataHolder(room != null ? room.getId() : 0L, null);
        }
        return LinkCrossRoomDataHolder.LJLLI;
    }

    public static void LIZJ(long j, String str) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        if (linkCrossRoomDataHolder != null && linkCrossRoomDataHolder.LIZ == j) {
            linkCrossRoomDataHolder.LIZJ(str);
            LinkCrossRoomDataHolder linkCrossRoomDataHolder2 = LinkCrossRoomDataHolder.LJLLI;
            if (linkCrossRoomDataHolder2 != null) {
                linkCrossRoomDataHolder2.LIZIZ = null;
            }
            LinkCrossRoomDataHolder.LJLLI = null;
        }
    }

    public static LinkCrossRoomDataHolder LIZ(long j, DataChannel dataChannel, String str) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        if (linkCrossRoomDataHolder != null) {
            linkCrossRoomDataHolder.LIZJ(str);
        }
        LinkCrossRoomDataHolder linkCrossRoomDataHolder2 = LinkCrossRoomDataHolder.LJLLI;
        if (linkCrossRoomDataHolder2 != null) {
            linkCrossRoomDataHolder2.LIZIZ = null;
        }
        LinkCrossRoomDataHolder.LJLLI = null;
        LinkCrossRoomDataHolder linkCrossRoomDataHolder3 = new LinkCrossRoomDataHolder(j, dataChannel);
        LinkCrossRoomDataHolder.LJLLI = linkCrossRoomDataHolder3;
        return linkCrossRoomDataHolder3;
    }
}
