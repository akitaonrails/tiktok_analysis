package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.06Nw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1599006Nw {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, boolean z, int i) {
        String str2;
        String string;
        C0I0B.LJFF.LIZIZ();
        C13DA c13da = new C13DA();
        c13da.put("enter_from", "chat");
        c13da.put("enter_method", "click_quoted_message");
        c13da.put("conversation_id", str);
        if (z) {
            str2 = "success";
        } else {
            str2 = "failed";
        }
        c13da.put("scroll_status", str2);
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf.intValue() <= 0 || (string = numValueOf.toString()) == null) {
            string = "";
        }
        c13da.put("scroll_message_num", string);
        C20684815ws.LJIILLIIL("message_scroll_response", c13da.build());
    }

    public static void LIZIZ(String str, String str2, Long l, String str3, boolean z, String str4, boolean z2) {
        Object obj;
        String string;
        C0I0B.LJFF.LIZIZ();
        C13DA c13da = new C13DA();
        c13da.put("enter_from", "chat");
        c13da.put("conversation_id", str);
        String str5 = "";
        if (str2 == null) {
            str2 = "";
        }
        c13da.put("server_message_id", str2);
        if (l != null && (string = l.toString()) != null) {
            str5 = string;
        }
        c13da.put("message_type", str5);
        c13da.put("chat_type", str3);
        String str6 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c13da.put("is_tappable", obj);
        if (str4 != null && C123100dR.LIZ(str4)) {
            c13da.put("quoted_scene", str4);
        }
        if (!z2) {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        c13da.put("if_tiktok_link", str6);
        C20684815ws.LJIILLIIL("click_dm_quoted_message", c13da.build());
    }
}
