package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.util.zip.CRC32;
import java.util.zip.CheckedOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* JADX INFO: renamed from: X.08SD, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08SD {
    public static void LIZ(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static void LIZJ(String str, String... strArr) throws Throwable {
        CheckedOutputStream checkedOutputStream;
        C0VSV c0vsv;
        try {
            try {
                c0vsv = new C0VSV(new C0VSJ(str));
                try {
                    checkedOutputStream = new CheckedOutputStream(c0vsv, new CRC32());
                    try {
                        ZipOutputStream zipOutputStream = new ZipOutputStream(checkedOutputStream);
                        try {
                            for (String str2 : strArr) {
                                C0VSJ c0vsj = new C0VSJ(str2);
                                if (c0vsj.exists()) {
                                    LIZIZ(c0vsj, "", zipOutputStream);
                                } else {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append(str2);
                                    sbLIZ.append(" does not exist!");
                                    throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
                                }
                            }
                            LIZ(zipOutputStream);
                            LIZ(checkedOutputStream);
                            LIZ(c0vsv);
                        } catch (Exception e) {
                            e = e;
                            TryCatchGuardChecker.doCheck(e);
                            throw new RuntimeException(e);
                        }
                    } catch (Exception e2) {
                        e = e2;
                        TryCatchGuardChecker.doCheck(e);
                        throw new RuntimeException(e);
                    } catch (Throwable th) {
                        th = th;
                        TryCatchGuardChecker.doCheck(th);
                        LIZ(null);
                        LIZ(checkedOutputStream);
                        LIZ(c0vsv);
                        throw th;
                    }
                } catch (Exception e3) {
                    e = e3;
                } catch (Throwable th2) {
                    th = th2;
                    checkedOutputStream = null;
                }
            } catch (Throwable th3) {
                th = th3;
                TryCatchGuardChecker.doCheck(th);
                LIZ(null);
                LIZ(checkedOutputStream);
                LIZ(c0vsv);
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
        } catch (Throwable th4) {
            th = th4;
            checkedOutputStream = null;
            c0vsv = null;
        }
    }

    public static void LIZIZ(File file, String str, ZipOutputStream zipOutputStream) throws Throwable {
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
                    LIZIZ(file2, strLIZIZ, zipOutputStream);
                }
                return;
            }
            return;
        }
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
                    LIZ(bufferedInputStream2);
                    LIZ(c0vsp);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                bufferedInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                c0vsp = null;
                TryCatchGuardChecker.doCheck(th);
                LIZ(bufferedInputStream2);
                LIZ(c0vsp);
                throw th;
            }
            try {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str);
                sbLIZ2.append(file.getName());
                zipOutputStream.putNextEntry(new ZipEntry(C2188811AlT.LIZIZ(sbLIZ2)));
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = bufferedInputStream.read(bArr, 0, 8192);
                    if (i != -1) {
                        zipOutputStream.write(bArr, 0, i);
                    } else {
                        LIZ(bufferedInputStream);
                        LIZ(c0vsp2);
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
                    LIZ(bufferedInputStream2);
                    LIZ(c0vsp);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                c0vsp3 = c0vsp2;
                c0vsp = c0vsp3;
                bufferedInputStream2 = bufferedInputStream;
                TryCatchGuardChecker.doCheck(th);
                LIZ(bufferedInputStream2);
                LIZ(c0vsp);
                throw th;
            }
        }
    }
}
