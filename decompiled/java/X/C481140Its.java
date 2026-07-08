package X;

import com.bytedance.android.livesdk.dataChannel.RoomShareCountChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Its, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C481140Its extends C09AY implements Function0<Unit> {
    public final /* synthetic */ DataChannel LL;
    public final /* synthetic */ C1106210etP LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Room LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ Object LLJILJILJ;
    public final /* synthetic */ String LLJILLL;
    public final /* synthetic */ Map<String, String> LLJJ;
    public final /* synthetic */ String LLJJI;
    public final /* synthetic */ String LLJJIII;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C481140Its(DataChannel dataChannel, C1106210etP c1106210etP, String str, int i, int i2, String str2, Room room, String str3, String str4, String str5, String str6, String str7, Object obj, String str8, Map<String, String> map, String str9, String str10) {
        super(0);
        this.LL = dataChannel;
        this.LLILLJJLI = c1106210etP;
        this.LLILLL = str;
        this.LLILZ = i;
        this.LLILZIL = i2;
        this.LLILZLL = str2;
        this.LLIZ = room;
        this.LLIZLLLIL = str3;
        this.LLJ = str4;
        this.LLJI = str5;
        this.LLJIJIL = str6;
        this.LLJILJIL = str7;
        this.LLJILJILJ = obj;
        this.LLJILLL = str8;
        this.LLJJ = map;
        this.LLJJI = str9;
        this.LLJJIII = str10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("share");
        c474500IjALIZ.LJIJJLI(this.LL);
        c474500IjALIZ.LJJIZ(this.LL);
        c474500IjALIZ.LJFF(C0IXW.LIZIZ(null, this.LL, "user_live_share"));
        c474500IjALIZ.LJJII(this.LLILLJJLI.LJLI, "unique_share_id");
        c474500IjALIZ.LJJII(this.LLILLL, "request_page");
        c474500IjALIZ.LJJII(Integer.valueOf(this.LLILZ), "is_create_group_chat");
        c474500IjALIZ.LJJII(Integer.valueOf(this.LLILZIL), "friends_shared_cnt");
        c474500IjALIZ.LJJII(this.LLILZLL, "batch_share_type");
        c474500IjALIZ.LJJII(C354201Zc.LIZ(this.LLIZ.getStreamType()), "live_type");
        c474500IjALIZ.LJJII(this.LLIZLLLIL, "share_platform");
        c474500IjALIZ.LJJII("anchor", "user_type");
        c474500IjALIZ.LJJII(this.LLJ, "bind_id");
        c474500IjALIZ.LJJII(C497740JfY.LJIL() ? "portrait" : "landscape", "room_orientation");
        c474500IjALIZ.LJJII(this.LLJI, "hashtag_type");
        c474500IjALIZ.LJJII(this.LLJIJIL, "hash_id");
        Map<String, String> map = this.LLJJ;
        String str = this.LLJJI;
        Room room = this.LLIZ;
        ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) C1161920gLG.LIZJ(ILiveHostCrossRoomEventHelper.class);
        iLiveHostCrossRoomEventHelper.setCoHostCommonParams(map);
        c474500IjALIZ.LJJII(iLiveHostCrossRoomEventHelper.getFromRequestId(), "cohost_from_request_id");
        c474500IjALIZ.LJJII(iLiveHostCrossRoomEventHelper.getFromRoomId(), "cohost_from_room_id");
        if (str != null) {
            c474500IjALIZ.LJJII(str, "multi_tool");
        }
        iLiveHostCrossRoomEventHelper.addPkTransfer(map, room, "ShareUtils_logLiveShare");
        c474500IjALIZ.LJJII("anchor", "initiator");
        Integer num = (Integer) this.LL.gg0(RoomShareCountChannel.class);
        c474500IjALIZ.LJJII(Integer.valueOf(num != null ? num.intValue() : 0), "share_num");
        c474500IjALIZ.LJJII(this.LLJILJIL, "is_guest_connection");
        c474500IjALIZ.LJJII(this.LLJILJILJ, "guest_cnt");
        c474500IjALIZ.LJJII(this.LLJILLL, "distribution_type");
        c474500IjALIZ.LJJIIZI(this.LLJJ);
        c474500IjALIZ.LJJIIZI(C2097608Jq.LJIIZILJ(C481150Itt.LIZ));
        String str2 = this.LLJJIII;
        if (C500260Jjc.LJJIIZI(str2)) {
            c474500IjALIZ.LJJII(str2, "panel_source");
        }
        c474500IjALIZ.LIZ();
        C481150Itt.LIZIZ();
        return Unit.LIZ;
    }
}
