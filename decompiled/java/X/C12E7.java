package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.csi.ISearchCSIService;
import com.ss.android.ugc.ur.creative.CardActionReportData;

/* JADX INFO: renamed from: X.12E7, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12E7 {
    public static final C12E7 LIZ = new C12E7();

    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LIZIZ(X.C12E8 r8) {
        /*
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            java.lang.String r1 = r8.LJIILLIIL
            r8 = 0
            if (r1 == 0) goto L26
            boolean r0 = kotlin.text.a0.LJJJIL(r1)
            r0 = r0 ^ 1
            if (r0 != 0) goto L13
            r1 = r8
        L13:
            if (r1 == 0) goto L26
            com.google.gson.p r0 = new com.google.gson.p     // Catch: java.lang.Throwable -> L28
            r0.<init>()     // Catch: java.lang.Throwable -> L28
            com.google.gson.k r0 = com.google.gson.p.LIZJ(r1)     // Catch: java.lang.Throwable -> L28
            com.google.gson.n r1 = r0.LJIILIIL()     // Catch: java.lang.Throwable -> L28
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L28
            goto L34
        L26:
            r1 = r8
            goto L3d
        L28:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L34:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 == 0) goto L3b
            r1 = r8
        L3b:
            com.google.gson.n r1 = (com.google.gson.n) r1
        L3d:
            java.lang.String r6 = "prop_id"
            if (r1 == 0) goto L92
            com.google.gson.q r0 = r1.LJJIJIIJI(r6)
            if (r0 == 0) goto L92
            java.lang.String r5 = r0.LJIL()
            if (r5 == 0) goto L92
            boolean r0 = kotlin.text.a0.LJJJIL(r5)
            r0 = r0 ^ 1
            if (r0 == 0) goto L92
        L55:
            java.lang.String r4 = "prop_resource_id"
            if (r1 == 0) goto L90
            com.google.gson.q r0 = r1.LJJIJIIJI(r4)
            if (r0 == 0) goto L90
            java.lang.String r3 = r0.LJIL()
            if (r3 == 0) goto L90
            boolean r0 = kotlin.text.a0.LJJJIL(r3)
            r0 = r0 ^ 1
            if (r0 == 0) goto L90
        L6d:
            java.lang.String r2 = "prop_category"
            if (r1 == 0) goto L86
            com.google.gson.q r0 = r1.LJJIJIIJI(r2)
            if (r0 == 0) goto L86
            java.lang.String r1 = r0.LJIL()
            if (r1 == 0) goto L86
            boolean r0 = kotlin.text.a0.LJJJIL(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L86
            r8 = r1
        L86:
            r7.put(r6, r5)
            r7.put(r4, r3)
            r7.put(r2, r8)
            return r7
        L90:
            r3 = r8
            goto L6d
        L92:
            r5 = r8
            goto L55
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12E7.LIZIZ(X.12E8):java.util.Map");
    }

    public static void LIZJ(String str, C12E8 c12e8) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Object obj;
        String str8;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
        c2344009Gk.LJIIIIZZ("topic_id", "");
        c2344009Gk.LJIIIIZZ("category_name", "");
        c2344009Gk.LJIIIIZZ("user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        String str9 = null;
        if (c12e8 != null) {
            str2 = c12e8.LJII;
        } else {
            str2 = null;
        }
        c2344009Gk.LJIIIIZZ("session_id", str2);
        if (c12e8 != null) {
            str3 = c12e8.LJIJ;
        } else {
            str3 = null;
        }
        c2344009Gk.LJIIIIZZ("debuginfo", str3);
        if (c12e8 != null) {
            str4 = c12e8.LJI;
        } else {
            str4 = null;
        }
        c2344009Gk.LJIIIIZZ("search_topic_id", str4);
        if (c12e8 != null) {
            str5 = c12e8.LJI;
        } else {
            str5 = null;
        }
        c2344009Gk.LJIIIIZZ("inspiration_result_id", str5);
        if (c12e8 != null) {
            str6 = c12e8.LJIIIIZZ;
        } else {
            str6 = null;
        }
        c2344009Gk.LJIIIIZZ("inspiration_keyword", str6);
        if (c12e8 != null) {
            str7 = c12e8.LJII;
        } else {
            str7 = null;
        }
        c2344009Gk.LJIIIIZZ("inspiration_reco_id", str7);
        if (c12e8 == null || (obj = c12e8.LJIIL) == null) {
            obj = C13BV.INSTANCE;
        }
        c2344009Gk.LJ(obj, "profile_banner_scene");
        c2344009Gk.LJIIIIZZ("post_chain", "");
        if (c12e8 != null) {
            str8 = c12e8.LJIIJJI;
        } else {
            str8 = null;
        }
        c2344009Gk.LJIIIIZZ("primary_scene", str8);
        if (c12e8 != null) {
            str9 = c12e8.LJIIZILJ;
        }
        c2344009Gk.LJIIIIZZ("search_extra", str9);
        if (c12e8 != null) {
            LIZ.getClass();
            c2344009Gk.LJII(LIZIZ(c12e8));
        }
        C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
    }

    public static void LIZLLL(C12E8 c12e8, C12EA c12ea) {
        int i = C12E9.LIZ[c12ea.ordinal()];
        if (i != 1) {
            if (i == 2) {
                LIZJ("educate_creators_iii_card_click", c12e8);
                return;
            }
            return;
        }
        LIZJ("educate_creators_iii_card_show", c12e8);
    }

    public static void LJ(C12E8 c12e8, boolean z) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(z ? 1 : 0, "fallback_to_online");
        c2344009Gk.LJIIIIZZ("inspiration_reco_id", c12e8.LJII);
        c2344009Gk.LJIIIIZZ("log_id", c12e8.LJIJI);
        if (!z) {
            c2344009Gk.LJIIIIZZ("primary_scene", c12e8.LJIIJJI);
            c2344009Gk.LJIIIIZZ("activity_name", c12e8.LJIILJJIL);
            c2344009Gk.LJFF("search_extra", c12e8.LJIIZILJ);
        }
        C20684815ws.LJIILLIIL("profile_create_with_effect_card_init", c2344009Gk.LIZ);
    }

    public static void LIZ(String str, EnumC2193121AsQ enumC2193121AsQ, CardActionReportData cardActionReportData) {
        ISearchCSIService iSearchCSIService = (ISearchCSIService) PluggableExtentionKt.pluggableSpi$default(ISearchCSIService.class, false, false, false, 14, null);
        if (iSearchCSIService != null) {
            iSearchCSIService.LJ(cardActionReportData.inspirationId, enumC2193121AsQ, str, cardActionReportData.primaryScene, cardActionReportData.topicType, cardActionReportData.activityName);
        }
    }

    public static void LJFF(C12E8 c12e8, boolean z, boolean z2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(z ? 1 : 0, "use_cache");
        c2344009Gk.LIZJ(z2 ? 1 : 0, "fallback_to_online");
        if (!z) {
            c2344009Gk.LJIIIIZZ("inspiration_reco_id", c12e8.LJII);
            c2344009Gk.LJFF("log_id", c12e8.LJIJI);
        }
        if (!z2) {
            c2344009Gk.LJIIIIZZ("primary_scene", c12e8.LJIIJJI);
            c2344009Gk.LJIIIIZZ("activity_name", c12e8.LJIILJJIL);
            c2344009Gk.LJFF("search_extra", c12e8.LJIIZILJ);
        }
        C20684815ws.LJIILLIIL("profile_create_with_effect_card_update", c2344009Gk.LIZ);
    }
}
