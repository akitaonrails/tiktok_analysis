package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: X.08EM, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08EM {
    public static String LIZ(Context context) throws Throwable {
        Closeable closeable;
        InputStreamReader inputStreamReader;
        BufferedReader bufferedReader;
        C2137908Zd c2137908Zd;
        StringBuilder sb = new StringBuilder();
        InputStreamReader inputStreamReader2 = null;
        try {
            try {
                inputStreamReader = new InputStreamReader(context.getResources().getAssets().open("omsdk_v1.js"));
            } catch (Throwable th) {
                th = th;
            }
        } catch (UnsupportedEncodingException e) {
            e = e;
            inputStreamReader = null;
            bufferedReader = null;
        } catch (IOException e2) {
            e = e2;
            inputStreamReader = null;
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
            closeable = null;
            while (true) {
                try {
                    TryCatchGuardChecker.doCheck(th);
                    C2137908Zd c2137908Zd2 = C2137908Zd.LIZJ;
                    c2137908Zd2.LIZ(inputStreamReader2);
                    c2137908Zd2.LIZ(closeable);
                    throw th;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        }
        try {
            bufferedReader = new BufferedReader(inputStreamReader);
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                } catch (UnsupportedEncodingException e3) {
                    e = e3;
                    TryCatchGuardChecker.doCheck(e);
                    C1AF0.LJ(e);
                    c2137908Zd = C2137908Zd.LIZJ;
                } catch (IOException e4) {
                    e = e4;
                    TryCatchGuardChecker.doCheck(e);
                    c2137908Zd = C2137908Zd.LIZJ;
                }
            }
            c2137908Zd = C2137908Zd.LIZJ;
        } catch (UnsupportedEncodingException e5) {
            e = e5;
            bufferedReader = null;
        } catch (IOException e6) {
            e = e6;
            bufferedReader = null;
        } catch (Throwable th4) {
            th = th4;
            closeable = null;
            inputStreamReader2 = inputStreamReader;
            while (true) {
                TryCatchGuardChecker.doCheck(th);
                C2137908Zd c2137908Zd22 = C2137908Zd.LIZJ;
                c2137908Zd22.LIZ(inputStreamReader2);
                c2137908Zd22.LIZ(closeable);
                throw th;
            }
        }
        c2137908Zd.LIZ(inputStreamReader);
        c2137908Zd.LIZ(bufferedReader);
        return sb.toString();
    }
}
