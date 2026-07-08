package X;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0oyc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1493840oyc {
    public static String LIZ(String str, Map<String, String> map, Map<String, List<String>> map2, C1493210oxb c1493210oxb) {
        boolean zLIZIZ;
        final HttpURLConnection httpURLConnection;
        String str2;
        String baseType;
        String parameter;
        Pair pair;
        C1494390ozV c1494390ozV;
        String str3;
        int i;
        Object obj;
        Map<String, List<String>> headerFields;
        if (C2093608Ic.LJ(str)) {
            return null;
        }
        TTNetInit.getTTNetDepend().getContext();
        try {
            zLIZIZ = C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            zLIZIZ = false;
        }
        if (!zLIZIZ) {
            return null;
        }
        try {
            if (c1493210oxb.LIZJ) {
                String strLIZ = C1494230ozF.LIZ(str, null);
                if (!TextUtils.isEmpty(strLIZ)) {
                    if (strLIZ.equals(str)) {
                        StringBuilder sb = new StringBuilder(strLIZ);
                        if (strLIZ.indexOf(63) < 0) {
                            sb.append("?");
                        } else {
                            sb.append("&");
                        }
                        sb.append("aid=");
                        sb.append(TTNetInit.getTTNetDepend().getAppId());
                        sb.append("&device_platform=android");
                        if (TTNetInit.getCronetProvider() != null) {
                            sb.append("&version_code=");
                            sb.append(TTNetInit.getCronetProvider().getVersionCode());
                            sb.append("&channel=");
                            sb.append(TTNetInit.getCronetProvider().getChannel());
                            sb.append("device_id");
                            sb.append(TTNetInit.getCronetProvider().getDeviceId());
                        }
                        str = sb.toString();
                    } else {
                        str = strLIZ;
                    }
                }
            }
            httpURLConnection = (HttpURLConnection) C2204961BRm.e0(new URL(str), new C0WZX("dzBzEgAjS8/YVFkiQFyQctEAqJDY0JYvPZ2kOMJcHMYFvyDBMlf/c+vu", null));
            try {
                httpURLConnection.setRequestMethod("GET");
                InterfaceC1494070oyz interfaceC1494070oyz = C1494230ozF.LIZ;
                httpURLConnection.setConnectTimeout(15000);
                httpURLConnection.setReadTimeout(15000);
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                if (c1493210oxb.LIZIZ) {
                    str2 = " HttpsURLConnection";
                } else {
                    str2 = " HttpURLConnection";
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ttnet");
                sbLIZ.append(str2);
                httpURLConnection.setRequestProperty("User-Agent", C2188811AlT.LIZIZ(sbLIZ));
                HashMap map3 = (HashMap) map;
                if (map3.size() > 0) {
                    for (Map.Entry entry : map3.entrySet()) {
                        httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                int responseCode = httpURLConnection.getResponseCode();
                if (httpURLConnection.getHeaderFields() != null && (headerFields = httpURLConnection.getHeaderFields()) != null) {
                    for (Map.Entry<String, List<String>> entry2 : headerFields.entrySet()) {
                        String key = entry2.getKey();
                        if (!TextUtils.isEmpty(key)) {
                            ((HashMap) map2).put(key.toLowerCase(), entry2.getValue());
                        }
                    }
                }
                if (!c1493210oxb.LIZIZ) {
                    httpURLConnection.getHeaderField("X-SS-SIGN");
                }
                c1493210oxb.LIZLLL = httpURLConnection.getHeaderField("x-ss-etag");
                c1493210oxb.LJ = httpURLConnection.getHeaderField("x-tt-tnc-abtest");
                c1493210oxb.LJFF = httpURLConnection.getHeaderField("x-tt-tnc-control");
                c1493210oxb.LJI = httpURLConnection.getHeaderField("x-tt-tnc-config");
                c1493210oxb.LJII = httpURLConnection.getHeaderField("x-ss-canary");
                httpURLConnection.getHeaderField("x-tt-tnc-query-region");
                httpURLConnection.getHeaderField("x-tt-logid");
                if (responseCode == 200) {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    boolean zEquals = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding"));
                    String headerField = httpURLConnection.getHeaderField("Content-Type");
                    boolean zLJII = C1495270p0v.LJII(headerField);
                    CopyOnWriteArrayList<InterfaceC1904907d9> copyOnWriteArrayList = C1515120pWw.LIZ;
                    if (headerField != null) {
                        try {
                            c1494390ozV = new C1494390ozV(headerField);
                            baseType = c1494390ozV.getBaseType();
                        } catch (Throwable th) {
                            th = th;
                            baseType = null;
                        }
                        try {
                            parameter = c1494390ozV.getParameter("charset");
                        } catch (Throwable th2) {
                            th = th2;
                            TryCatchGuardChecker.doCheck(th);
                            parameter = null;
                        }
                        pair = new Pair(baseType, parameter);
                    } else {
                        pair = null;
                    }
                    if (pair != null && (obj = pair.second) != null && Charset.isSupported((String) obj)) {
                        str3 = (String) pair.second;
                    } else {
                        str3 = null;
                    }
                    if (str3 == null) {
                        str3 = "UTF-8";
                    }
                    int[] iArr = {0};
                    byte[] bArrLJFF = C1495270p0v.LJFF(zEquals, httpURLConnection.getHeaderFields(), -1, inputStream, iArr, new InterfaceC1493860oye() { // from class: X.0oyd
                        @Override // X.InterfaceC1493860oye
                        public final void LIZ() {
                            try {
                                HttpURLConnection httpURLConnection2 = httpURLConnection;
                                if (httpURLConnection2 != null) {
                                    httpURLConnection2.disconnect();
                                }
                            } catch (Throwable th3) {
                                TryCatchGuardChecker.doCheck(th3);
                            }
                        }
                    });
                    if (bArrLJFF != null && (i = iArr[0]) > 0 && i <= bArrLJFF.length) {
                        if (zLJII) {
                            C1495270p0v.LIZ(i, bArrLJFF);
                        }
                        String str4 = new String(bArrLJFF, 0, iArr[0], str3);
                        try {
                            httpURLConnection.disconnect();
                            return str4;
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            return str4;
                        }
                    }
                    try {
                        httpURLConnection.disconnect();
                        return null;
                    } catch (Exception e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        return null;
                    }
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("err status = ");
                sbLIZ2.append(responseCode);
                throw new IOException(C2188811AlT.LIZIZ(sbLIZ2));
            } catch (Throwable th3) {
                th = th3;
                try {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                } catch (Throwable th4) {
                    TryCatchGuardChecker.doCheck(th4);
                    if (httpURLConnection != null) {
                        try {
                            httpURLConnection.disconnect();
                            throw th4;
                        } catch (Exception e4) {
                            TryCatchGuardChecker.doCheck(e4);
                            throw th4;
                        }
                    }
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            th = th5;
            httpURLConnection = null;
        }
    }
}
