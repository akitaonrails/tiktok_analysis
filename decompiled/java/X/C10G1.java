package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSConsentSDKConfigService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.lemon.Lemon8ProfileContentSyncConfig;
import com.ss.android.ugc.aweme.lemon.profile.L8ContentSyncLocalSkipConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10G1, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10G1 {
    public static boolean LIZJ;
    public static final C10G1 LIZ = new C10G1();
    public static String LIZIZ = "";
    public static final Map<String, Pair<C10G6, C10G5>> LIZLLL = new LinkedHashMap();
    public static boolean LJ = true;
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(141));
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(405));
    public static long LJII = -1;

    static {
        SettingsManager.LIZLLL().LJIIIZ(new InterfaceC304970BxP() { // from class: X.10G2
            @Override // X.InterfaceC304970BxP
            public final void LIZ() {
                if (C10G1.LJ) {
                    C10G1.LIZ.getClass();
                    Lemon8ProfileContentSyncConfig lemon8ProfileContentSyncConfigLIZ = C19216910Fz.LIZ();
                    Pair pair = (Pair) ((LinkedHashMap) C10G1.LIZLLL).get(lemon8ProfileContentSyncConfigLIZ.uid);
                    if (pair != null) {
                        C10G6 c10g6 = (C10G6) pair.getFirst();
                        C10G5 c10g5 = (C10G5) pair.getSecond();
                        if (System.currentTimeMillis() - c10g5.LIZLLL <= 30000) {
                            C10G6 c10g62 = new C10G6(lemon8ProfileContentSyncConfigLIZ, c10g6.LIZIZ, Math.max(c10g6.LIZJ, lemon8ProfileContentSyncConfigLIZ.curShowedCount), c10g6.LIZLLL, c10g6.LJ, c10g6.LJFF, c10g6.LJI, c10g6.LJII, c10g6.LJIIIIZZ);
                            C10G3.LIZ.getClass();
                            boolean z = C10G3.LIZ(c10g62).LIZ;
                            boolean z2 = c10g5.LIZ;
                            if (z != z2) {
                                int i = C10G1.LIZIZ().getInt("server_api_show_count_v2", 0);
                                C2344009Gk c2344009Gk = new C2344009Gk();
                                c2344009Gk.LJ(Boolean.valueOf(z2), "is_client_showed");
                                c2344009Gk.LIZLLL(c10g6.LIZLLL, "last_show_time_stamp");
                                c2344009Gk.LIZLLL(c10g6.LJFF, "current_time_stamp");
                                c2344009Gk.LIZJ(c10g6.LIZJ, "local_show_count");
                                c2344009Gk.LJ(Boolean.valueOf(c10g6.LIZ.canShowPopup), "cache_can_show_popup");
                                c2344009Gk.LIZJ(c10g6.LIZ.curShowedCount, "cache_cur_show_count");
                                c2344009Gk.LIZJ(c10g6.LIZ.maxShowCount, "cache_max_show_count");
                                c2344009Gk.LIZJ(c10g6.LIZ.minShowDurationDay, "cache_min_show_duration_day");
                                c2344009Gk.LJ(Boolean.valueOf(lemon8ProfileContentSyncConfigLIZ.canShowPopup), "server_can_show_popup");
                                c2344009Gk.LIZJ(lemon8ProfileContentSyncConfigLIZ.curShowedCount, "server_cur_show_count");
                                c2344009Gk.LIZJ(lemon8ProfileContentSyncConfigLIZ.maxShowCount, "server_max_show_count");
                                c2344009Gk.LIZJ(lemon8ProfileContentSyncConfigLIZ.minShowDurationDay, "server_min_show_duration_day");
                                c2344009Gk.LIZJ(i, "server_sync_api_show_count");
                                c2344009Gk.LIZJ(lemon8ProfileContentSyncConfigLIZ.minConfigShowDurationDay, "cache_min_config_show_duration_day");
                                C20684815ws.LJIILLIIL("rd_tt_phototext_standalone_sync_post_show_result_mismatch", c2344009Gk.LIZ);
                            }
                        }
                    }
                }
                C10G1.LJ = true;
            }
        });
    }

    public static Keva LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("lemon8_profile_content_sync");
        sbLIZ.append(LIZIZ);
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static int LIZ(Lemon8ProfileContentSyncConfig lemon8ProfileContentSyncConfig) {
        int i = LIZIZ().getInt("local_popup_show_count_v2", 0);
        int i2 = LIZIZ().getInt("server_api_show_count_v2", 0);
        int i3 = lemon8ProfileContentSyncConfig.curShowedCount;
        int iMax = Math.max(i2, i3);
        if (i < iMax) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ(1, "reason");
            c2344009Gk.LIZJ(i, "origin_count");
            c2344009Gk.LIZJ(i3, "update_count");
            C20684815ws.LJIILLIIL("rd_tt_phototext_standalone_sync_post_update_show_count", c2344009Gk.LIZ);
            LIZIZ().storeInt("local_popup_show_count_v2", iMax);
            return iMax;
        }
        return i;
    }

    public static boolean LIZLLL(boolean z) {
        EnumC1876780ywG enumC1876780ywGLIZ;
        Integer num;
        C10G7 c10g7;
        int iIntValue;
        Object c098200Yq;
        String str;
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        if (!Intrinsics.LJFF(curUserId, LIZIZ)) {
            LIZIZ = curUserId;
        }
        Lemon8ProfileContentSyncConfig lemon8ProfileContentSyncConfigLIZ = C19216910Fz.LIZ();
        int i = lemon8ProfileContentSyncConfigLIZ.showStyle;
        if (i == 1) {
            return false;
        }
        if (!z && (i != 7 || PopupManager.LJI())) {
            return false;
        }
        String str2 = LIZIZ;
        int iLIZ = LIZ(lemon8ProfileContentSyncConfigLIZ);
        long j = LIZIZ().getLong("last_show_timestamp_v2", 0L);
        long j2 = LIZIZ().getLong("config_dialog_last_show_timestamp_v2", 0L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z2 = !LJ;
        IPNSConsentSDKConfigService iPNSConsentSDKConfigService = (IPNSConsentSDKConfigService) PluggableExtentionKt.pluggableSpi$default(IPNSConsentSDKConfigService.class, false, false, false, 14, null);
        if (iPNSConsentSDKConfigService != null && iPNSConsentSDKConfigService.LIZ() != null) {
            enumC1876780ywGLIZ = C1915720zx4.LIZ(EnumC683800Qry.DATA_POST_SYNC_TO_LEMON8.getKey(), null);
        } else {
            enumC1876780ywGLIZ = null;
        }
        C10G6 c10g6 = new C10G6(lemon8ProfileContentSyncConfigLIZ, str2, iLIZ, j, j2, jCurrentTimeMillis, z2, enumC1876780ywGLIZ, LIZJ);
        C10G3.LIZ.getClass();
        C10G5 c10g5LIZ = C10G3.LIZ(c10g6);
        String str3 = lemon8ProfileContentSyncConfigLIZ.uid;
        if (C123100dR.LIZ(str3) && str3 != null) {
            LIZLLL.put(str3, new Pair<>(c10g6, c10g5LIZ));
        }
        if (c10g5LIZ.LIZ) {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            L8ContentSyncLocalSkipConfig l8ContentSyncLocalSkipConfig = C1866590yfp.LIZ;
            L8ContentSyncLocalSkipConfig l8ContentSyncLocalSkipConfig2 = (L8ContentSyncLocalSkipConfig) settingsManagerLIZLLL.LJIIIIZZ("lemon8_silence_sync_tt_article_auth_popup_local_skip", L8ContentSyncLocalSkipConfig.class, l8ContentSyncLocalSkipConfig);
            if (l8ContentSyncLocalSkipConfig2 != null) {
                l8ContentSyncLocalSkipConfig = l8ContentSyncLocalSkipConfig2;
            }
            int i2 = LIZIZ().getInt("local_skip_show_count_v2", 0);
            if (l8ContentSyncLocalSkipConfig != null && Intrinsics.LJFF(l8ContentSyncLocalSkipConfig.enable, Boolean.TRUE)) {
                Integer num2 = l8ContentSyncLocalSkipConfig.skipCountLimit;
                if (num2 != null) {
                    iIntValue = num2.intValue();
                } else {
                    iIntValue = 0;
                }
                if (i2 >= iIntValue) {
                    num = 0;
                    c10g7 = new C10G7(num, null, false);
                } else {
                    try {
                        c098200Yq = Boolean.valueOf(C10G3.LIZIZ(l8ContentSyncLocalSkipConfig));
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        c098200Yq = null;
                    }
                    Boolean bool = (Boolean) c098200Yq;
                    if (bool != null && bool.booleanValue()) {
                        Integer numValueOf = Integer.valueOf(i2 + 1);
                        if (Intrinsics.LJFF(l8ContentSyncLocalSkipConfig.enableSkipByBizPortrait, Boolean.TRUE)) {
                            str = "local skipped by biz portrait";
                        } else {
                            str = "local skipped";
                        }
                        c10g7 = new C10G7(numValueOf, str, true);
                    }
                    num = null;
                    c10g7 = new C10G7(num, null, false);
                }
            } else {
                num = null;
                c10g7 = new C10G7(num, null, false);
            }
            if (c10g7.LIZJ != null) {
                LIZIZ().storeInt("local_skip_show_count_v2", c10g7.LIZJ.intValue());
            }
            if (c10g7.LIZ) {
                String str4 = c10g7.LIZIZ;
                if (str4 == null) {
                    str4 = "";
                }
                LJ(lemon8ProfileContentSyncConfigLIZ, str4, null);
                return false;
            }
            return true;
        }
        if (!C123100dR.LIZ(c10g5LIZ.LIZIZ) || !lemon8ProfileContentSyncConfigLIZ.canShowPopup) {
            return false;
        }
        LJ(lemon8ProfileContentSyncConfigLIZ, c10g5LIZ.LIZIZ, c10g5LIZ.LIZJ);
        return false;
    }

    public static void LIZJ(Lemon8ProfileContentSyncConfig lemon8ProfileContentSyncConfig, String str, String str2) {
        Integer num;
        if (lemon8ProfileContentSyncConfig == null) {
            lemon8ProfileContentSyncConfig = C19216910Fz.LIZ();
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("current_page", "personal_homepage");
        c2344009Gk.LJIIIIZZ("business_type", "lemon8");
        c2344009Gk.LJIIIIZZ("action_type", str);
        c2344009Gk.LIZJ(LIZ(lemon8ProfileContentSyncConfig), "show_times");
        c2344009Gk.LIZJ(lemon8ProfileContentSyncConfig.popupIsFallbackStyle ? 1 : 0, "is_fallback");
        int i = lemon8ProfileContentSyncConfig.showStyle;
        String str3 = null;
        if (i != 6) {
            if (i != 7) {
                if (i == 8) {
                    str3 = "reward";
                }
            } else {
                str3 = "content";
            }
        } else {
            str3 = "relationship";
        }
        c2344009Gk.LJIIIIZZ("show_type", str3);
        if (Intrinsics.LJFF(str, "click")) {
            c2344009Gk.LJFF("click_type", str2);
        }
        C20684815ws.LJIILLIIL("tt_phototext_standalone_sync_post", c2344009Gk.LIZ);
        if (Intrinsics.LJFF(str, "show")) {
            LJII = System.currentTimeMillis();
            return;
        }
        if (!Intrinsics.LJFF(str, "click") || LJII <= 0) {
            return;
        }
        if (Intrinsics.LJFF(str2, "confirm")) {
            num = 1;
        } else if (!Intrinsics.LJFF(str2, "cancel")) {
            return;
        } else {
            num = 0;
        }
        if (num == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - LJII;
        int iIntValue = num.intValue();
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LIZJ(iIntValue, "dismiss_reason");
        c2344009Gk2.LIZLLL(jCurrentTimeMillis, "duration_ms");
        C20684815ws.LJIILLIIL("rd_tt_phototext_standalone_sync_post_pupup_duration", c2344009Gk2.LIZ);
        LJII = -1L;
    }

    public static void LJ(Lemon8ProfileContentSyncConfig lemon8ProfileContentSyncConfig, String str, Map map) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("reason", str);
        c2344009Gk.LJ(Boolean.valueOf(LIZJ), "has_publish_success");
        c2344009Gk.LIZJ(lemon8ProfileContentSyncConfig.showStyle, "show_style");
        c2344009Gk.LIZJ(lemon8ProfileContentSyncConfig.minConfigShowDurationDay, "min_config_show_duration_day");
        c2344009Gk.LJ(Boolean.valueOf(lemon8ProfileContentSyncConfig.popupIsFallbackStyle), "is_fallback");
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                c2344009Gk.LJFF((String) entry.getKey(), (String) entry.getValue());
            }
        }
        C20684815ws.LJIILLIIL("rd_tt_phototext_standalone_sync_post_limit_show", c2344009Gk.LIZ);
    }

    public static void LJFF(C10G1 c10g1, String str, Integer num, Integer num2, int i) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            num2 = null;
        }
        c10g1.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("step", str);
        if (num != null) {
            c2344009Gk.LIZJ(num.intValue(), "error_code");
        }
        if (num2 != null) {
            c2344009Gk.LIZJ(num2.intValue(), "current_show_count");
        }
        C20684815ws.LJIILLIIL("rd_tt_phototext_standalone_sync_post_request_show", c2344009Gk.LIZ);
    }
}
