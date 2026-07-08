package X;

import android.content.Context;
import android.os.FileObserver;
import android.os.Process;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: renamed from: X.0Ve8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C802620Ve8 {
    public boolean LIZ;
    public final FileObserverC802940Vee LIZIZ;
    public final Context LIZJ;
    public final C0VSJ LIZLLL;
    public C802670VeD LJ;

    public static long LIZJ(String str) {
        String[] strArrSplit = str.split("_");
        if (strArrSplit.length == 4) {
            try {
                return Long.decode(strArrSplit[1]).longValue();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return System.currentTimeMillis();
    }

    public static int LIZLLL(String str) {
        String[] strArrSplit = str.split("_");
        if (strArrSplit.length == 4) {
            try {
                return Integer.decode(strArrSplit[2]).intValue();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return 0;
            }
        }
        return 0;
    }

    public final void LJ(C0VSJ c0vsj) {
        File[] fileArrListFiles;
        if (this.LIZLLL.exists() && (fileArrListFiles = this.LIZLLL.listFiles(new C803510VfZ())) != null) {
            for (File file : fileArrListFiles) {
                try {
                    int iLIZLLL = LIZLLL(file.getName());
                    long jLIZJ = LIZJ(file.getName());
                    if (iLIZLLL != 0 && jLIZJ != 0) {
                        StringBuffer stringBuffer = new StringBuffer();
                        File fileLIZ = LIZ(c0vsj, jLIZJ, iLIZLLL, stringBuffer);
                        if (fileLIZ == null) {
                            file.delete();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Not found matched directory pid:");
                            sbLIZ.append(iLIZLLL);
                            sbLIZ.append("_");
                            sbLIZ.append(file.getName());
                            sbLIZ.append("_:reason:");
                            sbLIZ.append((Object) stringBuffer);
                            C802700VeG.LIZJ(new Exception(C2188811AlT.LIZIZ(sbLIZ)));
                        } else {
                            file.renameTo(new C0VSJ(fileLIZ, "anr_info.txt"));
                        }
                    } else {
                        file.delete();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Invalid ANR Info File Name :{");
                        sbLIZ2.append(file.getName());
                        sbLIZ2.append("}");
                        C802700VeG.LIZJ(new Exception(C2188811AlT.LIZIZ(sbLIZ2)));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C801940Vd2.LIZLLL("NPTH_ANR_ERROR", th);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0Vee] */
    public C802620Ve8(Context context, C0VSJ c0vsj) {
        this.LIZJ = context;
        C0VSJ c0vsjLIZIZ = C2112008Pe.LIZIZ(c0vsj, "anr_info");
        this.LIZLLL = c0vsjLIZIZ;
        final String absolutePath = c0vsjLIZIZ.getAbsolutePath();
        this.LIZIZ = new FileObserver(absolutePath) { // from class: X.0Vee
            public final C0VSJ LIZ;

            {
                super(absolutePath, 264);
                this.LIZ = new C0VSJ(absolutePath);
            }

            @Override // android.os.FileObserver
            public final void onEvent(int i, String str) {
                if ((i & 8) != 0 && str.startsWith("ai_") && C802620Ve8.LIZLLL(str) == Process.myPid() && str.endsWith("_other")) {
                    C802430Vdp.LIZIZ(new C0VSJ(this.LIZ, str), C802620Ve8.LIZJ(str));
                }
            }
        };
    }

    public static String LIZIZ(int i, long j, boolean z) {
        String str;
        if (z) {
            str = "_current";
        } else {
            str = "_other";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ai_");
        sbLIZ.append(j);
        sbLIZ.append("_");
        sbLIZ.append(i);
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static File LIZ(C0VSJ c0vsj, long j, final long j2, StringBuffer stringBuffer) {
        long j3;
        long j4;
        File[] fileArrListFiles = c0vsj.listFiles(new FilenameFilter() { // from class: X.08Ae
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("-");
                sbLIZ.append(j2);
                return str.endsWith(C2188811AlT.LIZIZ(sbLIZ));
            }
        });
        if (fileArrListFiles != null && fileArrListFiles.length != 0) {
            int length = fileArrListFiles.length;
            char c = 0;
            int i = 0;
            while (i < length) {
                File file = fileArrListFiles[i];
                if (file.isDirectory()) {
                    String[] strArrSplit = file.getName().split("-");
                    if (strArrSplit.length == 2) {
                        try {
                            j3 = CastLongProtector.parseLong(strArrSplit[c]);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            j3 = 0;
                        }
                        if (j3 != 0 && j3 <= j) {
                            File[] fileArrListFiles2 = file.listFiles();
                            if (fileArrListFiles2 == null) {
                                stringBuffer.append("crashDirs is null ");
                            } else {
                                for (File file2 : fileArrListFiles2) {
                                    if (!file2.isDirectory()) {
                                        stringBuffer.append("crashDirs is not directory ");
                                    } else {
                                        String str = C802440Vdq.LLIZLLLIL;
                                        if (!new C0VSJ(file2, C802440Vdq.LLIZLLLIL).exists()) {
                                            stringBuffer.append("hasSummaryFile is false ");
                                        } else if (new C0VSJ(file2, "anr_info.txt").exists()) {
                                            stringBuffer.append("anrinfo exist:");
                                        } else {
                                            try {
                                                j4 = CastLongProtector.parseLong(file2.getName());
                                                if (j4 != 0 && Math.abs(j4 - j) <= 35000) {
                                                    return file2;
                                                }
                                            } catch (Throwable th2) {
                                                TryCatchGuardChecker.doCheck(th2);
                                                j4 = 0;
                                            }
                                            stringBuffer.append("last error:" + j4 + "_" + j);
                                        }
                                    }
                                }
                            }
                        } else {
                            stringBuffer.append("startTime:" + j3 + "_" + j);
                        }
                    } else {
                        continue;
                    }
                }
                i++;
                c = 0;
            }
            return null;
        }
        stringBuffer.append("processDirs==null");
        return null;
    }
}
