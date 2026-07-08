package X;

import com.ss.android.ugc.aweme.search.performance.chunk.core.model.PreRenderCard;
import java.util.Map;

/* JADX INFO: renamed from: X.0Pco, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C648920Pco {
    public static final EnumC648930Pcp LIZ(PreRenderCard preRenderCard) {
        EnumC648930Pcp enumC648930Pcp;
        Double d;
        if (preRenderCard.isLynx == 1) {
            if (preRenderCard.type == 9) {
                return EnumC648930Pcp.SEARCH_ECOM_PRODUCT_CARD_LYNX;
            }
            return EnumC648930Pcp.SEARCH_SPARK_LITE_LYNX;
        }
        int i = preRenderCard.type;
        if (i != 1) {
            if (i != 4) {
                if (i != 35) {
                    if (i != 200) {
                        if (i != 218) {
                            switch (i) {
                                case 202:
                                    return EnumC648930Pcp.SEARCH_MULTI;
                                case 203:
                                    return EnumC648930Pcp.SEARCH_MULTI_SUMMARY_WITH_VIDEO;
                                case 204:
                                    return EnumC648930Pcp.SEARCH_MULTI_SUMMARY_WITH_VIDEO;
                                case 205:
                                    break;
                                case 206:
                                    return EnumC648930Pcp.SEARCH_MULTI_SUMMARY_ONLINE;
                                default:
                                    return EnumC648930Pcp.UNKNOWN;
                            }
                        }
                        return EnumC648930Pcp.SEARCH_MULTI_SUMMARY_WITH_VIDEO;
                    }
                    return EnumC648930Pcp.SEARCH_HUB;
                }
                return EnumC648930Pcp.SEARCH_BOT;
            }
            return EnumC648930Pcp.SEARCH_USER;
        }
        Map<Object, ? extends Object> map = preRenderCard.detail;
        if (map != null) {
            Object obj = map.get("aweme_type");
            if ((obj instanceof Double) && (d = (Double) obj) != null && ((int) d.doubleValue()) == 150) {
                enumC648930Pcp = EnumC648930Pcp.SEARCH_PHOTO;
            } else {
                enumC648930Pcp = EnumC648930Pcp.UNKNOWN;
            }
            if (enumC648930Pcp != null) {
                return enumC648930Pcp;
            }
        }
        return EnumC648930Pcp.SEARCH_VIDEO;
    }
}
