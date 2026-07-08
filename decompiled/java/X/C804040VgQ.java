package X;

import Y.AComparatorS32S0000000_13;
import android.content.Context;
import android.os.Looper;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import com.bytedance.sliver.Sliver;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.FilenameFilter;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: renamed from: X.0VgQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C804040VgQ extends C801770Vcl {
    public static final C804040VgQ LIZIZ = new C804040VgQ();
    public static final SimpleDateFormat LIZJ = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss", Locale.CHINESE);
    public static boolean LIZLLL = false;
    public Context LIZ;

    public final void LIZIZ() {
        File fileY2;
        Context context = this.LIZ;
        if (context == null || (fileY2 = C786410Ut5.y2(context, "sliver-npth")) == null) {
            return;
        }
        if (fileY2.exists() || fileY2.mkdirs()) {
            File[] fileArrListFiles = fileY2.listFiles(new FilenameFilter() { // from class: X.0VgS
                @Override // java.io.FilenameFilter
                public final boolean accept(File file, String str) {
                    return !str.endsWith(".zip");
                }
            });
            if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                for (File file : fileArrListFiles) {
                    file.delete();
                }
            }
            File[] fileArrListFiles2 = fileY2.listFiles(new FilenameFilter() { // from class: X.0VgT
                @Override // java.io.FilenameFilter
                public final boolean accept(File file2, String str) {
                    return str.endsWith(".zip");
                }
            });
            if (fileArrListFiles2 == null || fileArrListFiles2.length <= 10) {
                return;
            }
            Arrays.sort(fileArrListFiles2, new AComparatorS32S0000000_13(7));
            for (int i = 0; i < fileArrListFiles2.length - 10; i++) {
                fileArrListFiles2[i].delete();
            }
        }
    }

    @Override // X.C801770Vcl
    public final File[] LIZ(CrashType crashType) {
        File fileY2;
        try {
            String str = "";
            int i = C804010VgN.LIZ[crashType.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            str = "ANR";
                        }
                    } else {
                        str = "NATIVE";
                    }
                } else {
                    str = "JAVA";
                }
            } else {
                str = "LAUNCH";
            }
            Context context = this.LIZ;
            if (context == null || (fileY2 = C786410Ut5.y2(context, "sliver-npth")) == null) {
                return null;
            }
            if (!fileY2.exists() && !fileY2.mkdirs()) {
                return null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("trace-");
            sbLIZ.append(str);
            sbLIZ.append("-");
            sbLIZ.append(LIZJ.format(new Date()));
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(".tmp");
            C0VSJ c0vsj = new C0VSJ(fileY2, C2188811AlT.LIZIZ(sbLIZ2));
            Sliver.dumpAll(c0vsj.getAbsolutePath(), true);
            Sliver.dump(Looper.getMainLooper().getThread(), c0vsj.getAbsolutePath(), true);
            if (!c0vsj.exists()) {
                return null;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLIZIZ);
            sbLIZ3.append(".txt");
            C0VSJ c0vsj2 = new C0VSJ(fileY2, C2188811AlT.LIZIZ(sbLIZ3));
            if (c0vsj.renameTo(c0vsj2)) {
                c0vsj = c0vsj2;
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(strLIZIZ);
            sbLIZ4.append(".zip");
            C0VSJ c0vsj3 = new C0VSJ(fileY2, C2188811AlT.LIZIZ(sbLIZ4));
            try {
                C08SD.LIZJ(c0vsj3.getAbsolutePath(), c0vsj.getAbsolutePath());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            if (c0vsj3.exists()) {
                return new File[]{c0vsj3};
            }
            return new File[]{c0vsj};
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            return null;
        }
    }

    public static synchronized void LIZJ(Context context, C804050VgR c804050VgR) {
        if (LIZLLL) {
            return;
        }
        if (context != null && C786410Ut5.N3(context) != null) {
            LIZLLL = true;
            if (!Sliver.init(true)) {
                return;
            }
            if (c804050VgR.LJI) {
                Sliver.startAll(5, c804050VgR.LIZ);
            } else {
                Sliver.start(Looper.getMainLooper().getThread(), c804050VgR.LIZ, c804050VgR.LIZIZ, EnumC795650VJb.RING);
            }
            C804040VgQ c804040VgQ = LIZIZ;
            c804040VgQ.LIZ = C786410Ut5.N3(context);
            c804040VgQ.LIZIZ();
            if (c804050VgR.LIZJ) {
                Npth.registerCrashInfoCallback(c804040VgQ, CrashType.LAUNCH);
            }
            if (c804050VgR.LIZLLL) {
                Npth.registerCrashInfoCallback(c804040VgQ, CrashType.JAVA);
            }
            if (c804050VgR.LJ) {
                Npth.registerCrashInfoCallback(c804040VgQ, CrashType.NATIVE);
            }
            if (c804050VgR.LJFF) {
                Npth.registerCrashInfoCallback(c804040VgQ, CrashType.ANR);
            }
        }
    }
}
