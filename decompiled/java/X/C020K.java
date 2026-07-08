package X;

import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Map;

/* JADX INFO: renamed from: X.020K, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public class C020K extends C09AY implements InterfaceC1631620sYq {
    public final int $t;

    @Override // X.InterfaceC1631620sYq
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            case 4:
                return invoke$4(this, obj, obj2, obj3);
            case 5:
                return invoke$5(this, obj, obj2, obj3);
            case 6:
                return invoke$6(this, obj, obj2, obj3);
            case 7:
                return invoke$7(this, obj, obj2, obj3);
            case 8:
                return invoke$8(this, obj, obj2, obj3);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2, obj3);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2, obj3);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2, obj3);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj, obj2, obj3);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj, obj2, obj3);
            case 14:
                return invoke$14(this, obj, obj2, obj3);
            case 15:
                return invoke$15(this, obj, obj2, obj3);
            case 16:
                return invoke$16(this, obj, obj2, obj3);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj, obj2, obj3);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj, obj2, obj3);
            case 19:
                return invoke$19(this, obj, obj2, obj3);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj, obj2, obj3);
            case 21:
                return invoke$21(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020K(int i) {
        super(3);
        this.$t = i;
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(C020K c020k, Object obj, Object obj2, Object obj3) {
        Uri.Builder builder = (Uri.Builder) obj;
        String str = (String) obj2;
        String strValueOf = String.valueOf(((Number) obj3).longValue());
        if (strValueOf != null) {
            builder.appendQueryParameter(str, strValueOf);
        }
        return builder;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(C020K c020k, Object obj, Object obj2, Object obj3) {
        String str;
        Map map = (Map) obj;
        if (((Boolean) obj3).booleanValue()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put(obj2, str);
        return map;
    }

    public static /* bridge */ /* synthetic */ Object invoke$10(C020K c020k, Object obj, Object obj2, Object obj3) {
        BaseBundle baseBundle = (BaseBundle) obj;
        baseBundle.putLong((String) obj2, ((Number) obj3).longValue());
        return baseBundle;
    }

    public static /* bridge */ /* synthetic */ Object invoke$11(C020K c020k, Object obj, Object obj2, Object obj3) {
        Bundle bundle = (Bundle) obj;
        bundle.putFloat((String) obj2, ((Number) obj3).floatValue());
        return bundle;
    }

    public static /* bridge */ /* synthetic */ Object invoke$12(C020K c020k, Object obj, Object obj2, Object obj3) {
        Map map = (Map) obj;
        String strValueOf = String.valueOf(((Number) obj3).doubleValue());
        if (strValueOf != null) {
            map.put(obj2, strValueOf);
        }
        return map;
    }

    public static /* bridge */ /* synthetic */ Object invoke$13(C020K c020k, Object obj, Object obj2, Object obj3) {
        Uri.Builder builder = (Uri.Builder) obj;
        String str = (String) obj2;
        String strValueOf = String.valueOf(((Number) obj3).doubleValue());
        if (strValueOf != null) {
            builder.appendQueryParameter(str, strValueOf);
        }
        return builder;
    }

    public static /* bridge */ /* synthetic */ Object invoke$14(C020K c020k, Object obj, Object obj2, Object obj3) {
        Map map = (Map) obj;
        if (obj3 != null) {
            map.put(obj2, obj3);
        }
        return map;
    }

    public static /* bridge */ /* synthetic */ Object invoke$15(C020K c020k, Object obj, Object obj2, Object obj3) {
        Uri.Builder builder = (Uri.Builder) obj;
        String str = (String) obj2;
        String str2 = (String) obj3;
        if (str2 != null) {
            builder.appendQueryParameter(str, str2);
        }
        return builder;
    }

    public static /* bridge */ /* synthetic */ Object invoke$16(C020K c020k, Object obj, Object obj2, Object obj3) {
        Map map = (Map) obj;
        String strLJJLIIIJ = C13LP.LJJLIIIJ((Iterable) obj3, ",", null, null, 0, null, null, 62);
        if (strLJJLIIIJ != null) {
            map.put(obj2, strLJJLIIIJ);
        }
        return map;
    }

    public static /* bridge */ /* synthetic */ Object invoke$17(C020K c020k, Object obj, Object obj2, Object obj3) {
        Uri.Builder builder = (Uri.Builder) obj;
        String str = (String) obj2;
        String strLJJLIIIJ = C13LP.LJJLIIIJ((Iterable) obj3, ",", null, null, 0, null, null, 62);
        if (strLJJLIIIJ != null) {
            builder.appendQueryParameter(str, strLJJLIIIJ);
        }
        return builder;
    }

    public static /* bridge */ /* synthetic */ Object invoke$18(C020K c020k, Object obj, Object obj2, Object obj3) {
        Map map = (Map) obj;
        map.put(obj2, String.valueOf(obj3));
        return map;
    }

    public static /* bridge */ /* synthetic */ Object invoke$19(C020K c020k, Object obj, Object obj2, Object obj3) {
        Uri.Builder builder = (Uri.Builder) obj;
        builder.appendQueryParameter((String) obj2, String.valueOf(obj3));
        return builder;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(C020K c020k, Object obj, Object obj2, Object obj3) {
        BaseBundle baseBundle = (BaseBundle) obj;
        baseBundle.putDouble((String) obj2, ((Number) obj3).doubleValue());
        return baseBundle;
    }

    public static /* bridge */ /* synthetic */ Object invoke$20(C020K c020k, Object obj, Object obj2, Object obj3) {
        String str;
        Uri.Builder builder = (Uri.Builder) obj;
        String str2 = (String) obj2;
        if (((Boolean) obj3).booleanValue()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        builder.appendQueryParameter(str2, str);
        return builder;
    }

    public static /* bridge */ /* synthetic */ Object invoke$21(C020K c020k, Object obj, Object obj2, Object obj3) {
        Uri.Builder builder = (Uri.Builder) obj;
        String str = (String) obj2;
        String strValueOf = String.valueOf(((Number) obj3).intValue());
        if (strValueOf != null) {
            builder.appendQueryParameter(str, strValueOf);
        }
        return builder;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(C020K c020k, Object obj, Object obj2, Object obj3) {
        Uri.Builder builder = (Uri.Builder) obj;
        String str = (String) obj2;
        String strValueOf = String.valueOf(((Number) obj3).floatValue());
        if (strValueOf != null) {
            builder.appendQueryParameter(str, strValueOf);
        }
        return builder;
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(C020K c020k, Object obj, Object obj2, Object obj3) {
        Map map = (Map) obj;
        String strValueOf = String.valueOf(((Number) obj3).intValue());
        if (strValueOf != null) {
            map.put(obj2, strValueOf);
        }
        return map;
    }

    public static /* bridge */ /* synthetic */ Object invoke$5(C020K c020k, Object obj, Object obj2, Object obj3) {
        Bundle bundle = (Bundle) obj;
        C786410Ut5.LJJJI((String) obj2, (String) obj3, bundle);
        return bundle;
    }

    public static /* bridge */ /* synthetic */ Object invoke$6(C020K c020k, Object obj, Object obj2, Object obj3) {
        Map map = (Map) obj;
        String strValueOf = String.valueOf(((Number) obj3).longValue());
        if (strValueOf != null) {
            map.put(obj2, strValueOf);
        }
        return map;
    }

    public static /* bridge */ /* synthetic */ Object invoke$7(C020K c020k, Object obj, Object obj2, Object obj3) {
        BaseBundle baseBundle = (BaseBundle) obj;
        baseBundle.putBoolean((String) obj2, ((Boolean) obj3).booleanValue());
        return baseBundle;
    }

    public static /* bridge */ /* synthetic */ Object invoke$8(C020K c020k, Object obj, Object obj2, Object obj3) {
        Map map = (Map) obj;
        String strValueOf = String.valueOf(((Number) obj3).floatValue());
        if (strValueOf != null) {
            map.put(obj2, strValueOf);
        }
        return map;
    }

    public static /* bridge */ /* synthetic */ Object invoke$9(C020K c020k, Object obj, Object obj2, Object obj3) {
        BaseBundle baseBundle = (BaseBundle) obj;
        baseBundle.putInt((String) obj2, ((Number) obj3).intValue());
        return baseBundle;
    }
}
