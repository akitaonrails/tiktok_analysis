package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: X.08Zs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2139408Zs {
    public static volatile boolean LIZ;

    public static String LIZIZ(String str, String str2) throws Throwable {
        try {
            C0VSJ c0vsj = new C0VSJ(str, str2);
            if (!c0vsj.exists()) {
                return null;
            }
            C0VSP c0vsp = new C0VSP(c0vsj);
            try {
                byte[] bArr = new byte[c0vsp.available()];
                c0vsp.read(bArr);
                String str3 = new String(bArr, Charset.defaultCharset());
                C2107108Nh.LIZ(c0vsp, null);
                return str3;
            } catch (Throwable th) {
                th = th;
                try {
                    TryCatchGuardChecker.doCheck(th);
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                        while (true) {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                C2107108Nh.LIZ(c0vsp, th);
                                throw th;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    th = null;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            C2344809Gs.LJ("parse preload manifest file failed");
            return null;
        }
    }

    public static Object LIZ(String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn) {
        return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C05QN(str, str2, null));
    }
}
