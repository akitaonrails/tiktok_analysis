package X;

import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselInfoStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import com.ss.android.ugc.aweme.feed.model.search.CommentSuggestWordList;
import com.ss.android.ugc.aweme.feed.model.search.SearchAdOutAnchor;
import com.ss.android.ugc.aweme.feed.model.search.SearchAdSuggestWordModel;
import com.ss.android.ugc.aweme.feed.model.search.SearchAdWatchWhileLoadingModel;
import com.ss.android.ugc.aweme.feed.model.search.SuggestWordStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0cOQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1010120cOQ {
    public static final boolean LIZJ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || !LIZLLL(awemeRawAd)) {
            return false;
        }
        return true;
    }

    public static final boolean LIZLLL(AwemeRawAd awemeRawAd) {
        if (awemeRawAd != null && LJJIII(awemeRawAd) && Intrinsics.LJFF(awemeRawAd.getSearchAdInfo().enableSearchFollowBtn, Boolean.TRUE)) {
            return true;
        }
        return false;
    }

    public static final int LJ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        PhotoCarouselInfoStruct photoCarouselInfo;
        Integer dynamicCarouselFirstIndex;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (photoCarouselInfo = awemeRawAd.getPhotoCarouselInfo()) != null && (dynamicCarouselFirstIndex = photoCarouselInfo.getDynamicCarouselFirstIndex()) != null) {
            return dynamicCarouselFirstIndex.intValue();
        }
        return 0;
    }

    public static final String LJFF(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        String str;
        String str2;
        List<Product> list;
        Product product;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            AwemeSearchAdModel searchAdInfo = awemeRawAd.getSearchAdInfo();
            if (searchAdInfo != null && (list = searchAdInfo.productsInfo) != null && (product = (Product) C13LP.LJJJLL(list)) != null) {
                str = product.schema;
            } else {
                str = null;
            }
            if (str != null && str.length() != 0) {
                return str;
            }
            Map<String, String> searchAdExtraParams = awemeRawAd.getSearchAdExtraParams();
            if (searchAdExtraParams != null && (str2 = searchAdExtraParams.get("close_loop_pdp_schema")) != null && str2.length() != 0) {
                return str2;
            }
            String strLJI = LJI(aweme);
            if (strLJI != null && strLJI.length() != 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("aweme://ec/pdp?product_id=");
                sbLIZ.append(strLJI);
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            String openUrl = awemeRawAd.getOpenUrl();
            if (openUrl != null && openUrl.length() != 0 && u.LJJIIJZLJL(openUrl, "aweme://ec/pdp", false)) {
                return openUrl;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LJI(com.ss.android.ugc.aweme.feed.model.Aweme r6) {
        /*
            r3 = 0
            if (r6 == 0) goto L9e
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r6.getAwemeRawAd()
            if (r0 == 0) goto L9e
            java.util.Map r6 = r0.getSearchAdExtraParams()
            if (r6 != 0) goto L10
            return r3
        L10:
            java.lang.String r4 = "close_loop_product_id"
            java.lang.Object r1 = r6.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L1b
            r1 = r3
        L1b:
            r5 = 0
            if (r1 == 0) goto L28
            int r0 = r1.length()
            if (r0 == 0) goto L28
            r0 = 0
        L25:
            if (r0 != 0) goto L2a
            return r1
        L28:
            r0 = 1
            goto L25
        L2a:
            java.lang.String r0 = "pack"
            java.lang.Object r2 = r6.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L46
            java.lang.String r0 = "sati_pack"
            java.lang.Object r2 = r6.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L46
            java.lang.String r0 = "ad_pack"
            java.lang.Object r2 = r6.get(r0)
            java.lang.String r2 = (java.lang.String) r2
        L46:
            if (r2 != 0) goto L49
            r2 = r3
        L49:
            if (r2 == 0) goto L55
            int r0 = r2.length()
            if (r0 == 0) goto L55
            r0 = 0
        L52:
            if (r0 != 0) goto L9e
            goto L57
        L55:
            r0 = 1
            goto L52
        L57:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L89
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L89
            java.lang.String r0 = "tiktok"
            org.json.JSONObject r1 = r1.optJSONObject(r0)     // Catch: java.lang.Throwable -> L89
            if (r1 == 0) goto L84
            java.lang.String r0 = "sati"
            org.json.JSONObject r1 = r1.optJSONObject(r0)     // Catch: java.lang.Throwable -> L89
            if (r1 == 0) goto L84
            java.lang.String r0 = "search"
            org.json.JSONObject r0 = r1.optJSONObject(r0)     // Catch: java.lang.Throwable -> L89
            if (r0 == 0) goto L84
            java.lang.String r1 = r0.optString(r4)     // Catch: java.lang.Throwable -> L89
            if (r1 == 0) goto L84
            int r0 = r1.length()     // Catch: java.lang.Throwable -> L89
            if (r0 <= 0) goto L81
            r5 = 1
        L81:
            if (r5 == 0) goto L84
            goto L85
        L84:
            r1 = r3
        L85:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L89
            goto L95
        L89:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L95:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L9c
            r3 = r1
        L9c:
            java.lang.String r3 = (java.lang.String) r3
        L9e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1010120cOQ.LJI(com.ss.android.ugc.aweme.feed.model.Aweme):java.lang.String");
    }

    public static final String LJII(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        SearchAdSuggestWordModel searchAdSuggestWordModel;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (searchAdSuggestWordModel = awemeRawAd.getSearchAdSuggestWordModel()) != null) {
            return searchAdSuggestWordModel.getSearchAdExtra();
        }
        return null;
    }

    public static final AwemeRawAd LJIIIIZZ(Aweme aweme) {
        AwemeCommerceStruct commerceVideoAuthInfo;
        if (aweme != null && (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) != null) {
            return commerceVideoAuthInfo.getPseudoAdData();
        }
        return null;
    }

    public static final boolean LJIIIZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        CommentSuggestWordList commentSuggestWordList;
        List<SuggestWordStruct> suggestWords;
        String scene;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getSearchAdSuggestWordModel() != null && (commentSuggestWordList = aweme.getCommentSuggestWordList()) != null && (suggestWords = commentSuggestWordList.getSuggestWords()) != null && !suggestWords.isEmpty()) {
            for (SuggestWordStruct suggestWordStruct : suggestWords) {
                if (suggestWordStruct != null) {
                    scene = suggestWordStruct.getScene();
                } else {
                    scene = null;
                }
                if (Intrinsics.LJFF(scene, "feed_bar")) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static final boolean LJIIJ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        CommentSuggestWordList commentSuggestWordList;
        List<SuggestWordStruct> suggestWords;
        String scene;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && awemeRawAd.getSearchAdSuggestWordModel() != null && (commentSuggestWordList = aweme.getCommentSuggestWordList()) != null && (suggestWords = commentSuggestWordList.getSuggestWords()) != null && !suggestWords.isEmpty()) {
            for (SuggestWordStruct suggestWordStruct : suggestWords) {
                if (suggestWordStruct != null) {
                    scene = suggestWordStruct.getScene();
                } else {
                    scene = null;
                }
                if (Intrinsics.LJFF(scene, "comment_top")) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static final boolean LJIIJJI(Aweme aweme) {
        String webUrl;
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        String openUrl = null;
        if (awemeRawAd != null) {
            webUrl = awemeRawAd.getWebUrl();
        } else {
            webUrl = null;
        }
        if (TextUtils.isEmpty(webUrl)) {
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (awemeRawAd2 != null) {
                openUrl = awemeRawAd2.getOpenUrl();
            }
            if (TextUtils.isEmpty(openUrl)) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJIIL(com.ss.android.ugc.aweme.feed.model.Aweme r3) {
        /*
            boolean r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.isAdTraffic(r3)
            r2 = 0
            if (r0 == 0) goto L47
            boolean r0 = LJIJI(r3)
            if (r0 == 0) goto L47
            boolean r0 = LJIILL(r3)
            if (r0 != 0) goto L47
            boolean r0 = LIZJ(r3)
            if (r0 != 0) goto L47
            boolean r0 = LJIIJJI(r3)
            if (r0 != 0) goto L31
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r3.getAwemeRawAd()
            if (r0 == 0) goto L48
            java.lang.String r1 = r0.getType()
        L29:
            java.lang.String r0 = "message"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L47
        L31:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r3.getAwemeRawAd()
            if (r0 == 0) goto L4a
            com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel r0 = r0.getSearchAdInfo()
            if (r0 == 0) goto L4a
            java.lang.Integer r0 = r0.animationType
            if (r0 == 0) goto L4a
            int r0 = r0.intValue()
            if (r0 != 0) goto L4a
        L47:
            return r2
        L48:
            r1 = 0
            goto L29
        L4a:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1010120cOQ.LJIIL(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    public static final boolean LJIILIIL(Aweme aweme) {
        C1004580cFU shareInfo;
        Integer numValueOf;
        if (aweme == null || !LJIJI(aweme)) {
            return false;
        }
        if (C292430BdB.LIZ()) {
            InterfaceC988260bpA interfaceC988260bpALIZIZ = C655610Pnb.LIZIZ.LIZIZ(aweme);
            if (interfaceC988260bpALIZIZ != null && (shareInfo = interfaceC988260bpALIZIZ.getShareInfo()) != null && (numValueOf = Integer.valueOf(shareInfo.LIZ)) != null && numValueOf.intValue() == 3) {
                return true;
            }
            return false;
        }
        if (((ISearchAdMainService) ServiceManager.get().getService(ISearchAdMainService.class)).LJIIIIZZ().LJII(aweme) == 3) {
            return true;
        }
        return false;
    }

    public static final boolean LJIILJJIL(Aweme aweme) {
        C1004580cFU shareInfo;
        Integer numValueOf;
        if (aweme == null || !LJIJI(aweme)) {
            return false;
        }
        if (C292430BdB.LIZ()) {
            InterfaceC988260bpA interfaceC988260bpALIZIZ = C655610Pnb.LIZIZ.LIZIZ(aweme);
            if (interfaceC988260bpALIZIZ != null && (shareInfo = interfaceC988260bpALIZIZ.getShareInfo()) != null && (numValueOf = Integer.valueOf(shareInfo.LIZ)) != null) {
                if (numValueOf.intValue() == 2 || numValueOf.intValue() == 3) {
                    return true;
                }
                return false;
            }
            return false;
        }
        InterfaceC1010140cOS interfaceC1010140cOSLJIIIIZZ = ((ISearchAdMainService) ServiceManager.get().getService(ISearchAdMainService.class)).LJIIIIZZ();
        if (interfaceC1010140cOSLJIIIIZZ.LJII(aweme) == 2 || interfaceC1010140cOSLJIIIIZZ.LJII(aweme) == 3) {
            return true;
        }
        return false;
    }

    public static final boolean LJIILL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        return LJIILLIIL(awemeRawAd);
    }

    public static final boolean LJIILLIIL(AwemeRawAd awemeRawAd) {
        AwemeSearchAdModel searchAdInfo;
        SearchAdOutAnchor searchAdOutAnchor;
        if (!LJIJJ(awemeRawAd) || awemeRawAd == null || (searchAdInfo = awemeRawAd.getSearchAdInfo()) == null || (searchAdOutAnchor = searchAdInfo.outAnchor) == null || !Intrinsics.LJFF(searchAdOutAnchor.getShowAnchor(), Boolean.TRUE)) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIZILJ(AwemeRawAd awemeRawAd) {
        Integer num;
        AwemeSearchAdModel searchAdInfo = awemeRawAd.getSearchAdInfo();
        if (searchAdInfo != null && (num = searchAdInfo.searchFormatType) != null && num.intValue() == 45) {
            return true;
        }
        return false;
    }

    public static final boolean LJIJ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        boolean zLJFF;
        AwemeRawAd awemeRawAd2;
        AwemeSearchAdModel searchAdInfo;
        Integer num;
        AwemeSearchAdModel searchAdInfo2;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
            if (awemeRawAd3 != null && (searchAdInfo2 = awemeRawAd3.getSearchAdInfo()) != null) {
                zLJFF = Intrinsics.LJFF(searchAdInfo2.isV2LWithProduct(), Boolean.TRUE);
            } else {
                zLJFF = false;
            }
            if (zLJFF) {
                return true;
            }
            if (!LJJIJL(aweme) && ((awemeRawAd2 = aweme.getAwemeRawAd()) == null || (searchAdInfo = awemeRawAd2.getSearchAdInfo()) == null || (num = searchAdInfo.searchFormatType) == null || num.intValue() != 11)) {
                return false;
            }
            String strLJI = LJI(aweme);
            if (strLJI != null && strLJI.length() != 0) {
                return true;
            }
            String openUrl = awemeRawAd.getOpenUrl();
            if (openUrl != null && openUrl.length() != 0 && u.LJJIIJZLJL(openUrl, "aweme://ec/pdp", false)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJIJI(Aweme aweme) {
        if (aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if ((awemeRawAd != null && LJIJJ(awemeRawAd)) || LJJIJ(aweme)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJIJJ(AwemeRawAd awemeRawAd) {
        if (awemeRawAd != null && awemeRawAd.getSearchAdInfo() != null) {
            return true;
        }
        return false;
    }

    public static final boolean LJIJJLI(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AwemeSearchAdModel searchAdInfo;
        Integer num;
        AwemeSearchAdModel searchAdInfo2;
        Integer num2;
        if (!LJIJI(aweme)) {
            return false;
        }
        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
        if ((awemeRawAd2 == null || (searchAdInfo2 = awemeRawAd2.getSearchAdInfo()) == null || (num2 = searchAdInfo2.searchFormatType) == null || num2.intValue() != 31) && ((awemeRawAd = aweme.getAwemeRawAd()) == null || (searchAdInfo = awemeRawAd.getSearchAdInfo()) == null || (num = searchAdInfo.searchFormatType) == null || num.intValue() != 30)) {
            return false;
        }
        return true;
    }

    public static final boolean LJIL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AwemeSearchAdModel searchAdInfo;
        if (LJIJI(aweme) && aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (searchAdInfo = awemeRawAd.getSearchAdInfo()) != null && searchAdInfo.productCarousel != null) {
            return true;
        }
        return false;
    }

    public static final boolean LJJ(Aweme aweme) {
        String string;
        C1906207dM c1906207dM = C1906207dM.LIZ;
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        String string2 = null;
        if (awemeRawAd != null) {
            string = Integer.valueOf(awemeRawAd.getRit()).toString();
        } else {
            string = null;
        }
        c1906207dM.getClass();
        if (!C1906207dM.LIZ(string, "530")) {
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (awemeRawAd2 != null) {
                string2 = Integer.valueOf(awemeRawAd2.getRit()).toString();
            }
            if (!C1906207dM.LIZ(string2, "531")) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static final boolean LJJI(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (!LJJ(aweme) || (awemeRawAd = aweme.getAwemeRawAd()) == null || awemeRawAd.getEcomCardType() != C0N6F.VIDEO.getValue()) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIFFI(Aweme aweme) {
        if (aweme.getAwemeType() == 150 && LJIJI(aweme) && aweme.getPhotoModeImageInfo() != null) {
            return true;
        }
        return false;
    }

    public static final boolean LJJII(Aweme aweme) {
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null && LJJIII(awemeRawAd)) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIII(AwemeRawAd awemeRawAd) {
        AwemeSearchAdModel searchAdInfo;
        if (awemeRawAd != null && (searchAdInfo = awemeRawAd.getSearchAdInfo()) != null) {
            return Intrinsics.LJFF(searchAdInfo.isCiAd(), Boolean.TRUE);
        }
        return false;
    }

    public static final boolean LJJIIJ(Aweme aweme) {
        String string;
        AwemeRawAd awemeRawAd;
        C1906207dM c1906207dM = C1906207dM.LIZ;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            string = Integer.valueOf(awemeRawAd.getRit()).toString();
        } else {
            string = null;
        }
        c1906207dM.getClass();
        return C1906207dM.LIZ(string, "530");
    }

    public static final boolean LJJIIJZLJL(Aweme aweme) {
        String str;
        Map<String, String> searchAdExtraParams;
        if (aweme == null || !AwemeExtKt.isAdTraffic(aweme)) {
            return false;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null && (searchAdExtraParams = awemeRawAd.getSearchAdExtraParams()) != null) {
            str = searchAdExtraParams.get("inner_ad_from_inner_network_request");
        } else {
            str = null;
        }
        return Intrinsics.LJFF("1", str);
    }

    public static final boolean LJJIIZ(Aweme aweme) {
        User author;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && C1009740cNo.LJII(aweme) && aweme != null && (author = aweme.getAuthor()) != null && author.isLive()) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIIZI(AwemeRawAd awemeRawAd) {
        Integer num;
        Integer num2;
        Integer num3;
        if (awemeRawAd != null) {
            AwemeSearchAdModel searchAdInfo = awemeRawAd.getSearchAdInfo();
            if (searchAdInfo != null && (num3 = searchAdInfo.searchFormatType) != null && num3.intValue() == 54) {
                return true;
            }
            AwemeSearchAdModel searchAdInfo2 = awemeRawAd.getSearchAdInfo();
            if (searchAdInfo2 != null && (num2 = searchAdInfo2.searchFormatType) != null && num2.intValue() == 53) {
                return true;
            }
            AwemeSearchAdModel searchAdInfo3 = awemeRawAd.getSearchAdInfo();
            if (searchAdInfo3 != null && (num = searchAdInfo3.searchFormatType) != null && num.intValue() == 55) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJJIJ(Aweme aweme) {
        AwemeCommerceStruct commerceVideoAuthInfo;
        AwemeCommerceStruct commerceVideoAuthInfo2;
        AwemeRawAd pseudoAdData;
        if (aweme != null && (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) != null && commerceVideoAuthInfo.isPseudoAd() && (commerceVideoAuthInfo2 = aweme.getCommerceVideoAuthInfo()) != null && (pseudoAdData = commerceVideoAuthInfo2.getPseudoAdData()) != null && pseudoAdData.isFromSearch()) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIJIIJI(AwemeRawAd awemeRawAd) {
        AwemeSearchAdModel searchAdInfo;
        Integer num;
        if (awemeRawAd == null || (searchAdInfo = awemeRawAd.getSearchAdInfo()) == null || (num = searchAdInfo.searchFormatType) == null || num.intValue() != 25) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIJIIJIL(AwemeRawAd awemeRawAd) {
        Integer num;
        Integer num2;
        if (awemeRawAd != null) {
            AwemeSearchAdModel searchAdInfo = awemeRawAd.getSearchAdInfo();
            if (searchAdInfo != null && (num2 = searchAdInfo.searchFormatType) != null && num2.intValue() == 22) {
                return true;
            }
            AwemeSearchAdModel searchAdInfo2 = awemeRawAd.getSearchAdInfo();
            if (searchAdInfo2 != null && (num = searchAdInfo2.searchFormatType) != null && num.intValue() == 37) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJJIJIL(AwemeRawAd awemeRawAd) {
        if (awemeRawAd != null && LJJIII(awemeRawAd) && !LIZLLL(awemeRawAd)) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIJL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AwemeSearchAdModel searchAdInfo;
        Integer num;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (searchAdInfo = awemeRawAd.getSearchAdInfo()) == null || (num = searchAdInfo.searchFormatType) == null || num.intValue() != 4) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIJLIJ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AwemeSearchAdModel searchAdInfo;
        if (aweme != null && aweme.isAd() && (awemeRawAd = aweme.getAwemeRawAd()) != null && (searchAdInfo = awemeRawAd.getSearchAdInfo()) != null && searchAdInfo.chainParamMap != null) {
            return true;
        }
        return false;
    }

    public static final void LJJIL(C1004580cFU c1004580cFU) {
        c1004580cFU.getClass();
        c1004580cFU.LIZ = 1;
        c1004580cFU.LIZJ = new LinkedHashSet();
        c1004580cFU.LIZLLL = true;
        c1004580cFU.LJ = true;
        c1004580cFU.LJIIIZ = null;
        c1004580cFU.LJIIJ = false;
        c1004580cFU.LJIIJJI = null;
    }

    public static final void LJJIZ(Aweme aweme) {
        if (aweme != null && LJIJI(aweme)) {
            ((ISearchAdMainService) ServiceManager.get().getService(ISearchAdMainService.class)).LJIIIIZZ().LIZLLL(1, aweme);
        }
    }

    public static final boolean LJJJ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AwemeSearchAdModel searchAdInfo;
        if (!LJIJI(aweme) || (awemeRawAd = aweme.getAwemeRawAd()) == null || (searchAdInfo = awemeRawAd.getSearchAdInfo()) == null || !Intrinsics.LJFF(searchAdInfo.autoOpenPdpInflow, Boolean.TRUE)) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJI(AwemeRawAd awemeRawAd) {
        AwemeSearchAdModel searchAdInfo;
        String webUrl;
        if (awemeRawAd == null || (searchAdInfo = awemeRawAd.getSearchAdInfo()) == null || searchAdInfo.watchWhileLoading == null) {
            return false;
        }
        NativeSiteConfig nativeSiteConfig = awemeRawAd.getNativeSiteConfig();
        if (nativeSiteConfig == null || (webUrl = nativeSiteConfig.lynxScheme) == null) {
            webUrl = awemeRawAd.getWebUrl();
        }
        if (!Intrinsics.LJFF(awemeRawAd.getType(), "web") || webUrl == null || webUrl.length() == 0) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJIL(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AwemeSearchAdModel searchAdInfo;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && (awemeRawAd = aweme.getAwemeRawAd()) != null && (searchAdInfo = awemeRawAd.getSearchAdInfo()) != null) {
            Integer num = searchAdInfo.adLinkIconStyle;
            int value = EnumC1996407ru.RIGHT_OF_NAME.getValue();
            if (num != null && num.intValue() == value) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJJJJ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AwemeSearchAdModel searchAdInfo;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (searchAdInfo = awemeRawAd.getSearchAdInfo()) != null) {
            return Intrinsics.LJFF(searchAdInfo.shouldTrackStayDuration, Boolean.TRUE);
        }
        return false;
    }

    public static final boolean LIZ(Aweme aweme, String str) {
        AwemeRawAd awemeRawAd;
        AnoleModel anoleModel;
        Map<String, AnoleComponentModel> map;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (anoleModel = awemeRawAd.getAnoleModel()) == null || (map = anoleModel.components) == null || map.isEmpty()) {
            return false;
        }
        Iterator<Map.Entry<String, AnoleComponentModel>> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(it2.next().getValue().slotID, str)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LIZIZ(int i, AwemeRawAd awemeRawAd) {
        String str;
        AwemeSearchAdModel searchAdInfo;
        SearchAdWatchWhileLoadingModel searchAdWatchWhileLoadingModel;
        List<String> enableClickAreaList;
        if (i != 53 && i != 54) {
            if (i != 80) {
                str = "";
            } else {
                str = "non_button";
            }
        } else {
            str = "button";
        }
        if (awemeRawAd != null && (searchAdInfo = awemeRawAd.getSearchAdInfo()) != null && (searchAdWatchWhileLoadingModel = searchAdInfo.watchWhileLoading) != null && (enableClickAreaList = searchAdWatchWhileLoadingModel.getEnableClickAreaList()) != null && enableClickAreaList.contains(str) && LJJJI(awemeRawAd)) {
            return true;
        }
        return false;
    }

    public static final void LJJJJI(C1004580cFU c1004580cFU, C1004580cFU c1004580cFU2) {
        c1004580cFU.getClass();
        c1004580cFU.LIZ = c1004580cFU2.LIZ;
        c1004580cFU.LIZJ = c1004580cFU2.LIZJ;
        c1004580cFU.LIZLLL = c1004580cFU2.LIZLLL;
        c1004580cFU.LJ = c1004580cFU2.LJ;
        c1004580cFU.LIZIZ = c1004580cFU2.LIZIZ;
        c1004580cFU.LJIIIZ = c1004580cFU2.LJIIIZ;
        c1004580cFU.LJIIJ = c1004580cFU2.LJIIJ;
        c1004580cFU.LJIIJJI = c1004580cFU2.LJIIJJI;
    }
}
