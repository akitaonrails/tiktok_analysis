package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorApplogOpt;
import com.bytedance.android.livesdk.model.Creator;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.LikeMessage;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.BaseMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0UV8, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UV8 implements OnMessageListener {
    public static final C0UV8 LL = new C0UV8();
    public static WeakReference<DataChannel> LLILLJJLI = new WeakReference<>(null);
    public static final C0TI3 LLILLL = new C0TI3(C00BR.SINGLE_START);
    public static final C0UV9 LLILZ = new C0UV9();
    public static final C0UV9 LLILZIL = new C0UV9();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (iMessage instanceof LikeMessage) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("like: ");
            BaseMessage baseMessage = (BaseMessage) iMessage;
            sbLIZ.append(baseMessage.receiveTime - baseMessage.baseMessage.clientSendTime);
            C20441214yg.LIZIZ("LiveApplog", C2188811AlT.LIZIZ(sbLIZ));
            C1276840jKc.LIZ.getClass();
            C1276840jKc.LIZ(1);
            if (LLILZ.LIZ(baseMessage)) {
                C473410IhP.LIZJ(new Runnable() { // from class: X.0UVA
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("LiveBroadcastApplogHelper@b9b4.onMessage$1");
                        try {
                            C0UV9 c0uv9 = C0UV8.LLILZ;
                            c0uv9.LIZIZ(C0UV8.LLILLJJLI.get(), 1);
                            c0uv9.LIZ = 0;
                            c0uv9.LIZIZ = 0L;
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("LiveBroadcastApplogHelper@b9b4.onMessage$1");
                    }
                }, 60000L);
                return;
            }
            return;
        }
        if (!(iMessage instanceof ChatMessage)) {
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("chat: ");
        BaseMessage baseMessage2 = (BaseMessage) iMessage;
        sbLIZ2.append(baseMessage2.receiveTime - baseMessage2.baseMessage.clientSendTime);
        C20441214yg.LIZIZ("LiveApplog", C2188811AlT.LIZIZ(sbLIZ2));
        C1276840jKc.LIZ.getClass();
        C1276840jKc.LIZ(2);
        if (!LLILZ.LIZ(baseMessage2)) {
            return;
        }
        C473410IhP.LIZJ(new Runnable() { // from class: X.0UVB
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LiveBroadcastApplogHelper@b9b4.onMessage$2");
                try {
                    C0UV9 c0uv9 = C0UV8.LLILZIL;
                    c0uv9.LIZIZ(C0UV8.LLILLJJLI.get(), 2);
                    c0uv9.LIZ = 0;
                    c0uv9.LIZIZ = 0L;
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LiveBroadcastApplogHelper@b9b4.onMessage$2");
            }
        }, 60000L);
    }

    public static void LIZ(int i, boolean z, Room room) {
        int i2;
        Room roomLJJLIIIIJ;
        Creator creator;
        LiveMode liveModeLIZJ;
        Object objValueOf;
        if (!LiveAnchorApplogOpt.INSTANCE.enable()) {
            return;
        }
        if (C771670UOv.LJI) {
            i2 = 4;
        } else if (C771670UOv.LJFF) {
            i2 = 2;
        } else {
            DataChannel dataChannel = LLILLJJLI.get();
            if (dataChannel != null && (roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(dataChannel)) != null && (creator = roomLJJLIIIIJ.creator) != null) {
                i2 = creator.roomContinue;
            } else {
                i2 = 0;
            }
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_endlive_page_duration");
        c474500IjALIZ.LJIJJLI(LLILLJJLI.get());
        DataChannel dataChannel2 = LLILLJJLI.get();
        if (dataChannel2 != null) {
            liveModeLIZJ = C751980Tee.LIZJ(dataChannel2);
        } else {
            liveModeLIZJ = null;
        }
        c474500IjALIZ.LJJII(liveModeLIZJ, "live_type");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "resume_scene");
        DataChannel dataChannel3 = LLILLJJLI.get();
        if (dataChannel3 != null) {
            objValueOf = Boolean.valueOf(C500260Jjc.LJJJIL(dataChannel3));
        } else {
            objValueOf = 0;
        }
        c474500IjALIZ.LJJII(objValueOf, "is_try_mode");
        c474500IjALIZ.LJJII(C0UQX.LIZJ(LLILLJJLI.get()), "enter_from");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "r_alert_error_code");
        c474500IjALIZ.LJJII(0, "r_error_code");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "is_finsh_load_success");
        if (room != null) {
            c474500IjALIZ.LJJII(Long.valueOf(room.getId()), "room_id");
            c474500IjALIZ.LJJII(Long.valueOf(room.getOwnerUserId()), "anchor_id");
        }
        C0TI3 c0ti3 = LLILLL;
        c0ti3.LIZJ(c474500IjALIZ);
        c474500IjALIZ.LIZ();
        c0ti3.LIZ();
    }
}
