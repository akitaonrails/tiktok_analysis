package X;

import java.io.File;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.01bi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C367201bi {
    public static String LIZ;
    public static String LIZIZ = "/client_ai/lang/";

    public static boolean LIZ() {
        return LIZ != null && new C0VSJ(LIZ).exists();
    }

    public static C0VSJ LIZIZ(String str) {
        File parentFile;
        if (!LIZ()) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZ);
        sbLIZ.append(File.separator);
        sbLIZ.append(LIZIZ);
        sbLIZ.append(str);
        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
        File parentFile2 = c0vsj.getParentFile();
        if ((parentFile2 != null && parentFile2.exists()) || (parentFile = c0vsj.getParentFile()) == null) {
            return c0vsj;
        }
        parentFile.mkdirs();
        return c0vsj;
    }

    public static void LIZJ(String str) {
        LIZ = str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZ);
        sbLIZ.append(LIZIZ);
        new C0VSJ(C2188811AlT.LIZIZ(sbLIZ)).mkdirs();
    }

    public static boolean LIZLLL(Long l, String str) {
        if (a0.LJJJIL(str) || !LIZ()) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LIZ);
        sbLIZ.append(LIZIZ);
        sbLIZ.append(str);
        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
        if (l != null) {
            if (!c0vsj.exists() || c0vsj.length() != l.longValue()) {
                return false;
            }
            return true;
        }
        return c0vsj.exists();
    }
}
