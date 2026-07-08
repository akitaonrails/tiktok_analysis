package X;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Process;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: X.08JN, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08JN {
    public static boolean LIZ(C0VSJ c0vsj, byte[] bArr) throws Throwable {
        C0VSV c0vsv;
        C0VSV c0vsv2 = null;
        try {
            try {
                c0vsv = new C0VSV(c0vsj);
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            c0vsv.write(bArr);
            c0vsv.flush();
            try {
                c0vsv.close();
                return true;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                return true;
            }
        } catch (Exception e3) {
            e = e3;
            c0vsv2 = c0vsv;
            TryCatchGuardChecker.doCheck(e);
            if (c0vsv2 != null) {
                try {
                    c0vsv2.close();
                    return false;
                } catch (Exception e4) {
                    TryCatchGuardChecker.doCheck(e4);
                    return false;
                }
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            c0vsv2 = c0vsv;
            TryCatchGuardChecker.doCheck(th);
            if (c0vsv2 != null) {
                try {
                    c0vsv2.close();
                    throw th;
                } catch (Exception e5) {
                    TryCatchGuardChecker.doCheck(e5);
                    throw th;
                }
            }
            throw th;
        }
    }

    public static Typeface LIZIZ(Context context, byte[] bArr) {
        C0VSJ c0vsj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(".lynx-font");
        sbLIZ.append(Process.myPid());
        sbLIZ.append("-");
        sbLIZ.append(Process.myTid());
        sbLIZ.append("-");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        int i = 0;
        while (true) {
            if (i < 100) {
                File fileW2 = C786410Ut5.w2(context);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ);
                sbLIZ2.append(i);
                c0vsj = new C0VSJ(fileW2, C2188811AlT.LIZIZ(sbLIZ2));
                try {
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (c0vsj.createNewFile()) {
                    break;
                }
                i++;
            } else {
                c0vsj = null;
                break;
            }
        }
        try {
            if (c0vsj == null) {
                return null;
            }
            try {
                if (!LIZ(c0vsj, bArr)) {
                    c0vsj.delete();
                    return null;
                }
                Typeface typefaceX4 = C786410Ut5.x4(c0vsj.getPath());
                c0vsj.delete();
                return typefaceX4;
            } catch (RuntimeException e2) {
                TryCatchGuardChecker.doCheck(e2);
                c0vsj.delete();
                return null;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c0vsj.delete();
            throw th;
        }
    }
}
