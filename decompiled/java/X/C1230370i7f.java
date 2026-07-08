package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0i7f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1230370i7f {
    public static final /* synthetic */ int LIZ = 0;

    public static C830490Whz LIZ(AbstractC1230540i7w abstractC1230540i7w, String str) {
        String enterMethodForMob;
        String str2;
        String str3;
        if (abstractC1230540i7w.isInviteReflow()) {
            enterMethodForMob = "invitation_sheet";
        } else {
            enterMethodForMob = abstractC1230540i7w.getEnterMethodForMob();
        }
        String enterFromForMob = abstractC1230540i7w.getEnterFromForMob();
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_method", enterMethodForMob);
        if (enterFromForMob.length() > 0) {
            c830490Whz.put("enter_from", enterFromForMob);
        }
        if (abstractC1230540i7w instanceof AbstractC1230690i8B) {
            c830490Whz.put("source", ((AbstractC1230690i8B) abstractC1230540i7w).getInviteSource());
        }
        C1230090i7D groupMetaData = abstractC1230540i7w.getGroupMetaData();
        if (abstractC1230540i7w instanceof C1230560i7y) {
            str2 = "in_app";
        } else if (abstractC1230540i7w instanceof C1230570i7z) {
            str2 = "out_app";
        } else if (abstractC1230540i7w instanceof C1230550i7x) {
            str2 = "active_join";
        } else {
            throw new C1954807lC();
        }
        c830490Whz.put("from_type", str2);
        String str4 = groupMetaData.LJ.get("a:et_chat_type");
        String str5 = "";
        if (str4 == null) {
            str4 = "";
        }
        c830490Whz.put("join_chat_type", str4);
        String str6 = groupMetaData.LJ.get("a:et_group_type");
        if (str6 == null) {
            str6 = "";
        }
        c830490Whz.put("join_group_type", str6);
        c830490Whz.put("user_group_status", String.valueOf(groupMetaData.LIZIZ));
        String str7 = groupMetaData.LJ.get("group_owner_account_type");
        if (str7 != null) {
            str5 = str7;
        }
        c830490Whz.put("group_owner_account_type", str5);
        if (str != null) {
            c830490Whz.put("join_conversation_id", str);
        }
        if (groupMetaData.LIZ.LJIIIIZZ) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c830490Whz.put("approval_required", str3);
        return c830490Whz;
    }

    public static void LIZIZ(String str, String str2, String str3, int i, int i2, Map map) {
        C0I0B.LJFF.LIZIZ();
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_from", str);
        c830490Whz.put("enter_method", str2);
        c830490Whz.put("conversation_id", str3);
        Object obj = map.get("a:et_chat_type");
        Object obj2 = "";
        if (obj == null) {
            obj = "";
        }
        c830490Whz.put("chat_type", obj);
        Object obj3 = map.get("a:et_group_type");
        if (obj3 == null) {
            obj3 = "";
        }
        c830490Whz.put("group_type", obj3);
        Object obj4 = map.get("group_owner_account_type");
        if (obj4 != null) {
            obj2 = obj4;
        }
        c830490Whz.put("group_owner_account_type", obj2);
        c830490Whz.put("status_code", String.valueOf(i));
        c830490Whz.put("user_group_status", String.valueOf(i2));
        C20684815ws.LJIILLIIL("join_group_chat", c830490Whz);
    }

    public static void LIZJ(Boolean bool, String str, String str2, String str3, String str4, String str5, boolean z, Pair... pairArr) {
        String str6;
        String str7;
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_method", str);
        if (z) {
            str6 = "in_app";
        } else {
            str6 = "out_app";
        }
        c830490Whz.put("from_type", str6);
        c830490Whz.put("result", str2);
        if (str3 != null) {
            c830490Whz.put("join_conversation_id", str3);
        }
        if (bool != null) {
            bool.booleanValue();
            if (bool.booleanValue()) {
                str7 = "1";
            } else {
                str7 = CardStruct.IStatusCode.DEFAULT;
            }
            c830490Whz.put("approval_required", str7);
        }
        c830490Whz.put("join_group_type", str4);
        c830490Whz.put("join_chat_type", str5);
        for (Pair pair : pairArr) {
            Object second = pair.getSecond();
            if (second != null) {
                c830490Whz.put(pair.getFirst(), second);
            }
        }
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("click_share_pop", c830490Whz);
    }

    public static void LIZLLL(Boolean bool, String str, String str2, String str3, String str4, String str5, boolean z, Pair... pairArr) {
        String str6;
        String str7;
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_method", str);
        c830490Whz.put("source", str2);
        if (z) {
            str6 = "in_app";
        } else {
            str6 = "out_app";
        }
        c830490Whz.put("from_type", str6);
        if (str3 != null) {
            c830490Whz.put("join_conversation_id", str3);
        }
        if (bool != null) {
            bool.booleanValue();
            if (bool.booleanValue()) {
                str7 = "1";
            } else {
                str7 = CardStruct.IStatusCode.DEFAULT;
            }
            c830490Whz.put("approval_required", str7);
        }
        c830490Whz.put("join_group_type", str4);
        c830490Whz.put("join_chat_type", str5);
        for (Pair pair : pairArr) {
            Object second = pair.getSecond();
            if (C123100dR.LIZ((String) second) && second != null) {
                c830490Whz.put(pair.getFirst(), second);
            }
        }
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("show_share_pop", c830490Whz);
    }
}
