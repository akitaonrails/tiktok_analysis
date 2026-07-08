package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: renamed from: X.1BIx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2202731BIx {
    public static List LIZ(List list, HttpURLConnection httpURLConnection, C1BJO c1bjo) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next();
            arrayList.add(new C0WVK(httpURLConnection, null, null, new FacebookRequestError(httpURLConnection, c1bjo)));
        }
        return arrayList;
    }

    public static List LIZJ(InputStream inputStream, HttpURLConnection httpURLConnection, C1BJ9 c1bj9) throws Throwable {
        InputStreamReader inputStreamReader;
        BufferedInputStream bufferedInputStream;
        int i;
        Object obj;
        int responseCode;
        BufferedInputStream bufferedInputStream2 = null;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
            } catch (Throwable th) {
                th = th;
                inputStreamReader = null;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamReader = null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            char[] cArr = new char[SpeechEngineDefines.ASR_WORK_MODE_OFFLINE];
            while (true) {
                int i2 = inputStreamReader.read(cArr);
                i = 0;
                if (i2 == -1) {
                    break;
                }
                sb.append(cArr, 0, i2);
            }
            String string = sb.toString();
            C0W7Q.LIZJ(bufferedInputStream);
            C0W7Q.LIZJ(inputStreamReader);
            string.getClass();
            synchronized (FacebookSdk.LIZ) {
            }
            Object objNextValue = new JSONTokener(string).nextValue();
            int size = c1bj9.size();
            ArrayList arrayList = new ArrayList(size);
            if (size == 1) {
                c1bj9.get(0);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("body", objNextValue);
                    if (httpURLConnection == null) {
                        responseCode = 200;
                    } else {
                        responseCode = httpURLConnection.getResponseCode();
                    }
                    jSONObject.put("code", responseCode);
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(jSONObject);
                    obj = jSONArray;
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    arrayList.add(new C0WVK(httpURLConnection, null, null, new FacebookRequestError(httpURLConnection, e)));
                    obj = objNextValue;
                } catch (JSONException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    arrayList.add(new C0WVK(httpURLConnection, null, null, new FacebookRequestError(httpURLConnection, e2)));
                    obj = objNextValue;
                }
            } else {
                obj = objNextValue;
            }
            if (obj instanceof JSONArray) {
                JSONArray jSONArray2 = (JSONArray) obj;
                if (jSONArray2.length() == size) {
                    int length = jSONArray2.length();
                    if (length > 0) {
                        while (true) {
                            int i3 = i + 1;
                            try {
                                arrayList.add(LIZIZ((GraphRequest) c1bj9.get(i), httpURLConnection, ((JSONArray) obj).get(i), objNextValue));
                            } catch (C1BJO e3) {
                                TryCatchGuardChecker.doCheck(e3);
                                arrayList.add(new C0WVK(httpURLConnection, null, null, new FacebookRequestError(httpURLConnection, e3)));
                            } catch (JSONException e4) {
                                TryCatchGuardChecker.doCheck(e4);
                                arrayList.add(new C0WVK(httpURLConnection, null, null, new FacebookRequestError(httpURLConnection, e4)));
                            }
                            if (i3 >= length) {
                                break;
                            }
                            i = i3;
                        }
                    }
                    FacebookSdk.LJIIIIZZ();
                    return arrayList;
                }
            }
            throw new C1BJO("Unexpected number of results");
        } catch (Throwable th3) {
            th = th3;
            bufferedInputStream2 = bufferedInputStream;
            while (true) {
                try {
                    TryCatchGuardChecker.doCheck(th);
                    C0W7Q.LIZJ(bufferedInputStream2);
                    C0W7Q.LIZJ(inputStreamReader);
                    throw th;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cc A[Catch: JSONException -> 0x01a7, TryCatch #2 {JSONException -> 0x01a7, blocks: (B:27:0x00be, B:28:0x00cc, B:33:0x00dd), top: B:94:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.facebook.FacebookRequestError, org.json.JSONArray, org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [org.json.JSONArray, org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6, types: [com.facebook.FacebookRequestError] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0WVK LIZIZ(com.facebook.GraphRequest r36, java.net.HttpURLConnection r37, java.lang.Object r38, java.lang.Object r39) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2202731BIx.LIZIZ(com.facebook.GraphRequest, java.net.HttpURLConnection, java.lang.Object, java.lang.Object):X.0WVK");
    }
}
