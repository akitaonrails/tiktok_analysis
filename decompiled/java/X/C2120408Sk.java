package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;

/* JADX INFO: renamed from: X.08Sk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2120408Sk {
    public static String LIZ(String str) throws Throwable {
        C0VSP c0vsp;
        C0VSP c0vsp2 = null;
        try {
            try {
                c0vsp = new C0VSP(str);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            String hexString = Integer.toHexString((((((c0vsp.read() << 8) ^ c0vsp.read()) << 8) ^ c0vsp.read()) << 8) ^ c0vsp.read());
            try {
                c0vsp.close();
                return hexString;
            } catch (IOException e2) {
                TryCatchGuardChecker.doCheck(e2);
                return hexString;
            }
        } catch (Exception e3) {
            e = e3;
            c0vsp2 = c0vsp;
            TryCatchGuardChecker.doCheck(e);
            if (c0vsp2 != null) {
                try {
                    c0vsp2.close();
                    return "";
                } catch (IOException e4) {
                    TryCatchGuardChecker.doCheck(e4);
                    return "";
                }
            }
            return "";
        } catch (Throwable th2) {
            th = th2;
            c0vsp2 = c0vsp;
            TryCatchGuardChecker.doCheck(th);
            if (c0vsp2 != null) {
                try {
                    c0vsp2.close();
                    throw th;
                } catch (IOException e5) {
                    TryCatchGuardChecker.doCheck(e5);
                    throw th;
                }
            }
            throw th;
        }
    }
}
