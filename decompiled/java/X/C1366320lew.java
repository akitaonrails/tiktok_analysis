package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lew, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1366320lew {
    public static final C1366320lew LIZ = new C1366320lew();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZLLL() {
        /*
            java.lang.Class<com.ss.android.ugc.aweme.screenshot.IScreenshotService> r0 = com.ss.android.ugc.aweme.screenshot.IScreenshotService.class
            r1 = 0
            r4 = 14
            r5 = 0
            r2 = r1
            r3 = r1
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r0, r1, r2, r3, r4, r5)
            com.ss.android.ugc.aweme.screenshot.IScreenshotService r0 = (com.ss.android.ugc.aweme.screenshot.IScreenshotService) r0
            if (r0 == 0) goto L16
            java.lang.String r1 = r0.LJII()
            if (r1 != 0) goto L18
        L16:
            java.lang.String r1 = ""
        L18:
            int r0 = r1.hashCode()
            switch(r0) {
                case -1271119582: goto L22;
                case -689602459: goto L2b;
                case -667094460: goto L34;
                case -562830579: goto L3d;
                case 177132768: goto L46;
                case 809483594: goto L4f;
                case 998835423: goto L58;
                case 1619681829: goto L61;
                case 1691937916: goto L6a;
                case 1939832648: goto L73;
                case 2115406067: goto L7c;
                default: goto L1f;
            }
        L1f:
            java.lang.String r1 = "other_page"
        L21:
            return r1
        L22:
            java.lang.String r0 = "homepage_follow"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L21
            goto L1f
        L2b:
            java.lang.String r0 = "group_chat_feed"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L85
            goto L1f
        L34:
            java.lang.String r0 = "homepage_friends"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L21
            goto L1f
        L3d:
            java.lang.String r0 = "personal_homepage"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L21
            goto L1f
        L46:
            java.lang.String r0 = "video_edit_page"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L21
            goto L1f
        L4f:
            java.lang.String r0 = "others_homepage"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L21
            goto L1f
        L58:
            java.lang.String r0 = "general_search"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L21
            goto L1f
        L61:
            java.lang.String r0 = "chat_feed"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L85
            goto L1f
        L6a:
            java.lang.String r0 = "homepage_hot"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L21
            goto L1f
        L73:
            java.lang.String r0 = "poi_detail_page"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L21
            goto L1f
        L7c:
            java.lang.String r0 = "video_shoot_page"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L21
            goto L1f
        L85:
            java.lang.String r1 = "video_detail_page"
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1366320lew.LIZLLL():java.lang.String");
    }

    public static void LIZ(C1366320lew c1366320lew, String str, String str2) {
        C0I0B.LJFF.LIZIZ();
        c1366320lew.getClass();
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_from", str);
        if (Intrinsics.LJFF(str, "video_detail_page")) {
            c830490Whz.put("enter_dm", "video_detail_page");
        }
        c830490Whz.put("action_type", str2);
        C20684815ws.LJIILLIIL("click_screenshot_floating_layer", c830490Whz);
    }

    public static void LIZIZ(C1366320lew c1366320lew, String str, String str2) {
        C0I0B.LJFF.LIZIZ();
        c1366320lew.getClass();
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_from", str);
        c830490Whz.put("action_type", str2);
        if (Intrinsics.LJFF(str, "video_detail_page")) {
            c830490Whz.put("enter_dm", "video_detail_page");
        }
        C20684815ws.LJIILLIIL("click_screenshot_more_panel", c830490Whz);
    }

    public static void LIZJ(C1366320lew c1366320lew, String str, String str2, String str3, String str4, int i) {
        InterfaceC1493505sz interfaceC1493505szLIZIZ = null;
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        if ((i & 16) != 0) {
            interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        }
        c1366320lew.getClass();
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_from", str);
        if (Intrinsics.LJFF(str, "video_detail_page")) {
            c830490Whz.put("enter_dm", "video_detail_page");
        }
        if (str3 != null) {
            c830490Whz.put("to_user_id", str3);
        }
        if (str4 != null) {
            c830490Whz.put("conversation_id", str4);
        }
        c830490Whz.put("action_type", str2);
        interfaceC1493505szLIZIZ.getClass();
        C20684815ws.LJIILLIIL("click_screenshot_share_panel", c830490Whz);
    }
}
