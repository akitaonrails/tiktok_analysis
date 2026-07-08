package X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.08Gh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2088908Gh {
    public static final Pattern LIZ = PatternProtector.compile("(((?:(?i:http|https|rtsp|ws|wss)://(?:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,64}(?:\\:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,25})?\\@)?)?(?:(([a-zA-Z0-9[ -\ud7ff豈-﷏ﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd𰀀-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]]](?:[a-zA-Z0-9[ -\ud7ff豈-﷏ﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd𰀀-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]]_\\-]{0,61}[a-zA-Z0-9[ -\ud7ff豈-﷏ﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd𰀀-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]]]){0,1}\\.)+(xn\\-\\-[\\w\\-]{0,58}\\w|[a-zA-Z[ -\ud7ff豈-﷏ﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd𰀀-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]]]{2,63})|((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9]))))(?:\\:\\d{1,5})?)([/\\?](?:(?:[a-zA-Z0-9[ -\ud7ff豈-﷏ﷰ-\uffef𐀀-\u1fffd𠀀-\u2fffd𰀀-\u3fffd\u40000-\u4fffd\u50000-\u5fffd\u60000-\u6fffd\u70000-\u7fffd\u80000-\u8fffd\u90000-\u9fffd\ua0000-\uafffd\ub0000-\ubfffd\uc0000-\ucfffd\ud0000-\udfffd\ue1000-\uefffd&&[^ [\u2000-\u200a]\u2028\u2029 \u3000]];/\\?:@&=#~\\-\\.\\+!\\*'\\(\\),_\\$])|(?:%[a-fA-F0-9]{2}))*)?(?:\\b|$|^))");

    public static boolean LIZ(String str) {
        boolean zMatches = false;
        if (TextUtils.isEmpty(str) || str == null || ((str.length() <= 7 || !str.substring(0, 8).equalsIgnoreCase("https://")) && (str == null || ((str.length() <= 6 || !str.substring(0, 7).equalsIgnoreCase("http://")) && (str == null || ((str.length() <= 5 || !str.substring(0, 6).equalsIgnoreCase("wss://")) && (str.length() <= 4 || !str.substring(0, 5).equalsIgnoreCase("ws://")))))))) {
            return false;
        }
        try {
            zMatches = LIZ.matcher(str).matches();
            return zMatches;
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            return zMatches;
        }
    }

    public static URI LJ(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            return new URI(str);
        } catch (URISyntaxException e) {
            TryCatchGuardChecker.doCheck(e);
            try {
                return URI.create(str.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                if (str.isEmpty()) {
                    return null;
                }
                try {
                    int iIndexOf = str.indexOf("?");
                    if (iIndexOf > 0) {
                        str = str.substring(0, iIndexOf);
                    }
                    return URI.create(str);
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    throw new RuntimeException(e3);
                }
            }
        }
    }

    public static boolean LIZIZ(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        int length = str.length();
        int length2 = str2.length();
        int i = 0;
        int i2 = 0;
        int i3 = -1;
        int i4 = -1;
        while (i < length) {
            if (i2 < length2 && (str2.charAt(i2) == '?' || str2.charAt(i2) == str.charAt(i))) {
                i++;
                i2++;
            } else if (i2 < length2 && str2.charAt(i2) == '*') {
                i4 = i;
                i3 = i2;
                i2++;
            } else {
                if (i3 == -1) {
                    return false;
                }
                i2 = i3 + 1;
                i4++;
                i = i4;
            }
        }
        while (i2 < length2) {
            if (str2.charAt(i2) != '*') {
                return false;
            }
            i2++;
        }
        return true;
    }

    public static Pair<String, String> LIZJ(String str, Map<String, String> map) throws IOException {
        String encodedQuery;
        if (!C2093608Ic.LJ(str)) {
            try {
                Uri uri = UriProtector.parse(str);
                StringBuilder sb = new StringBuilder();
                String scheme = uri.getScheme();
                String host = uri.getHost();
                int port = uri.getPort();
                if (host != null) {
                    if (scheme != null) {
                        sb.append(scheme);
                        sb.append("://");
                    }
                    sb.append(host);
                    if (port > 0) {
                        sb.append(':');
                        sb.append(port);
                    }
                }
                String string = sb.toString();
                String encodedPath = uri.getEncodedPath();
                if (map != null && (encodedQuery = uri.getEncodedQuery()) != null) {
                    for (String str2 : encodedQuery.split("&")) {
                        int iIndexOf = str2.indexOf("=");
                        if (iIndexOf >= 0) {
                            map.put(URLDecoder.decode(str2.substring(0, iIndexOf), "UTF-8"), URLDecoder.decode(str2.substring(iIndexOf + 1), "UTF-8"));
                        } else {
                            map.put(URLDecoder.decode(str2, "UTF-8"), "");
                        }
                    }
                }
                return new Pair<>(string, encodedPath);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw new IOException("parseUrl url is fail !!!");
            }
        }
        throw new IOException("parseUrl url is null !!!");
    }

    public static Pair<String, String> LIZLLL(String str, Map<String, List<String>> map) throws IOException {
        if (!C2093608Ic.LJ(str)) {
            try {
                Uri uri = UriProtector.parse(str);
                StringBuilder sb = new StringBuilder();
                String scheme = uri.getScheme();
                String host = uri.getHost();
                int port = uri.getPort();
                if (host != null) {
                    if (scheme != null) {
                        sb.append(scheme);
                        sb.append("://");
                    }
                    sb.append(host);
                    if (port > 0) {
                        sb.append(':');
                        sb.append(port);
                    }
                }
                String string = sb.toString();
                String encodedPath = uri.getEncodedPath();
                String encodedQuery = uri.getEncodedQuery();
                if (encodedQuery != null) {
                    for (String str2 : encodedQuery.split("&")) {
                        int iIndexOf = str2.indexOf("=");
                        if (iIndexOf >= 0) {
                            String strDecode = URLDecoder.decode(str2.substring(0, iIndexOf), "UTF-8");
                            List<String> linkedList = map.get(strDecode);
                            if (linkedList == null) {
                                linkedList = new LinkedList<>();
                            }
                            linkedList.add(URLDecoder.decode(str2.substring(iIndexOf + 1), "UTF-8"));
                            map.put(strDecode, linkedList);
                        } else {
                            String strDecode2 = URLDecoder.decode(str2, "UTF-8");
                            List<String> linkedList2 = map.get(strDecode2);
                            if (linkedList2 == null) {
                                linkedList2 = new LinkedList<>();
                            }
                            linkedList2.add("");
                            map.put(strDecode2, linkedList2);
                        }
                    }
                }
                return new Pair<>(string, encodedPath);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw new IOException("parseUrl url is fail !!!");
            }
        }
        throw new IOException("parseUrl url is null !!!");
    }
}
