package X;

import java.io.File;

/* JADX INFO: renamed from: X.0krb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1335730krb {
    public static void LIZ(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                LIZIZ(file2);
            }
        }
    }

    public static boolean LIZIZ(File file) {
        if (file.isDirectory()) {
            LIZ(file);
        }
        return file.delete();
    }

    public static void LIZJ(File file, InterfaceC1335750krd interfaceC1335750krd) {
        interfaceC1335750krd.LIZ(file);
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    LIZJ(file2, interfaceC1335750krd);
                } else {
                    interfaceC1335750krd.LIZIZ(file2);
                }
            }
        }
        interfaceC1335750krd.LIZJ(file);
    }
}
