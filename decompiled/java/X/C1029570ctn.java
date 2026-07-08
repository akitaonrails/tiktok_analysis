package X;

import com.ss.android.ugc.aweme.commercialize.model.LinkData;
import com.ss.android.ugc.aweme.feed.model.AnchorInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.tools.detail.IPropReuseService;
import java.util.List;

/* JADX INFO: renamed from: X.0ctn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1029570ctn {
    public static final C1029570ctn LIZ = new C1029570ctn();
    public static List<String> LIZIZ = C1697810uHb.LJIILJJIL("dou+", "company_link", "iron_man", "shopping_cart", "open_platform", "movie", "sticker");

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final String LIZ(Aweme aweme, boolean z) {
        LinkData linkDataLIZ;
        Integer numValueOf;
        boolean zShowOnFeed;
        AnchorInfo anchorInfo;
        if (aweme == null) {
            return null;
        }
        for (String str : LIZIZ) {
            switch (str.hashCode()) {
                case -1890252483:
                    if (str.equals("sticker")) {
                        zShowOnFeed = ((IPropReuseService) ServiceManager.get().getService(IPropReuseService.class)).LJIIIZ(aweme);
                    } else {
                        continue;
                    }
                    break;
                case -1648893033:
                    if (!str.equals("shopping_cart")) {
                        continue;
                    } else if (z && AwemeExtKt.getPromotion(aweme) != null) {
                        C19259110Wf c19259110Wf = C746350TPl.LIZ;
                        if (c19259110Wf.LJIIZILJ == null) {
                            c19259110Wf.LJIIZILJ = new C2230608oa<>("enable_shopping_total", Boolean.FALSE);
                        }
                        if (c19259110Wf.LJIIZILJ.LIZ().booleanValue()) {
                            return str;
                        }
                    }
                    break;
                case -309942941:
                    if (!str.equals("iron_man")) {
                        continue;
                    } else if (aweme.getMicroAppInfo() != null) {
                        return str;
                    }
                case -210508088:
                    if (!str.equals("open_platform")) {
                        continue;
                    } else if (!z && (anchorInfo = aweme.getAnchorInfo()) != null) {
                        Integer type = anchorInfo.getType();
                        int type2 = EnumC1430380nKG.OPEN_PLATFORM_ANCHOR.getTYPE();
                        if (type != null && type.intValue() == type2) {
                            return str;
                        }
                    }
                    break;
                case 3089441:
                    if (str.equals("dou+")) {
                        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                        if (awemeRawAd != null && awemeRawAd.getDouPlusLinkData() != null) {
                            return str;
                        }
                    } else {
                        continue;
                    }
                case 1429828220:
                    if (str.equals("company_link") && (linkDataLIZ = C990310bsT.LIZ(aweme)) != null && (numValueOf = Integer.valueOf(linkDataLIZ.getLinkType())) != null && numValueOf.intValue() == 0) {
                        if (z) {
                            zShowOnFeed = linkDataLIZ.showOnComment();
                        } else {
                            zShowOnFeed = linkDataLIZ.showOnFeed();
                        }
                    }
                    break;
            }
            if (zShowOnFeed) {
                return str;
            }
        }
        return null;
    }
}
