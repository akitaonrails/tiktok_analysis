package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0XRS, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XRS {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(C0VSJ c0vsj) throws Throwable {
        StringBuilder sb = new StringBuilder();
        byte[] bArr = new byte[524288];
        C1496670p3B c1496670p3B = new C1496670p3B(C1496330p2d.LIZIZ(c0vsj));
        Throwable th = null;
        try {
            c1496670p3B.read(bArr);
            C2107108Nh.LIZ(c1496670p3B, null);
            sb.append(C0XRT.LIZ(C13S0.LIZ(bArr)));
            sb.append(c0vsj.getTotalSpace());
            sb.append(c0vsj.getName());
            return sb.toString();
        } catch (Throwable th2) {
            try {
                TryCatchGuardChecker.doCheck(th2);
                try {
                    throw th2;
                } catch (Throwable th3) {
                    th = th3;
                    th = th2;
                    while (true) {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            C2107108Nh.LIZ(c1496670p3B, th);
                            throw th;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    }
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    public static String LIZIZ(String str) {
        if (str == null) {
            return null;
        }
        if (C2359409Mi.LJ(str)) {
            return LIZ(new C0VSJ(str));
        }
        C0I0B.LJFF.LIZJ();
        String strLIZIZ = C2359409Mi.LIZIZ(C894660Z7w.LIZ(), str);
        if (strLIZIZ == null || strLIZIZ.length() == 0) {
            return null;
        }
        return LIZ(new C0VSJ(strLIZIZ));
    }
}
