package com.appsflyer.internal;

import X.C0WZX;
import X.C2204961BRm;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes31.dex */
public final class AFe1qSDK {
    public final int AFInAppEventType;

    public AFe1qSDK(int i) {
        this.AFInAppEventType = i;
    }

    public static URLConnection INVOKEVIRTUAL_com_appsflyer_internal_AFe1qSDK_com_ss_android_ugc_aweme_net_lancet_UrlConnectionLancet_openConnection(URL url) {
        return C2204961BRm.e0(url, new C0WZX("dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5bBseeleyw==", new String[]{"01c45"}));
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x023d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.appsflyer.internal.AFe1jSDK<java.lang.String> AFKeystoreWrapper(com.appsflyer.internal.AFe1nSDK r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1qSDK.AFKeystoreWrapper(com.appsflyer.internal.AFe1nSDK):com.appsflyer.internal.AFe1jSDK");
    }

    public static String AFInAppEventType(HttpURLConnection httpURLConnection, boolean z) throws Throwable {
        BufferedReader bufferedReader;
        InputStream errorStream;
        InputStreamReader inputStreamReader = null;
        try {
            if (z) {
                errorStream = httpURLConnection.getInputStream();
            } else {
                errorStream = httpURLConnection.getErrorStream();
            }
            if (errorStream == null) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            InputStreamReader inputStreamReader2 = new InputStreamReader(errorStream, Charset.defaultCharset());
            try {
                bufferedReader = new BufferedReader(inputStreamReader2);
                boolean z2 = true;
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line != null) {
                            if (!z2) {
                                sb.append('\n');
                            }
                            sb.append(line);
                            z2 = false;
                        } else {
                            String string = sb.toString();
                            inputStreamReader2.close();
                            bufferedReader.close();
                            return string;
                        }
                    } catch (Throwable th) {
                        th = th;
                        inputStreamReader = inputStreamReader2;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
                inputStreamReader = inputStreamReader2;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
        }
        TryCatchGuardChecker.doCheck(th);
        if (inputStreamReader != null) {
            inputStreamReader.close();
        }
        if (bufferedReader != null) {
            bufferedReader.close();
        }
        throw th;
    }
}
