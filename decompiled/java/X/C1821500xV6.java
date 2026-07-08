package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0xV6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1821500xV6 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2, C1781590wSj c1781590wSj) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_third_party_service_return_component");
        c474500IjALIZ.LJJII(c1781590wSj.LIZ, "user_id");
        c474500IjALIZ.LJJII(c1781590wSj.LIZIZ, "anchor_id");
        c474500IjALIZ.LJJII(c1781590wSj.LIZJ, "room_id");
        c474500IjALIZ.LJJII(c1781590wSj.LIZLLL, "show_entrance");
        c474500IjALIZ.LJJII(c1781590wSj.LJ, "third_party_service_name");
        c474500IjALIZ.LJJII(str, "action_type");
        C1821510xV7 c1821510xV7 = new C1821510xV7(str);
        if (str2 == null) {
            str2 = "";
        }
        c474500IjALIZ.LJJIIZ(str2, "click_position", c1821510xV7);
        c474500IjALIZ.LIZ();
    }

    public static void LIZLLL(String str, String str2, C1781590wSj c1781590wSj) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_third_party_term_popup");
        c474500IjALIZ.LJJII(c1781590wSj.LIZ, "user_id");
        c474500IjALIZ.LJJII(c1781590wSj.LIZIZ, "anchor_id");
        c474500IjALIZ.LJJII(c1781590wSj.LIZJ, "room_id");
        c474500IjALIZ.LJJII(c1781590wSj.LIZLLL, "show_entrance");
        c474500IjALIZ.LJJII(c1781590wSj.LJ, "third_party_service_name");
        c474500IjALIZ.LJJII(str, "action_type");
        C1821540xVA c1821540xVA = new C1821540xVA(str);
        if (str2 == null) {
            str2 = "";
        }
        c474500IjALIZ.LJJIIZ(str2, "click_position", c1821540xVA);
        c474500IjALIZ.LIZ();
    }

    public static void LIZIZ(String str, String str2, boolean z, C1781590wSj c1781590wSj) {
        String str3;
        String str4;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_third_party_service_page");
        c474500IjALIZ.LJJII(c1781590wSj.LIZ, "user_id");
        c474500IjALIZ.LJJII(c1781590wSj.LIZIZ, "anchor_id");
        c474500IjALIZ.LJJII(c1781590wSj.LIZJ, "room_id");
        c474500IjALIZ.LJJII(c1781590wSj.LIZLLL, "show_entrance");
        c474500IjALIZ.LJJII(c1781590wSj.LJ, "third_party_service_name");
        c474500IjALIZ.LJJII(str, "action_type");
        C1821520xV8 c1821520xV8 = new C1821520xV8(str);
        if (str2 == null) {
            str3 = "";
        } else {
            str3 = str2;
        }
        c474500IjALIZ.LJJIIZ(str3, "click_position", c1821520xV8);
        C1821530xV9 c1821530xV9 = new C1821530xV9(str, str2);
        if (z) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJIIZ(str4, "is_return_primary_page", c1821530xV9);
        c474500IjALIZ.LIZ();
    }
}
