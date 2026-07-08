package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.PrintStream;
import java.util.zip.CRC32;
import java.util.zip.CheckedOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* JADX INFO: renamed from: X.08SC, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08SC {
    public static final /* synthetic */ int LIZ = 0;

    public static File LIZJ(Context context) {
        File fileY2 = null;
        if (context == null) {
            return null;
        }
        try {
            fileY2 = C786410Ut5.y2(context, null);
            do {
                fileY2 = fileY2.getParentFile();
            } while (fileY2.getAbsolutePath().contains("/Android"));
            return fileY2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return fileY2;
        }
    }

    public static long LIZLLL(File file) {
        long jLIZLLL = -1;
        if (!file.exists()) {
            return -1L;
        }
        if (file.isFile()) {
            return file.length();
        }
        if (file.isDirectory()) {
            jLIZLLL = 0;
            for (File file2 : file.listFiles()) {
                jLIZLLL += LIZLLL(file2);
            }
        }
        return jLIZLLL;
    }

    public static void LIZIZ(String str, String... strArr) throws Throwable {
        CheckedOutputStream checkedOutputStream;
        C0VSV c0vsv;
        Closeable closeable;
        try {
            try {
                c0vsv = new C0VSV(new C0VSJ(str));
                try {
                    checkedOutputStream = new CheckedOutputStream(c0vsv, new CRC32());
                } catch (Exception e) {
                    e = e;
                } catch (Throwable th) {
                    th = th;
                    checkedOutputStream = null;
                    closeable = null;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        } catch (Throwable th3) {
            th = th3;
            checkedOutputStream = null;
            c0vsv = null;
            closeable = null;
        }
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(checkedOutputStream);
            try {
                for (String str2 : strArr) {
                    C0VSJ c0vsj = new C0VSJ(str2);
                    if (c0vsj.exists()) {
                        LIZ(c0vsj, "", zipOutputStream);
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str2);
                        sbLIZ.append("not exist！");
                        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
                C1971107np.LIZ(zipOutputStream);
                C1971107np.LIZ(checkedOutputStream);
                C1971107np.LIZ(c0vsv);
            } catch (Exception e3) {
                e = e3;
                TryCatchGuardChecker.doCheck(e);
                throw new RuntimeException(e);
            }
        } catch (Exception e4) {
            e = e4;
        } catch (Throwable th4) {
            th = th4;
            closeable = null;
            TryCatchGuardChecker.doCheck(th);
            C1971107np.LIZ(closeable);
            C1971107np.LIZ(checkedOutputStream);
            C1971107np.LIZ(c0vsv);
            throw th;
        }
    }

    public static void LIZ(File file, String str, ZipOutputStream zipOutputStream) throws Throwable {
        C0VSP c0vsp;
        BufferedInputStream bufferedInputStream;
        C0VSP c0vsp2;
        File[] fileArrListFiles;
        if (file.isDirectory()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(file.getName());
            sbLIZ.append(File.separator);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (file.exists() && (fileArrListFiles = file.listFiles()) != null) {
                for (File file2 : fileArrListFiles) {
                    LIZ(file2, strLIZIZ, zipOutputStream);
                }
                return;
            }
            return;
        }
        PrintStream printStream = System.out;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("compress：");
        sbLIZ2.append(str);
        sbLIZ2.append(file.getName());
        printStream.println(C2188811AlT.LIZIZ(sbLIZ2));
        if (file.exists()) {
            BufferedInputStream bufferedInputStream2 = null;
            BufferedInputStream bufferedInputStream3 = null;
            bufferedInputStream2 = null;
            C0VSP c0vsp3 = null;
            try {
                try {
                    c0vsp2 = new C0VSP(file);
                    try {
                        bufferedInputStream = new BufferedInputStream(c0vsp2);
                    } catch (Exception e) {
                        e = e;
                    }
                } catch (Throwable th) {
                    th = th;
                    TryCatchGuardChecker.doCheck(th);
                    C1971107np.LIZ(bufferedInputStream2);
                    C1971107np.LIZ(c0vsp);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                bufferedInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                c0vsp = null;
                TryCatchGuardChecker.doCheck(th);
                C1971107np.LIZ(bufferedInputStream2);
                C1971107np.LIZ(c0vsp);
                throw th;
            }
            try {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(str);
                sbLIZ3.append(file.getName());
                zipOutputStream.putNextEntry(new ZipEntry(C2188811AlT.LIZIZ(sbLIZ3)));
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = bufferedInputStream.read(bArr, 0, 8192);
                    if (i != -1) {
                        zipOutputStream.write(bArr, 0, i);
                    } else {
                        C1971107np.LIZ(bufferedInputStream);
                        C1971107np.LIZ(c0vsp2);
                        return;
                    }
                }
            } catch (Exception e3) {
                e = e3;
                bufferedInputStream3 = bufferedInputStream;
                bufferedInputStream = bufferedInputStream3;
                c0vsp3 = c0vsp2;
                try {
                    TryCatchGuardChecker.doCheck(e);
                    throw new RuntimeException(e);
                } catch (Throwable th3) {
                    th = th3;
                    c0vsp = c0vsp3;
                    bufferedInputStream2 = bufferedInputStream;
                    TryCatchGuardChecker.doCheck(th);
                    C1971107np.LIZ(bufferedInputStream2);
                    C1971107np.LIZ(c0vsp);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                c0vsp3 = c0vsp2;
                c0vsp = c0vsp3;
                bufferedInputStream2 = bufferedInputStream;
                TryCatchGuardChecker.doCheck(th);
                C1971107np.LIZ(bufferedInputStream2);
                C1971107np.LIZ(c0vsp);
                throw th;
            }
        }
    }

    public static boolean LJ(C0VSP c0vsp, String str, String str2) throws Throwable {
        C0VSV c0vsv = null;
        try {
            try {
                C0VSJ c0vsj = new C0VSJ(str);
                if (!c0vsj.exists() && !c0vsj.mkdirs()) {
                    C1971107np.LIZ(c0vsp);
                    return false;
                }
                C0VSV c0vsv2 = new C0VSV(new C0VSJ(c0vsj, str2));
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = c0vsp.read(bArr);
                        if (i != -1) {
                            c0vsv2.write(bArr, 0, i);
                        } else {
                            c0vsv2.flush();
                            c0vsv2.close();
                            c0vsp.close();
                            C1971107np.LIZ(c0vsp);
                            return true;
                        }
                    }
                } catch (Exception e) {
                    e = e;
                    c0vsv = c0vsv2;
                } catch (Throwable th) {
                    th = th;
                    c0vsv = c0vsv2;
                    TryCatchGuardChecker.doCheck(th);
                    C1971107np.LIZ(c0vsv);
                    C1971107np.LIZ(c0vsp);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
            TryCatchGuardChecker.doCheck(e);
            C1971107np.LIZ(c0vsv);
            C1971107np.LIZ(c0vsp);
            return false;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
