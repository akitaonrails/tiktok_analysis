package X;

import android.util.Log;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.MessagesInConversationResponseBody;
import com.bytedance.im.core.proto.Response;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.0Y81, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y81 {
    public static final boolean LIZLLL(Response response) {
        Integer num = response.status_code;
        int i = C0YIF.LIZ;
        if (num == null || num.intValue() != i) {
            Integer num2 = response.status_code;
            if (num2 != null && num2.intValue() == 200) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static final boolean LJ(Response response, boolean z) {
        Integer num;
        if (response == null || (num = response.status_code) == null) {
            return false;
        }
        if (num.intValue() != C0YIG.CONV_NOT_FOUND.getValue() || !z) {
            return false;
        }
        return true;
    }

    public static final List<MessageBody> LIZIZ(MessagesInConversationResponseBody messagesInConversationResponseBody, C0YEM c0yem, int i, String str, String str2) {
        return LIZJ(c0yem.LIZLLL(), c0yem.LJIIZILJ().LJFF().LIZ(), c0yem.LJIIZILJ().LIZ().LIZJ(), messagesInConversationResponseBody.messages_pb, messagesInConversationResponseBody.messages, i, messagesInConversationResponseBody.next_cursor, str, str2, C0Y82.CONVERSATION_CHAIN);
    }

    public static final MessageBody LIZ(C868780Y6i c868780Y6i, C870460YCu c870460YCu, C0YC7 c0yc7, ByteString byteString, int i, Long l, String str, String str2, C0Y82 c0y82) {
        long jLongValue;
        String str3;
        String message;
        try {
            return MessageBody.ADAPTER.decode(byteString);
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            c868780Y6i.LJIIIIZZ(str2, "getMessagesFromResponse failed to decode.", e);
            String str4 = "";
            if (c870460YCu != null) {
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = -1;
                }
                Long lValueOf = Long.valueOf(jLongValue);
                if (str == null) {
                    str3 = "null_log_id";
                } else {
                    str3 = str;
                }
                try {
                    if (e.getMessage() == null) {
                        message = "";
                    } else {
                        message = e.getMessage();
                    }
                    String stackTraceString = Log.getStackTraceString(e);
                    if (stackTraceString.length() > 2000) {
                        stackTraceString = stackTraceString.substring(0, 2000);
                    }
                    C0YJ9 c0yj9 = new C0YJ9(c870460YCu.LIZJ);
                    c0yj9.LIZJ("im_decode_msg_error");
                    c0yj9.LIZ(Integer.valueOf(i), "msg_source");
                    c0yj9.LIZ(message, "error_msg");
                    c0yj9.LIZ(stackTraceString, "error_stack");
                    c0yj9.LIZ(lValueOf, "next_cursor");
                    c0yj9.LIZ(str3, "log_id");
                    c0yj9.LIZLLL();
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
            if (c0yc7 != null) {
                if (str != null) {
                    str4 = str;
                }
                C0Y7G c0y7g = C0Y7G.FAILED_TO_DECODE;
                EnumC868520Y5i enumC868520Y5i = EnumC868520Y5i.RESPONSE_DECODE_FAILED;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("log tag is ");
                sbLIZ.append(str2);
                c0yc7.LIZLLL(0L, 0L, "", 0L, 0, "", str4, "ws", -1, c0y82, new C0Y72(enumC868520Y5i, C2188811AlT.LIZIZ(sbLIZ)), c0y7g, false, "", 0L, false);
                return null;
            }
            return null;
        }
    }

    public static final List<MessageBody> LIZJ(C868780Y6i c868780Y6i, C870460YCu c870460YCu, C0YC7 c0yc7, List<? extends ByteString> list, List<MessageBody> list2, int i, Long l, String str, String str2, C0Y82 c0y82) {
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator<? extends ByteString> it2 = list.iterator();
            while (it2.hasNext()) {
                MessageBody messageBodyLIZ = LIZ(c868780Y6i, c870460YCu, c0yc7, it2.next(), i, l, str, str2, c0y82);
                if (messageBodyLIZ != null) {
                    arrayList.add(messageBodyLIZ);
                }
            }
            return arrayList;
        }
        if (list2 != null && !list2.isEmpty()) {
            return list2;
        }
        return C13BV.INSTANCE;
    }
}
