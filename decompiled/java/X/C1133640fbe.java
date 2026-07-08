package X;

import com.bytedance.android.livesdk.gift.model.GiftPanelCardletByCreator;
import com.bytedance.android.livesdk.userservice.UserService;
import org.json.JSONObject;
import qo2.w;

/* JADX INFO: renamed from: X.0fbe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1133640fbe {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C474500IjA c474500IjA) {
        String str;
        w.LIZ.getClass();
        long jLJ = w.LJ();
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        c474500IjA.LJIL();
        c474500IjA.LJJII("", "enter_from_merge");
        c474500IjA.LJJII(Long.valueOf(w.LJIJJ()), "room_id");
        c474500IjA.LJJII(Long.valueOf(jLJ), "anchor_id");
        c474500IjA.LJJII(Long.valueOf(currentUserId), "user_id");
        if (jLJ == currentUserId) {
            str = "anchor";
        } else {
            str = "user";
        }
        c474500IjA.LJJII(str, "user_type");
        c474500IjA.LJJII(C1128450fTH.LIZLLL(), "connection_type");
    }

    public static String LIZJ(C1146350fw9 c1146350fw9) {
        if (c1146350fw9.LLJJIII.length() > 0) {
            return c1146350fw9.LLJJIII;
        }
        GiftPanelCardletByCreator giftPanelCardletByCreator = (GiftPanelCardletByCreator) C13LP.LJJJLL(c1146350fw9.LLJ);
        if (giftPanelCardletByCreator != null) {
            if (giftPanelCardletByCreator.cardletType == 28) {
                return "eligible_locked";
            }
            if (giftPanelCardletByCreator.cardletType == 29) {
                return "eligible_unlocked";
            }
            return "no_gift";
        }
        return "no_gift";
    }

    public static String LIZLLL(C1146350fw9 c1146350fw9) {
        GiftPanelCardletByCreator giftPanelCardletByCreator = (GiftPanelCardletByCreator) C13LP.LJJJLL(c1146350fw9.LLJ);
        if (giftPanelCardletByCreator != null) {
            if (giftPanelCardletByCreator.cardletType == 28) {
                return "pending_unlock";
            }
            if (giftPanelCardletByCreator.cardletType == 29) {
                return "unlocked";
            }
            return "na";
        }
        return "na";
    }

    public static String LJ(C1146350fw9 c1146350fw9) {
        GiftPanelCardletByCreator giftPanelCardletByCreator = (GiftPanelCardletByCreator) C13LP.LJJJLL(c1146350fw9.LLJ);
        if (giftPanelCardletByCreator != null) {
            int i = giftPanelCardletByCreator.cardletType;
            if (i == 28 || i == 29) {
                return "community_gift";
            }
            return "others";
        }
        return "others";
    }

    public static void LJIIJ(String str, String str2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_creator_gift_record_click");
        LIZ(c474500IjALIZ);
        c474500IjALIZ.LJJII(str, "gift_enter_from");
        c474500IjALIZ.LJJII(str2, "button_type");
        c474500IjALIZ.LIZ();
    }

    public static void LJII(int i, String str, boolean z) {
        String str2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_creator_gift_panel_open");
        LIZ(c474500IjALIZ);
        c474500IjALIZ.LJJII(str, "gift_enter_from");
        if (z) {
            str2 = "gift_record";
        } else {
            str2 = "gifts";
        }
        c474500IjALIZ.LJJII(str2, "tab_name");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "is_use_cache");
        c474500IjALIZ.LIZ();
    }

    public static void LJIIJJI(String str, boolean z, boolean z2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_creator_gift_record_show");
        LIZ(c474500IjALIZ);
        c474500IjALIZ.LJJII(str, "gift_enter_from");
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "is_guide_shown");
        c474500IjALIZ.LJJII(Integer.valueOf(z2 ? 1 : 0), "is_empty");
        c474500IjALIZ.LIZ();
    }

    public static void LJFF(Integer num, Long l, String str, String str2) {
        int iIntValue;
        long jLongValue;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gift_list_bycreator_data_fetch");
        LIZ(c474500IjALIZ);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(iIntValue), "error_code");
        if (str == null) {
            str = "";
        }
        c474500IjALIZ.LJJII(str, "error_msg");
        c474500IjALIZ.LJJII(str2, "log_id");
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(jLongValue), "duration");
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.C474500IjA r14, X.C1146350fw9 r15, boolean r16, boolean r17, boolean r18) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1133640fbe.LIZIZ(X.0IjA, X.0fw9, boolean, boolean, boolean):void");
    }

    public static void LJIIIZ(C1146350fw9 c1146350fw9, boolean z, boolean z2, boolean z3, boolean z4) {
        String str;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_creator_gift_preview_banner_click");
        LIZIZ(c474500IjALIZ, c1146350fw9, z, z2, z3);
        if (z4) {
            str = "button";
        } else {
            str = "text";
        }
        c474500IjALIZ.LJJII(str, "position_clicked");
        c474500IjALIZ.LIZ();
    }

    public static void LJIIL(int i, String str, Long l, Integer num, int i2) {
        long jLongValue;
        int iIntValue;
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            l = null;
        }
        if ((i2 & 8) != 0) {
            num = null;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject.put("stage", i);
        if (str == null) {
            str = "";
        }
        jSONObject2.put("enter_from", str);
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        jSONObject2.put("duration", jLongValue);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        jSONObject2.put("error_code", iIntValue);
        C1CC2.LJ("creator_panel_stage", jSONObject, new JSONObject(), jSONObject2);
    }

    public static void LJIIIIZZ(int i, long j, long j2, long j3, String str, boolean z, boolean z2) {
        String str2;
        int i2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_creator_gift_panel_show");
        LIZ(c474500IjALIZ);
        if (z) {
            str2 = "gift_record";
        } else {
            str2 = "gifts";
        }
        c474500IjALIZ.LJJII(str2, "tab_name");
        c474500IjALIZ.LJJII(Long.valueOf(j2), "live_duration");
        c474500IjALIZ.LJJII(Long.valueOf(j), "from_gift_id");
        if (z2) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "is_from_combo");
        c474500IjALIZ.LJJII(str, "gift_enter_from");
        c474500IjALIZ.LJJII(Long.valueOf(j3), "load_duration");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "is_use_cache");
        c474500IjALIZ.LIZ();
    }

    public static void LJI(C1146350fw9 c1146350fw9, String str, String str2, long j, int i, int i2, int i3, int i4) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_creator_gift_preview");
        LIZ(c474500IjALIZ);
        c474500IjALIZ.LJJII(str, "gift_enter_from");
        c474500IjALIZ.LJJII(str2, "show_type");
        c474500IjALIZ.LJJII(Long.valueOf(j), "gift_id");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "gift_position");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "actual_gift_position");
        c474500IjALIZ.LJJII(Integer.valueOf(i3), "is_gift_campaign");
        c474500IjALIZ.LJJII(Integer.valueOf(i4), "gift_price");
        c474500IjALIZ.LJJII(LJ(c1146350fw9), "gift_subtype");
        c474500IjALIZ.LJJII(LIZLLL(c1146350fw9), "community_gift_status");
        c474500IjALIZ.LJJII(LIZJ(c1146350fw9), "community_gift_status_gift_panel");
        c474500IjALIZ.LIZ();
    }
}
