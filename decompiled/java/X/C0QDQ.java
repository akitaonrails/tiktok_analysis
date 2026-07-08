package X;

import com.ss.android.ugc.aweme.config.SearchBarConfig;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0QDQ, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QDQ {
    public static final SearchBarConfig LIZ = new SearchBarConfig(false, false, false, false, false, true);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(3231));

    public static SearchBarConfig LIZJ() {
        return (SearchBarConfig) LIZIZ.getValue();
    }

    public static boolean LIZIZ() {
        return LIZJ().enableMallVideo || LIZJ().enableShopVideoInMall || LIZJ().enableShopVideoOutMall || LIZJ().enableOrderVideoInMall || LIZJ().enableOrderVideoOutMall;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean LIZ(String str) {
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -950750629:
                if (str.equals("SHOP_TAB_IN_MALL")) {
                    return LIZJ().enableShopVideoInMall;
                }
                return false;
            case 86031413:
                if (str.equals("ORDER_CENTER_IN_MALL")) {
                    return LIZJ().enableOrderVideoInMall;
                }
                return false;
            case 583509793:
                if (str.equals("SHOP_TAB_IN_GENERAL")) {
                    return LIZJ().enableShopVideoOutMall;
                }
                return false;
            case 874988777:
                if (str.equals("MALL_FEED")) {
                    return LIZJ().enableMallVideo;
                }
                return false;
            case 1291081950:
                if (str.equals("VIDEO_TAB_IN_SIMPLE")) {
                    return LIZJ().enableVideoVerticalTab;
                }
                return false;
            case 1858542110:
                if (str.equals("ORDER_CENTER_OUT_MALL")) {
                    return LIZJ().enableOrderVideoOutMall;
                }
                return false;
            default:
                return false;
        }
    }
}
