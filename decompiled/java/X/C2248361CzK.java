package X;

import Y.ARunnableS106S0100000_6;
import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.1CzK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2248361CzK {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(362));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(218));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(216));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(217));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(219));
    public static final ExecutorService LJFF = C786410Ut5.h4();

    public static boolean LJI() {
        return ((Boolean) LIZ.getValue()).booleanValue();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Integer LIZIZ(String str) {
        String strLIZLLL;
        String strLIZLLL2;
        Uri uriLJIIJJI = LJIIJJI(str);
        Integer num = null;
        if (uriLJIIJJI != null && (strLIZLLL = LIZLLL(uriLJIIJJI, "token")) != null && (strLIZLLL2 = LIZLLL(uriLJIIJJI, "from")) != null) {
            if (!Intrinsics.LJFF(uriLJIIJJI.getHost(), "font")) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Request kind error: ");
                sbLIZ.append(str);
                LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
            } else {
                C2248401CzO c2248401CzO = new C2248401CzO(str, strLIZLLL, strLIZLLL2);
                String str2 = c2248401CzO.LIZIZ;
                switch (str2.hashCode()) {
                    case -2024982659:
                        if (str2.equals("LONGFORM_REGULAR")) {
                            num = 111;
                        }
                        break;
                    case -1680283083:
                        if (str2.equals("SMALL_TEXT_2_REGULAR")) {
                            num = 91;
                        }
                        break;
                    case -1574776537:
                        if (str2.equals("H2_REGULAR")) {
                            num = 21;
                        }
                        break;
                    case -1510061378:
                        if (str2.equals("LARGE_TITLE_SEMIBOLD")) {
                            num = 122;
                        }
                        break;
                    case -1357436465:
                        if (str2.equals("P3_SEMIBOLD")) {
                            num = 72;
                        }
                        break;
                    case -1339430114:
                        if (str2.equals("P1_REGULAR")) {
                            num = 51;
                        }
                        break;
                    case -1160922960:
                        if (str2.equals("P2_SEMIBOLD")) {
                            num = 62;
                        }
                        break;
                    case -964409455:
                        if (str2.equals("P1_SEMIBOLD")) {
                            num = 52;
                        }
                        break;
                    case -894718167:
                        if (str2.equals("H4_REGULAR")) {
                            num = 41;
                        }
                        break;
                    case -741701870:
                        if (str2.equals("LONGFORM_SEMIBOLD")) {
                            num = 112;
                        }
                        break;
                    case -659371744:
                        if (str2.equals("P3_REGULAR")) {
                            num = 71;
                        }
                        break;
                    case -521542109:
                        if (str2.equals("P1_BOLD")) {
                            num = 53;
                        }
                        break;
                    case -492912958:
                        if (str2.equals("P2_BOLD")) {
                            num = 63;
                        }
                        break;
                    case -464283807:
                        if (str2.equals("P3_BOLD")) {
                            num = 73;
                        }
                        break;
                    case -63240986:
                        if (str2.equals("H4_SEMIBOLD")) {
                            num = 42;
                        }
                        break;
                    case -21195522:
                        if (str2.equals("HEADLINE_SEMIBOLD")) {
                            num = 102;
                        }
                        break;
                    case 127171380:
                        if (str2.equals("SMALL_TEXT_1_REGULAR")) {
                            num = 81;
                        }
                        break;
                    case 133272519:
                        if (str2.equals("H3_SEMIBOLD")) {
                            num = 32;
                        }
                        break;
                    case 232677926:
                        if (str2.equals("H1_REGULAR")) {
                            num = 11;
                        }
                        break;
                    case 329786024:
                        if (str2.equals("H2_SEMIBOLD")) {
                            num = 22;
                        }
                        break;
                    case 370405904:
                        if (str2.equals("HEADLINE_BOLD")) {
                            num = 103;
                        }
                        break;
                    case 526299529:
                        if (str2.equals("H1_SEMIBOLD")) {
                            num = 12;
                        }
                        break;
                    case 912736296:
                        if (str2.equals("H3_REGULAR")) {
                            num = 31;
                        }
                        break;
                    case 968363035:
                        if (str2.equals("H1_BOLD")) {
                            num = 13;
                        }
                        break;
                    case 996992186:
                        if (str2.equals("H2_BOLD")) {
                            num = 23;
                        }
                        break;
                    case 1025621337:
                        if (str2.equals("H3_BOLD")) {
                            num = 33;
                        }
                        break;
                    case 1054250488:
                        if (str2.equals("H4_BOLD")) {
                            num = 43;
                        }
                        break;
                    case 1123630541:
                        if (str2.equals("SMALL_TEXT_1_BOLD")) {
                            num = 83;
                        }
                        break;
                    case 1148082719:
                        if (str2.equals("P2_REGULAR")) {
                            num = 61;
                        }
                        break;
                    case 1152259692:
                        if (str2.equals("SMALL_TEXT_2_BOLD")) {
                            num = 93;
                        }
                        break;
                    case 1343653840:
                        if (str2.equals("LARGE_TITLE_BOLD")) {
                            num = 123;
                        }
                        break;
                    case 1354050394:
                        if (str2.equals("SMALL_TEXT_2_SEMIBOLD")) {
                            num = 92;
                        }
                        break;
                    case 1550563899:
                        if (str2.equals("SMALL_TEXT_1_SEMIBOLD")) {
                            num = 82;
                        }
                        break;
                    case 1618349604:
                        if (str2.equals("LONGFORM_BOLD")) {
                            num = 113;
                        }
                        break;
                    case 2016132113:
                        if (str2.equals("HEADLINE_REGULAR")) {
                            num = 101;
                        }
                        break;
                }
                if (LJI()) {
                    LJIIJ(c2248401CzO.LIZJ, (Map) LIZLLL.getValue());
                }
                Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("url", c2248401CzO.LIZ), new Pair("token", c2248401CzO.LIZIZ), new Pair("from", c2248401CzO.LIZJ));
                if (num != null) {
                    LJIIIZ(new AwS546S0100000_2(mapLJIIIIZZ, (Map<String, C1397705dX>) 983));
                    return num;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("tux_resource_protocol_load_font_error: ");
                sbLIZ2.append(c2248401CzO.LIZ);
                LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ2));
                return num;
            }
        }
        return null;
    }

    public static Integer LIZJ(String str) {
        String strLIZLLL;
        String strLIZLLL2;
        Uri uriLJIIJJI = LJIIJJI(str);
        Integer numValueOf = null;
        if (uriLJIIJJI != null && (strLIZLLL = LIZLLL(uriLJIIJJI, "token")) != null && (strLIZLLL2 = LIZLLL(uriLJIIJJI, "from")) != null) {
            if (!Intrinsics.LJFF(uriLJIIJJI.getHost(), "lottie")) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Request kind error: ");
                sbLIZ.append(str);
                LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
            } else {
                C2248411CzP c2248411CzP = new C2248411CzP(str, strLIZLLL, strLIZLLL2);
                if (Intrinsics.LJFF(c2248411CzP.LIZIZ, "tux_lottie_common_creation_audio_wave_anim")) {
                    numValueOf = Integer.valueOf(R.raw.tux_lottie_common_creation_audio_wave_anim);
                }
                if (LJI()) {
                    LJIIJ(c2248411CzP.LIZJ, (Map) LJ.getValue());
                }
                Map<String, String> mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("url", c2248411CzP.LIZ), new Pair("token", c2248411CzP.LIZIZ), new Pair("from", c2248411CzP.LIZJ));
                if (numValueOf != null) {
                    C1163504gr.LIZIZ.onEventV3("tux_resource_protocol_use_lottie", mapLJIIIIZZ);
                    return numValueOf;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("tux_resource_protocol_load_lottie_error: ");
                sbLIZ2.append(c2248411CzP.LIZ);
                LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ2));
                return numValueOf;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c9 A[Catch: Exception -> 0x0161, TryCatch #0 {Exception -> 0x0161, blocks: (B:3:0x0005, B:5:0x002b, B:7:0x0034, B:8:0x0039, B:11:0x0044, B:53:0x0130, B:54:0x0160, B:18:0x005a, B:19:0x0069, B:22:0x007c, B:28:0x00ac, B:45:0x00f8, B:52:0x012a, B:37:0x00c9, B:39:0x00cf, B:40:0x00f0, B:31:0x00b5, B:34:0x00bf, B:46:0x0104, B:48:0x010a, B:50:0x0110, B:51:0x0129, B:17:0x0051), top: B:58:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f4 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LJII(java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2248361CzK.LJII(java.lang.String):java.util.Map");
    }

    public static void LJIIIIZZ(String str) {
        if (!LJI()) {
            C1AF0.LJ(new RuntimeException(str));
            return;
        }
        throw new RuntimeException(str);
    }

    public static void LJIIIZ(Function0 function0) {
        if (((Number) C075X.LIZ.getValue()).intValue() == 1) {
            LJFF.execute(new ARunnableS106S0100000_6(function0, 169));
        } else {
            function0.invoke();
        }
    }

    public static Uri LJIIJJI(String str) {
        try {
            Uri uri = UriProtector.parse(str);
            if (!Intrinsics.LJFF(uri.getScheme(), "tux")) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Scheme not know: ");
                sbLIZ.append(str);
                LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
                return null;
            }
            return uri;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Parse url exception: ");
            sbLIZ2.append(str);
            LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ2));
            return null;
        }
    }

    public static C1361400lX0 LIZ(Context context, String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        if (Intrinsics.LJFF(lowerCase, "light")) {
            return C1385040m98.LIZ(context, false);
        }
        if (Intrinsics.LJFF(lowerCase, "dark")) {
            return C1385040m98.LIZ(context, true);
        }
        return null;
    }

    public static String LIZLLL(Uri uri, String str) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str);
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Miss param '");
            sbLIZ.append(str);
            sbLIZ.append("': ");
            sbLIZ.append(uri);
            LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        return strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
    }

    public static Integer LJ(Context context, String str) {
        String strLIZLLL;
        String strLIZLLL2;
        Uri uriLJIIJJI = LJIIJJI(str);
        Integer numLIZJ = null;
        if (uriLJIIJJI != null && (strLIZLLL = LIZLLL(uriLJIIJJI, "token")) != null && (strLIZLLL2 = LIZLLL(uriLJIIJJI, "from")) != null) {
            if (!Intrinsics.LJFF(uriLJIIJJI.getHost(), "color")) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Request kind error: ");
                sbLIZ.append(str);
                LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
            } else {
                C2248391CzN c2248391CzN = new C2248391CzN(str, strLIZLLL, strLIZLLL2, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLJIIJJI, "theme"));
                Integer numLIZ = C2272821Dxg.LIZ(c2248391CzN.LIZIZ);
                if (LJI()) {
                    LJIIJ(c2248391CzN.LIZJ, (Map) LIZJ.getValue());
                }
                Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("url", c2248391CzN.LIZ), new Pair("token", c2248391CzN.LIZIZ), new Pair("from", c2248391CzN.LIZJ), new Pair("theme", c2248391CzN.LIZLLL));
                if (C123100dR.LIZ(c2248391CzN.LIZLLL)) {
                    C1361400lX0 c1361400lX0LIZ = LIZ(context, c2248391CzN.LIZLLL);
                    if (c1361400lX0LIZ == null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("tux_resource_protocol_load_color_theme_error: ");
                        sbLIZ2.append(c2248391CzN.LIZ);
                        LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ2));
                    } else {
                        context = c1361400lX0LIZ;
                    }
                }
                if (numLIZ != null && (numLIZJ = C1308910kAL.LIZJ(numLIZ.intValue(), context)) != null) {
                    LJIIIZ(new AwS546S0100000_2(mapLJIIIIZZ, (Map<String, C1397705dX>) 982));
                    return numLIZJ;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("tux_resource_protocol_load_color_error: ");
                sbLIZ3.append(c2248391CzN.LIZ);
                LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ3));
                return numLIZJ;
            }
        }
        return null;
    }

    public static C698190Ra5 LJFF(Context context, String str) {
        String strLIZLLL;
        String strLIZLLL2;
        Context context2 = context;
        Uri uriLJIIJJI = LJIIJJI(str);
        Integer numLIZJ = null;
        if (uriLJIIJJI != null && (strLIZLLL = LIZLLL(uriLJIIJJI, "token")) != null && (strLIZLLL2 = LIZLLL(uriLJIIJJI, "from")) != null) {
            if (!Intrinsics.LJFF(uriLJIIJJI.getHost(), "icon")) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Request kind error: ");
                sbLIZ.append(str);
                LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
            } else {
                C2248381CzM c2248381CzM = new C2248381CzM(str, strLIZLLL, strLIZLLL2, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLJIIJJI, "color"), UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLJIIJJI, "theme"));
                Integer numLIZ = C1250620ieK.LIZ(c2248381CzM.LIZIZ);
                if (LJI()) {
                    LJIIJ(c2248381CzM.LIZJ, (Map) LIZIZ.getValue());
                }
                Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("url", c2248381CzM.LIZ), new Pair("token", c2248381CzM.LIZIZ), new Pair("from", c2248381CzM.LIZJ), new Pair("color", c2248381CzM.LIZLLL), new Pair("theme", c2248381CzM.LJ));
                if (numLIZ != null) {
                    LJIIIZ(new AwS546S0100000_2(mapLJIIIIZZ, (Map<String, C1397705dX>) 984));
                    int iIntValue = numLIZ.intValue();
                    String str2 = c2248381CzM.LIZLLL;
                    if (str2 != null && str2.length() != 0) {
                        Integer numLIZ2 = C2272821Dxg.LIZ(str2);
                        if (C123100dR.LIZ(c2248381CzM.LJ)) {
                            C1361400lX0 c1361400lX0LIZ = LIZ(context2, c2248381CzM.LJ);
                            if (c1361400lX0LIZ == null) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("tux_resource_protocol_load_icon_theme_error: ");
                                sbLIZ2.append(c2248381CzM.LIZ);
                                LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ2));
                            } else {
                                context2 = c1361400lX0LIZ;
                            }
                        }
                        if (numLIZ2 == null || (numLIZJ = C1308910kAL.LIZJ(numLIZ2.intValue(), context2)) == null) {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("tux_resource_protocol_load_icon_color_error: ");
                            sbLIZ3.append(c2248381CzM.LIZ);
                            LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ3));
                        }
                    }
                    return new C698190Ra5(iIntValue, numLIZJ);
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("tux_resource_protocol_load_icon_error: ");
                sbLIZ4.append(c2248381CzM.LIZ);
                LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ4));
                return null;
            }
        }
        return null;
    }

    public static void LJIIJ(String str, Map map) {
        if (!u.LJJIIJZLJL(str, "myna#", false) && !map.containsKey(str) && LJI()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Form not register: ");
            sbLIZ.append(str);
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
