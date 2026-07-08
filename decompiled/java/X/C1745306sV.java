package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.06sV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1745306sV {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2, EnumC1745406sW enumC1745406sW, int i, String str3, String str4, boolean z, String str5) {
        Object obj;
        C0I0B.LJFF.LIZIZ();
        C830490Whz c830490Whz = new C830490Whz();
        if (str == null) {
            str = "";
        }
        c830490Whz.put("enter_from", str);
        if (str2 == null) {
            str2 = "";
        }
        c830490Whz.put("enter_method", str2);
        c830490Whz.put("message_type", enumC1745406sW.getLogValue());
        c830490Whz.put("relation_tag", String.valueOf(i));
        c830490Whz.put("set_by", str3);
        if (str4 != null) {
            c830490Whz.put("traffic_type", str4);
        }
        String str6 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c830490Whz.put("if_with_form_card", obj);
        if (str5 != null && C123100dR.LIZ(str5)) {
            c830490Whz.put("extra_info", str5);
        }
        if (!z) {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        c830490Whz.put("if_with_form_card", str6);
        C20684815ws.LJIILLIIL("dm_system_message_received", c830490Whz);
    }

    public static void LIZIZ(String str, String str2, EnumC1745406sW enumC1745406sW, String str3, int i, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        C0I0B.LJFF.LIZIZ();
        C830490Whz c830490Whz = new C830490Whz();
        if (str == null) {
            str = "";
        }
        c830490Whz.put("enter_from", str);
        if (str2 == null) {
            str2 = "";
        }
        c830490Whz.put("enter_method", str2);
        c830490Whz.put("message_type", enumC1745406sW.getLogValue());
        c830490Whz.put("relation_tag", String.valueOf(i));
        c830490Whz.put("set_by", str4);
        c830490Whz.put("traffic_type", str5);
        if (str3 != null) {
            c830490Whz.put("sub_message_type", str3);
        }
        if (str6 != null) {
            c830490Whz.put("account_type", str6);
        }
        if (str7 != null) {
            c830490Whz.put("other_user_account_type", str7);
        }
        if (str8 != null) {
            c830490Whz.put("to_user_id", str8);
        }
        if (str9 != null) {
            c830490Whz.put("conversation_id", str9);
        }
        if (str10 != null) {
            c830490Whz.put("extra_info", str10);
        }
        C20684815ws.LJIILLIIL("message_mock", c830490Whz);
    }
}
