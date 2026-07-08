package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0fFt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1120150fFt {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(int i, String str) {
        String str2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_panel_guide_bubble_show");
        c474500IjALIZ.LJIL();
        if (C150200ho.LIZ()) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJIIZI(C2097908Jt.LIZJ(new Pair("is_anchor", str2)));
        C1128760fTm c1128760fTm = C1128760fTm.LJIIJ;
        c474500IjALIZ.LJJII(C1128460fTI.LJIIJ(Integer.valueOf(i), ""), "to_tab");
        c474500IjALIZ.LJJII(str, "bubble_id");
        c474500IjALIZ.LIZ();
    }

    public static void LIZ(int i, String str, boolean z) {
        String str2;
        String str3;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_panel_guide_bubble_click");
        c474500IjALIZ.LJIL();
        if (C150200ho.LIZ()) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJIIZI(C2097908Jt.LIZJ(new Pair("is_anchor", str2)));
        C1128760fTm c1128760fTm = C1128760fTm.LJIIJ;
        c474500IjALIZ.LJJII(C1128460fTI.LJIIJ(Integer.valueOf(i), ""), "to_tab");
        c474500IjALIZ.LJJII(str, "bubble_id");
        if (z) {
            str3 = "gift_icon";
        } else {
            str3 = "bubble";
        }
        c474500IjALIZ.LJJII(str3, "click_type");
        c474500IjALIZ.LIZ();
    }
}
