package X;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01bO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C365201bO {
    public static final String LIZ(String str) {
        C0VSJ c0vsj = new C0VSJ(str);
        String absolutePath = "";
        if (c0vsj.exists() && c0vsj.isDirectory()) {
            File[] fileArrListFiles = c0vsj.listFiles();
            if (fileArrListFiles == null) {
                return "";
            }
            for (File file : fileArrListFiles) {
                if (file != null && file.isDirectory()) {
                    String name = file.getName();
                    File[] fileArrListFiles2 = file.listFiles();
                    if (fileArrListFiles2 != null) {
                        int length = fileArrListFiles2.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            }
                            File file2 = fileArrListFiles2[i];
                            if (file2 != null) {
                                if (file2.isFile()) {
                                    String name2 = file2.getName();
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append(name);
                                    sbLIZ.append(".png");
                                    if (Intrinsics.LJFF(name2, C2188811AlT.LIZIZ(sbLIZ))) {
                                        absolutePath = file2.getAbsolutePath();
                                        break;
                                    }
                                }
                                if (file2.isDirectory()) {
                                    name = file2.getName();
                                    File[] fileArrListFiles3 = file2.listFiles();
                                    if (fileArrListFiles3 != null) {
                                        int length2 = fileArrListFiles3.length;
                                        int i2 = 0;
                                        while (true) {
                                            if (i2 >= length2) {
                                                break;
                                            }
                                            File file3 = fileArrListFiles3[i2];
                                            if (file3 != null && file3.isFile()) {
                                                String name3 = file3.getName();
                                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                sbLIZ2.append(name);
                                                sbLIZ2.append(".png");
                                                if (Intrinsics.LJFF(name3, C2188811AlT.LIZIZ(sbLIZ2))) {
                                                    absolutePath = file3.getAbsolutePath();
                                                    break;
                                                }
                                            }
                                            i2++;
                                        }
                                    }
                                }
                            }
                            i++;
                        }
                    }
                }
            }
        }
        return absolutePath;
    }
}
