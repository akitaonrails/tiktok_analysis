package X;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0Yl8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C883400Yl8 {
    public static final boolean LIZ(WsChannelMsg wsChannelMsg) {
        WsChannelMsg.MsgHeader msgHeader;
        String str;
        Iterator<WsChannelMsg.MsgHeader> it2 = wsChannelMsg.msgHeaders.iterator();
        while (true) {
            msgHeader = null;
            String str2 = null;
            if (!it2.hasNext()) {
                break;
            }
            WsChannelMsg.MsgHeader next = it2.next();
            WsChannelMsg.MsgHeader msgHeader2 = next;
            if (msgHeader2 != null) {
                str2 = msgHeader2.key;
            }
            if (u.LJIJI(str2, "is_ack", true)) {
                msgHeader = next;
                break;
            }
        }
        WsChannelMsg.MsgHeader msgHeader3 = msgHeader;
        if (msgHeader3 != null && (str = msgHeader3.value) != null) {
            return str.equals("1");
        }
        return false;
    }

    public static final boolean LIZIZ(WsChannelMsg wsChannelMsg) {
        WsChannelMsg.MsgHeader msgHeader;
        String str;
        Iterator<WsChannelMsg.MsgHeader> it2 = wsChannelMsg.msgHeaders.iterator();
        while (true) {
            msgHeader = null;
            String str2 = null;
            if (!it2.hasNext()) {
                break;
            }
            WsChannelMsg.MsgHeader next = it2.next();
            WsChannelMsg.MsgHeader msgHeader2 = next;
            if (msgHeader2 != null) {
                str2 = msgHeader2.key;
            }
            if (u.LJIJI(str2, "code", true)) {
                msgHeader = next;
                break;
            }
        }
        WsChannelMsg.MsgHeader msgHeader3 = msgHeader;
        if (msgHeader3 != null && (str = msgHeader3.value) != null) {
            return str.equals(CardStruct.IStatusCode.DEFAULT);
        }
        return false;
    }
}
