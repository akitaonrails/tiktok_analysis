package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08iV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2192908iV implements InterfaceC2373709Rv {
    public static String LIZJ(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line != null) {
                sb.append(line);
            } else {
                return sb.toString();
            }
        }
    }

    public static HttpURLConnection LIZLLL(String str, JSONObject jSONObject) throws JSONException, IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) C2204961BRm.e0(new URL(str), new C0WZX("dzBzEgAjS8/YVFkiQFyMf71DPq0mRD7+YFLRMkGtCltio4XJPLppGlI/bfW4tI/w7Fo2VD4ZTTz04NrnnNU7QEqP4dr8", null));
        httpURLConnection.setConnectTimeout(5000);
        httpURLConnection.setReadTimeout(5000);
        httpURLConnection.setRequestProperty("Charset", "utf-8");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setDoInput(true);
        OutputStream outputStream = httpURLConnection.getOutputStream();
        String strOptString = jSONObject.optString("target");
        jSONObject.put("target", "temp_sec_url_tag");
        outputStream.write(C786410Ut5.J3(jSONObject).replace("temp_sec_url_tag", strOptString).getBytes("utf-8"));
        outputStream.flush();
        outputStream.close();
        return httpURLConnection;
    }

    public static void LJ(InputStream inputStream, HttpURLConnection httpURLConnection) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x003c -> B:25:0x0035). Please report as a decompilation issue!!! */
    @Override // X.InterfaceC2373709Rv
    public final String LIZ(String str, JSONObject jSONObject) throws Throwable {
        InputStream inputStream;
        HttpURLConnection httpURLConnectionLIZLLL;
        HttpURLConnection httpURLConnection = null;
        errorStream = null;
        errorStream = null;
        InputStream errorStream = null;
        try {
            try {
                httpURLConnectionLIZLLL = LIZLLL(str, jSONObject);
                try {
                    if (httpURLConnectionLIZLLL.getResponseCode() == 200) {
                        errorStream = httpURLConnectionLIZLLL.getInputStream();
                    } else {
                        errorStream = httpURLConnectionLIZLLL.getErrorStream();
                    }
                } catch (Exception e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                String strLIZJ = LIZJ(errorStream);
                LJ(errorStream, httpURLConnectionLIZLLL);
                return strLIZJ;
            } catch (Exception e2) {
                e = e2;
                TryCatchGuardChecker.doCheck(e);
                String message = e.getMessage();
                LJ(errorStream, httpURLConnectionLIZLLL);
                return message;
            } catch (Throwable th2) {
                th = th2;
                inputStream = errorStream;
                httpURLConnection = httpURLConnectionLIZLLL;
                try {
                } catch (Throwable th3) {
                    th = th3;
                    httpURLConnectionLIZLLL = httpURLConnection;
                    errorStream = inputStream;
                    inputStream = errorStream;
                    httpURLConnection = httpURLConnectionLIZLLL;
                    TryCatchGuardChecker.doCheck(th);
                    LJ(inputStream, httpURLConnection);
                    throw th;
                }
                TryCatchGuardChecker.doCheck(th);
                LJ(inputStream, httpURLConnection);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            httpURLConnectionLIZLLL = null;
        } catch (Throwable th4) {
            th = th4;
            inputStream = null;
            TryCatchGuardChecker.doCheck(th);
            LJ(inputStream, httpURLConnection);
            throw th;
        }
    }

    @Override // X.InterfaceC2373709Rv
    public final void LIZIZ(String str, JSONObject jSONObject, C2198381B2e c2198381B2e) throws Throwable {
        HttpURLConnection httpURLConnectionLIZLLL;
        InputStream inputStream;
        InputStream errorStream;
        InputStream inputStream2 = null;
        inputStream2 = null;
        HttpURLConnection httpURLConnection = null;
        try {
            httpURLConnectionLIZLLL = LIZLLL(str, jSONObject);
            try {
                if (httpURLConnectionLIZLLL.getResponseCode() == 200) {
                    errorStream = httpURLConnectionLIZLLL.getInputStream();
                    c2198381B2e.LIZIZ(LIZJ(errorStream));
                } else {
                    errorStream = httpURLConnectionLIZLLL.getErrorStream();
                    c2198381B2e.LIZ(LIZJ(errorStream));
                }
                LJ(errorStream, httpURLConnectionLIZLLL);
            } catch (Exception e) {
                e = e;
                inputStream = null;
                httpURLConnection = httpURLConnectionLIZLLL;
                try {
                    TryCatchGuardChecker.doCheck(e);
                    c2198381B2e.LIZ(e.getMessage());
                    LJ(inputStream, httpURLConnection);
                } catch (Throwable th) {
                    th = th;
                    httpURLConnectionLIZLLL = httpURLConnection;
                    inputStream2 = inputStream;
                    while (true) {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            LJ(inputStream2, httpURLConnectionLIZLLL);
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                while (true) {
                    TryCatchGuardChecker.doCheck(th);
                    LJ(inputStream2, httpURLConnectionLIZLLL);
                    throw th;
                }
            }
        } catch (Exception e2) {
            e = e2;
            inputStream = null;
        } catch (Throwable th4) {
            th = th4;
            httpURLConnectionLIZLLL = null;
        }
    }
}
