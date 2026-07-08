package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0VdZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C802270VdZ {
    public static String LIZ;

    public static String LIZ() throws Throwable {
        if (!TextUtils.isEmpty(LIZ)) {
            return LIZ;
        }
        String strLIZLLL = LIZLLL();
        LIZ = strLIZLLL;
        return strLIZLLL == null ? "" : strLIZLLL;
    }

    public static String LIZIZ() {
        String str = LIZ;
        return str == null ? "" : str;
    }

    public static String LIZJ() {
        if (TextUtils.isEmpty(LIZ)) {
            LIZ = LIZLLL();
        }
        return LIZ;
    }

    public static String LIZLLL() throws Throwable {
        C0VSP c0vsp;
        int i;
        StringBuilder sb = new StringBuilder();
        C0VSP c0vsp2 = null;
        try {
            try {
                c0vsp = new C0VSP("/proc/self/cmdline");
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
            c0vsp = null;
        }
        try {
            byte[] bArr = new byte[64];
            do {
                i = c0vsp.read(bArr, 0, 64);
                for (int i2 = 0; i2 < i; i2++) {
                    char c = (char) bArr[i2];
                    if (c == 0 || c == '\n') {
                        i = -1;
                        break;
                    }
                    sb.append(c);
                }
            } while (i > 0);
        } catch (Exception e2) {
            e = e2;
            TryCatchGuardChecker.doCheck(e);
        } catch (Throwable th2) {
            th = th2;
            c0vsp2 = c0vsp;
            TryCatchGuardChecker.doCheck(th);
            C2112008Pe.LIZ(c0vsp2);
            throw th;
        }
        C2112008Pe.LIZ(c0vsp);
        return sb.toString();
    }

    public static boolean LJ() {
        return LJFF(C0VX9.LJ(), LIZJ());
    }

    public static boolean LJFF(Context context, String str) {
        if (str == null || str.contains(":")) {
            return false;
        }
        if (context == null && (context = C0VX9.LJ()) == null) {
            return false;
        }
        if (str.equals(context.getPackageName())) {
            return true;
        }
        return str.equals(context.getApplicationInfo().processName);
    }
}
