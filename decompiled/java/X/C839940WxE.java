package X;

import com.bytedance.bpea.basics.Cert;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0WxE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C839940WxE {
    /* JADX WARN: Removed duplicated region for block: B:69:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(double r15, com.bytedance.bpea.basics.Cert r17, java.lang.String r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C839940WxE.LIZ(double, com.bytedance.bpea.basics.Cert, java.lang.String):java.lang.String");
    }

    public static C1199590hK1 LIZIZ(double d, double d2, Cert cert) throws C838130WuJ {
        try {
            String strCertToken = cert.certToken();
            return new C1199590hK1(LIZ(d, cert, strCertToken), LIZ(d2, cert, strCertToken));
        } catch (C838130WuJ e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            throw new C838130WuJ(-1, message);
        }
    }
}
