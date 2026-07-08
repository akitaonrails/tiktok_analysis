package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorApplogOpt;
import com.bytedance.android.livesdk.model.Creator;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.BaseMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0UV9, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UV9 {
    public int LIZ;
    public long LIZIZ;

    public final boolean LIZ(BaseMessage baseMessage) {
        C0UV8 c0uv8 = C0UV8.LL;
        long j = baseMessage.receiveTime - baseMessage.baseMessage.clientSendTime;
        int i = this.LIZ;
        this.LIZIZ = (long) ((this.LIZIZ * (i / (i + 1))) + (j / ((long) (i + 1))));
        int i2 = i + 1;
        this.LIZ = i2;
        if (i2 == 1) {
            return true;
        }
        return false;
    }

    public final void LIZIZ(DataChannel dataChannel, int i) {
        int i2;
        Room roomLJJLIIIIJ;
        Creator creator;
        Object objValueOf;
        if (!LiveAnchorApplogOpt.INSTANCE.enable()) {
            return;
        }
        if (C771670UOv.LJI) {
            i2 = 4;
        } else if (C771670UOv.LJFF) {
            i2 = 2;
        } else if (dataChannel != null && (roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel)) != null && (creator = roomLJJLIIIIJ.creator) != null) {
            i2 = creator.roomContinue;
        } else {
            i2 = 0;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_room_interactive_duration");
        c474500IjALIZ.LJIJJLI(C0UV8.LLILLJJLI.get());
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "resume_scene");
        DataChannel dataChannel2 = C0UV8.LLILLJJLI.get();
        if (dataChannel2 != null) {
            objValueOf = Boolean.valueOf(C500260Jjc.LJJJIL(dataChannel2));
        } else {
            objValueOf = 0;
        }
        c474500IjALIZ.LJJII(objValueOf, "is_try_mode");
        c474500IjALIZ.LJJII(C0UQX.LIZJ(C0UV8.LLILLJJLI.get()), "enter_from");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "interactive_type");
        c474500IjALIZ.LJJII(Long.valueOf(this.LIZIZ), "t_interactive_duration");
        c474500IjALIZ.LJJII(0, "r_interactive_code");
        c474500IjALIZ.LJJII(1, "r_interactive_display");
        c474500IjALIZ.LIZ();
    }
}
