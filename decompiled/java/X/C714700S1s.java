package X;

import java.util.Locale;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0S1s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C714700S1s implements InterfaceC714600S1i {
    public static final C714700S1s LIZ = new C714700S1s();
    public static final Map<Integer, String> LIZIZ = C2097608Jq.LJIIIIZZ(new Pair(0, "unknown"), new Pair(1, "unread_share"), new Pair(2, "recommend"), new Pair(3, "group_unread_share"));

    @Override // X.InterfaceC714600S1i
    public final void LIZJ(String str, String str2, InterfaceC1493105sv interfaceC1493105sv) {
        interfaceC1493105sv.sendEvent("show_unread_quick_reply_panel", C2097608Jq.LJIIIIZZ(new Pair("enter_from", str), new Pair("enter_method", str2)));
    }

    @Override // X.InterfaceC714600S1i
    public final void LJFF(int i, String str, String str2) {
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("show_quick_reply_pannel", C2097608Jq.LJIIJ(new Pair("enter_from", str), new Pair("to_user_id", str2), new Pair("follow_status", String.valueOf(i))));
    }

    @Override // X.InterfaceC714600S1i
    public final void LJII(String str, String str2, InterfaceC1493105sv interfaceC1493105sv) {
        interfaceC1493105sv.sendEvent("click_unread_quick_reply_panel", C2097608Jq.LJIIIIZZ(new Pair("enter_from", str), new Pair("enter_method", str2)));
    }

    @Override // X.InterfaceC714600S1i
    public final void LIZIZ(String str, String str2, String str3, InterfaceC1493105sv interfaceC1493105sv) {
        interfaceC1493105sv.sendEvent("show_dm_quick_reply_box", C2097608Jq.LJIIIIZZ(new Pair("enter_from", str), new Pair("enter_method", str2), new Pair("trigger_reason", str3)));
    }

    @Override // X.InterfaceC714600S1i
    public final void LIZLLL(int i, InterfaceC1493105sv interfaceC1493105sv, String str, String str2) {
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("enter_from", str);
        pairArr[1] = new Pair("from_user_id", str2);
        String str3 = LIZIZ.get(Integer.valueOf(i));
        if (str3 == null) {
            str3 = "";
        }
        pairArr[2] = new Pair("recommend_type", str3);
        interfaceC1493105sv.sendEvent("show_unread_share_button", C2097608Jq.LJIIIIZZ(pairArr));
    }

    @Override // X.InterfaceC714600S1i
    public final void LJI(int i, String str, String str2, String str3) {
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("click_quick_reply_pannel", C2097608Jq.LJIIJ(new Pair("enter_from", str), new Pair("click_field", str2), new Pair("to_user_id", str3), new Pair("follow_status", String.valueOf(i))));
    }

    @Override // X.InterfaceC714600S1i
    public final void LJIIIIZZ(int i, int i2, InterfaceC1493105sv interfaceC1493105sv, String str) {
        interfaceC1493105sv.sendEvent("share_tag_data", C2097608Jq.LJIIIIZZ(new Pair("is_enable_im_info", String.valueOf(i)), new Pair("is_enable_share_info", String.valueOf(i2)), new Pair("gid", str)));
    }

    @Override // X.InterfaceC714600S1i
    public final void LIZ(String str, String str2, String str3, String str4, InterfaceC1493105sv interfaceC1493105sv) {
        interfaceC1493105sv.sendEvent("reply_friend_im", C2097608Jq.LJIIJ(new Pair("enter_from", str), new Pair("enter_method", "quick_reply_box"), new Pair("event_type", str2), new Pair("group_id", str3), new Pair("author_id", str4), new Pair("position", "quick_reply_box")));
    }

    @Override // X.InterfaceC714600S1i
    public final void LJ(String str, String str2, String str3, EnumC714720S1u enumC714720S1u, InterfaceC1493105sv interfaceC1493105sv) {
        String lowerCase;
        String strName;
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("enter_from", str);
        pairArr[1] = new Pair("enter_method", str2);
        pairArr[2] = new Pair("trigger_reason", str3);
        if (enumC714720S1u == null || (strName = enumC714720S1u.name()) == null || (lowerCase = strName.toLowerCase(Locale.ROOT)) == null) {
            lowerCase = "";
        }
        pairArr[3] = new Pair("action_type", lowerCase);
        interfaceC1493105sv.sendEvent("click_dm_quick_reply_box", C2097608Jq.LJIIIIZZ(pairArr));
    }
}
