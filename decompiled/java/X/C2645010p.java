package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.message.PollMessage;
import com.bytedance.android.livesdk.model.message.PollStartContent;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.010p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2645010p extends C09AY implements Function0<Unit> {
    public final /* synthetic */ DataChannel LL;
    public final /* synthetic */ C01C1 LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2645010p(DataChannel dataChannel, C01C1 c01c1, long j, String str, String str2) {
        super(0);
        this.LL = dataChannel;
        this.LLILLJJLI = c01c1;
        this.LLILLL = j;
        this.LLILZ = str;
        this.LLILZIL = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        PollStartContent pollStartContent;
        Room room;
        LiveMode streamType;
        PollStartContent pollStartContent2;
        String str = (C01C5.LIZ(this.LL) || C500260Jjc.LJIIZILJ(this.LL)) ? "livesdk_anchor_custom_poll_card_duration" : "livesdk_poll_card_duration";
        PollMessage pollMessage = this.LLILLJJLI.LJFF;
        String strLIZ = C01C3.LIZ((pollMessage == null || (pollStartContent2 = pollMessage.startContent) == null) ? null : pollStartContent2.operator);
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJIJJLI(this.LL);
        DataChannel dataChannel = this.LL;
        c474500IjALIZ.LJJII((dataChannel == null || (room = (Room) dataChannel.gg0(RoomChannel.class)) == null || (streamType = room.getStreamType()) == null) ? null : C354201Zc.LIZ(streamType), "live_type");
        PollMessage pollMessage2 = this.LLILLJJLI.LJFF;
        c474500IjALIZ.LJJII(pollMessage2 != null ? Long.valueOf(pollMessage2.pollId) : null, "poll_id");
        PollMessage pollMessage3 = this.LLILLJJLI.LJFF;
        c474500IjALIZ.LJJII((pollMessage3 == null || (pollStartContent = pollMessage3.startContent) == null) ? null : pollStartContent.title, "poll_title");
        c474500IjALIZ.LJJII(strLIZ, "poll_sponsor");
        DataChannel dataChannel2 = this.LL;
        if (C01C5.LIZ(dataChannel2)) {
            User userLIZIZ = C0KXJ.LIZIZ();
            c474500IjALIZ.LJJII(userLIZIZ != null ? Long.valueOf(userLIZIZ.getId()) : null, "moderator_id");
            c474500IjALIZ.LJJII("moderator", "user_type");
        } else if (C500260Jjc.LJIIZILJ(dataChannel2)) {
            c474500IjALIZ.LJJII("anchor", "user_type");
        }
        c474500IjALIZ.LJJII(Long.valueOf(this.LLILLL), "duration");
        c474500IjALIZ.LJJII(this.LLILZ, "end_type");
        c474500IjALIZ.LJJII(this.LLILZIL, "enter_from");
        c474500IjALIZ.LIZ();
        return Unit.LIZ;
    }
}
