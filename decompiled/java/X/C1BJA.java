package X;

import Y.ARunnableS103S0200000_34;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.1BJA, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BJA {
    public static HttpURLConnection LIZ(URL url) throws Throwable {
        URLConnection uRLConnectionE0 = C2204961BRm.e0(url, new C0WZX("dzBzEgQ7XM/eWlgqCzWWZ1GF44pku4/l+Q==", new String[]{"019e5"}));
        if (uRLConnectionE0 != null) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionE0;
            if (GraphRequest.LJIIJ == null) {
                GraphRequest.LJIIJ = C786410Ut5.j4("%s.%s", Arrays.copyOf(new Object[]{"FBAndroidSDK", "17.0.0"}, 2));
                if (!C0W7Q.LJIILL(null)) {
                    GraphRequest.LJIIJ = C786410Ut5.k4(Locale.ROOT, "%s/%s", Arrays.copyOf(new Object[]{GraphRequest.LJIIJ, null}, 2));
                }
            }
            String str = GraphRequest.LJIIJ;
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Raw agent = ");
            sbLIZ.append(str);
            sbLIZ.append(" and hook agent = ");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            httpURLConnection.setRequestProperty("User-Agent", str);
            httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
            httpURLConnection.setChunkedStreamingMode(0);
            return httpURLConnection;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x002e -> B:13:0x002a). Please report as a decompilation issue!!! */
    public static List LIZIZ(C1BJ9 c1bj9) {
        HttpURLConnection httpURLConnectionLJIILIIL;
        List listLIZ;
        C0W7K.LIZJ(c1bj9);
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                httpURLConnectionLJIILIIL = LJIILIIL(c1bj9);
                e = null;
            } catch (Exception e) {
                e = e;
                TryCatchGuardChecker.doCheck(e);
                httpURLConnectionLJIILIIL = null;
            }
            try {
                if (httpURLConnectionLJIILIIL != null) {
                    listLIZ = LIZJ(c1bj9, httpURLConnectionLJIILIIL);
                } else {
                    listLIZ = C2202731BIx.LIZ(c1bj9.LLILLJJLI, null, new C1BJO(e));
                    LJIIJ(c1bj9, listLIZ);
                }
                C0W7Q.LJI(httpURLConnectionLJIILIIL);
                return listLIZ;
            } catch (Throwable th) {
                th = th;
                httpURLConnection = httpURLConnectionLJIILIIL;
                TryCatchGuardChecker.doCheck(th);
                C0W7Q.LJI(httpURLConnection);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            TryCatchGuardChecker.doCheck(th);
            C0W7Q.LJI(httpURLConnection);
            throw th;
        }
    }

    public static boolean LIZLLL(Object obj) {
        if (!(obj instanceof Bitmap) && !(obj instanceof byte[]) && !(obj instanceof Uri) && !(obj instanceof ParcelFileDescriptor) && !(obj instanceof GraphRequest.ParcelableResourceWithMimeType)) {
            return false;
        }
        return true;
    }

    public static boolean LJ(Object obj) {
        if (!(obj instanceof String) && !(obj instanceof Boolean) && !(obj instanceof Number) && !(obj instanceof Date)) {
            return false;
        }
        return true;
    }

    public static String LJI(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof Boolean) && !(obj instanceof Number)) {
            if (obj instanceof Date) {
                return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj);
            }
            throw new IllegalArgumentException("Unsupported parameter type.");
        }
        return obj.toString();
    }

    public static HttpURLConnection LJIILIIL(C1BJ9 c1bj9) throws Throwable {
        URL url;
        for (GraphRequest graphRequest : c1bj9) {
            if (C0WV6.GET == graphRequest.LJI && C0W7Q.LJIILL(graphRequest.LIZLLL.getString("fields"))) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("GET requests for /");
                String str = graphRequest.LIZIZ;
                if (str == null) {
                    str = "";
                }
                sbLIZ.append(str);
                sbLIZ.append(" should contain an explicit \"fields\" parameter.");
                C2188811AlT.LIZIZ(sbLIZ);
                synchronized (FacebookSdk.LIZ) {
                }
            }
        }
        try {
            if (c1bj9.size() == 1) {
                url = new URL(((GraphRequest) ((ArrayList) c1bj9.LLILLJJLI).get(0)).LJI());
            } else {
                url = new URL(C786410Ut5.j4("https://graph.%s", Arrays.copyOf(new Object[]{FacebookSdk.LJFF()}, 1)));
            }
            HttpURLConnection httpURLConnectionLIZ = null;
            try {
                httpURLConnectionLIZ = LIZ(url);
                LJIIL(c1bj9, httpURLConnectionLIZ);
                return httpURLConnectionLIZ;
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                C0W7Q.LJI(httpURLConnectionLIZ);
                throw new C1BJO("could not construct request body", e);
            } catch (JSONException e2) {
                TryCatchGuardChecker.doCheck(e2);
                C0W7Q.LJI(httpURLConnectionLIZ);
                throw new C1BJO("could not construct request body", e2);
            }
        } catch (MalformedURLException e3) {
            TryCatchGuardChecker.doCheck(e3);
            throw new C1BJO("could not construct URL for request", e3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LIZJ(X.C1BJ9 r9, java.net.HttpURLConnection r10) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1BJA.LIZJ(X.1BJ9, java.net.HttpURLConnection):java.util.List");
    }

    public static void LJIIJ(C1BJ9 c1bj9, List list) {
        int size = c1bj9.size();
        ArrayList arrayList = new ArrayList();
        if (size > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                GraphRequest graphRequest = (GraphRequest) ((ArrayList) c1bj9.LLILLJJLI).get(i);
                if (graphRequest.LJFF != null) {
                    arrayList.add(new Pair(graphRequest.LJFF, list.get(i)));
                }
                if (i2 >= size) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        if (arrayList.size() > 0) {
            ARunnableS103S0200000_34 aRunnableS103S0200000_34 = new ARunnableS103S0200000_34(arrayList, c1bj9, 49);
            BPEAHandler bPEAHandler = c1bj9.LL;
            if (bPEAHandler == null || Boolean.valueOf(C786410Ut5.LJJZZIII(bPEAHandler, aRunnableS103S0200000_34)) == null) {
                aRunnableS103S0200000_34.run();
            }
        }
    }

    public static void LJIIJJI(Map map, C1BJB c1bjb) {
        for (Map.Entry entry : ((HashMap) map).entrySet()) {
            String str = GraphRequest.LJIIIIZZ;
            if (LIZLLL(((C2202931BJr) entry.getValue()).LIZIZ)) {
                c1bjb.LJI((String) entry.getKey(), ((C2202931BJr) entry.getValue()).LIZIZ, ((C2202931BJr) entry.getValue()).LIZ);
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:54:0x0137
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static void LJIIL(X.C1BJ9 r20, java.net.HttpURLConnection r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1BJA.LJIIL(X.1BJ9, java.net.HttpURLConnection):void");
    }

    public static GraphRequest LJFF(AccessToken accessToken, String str, C0WV8 c0wv8) {
        return new GraphRequest(accessToken, str, null, null, c0wv8, 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJII(org.json.JSONObject r6, java.lang.String r7, X.C1BK7 r8) {
        /*
            java.util.regex.Pattern r0 = com.facebook.GraphRequest.LJIIIZ
            java.util.regex.Matcher r1 = r0.matcher(r7)
            boolean r0 = r1.matches()
            r5 = 1
            if (r0 == 0) goto L5f
            java.lang.String r1 = r1.group(r5)
        L11:
            java.lang.String r0 = "me/"
            r3 = 0
            boolean r0 = kotlin.text.u.LJJIIJZLJL(r1, r0, r3)
            if (r0 != 0) goto L22
            java.lang.String r0 = "/me/"
            boolean r0 = kotlin.text.u.LJJIIJZLJL(r1, r0, r3)
            if (r0 == 0) goto L5d
        L22:
            java.lang.String r0 = ":"
            r1 = 6
            int r2 = kotlin.text.a0.LJJJ(r7, r0, r3, r3, r1)
            java.lang.String r0 = "?"
            int r1 = kotlin.text.a0.LJJJ(r7, r0, r3, r3, r1)
            r0 = 3
            if (r2 <= r0) goto L5d
            r0 = -1
            if (r1 == r0) goto L37
            if (r2 >= r1) goto L5d
        L37:
            r4 = 1
        L38:
            java.util.Iterator r3 = r6.keys()
        L3c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L61
            java.lang.Object r2 = r3.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r6.opt(r2)
            if (r4 == 0) goto L5b
            java.lang.String r0 = "image"
            boolean r0 = kotlin.text.u.LJIJI(r2, r0, r5)
            if (r0 == 0) goto L5b
            r0 = 1
        L57:
            LJIIIIZZ(r2, r1, r8, r0)
            goto L3c
        L5b:
            r0 = 0
            goto L57
        L5d:
            r4 = 0
            goto L38
        L5f:
            r1 = r7
            goto L11
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1BJA.LJII(org.json.JSONObject, java.lang.String, X.1BK7):void");
    }

    public static void LJIIIIZZ(String str, Object obj, C1BK7 c1bk7, boolean z) {
        Class<?> cls = obj.getClass();
        if (JSONObject.class.isAssignableFrom(cls)) {
            JSONObject jSONObject = (JSONObject) obj;
            if (z) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    LJIIIIZZ(C786410Ut5.j4("%s[%s]", Arrays.copyOf(new Object[]{str, next}, 2)), jSONObject.opt(next), c1bk7, z);
                }
                return;
            }
            if (jSONObject.has(FollowStatusChangeMethod.PARAM_UID)) {
                LJIIIIZZ(str, jSONObject.optString(FollowStatusChangeMethod.PARAM_UID), c1bk7, z);
                return;
            } else if (jSONObject.has("url")) {
                LJIIIIZZ(str, jSONObject.optString("url"), c1bk7, z);
                return;
            } else {
                if (jSONObject.has("fbsdk:create_object")) {
                    LJIIIIZZ(str, C786410Ut5.J3(jSONObject), c1bk7, z);
                    return;
                }
                return;
            }
        }
        if (JSONArray.class.isAssignableFrom(cls)) {
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            if (length > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    LJIIIIZZ(C786410Ut5.k4(Locale.ROOT, "%s[%d]", Arrays.copyOf(new Object[]{str, Integer.valueOf(i)}, 2)), jSONArray.opt(i), c1bk7, z);
                    if (i2 < length) {
                        i = i2;
                    } else {
                        return;
                    }
                }
            }
        } else {
            if (!String.class.isAssignableFrom(cls) && !Number.class.isAssignableFrom(cls) && !Boolean.class.isAssignableFrom(cls)) {
                if (Date.class.isAssignableFrom(cls)) {
                    c1bk7.LIZ(str, new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj));
                    return;
                }
                String str2 = GraphRequest.LJIIIIZZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("The type of property ");
                sbLIZ.append(str);
                sbLIZ.append(" in the graph object is unknown. It won't be sent in the request.");
                C2188811AlT.LIZIZ(sbLIZ);
                return;
            }
            c1bk7.LIZ(str, obj.toString());
        }
    }

    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v4 */
    public static void LJIIIZ(C1BJ9 c1bj9, C1BJC c1bjc, int i, URL url, OutputStream outputStream, boolean z) throws JSONException {
        String strLIZLLL;
        Object obj;
        Object obj2;
        Object obj3;
        C1BJB c1bjb = new C1BJB(outputStream, c1bjc, z);
        int i2 = 1;
        if (i == 1) {
            GraphRequest graphRequest = (GraphRequest) ((ArrayList) c1bj9.LLILLJJLI).get(0);
            HashMap map = new HashMap();
            for (String str : graphRequest.LIZLLL.keySet()) {
                try {
                    obj3 = graphRequest.LIZLLL.get(str);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    obj3 = null;
                } catch (OutOfMemoryError e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    obj3 = null;
                }
                if (LIZLLL(obj3)) {
                    map.put(str, new C2202931BJr(graphRequest, obj3));
                }
            }
            if (c1bjc != null) {
                C1BJC.LIZIZ();
            }
            Bundle bundle = graphRequest.LIZLLL;
            for (String str2 : bundle.keySet()) {
                try {
                    obj2 = bundle.get(str2);
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    obj2 = null;
                } catch (OutOfMemoryError e4) {
                    TryCatchGuardChecker.doCheck(e4);
                    obj2 = null;
                }
                if (LJ(obj2)) {
                    c1bjb.LJI(str2, obj2, graphRequest);
                }
            }
            if (c1bjc != null) {
                C1BJC.LIZIZ();
            }
            LJIIJJI(map, c1bjb);
            JSONObject jSONObject = graphRequest.LIZJ;
            if (jSONObject != null) {
                LJII(jSONObject, url.getPath(), c1bjb);
                return;
            }
            return;
        }
        Iterator<GraphRequest> it2 = c1bj9.iterator();
        while (true) {
            if (it2.hasNext()) {
                AccessToken accessToken = it2.next().LIZ;
                if (accessToken != null) {
                    strLIZLLL = accessToken.applicationId;
                    break;
                }
            } else {
                String str3 = GraphRequest.LJIIIIZZ;
                strLIZLLL = FacebookSdk.LIZLLL();
                break;
            }
        }
        if (strLIZLLL.length() == 0) {
            throw new C1BJO("App ID was not specified at the request or Settings.");
        }
        c1bjb.LIZ("batch_app_id", strLIZLLL);
        HashMap map2 = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (GraphRequest graphRequest2 : c1bj9) {
            graphRequest2.getClass();
            JSONObject jSONObject2 = new JSONObject();
            Object[] objArr = new Object[i2];
            objArr[0] = FacebookSdk.LJFF();
            String strLJII = graphRequest2.LJII(C786410Ut5.j4("https://graph.%s", Arrays.copyOf(objArr, i2)));
            graphRequest2.LIZ();
            Uri uri = Uri.parse(graphRequest2.LIZIZ(strLJII, i2));
            int i3 = 2;
            Object[] objArr2 = new Object[2];
            objArr2[0] = uri.getPath();
            objArr2[i2] = uri.getQuery();
            String strJ4 = C786410Ut5.j4("%s?%s", Arrays.copyOf(objArr2, 2));
            jSONObject2.put("relative_url", strJ4);
            jSONObject2.put("method", graphRequest2.LJI);
            AccessToken accessToken2 = graphRequest2.LIZ;
            if (accessToken2 != null) {
                String str4 = accessToken2.token;
                C2202841BJi c2202841BJi = C1BJC.LIZIZ;
                synchronized (c2202841BJi) {
                    FacebookSdk.LJIIIIZZ();
                    c2202841BJi.LIZ(str4);
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator<String> it3 = graphRequest2.LIZLLL.keySet().iterator();
            while (true) {
                boolean zHasNext = it3.hasNext();
                String str5 = GraphRequest.LJIIIIZZ;
                if (!zHasNext) {
                    break;
                }
                try {
                    obj = graphRequest2.LIZLLL.get(it3.next());
                } catch (Exception e5) {
                    TryCatchGuardChecker.doCheck(e5);
                    obj = null;
                } catch (OutOfMemoryError e6) {
                    TryCatchGuardChecker.doCheck(e6);
                    obj = null;
                }
                if (LIZLLL(obj)) {
                    Locale locale = Locale.ROOT;
                    Object[] objArr3 = new Object[i3];
                    objArr3[0] = "file";
                    objArr3[1] = Integer.valueOf(map2.size());
                    String strK4 = C786410Ut5.k4(locale, "%s%d", Arrays.copyOf(objArr3, i3));
                    arrayList.add(strK4);
                    map2.put(strK4, new C2202931BJr(graphRequest2, obj));
                    i3 = 2;
                }
            }
            if (!arrayList.isEmpty()) {
                jSONObject2.put("attached_files", TextUtils.join(",", arrayList));
            }
            JSONObject jSONObject3 = graphRequest2.LIZJ;
            if (jSONObject3 != null) {
                final ArrayList arrayList2 = new ArrayList();
                LJII(jSONObject3, strJ4, new C1BK7() { // from class: X.08IO
                    @Override // X.C1BK7
                    public final void LIZ(String str6, String str7) {
                        arrayList2.add(C786410Ut5.k4(Locale.US, "%s=%s", Arrays.copyOf(new Object[]{str6, URLEncoder.encode(str7, "UTF-8")}, 2)));
                    }
                });
                jSONObject2.put("body", TextUtils.join("&", arrayList2));
            }
            jSONArray.put(jSONObject2);
            i2 = 1;
        }
        Closeable closeable = c1bjb.LIZ;
        if (!(closeable instanceof C1BKL)) {
            c1bjb.LIZ("batch", jSONArray.toString());
        } else {
            C1BKL c1bkl = (C1BKL) closeable;
            c1bjb.LIZJ("batch", null, null);
            c1bjb.LIZIZ(e3.e, new Object[0]);
            int i4 = 0;
            for (GraphRequest graphRequest3 : c1bj9) {
                int i5 = i4 + 1;
                JSONObject jSONObject4 = jSONArray.getJSONObject(i4);
                c1bkl.LIZ(graphRequest3);
                if (i4 > 0) {
                    c1bjb.LIZIZ(",%s", C786410Ut5.J3(jSONObject4));
                } else {
                    c1bjb.LIZIZ("%s", C786410Ut5.J3(jSONObject4));
                }
                i4 = i5;
            }
            c1bjb.LIZIZ(e3.f, new Object[0]);
            if (c1bjb.LIZIZ != null) {
                Intrinsics.LJIIJJI("batch", "    ");
                jSONArray.toString();
                C1BJC.LIZIZ();
            }
        }
        if (c1bjc != null) {
            C1BJC.LIZIZ();
        }
        LJIIJJI(map2, c1bjb);
    }
}
