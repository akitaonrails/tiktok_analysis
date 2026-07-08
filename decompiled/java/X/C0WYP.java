package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStreamReader;

/* JADX INFO: renamed from: X.0WYP, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WYP {
    public static final C0WYR LIZ = new FileFilter() { // from class: X.0WYR
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

    public static void LIZ(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static int LIZIZ(String str) throws Throwable {
        BufferedReader bufferedReader;
        C0VSP c0vsp;
        int i = -1;
        C0VSP c0vsp2 = null;
        try {
            c0vsp = new C0VSP(str);
        } catch (IOException e) {
            e = e;
            c0vsp = null;
            bufferedReader = null;
        } catch (Throwable th) {
            th = th;
            bufferedReader = null;
        }
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(c0vsp));
            try {
                try {
                    String line = bufferedReader.readLine();
                    if (line != null && line.matches("0-[\\d]+$")) {
                        i = CastIntegerProtector.parseInt(line.substring(2)) + 1;
                    }
                } catch (IOException e2) {
                    e = e2;
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (Throwable th2) {
                th = th2;
                c0vsp2 = c0vsp;
                while (true) {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        LIZ(c0vsp2);
                        LIZ(bufferedReader);
                        throw th;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            }
        } catch (IOException e3) {
            e = e3;
            bufferedReader = null;
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
            c0vsp2 = c0vsp;
            while (true) {
                TryCatchGuardChecker.doCheck(th);
                LIZ(c0vsp2);
                LIZ(bufferedReader);
                throw th;
            }
        }
        LIZ(c0vsp);
        LIZ(bufferedReader);
        return i;
    }
}
