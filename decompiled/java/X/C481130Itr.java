package X;

import android.os.Bundle;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.livesdk.dataChannel.RoomShareCountChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Itr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C481130Itr extends C09AY implements Function0<Unit> {
    public final /* synthetic */ DataChannel LL;
    public final /* synthetic */ C1106210etP LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ Bundle LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Room LLIZ;
    public final /* synthetic */ Map<String, String> LLIZLLLIL;
    public final /* synthetic */ Map<String, String> LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ Object LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ String LLJILJILJ;
    public final /* synthetic */ String LLJILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C481130Itr(DataChannel dataChannel, C1106210etP c1106210etP, int i, int i2, Bundle bundle, String str, Room room, Map<String, String> map, Map<String, String> map2, String str2, Object obj, String str3, String str4, String str5) {
        super(0);
        this.LL = dataChannel;
        this.LLILLJJLI = c1106210etP;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = bundle;
        this.LLILZLL = str;
        this.LLIZ = room;
        this.LLIZLLLIL = map;
        this.LLJ = map2;
        this.LLJI = str2;
        this.LLJIJIL = obj;
        this.LLJILJIL = str3;
        this.LLJILJILJ = str4;
        this.LLJILLL = str5;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_share");
        c474500IjALIZ.LJIJJLI(this.LL);
        c474500IjALIZ.LJJIZ(this.LL);
        c474500IjALIZ.LJFF(C0IXW.LIZIZ(null, this.LL, "user_live_share"));
        c474500IjALIZ.LJJII(this.LLILLJJLI.LJLI, "unique_share_id");
        c474500IjALIZ.LJJII(Integer.valueOf(this.LLILLL), "is_create_group_chat");
        c474500IjALIZ.LJJII(Integer.valueOf(this.LLILZ), "friends_shared_cnt");
        c474500IjALIZ.LJJII(C481180Itw.LIZ(this.LLILZIL), "batch_share_type");
        c474500IjALIZ.LJJII(this.LLILZLL, "room_orientation");
        c474500IjALIZ.LJJIIZI(C467820IWe.LIZIZ());
        c474500IjALIZ.LJJII(Integer.valueOf(((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).ip(this.LLIZ.getId())), "server_heat_level");
        c474500IjALIZ.LJJII(Integer.valueOf(((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).v5(this.LLIZ.getId())), "client_heat_level");
        DataChannel dataChannel = this.LL;
        String str = this.LLJILJILJ;
        if (C500260Jjc.LJJIFFI((Boolean) dataChannel.gg0(C0TZM.class))) {
            c474500IjALIZ.LJJII(InterfaceC465670INx.LJLILLLLZI.LIZIZ().booleanValue() ? "close" : "right_panel", "public_area_status");
        }
        if (str != null) {
            c474500IjALIZ.LJJII(str, "multi_tool");
        }
        Map<String, String> map = this.LLJ;
        Room room = this.LLIZ;
        ILiveHostCrossRoomEventHelper iLiveHostCrossRoomEventHelper = (ILiveHostCrossRoomEventHelper) C1161920gLG.LIZJ(ILiveHostCrossRoomEventHelper.class);
        iLiveHostCrossRoomEventHelper.setCoHostCommonParams(map);
        c474500IjALIZ.LJJII(iLiveHostCrossRoomEventHelper.getFromRequestId(), "cohost_from_request_id");
        c474500IjALIZ.LJJII(iLiveHostCrossRoomEventHelper.getFromRoomId(), "cohost_from_room_id");
        iLiveHostCrossRoomEventHelper.addPkTransfer(map, room, "ShareUtils_logLiveShare");
        c474500IjALIZ.LJJIIZI(iLiveHostCrossRoomEventHelper.getMatchLogParams());
        c474500IjALIZ.LJJIIZI(this.LLIZLLLIL);
        c474500IjALIZ.LJJIIZI(this.LLJ);
        Integer num = (Integer) this.LL.gg0(RoomShareCountChannel.class);
        c474500IjALIZ.LJJII(Integer.valueOf(num != null ? num.intValue() : 0), "share_num");
        c474500IjALIZ.LJJII(this.LLJI, "is_guest_connection");
        c474500IjALIZ.LJJII(this.LLJIJIL, "guest_cnt");
        Room room2 = this.LLIZ;
        c474500IjALIZ.LJJII(room2 != null ? room2.getGuestRequestId() : null, "guest_request_id");
        c474500IjALIZ.LJJII(this.LLJILJIL, "distribution_type");
        c474500IjALIZ.LJJIIZI(C2097608Jq.LJIIZILJ(C481150Itt.LIZ));
        String str2 = this.LLJILLL;
        if (C500260Jjc.LJJIIZI(str2)) {
            c474500IjALIZ.LJJII(str2, "panel_source");
        }
        c474500IjALIZ.LIZ();
        C481150Itt.LIZIZ();
        return Unit.LIZ;
    }
}
