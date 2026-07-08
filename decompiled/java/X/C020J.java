package X;

import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.020J, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public class C020J extends C09AY implements Function2 {
    public final int $t;

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj, obj2);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj, obj2);
            case 14:
                return invoke$14(this, obj, obj2);
            case 15:
                return invoke$15(this, obj, obj2);
            case 16:
                return invoke$16(this, obj, obj2);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj, obj2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj, obj2);
            case 19:
                return invoke$19(this, obj, obj2);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj, obj2);
            case 21:
                return invoke$21(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020J(int i) {
        super(2);
        this.$t = i;
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(C020J c020j, Object obj, Object obj2) {
        String strLIZ = C416901jj.LIZ((Uri) obj, (String) obj2);
        if (strLIZ == null) {
            return null;
        }
        return C2327809Ae.LJIIIIZZ(strLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(C020J c020j, Object obj, Object obj2) {
        String str;
        Object obj3 = ((Map) obj).get(obj2);
        if (obj3 == null || !(obj3 instanceof String) || (str = (String) obj3) == null) {
            return null;
        }
        return C2095008Iq.LJIIJJI(str);
    }

    public static /* bridge */ /* synthetic */ Object invoke$10(C020J c020j, Object obj, Object obj2) {
        Bundle bundle = (Bundle) obj;
        String str = (String) obj2;
        if (bundle.containsKey(str)) {
            return Float.valueOf(bundle.getFloat(str));
        }
        return null;
    }

    public static /* bridge */ /* synthetic */ Object invoke$11(C020J c020j, Object obj, Object obj2) {
        BaseBundle baseBundle = (BaseBundle) obj;
        String str = (String) obj2;
        if (baseBundle.containsKey(str)) {
            return Double.valueOf(baseBundle.getDouble(str));
        }
        return null;
    }

    public static /* bridge */ /* synthetic */ Object invoke$12(C020J c020j, Object obj, Object obj2) {
        Object obj3 = ((Map) obj).get(obj2);
        if (obj3 == null || !(obj3 instanceof String)) {
            return null;
        }
        return obj3;
    }

    public static /* bridge */ /* synthetic */ Object invoke$13(C020J c020j, Object obj, Object obj2) {
        String strLIZ = C416901jj.LIZ((Uri) obj, (String) obj2);
        if (strLIZ == null) {
            return null;
        }
        return strLIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$14(C020J c020j, Object obj, Object obj2) {
        String str;
        Object obj3 = ((Map) obj).get(obj2);
        if (obj3 == null || !(obj3 instanceof String) || (str = (String) obj3) == null) {
            return null;
        }
        return a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6);
    }

    public static /* bridge */ /* synthetic */ Object invoke$15(C020J c020j, Object obj, Object obj2) {
        String strLIZ = C416901jj.LIZ((Uri) obj, (String) obj2);
        if (strLIZ == null) {
            return null;
        }
        return a0.LJJLIIIJILLIZJL(strLIZ, new String[]{","}, 0, 6);
    }

    public static /* bridge */ /* synthetic */ Object invoke$16(C020J c020j, Object obj, Object obj2) {
        String str;
        Object obj3 = ((Map) obj).get(obj2);
        if (obj3 == null || !(obj3 instanceof String) || (str = (String) obj3) == null) {
            return null;
        }
        return UriProtector.parse(str);
    }

    public static /* bridge */ /* synthetic */ Object invoke$17(C020J c020j, Object obj, Object obj2) {
        String strLIZ = C416901jj.LIZ((Uri) obj, (String) obj2);
        if (strLIZ == null) {
            return null;
        }
        return UriProtector.parse(strLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$18(C020J c020j, Object obj, Object obj2) {
        String strLIZ = C416901jj.LIZ((Uri) obj, (String) obj2);
        if (strLIZ == null) {
            return null;
        }
        return Boolean.valueOf(Intrinsics.LJFF(strLIZ, "1"));
    }

    public static /* bridge */ /* synthetic */ Object invoke$19(C020J c020j, Object obj, Object obj2) {
        String strLIZ = C416901jj.LIZ((Uri) obj, (String) obj2);
        if (strLIZ == null) {
            return null;
        }
        return C2095008Iq.LJIIJJI(strLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(C020J c020j, Object obj, Object obj2) {
        BaseBundle baseBundle = (BaseBundle) obj;
        String str = (String) obj2;
        if (baseBundle.containsKey(str)) {
            return baseBundle.getString(str);
        }
        return null;
    }

    public static /* bridge */ /* synthetic */ Object invoke$20(C020J c020j, Object obj, Object obj2) {
        Object obj3 = ((Map) obj).get(obj2);
        if (obj3 == null || !(obj3 instanceof String)) {
            return null;
        }
        return Boolean.valueOf(Intrinsics.LJFF(obj3, "1"));
    }

    public static /* bridge */ /* synthetic */ Object invoke$21(C020J c020j, Object obj, Object obj2) {
        String strLIZ = C416901jj.LIZ((Uri) obj, (String) obj2);
        if (strLIZ == null) {
            return null;
        }
        return C2095008Iq.LJIILIIL(strLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(C020J c020j, Object obj, Object obj2) {
        String strLIZ = C416901jj.LIZ((Uri) obj, (String) obj2);
        if (strLIZ == null) {
            return null;
        }
        return C2327809Ae.LJII(strLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(C020J c020j, Object obj, Object obj2) {
        String str;
        Object obj3 = ((Map) obj).get(obj2);
        if (obj3 == null || !(obj3 instanceof String) || (str = (String) obj3) == null) {
            return null;
        }
        return C2095008Iq.LJIILIIL(str);
    }

    public static /* bridge */ /* synthetic */ Object invoke$5(C020J c020j, Object obj, Object obj2) {
        boolean zBooleanValue;
        Boolean boolValueOf;
        BaseBundle baseBundle = (BaseBundle) obj;
        String str = (String) obj2;
        if (!baseBundle.containsKey(str)) {
            return null;
        }
        String string = baseBundle.getString(str);
        if (string != null && (boolValueOf = Boolean.valueOf(Intrinsics.LJFF(string, "1"))) != null) {
            zBooleanValue = boolValueOf.booleanValue();
        } else {
            zBooleanValue = baseBundle.getBoolean(str);
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public static /* bridge */ /* synthetic */ Object invoke$6(C020J c020j, Object obj, Object obj2) {
        String str;
        Object obj3 = ((Map) obj).get(obj2);
        if (obj3 == null || !(obj3 instanceof String) || (str = (String) obj3) == null) {
            return null;
        }
        return C2327809Ae.LJIIIIZZ(str);
    }

    public static /* bridge */ /* synthetic */ Object invoke$7(C020J c020j, Object obj, Object obj2) {
        BaseBundle baseBundle = (BaseBundle) obj;
        String str = (String) obj2;
        if (baseBundle.containsKey(str)) {
            return Integer.valueOf(baseBundle.getInt(str));
        }
        return null;
    }

    public static /* bridge */ /* synthetic */ Object invoke$8(C020J c020j, Object obj, Object obj2) {
        String str;
        Object obj3 = ((Map) obj).get(obj2);
        if (obj3 == null || !(obj3 instanceof String) || (str = (String) obj3) == null) {
            return null;
        }
        return C2327809Ae.LJII(str);
    }

    public static /* bridge */ /* synthetic */ Object invoke$9(C020J c020j, Object obj, Object obj2) {
        long jLongValue;
        Long lLJIILIIL;
        BaseBundle baseBundle = (BaseBundle) obj;
        String str = (String) obj2;
        if (!baseBundle.containsKey(str)) {
            return null;
        }
        String string = baseBundle.getString(str);
        if (string != null && (lLJIILIIL = C2095008Iq.LJIILIIL(string)) != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = baseBundle.getLong(str);
        }
        return Long.valueOf(jLongValue);
    }
}
