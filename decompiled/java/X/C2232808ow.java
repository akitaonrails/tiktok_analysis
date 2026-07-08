package X;

import java.io.File;

/* JADX INFO: renamed from: X.08ow, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2232808ow {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(File file, C0VSJ c0vsj) throws Throwable {
        if (file.isDirectory()) {
            C08QA.LJIILL(file, c0vsj, true, 4);
            return;
        }
        File parentFile = c0vsj.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        C08QA.LJIILLIIL(file, c0vsj, true, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.C0229005r r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.Integer r14, java.lang.String r15, java.lang.String r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2232808ow.LIZIZ(X.005r, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String):void");
    }
}
