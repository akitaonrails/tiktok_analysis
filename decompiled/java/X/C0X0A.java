package X;

import android.net.Uri;
import android.net.UrlQuerySanitizer;
import android.text.TextUtils;
import android.util.Base64;
import android.util.LruCache;
import com.bytedance.helios.network.NetworkComponent;
import com.bytedance.helios.network.api.consumer.OperateHistory;
import com.bytedance.helios.network.api.consumer.OperatePairs;
import com.bytedance.helios.network.api.service.INetworkApiService;
import com.bytedance.helios.network.api.service.ReplaceConfig;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AwS162S1100000_13;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0X0A, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X0A implements INetworkApiService {
    public static final LruCache<String, Map<String, List<String>>> LIZ = new LruCache<>(100);
    public static final LruCache<String, Map<String, String>> LIZIZ = new LruCache<>(100);

    public static HttpURLConnection LIZLLL(C840660WyO c840660WyO) {
        Object obj = c840660WyO.LIZ.LIZ.LJ;
        if (obj instanceof HttpURLConnection) {
            return (HttpURLConnection) obj;
        }
        return null;
    }

    public static C0X0B LJ(C840660WyO c840660WyO) {
        Object obj = c840660WyO.LIZ.LIZ.LJ;
        if (obj instanceof C842170X1z) {
            return ((C842170X1z) obj).LJI;
        }
        if (obj instanceof C0X20) {
            return ((C0X20) obj).LJI;
        }
        return null;
    }

    public static URL LJFF(C840660WyO c840660WyO) {
        C840710WyT c840710WyT = c840660WyO.LIZ;
        C840750WyX c840750WyX = c840710WyT.LIZ;
        if (c840750WyX.LIZ != 400000) {
            return null;
        }
        Object obj = c840710WyT.LJJIFFI.LJ;
        if (obj instanceof URL) {
            return (URL) obj;
        }
        Object obj2 = c840750WyX.LJ;
        if (!(obj2 instanceof URL)) {
            return null;
        }
        return (URL) obj2;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final void copyResponseBody(C840660WyO c840660WyO) {
        Object[] objArr;
        Object obj;
        HttpURLConnection httpURLConnectionLIZLLL = LIZLLL(c840660WyO);
        if (httpURLConnectionLIZLLL != null) {
            String headerField = httpURLConnectionLIZLLL.getHeaderField("Content-Type");
            if (headerField == null) {
                headerField = "";
            }
            C0X0O c0x0oLIZIZ = C0X0N.LIZIZ(headerField);
            if (c0x0oLIZIZ != null) {
                String str = c0x0oLIZIZ.LIZIZ;
                String str2 = c0x0oLIZIZ.LIZJ;
                if (Intrinsics.LJFF(str, "application") && Intrinsics.LJFF(str2, "json") && (objArr = c840660WyO.LIZ.LIZ.LJFF) != null && (obj = objArr[0]) != null) {
                    c840660WyO.LJIILL = obj;
                }
            }
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final String getContentSubType(C840660WyO c840660WyO) {
        String requestProperty;
        try {
            HttpURLConnection httpURLConnectionLIZLLL = LIZLLL(c840660WyO);
            if (httpURLConnectionLIZLLL != null && (requestProperty = httpURLConnectionLIZLLL.getRequestProperty("Content-Type")) != null) {
                C0X0O c0x0oLIZIZ = C0X0N.LIZIZ(requestProperty);
                if (c0x0oLIZIZ == null) {
                    return null;
                }
                return c0x0oLIZIZ.LIZJ;
            }
            C189200o6.m2constructorimpl(null);
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return null;
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final String getContentType(C840660WyO c840660WyO) {
        String requestProperty;
        try {
            HttpURLConnection httpURLConnectionLIZLLL = LIZLLL(c840660WyO);
            if (httpURLConnectionLIZLLL != null && (requestProperty = httpURLConnectionLIZLLL.getRequestProperty("Content-Type")) != null) {
                C0X0O c0x0oLIZIZ = C0X0N.LIZIZ(requestProperty);
                if (c0x0oLIZIZ == null) {
                    return null;
                }
                return c0x0oLIZIZ.LIZIZ;
            }
            C189200o6.m2constructorimpl(null);
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return null;
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final Map<String, String> getCookies(C840660WyO c840660WyO) {
        Map<String, List<String>> requestProperties;
        List<String> list;
        try {
            HashMap map = new HashMap();
            HttpURLConnection httpURLConnectionLIZLLL = LIZLLL(c840660WyO);
            if (httpURLConnectionLIZLLL != null && (requestProperties = httpURLConnectionLIZLLL.getRequestProperties()) != null && (list = requestProperties.get("cookie")) != null) {
                for (String str : list) {
                    Map<String, String> map2 = LIZIZ.get(str);
                    if (map2 != null) {
                        map.putAll(map2);
                        CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList = C0WSW.LIZ;
                        C0WSW.LIZ("Helios:Network-Service", new AwS162S1100000_13((Map) map2, (Map<String, String>) str, (String) 10), 2, null);
                    } else {
                        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{";"}, 0, 6);
                        HashMap map3 = new HashMap();
                        Iterator it2 = listLJJLIIIJILLIZJL.iterator();
                        while (it2.hasNext()) {
                            String[] strArr = (String[]) a0.LJJLIIIJILLIZJL((String) it2.next(), new String[]{"="}, 0, 6).toArray(new String[0]);
                            if (strArr.length > 1) {
                                map3.put(strArr[0], strArr[1]);
                            }
                        }
                        LIZIZ.put(str, map3);
                        map.putAll(map3);
                        CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList2 = C0WSW.LIZ;
                        C0WSW.LIZ("Helios:Network-Service", new AwS162S1100000_13(str, map3, 11), 2, null);
                    }
                }
            }
            return map;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return C2097608Jq.LJ();
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final String getDomain(C840660WyO c840660WyO) {
        URL url;
        String host;
        HttpURLConnection httpURLConnectionLIZLLL = LIZLLL(c840660WyO);
        if (httpURLConnectionLIZLLL == null || (url = httpURLConnectionLIZLLL.getURL()) == null || (host = url.getHost()) == null) {
            URL urlLJFF = LJFF(c840660WyO);
            if (urlLJFF != null) {
                return urlLJFF.getHost();
            }
            return null;
        }
        return host;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final Map<String, List<String>> getHeaders(C840660WyO c840660WyO) {
        Map<String, List<String>> requestProperties;
        try {
            HttpURLConnection httpURLConnectionLIZLLL = LIZLLL(c840660WyO);
            if (httpURLConnectionLIZLLL != null) {
                requestProperties = httpURLConnectionLIZLLL.getRequestProperties();
            } else {
                requestProperties = null;
            }
            if (requestProperties == null) {
                return C2097608Jq.LJ();
            }
            return requestProperties;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return C2097608Jq.LJ();
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final String getMethod(C840660WyO c840660WyO) {
        String requestMethod;
        HttpURLConnection httpURLConnectionLIZLLL = LIZLLL(c840660WyO);
        if (httpURLConnectionLIZLLL != null && (requestMethod = httpURLConnectionLIZLLL.getRequestMethod()) != null) {
            return requestMethod;
        }
        return "";
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final String getPath(C840660WyO c840660WyO) {
        URL url;
        String path;
        HttpURLConnection httpURLConnectionLIZLLL = LIZLLL(c840660WyO);
        if (httpURLConnectionLIZLLL == null || (url = httpURLConnectionLIZLLL.getURL()) == null || (path = url.getPath()) == null) {
            URL urlLJFF = LJFF(c840660WyO);
            if (urlLJFF != null) {
                return urlLJFF.getPath();
            }
            return null;
        }
        return path;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final Map<String, List<String>> getQueries(C840660WyO c840660WyO) {
        HashMap map = new HashMap();
        String url = getUrl(c840660WyO);
        if (url != null) {
            Map<String, List<String>> map2 = LIZ.get(url);
            if (map2 != null) {
                CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList = C0WSW.LIZ;
                C0WSW.LIZ("Helios:Network-Service", new C0X0C(map2, url), 2, null);
                return map2;
            }
            for (UrlQuerySanitizer.ParameterValuePair parameterValuePair : new UrlQuerySanitizer(url).getParameterList()) {
                String str = parameterValuePair.mParameter;
                List arrayList = (List) map.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(parameterValuePair.mValue);
                map.put(str, arrayList);
            }
            LIZ.put(url, map);
            CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList2 = C0WSW.LIZ;
            C0WSW.LIZ("Helios:Network-Service", new C0X0D(url, map), 2, null);
        }
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getRequestBody(X.C840660WyO r7) {
        /*
            r6 = this;
            java.net.HttpURLConnection r2 = LIZLLL(r7)
            r5 = 0
            if (r2 == 0) goto L8c
            java.lang.String r1 = r2.getRequestMethod()
            java.lang.String r0 = "GET"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L57
            boolean r0 = r2.getDoOutput()
            if (r0 == 0) goto L57
            java.lang.String r0 = "Content-Type"
            java.lang.String r0 = r2.getRequestProperty(r0)
            X.0X0O r0 = X.C0X0N.LIZIZ(r0)
            if (r0 == 0) goto L57
            java.lang.String r2 = r0.LIZIZ
            java.lang.String r1 = r0.LIZJ
            java.lang.String r0 = "application"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 == 0) goto L42
            java.lang.String r0 = "json"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L53
            java.lang.String r0 = "x-www-form-urlencoded"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L53
        L42:
            java.lang.String r0 = "text"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 == 0) goto L57
            java.lang.String r0 = "plain"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L57
        L53:
            r0 = 1
        L54:
            if (r0 != 0) goto L59
            return r5
        L57:
            r0 = 0
            goto L54
        L59:
            X.0X0B r0 = LJ(r7)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L64
            java.lang.String r0 = r0.LIZJ()     // Catch: java.lang.Throwable -> L69
            return r0
        L64:
            X.C189200o6.m2constructorimpl(r5)     // Catch: java.lang.Throwable -> L69
            r4 = r5
            goto L75
        L69:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r4 = new X.00Yq
            r4.<init>(r0)
            X.C189200o6.m2constructorimpl(r4)
        L75:
            java.lang.Throwable r3 = X.C189200o6.m5exceptionOrNullimpl(r4)
            if (r3 == 0) goto L89
            java.util.concurrent.CopyOnWriteArrayList<X.0WSX> r0 = X.C0WSW.LIZ
            r0 = 417(0x1a1, float:5.84E-43)
            kotlin.jvm.internal.AFwS200S0000000_13 r2 = kotlin.jvm.internal.AFwS200S0000000_13.get$arr$(r0)
            r1 = 6
            java.lang.String r0 = "Helios:Network-Service"
            X.C0WSW.LIZ(r0, r2, r1, r3)
        L89:
            X.C189200o6.m1boximpl(r4)
        L8c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0X0A.getRequestBody(X.0WyO):java.lang.String");
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final String getRequestBodyBase64(C840660WyO c840660WyO) {
        C098200Yq c098200Yq;
        if (NetworkComponent.INSTANCE.isOfflineEnv() && LIZLLL(c840660WyO) != null) {
            try {
                C0X0B c0x0bLJ = LJ(c840660WyO);
                if (c0x0bLJ != null) {
                    c0x0bLJ.LIZJ();
                    ByteArrayOutputStream byteArrayOutputStream = c0x0bLJ.LJFF;
                    if (byteArrayOutputStream != null) {
                        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                    }
                }
                C189200o6.m2constructorimpl(null);
                c098200Yq = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList = C0WSW.LIZ;
                C0WSW.LIZ("Helios:Network-Service", AFwS200S0000000_13.get$arr$(418), 6, thM5exceptionOrNullimpl);
            }
            C189200o6.m1boximpl(c098200Yq);
        }
        return null;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final k getRequestBodyStruct(C840660WyO c840660WyO) {
        Object c098200Yq;
        String requestBody = getRequestBody(c840660WyO);
        if (requestBody != null) {
            try {
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (Intrinsics.LJFF(c840660WyO.LIZJ(), "json")) {
                return C0X00.LIZ(0, GsonProtectorUtils.parse(C0X00.LIZ, requestBody));
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
            C189200o6.m1boximpl(c098200Yq);
            return null;
        }
        return null;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final String getResContentSubType(C840660WyO c840660WyO) {
        String headerField;
        C0X0O c0x0oLIZIZ;
        HttpURLConnection httpURLConnectionLIZLLL = LIZLLL(c840660WyO);
        if (httpURLConnectionLIZLLL != null && (headerField = httpURLConnectionLIZLLL.getHeaderField("Content-Type")) != null && (c0x0oLIZIZ = C0X0N.LIZIZ(headerField)) != null) {
            return c0x0oLIZIZ.LIZJ;
        }
        return null;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final String getResContentType(C840660WyO c840660WyO) {
        String headerField;
        C0X0O c0x0oLIZIZ;
        HttpURLConnection httpURLConnectionLIZLLL = LIZLLL(c840660WyO);
        if (httpURLConnectionLIZLLL != null && (headerField = httpURLConnectionLIZLLL.getHeaderField("Content-Type")) != null && (c0x0oLIZIZ = C0X0N.LIZIZ(headerField)) != null) {
            return c0x0oLIZIZ.LIZIZ;
        }
        return null;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final String getResponseBody(C840660WyO c840660WyO) {
        Object obj = c840660WyO.LJIILL;
        if (obj instanceof byte[]) {
            return new String((byte[]) obj, Charsets.UTF_8);
        }
        return null;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final Integer getResponseCode(C840660WyO c840660WyO) {
        Integer numValueOf = null;
        try {
            HttpURLConnection httpURLConnectionLIZLLL = LIZLLL(c840660WyO);
            if (httpURLConnectionLIZLLL == null) {
                return null;
            }
            numValueOf = Integer.valueOf(httpURLConnectionLIZLLL.getResponseCode());
            return numValueOf;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return numValueOf;
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final Map<String, String> getResponseCookies(C840660WyO c840660WyO) {
        return C2097608Jq.LJ();
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final Map<String, List<String>> getResponseHeaders(C840660WyO c840660WyO) {
        Map<String, List<String>> headerFields;
        try {
            HttpURLConnection httpURLConnectionLIZLLL = LIZLLL(c840660WyO);
            if (httpURLConnectionLIZLLL != null) {
                headerFields = httpURLConnectionLIZLLL.getHeaderFields();
            } else {
                headerFields = null;
            }
            if (headerFields == null) {
                return C2097608Jq.LJ();
            }
            return headerFields;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return C2097608Jq.LJ();
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final String getScheme(C840660WyO c840660WyO) {
        URL url;
        String protocol;
        HttpURLConnection httpURLConnectionLIZLLL = LIZLLL(c840660WyO);
        if (httpURLConnectionLIZLLL == null || (url = httpURLConnectionLIZLLL.getURL()) == null || (protocol = url.getProtocol()) == null) {
            URL urlLJFF = LJFF(c840660WyO);
            if (urlLJFF != null) {
                return urlLJFF.getProtocol();
            }
            return null;
        }
        return protocol;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final String getUrl(C840660WyO c840660WyO) {
        URL url;
        String string;
        HttpURLConnection httpURLConnectionLIZLLL = LIZLLL(c840660WyO);
        if (httpURLConnectionLIZLLL == null || (url = httpURLConnectionLIZLLL.getURL()) == null || (string = url.toString()) == null) {
            URL urlLJFF = LJFF(c840660WyO);
            if (urlLJFF != null) {
                return urlLJFF.toString();
            }
            return null;
        }
        return string;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [T, java.lang.String] */
    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final void initNetworkStackEvent(C840760WyY c840760WyY) {
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = "";
        try {
            Object obj = c840760WyY.LIZ.LIZ.LJ;
            if (obj instanceof URL) {
                ?? string = ((URL) obj).toString();
                c259800zU.element = string;
                c840760WyY.LIZIZ.add(UriProtector.parse(string));
                c840760WyY.LJII = obj;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList = C0WSW.LIZ;
            C0WSW.LIZ("Helios:Network-Service", new AwS557S0100000_13(c259800zU, (C259800zU<String>) 206), 5, th);
        }
    }

    public static void LIZIZ(boolean z, List list) {
        if (z) {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((String) it2.next()).toLowerCase(Locale.ROOT));
            }
        }
    }

    public static void LIZJ(boolean z, Map map) {
        if (z) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                if (obj != null) {
                    linkedHashMap.put(str.toLowerCase(Locale.ROOT), obj);
                }
            }
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final void addCookies(C840660WyO c840660WyO, Map<String, String> map) throws IllegalAccessException, InvocationTargetException {
        boolean z;
        C0X0B c0x0bLJ = LJ(c840660WyO);
        if (c0x0bLJ != null) {
            ArrayList arrayList = new ArrayList();
            c0x0bLJ.LIZLLL();
            C0X0E c0x0e = c0x0bLJ.LIZIZ;
            if (c0x0e == null) {
                return;
            }
            String strLIZIZ = c0x0e.LIZIZ("cookie");
            StringBuilder sb = new StringBuilder();
            if (strLIZIZ != null && strLIZIZ.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                sb.append(strLIZIZ);
                if (!u.LJIIZILJ(strLIZIZ, ";", false)) {
                    sb.append(";");
                }
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb.append(entry.getKey());
                sb.append("=");
                sb.append(entry.getValue());
                sb.append(";");
                arrayList.add(new OperatePairs(null, null, entry.getKey(), entry.getValue()));
            }
            c0x0e.LIZLLL("cookie", sb.toString());
            LJI(c840660WyO, c0x0e, "add", "cookie", arrayList);
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final void addHeaders(C840660WyO c840660WyO, Map<String, String> map) {
        Object c098200Yq;
        try {
            C0X0B c0x0bLJ = LJ(c840660WyO);
            c098200Yq = null;
            if (c0x0bLJ != null) {
                c0x0bLJ.LIZLLL();
                C0X0E c0x0e = c0x0bLJ.LIZIZ;
                if (c0x0e == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    c0x0e.LIZ(entry.getKey(), entry.getValue());
                    arrayList.add(new OperatePairs(null, null, entry.getKey(), entry.getValue()));
                }
                LJI(c840660WyO, c0x0e, "add", "header", arrayList);
                c098200Yq = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C823280WRi.LIZLLL(thM5exceptionOrNullimpl);
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final Object addInterceptor(Object obj, String str) {
        return LIZ(obj, str, null);
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final void addQueries(C840660WyO c840660WyO, Map<String, String> map) {
        HttpURLConnection httpURLConnectionLIZLLL = LIZLLL(c840660WyO);
        if (httpURLConnectionLIZLLL != null) {
            ArrayList arrayList = new ArrayList();
            Uri.Builder builderBuildUpon = UriProtector.parse(httpURLConnectionLIZLLL.getURL().toString()).buildUpon();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
                arrayList.add(new OperatePairs(null, null, entry.getKey(), entry.getValue()));
            }
            LJII(c840660WyO, builderBuildUpon.build().toString(), "add", arrayList, "query");
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final void replaceDomain(C840660WyO c840660WyO, Map<String, ReplaceConfig> map) {
        Uri uri;
        String host;
        ReplaceConfig replaceConfig;
        String str;
        HttpURLConnection httpURLConnectionLIZLLL = LIZLLL(c840660WyO);
        if (httpURLConnectionLIZLLL != null && (replaceConfig = map.get((host = (uri = UriProtector.parse(httpURLConnectionLIZLLL.getURL().toString())).getHost()))) != null && (str = replaceConfig.value) != null && !a0.LJJJIL(str)) {
            LJII(c840660WyO, uri.buildUpon().authority(str).build().toString(), "replace", Collections.singletonList(new OperatePairs(host, null, str, null)), "domain");
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final void replacePath(C840660WyO c840660WyO, Map<String, ReplaceConfig> map) {
        Uri uri;
        String path;
        ReplaceConfig replaceConfig;
        String str;
        HttpURLConnection httpURLConnectionLIZLLL = LIZLLL(c840660WyO);
        if (httpURLConnectionLIZLLL != null && (replaceConfig = map.get((path = (uri = UriProtector.parse(httpURLConnectionLIZLLL.getURL().toString())).getPath()))) != null && (str = replaceConfig.value) != null && !a0.LJJJIL(str)) {
            LJII(c840660WyO, uri.buildUpon().path(str).build().toString(), "replace", Collections.singletonList(new OperatePairs(path, null, str, null)), "path");
        }
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final void replaceScheme(C840660WyO c840660WyO, Map<String, ReplaceConfig> map) {
        String string;
        Uri uri;
        String scheme;
        ReplaceConfig replaceConfig;
        String str;
        URL urlLJFF = LJFF(c840660WyO);
        if (urlLJFF != null && (string = urlLJFF.toString()) != null && (replaceConfig = map.get((scheme = (uri = UriProtector.parse(string)).getScheme()))) != null && (str = replaceConfig.value) != null && !a0.LJJJIL(str)) {
            LJII(c840660WyO, uri.buildUpon().scheme(str).build().toString(), "replace", Collections.singletonList(new OperatePairs(scheme, null, str, null)), "scheme");
        }
    }

    public static Object LIZ(Object obj, String str, C0WZW c0wzw) throws IOException {
        if (obj == null) {
            return null;
        }
        URL url = (URL) obj;
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        if (!a0.LJJIIZI(uRLConnectionOpenConnection.getClass().getName(), "Cronet", false)) {
            String protocol = url.getProtocol();
            if (Intrinsics.LJFF(protocol, "http")) {
                return new C842170X1z((HttpURLConnection) uRLConnectionOpenConnection, str, c0wzw);
            }
            if (Intrinsics.LJFF(protocol, "https")) {
                return new C0X20((HttpsURLConnection) uRLConnectionOpenConnection, str, c0wzw);
            }
        }
        return uRLConnectionOpenConnection;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final void dropRequest(C840660WyO c840660WyO, int i, String str) {
        C840710WyT c840710WyT = c840660WyO.LIZ;
        Object obj = c840710WyT.LIZ.LJ;
        if (obj instanceof C842170X1z) {
            c840710WyT.LJJIFFI.LIZLLL = true;
            C842170X1z c842170X1z = (C842170X1z) obj;
            c842170X1z.LIZLLL = i;
            c842170X1z.LJ = str;
            return;
        }
        if (!(obj instanceof C0X20)) {
            return;
        }
        c840710WyT.LJJIFFI.LIZLLL = true;
        C0X20 c0x20 = (C0X20) obj;
        c0x20.LIZLLL = i;
        c0x20.LJ = str;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final boolean removeCookies(C840660WyO c840660WyO, List<String> list, boolean z) throws IllegalAccessException, InvocationTargetException {
        C0X0B c0x0bLJ = LJ(c840660WyO);
        if (c0x0bLJ == null) {
            return false;
        }
        c0x0bLJ.LIZLLL();
        C0X0E c0x0e = c0x0bLJ.LIZIZ;
        if (c0x0e == null) {
            return false;
        }
        String strLIZIZ = c0x0e.LIZIZ("cookie");
        c0x0e.LIZJ("cookie");
        LIZIZ(z, list);
        ArrayList arrayList = new ArrayList();
        if (strLIZIZ != null) {
            List<String> listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strLIZIZ, new String[]{";"}, 0, 6);
            StringBuilder sb = new StringBuilder();
            for (String str : listLJJLIIIJILLIZJL) {
                String[] strArr = (String[]) a0.LJJLIIIJILLIZJL(str, new String[]{"="}, 0, 6).toArray(new String[0]);
                if (strArr.length < 2) {
                    sb.append(str);
                    sb.append(";");
                } else {
                    String lowerCase = strArr[0];
                    if (z) {
                        lowerCase = lowerCase.toLowerCase(Locale.ROOT);
                    }
                    if (list.contains(lowerCase)) {
                        arrayList.add(new OperatePairs(strArr[0], strArr[1], null, null));
                    } else {
                        sb.append(str);
                        sb.append(";");
                    }
                }
            }
            c0x0e.LIZ("cookie", sb.toString());
        }
        LJI(c840660WyO, c0x0e, "remove", "cookie", arrayList);
        return !arrayList.isEmpty();
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final boolean removeHeaders(C840660WyO c840660WyO, List<String> list, boolean z) throws IllegalAccessException, InvocationTargetException {
        C0X0B c0x0bLJ = LJ(c840660WyO);
        if (c0x0bLJ == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        c0x0bLJ.LIZLLL();
        C0X0E c0x0e = c0x0bLJ.LIZIZ;
        if (c0x0e == null) {
            return false;
        }
        for (String str : list) {
            String strLIZIZ = c0x0e.LIZIZ(str);
            if (strLIZIZ != null && strLIZIZ.length() != 0) {
                arrayList.add(new OperatePairs(str, c0x0e.LIZIZ(str), null, null));
            }
            c0x0e.LIZJ(str);
        }
        LJI(c840660WyO, c0x0e, "remove", "header", arrayList);
        return !arrayList.isEmpty();
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final boolean removeQueries(C840660WyO c840660WyO, List<String> list, boolean z) {
        String lowerCase;
        HttpURLConnection httpURLConnectionLIZLLL = LIZLLL(c840660WyO);
        if (httpURLConnectionLIZLLL != null) {
            ArrayList arrayList = new ArrayList();
            Uri uri = UriProtector.parse(httpURLConnectionLIZLLL.getURL().toString());
            Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
            LIZIZ(z, list);
            ArrayList<String> arrayList2 = new ArrayList();
            for (Object obj : queryParameterNames) {
                String str = (String) obj;
                if (z) {
                    lowerCase = str.toLowerCase(Locale.ROOT);
                } else {
                    lowerCase = str;
                }
                boolean zContains = list.contains(lowerCase);
                if (zContains) {
                    arrayList.add(new OperatePairs(str, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str), null, null));
                    if (!zContains) {
                    }
                }
                arrayList2.add(obj);
            }
            for (String str2 : arrayList2) {
                List<String> queryParameters = UriProtector.getQueryParameters(uri, str2);
                if (queryParameters != null) {
                    Iterator<String> it2 = queryParameters.iterator();
                    while (it2.hasNext()) {
                        builderClearQuery.appendQueryParameter(str2, it2.next());
                    }
                }
            }
            LJII(c840660WyO, builderClearQuery.build().toString(), "remove", arrayList, "query");
            return !arrayList.isEmpty();
        }
        return false;
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final boolean replaceCookies(C840660WyO c840660WyO, Map<String, ReplaceConfig> map, boolean z) throws IllegalAccessException, InvocationTargetException {
        String str;
        C0X0B c0x0bLJ = LJ(c840660WyO);
        if (c0x0bLJ == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        LIZJ(z, map);
        c0x0bLJ.LIZLLL();
        C0X0E c0x0e = c0x0bLJ.LIZIZ;
        if (c0x0e == null) {
            return false;
        }
        String strLIZIZ = c0x0e.LIZIZ("cookie");
        if (strLIZIZ != null) {
            for (String str2 : a0.LJJLIIIJILLIZJL(strLIZIZ, new String[]{";"}, 0, 6)) {
                String[] strArr = (String[]) a0.LJJLIIIJILLIZJL(str2, new String[]{"="}, 0, 6).toArray(new String[0]);
                if (strArr.length < 2) {
                    sb.append(str2);
                    sb.append(";");
                } else {
                    String lowerCase = strArr[0];
                    if (z) {
                        lowerCase = lowerCase.toLowerCase(Locale.ROOT);
                    }
                    ReplaceConfig replaceConfig = map.get(lowerCase);
                    if (replaceConfig == null) {
                        sb.append(str2);
                        sb.append(";");
                    } else {
                        String str3 = null;
                        if (Intrinsics.LJFF(replaceConfig.target, "value")) {
                            sb.append(strArr[0]);
                            sb.append("=");
                            sb.append(replaceConfig.value);
                            sb.append(";");
                            str = replaceConfig.value;
                            if (!TextUtils.equals(strArr[1], str)) {
                                arrayList.add(new OperatePairs(strArr[0], strArr[1], str3, str));
                            }
                        } else {
                            sb.append(replaceConfig.value);
                            sb.append("=");
                            sb.append(strArr[1]);
                            sb.append(";");
                            str = null;
                            str3 = replaceConfig.value;
                            if (!TextUtils.equals(strArr[0], r2)) {
                                arrayList.add(new OperatePairs(strArr[0], strArr[1], str3, str));
                            }
                        }
                    }
                }
            }
            c0x0e.LIZJ("cookie");
            c0x0e.LIZ("cookie", sb.toString());
            LJI(c840660WyO, c0x0e, "replace", "cookie", arrayList);
        }
        return !arrayList.isEmpty();
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final boolean replaceHeaders(C840660WyO c840660WyO, Map<String, ReplaceConfig> map, boolean z) throws IllegalAccessException, InvocationTargetException {
        String str;
        C0X0B c0x0bLJ = LJ(c840660WyO);
        if (c0x0bLJ == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        c0x0bLJ.LIZLLL();
        C0X0E c0x0e = c0x0bLJ.LIZIZ;
        if (c0x0e == null) {
            return false;
        }
        for (Map.Entry<String, ReplaceConfig> entry : map.entrySet()) {
            String strLIZIZ = c0x0e.LIZIZ(entry.getKey());
            if (strLIZIZ != null && strLIZIZ.length() != 0) {
                ReplaceConfig value = entry.getValue();
                String str2 = null;
                if (Intrinsics.LJFF(value.target, "value")) {
                    c0x0e.LIZLLL(entry.getKey(), value.value);
                    str = value.value;
                    if (!TextUtils.equals(strLIZIZ, str)) {
                        arrayList.add(new OperatePairs(entry.getKey(), strLIZIZ, str2, str));
                    }
                } else {
                    c0x0e.LIZJ(entry.getKey());
                    c0x0e.LIZLLL(value.value, strLIZIZ);
                    String str3 = value.value;
                    str = null;
                    str2 = str3;
                    if (true ^ TextUtils.equals(entry.getKey(), str3)) {
                        arrayList.add(new OperatePairs(entry.getKey(), strLIZIZ, str2, str));
                    }
                }
            }
        }
        LJI(c840660WyO, c0x0e, "replace", "header", arrayList);
        return !arrayList.isEmpty();
    }

    @Override // com.bytedance.helios.network.api.service.INetworkApiService
    public final boolean replaceQueries(C840660WyO c840660WyO, Map<String, ReplaceConfig> map, boolean z) {
        String lowerCase;
        String str;
        HttpURLConnection httpURLConnectionLIZLLL = LIZLLL(c840660WyO);
        if (httpURLConnectionLIZLLL == null) {
            return false;
        }
        Uri uri = UriProtector.parse(httpURLConnectionLIZLLL.getURL().toString());
        Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
        LIZJ(z, map);
        ArrayList arrayList = new ArrayList();
        for (String str2 : queryParameterNames) {
            if (z) {
                lowerCase = str2.toLowerCase(Locale.ROOT);
            } else {
                lowerCase = str2;
            }
            ReplaceConfig replaceConfig = map.get(lowerCase);
            if (replaceConfig == null) {
                builderClearQuery.appendQueryParameter(str2, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str2));
            } else {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str2);
                String str3 = null;
                if (Intrinsics.LJFF(replaceConfig.target, "value")) {
                    builderClearQuery.appendQueryParameter(str2, replaceConfig.value);
                    str = replaceConfig.value;
                    if (!TextUtils.equals(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, str)) {
                        arrayList.add(new OperatePairs(str2, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str2), str3, str));
                    }
                } else {
                    builderClearQuery.appendQueryParameter(replaceConfig.value, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                    String str4 = replaceConfig.value;
                    str = null;
                    str3 = str4;
                    if (true ^ TextUtils.equals(str2, str4)) {
                        arrayList.add(new OperatePairs(str2, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str2), str3, str));
                    }
                }
            }
        }
        LJII(c840660WyO, builderClearQuery.build().toString(), "replace", arrayList, "query");
        return !arrayList.isEmpty();
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(X.C840660WyO r12, X.C0X0E r13, java.lang.String r14, java.lang.String r15, java.util.List r16) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0X0A.LJI(X.0WyO, X.0X0E, java.lang.String, java.lang.String, java.util.List):void");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void LJII(C840660WyO c840660WyO, String str, String str2, List list, String str3) {
        Object c098200Yq;
        if (list != null && !list.isEmpty()) {
            C840710WyT c840710WyT = c840660WyO.LIZ;
            if (c840710WyT.LIZ.LIZ != 400000) {
                C0X0B c0x0bLJ = LJ(c840660WyO);
                if (c0x0bLJ != null) {
                    c0x0bLJ.LIZLLL();
                    try {
                        Field field = C0X0B.LJIIIZ;
                        if (field == null) {
                            C0X0B.LJIIIZ = C0X0B.LIZ(URLConnection.class, field, "url");
                        }
                        Field field2 = C0X0B.LJIIIZ;
                        if (field2 != null) {
                            field2.set(c0x0bLJ.LIZ, new URL(str));
                        }
                        Field field3 = C0X0B.LJIIIZ;
                        if (field3 != null) {
                            field3.set(c0x0bLJ.LIZLLL, new URL(str));
                            c098200Yq = Unit.LIZ;
                        } else {
                            c098200Yq = null;
                        }
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                    if (thM5exceptionOrNullimpl != null) {
                        CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList = C0WSW.LIZ;
                        C0WSW.LIZ("Helios:Network-Service", AFwS200S0000000_13.get$arr$(416), 6, thM5exceptionOrNullimpl);
                    }
                }
            } else {
                c840710WyT.LJJIFFI.LJ = new URL(str);
            }
            C840710WyT c840710WyT2 = c840660WyO.LIZ;
            c840710WyT2.LJJIFFI.LIZJ = true;
            c840710WyT2.LJJ.add(new OperateHistory(str2, str3, list));
            c840660WyO.LIZLLL = str;
            switch (str3.hashCode()) {
                case -1326197564:
                    if (str3.equals("domain")) {
                        c840660WyO.LJFF = null;
                    }
                    break;
                case -907987547:
                    if (str3.equals("scheme")) {
                        c840660WyO.LJ = null;
                    }
                    break;
                case 3433509:
                    if (str3.equals("path")) {
                        c840660WyO.LJI = null;
                    }
                    break;
                case 107944136:
                    if (str3.equals("query")) {
                        c840660WyO.LJIILLIIL = null;
                    }
                    break;
            }
        }
    }
}
