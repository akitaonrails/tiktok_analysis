package X;

import com.bytedance.apm.agent.instrumentation.HttpInstrumentation;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.08cf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2156708cf {
    public static final ExecutorService LIZ = C786410Ut5.h4();

    public static String LIZ(InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        try {
            StringBuilder sb = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line != null) {
                    sb.append(line);
                } else {
                    String string = sb.toString();
                    bufferedReader.close();
                    return string;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            try {
                bufferedReader.close();
                throw th;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public static String LIZIZ(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) HttpInstrumentation.openConnection(C2204961BRm.e0(new URL(str), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOu4c9HNzjOQPCVwgK4NtTQHCGE=", null)));
        try {
            httpURLConnection.setRequestMethod("GET");
            InputStream inputStream = httpURLConnection.getInputStream();
            try {
                String strLIZ = LIZ(inputStream);
                if (inputStream != null) {
                    inputStream.close();
                }
                httpURLConnection.disconnect();
                return strLIZ;
            } finally {
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    public static void LIZJ(String str, String str2, InterfaceC2156608ce interfaceC2156608ce) throws ProtocolException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) HttpInstrumentation.openConnection(C2204961BRm.e0(new URL(str), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOu4c9HNzjOQPCVwgK4NtTQHCGE=", null)));
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                byte[] bytes = str2.getBytes("utf-8");
                outputStream.write(bytes, 0, bytes.length);
                outputStream.close();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 200) {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        interfaceC2156608ce.onSuccess(LIZ(inputStream));
                        if (inputStream != null) {
                            inputStream.close();
                        }
                    } finally {
                    }
                } else {
                    InputStream errorStream = httpURLConnection.getErrorStream();
                    try {
                        interfaceC2156608ce.onError(responseCode, LIZ(errorStream));
                        if (errorStream != null) {
                            errorStream.close();
                        }
                    } finally {
                    }
                }
                httpURLConnection.disconnect();
            } finally {
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            httpURLConnection.disconnect();
            throw th;
        }
    }
}
