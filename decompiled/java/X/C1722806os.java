package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.06os, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1722806os {
    public static final /* synthetic */ int LIZ = 0;

    public static Map LIZ(C869590Y9l c869590Y9l, String str, String str2) {
        String str3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", str);
        linkedHashMap.put("enter_method", str2);
        if (C0ZDX.LJJJJI(c869590Y9l)) {
            str3 = "ai_chatbot";
        } else {
            str3 = "";
        }
        linkedHashMap.put("source", str3);
        linkedHashMap.put("msg_type", String.valueOf(c869590Y9l.getMsgType()));
        linkedHashMap.put("conversation_id", String.valueOf(c869590Y9l.getConversationShortId()));
        linkedHashMap.put("msg_id", String.valueOf(c869590Y9l.getMsgId()));
        return linkedHashMap;
    }
}
