package X;

import com.ss.android.ugc.aweme.im.sdk.chatdetail.analytics.IMGroupChatDetailAnalytics;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.05ya, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1528205ya implements C0I13 {
    public static final C1528205ya LIZJ = new C1528205ya();

    @Override // X.C0I13
    public final C830490Whz LJIIJ(String str, InterfaceC1493105sv interfaceC1493105sv) {
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("conversation_id", str);
        c830490Whz.put("chat_type", C1229100i5c.LIZLLL(str));
        c830490Whz.put("group_type", C1229100i5c.LJI(str));
        String strLJJIFFI = C0ZFW.LIZ.LJJIFFI(str);
        if (strLJJIFFI != null) {
            c830490Whz.put("group_owner_account_type", C1528505yd.LIZ(strLJJIFFI));
        }
        return c830490Whz;
    }

    public static final void LIZIZ(String str, String str2, InterfaceC1493105sv interfaceC1493105sv) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1528005yY(interfaceC1493105sv, str, str2, null), 3);
    }

    public static final void LIZLLL(String str, String str2, InterfaceC1493105sv interfaceC1493105sv) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1528105yZ(interfaceC1493105sv, str, str2, null), 3);
    }

    @Override // X.C0I13
    public final void LJIJJ(int i, long j, InterfaceC1493105sv interfaceC1493105sv, String str) {
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("duration", String.valueOf(j));
        c830490Whz.put("count", String.valueOf(i));
        c830490Whz.put("contact_type", str);
        interfaceC1493105sv.sendEvent("fetch_group_permission_performance", c830490Whz);
    }

    @Override // X.C0I13
    public final void LJJIII(String str, String str2, Pair<? extends Object, String>[] pairArr, InterfaceC1493105sv interfaceC1493105sv) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1527805yW(str2, pairArr, interfaceC1493105sv, str, null), 3);
    }

    @Override // X.C0I13
    public final void LJII(String str, int i, List<String> list, String str2, InterfaceC1493105sv interfaceC1493105sv) {
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_method", str);
        c830490Whz.put("to_role", String.valueOf(i));
        c830490Whz.put("to_user_id_set", IMGroupChatDetailAnalytics.LJIIJ(list));
        c830490Whz.put("conversation_id", str2);
        c830490Whz.put("group_type", C1229100i5c.LJI(str2));
        interfaceC1493105sv.sendEvent("update_group_member_role", c830490Whz);
    }

    @Override // X.C0I13
    public final void LJJIIJ(InterfaceC1493105sv interfaceC1493105sv, Integer num, String str, String str2, String str3, String str4, String str5, String str6) {
        String string;
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_from", str2);
        c830490Whz.put("enter_method", str3);
        c830490Whz.put("conversation_id", str);
        c830490Whz.put("chat_type", str4);
        c830490Whz.put("group_type", str5);
        if (num == null || (string = num.toString()) == null) {
            string = "";
        }
        c830490Whz.put("action_type", string);
        c830490Whz.put("interaction_type", str6);
        interfaceC1493105sv.sendEvent("group_join_check_panel_interaction", c830490Whz);
    }

    public static final void LJ(String str, String str2, String str3, String str4, String str5, String str6, String str7, Map<String, String> map, int i, InterfaceC1493105sv interfaceC1493105sv) {
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_from", str2);
        c830490Whz.put("enter_method", str3);
        c830490Whz.put("conversation_id", str);
        c830490Whz.put("result", str4);
        if (str5 != null) {
            c830490Whz.put("chat_type", str5);
        }
        if (str6 != null) {
            c830490Whz.put("group_type", str6);
        }
        if (C123100dR.LIZ(str7) && str7 != null) {
            c830490Whz.put("unqualified_reasons", str7);
        }
        if (map != null) {
            c830490Whz.putAll(map);
        }
        c830490Whz.put("status_code", String.valueOf(i));
        interfaceC1493105sv.sendEvent("join_group_chat", c830490Whz);
    }
}
