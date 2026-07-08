package X;

import com.bytedance.tailor.Tailor;
import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: renamed from: X.08nN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2223108nN {
    /* JADX WARN: Removed duplicated region for block: B:19:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.io.File LIZIZ() {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2223108nN.LIZIZ():java.io.File");
    }

    public static void LIZ(File file) {
        File[] fileArrListFiles;
        if (file == null) {
            return;
        }
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                LIZ(file2);
            }
        }
        file.delete();
    }

    public static void LIZJ(File file, boolean z, boolean z2) {
        File[] fileArrListFiles = file.listFiles(new FilenameFilter() { // from class: X.08nP
            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str) {
                return str.endsWith(".hprof");
            }
        });
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (z) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("shrinkAndCompressHprofFile hprofFile:");
                    sbLIZ.append(file2.getAbsolutePath());
                    C2223208nO.LIZ("MemDump", C2188811AlT.LIZIZ(sbLIZ));
                }
                String path = file2.getPath();
                if (!Tailor.isHprofValid(path)) {
                    file2.delete();
                    if (z) {
                        C2223208nO.LIZ("MemDump", "hprof is not valid");
                    }
                } else if (z2) {
                    String strReplace = file2.getName().replace(".hprof", ".temp");
                    C0VSJ c0vsj = new C0VSJ(file, strReplace);
                    C08S9.LIZ(file2, c0vsj);
                    C0VSJ c0vsj2 = new C0VSJ(file, strReplace.replace(".temp", ".zip"));
                    if (!c0vsj2.exists() && c0vsj.exists() && c0vsj.renameTo(c0vsj2)) {
                        file2.delete();
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("compression hprof success length(M):");
                    sbLIZ2.append((c0vsj2.length() / 1024) / 1024);
                    sbLIZ2.append(" path:");
                    sbLIZ2.append(c0vsj2.getAbsolutePath());
                    C2223208nO.LIZ("MemDump", C2188811AlT.LIZIZ(sbLIZ2));
                } else {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(file2.getParent());
                    sbLIZ3.append("/.mini.hprof");
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                    C0VSJ c0vsj3 = new C0VSJ(strLIZIZ);
                    if (!c0vsj3.exists()) {
                        Tailor.tailorHprof(path, strLIZIZ);
                    }
                    if (c0vsj3.exists() && !path.equalsIgnoreCase(strLIZIZ)) {
                        file2.delete();
                        String strReplace2 = file2.getName().replace(".hprof", ".temp");
                        C0VSJ c0vsj4 = new C0VSJ(file, strReplace2);
                        C08S9.LIZ(c0vsj3, c0vsj4);
                        C0VSJ c0vsj5 = new C0VSJ(file, strReplace2.replace(".temp", ".zip"));
                        if (!c0vsj5.exists() && c0vsj4.exists() && c0vsj4.renameTo(c0vsj5)) {
                            c0vsj3.delete();
                        }
                        if (z) {
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("shrink and compression hprof success length(M):");
                            sbLIZ4.append((c0vsj5.length() / 1024) / 1024);
                            sbLIZ4.append(" path:");
                            sbLIZ4.append(c0vsj5.getAbsolutePath());
                            C2223208nO.LIZ("MemDump", C2188811AlT.LIZIZ(sbLIZ4));
                        }
                    } else {
                        if (z) {
                            C2223208nO.LIZ("MemDump", "shrink hprof failed");
                        }
                        C2406109bn.LIZ().LIZ(4, 0L, false);
                    }
                }
            }
        }
    }
}
