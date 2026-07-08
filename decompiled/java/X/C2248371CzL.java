package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.text.u;

/* JADX INFO: renamed from: X.1CzL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2248371CzL {
    public static final C2248371CzL LIZ = new C2248371CzL();

    public static String LIZ(String str) {
        if (str != null && str.length() != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(Character.toLowerCase(str.charAt(0)));
            int length = str.length();
            for (int i = 1; i < length; i++) {
                char cCharAt = str.charAt(i);
                char cCharAt2 = str.charAt(i - 1);
                if (Character.isUpperCase(cCharAt) && Character.isLowerCase(cCharAt2)) {
                    sb.append('_');
                    sb.append(Character.toLowerCase(cCharAt));
                } else if (Character.isUpperCase(cCharAt) && i < str.length() - 1 && Character.isLowerCase(str.charAt(i + 1))) {
                    sb.append('_');
                    sb.append(Character.toLowerCase(cCharAt));
                } else if (Character.isUpperCase(cCharAt) && Character.isUpperCase(cCharAt2)) {
                    sb.append(Character.toLowerCase(cCharAt));
                } else {
                    sb.append(cCharAt);
                }
            }
            return sb.toString();
        }
        return "";
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int LIZIZ(String str) {
        if (str == null) {
            return -1;
        }
        switch (str.hashCode()) {
            case -1839853951:
                if (str.equals("TUXColorUIShapePrimary")) {
                    return R.attr.a04;
                }
                break;
            case -1719356510:
                if (str.equals("TUXColorUIPageGrouped1")) {
                    return R.attr.zp;
                }
                break;
            case -1719356509:
                if (str.equals("TUXColorUIPageGrouped2")) {
                    return R.attr.zq;
                }
                break;
            case -1719356508:
                if (str.equals("TUXColorUIPageGrouped3")) {
                    return R.attr.zr;
                }
                break;
            case -1223324348:
                if (str.equals("TUXColorUIText1")) {
                    return R.attr.a1h;
                }
                break;
            case -1223324347:
                if (str.equals("TUXColorUIText2")) {
                    return R.attr.a1j;
                }
                break;
            case -1223324346:
                if (str.equals("TUXColorUIText3")) {
                    return R.attr.a1k;
                }
                break;
            case -1215115307:
                if (str.equals("UIShapePrimary")) {
                    return R.attr.a04;
                }
                break;
            case -1194263599:
                if (str.equals("TUXColorBGPrimary")) {
                    return R.attr.bx;
                }
                break;
            case -1095469399:
                if (str.equals("TUXColorUIImageOverlayWhiteA40")) {
                    return R.attr.zk;
                }
                break;
            case -1095469301:
                if (str.equals("TUXColorUIImageOverlayWhiteA75")) {
                    return R.attr.zl;
                }
                break;
            case -599927980:
                if (str.equals("TUXColorUIImageOverlayWhite")) {
                    return R.attr.zi;
                }
                break;
            case -400642021:
                if (str.equals("TUXColorUIShapeWarning")) {
                    return R.attr.a16;
                }
                break;
            case -317334247:
                if (str.equals("TUXColorUISheetFlat1")) {
                    return R.attr.a1b;
                }
                break;
            case -317334246:
                if (str.equals("TUXColorUISheetFlat2")) {
                    return R.attr.a1c;
                }
                break;
            case -317334245:
                if (str.equals("TUXColorUISheetFlat3")) {
                    return R.attr.a1d;
                }
                break;
            case -301231539:
                if (str.equals("TUXColorUITextPrimaryDisplay")) {
                    return R.attr.a1r;
                }
                break;
            case 224096623:
                if (str.equals("UIShapeWarning")) {
                    return R.attr.a16;
                }
                break;
            case 319233606:
                if (str.equals("TUXColorUIShapeNeutral")) {
                    return R.attr.a00;
                }
                break;
            case 564697413:
                if (str.equals("TUXColorUIShapeText1OnNeutral")) {
                    return R.attr.a0o;
                }
                break;
            case 612304033:
                if (str.equals("UITextPrimaryDisplay")) {
                    return R.attr.a1r;
                }
                break;
            case 726974118:
                if (str.equals("TUXColorUITextPlaceholder")) {
                    return R.attr.a1p;
                }
                break;
            case 902709378:
                if (str.equals("TUXColorUIShapeSuccess")) {
                    return R.attr.a0i;
                }
                break;
            case 1045643964:
                if (str.equals("TUXColorBrandTikTokSplash")) {
                    return R.attr.do_res_0x7f06005d;
                }
                break;
            case 1306307244:
                if (str.equals("TUXColorUIShapeNeutral2")) {
                    return R.attr.a01;
                }
                break;
            case 1306307245:
                if (str.equals("TUXColorUIShapeNeutral3")) {
                    return R.attr.a02;
                }
                break;
            case 1306307246:
                if (str.equals("TUXColorUIShapeNeutral4")) {
                    return R.attr.a03;
                }
                break;
            case 1527448022:
                if (str.equals("UIShapeSuccess")) {
                    return R.attr.a0i;
                }
                break;
            case 1596373801:
                if (str.equals("TUXColorUIPageFlat1")) {
                    return R.attr.zm;
                }
                break;
            case 1596373802:
                if (str.equals("TUXColorUIPageFlat2")) {
                    return R.attr.zn;
                }
                break;
            case 1596373803:
                if (str.equals("TUXColorUIPageFlat3")) {
                    return R.attr.zo;
                }
                break;
            case 1602476213:
                if (str.equals("TUXColorUITextPrimary")) {
                    return R.attr.a1q;
                }
                break;
            case 2075094750:
                if (str.equals("TUXColorUIText1Display")) {
                    return R.attr.a1i;
                }
                break;
        }
        try {
            return C786410Ut5.n3(C20642515q3.LJFF(), u.LJJIFFI(str, "TUXColor", "", false), "attr", C1717770unn.LIZJ().getApplicationContext().getPackageName());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return -1;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int LIZJ(String str) {
        if (str == null) {
            return 51;
        }
        switch (str.hashCode()) {
            case -2024982659:
                if (!str.equals("LONGFORM_REGULAR")) {
                    return 51;
                }
                return 111;
            case -1680283083:
                if (!str.equals("SMALL_TEXT_2_REGULAR")) {
                    return 51;
                }
                return 91;
            case -1574776537:
                if (!str.equals("H2_REGULAR")) {
                    return 51;
                }
                return 21;
            case -1510061378:
                if (!str.equals("LARGE_TITLE_SEMIBOLD")) {
                    return 51;
                }
                return 122;
            case -1357436465:
                if (!str.equals("P3_SEMIBOLD")) {
                    return 51;
                }
                return 72;
            case -1339430114:
                str.equals("P1_REGULAR");
                return 51;
            case -1160922960:
                if (!str.equals("P2_SEMIBOLD")) {
                    return 51;
                }
                return 62;
            case -964409455:
                if (!str.equals("P1_SEMIBOLD")) {
                    return 51;
                }
                return 52;
            case -894718167:
                if (!str.equals("H4_REGULAR")) {
                    return 51;
                }
                return 41;
            case -741701870:
                if (!str.equals("LONGFORM_SEMIBOLD")) {
                    return 51;
                }
                return 112;
            case -659371744:
                if (!str.equals("P3_REGULAR")) {
                    return 51;
                }
                return 71;
            case -521542109:
                if (!str.equals("P1_BOLD")) {
                    return 51;
                }
                return 53;
            case -492912958:
                if (!str.equals("P2_BOLD")) {
                    return 51;
                }
                return 63;
            case -464283807:
                if (!str.equals("P3_BOLD")) {
                    return 51;
                }
                return 73;
            case -63240986:
                if (!str.equals("H4_SEMIBOLD")) {
                    return 51;
                }
                return 42;
            case -21195522:
                if (!str.equals("HEADLINE_SEMIBOLD")) {
                    return 51;
                }
                return 102;
            case 127171380:
                if (!str.equals("SMALL_TEXT_1_REGULAR")) {
                    return 51;
                }
                return 81;
            case 133272519:
                if (!str.equals("H3_SEMIBOLD")) {
                    return 51;
                }
                return 32;
            case 232677926:
                if (!str.equals("H1_REGULAR")) {
                    return 51;
                }
                return 11;
            case 329786024:
                if (!str.equals("H2_SEMIBOLD")) {
                    return 51;
                }
                return 22;
            case 370405904:
                if (!str.equals("HEADLINE_BOLD")) {
                    return 51;
                }
                return 103;
            case 526299529:
                if (!str.equals("H1_SEMIBOLD")) {
                    return 51;
                }
                return 12;
            case 912736296:
                if (!str.equals("H3_REGULAR")) {
                    return 51;
                }
                return 31;
            case 968363035:
                if (!str.equals("H1_BOLD")) {
                    return 51;
                }
                return 13;
            case 996992186:
                if (!str.equals("H2_BOLD")) {
                    return 51;
                }
                return 23;
            case 1025621337:
                if (!str.equals("H3_BOLD")) {
                    return 51;
                }
                return 33;
            case 1054250488:
                if (!str.equals("H4_BOLD")) {
                    return 51;
                }
                return 43;
            case 1123630541:
                if (!str.equals("SMALL_TEXT_1_BOLD")) {
                    return 51;
                }
                return 83;
            case 1148082719:
                if (!str.equals("P2_REGULAR")) {
                    return 51;
                }
                return 61;
            case 1152259692:
                if (!str.equals("SMALL_TEXT_2_BOLD")) {
                    return 51;
                }
                return 93;
            case 1343653840:
                if (!str.equals("LARGE_TITLE_BOLD")) {
                    return 51;
                }
                return 123;
            case 1354050394:
                if (!str.equals("SMALL_TEXT_2_SEMIBOLD")) {
                    return 51;
                }
                return 92;
            case 1550563899:
                if (!str.equals("SMALL_TEXT_1_SEMIBOLD")) {
                    return 51;
                }
                return 82;
            case 1618349604:
                if (!str.equals("LONGFORM_BOLD")) {
                    return 51;
                }
                return 113;
            case 2016132113:
                if (!str.equals("HEADLINE_REGULAR")) {
                    return 51;
                }
                return 101;
            default:
                return 51;
        }
    }
}
