package X;

import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.jvm.internal.AFwS189S0000000_3;
import org.json.JSONObject;
import tikcast.linkmic.common.CohostUserInfo;

/* JADX INFO: renamed from: X.0Icc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C470440Icc extends AbstractC497840Jfi implements InterfaceC944340agK {
    public static final C470440Icc LIZ = new C470440Icc();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1380));

    @Override // X.InterfaceC944340agK
    public final long LJJIJ() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJIIJJI;
    }

    @Override // X.InterfaceC944340agK
    public final C945320ahu LJJIJIIJIL() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJII;
    }

    @Override // X.InterfaceC944340agK
    public final void LJJJJ() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ();
    }

    @Override // X.InterfaceC944340agK
    public final C945320ahu LLF() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJIIIIZZ;
    }

    @Override // X.InterfaceC944340agK
    public final boolean LLFZ() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        LinkCrossRoomDataHolder linkCrossRoomDataHolderLIZIZ = C464550IJp.LIZIZ();
        long j = linkCrossRoomDataHolderLIZIZ.LIZLLL;
        return j > 0 && linkCrossRoomDataHolderLIZIZ.LJIIIZ.get(Long.valueOf(j)) == EnumC470470Icf.ROOM_ENTER;
    }

    @Override // X.InterfaceC944340agK
    public final Map<Long, Boolean> LLJL() {
        return (Map) LIZIZ.getValue();
    }

    @Override // X.InterfaceC944340agK
    public final Map<Long, Map<Long, CohostUserInfo>> LLJZ() {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        return C464550IJp.LIZIZ().LJIILIIL;
    }

    @Override // X.InterfaceC944340agK
    public final void LJII(long j) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        LinkCrossRoomDataHolder linkCrossRoomDataHolderLIZIZ = C464550IJp.LIZIZ();
        if (j > 0) {
            linkCrossRoomDataHolderLIZIZ.LIZLLL = j;
            LinkCrossRoomDataHolder.LJLLILLLL = j;
            linkCrossRoomDataHolderLIZIZ.LIZJ = true;
        }
    }

    @Override // X.InterfaceC944340agK
    public final void LJJJJIZL(Map<Long, ? extends Map<Long, CohostUserInfo>> map) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJIILIIL = map;
    }

    @Override // X.InterfaceC944340agK
    public final void LJLILLLLZI(C945320ahu c945320ahu) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJIIIIZZ = c945320ahu;
    }

    @Override // X.InterfaceC944340agK
    public final void LLJILJIL(long j) {
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJIIJJI = j;
    }

    @Override // X.InterfaceC944340agK
    public final void LLLII(C945320ahu c945320ahu) {
        Boolean boolValueOf;
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        C464550IJp.LIZIZ().LJII = c945320ahu;
        if (c945320ahu != null) {
            boolValueOf = Boolean.valueOf(c945320ahu.LIZ());
        } else {
            boolValueOf = null;
        }
        if (C176600m4.LIZIZ(boolValueOf)) {
            LJLILLLLZI(c945320ahu);
        }
    }

    @Override // X.InterfaceC944340agK
    public final Boolean Tn(long j) {
        return (Boolean) ((Map) LIZIZ.getValue()).get(Long.valueOf(j));
    }

    @Override // X.InterfaceC944340agK
    public final void LJLLLL(long j, EnumC470470Icf enumC470470Icf) {
        long ownerUserId;
        String idStr;
        String strLIZ;
        LiveMode streamType;
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = LinkCrossRoomDataHolder.LJLLI;
        LinkCrossRoomDataHolder linkCrossRoomDataHolderLIZIZ = C464550IJp.LIZIZ();
        long currentUserId = 0;
        if (j > 0) {
            if (enumC470470Icf == EnumC470470Icf.ROOM_ENTER) {
                linkCrossRoomDataHolderLIZIZ.LJIIL = System.currentTimeMillis();
            }
            if (linkCrossRoomDataHolderLIZIZ.LJIIIZ.get(Long.valueOf(j)) == null) {
                linkCrossRoomDataHolderLIZIZ.LJIIIZ.put(Long.valueOf(j), enumC470470Icf);
            } else {
                linkCrossRoomDataHolderLIZIZ.LJIIIZ.put(Long.valueOf(j), EnumC470470Icf.SUCCESS);
            }
            linkCrossRoomDataHolderLIZIZ.LJIIJ = System.currentTimeMillis();
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (room != null) {
                ownerUserId = room.getOwnerUserId();
            } else {
                ownerUserId = 0;
            }
            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
            if (interfaceC500940JkiUser != null) {
                currentUserId = interfaceC500940JkiUser.getCurrentUserId();
            }
            if (ownerUserId != currentUserId) {
                JSONObject jSONObject = new JSONObject();
                C0K04.LJ("channel_id", linkCrossRoomDataHolderLIZIZ.LIZLLL, jSONObject);
                if (Room.isValid(room)) {
                    idStr = room.getIdStr();
                } else {
                    idStr = CardStruct.IStatusCode.DEFAULT;
                }
                C0K04.LJFF("room_id", idStr, jSONObject);
                C0K04.LJ("anchor_id", ownerUserId, jSONObject);
                C0K04.LJ("current_user_id", currentUserId, jSONObject);
                C0K04.LJFF("event_id", enumC470470Icf.getValue(), jSONObject);
                if (room != null && (streamType = room.getStreamType()) != null) {
                    strLIZ = C354201Zc.LIZ(streamType);
                } else {
                    strLIZ = null;
                }
                C0K04.LJFF("live_type", strLIZ, jSONObject);
                C1CC2.LJIIIIZZ("ttlive_client_co_host_identify_event", 0, jSONObject);
            }
        }
    }
}
