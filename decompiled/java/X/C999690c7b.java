package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.h;
import com.google.gson.n;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.EcUgVSAData;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0c7b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C999690c7b {
    public static final /* synthetic */ int LIZ = 0;

    public static Bundle LIZIZ(Context context, Aweme aweme) {
        String nativeSiteCustomData;
        AwemeRawAd awemeRawAd;
        Bundle bundle = new Bundle();
        InterfaceC1000280c8Y interfaceC1000280c8YLIZ = C988590bph.LIZ();
        if (interfaceC1000280c8YLIZ != null) {
            interfaceC1000280c8YLIZ.LJIJJ(context, bundle, aweme);
        }
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            nativeSiteCustomData = awemeRawAd.getNativeSiteCustomData();
        } else {
            nativeSiteCustomData = null;
        }
        C786410Ut5.LJJJI("bundle_native_site_custom_data", nativeSiteCustomData, bundle);
        return bundle;
    }

    public static n LIZ(Aweme aweme, CardStruct cardStruct, Context context) {
        String aid;
        String str;
        String uniqueId;
        User author;
        User author2;
        UrlModel avatarMedium;
        List<String> urlList;
        String strJ3;
        String string;
        String string2;
        String str2;
        int iIntValue;
        Integer num;
        List<String> urlList2;
        n nVar = new n();
        String str3 = "";
        Number numberValueOf = null;
        if (aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                Long adId = awemeRawAd.getAdId();
                if (adId != null) {
                    string = adId.toString();
                } else {
                    string = null;
                }
                nVar.LJJIIJ("adId", string);
                nVar.LJJIIJ("creativeId", awemeRawAd.getCreativeIdStr());
                nVar.LJJIIJ("logExtra", awemeRawAd.getLogExtra());
                Long groupId = awemeRawAd.getGroupId();
                if (groupId != null) {
                    string2 = groupId.toString();
                } else {
                    string2 = null;
                }
                nVar.LJJIIJ("groupId", string2);
                UrlModel clickTrackUrlList = awemeRawAd.getClickTrackUrlList();
                if (clickTrackUrlList != null && (urlList2 = clickTrackUrlList.getUrlList()) != null && !urlList2.isEmpty()) {
                    h hVar = new h();
                    Iterator<String> it2 = urlList2.iterator();
                    while (it2.hasNext()) {
                        hVar.LJJIII(it2.next());
                    }
                    nVar.LJJIFFI("clickTrackUrlList", hVar);
                }
                String nativeSiteAdInfo = awemeRawAd.getNativeSiteAdInfo();
                if (nativeSiteAdInfo == null) {
                    nativeSiteAdInfo = "";
                }
                nVar.LJJIIJ("pageData", nativeSiteAdInfo);
                NativeSiteConfig nativeSiteConfig = awemeRawAd.getNativeSiteConfig();
                if (nativeSiteConfig != null) {
                    str2 = nativeSiteConfig.lynxScheme;
                } else {
                    str2 = null;
                }
                nVar.LJJIIJ("lynxSchema", str2);
                EcUgVSAData ecUgVSAData = awemeRawAd.getEcUgVSAData();
                if (ecUgVSAData != null && (num = ecUgVSAData.adType) != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                nVar.LJJIII(Integer.valueOf(iIntValue), "vsaType");
            }
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        nVar.LJJIIJ("itemId", String.valueOf(aid));
        nVar.LJJIII(Integer.valueOf(C444960Hcc.LIZJ(context) ? 1 : 0), "isRTL");
        if (cardStruct != null) {
            JSONObject cardData = cardStruct.getCardData();
            if (cardData != null && (strJ3 = C786410Ut5.J3(cardData)) != null) {
                str3 = strJ3;
            }
            nVar.LJJIIJ("cardData", str3);
        }
        nVar.LJJIII(Integer.valueOf(C497820Jfg.LIZJ(context)), "topSafeAreaHeight");
        nVar.LJJIII(1, "isCardState");
        if (aweme != null && C1017070cZd.LLLIL(aweme)) {
            User author3 = aweme.getAuthor();
            if (author3 != null && (avatarMedium = author3.getAvatarMedium()) != null && (urlList = avatarMedium.getUrlList()) != null) {
                str = (String) ListProtector.get(urlList, 0);
            } else {
                str = null;
            }
            nVar.LJJIIJ("userAvatar", str);
            if (aweme != null && (author2 = aweme.getAuthor()) != null) {
                uniqueId = author2.getUniqueId();
            } else {
                uniqueId = null;
            }
            nVar.LJJIIJ("userNickname", uniqueId);
            if (aweme != null && (author = aweme.getAuthor()) != null) {
                numberValueOf = Integer.valueOf(author.getFollowerCount());
            }
            nVar.LJJIII(numberValueOf, "followNumber");
        }
        return nVar;
    }
}
