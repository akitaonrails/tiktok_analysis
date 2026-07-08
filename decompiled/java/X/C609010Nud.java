package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import java.util.Set;

/* JADX INFO: renamed from: X.0Nud, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C609010Nud {
    public static final C609010Nud LIZ = new C609010Nud();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.09Gk] */
    /* JADX WARN: Type inference failed for: r8v1, types: [int] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    public static void LIZIZ(C609010Nud c609010Nud, boolean z, Aweme aweme, String str, String str2, String str3, String str4, int i) {
        String str5;
        ?? r8 = z;
        if ((i & 1) != 0) {
            r8 = 0;
        }
        String str6 = "";
        if ((i & 16) != 0) {
            str3 = "";
        }
        if ((i & 32) != 0) {
            str4 = "";
        }
        if ((i & 64) != 0) {
            str5 = "";
        } else {
            str5 = null;
        }
        c609010Nud.getClass();
        Set<String> set = C608890NuR.LIZ;
        if (aweme != null) {
            if (!C13LP.LJJJJ(aweme.getAid(), C608890NuR.LJ)) {
                if (aweme != null) {
                    C608890NuR.LJ.add(aweme.getAid());
                }
            } else {
                return;
            }
        }
        String aid = aweme.getAid();
        String authorUid = AwemeExtKt.getAuthorUid(aweme);
        if (r8 == 0) {
            str6 = str3;
        }
        ?? c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("content_type", "video");
        c2344009Gk.LJIIIIZZ("group_id", aid);
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        c2344009Gk.LIZJ(r8, "is_show");
        c2344009Gk.LJ(1, "is_out_share");
        c2344009Gk.LJIIIIZZ("show_reason", str2);
        c2344009Gk.LJIIIIZZ("unshow_reason", str6);
        c2344009Gk.LJIIIIZZ("pitaya_trace_id", str5);
        c2344009Gk.LJIIIIZZ("platform", str4);
        c2344009Gk.LIZJ(((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() ? 1 : 0, "is_login");
        C20684815ws.LJIILLIIL("recall_quick_external_share_button", c2344009Gk.LIZ);
    }

    public static void LIZ(boolean z, String str, String str2, String str3, String str4, String str5, String str6, int i, Aweme aweme) {
        String str7;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str4);
        if (z) {
            str7 = "show";
        } else {
            str7 = "click";
        }
        c2344009Gk.LJIIIIZZ("action_type", str7);
        c2344009Gk.LJIIIIZZ("trigger", str3);
        c2344009Gk.LJIIIIZZ("content_type", "video");
        c2344009Gk.LJIIIIZZ("group_id", str);
        c2344009Gk.LJIIIIZZ("author_id", str2);
        c2344009Gk.LJIIIIZZ("platform", str5);
        c2344009Gk.LJIIIIZZ("pitaya_trace_id", str6);
        c2344009Gk.LIZJ(i, "is_cache");
        c2344009Gk.LIZJ(((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() ? 1 : 0, "is_login");
        c2344009Gk.LJIIIIZZ("panel_source_v2", "quick_share_button");
        C1357660lQy.LJI(c2344009Gk, aweme);
        C1357660lQy.LJIIIIZZ(c2344009Gk, aweme);
        C1357660lQy.LIZLLL(c2344009Gk, aweme);
        if (!C0R93.LIZ(str4)) {
            int i2 = 1;
            if (z) {
                if (i == 0) {
                    C01GW c01gw = C609000Nuc.LIZ;
                    int iLIZ = C1387310mCn.LIZ(System.currentTimeMillis());
                    Keva kevaLIZLLL = C609000Nuc.LIZLLL();
                    String str8 = C609000Nuc.LJII;
                    if (iLIZ == kevaLIZLLL.getInt(str8, -1)) {
                        Keva kevaLIZLLL2 = C609000Nuc.LIZLLL();
                        String str9 = C609000Nuc.LJFF;
                        i2 = 1 + kevaLIZLLL2.getInt(str9, 0);
                        C609000Nuc.LIZLLL().storeInt(str9, i2);
                    } else {
                        C609000Nuc.LIZLLL().storeInt(C609000Nuc.LJFF, 1);
                        C609000Nuc.LIZLLL().storeInt(str8, iLIZ);
                    }
                    c2344009Gk.LIZJ(i2, "daily_show_count");
                    c2344009Gk.LIZJ(C609000Nuc.LIZIZ(), "daily_click_count");
                } else {
                    c2344009Gk.LIZJ(C609000Nuc.LJ(), "daily_show_count");
                    c2344009Gk.LIZJ(C609000Nuc.LIZIZ(), "daily_click_count");
                }
            } else {
                C01GW c01gw2 = C609000Nuc.LIZ;
                int iLIZ2 = C1387310mCn.LIZ(System.currentTimeMillis());
                Keva kevaLIZLLL3 = C609000Nuc.LIZLLL();
                String str10 = C609000Nuc.LJIIIIZZ;
                if (iLIZ2 == kevaLIZLLL3.getInt(str10, -1)) {
                    Keva kevaLIZLLL4 = C609000Nuc.LIZLLL();
                    String str11 = C609000Nuc.LJI;
                    i2 = 1 + kevaLIZLLL4.getInt(str11, 0);
                    C609000Nuc.LIZLLL().storeInt(str11, i2);
                } else {
                    C609000Nuc.LIZLLL().storeInt(C609000Nuc.LJI, 1);
                    C609000Nuc.LIZLLL().storeInt(str10, iLIZ2);
                }
                c2344009Gk.LIZJ(i2, "daily_click_count");
                c2344009Gk.LIZJ(C609000Nuc.LJ(), "daily_show_count");
            }
        }
        C20684815ws.LJIILLIIL("quick_external_share_button", c2344009Gk.LIZ);
    }
}
