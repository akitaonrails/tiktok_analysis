package X;

import android.hardware.Sensor;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyCallback;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.helios.statichook.config.ApiHookConfig;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0X1o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C842060X1o {
    public static final Map<Integer, Integer> LIZ = C2097608Jq.LJIIIIZZ(new Pair(400101, 4387), new Pair(400001, 4388), new Pair(400203, 4097), new Pair(400601, 4384), new Pair(101305, 3096), new Pair(103204, 3093), new Pair(103201, 3095), new Pair(101311, 3087), new Pair(103203, 3092), new Pair(300004, 3090), new Pair(100915, 3091), new Pair(400204, 3088), new Pair(100918, 3089), new Pair(103206, 3084), new Pair(102021, 3082), new Pair(103205, 3083), new Pair(400205, 3086), new Pair(400000, 3080), new Pair(100916, 3078), new Pair(103200, 3079), new Pair(400200, 3076), new Pair(300000, 3072), new Pair(103202, 3074), new Pair(103207, 3075), new Pair(400100, 3073), new Pair(300003, 3069), new Pair(400102, 3068), new Pair(102019, 3070), new Pair(103208, 3066), new Pair(100914, 3065), new Pair(400600, 3064), new Pair(400103, 3063), new Pair(103005, 2990), new Pair(10303, 2989), new Pair(10302, 2988), new Pair(100103, 2987), new Pair(100102, 2986), new Pair(110000, 2985), new Pair(100853, 2984), new Pair(100852, 2983), new Pair(100851, 2982), new Pair(100850, 2981), new Pair(100804, 2980), new Pair(100803, 2979), new Pair(100801, 2978), new Pair(100802, 2977), new Pair(100800, 2976), new Pair(100701, 2975), new Pair(100207, 2974), new Pair(100107, 2973), new Pair(101807, 2957), new Pair(101301, 2930), new Pair(101306, 2924), new Pair(100922, 2921), new Pair(101307, 2915), new Pair(103001, 2913), new Pair(103000, 2904), new Pair(103002, 2884), new Pair(102604, 2830), new Pair(102605, 2831), new Pair(102606, 2832), new Pair(100700, 2820), new Pair(102016, 2821), new Pair(102017, 2822), new Pair(102601, 2818), new Pair(102600, 2819), new Pair(100014, 2815), new Pair(240015, 2813), new Pair(103100, 2816), new Pair(102101, 2807), new Pair(102102, 2808), new Pair(240004, 2809), new Pair(100920, 2802), new Pair(100921, 2803), new Pair(102100, 2806), new Pair(100919, 2799), new Pair(100917, 2800), new Pair(101310, 2792), new Pair(101500, 2793), new Pair(101300, 2786), new Pair(101302, 2787), new Pair(101701, 2783), new Pair(102002, 2782), new Pair(102004, 2785), new Pair(102003, 2784), new Pair(100702, 2779), new Pair(100703, 2781), new Pair(100907, 2770), new Pair(100908, 2771), new Pair(101000, 2774), new Pair(101100, 2775), new Pair(100901, 2764), new Pair(100902, 2765), new Pair(100903, 2766), new Pair(100904, 2767), new Pair(100905, 2768), new Pair(100906, 2769), new Pair(100003, 2761), new Pair(100008, 2762), new Pair(101802, 2757), new Pair(100012, 2763), new Pair(101800, 2753), new Pair(101801, 2756), new Pair(101803, 2752), new Pair(101805, 2755), new Pair(101806, 2751), new Pair(101809, 2754), new Pair(100200, 2748), new Pair(101804, 2750), new Pair(101808, 2749), new Pair(100201, 2747), new Pair(100101, 2746), new Pair(100100, 2745), new Pair(101700, 2696), new Pair(101308, 1284), new Pair(102014, 1140), new Pair(102020, 1105), new Pair(101200, 1054), new Pair(100017, 775), new Pair(101309, 682), new Pair(101304, 677), new Pair(100403, 579), new Pair(100501, 575), new Pair(100400, 550), new Pair(100401, 555), new Pair(100503, 560), new Pair(100500, 528), new Pair(100502, 523), new Pair(102012, 514), new Pair(100911, 495), new Pair(100912, 505), new Pair(102009, 468), new Pair(102010, 474), new Pair(102011, 463), new Pair(102000, 451), new Pair(102008, 447), new Pair(102006, 455), new Pair(102007, 439), new Pair(102018, 450), new Pair(101602, 430), new Pair(102005, 434), new Pair(100004, 378), new Pair(102001, 361), new Pair(101001, 328), new Pair(101400, 326), new Pair(101900, 336), new Pair(102013, 311), new Pair(102301, 333), new Pair(102302, 322), new Pair(100910, 286), new Pair(101600, 302), new Pair(101601, 306), new Pair(102015, 296), new Pair(102500, 288), new Pair(102501, 297), new Pair(102502, 307), new Pair(100909, 270), new Pair(100206, 219), new Pair(100009, 160), new Pair(100010, 164), new Pair(100900, 173), new Pair(100005, 146), new Pair(100006, 157), new Pair(100011, 150), new Pair(100000, 372), new Pair(100001, 115), new Pair(100007, 125), new Pair(102300, 109), new Pair(100002, 119), new Pair(100015, 98));
    public static final HashMap<String, Integer> LIZIZ = new HashMap<>(ApiHookConfig.LIZIZ.size());

    static {
        for (C823880WTq c823880WTq : ApiHookConfig.LIZIZ.values()) {
            LIZIZ.put(c823880WTq.LIZIZ, Integer.valueOf(c823880WTq.LIZ));
        }
    }

    public static int LIZ(int i) {
        Integer num = LIZ.get(Integer.valueOf(i));
        if (num != null) {
            return num.intValue();
        }
        return i;
    }

    public static int LIZIZ(int i, Object[] objArr) throws Throwable {
        String strLIZ;
        int iIntValue;
        if (i != 776) {
            if (i != 786) {
                if (i != 791) {
                    if (i != 800) {
                        if (i != 2801) {
                            if (i != 2809) {
                                if (i != 2820) {
                                    if (i != 4070) {
                                        if (i != 2784) {
                                            if (i != 2785 || objArr == null || objArr.length == 0 || objArr.length < 2) {
                                                return 0;
                                            }
                                            Object obj = objArr[1];
                                            if ((obj instanceof String) && Intrinsics.LJFF(C825280WZa.LIZ((String) obj), "2661317078413547")) {
                                                return 20;
                                            }
                                        } else {
                                            if (objArr == null || objArr.length == 0 || objArr.length < 2) {
                                                return 0;
                                            }
                                            Object obj2 = objArr[1];
                                            if ((obj2 instanceof String) && Intrinsics.LJFF(C825280WZa.LIZ((String) obj2), "2661317078413547")) {
                                                return 19;
                                            }
                                        }
                                    } else {
                                        if (objArr == null || objArr.length == 0 || Build.VERSION.SDK_INT < 31) {
                                            return 0;
                                        }
                                        Object obj3 = objArr[0];
                                        if (obj3 instanceof TelephonyCallback.CellInfoListener) {
                                            return 144;
                                        }
                                        if (obj3 instanceof TelephonyCallback.RegistrationFailedListener) {
                                            return 145;
                                        }
                                        if (obj3 instanceof TelephonyCallback.BarringInfoListener) {
                                            return 146;
                                        }
                                        if (!(obj3 instanceof TelephonyCallback.CellLocationListener)) {
                                            return 0;
                                        }
                                        return 147;
                                    }
                                } else {
                                    if (objArr != null && objArr.length != 0 && objArr.length >= 2) {
                                        Object obj4 = objArr[1];
                                        if (obj4 instanceof Sensor) {
                                            iIntValue = C2204961BRm.LJJLIIIJLJLI((Sensor) obj4, new C0WZX("dzBzEgAjS8/YVFkiQFyUc8nCTCgu5Mqc0F+HMBV3VXUh4ysDuTy2xUhhB6fMjNKP5HXsFYhe", null));
                                        } else if (obj4 instanceof Integer) {
                                            iIntValue = ((Number) obj4).intValue();
                                        }
                                        switch (iIntValue) {
                                            case -1:
                                                return 141;
                                            case 1:
                                                return 135;
                                            case 2:
                                                return 134;
                                            case 3:
                                                return 133;
                                            case 4:
                                                return 132;
                                            case 5:
                                                return 131;
                                            case 6:
                                                return 130;
                                            case 7:
                                                return 129;
                                            case 8:
                                                return 128;
                                            case BdTuring.TYPE_ECAF /* 9 */:
                                                return 127;
                                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                                return 126;
                                            case BdTuring.TYPE_EMAIL /* 11 */:
                                                return 125;
                                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                                return 124;
                                            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                                return 123;
                                            case 14:
                                                return 122;
                                            case 15:
                                                return 121;
                                            case 16:
                                                return 120;
                                            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                                return 119;
                                            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                                                return 118;
                                            case 19:
                                                return 117;
                                            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                                                return 116;
                                            case 21:
                                                return 115;
                                            case 22:
                                                return 114;
                                            case 23:
                                                return 113;
                                            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                                                return 112;
                                            case 25:
                                                return 111;
                                            case 26:
                                                return 110;
                                            case 27:
                                                return 109;
                                            case 28:
                                                return 108;
                                            case 29:
                                                return 107;
                                            case 30:
                                                return 106;
                                            case 31:
                                                return 105;
                                            case 32:
                                                return 104;
                                            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                                                return 103;
                                            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                                                return 102;
                                            case 35:
                                                return 101;
                                            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                                                return 100;
                                            case 37:
                                                return 99;
                                            case 38:
                                                return 98;
                                            case 39:
                                                return 97;
                                            case 40:
                                                return 96;
                                            case 41:
                                                return 95;
                                            case 42:
                                                return 94;
                                        }
                                    }
                                    return 0;
                                }
                            } else {
                                if (objArr == null || objArr.length == 0) {
                                    return 0;
                                }
                                Object obj5 = objArr[0];
                                if (!(obj5 instanceof Uri)) {
                                    return 0;
                                }
                                String string = ((Uri) obj5).toString();
                                if (u.LJJIIJZLJL(string, "content://call_log", false)) {
                                    return 15;
                                }
                                if (u.LJJIIJZLJL(string, "content://sms", false)) {
                                    return 16;
                                }
                                if (u.LJJIIJZLJL(string, "content://browser", false)) {
                                    return 17;
                                }
                                if (u.LJJIIJZLJL(string, "content://media/external/audio", false)) {
                                    return 18;
                                }
                                if (u.LJJIIJZLJL(string, "content://mms-sms", false)) {
                                    return 21;
                                }
                                if (u.LJJIIJZLJL(string, "content://com.android.calendar", false)) {
                                    return 23;
                                }
                                if (u.LJJIIJZLJL(string, "content://com.android.contacts", false)) {
                                    return 24;
                                }
                                if (u.LJJIIJZLJL(string, "content://com.android.chrome.browser", false)) {
                                    return 25;
                                }
                                if (u.LJJIIJZLJL(string, "content://media/external/images", false)) {
                                    return 26;
                                }
                                if (u.LJJIIJZLJL(string, "content://media/internal/images", false)) {
                                    return 27;
                                }
                                if (!u.LJJIIJZLJL(string, "content://media/external/video", false)) {
                                    return 0;
                                }
                                return 51;
                            }
                        } else {
                            if (objArr == null || objArr.length == 0 || objArr.length < 2) {
                                return 0;
                            }
                            Object obj6 = objArr[0];
                            if (!(obj6 instanceof Integer)) {
                                return 0;
                            }
                            Number number = (Number) obj6;
                            if ((number.intValue() & 1024) != 0) {
                                return 142;
                            }
                            if ((number.intValue() & 16) != 0) {
                                return 143;
                            }
                        }
                    } else if (objArr != null && objArr.length != 0 && objArr.length != 0) {
                        Object obj7 = objArr[0];
                        if ((obj7 instanceof Integer) && Intrinsics.LJFF(obj7, 23)) {
                            return 50;
                        }
                    }
                    return 0;
                }
                if (objArr == null || objArr.length == 0) {
                    return 0;
                }
                Object obj8 = objArr[0];
                if (!(obj8 instanceof String)) {
                    return 0;
                }
                String str = (String) obj8;
                int iHashCode = str.hashCode();
                if (iHashCode != -1786086673) {
                    if (iHashCode != -249002291) {
                        if (iHashCode != 669414063 || !str.equals("60381455696435532")) {
                            return 0;
                        }
                        return 156;
                    }
                    if (!str.equals("-2623567947484815243")) {
                        return 0;
                    }
                    return 155;
                }
                if (!str.equals("-8956972571025042521")) {
                    return 0;
                }
                return 154;
            }
            if (objArr == null || objArr.length == 0) {
                return 0;
            }
            Object obj9 = objArr[0];
            if (!(obj9 instanceof String)) {
                return 0;
            }
            String str2 = (String) obj9;
            int iHashCode2 = str2.hashCode();
            if (iHashCode2 != -1786086673) {
                if (iHashCode2 != -249002291) {
                    if (iHashCode2 != 669414063 || !str2.equals("60381455696435532")) {
                        return 0;
                    }
                    return 153;
                }
                if (!str2.equals("-2623567947484815243")) {
                    return 0;
                }
                return 151;
            }
            if (!str2.equals("-8956972571025042521")) {
                return 0;
            }
            return 152;
        }
        if (objArr == null || objArr.length == 0) {
            return 0;
        }
        Object obj10 = objArr[0];
        if (!(obj10 instanceof String) || (strLIZ = C825280WZa.LIZ((String) obj10)) == null) {
            return 0;
        }
        int iHashCode3 = strLIZ.hashCode();
        if (iHashCode3 != -1786086673) {
            if (iHashCode3 != -249002291) {
                if (iHashCode3 != 669414063 || !strLIZ.equals("60381455696435532")) {
                    return 0;
                }
                return 150;
            }
            if (!strLIZ.equals("-2623567947484815243")) {
                return 0;
            }
            return 149;
        }
        if (!strLIZ.equals("-8956972571025042521")) {
            return 0;
        }
        return 148;
    }
}
