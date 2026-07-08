package X;

import android.os.Process;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.08Sd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2119708Sd {
    public static final AtomicInteger LJI = new AtomicInteger(0);
    public final InterfaceC2119808Se LIZ;
    public Process LIZJ;
    public BufferedReader LIZLLL;
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public final Set<String> LJ = Collections.synchronizedSet(new HashSet(100));
    public final int LJFF = Process.myPid();

    public final void LIZIZ() {
        String line;
        String strReplace;
        String[] strArrSplit;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("--pid=");
        sbLIZ.append(this.LJFF);
        this.LIZJ = Runtime.getRuntime().exec(new String[]{"logcat", "-v", "threadtime", C2188811AlT.LIZIZ(sbLIZ), "*:I"});
        this.LIZLLL = new BufferedReader(new InputStreamReader(this.LIZJ.getInputStream()), 8192);
        while (this.LIZIZ.get() && (line = this.LIZLLL.readLine()) != null) {
            if (!line.contains("ClassLoadedTracer")) {
                try {
                    strArrSplit = line.trim().split("\\s+");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (strArrSplit.length < 4 || CastIntegerProtector.parseInt(strArrSplit[3]) == this.LJFF) {
                    if (line.contains("Loaded class") && line.contains("base.apk")) {
                        try {
                            int iIndexOf = line.indexOf("Loaded class ") + 13;
                            int iIndexOf2 = line.indexOf(32, iIndexOf);
                            if (iIndexOf2 == -1) {
                                iIndexOf2 = line.indexOf(59, iIndexOf);
                            }
                            if (iIndexOf2 == -1) {
                                iIndexOf2 = line.length();
                            }
                            String strTrim = line.substring(iIndexOf, iIndexOf2).trim();
                            if (strTrim.startsWith("L") && strTrim.endsWith(";") && (strReplace = strTrim.substring(1, strTrim.length() - 1).replace("/", e3.d)) != null) {
                                this.LJ.add(strReplace);
                            }
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                    }
                }
            }
        }
    }

    public final void LIZ() {
        BufferedReader bufferedReader = this.LIZLLL;
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            this.LIZLLL = null;
        }
        Process process = this.LIZJ;
        if (process != null) {
            process.destroy();
            try {
                this.LIZJ.waitFor();
            } catch (InterruptedException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            this.LIZJ = null;
        }
    }

    public C2119708Sd(C2119908Sf c2119908Sf) {
        this.LIZ = c2119908Sf;
    }
}
