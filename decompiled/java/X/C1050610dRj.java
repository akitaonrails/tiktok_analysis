package X;

import com.ss.android.ugc.aweme.commerce.CouponInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0dRj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1050610dRj extends AbstractC1050620dRk {
    public int LIZJ;

    public C1050610dRj() {
        super(0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01b2, code lost:
    
        if (r9.equals("from_uid_id") != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01c4, code lost:
    
        return ((com.ss.android.ugc.aweme.framework.services.IUserService) com.ss.android.ugc.aweme.framework.services.ServiceManager.get().getService(com.ss.android.ugc.aweme.framework.services.IUserService.class)).getCurrentUserID();
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x036a, code lost:
    
        return com.ss.android.ugc.aweme.feed.model.CardStruct.IStatusCode.DEFAULT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a6, code lost:
    
        if (r9.equals("is_ads") != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0107, code lost:
    
        if (r9.equals("from_user_id") != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0111, code lost:
    
        if (r9.equals("user_id") != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0167, code lost:
    
        if (r9.equals("is_ad") != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0169, code lost:
    
        r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) LJ().get(com.ss.android.ugc.aweme.feed.model.Aweme.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0175, code lost:
    
        if (r0 == null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x017b, code lost:
    
        if (com.ss.android.ugc.aweme.feed.model.AwemeExtKt.isAdTraffic(r0) != true) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x017d, code lost:
    
        if (r2 == 0) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x017f, code lost:
    
        return "1";
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0182, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0251  */
    @Override // X.AbstractC1050620dRk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 972
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1050610dRj.LIZLLL(java.lang.String):java.lang.Object");
    }

    public final void LJIIJ(int i) {
        LIZ(Integer.valueOf(i), "action_type");
        LJII("ttelite_interaction_with_switch_to_PA_sheet", new String[0]);
    }

    public final void LJIILJJIL(String str) {
        LJI("ttelite_ba_contact_ba_editprofile_address_click", new Pair<>("is_success", str), new Pair<>("enter_from", "profile"));
    }

    public final void LJIILLIIL(int i) {
        LIZ(Integer.valueOf(i), "result");
        LJI("ttelite_ba_lead_ba_video_click_getleads", new Pair<>("author_id", LIZLLL("from_uid_id")));
    }

    public final void LJIJI(String str) {
        LJI("ttelite_ba_contact_ba_editprofile_phone_number_click", new Pair<>("enter_from", "Profile"), new Pair<>("is_success", str));
    }

    public final void LJIJJLI(int i) {
        LJI("ttelite_ba_video_product_publish_addlink_click", new Pair<>("link_status", Integer.valueOf(i)));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void LJJI(String str) {
        switch (str.hashCode()) {
            case 3237038:
                if (str.equals("info")) {
                    LJI("ttelite_ba_profile_bizinfo_actionbutton_click", new Pair<>("enter_from", "profile"));
                }
                break;
            case 1224335515:
                if (str.equals("website")) {
                    LJI("ttelite_ba_profile_bizinfo_websitelink_click", new Pair<>("enter_from", "profile"));
                }
                break;
            case 1575275090:
                if (str.equals("leads_from")) {
                    LJI("ttelite_ba_profile_bizinfo_leadsform_click", new Pair<>("enter_from", "profile"));
                }
                break;
            case 1671764162:
                if (str.equals("display")) {
                    LJI("ttelite_ba_profile_bizinfo_display_click", new Pair<>("enter_from", "profile"));
                }
                break;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void LJJIFFI(String str) {
        switch (str.hashCode()) {
            case 3237038:
                if (str.equals("info")) {
                    LJI("ttelite_ba_profile_bizinfo_actionbutton_show", new Pair<>("enter_from", "profile"));
                }
                break;
            case 1224335515:
                if (str.equals("website")) {
                    LJI("ttelite_ba_profile_bizinfo_websitelink_show", new Pair<>("enter_from", "profile"));
                }
                break;
            case 1575275090:
                if (str.equals("leads_from")) {
                    LJI("ttelite_ba_profile_bizinfo_leadsform_show", new Pair<>("enter_from", "profile"));
                }
                break;
            case 1671764162:
                if (str.equals("display")) {
                    LJI("ttelite_ba_profile_bizinfo_display_show", new Pair<>("enter_from", "profile"));
                }
                break;
        }
    }

    public final void LJIIL(Aweme aweme, User user) {
        LJIIIZ(user, aweme);
        LJII("ttelite_ba_contact_click_address", "to_user_id", "from_user_id", "is_ads", "item_id");
    }

    public final void LJIIZILJ(Aweme aweme, User user) {
        this.LIZJ = 1;
        LJIIIZ(user, aweme);
        LJII("ttelite_ba_lead_tt_click_cta", "enter_from", "from_uid_id", "to_user_id", "is_ad", "item_id");
    }

    public final void LJIJJ(int i, String str) {
        LJI("ttelite_ba_contact_tt_click_contact_option", new Pair<>("result", Integer.valueOf(i)), new Pair<>("to_user_id", str), new Pair<>("from_user_id", LIZLLL("from_user_id")));
    }

    public final void LJJIIJZLJL(User user, String str) {
        LJIIIZ(user);
        this.LIZ.put("enter_from", str);
        LJII("ttelite_BA_download_link_show", "from_user_id", "to_user_id", "link_type");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(com.ss.android.ugc.aweme.feed.model.Aweme r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            r2 = 1
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r0 = 0
            r1[r0] = r4
            r3.LJIIIZ(r1)
            java.lang.String r1 = "is_success"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r3.LIZ(r0, r1)
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.LIZ
            java.lang.String r0 = "to_user_id"
            r1.put(r0, r5)
            if (r6 == 0) goto L22
            int r0 = r6.hashCode()
            switch(r0) {
                case -1271119582: goto L54;
                case 3052376: goto L4b;
                case 3322092: goto L42;
                case 1691937916: goto L39;
                default: goto L22;
            }
        L22:
            java.lang.String r6 = "others"
        L24:
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.LIZ
            java.lang.String r0 = "enter_from"
            r1.put(r0, r6)
            java.lang.String r1 = "from_user_id"
            java.lang.String r0 = "item_id"
            java.lang.String[] r1 = new java.lang.String[]{r1, r0}
            java.lang.String r0 = "ttelite_BA_profile_show"
            r3.LJII(r0, r1)
            return
        L39:
            java.lang.String r0 = "homepage_hot"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L24
            goto L22
        L42:
            java.lang.String r0 = "live"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L22
            goto L24
        L4b:
            java.lang.String r0 = "chat"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L24
            goto L22
        L54:
            java.lang.String r0 = "homepage_follow"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L24
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1050610dRj.LJIIJJI(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String):void");
    }

    public final void LJIILL(Aweme aweme, User user, String str, String str2) {
        LJIIIZ(user, aweme);
        this.LIZ.put("enter_from", str);
        this.LIZ.put("email", str2);
        LJII("ttelite_BA_email_button_clicked", "to_user_id", "user_id", "item_id");
    }

    public final void LJIJ(Aweme aweme, String str, String str2, boolean z) {
        int i = 1;
        LJIIIZ(aweme);
        Pair<String, ? extends Object>[] pairArr = new Pair[6];
        pairArr[0] = new Pair<>("enter_from", str2);
        pairArr[1] = new Pair<>("to_user_id", str);
        pairArr[2] = new Pair<>("from_user_id", LIZLLL("from_user_id"));
        pairArr[3] = new Pair<>("is_ads", LIZLLL("is_ads"));
        pairArr[4] = new Pair<>("item_id", LIZLLL("item_id"));
        if (z) {
            i = 2;
        }
        pairArr[5] = new Pair<>("version", Integer.valueOf(i));
        LJI("ttelite_ba_contact_tt_click_call", pairArr);
    }

    public final void LJIL(User user, Aweme aweme, CouponInfo couponInfo, int i) {
        LJIIIZ(user, aweme, couponInfo);
        LIZ(Integer.valueOf(i), "is_success");
        LJII("ttelite_user_coupon_redeem_confirm_click", "to_user_id", "from_user_id", "item_id", "code", "coupon_id", "receive_id");
    }

    public final void LJJ(User user, Aweme aweme, CouponInfo couponInfo, int i) {
        LJIIIZ(user, aweme, couponInfo);
        LIZ(Integer.valueOf(i), "is_new_follower");
        LJII("ttelite_user_coupon_show", "to_user_id", "from_user_id", "item_id", "code", "coupon_id", "receive_id", "is_link", "redeem");
    }

    public final void LJJII(User user, Aweme aweme, int i, int i2) {
        this.LIZJ = i;
        LJIIIZ(user, aweme);
        LIZ(Integer.valueOf(i2), "result");
        LJII("ttelite_ba_lead_tt_enter_instantform", "enter_from", "is_ad");
    }

    public final void LJIILIIL(User user, Aweme aweme, String str, String str2, String str3) {
        LJIIIZ(user, aweme);
        this.LIZ.put("enter_from", str);
        this.LIZ.put("is_success", str2);
        this.LIZ.put("download_url", str3);
        LJII("ttelite_BA_download_link_clicked", "from_user_id", "to_user_id", "link_type", "item_id");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIII(java.lang.String r21, com.ss.android.ugc.aweme.feed.model.Aweme r22, com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r23, java.lang.String r24, java.lang.Object r25, java.lang.String r26) {
        /*
            Method dump skipped, instruction units count: 754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1050610dRj.LJJIII(java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct, java.lang.String, java.lang.Object, java.lang.String):void");
    }
}
