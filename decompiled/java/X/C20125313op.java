package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.JsonReader;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.13op, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20125313op {
    public static final Pattern LIZLLL = PatternProtector.compile("[0-9]+s");
    public static final Charset LJ = Charset.forName("UTF-8");
    public final Context LIZ;
    public final InterfaceC812380Vts<C0W4J> LIZIZ;
    public final C20127113p7 LIZJ = new C20127113p7();

    public static URL LIZ(String str) throws C20128213pI {
        try {
            return new URL(C786410Ut5.j4("https://%s/%s/%s", new Object[]{"firebaseinstallations.googleapis.com", "v1", str}));
        } catch (MalformedURLException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C20128213pI(e.getMessage(), EnumC20125813ou.UNAVAILABLE);
        }
    }

    public static void LIZIZ(HttpURLConnection httpURLConnection) {
        StringBuilder sb;
        InputStream errorStream = httpURLConnection.getErrorStream();
        String strJ4 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, LJ));
            try {
                try {
                    sb = new StringBuilder();
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                try {
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line);
                        sb.append('\n');
                        bufferedReader.close();
                    }
                    bufferedReader.close();
                } catch (IOException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                strJ4 = C786410Ut5.j4("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", new Object[]{Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb});
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                try {
                    bufferedReader.close();
                    throw th;
                } catch (IOException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    throw th;
                }
            }
        }
        TextUtils.isEmpty(strJ4);
    }

    public static long LIZLLL(String str) {
        C0W3J.LIZ("Invalid Expiration Timestamp.", LIZLLL.matcher(str).matches());
        if (str != null && str.length() != 0) {
            return CastLongProtector.parseLong(str.substring(0, str.length() - 1));
        }
        return 0L;
    }

    public static C20126813p4 LJ(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, LJ));
        C20125413oq c20125413oq = new C20125413oq();
        c20125413oq.LIZIZ = 0L;
        C20125513or c20125513or = new C20125513or();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("name")) {
                c20125513or.LIZ = jsonReader.nextString();
            } else if (strNextName.equals("fid")) {
                c20125513or.LIZIZ = jsonReader.nextString();
            } else if (strNextName.equals("refreshToken")) {
                c20125513or.LIZJ = jsonReader.nextString();
            } else if (strNextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if (strNextName2.equals("token")) {
                        c20125413oq.LIZ = jsonReader.nextString();
                    } else if (strNextName2.equals("expiresIn")) {
                        c20125413oq.LIZIZ = Long.valueOf(LIZLLL(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                c20125513or.LIZLLL = c20125413oq.LIZ();
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return new C20126813p4(c20125513or.LIZ, c20125513or.LIZIZ, c20125513or.LIZJ, c20125513or.LIZLLL, EnumC20125913ov.OK);
    }

    public static C20127013p6 LJFF(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, LJ));
        C20125413oq c20125413oq = new C20125413oq();
        c20125413oq.LIZIZ = 0L;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("token")) {
                c20125413oq.LIZ = jsonReader.nextString();
            } else if (strNextName.equals("expiresIn")) {
                c20125413oq.LIZIZ = Long.valueOf(LIZLLL(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        c20125413oq.LIZJ = EnumC20126113ox.OK;
        return c20125413oq.LIZ();
    }

    public static void LJII(HttpURLConnection httpURLConnection) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.0.1");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            LJIIIIZZ(httpURLConnection, C786410Ut5.J3(jSONObject2).getBytes("UTF-8"));
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IllegalStateException(e);
        }
    }

    public C20125313op(Context context, InterfaceC812380Vts<C0W4J> interfaceC812380Vts) {
        this.LIZ = context;
        this.LIZIZ = interfaceC812380Vts;
    }

    public static void LJIIIIZZ(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(bArr);
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                    return;
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                try {
                    gZIPOutputStream.close();
                    outputStream.close();
                    throw th;
                } catch (IOException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    throw th;
                }
            }
        }
        throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00af A[Catch: NameNotFoundException -> 0x00d7, TryCatch #1 {NameNotFoundException -> 0x00d7, blocks: (B:11:0x006f, B:13:0x0083, B:18:0x008d, B:22:0x0099, B:25:0x009f, B:28:0x00af, B:30:0x00b9, B:31:0x00d2, B:20:0x0093), top: B:41:0x006f, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.net.HttpURLConnection LIZJ(java.lang.String r9, java.net.URL r10) throws X.C20128213pI {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20125313op.LIZJ(java.lang.String, java.net.URL):java.net.HttpURLConnection");
    }

    public static void LJI(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.0.1");
            LJIIIIZZ(httpURLConnection, C786410Ut5.J3(jSONObject).getBytes("UTF-8"));
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IllegalStateException(e);
        }
    }
}
