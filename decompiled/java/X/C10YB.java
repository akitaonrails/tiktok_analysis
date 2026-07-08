package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.10YB, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10YB extends C10YC {
    public static final C10ZA LIZ = new HashMap() { // from class: X.10ZA
        {
            put("(?:share/)?@.*/video/(\\w+)/?", 0);
            put("(?:share/)?@.*/photo/(\\w+)/?", 38);
            put("(?:share/)?@.*/live/(\\w+)/?", 1);
            put("(?:share/)?@([\\w\\.]+)/?($|\\?.*)", 2);
            put("(?:share/)?tag/([^/?]+)", 3);
            put("(?:share/)?music/[^/?]*-(\\d+)(?=(?:[?/]|$))", 4);
            put("@.*/playlist/[^/?]*-(\\d+)(?=(?:[?/]|$))", 27);
            put("(?:share/)?playlist-music/[^/?]*-(\\d+)(?=(?:[?/]|$))", 25);
            put("(?:share/)?stickers?/(?:detail/)?(?:.*-)?(\\w+)/?", 5);
            put("(?:share/)?discover/([^/?]+)", 24);
            put("discover/trending/detail/([^/?]+)", 42);
            put("^/([^/]+)/trending/detail/([^/]+)$", 42);
            put("/find/([^/?]+)", 24);
            put("/channel/([^/?]+)", 24);
            put("revenue/subscription/invitation", 28);
            put("live/subscription", 36);
            put("(?:@([\\w\\.]+)/)?now/", 29);
            put("live/monetization/square/", 32);
            put("messages/chat", 31);
            put("@.+/collection/(.+-\\d+)?", 33);
            put("place/[^/?]*-(\\d+)(?=(?:[?/]|$))", 34);
            put("shop", 45);
            put("shop/pdp/.*", 46);
            put("product/.*", 39);
            put("shop/c/.*", 47);
            put("shop/k/.*", 48);
            put("shop/blog/.*", 49);
            put("shop/store/.*", 50);
            put("shop/open_homepage.*", 43);
        }
    };

    public static boolean LIZLLL(Uri uri) {
        if (uri != null && uri.getPath() != null && TextUtils.equals(uri.getHost(), "www.tiktok.com")) {
            if (PatternProtector.compile("/content/([^/?]+)").matcher(uri.getPath()).find() || PatternProtector.compile("/topic/([^/?]+)").matcher(uri.getPath()).find()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LJ(Uri uri) {
        if (uri == null) {
            return false;
        }
        if (!PatternProtector.compile("(?:share/)?discover/([^/?]+)").matcher(uri.toString()).find() && !PatternProtector.compile("/find/([^/?]+)").matcher(uri.toString()).find() && !PatternProtector.compile("/channel/([^/?]+)").matcher(uri.toString()).find() && !PatternProtector.compile("discover/trending/detail/([^/?]+)").matcher(uri.toString()).find()) {
            Pattern patternCompile = PatternProtector.compile("^/([^/]+)/trending/detail/([^/]+)$");
            String path = uri.getPath();
            path.toString();
            if (!patternCompile.matcher(path).find() && !LIZLLL(uri)) {
                return false;
            }
        }
        return true;
    }

    @Override // X.C10YC
    public final Uri LIZ(Uri uri, C1950707kX c1950707kX) {
        String host;
        String str;
        String strGroup;
        String str2;
        if (uri != null) {
            Iterator<String> it2 = C1949607kM.LIZIZ.getValue().LIZ.keySet().iterator();
            while (it2.hasNext()) {
                LIZ.put(it2.next(), 35);
            }
            int iIntValue = 0;
            String str3 = "";
            if (C10YT.LIZ()) {
                String host2 = uri.getHost();
                if (host2 == null || host2.length() == 0 || !C1E65.LIZIZ.contains(host2)) {
                    host = "";
                } else {
                    host = uri.getHost();
                }
            } else {
                String[] strArrLIZ = C1E66.LIZ();
                int length = strArrLIZ.length;
                for (int i = 0; i < length; i++) {
                    host = strArrLIZ[i];
                    if (TextUtils.equals(host, uri.getHost())) {
                        break;
                    }
                }
                host = "";
            }
            if (!host.isEmpty()) {
                String string = uri.toString();
                if (TextUtils.equals(uri.getPath(), "/") && UriProtector.getQueryParameterNames(uri).isEmpty()) {
                    return UriProtector.parse("musically://feed");
                }
                if (TextUtils.isEmpty(uri.getPath()) && UriProtector.getQueryParameterNames(uri).isEmpty()) {
                    return UriProtector.parse("musically://feed");
                }
                if (PatternProtector.compile("@([\\w\\.]+)/live").matcher(uri.toString()).find()) {
                    return C10YC.LIZJ(uri, 18, (String) ListProtector.get(uri.getPathSegments(), 0), "", c1950707kX);
                }
                if (!LJ(uri)) {
                    boolean zFind = PatternProtector.compile("(?:share/)?discover(?:/)?$").matcher(C10Y9.LIZIZ(uri.toString())).find();
                    C1400160mXW.LIZ.getClass();
                    boolean zLIZIZ = C1400160mXW.LIZIZ(uri, "should_enter_middle_page", "1");
                    if (!zFind || !zLIZIZ) {
                        if (PatternProtector.compile("api/social/invitation/redirect/").matcher(uri.toString()).find() || (PatternProtector.compile("(?:share/)?@([\\w\\.]+)/?($|\\?.*)").matcher(uri.toString()).find() && !TextUtils.isEmpty(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "invitation_code")))) {
                            return C10YC.LIZJ(uri, 22, "", "", c1950707kX);
                        }
                        if (TextUtils.equals(uri.getHost(), "tiktok.me")) {
                            return C10YC.LIZJ(uri, 40, "", "", c1950707kX);
                        }
                        if (TextUtils.equals(uri.getHost(), "shop.tiktok.com")) {
                            return C10YC.LIZJ(uri, 51, "", "", c1950707kX);
                        }
                        String strLIZIZ = C10Y9.LIZIZ(string);
                        Iterator it3 = LIZ.keySet().iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                strGroup = "";
                                str2 = "";
                                break;
                            }
                            str2 = (String) it3.next();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("https://");
                            sbLIZ.append(host);
                            sbLIZ.append('/');
                            sbLIZ.append(str2);
                            Matcher matcher = PatternProtector.compile(C2188811AlT.LIZIZ(sbLIZ)).matcher(strLIZIZ);
                            if (matcher.find()) {
                                strGroup = matcher.groupCount() >= 1 ? matcher.group(1) : "";
                            }
                        }
                        if (!str2.isEmpty()) {
                            C10ZA c10za = LIZ;
                            if (c10za.get(str2) != null) {
                                iIntValue = ((Integer) c10za.get(str2)).intValue();
                                str3 = str2;
                            }
                        }
                        return C10YC.LIZJ(uri, iIntValue, strGroup, str3, c1950707kX);
                    }
                }
                if (LJ(uri)) {
                    if (!PatternProtector.compile("discover/trending/detail/([^/?]+)").matcher(uri.toString()).find()) {
                        Pattern patternCompile = PatternProtector.compile("^/([^/]+)/trending/detail/([^/]+)$");
                        String path = uri.getPath();
                        path.toString();
                        if (!patternCompile.matcher(path).find() && !LIZLLL(uri)) {
                            List<String> pathSegments = uri.getPathSegments();
                            if (pathSegments == null || pathSegments.size() <= 1) {
                                str = "";
                            } else {
                                str = (String) ListProtector.get(pathSegments, 1);
                            }
                            return C10YC.LIZJ(uri, 24, str, "", c1950707kX);
                        }
                    }
                    return C10YC.LIZJ(uri, 42, uri.getLastPathSegment(), "", c1950707kX);
                }
                return C10YC.LIZJ(uri, 37, "", "", c1950707kX);
            }
            return null;
        }
        return null;
    }
}
