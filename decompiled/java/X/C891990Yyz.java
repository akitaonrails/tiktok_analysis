package X;

import android.util.ArrayMap;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Yyz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C891990Yyz {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZIZ(C869590Y9l c869590Y9l) {
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(c869590Y9l.getConversationId());
        if (c0y8tLIZ != null && c0y8tLIZ.isRisky()) {
            return "filtered_message_request";
        }
        return "chat";
    }

    public static void LJ(C869590Y9l c869590Y9l) {
        C0I0B.LJFF.LIZIZ();
        ArrayMap<String, String> arrayMapLIZ = C362101at.LIZ(new Pair("enter_from", LIZIZ(c869590Y9l)));
        if (c869590Y9l.getMsgType() == 1818) {
            arrayMapLIZ.put("real_message_type", String.valueOf(c869590Y9l.getMsgType()));
        }
        C20684815ws.LJIILLIIL("enter_message_permission", arrayMapLIZ);
    }

    public static String LIZ(C869590Y9l c869590Y9l, SessionInfo sessionInfo) {
        if (C0ZDX.LJJIJIIJIL(c869590Y9l)) {
            return "group";
        }
        if (sessionInfo.getChatType() == 0) {
            return "private";
        }
        return "stranger";
    }

    public static void LIZJ(C869590Y9l c869590Y9l, SessionInfo sessionInfo, String str) {
        C0I0B.LJFF.LIZIZ();
        if (sessionInfo != null) {
            ArrayMap<String, String> arrayMapLIZ = C362101at.LIZ(new Pair("enter_from", LIZIZ(c869590Y9l)), new Pair("conversation_id", sessionInfo.getConversationId()), new Pair("chat_type", LIZ(c869590Y9l, sessionInfo)), new Pair("hide_reason", str));
            if (c869590Y9l.getMsgType() == 1818) {
                arrayMapLIZ.put("real_message_type", String.valueOf(c869590Y9l.getMsgType()));
            }
            C20684815ws.LJIILLIIL("hidden_message_click", arrayMapLIZ);
        }
    }

    public static void LIZLLL(C869590Y9l c869590Y9l, SessionInfo sessionInfo, String str) {
        C0I0B.LJFF.LIZIZ();
        ArrayMap<String, String> arrayMapLIZ = C362101at.LIZ(new Pair("enter_from", LIZIZ(c869590Y9l)), new Pair("conversation_id", sessionInfo.getConversationId()), new Pair("chat_type", LIZ(c869590Y9l, sessionInfo)), new Pair("hide_reason", str));
        if (c869590Y9l.getMsgType() == 1818) {
            arrayMapLIZ.put("real_message_type", String.valueOf(c869590Y9l.getMsgType()));
        }
        C20684815ws.LJIILLIIL("hidden_message_show", arrayMapLIZ);
    }
}
