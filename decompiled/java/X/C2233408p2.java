package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* JADX INFO: renamed from: X.08p2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2233408p2 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(File file) throws IOException {
        if (!file.exists()) {
            return true;
        }
        if (file.isFile()) {
            return file.delete();
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return file.delete();
        }
        C089E c089e = new C089E(fileArrListFiles);
        while (c089e.hasNext()) {
            File file2 = (File) c089e.next();
            if (!LIZ(file2)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Failed to delete sub-file: ");
                sbLIZ.append(file2.getAbsolutePath());
                throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        if (file.delete()) {
            return true;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Failed to delete directory: ");
        sbLIZ2.append(file.getAbsolutePath());
        throw new IOException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static AbstractC2233208p0 LIZIZ(String str, String str2) {
        AbstractC2233208p0 abstractC2233208p0LIZJ;
        Throwable th = null;
        if (str2 == null) {
            return new C2233308p1("Path is null", null);
        }
        C0VSJ c0vsj = new C0VSJ(str2);
        if (!c0vsj.exists()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Input file or directory does not exist: ");
            sbLIZ.append(str2);
            return new C2233308p1(C2188811AlT.LIZIZ(sbLIZ), null);
        }
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new C0VSV(str));
            try {
                int i = 0;
                if (!c0vsj.isFile()) {
                    File[] fileArrListFiles = c0vsj.listFiles();
                    if (fileArrListFiles == null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Failed to list files in directory: ");
                        sbLIZ2.append(str2);
                        C2233308p1 c2233308p1 = new C2233308p1(C2188811AlT.LIZIZ(sbLIZ2), null);
                        C2107108Nh.LIZ(zipOutputStream, null);
                        return c2233308p1;
                    }
                    int length = fileArrListFiles.length;
                    int i2 = 0;
                    while (i < length) {
                        AbstractC2233208p0 abstractC2233208p0LIZJ2 = LIZJ(fileArrListFiles[i], "", zipOutputStream);
                        if (!(abstractC2233208p0LIZJ2 instanceof C2233308p1)) {
                            i++;
                            i2 = 1;
                        } else {
                            C2107108Nh.LIZ(zipOutputStream, null);
                            return abstractC2233208p0LIZJ2;
                        }
                    }
                    abstractC2233208p0LIZJ = C2233508p3.LIZ;
                    i = i2;
                } else {
                    abstractC2233208p0LIZJ = LIZJ(c0vsj, "", zipOutputStream);
                }
                zipOutputStream.flush();
                if (i == 0) {
                    C0VSJ c0vsj2 = new C0VSJ(str);
                    if (c0vsj2.exists()) {
                        LIZ(c0vsj2);
                    }
                    C2233308p1 c2233308p12 = new C2233308p1("Zipping completed, but no files were added.", null);
                    C2107108Nh.LIZ(zipOutputStream, null);
                    return c2233308p12;
                }
                C2107108Nh.LIZ(zipOutputStream, null);
                return abstractC2233208p0LIZJ;
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
                                C2107108Nh.LIZ(zipOutputStream, th);
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
        } catch (Throwable th6) {
            TryCatchGuardChecker.doCheck(th6);
            C201955140j.LJIIIZ(C339800DTu.LIZIZ, "ZipUtils", "Exception during zip process at top level", th6);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(C13LE.LIZ(th6.getClass()).LIZLLL());
            sbLIZ3.append(": ");
            sbLIZ3.append(th6.getMessage());
            sbLIZ3.append(" Exception during zip process at top level");
            return new C2233308p1(C2188811AlT.LIZIZ(sbLIZ3), th6);
        }
    }

    public static AbstractC2233208p0 LIZJ(File file, String str, ZipOutputStream zipOutputStream) {
        try {
            Throwable th = null;
            if (file.isFile()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(file.getName());
                zipOutputStream.putNextEntry(new ZipEntry(C2188811AlT.LIZIZ(sbLIZ)));
                C0VSP c0vsp = new C0VSP(file);
                try {
                    byte[] bArr = new byte[1024];
                    for (int i = c0vsp.read(bArr); i > 0; i = c0vsp.read(bArr)) {
                        zipOutputStream.write(bArr, 0, i);
                    }
                    C2107108Nh.LIZ(c0vsp, null);
                    return C2233508p3.LIZ;
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
                                    C2107108Nh.LIZ(c0vsp, th);
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
            } else {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles == null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Failed to list directory: ");
                    sbLIZ2.append(file.getAbsolutePath());
                    return new C2233308p1(C2188811AlT.LIZIZ(sbLIZ2), null);
                }
                for (File file2 : fileArrListFiles) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(str);
                    sbLIZ3.append(file.getName());
                    sbLIZ3.append(File.separator);
                    AbstractC2233208p0 abstractC2233208p0LIZJ = LIZJ(file2, C2188811AlT.LIZIZ(sbLIZ3), zipOutputStream);
                    if (abstractC2233208p0LIZJ instanceof C2233308p1) {
                        return abstractC2233208p0LIZJ;
                    }
                }
                return C2233508p3.LIZ;
            }
        } catch (Throwable th6) {
            TryCatchGuardChecker.doCheck(th6);
            C339800DTu c339800DTu = C339800DTu.LIZIZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("Exception zipping ");
            sbLIZ4.append(file.getAbsolutePath());
            C201955140j.LJIIIZ(c339800DTu, "ZipUtils", C2188811AlT.LIZIZ(sbLIZ4), th6);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(C13LE.LIZ(th6.getClass()).LIZLLL());
            sbLIZ5.append(": ");
            sbLIZ5.append(th6.getMessage());
            sbLIZ5.append(" Exception zipping ");
            sbLIZ5.append(file.getAbsolutePath());
            return new C2233308p1(C2188811AlT.LIZIZ(sbLIZ5), th6);
        }
    }
}
