package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.common.TiktokMinisQueryParams;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.ss.android.ugc.aweme.minis.model.iaa.MinisRewardedAdData;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.1AyC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2196701AyC {
    public static final C2196701AyC LIZ = new C2196701AyC();

    public static void LIZ(C2344009Gk c2344009Gk) {
        Map<String, String> mapLIZLLL;
        TiktokMinisQueryParams tiktokMinisQueryParams;
        String string;
        SchemaParserData schemaParserData = C2195221Avo.LJII;
        Map<String, ? extends Object> map = null;
        if (schemaParserData != null) {
            mapLIZLLL = schemaParserData.LIZLLL();
        } else {
            mapLIZLLL = null;
        }
        c2344009Gk.LJII(mapLIZLLL);
        MinisMetaResp minisMetaResp = C2195221Avo.LJIIJ;
        if (minisMetaResp != null) {
            Integer num = minisMetaResp.minisType;
            int iOrdinal = EnumC1379020lzQ.MINIS_TYPE_GAME.ordinal();
            if (num != null && num.intValue() == iOrdinal) {
                String str = minisMetaResp.name;
                if (str == null || (string = a0.LJLIIIL(str).toString()) == null) {
                    string = "";
                }
                c2344009Gk.LJFF("game_name", string);
            }
        }
        SchemaParserData schemaParserData2 = C2195221Avo.LJII;
        if (schemaParserData2 != null && (tiktokMinisQueryParams = schemaParserData2.tiktokMinisParams) != null) {
            map = tiktokMinisQueryParams.logExtra;
        }
        c2344009Gk.LJFF("fyf_card_id", LIZIZ("fyf_card_id", map));
        c2344009Gk.LJFF("gip_task_id", LIZIZ("gip_task_id", map));
        c2344009Gk.LJFF("gip_task_name", LIZIZ("gip_task_name", map));
        c2344009Gk.LJFF("is_gip_anchor", LIZIZ("is_gip_anchor", map));
    }

    public static void LIZJ(EnumC635050OvX enumC635050OvX) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        SchemaParserData schemaParserData = C2195221Avo.LJII;
        if (schemaParserData != null) {
            for (Map.Entry entry : ((LinkedHashMap) schemaParserData.LIZLLL()).entrySet()) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
        map.put("addition_category", enumC635050OvX.getValue());
        C08S3.LIZLLL("tm_desktop_shortcut_addition_click", map, map2, null);
    }

    public static void LIZLLL(EnumC635050OvX enumC635050OvX) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        SchemaParserData schemaParserData = C2195221Avo.LJII;
        if (schemaParserData != null) {
            for (Map.Entry entry : ((LinkedHashMap) schemaParserData.LIZLLL()).entrySet()) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
        map.put("addition_category", enumC635050OvX.getValue());
        C08S3.LIZLLL("tm_desktop_shortcut_addition_success", map, map2, null);
    }

    public static void LJIL(boolean z) {
        EnumC1222620hvA enumC1222620hvA;
        Map<String, String> mapLIZLLL;
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (z) {
            enumC1222620hvA = EnumC1222620hvA.LIGHT;
        } else {
            enumC1222620hvA = EnumC1222620hvA.DARK;
        }
        c2344009Gk.LJFF("background", enumC1222620hvA.getValue());
        SchemaParserData schemaParserData = C2195221Avo.LJII;
        if (schemaParserData != null) {
            mapLIZLLL = schemaParserData.LIZLLL();
        } else {
            mapLIZLLL = null;
        }
        c2344009Gk.LJII(mapLIZLLL);
        C08S3 c08s3 = C08S3.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        c08s3.getClass();
        C08S3.LIZJ("tm_more_functional_panel_show", map);
    }

    public static void LJJI(String str) {
        Map<String, String> mapLIZLLL;
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (str == null) {
            str = "";
        }
        c2344009Gk.LJFF("page_id", str);
        SchemaParserData schemaParserData = C2195221Avo.LJII;
        if (schemaParserData != null) {
            mapLIZLLL = schemaParserData.LIZLLL();
        } else {
            mapLIZLLL = null;
        }
        c2344009Gk.LJII(mapLIZLLL);
        Map<String, String> map = c2344009Gk.LIZ;
        C08S3.LIZ.getClass();
        C08S3.LIZJ("tm_page_visit", map);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMinisPageVisit, data:");
        C1227904rF.LIZ.getClass();
        sbLIZ.append(C1227904rF.LJI(map));
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static EnumC1802000wze LJJIIJ(EnumC1799930wwJ enumC1799930wwJ) {
        int i;
        if (enumC1799930wwJ != null && (i = C1799960wwM.LIZ[enumC1799930wwJ.ordinal()]) != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return EnumC1802000wze.LLILZ;
                    }
                    throw new C1954807lC();
                }
                return EnumC1802000wze.LLILLL;
            }
            return EnumC1802000wze.LLILLJJLI;
        }
        return null;
    }

    public static final String LIZIZ(String str, Map map) {
        Object obj;
        String string;
        if (map == null || (obj = map.get(str)) == null || (string = obj.toString()) == null) {
            return "";
        }
        return string;
    }

    public static void LJ(String str, boolean z) {
        EnumC1222620hvA enumC1222620hvA;
        Map<String, String> mapLIZLLL;
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (z) {
            enumC1222620hvA = EnumC1222620hvA.LIGHT;
        } else {
            enumC1222620hvA = EnumC1222620hvA.DARK;
        }
        c2344009Gk.LJFF("background", enumC1222620hvA.getValue());
        c2344009Gk.LJFF("click_action", str);
        SchemaParserData schemaParserData = C2195221Avo.LJII;
        if (schemaParserData != null) {
            mapLIZLLL = schemaParserData.LIZLLL();
        } else {
            mapLIZLLL = null;
        }
        c2344009Gk.LJII(mapLIZLLL);
        C08S3 c08s3 = C08S3.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        c08s3.getClass();
        C08S3.LIZJ("tm_guide_popup_click", map);
    }

    public static void LJFF(String str, String str2) {
        Map<String, String> mapLIZLLL;
        C2344009Gk c2344009Gk = new C2344009Gk();
        SchemaParserData schemaParserData = C2195221Avo.LJII;
        if (schemaParserData != null) {
            mapLIZLLL = schemaParserData.LIZLLL();
        } else {
            mapLIZLLL = null;
        }
        c2344009Gk.LJII(mapLIZLLL);
        c2344009Gk.LJFF("click_action", str);
        c2344009Gk.LJFF("exit_type", "");
        c2344009Gk.LJFF("add_to_desktop_outcome", str2);
        C08S3 c08s3 = C08S3.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        c08s3.getClass();
        C08S3.LIZJ("add_to_homescreen_tab_click", map);
    }

    public static void LJIILL(int i, boolean z) {
        C0N4F c0n4f;
        HashMap map = new HashMap();
        if (z) {
            c0n4f = C0N4F.SUCCESS;
        } else {
            c0n4f = C0N4F.FAILED;
        }
        map.put("result", c0n4f.getValue());
        map.put("error_code", String.valueOf(i));
        C2196331Axb.LIZ.getClass();
        C2196331Axb.LIZJ("tm_loading_page_show", map, null, null);
        SchemaParserData schemaParserData = C2195221Avo.LJII;
        if (schemaParserData != null) {
            for (Map.Entry entry : ((LinkedHashMap) schemaParserData.LIZLLL()).entrySet()) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
        C08S3.LIZLLL("tm_loading_page_show", map, null, null);
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMinisLoadingPageShow, data:");
        sbLIZ.append(map);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJIJ(String str, boolean z) {
        EnumC1222620hvA enumC1222620hvA;
        Map<String, String> mapLIZLLL;
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (z) {
            enumC1222620hvA = EnumC1222620hvA.LIGHT;
        } else {
            enumC1222620hvA = EnumC1222620hvA.DARK;
        }
        c2344009Gk.LJFF("background", enumC1222620hvA.getValue());
        c2344009Gk.LJFF("click_type", str);
        c2344009Gk.LJFF("action", "");
        SchemaParserData schemaParserData = C2195221Avo.LJII;
        if (schemaParserData != null) {
            mapLIZLLL = schemaParserData.LIZLLL();
        } else {
            mapLIZLLL = null;
        }
        c2344009Gk.LJII(mapLIZLLL);
        C08S3 c08s3 = C08S3.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        c08s3.getClass();
        C08S3.LIZJ("tm_about_page_click", map);
    }

    public static void LJIJI(String str, String str2) {
        Map<String, String> mapLIZLLL;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("click_type", str);
        c2344009Gk.LJFF("exit_type", str2);
        SchemaParserData schemaParserData = C2195221Avo.LJII;
        if (schemaParserData != null) {
            mapLIZLLL = schemaParserData.LIZLLL();
        } else {
            mapLIZLLL = null;
        }
        c2344009Gk.LJII(mapLIZLLL);
        C08S3 c08s3 = C08S3.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        c08s3.getClass();
        C08S3.LIZJ("tm_more_functional_panel_click", map);
    }

    public static void LJJ(long j, String str) {
        Map<String, String> mapLIZLLL;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("page_id", str);
        c2344009Gk.LIZLLL(j, "stay_duration");
        SchemaParserData schemaParserData = C2195221Avo.LJII;
        if (schemaParserData != null) {
            mapLIZLLL = schemaParserData.LIZLLL();
        } else {
            mapLIZLLL = null;
        }
        c2344009Gk.LJII(mapLIZLLL);
        Map<String, String> map = c2344009Gk.LIZ;
        C08S3.LIZ.getClass();
        C08S3.LIZJ("tm_page_exit", map);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMinisPageExit, data:");
        C1227904rF.LIZ.getClass();
        sbLIZ.append(C1227904rF.LJI(map));
        C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Integer] */
    public static void LJJIFFI(Map map, Map map2) {
        int iIntValue;
        for (Map.Entry entry : ((LinkedHashMap) map2).entrySet()) {
            Object key = entry.getKey();
            ?? ValueOf = (String) entry.getValue();
            if (Intrinsics.LJFF(key, "is_minis_revisit_edu")) {
                Integer numLJIIJJI = C2095008Iq.LJIIJJI(ValueOf);
                if (numLJIIJJI != null) {
                    iIntValue = numLJIIJJI.intValue();
                } else {
                    iIntValue = 0;
                }
                ValueOf = Integer.valueOf(iIntValue);
            }
            ((HashMap) map).put(key, ValueOf);
        }
    }

    public static void LJJII(String str, String str2) {
        String string;
        String str3;
        if (str2 != null) {
            Map<String, String> mapLIZLLL = null;
            if (!a0.LJJJIL(str2)) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJFF("icon", str2);
                SchemaParserData schemaParserData = C2195221Avo.LJII;
                if (schemaParserData != null) {
                    mapLIZLLL = schemaParserData.LIZLLL();
                }
                c2344009Gk.LJII(mapLIZLLL);
                MinisMetaResp minisMetaResp = C2195221Avo.LJIIJ;
                if (minisMetaResp == null || (str3 = minisMetaResp.name) == null || (string = a0.LJLIIIL(str3).toString()) == null) {
                    string = "";
                }
                c2344009Gk.LJFF("game_name", string);
                C08S3 c08s3 = C08S3.LIZ;
                Map<String, String> map = c2344009Gk.LIZ;
                c08s3.getClass();
                C08S3.LIZJ(str, map);
            }
        }
    }

    public static void LJII(EnumC2196901AyW enumC2196901AyW, long j, EnumC2194261AuG enumC2194261AuG) {
        Map<String, String> mapLIZLLL;
        int i;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(j, "stay_duration");
        c2344009Gk.LJFF("exit_method", enumC2196901AyW.getValue());
        SchemaParserData schemaParserData = C2195221Avo.LJII;
        Integer numValueOf = null;
        if (schemaParserData != null) {
            mapLIZLLL = schemaParserData.LIZLLL();
        } else {
            mapLIZLLL = null;
        }
        c2344009Gk.LJII(mapLIZLLL);
        long jCurrentTimeMillis = System.currentTimeMillis();
        C2196101AxE.LIZ.getClass();
        if (jCurrentTimeMillis - C2196101AxE.LIZJ <= 30000) {
            i = 1;
        } else {
            i = 0;
        }
        c2344009Gk.LIZJ(i, "ad_viewing_within_30s");
        if (C2197221Az2.LIZ(C2195221Avo.LIZ())) {
            if (enumC2194261AuG != null) {
                numValueOf = Integer.valueOf(enumC2194261AuG.getValue());
            }
            c2344009Gk.LJ(numValueOf, "load_status");
        }
        Map<String, String> map = c2344009Gk.LIZ;
        C08S3.LIZ.getClass();
        C08S3.LIZJ("tm_exit", map);
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMinisExit, data:");
        C1227904rF.LIZ.getClass();
        sbLIZ.append(C1227904rF.LJI(map));
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJIIIIZZ(String str, String str2, boolean z) {
        EnumC1222620hvA enumC1222620hvA;
        Map<String, String> mapLIZLLL;
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (z) {
            enumC1222620hvA = EnumC1222620hvA.LIGHT;
        } else {
            enumC1222620hvA = EnumC1222620hvA.DARK;
        }
        c2344009Gk.LJFF("background", enumC1222620hvA.getValue());
        c2344009Gk.LJFF("click_action", str);
        c2344009Gk.LJFF("exit_type", str2);
        SchemaParserData schemaParserData = C2195221Avo.LJII;
        if (schemaParserData != null) {
            mapLIZLLL = schemaParserData.LIZLLL();
        } else {
            mapLIZLLL = null;
        }
        c2344009Gk.LJII(mapLIZLLL);
        C08S3 c08s3 = C08S3.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        c08s3.getClass();
        C08S3.LIZJ("minis_guide_popup_click", map);
    }

    public static void LJIIJ(MinisRewardedAdData minisRewardedAdData, boolean z, C1232850iBf c1232850iBf) {
        String string;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        String str = "";
        if (minisRewardedAdData != null) {
            String str2 = minisRewardedAdData.rit;
            if (str2 == null) {
                str2 = "";
            }
            map.put("rit", str2);
            String str3 = minisRewardedAdData.adPlacementId;
            if (str3 == null) {
                str3 = "";
            }
            map.put("ad_unit_id", str3);
            String str4 = minisRewardedAdData.adInstanceUniqueId;
            if (str4 == null) {
                str4 = "";
            }
            map.put("reward_unique_id", str4);
        }
        map.put("is_debug", Integer.valueOf(C204575153d.LIZ() ? 1 : 0));
        map.put("is_error", Integer.valueOf(z ? 1 : 0));
        map.put("error_code", c1232850iBf.LIZ());
        String str5 = c1232850iBf.LIZIZ;
        if (str5 == null) {
            str5 = "";
        }
        map.put("error_msg", str5);
        C2196681AyA c2196681AyA = C2196681AyA.LIZ;
        String strLIZ = C2195221Avo.LIZ();
        if (strLIZ == null) {
            strLIZ = "";
        }
        c2196681AyA.getClass();
        map.put("iaa_nesting_layer", Integer.valueOf(C2196681AyA.LIZJ(strLIZ)));
        Integer num = c1232850iBf.LIZJ;
        if (num == null || (string = num.toString()) == null) {
            string = "";
        }
        map.put("inner_error_code", string);
        String str6 = c1232850iBf.LIZLLL;
        if (str6 != null) {
            str = str6;
        }
        map.put("inner_error_msg", str);
        SchemaParserData schemaParserData = C2195221Avo.LJII;
        if (schemaParserData != null) {
            for (Map.Entry entry : ((LinkedHashMap) schemaParserData.LIZLLL()).entrySet()) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
        C08S3.LIZLLL("tm_iaa_interstitial_video_ads_init", map, map2, null);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMinisIaaRewardVideoAdsInit, categoryMap:");
        sbLIZ.append(map);
        sbLIZ.append(", metricMap:");
        sbLIZ.append(map2);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJIIJJI(MinisRewardedAdData minisRewardedAdData, boolean z, C1232850iBf c1232850iBf) {
        String string;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        String str = "";
        if (minisRewardedAdData != null) {
            String str2 = minisRewardedAdData.rit;
            if (str2 == null) {
                str2 = "";
            }
            map.put("rit", str2);
            String str3 = minisRewardedAdData.adPlacementId;
            if (str3 == null) {
                str3 = "";
            }
            map.put("ad_unit_id", str3);
            String str4 = minisRewardedAdData.adInstanceUniqueId;
            if (str4 == null) {
                str4 = "";
            }
            map.put("reward_unique_id", str4);
        }
        map.put("is_debug", Integer.valueOf(C204575153d.LIZ() ? 1 : 0));
        map.put("is_error", Integer.valueOf(z ? 1 : 0));
        map.put("error_code", c1232850iBf.LIZ());
        String str5 = c1232850iBf.LIZIZ;
        if (str5 == null) {
            str5 = "";
        }
        map.put("error_msg", str5);
        C2196681AyA c2196681AyA = C2196681AyA.LIZ;
        String strLIZ = C2195221Avo.LIZ();
        if (strLIZ == null) {
            strLIZ = "";
        }
        c2196681AyA.getClass();
        map.put("iaa_nesting_layer", Integer.valueOf(C2196681AyA.LIZJ(strLIZ)));
        Integer num = c1232850iBf.LIZJ;
        if (num == null || (string = num.toString()) == null) {
            string = "";
        }
        map.put("inner_error_code", string);
        String str6 = c1232850iBf.LIZLLL;
        if (str6 != null) {
            str = str6;
        }
        map.put("inner_error_msg", str);
        SchemaParserData schemaParserData = C2195221Avo.LJII;
        if (schemaParserData != null) {
            for (Map.Entry entry : ((LinkedHashMap) schemaParserData.LIZLLL()).entrySet()) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
        C08S3.LIZLLL("tm_iaa_interstitial_video_ads_show", map, map2, null);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMinisIaaRewardVideoAdsShow, categoryMap:");
        sbLIZ.append(map);
        sbLIZ.append(", metricMap:");
        sbLIZ.append(map2);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJIILIIL(MinisRewardedAdData minisRewardedAdData, boolean z, C1232850iBf c1232850iBf) {
        String string;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        String str = "";
        if (minisRewardedAdData != null) {
            String str2 = minisRewardedAdData.rit;
            if (str2 == null) {
                str2 = "";
            }
            map.put("rit", str2);
            String str3 = minisRewardedAdData.adPlacementId;
            if (str3 == null) {
                str3 = "";
            }
            map.put("ad_unit_id", str3);
            String str4 = minisRewardedAdData.adInstanceUniqueId;
            if (str4 == null) {
                str4 = "";
            }
            map.put("reward_unique_id", str4);
        }
        map.put("is_debug", Integer.valueOf(C204575153d.LIZ() ? 1 : 0));
        map.put("is_error", Integer.valueOf(z ? 1 : 0));
        map.put("error_code", c1232850iBf.LIZ());
        String str5 = c1232850iBf.LIZIZ;
        if (str5 == null) {
            str5 = "";
        }
        map.put("error_msg", str5);
        C2196681AyA c2196681AyA = C2196681AyA.LIZ;
        String strLIZ = C2195221Avo.LIZ();
        if (strLIZ == null) {
            strLIZ = "";
        }
        c2196681AyA.getClass();
        map.put("iaa_nesting_layer", Integer.valueOf(C2196681AyA.LIZJ(strLIZ)));
        Integer num = c1232850iBf.LIZJ;
        if (num == null || (string = num.toString()) == null) {
            string = "";
        }
        map.put("inner_error_code", string);
        String str6 = c1232850iBf.LIZLLL;
        if (str6 != null) {
            str = str6;
        }
        map.put("inner_error_msg", str);
        SchemaParserData schemaParserData = C2195221Avo.LJII;
        if (schemaParserData != null) {
            for (Map.Entry entry : ((LinkedHashMap) schemaParserData.LIZLLL()).entrySet()) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
        C08S3.LIZLLL("tm_iaa_reward_video_ads_init", map, map2, null);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMinisIaaRewardVideoAdsInit, categoryMap:");
        sbLIZ.append(map);
        sbLIZ.append(", metricMap:");
        sbLIZ.append(map2);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJIILJJIL(MinisRewardedAdData minisRewardedAdData, boolean z, C1232850iBf c1232850iBf) {
        String string;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        String str = "";
        if (minisRewardedAdData != null) {
            String str2 = minisRewardedAdData.rit;
            if (str2 == null) {
                str2 = "";
            }
            map.put("rit", str2);
            String str3 = minisRewardedAdData.adPlacementId;
            if (str3 == null) {
                str3 = "";
            }
            map.put("ad_unit_id", str3);
            String str4 = minisRewardedAdData.adInstanceUniqueId;
            if (str4 == null) {
                str4 = "";
            }
            map.put("reward_unique_id", str4);
        }
        map.put("is_debug", Integer.valueOf(C204575153d.LIZ() ? 1 : 0));
        map.put("is_error", Integer.valueOf(z ? 1 : 0));
        map.put("error_code", c1232850iBf.LIZ());
        String str5 = c1232850iBf.LIZIZ;
        if (str5 == null) {
            str5 = "";
        }
        map.put("error_msg", str5);
        C2196681AyA c2196681AyA = C2196681AyA.LIZ;
        String strLIZ = C2195221Avo.LIZ();
        if (strLIZ == null) {
            strLIZ = "";
        }
        c2196681AyA.getClass();
        map.put("iaa_nesting_layer", Integer.valueOf(C2196681AyA.LIZJ(strLIZ)));
        Integer num = c1232850iBf.LIZJ;
        if (num == null || (string = num.toString()) == null) {
            string = "";
        }
        map.put("inner_error_code", string);
        String str6 = c1232850iBf.LIZLLL;
        if (str6 != null) {
            str = str6;
        }
        map.put("inner_error_msg", str);
        SchemaParserData schemaParserData = C2195221Avo.LJII;
        if (schemaParserData != null) {
            for (Map.Entry entry : ((LinkedHashMap) schemaParserData.LIZLLL()).entrySet()) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
        C08S3.LIZLLL("tm_iaa_reward_video_ads_show", map, map2, null);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMinisIaaRewardVideoAdsShow, categoryMap:");
        sbLIZ.append(map);
        sbLIZ.append(", metricMap:");
        sbLIZ.append(map2);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJIILLIIL(EnumC1222090huJ enumC1222090huJ, boolean z, String str) {
        Map<String, String> mapLIZLLL;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("action", enumC1222090huJ.getValue());
        String value = EnumC1006880cJC.MINIS.getValue();
        if (!z) {
            value = EnumC1006880cJC.LOADING.getValue();
        }
        c2344009Gk.LJFF("page", value);
        c2344009Gk.LJFF("page_id", C1943007jI.LIZJ(str));
        SchemaParserData schemaParserData = C2195221Avo.LJII;
        if (schemaParserData != null) {
            mapLIZLLL = schemaParserData.LIZLLL();
        } else {
            mapLIZLLL = null;
        }
        c2344009Gk.LJII(mapLIZLLL);
        Map<String, String> map = c2344009Gk.LIZ;
        C08S3.LIZ.getClass();
        C08S3.LIZJ("tm_main_page_click", map);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMinisMainPageClick, data:");
        C1227904rF.LIZ.getClass();
        sbLIZ.append(C1227904rF.LJI(map));
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJIJJ(String str, String str2, boolean z) {
        EnumC1222620hvA enumC1222620hvA;
        Map<String, String> mapLIZLLL;
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (z) {
            enumC1222620hvA = EnumC1222620hvA.LIGHT;
        } else {
            enumC1222620hvA = EnumC1222620hvA.DARK;
        }
        c2344009Gk.LJFF("background", enumC1222620hvA.getValue());
        c2344009Gk.LJFF("click_type", str);
        c2344009Gk.LJFF("action", str2);
        SchemaParserData schemaParserData = C2195221Avo.LJII;
        if (schemaParserData != null) {
            mapLIZLLL = schemaParserData.LIZLLL();
        } else {
            mapLIZLLL = null;
        }
        c2344009Gk.LJII(mapLIZLLL);
        C08S3 c08s3 = C08S3.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        c08s3.getClass();
        C08S3.LIZJ("tm_report_page_click", map);
    }

    /* JADX WARN: Removed duplicated region for block: B:189:0x0183 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0179 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:230:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIZILJ(X.C2196371Axf r14, boolean r15, boolean r16, java.lang.String r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 853
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2196701AyC.LJIIZILJ(X.1Axf, boolean, boolean, java.lang.String):void");
    }

    public static void LJIJJLI(String str, String str2, String str3, boolean z) {
        EnumC1222620hvA enumC1222620hvA;
        Map<String, String> mapLIZLLL;
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (z) {
            enumC1222620hvA = EnumC1222620hvA.LIGHT;
        } else {
            enumC1222620hvA = EnumC1222620hvA.DARK;
        }
        c2344009Gk.LJFF("background", enumC1222620hvA.getValue());
        c2344009Gk.LJFF("submit_type", str);
        c2344009Gk.LJFF("action", str2);
        c2344009Gk.LJFF("result", str3);
        SchemaParserData schemaParserData = C2195221Avo.LJII;
        if (schemaParserData != null) {
            mapLIZLLL = schemaParserData.LIZLLL();
        } else {
            mapLIZLLL = null;
        }
        c2344009Gk.LJII(mapLIZLLL);
        C08S3 c08s3 = C08S3.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        c08s3.getClass();
        C08S3.LIZJ("tm_report_submit", map);
    }

    public static void LJI(String str, String str2, String str3, String str4, Map map) {
        String str5;
        String strLJIIIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("minis_type", str4);
        if (str == null) {
            str5 = "";
        } else {
            str5 = str;
        }
        c2344009Gk.LJFF("minis_id", str5);
        if (str == null) {
            str = "";
        }
        c2344009Gk.LJFF("client_key", str);
        c2344009Gk.LJFF("enter_method", str2);
        if (str3 != null) {
            c2344009Gk.LJFF("collection_id", str3);
        }
        SchemaParserData schemaParserData = C2195221Avo.LJII;
        if (schemaParserData != null) {
            strLJIIIZ = schemaParserData.LJIIIZ();
        } else {
            strLJIIIZ = null;
        }
        c2344009Gk.LJFF("ttoclid", strLJIIIZ);
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                c2344009Gk.LJFF((String) entry.getKey(), (String) entry.getValue());
            }
        }
        Map<String, String> map2 = c2344009Gk.LIZ;
        C08S3.LIZ.getClass();
        C08S3.LIZJ("minis_entrance_click", map2);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMinisEntranceClick, data:");
        C1227904rF.LIZ.getClass();
        sbLIZ.append(C1227904rF.LJI(map2));
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJIIIZ(MinisRewardedAdData minisRewardedAdData, boolean z, boolean z2, C1232850iBf c1232850iBf, Long l) {
        int iIntValue;
        String string;
        long jLongValue;
        long jCurrentTimeMillis;
        String string2;
        Integer numValueOf;
        Integer num;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        String str = "";
        if (minisRewardedAdData != null) {
            String str2 = minisRewardedAdData.rit;
            if (str2 == null) {
                str2 = "";
            }
            map.put("rit", str2);
            String str3 = minisRewardedAdData.adPlacementId;
            if (str3 == null) {
                str3 = "";
            }
            map.put("ad_unit_id", str3);
            String str4 = minisRewardedAdData.adInstanceUniqueId;
            if (str4 == null) {
                str4 = "";
            }
            map.put("reward_unique_id", str4);
        }
        map.put("is_debug", Integer.valueOf(C204575153d.LIZ() ? 1 : 0));
        map.put("is_error", Integer.valueOf(z2 ? 1 : 0));
        map.put("is_rewarded", Integer.valueOf(z ? 1 : 0));
        map.put("error_code", c1232850iBf.LIZ());
        String str5 = c1232850iBf.LIZIZ;
        if (str5 == null) {
            str5 = "";
        }
        map.put("error_msg", str5);
        if (minisRewardedAdData != null && (num = minisRewardedAdData.nestedLayerIndex) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 1;
        }
        map.put("iaa_nesting_layer", Integer.valueOf(iIntValue));
        C19378810ri c19378810ri = C19378810ri.LIZ;
        C0N6N c0n6n = C0N6N.MINIS_AD_PLACEMENT_INTERSTITIAL;
        c19378810ri.getClass();
        C19352310nR c19352310nRLIZ = C19378810ri.LIZ(c0n6n);
        if (c19352310nRLIZ == null || (numValueOf = Integer.valueOf(c19352310nRLIZ.LIZJ)) == null || (string = numValueOf.toString()) == null) {
            string = "";
        }
        map.put("ad_impression_counter", string);
        long j = 0;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        C2196371Axf c2196371Axf = C2195221Avo.LJIIIZ;
        if (c2196371Axf != null) {
            jCurrentTimeMillis = c2196371Axf.activityCreateTime;
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        long j2 = jLongValue - jCurrentTimeMillis;
        if (j2 <= 0) {
            j2 = 0;
        }
        long j3 = LSPassThroughRecordSizeConfig.DEFAULT;
        map.put("game_entry_duration", String.valueOf(j2 / j3));
        if (l != null) {
            long jCurrentTimeMillis2 = System.currentTimeMillis() - l.longValue();
            if (jCurrentTimeMillis2 > 0) {
                j = jCurrentTimeMillis2;
            }
            map.put("play_duration", String.valueOf(j / j3));
        }
        Integer num2 = c1232850iBf.LIZJ;
        if (num2 == null || (string2 = num2.toString()) == null) {
            string2 = "";
        }
        map.put("inner_error_code", string2);
        String str6 = c1232850iBf.LIZLLL;
        if (str6 != null) {
            str = str6;
        }
        map.put("inner_error_msg", str);
        SchemaParserData schemaParserData = C2195221Avo.LJII;
        if (schemaParserData != null) {
            for (Map.Entry entry : ((LinkedHashMap) schemaParserData.LIZLLL()).entrySet()) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
        C08S3.LIZLLL("tm_iaa_interstitial_video_ads_exit", map, map2, null);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMinisIaaRewardVideoAdsExit, categoryMap:");
        sbLIZ.append(map);
        sbLIZ.append(", metricMap:");
        sbLIZ.append(map2);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJIIL(MinisRewardedAdData minisRewardedAdData, boolean z, boolean z2, C1232850iBf c1232850iBf, Long l) {
        int iIntValue;
        long jLongValue;
        long jCurrentTimeMillis;
        String string;
        String string2;
        Integer numValueOf;
        Integer num;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        String str = "";
        if (minisRewardedAdData != null) {
            String str2 = minisRewardedAdData.rit;
            if (str2 == null) {
                str2 = "";
            }
            map.put("rit", str2);
            String str3 = minisRewardedAdData.adPlacementId;
            if (str3 == null) {
                str3 = "";
            }
            map.put("ad_unit_id", str3);
            String str4 = minisRewardedAdData.adInstanceUniqueId;
            if (str4 == null) {
                str4 = "";
            }
            map.put("reward_unique_id", str4);
        }
        map.put("is_debug", Integer.valueOf(C204575153d.LIZ() ? 1 : 0));
        map.put("is_error", Integer.valueOf(z2 ? 1 : 0));
        map.put("is_rewarded", Integer.valueOf(z ? 1 : 0));
        map.put("error_code", c1232850iBf.LIZ());
        String str5 = c1232850iBf.LIZIZ;
        if (str5 == null) {
            str5 = "";
        }
        map.put("error_msg", str5);
        if (minisRewardedAdData != null && (num = minisRewardedAdData.nestedLayerIndex) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 1;
        }
        map.put("iaa_nesting_layer", Integer.valueOf(iIntValue));
        long j = 0;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        C2196371Axf c2196371Axf = C2195221Avo.LJIIIZ;
        if (c2196371Axf != null) {
            jCurrentTimeMillis = c2196371Axf.activityCreateTime;
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        long j2 = jLongValue - jCurrentTimeMillis;
        if (j2 > 0) {
            j = j2;
        }
        map.put("game_entry_duration", String.valueOf(j / ((long) LSPassThroughRecordSizeConfig.DEFAULT)));
        C19378810ri c19378810ri = C19378810ri.LIZ;
        C0N6N c0n6n = C0N6N.MINIS_AD_PLACEMENT_REWARD;
        c19378810ri.getClass();
        C19352310nR c19352310nRLIZ = C19378810ri.LIZ(c0n6n);
        if (c19352310nRLIZ == null || (numValueOf = Integer.valueOf(c19352310nRLIZ.LIZJ)) == null || (string = numValueOf.toString()) == null) {
            string = "";
        }
        map.put("ad_impression_counter", string);
        Integer num2 = c1232850iBf.LIZJ;
        if (num2 == null || (string2 = num2.toString()) == null) {
            string2 = "";
        }
        map.put("inner_error_code", string2);
        String str6 = c1232850iBf.LIZLLL;
        if (str6 != null) {
            str = str6;
        }
        map.put("inner_error_msg", str);
        SchemaParserData schemaParserData = C2195221Avo.LJII;
        if (schemaParserData != null) {
            for (Map.Entry entry : ((LinkedHashMap) schemaParserData.LIZLLL()).entrySet()) {
                map.put(entry.getKey(), entry.getValue());
            }
        }
        C08S3.LIZLLL("tm_iaa_reward_video_ads_exit", map, map2, null);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMinisIaaRewardVideoAdsExit, categoryMap:");
        sbLIZ.append(map);
        sbLIZ.append(", metricMap:");
        sbLIZ.append(map2);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIII(X.C2196701AyC r4, java.lang.String r5, X.EnumC1802000wze r6, java.lang.Boolean r7, boolean r8, int r9) {
        /*
            r0 = r9 & 2
            r4 = 0
            if (r0 == 0) goto L6
            r6 = r4
        L6:
            r0 = r9 & 4
            if (r0 == 0) goto Lb
            r7 = r4
        Lb:
            r0 = r9 & 8
            if (r0 == 0) goto L10
            r8 = 0
        L10:
            X.09Gk r2 = new X.09Gk
            r2.<init>()
            if (r6 == 0) goto L1e
            java.lang.String r1 = r6.LL
            java.lang.String r0 = "revisit_mission_type"
            r2.LJFF(r0, r1)
        L1e:
            if (r7 == 0) goto L29
            boolean r1 = r7.booleanValue()
            java.lang.String r0 = "reward_recevied"
            r2.LIZJ(r1, r0)
        L29:
            com.ss.android.ugc.aweme.minis.common.SchemaParserData r0 = X.C2195221Avo.LJII
            if (r0 == 0) goto L78
            java.util.Map r0 = r0.LIZLLL()
        L31:
            r2.LJII(r0)
            if (r8 == 0) goto L6d
            com.ss.android.ugc.aweme.minis.model.MinisMetaResp r3 = X.C2195221Avo.LJIIJ
            if (r3 == 0) goto L3c
            java.lang.Integer r4 = r3.minisType
        L3c:
            X.0lzQ r0 = X.EnumC1379020lzQ.MINIS_TYPE_GAME
            int r1 = r0.ordinal()
            if (r4 == 0) goto L4a
            int r0 = r4.intValue()
            if (r0 == r1) goto L58
        L4a:
            X.0lzQ r0 = X.EnumC1379020lzQ.MINIS_TYPE_NATIVE_GAME
            int r1 = r0.ordinal()
            if (r4 == 0) goto L6d
            int r0 = r4.intValue()
            if (r0 != r1) goto L6d
        L58:
            java.lang.String r0 = r3.name
            if (r0 == 0) goto L66
            java.lang.CharSequence r0 = kotlin.text.a0.LJLIIIL(r0)
            java.lang.String r1 = r0.toString()
            if (r1 != 0) goto L68
        L66:
            java.lang.String r1 = ""
        L68:
            java.lang.String r0 = "game_name"
            r2.LJFF(r0, r1)
        L6d:
            X.08S3 r1 = X.C08S3.LIZ
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.LIZ
            r1.getClass()
            X.C08S3.LIZJ(r5, r0)
            return
        L78:
            r0 = r4
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2196701AyC.LJJIII(X.1AyC, java.lang.String, X.0wze, java.lang.Boolean, boolean, int):void");
    }
}
