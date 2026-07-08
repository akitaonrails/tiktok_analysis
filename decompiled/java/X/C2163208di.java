package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: renamed from: X.08di, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2163208di {
    public static final C2163408dk LIZ = new FileFilter() { // from class: X.08dk
        @Override // java.io.FileFilter
        public final boolean accept(File file) {
            String name = file.getName();
            if (!name.startsWith("cpu")) {
                return false;
            }
            for (int i = 3; i < name.length(); i++) {
                if (!Character.isDigit(name.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
    };

    public static int LIZ(String str) throws Throwable {
        C0VSP c0vsp;
        int iIntValue = -1;
        C0VSP c0vsp2 = null;
        try {
            try {
                c0vsp = new C0VSP(str);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e) {
            e = e;
        }
        try {
            String line = new BufferedReader(new InputStreamReader(c0vsp)).readLine();
            if (line != null && line.matches("0-[\\d]+$")) {
                iIntValue = CastIntegerProtector.valueOf(line.substring(2)).intValue() + 1;
            }
            try {
                c0vsp.close();
                return iIntValue;
            } catch (IOException e2) {
                TryCatchGuardChecker.doCheck(e2);
                return iIntValue;
            }
        } catch (IOException e3) {
            e = e3;
            c0vsp2 = c0vsp;
            TryCatchGuardChecker.doCheck(e);
            if (c0vsp2 != null) {
                try {
                    c0vsp2.close();
                    return -1;
                } catch (IOException e4) {
                    TryCatchGuardChecker.doCheck(e4);
                    return -1;
                }
            }
            return -1;
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
