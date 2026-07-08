package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.util.GlobalContext;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.StringTokenizer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.1Bz0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2222681Bz0 {
    public static Set<String> LIZLLL;
    public static int LIZ = -1;
    public static int LIZIZ = -1;
    public static int LIZJ = -1;
    public static int LJ = -1;
    public static final List<String> LJFF = C1697810uHb.LJIILJJIL("AT", "BE", "BG", "CH", "CY", "CZ", "DE", "DK", "EE", "ES", "FI", "FR", "GB", "GF", "GP", "GR", "HR", "HU", "IE", "IS", "IT", "LI", "LT", "LU", "LV", "MF", "MQ", "MT", "NL", "NO", "PL", "PT", "RE", "RO", "SE", "SI", "SK", "YT");

    public static int LIZ() {
        String upperCase;
        if (LJ < 0) {
            String str = C0X2A.LIZJ;
            if (str == null || (upperCase = str.toUpperCase(Locale.ROOT)) == null) {
                upperCase = "";
            }
            LJ = TextUtils.isEmpty(upperCase) ? 0 : Intrinsics.LJFF("US", upperCase) ? 2 : LJFF.contains(upperCase) ? 3 : 1;
        }
        return LJ;
    }

    public static void LIZLLL(String str, String str2, List list) {
        String str3;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (list != null && (!list.isEmpty())) {
                str3 = (String) ListProtector.get(list, 0);
            } else {
                str3 = "";
            }
            LIZJ(3, str, str2, str3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(java.lang.Integer r8, java.lang.String r9, java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2222681Bz0.LJ(java.lang.Integer, java.lang.String, java.lang.String):void");
    }

    public static void LIZIZ(String str, long j, String str2, boolean z) {
        int i;
        Context applicationContext;
        String string;
        if (LiveMonitorSampleSetting.INSTANCE.isReportSlardar("ttlive_gecko_file_info_report") && !TextUtils.isEmpty(str) && str != null && a0.LJJIIZI(str, "live", false)) {
            HashMap map = new HashMap();
            map.put("path", str);
            map.put("cost_time", Long.valueOf((System.nanoTime() - j) / 1000000));
            map.put("is_load_success", Boolean.valueOf(z));
            if (!u.LJJIIJZLJL(str, "file:", false) && !u.LJJIIJZLJL(str, "/data/", false)) {
                if (!u.LJJIIJZLJL(str, "http:", false) && !u.LJJIIJZLJL(str, "https:", false)) {
                    if (!u.LJJIIJZLJL(str, "asset:", false)) {
                        if (!TextUtils.isEmpty(str) && ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline()) {
                            if (LIZLLL == null) {
                                LIZLLL = C13LQ.LJLIIL(new String[]{"tiktok_live_broadcast_resource", "tiktok_live_watch_resource", "tiktok_live_interaction_resource", "tiktok_live_basic_resource", "tiktok_live_lottie_resource", "tiktok_live_link_mic", "tiktok_live_watch_resource_normal_1", "tiktok_live_watch_resource_demand_1", "tiktok_live_watch_resource_demand_2", "tiktok_live_link_mic", "tiktok_live_interaction_normal_1", "tiktok_live_interaction_normal_2", "tiktok_live_interaction_normal_3", "tiktok_live_interaction_demand_1", "tiktok_live_interaction_demand_2", "tiktok_live_interaction_demand_3", "tiktok_live_interaction_demand_4", "tiktok_live_revenue_normal_1", "tiktok_live_revenue_demand_1", "tiktok_live_revenue_demand_2", "tiktok_live_revenue_demand_3", "tiktok_live_revenue_demand_4", "tiktok_live_broadcast_demand_1", "tiktok_live_broadcast_demand_2", "tiktok_live_game_demand_1", "tiktok_live_outside_demand_1", "tiktok_live_match_resource", "tiktok_live_wallet_resource", "tiktok_live_gift_send_sound", "live_im_push_compress_zstd_dict", "tiktok_live_user_level_webp_0_native", "tiktok_live_user_level_webp_1_native", "tiktok_live_user_level_webp_2_native", "tiktok_live_user_level_webp_3_native", "tiktok_live_user_level_webp_4_native", "tiktok_live_user_level_webp_lighting_native", "tiktok_live_fans_club_entrance", "tiktok_live_fans_club_barrage_webp_2_native", "tiktok_live_fans_club_barrage_webp_3_native", "tiktok_live_fans_club_barrage_webp_4_native"});
                            }
                            Set<String> set = LIZLLL;
                            if (set != null) {
                                Iterator<String> it2 = set.iterator();
                                while (it2.hasNext()) {
                                    if (u.LJJIIJZLJL(str, it2.next(), false)) {
                                        i = 1;
                                        break;
                                    }
                                }
                            }
                        }
                        i = 0;
                    } else {
                        i = 1;
                        break;
                    }
                } else {
                    i = 3;
                }
            } else {
                i = 2;
            }
            map.put("load_resource_type", Integer.valueOf(i));
            if (!TextUtils.isEmpty(str) && a0.LJJIIZI(str, "/", false)) {
                StringTokenizer stringTokenizer = new StringTokenizer(str, "/");
                if (stringTokenizer.countTokens() > 0) {
                    int iCountTokens = stringTokenizer.countTokens();
                    ArrayList list = Collections.list(stringTokenizer);
                    map.put("filename", ListProtector.get(list, iCountTokens - 1));
                    boolean z2 = false;
                    for (int i2 = iCountTokens - 2; i2 > 0; i2--) {
                        Object obj = ListProtector.get(list, i2);
                        if (obj != null && (string = obj.toString()) != null) {
                            if (!u.LJJIIJZLJL(string, "tiktok_live_", false) && !Intrinsics.LJFF(string, "live_im_push_compress_zstd_dict")) {
                                if (i == 2 && new Regex("[-+]?\\d+(\\.\\d+)?").matches(string)) {
                                    map.put("version", string);
                                    if (z2) {
                                        break;
                                    }
                                    z2 = true;
                                }
                            } else {
                                map.put("channel", string);
                                if (z2 || i != 2) {
                                    break;
                                }
                                z2 = true;
                            }
                        }
                    }
                }
            }
            if ((LIZ <= 0 || LIZIZ <= 0 || LIZJ <= 0) && (applicationContext = GlobalContext.getApplicationContext()) != null) {
                C1305270k4T c1305270k4TLJFF = C1305320k4Y.LJFF(applicationContext);
                LIZ = c1305270k4TLJFF.LIZ;
                LIZIZ = c1305270k4TLJFF.LIZIZ;
                LIZJ = c1305270k4TLJFF.LIZJ;
            }
            map.put("dpi", Integer.valueOf(LIZ));
            map.put("width", Integer.valueOf(LIZIZ));
            map.put("height", Integer.valueOf(LIZJ));
            map.put("extra_info", str2);
            map.put("gecko_region", Integer.valueOf(LIZ()));
            C1CC2.LJII(0, "ttlive_gecko_file_info_report", map);
        }
    }

    public static void LIZJ(Integer num, String str, String str2, String str3) {
        int iIntValue;
        if (LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_gecko_get_asset_path_info_report", 0.01d) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            HashMap map = new HashMap();
            if (str == null) {
                str = "";
            }
            map.put("channel", str);
            if (str2 == null) {
                str2 = "";
            }
            map.put("filename", str2);
            if (str3 == null) {
                str3 = "";
            }
            map.put("path", str3);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            map.put("load_resource_type", Integer.valueOf(iIntValue));
            map.put("gecko_region", Integer.valueOf(LIZ()));
            C1CC2.LJII(0, "ttlive_gecko_get_asset_path_info_report", map);
        }
    }
}
