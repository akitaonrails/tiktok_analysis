package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* JADX INFO: renamed from: X.08Db, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2080508Db {
    public static String LIZ(String str) throws Throwable {
        BufferedReader bufferedReader;
        C0VSJ c0vsj = new C0VSJ(str);
        FileInputStream fileInputStream = null;
        try {
            try {
                C0VSP c0vsp = new C0VSP(c0vsj);
                StringBuilder sb = new StringBuilder();
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(c0vsp));
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line != null) {
                                sb.append(line);
                                sb.append('\n');
                            } else {
                                bufferedReader.close();
                                String string = sb.toString();
                                c0vsp.close();
                                return string;
                            }
                        } catch (Throwable th) {
                            th = th;
                            while (true) {
                                try {
                                    TryCatchGuardChecker.doCheck(th);
                                    break;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedReader = null;
                }
            } catch (Throwable th4) {
                th = th4;
                TryCatchGuardChecker.doCheck(th);
                if (0 != 0) {
                    fileInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }
}
