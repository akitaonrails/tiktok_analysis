package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.WhisperMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* JADX INFO: renamed from: X.0TcT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C750630TcT extends AbstractC752950TgD {
    public final C750600TcQ LLILZ;

    public C750630TcT(C750600TcQ c750600TcQ) {
        this.LLILZ = c750600TcQ;
    }

    public final C474500IjA LJIIIZ(String str) {
        Boolean boolValueOf;
        Object obj;
        UserAttr userAttr;
        Object objValueOf;
        Object obj2;
        long id;
        Object objValueOf2;
        Object objValueOf3;
        ChatMessage chatMessage;
        C750600TcQ c750600TcQ = this.LLILZ;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_manage_negative_comment");
        Object objValueOf4 = null;
        if (c750600TcQ.LIZIZ) {
            obj = "anchor";
        } else {
            InterfaceC2262081DgM interfaceC2262081DgM = c750600TcQ.LJI;
            if (interfaceC2262081DgM != null && (userAttr = interfaceC2262081DgM.getUserAttr()) != null) {
                boolValueOf = Boolean.valueOf(userAttr.isAdmin);
            } else {
                boolValueOf = null;
            }
            if (C176600m4.LIZIZ(boolValueOf)) {
                obj = "admin";
            } else {
                obj = "viewer";
            }
        }
        c474500IjALIZ.LJJII(obj, "admin_type");
        User user = c750600TcQ.LIZ;
        if (user != null) {
            objValueOf = Long.valueOf(user.getId());
        } else {
            objValueOf = null;
        }
        c474500IjALIZ.LJJII(objValueOf, "to_user_id");
        AbstractC1136060ffY abstractC1136060ffY = c750600TcQ.LJFF;
        if (!(abstractC1136060ffY instanceof ChatMessage) || (chatMessage = (ChatMessage) abstractC1136060ffY) == null || (obj2 = chatMessage.content) == null) {
            obj2 = "";
        }
        c474500IjALIZ.LJJII(obj2, "live_message");
        c474500IjALIZ.LJJII(str, "manage_action");
        InterfaceC2262081DgM interfaceC2262081DgM2 = c750600TcQ.LJI;
        if (interfaceC2262081DgM2 != null) {
            id = interfaceC2262081DgM2.getId();
        } else {
            id = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(id), "user_id");
        Room room = c750600TcQ.LIZLLL;
        if (room != null) {
            objValueOf2 = Long.valueOf(room.getOwnerUserId());
        } else {
            objValueOf2 = null;
        }
        c474500IjALIZ.LJJII(objValueOf2, "anchor_id");
        Room room2 = c750600TcQ.LIZLLL;
        if (room2 != null) {
            objValueOf3 = Long.valueOf(room2.getId());
        } else {
            objValueOf3 = null;
        }
        c474500IjALIZ.LJJII(objValueOf3, "room_id");
        AbstractC1136060ffY abstractC1136060ffY2 = c750600TcQ.LJFF;
        if (abstractC1136060ffY2 != null) {
            objValueOf4 = Long.valueOf(abstractC1136060ffY2.getMessageId());
        }
        c474500IjALIZ.LJJII(objValueOf4, "msg_id");
        c474500IjALIZ.LJJII(Integer.valueOf(c750600TcQ.LJFF instanceof WhisperMessage ? 1 : 0), "is_whisper");
        return c474500IjALIZ;
    }
}
