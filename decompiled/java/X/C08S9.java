package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* JADX INFO: renamed from: X.08S9, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08S9 {
    public static void LIZ(File file, C0VSJ c0vsj) throws Throwable {
        C0VSV c0vsv;
        ZipOutputStream zipOutputStream;
        C0VSP c0vsp;
        byte[] bArr;
        C0VSP c0vsp2 = null;
        try {
            try {
                try {
                    c0vsv = new C0VSV(c0vsj);
                    try {
                        zipOutputStream = new ZipOutputStream(c0vsv);
                        try {
                            c0vsp = new C0VSP(file);
                        } catch (Exception e) {
                            e = e;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        zipOutputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        zipOutputStream = null;
                    }
                } catch (IOException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    return;
                }
            } catch (Exception e4) {
                e = e4;
                zipOutputStream = null;
                c0vsv = null;
            } catch (Throwable th2) {
                th = th2;
                zipOutputStream = null;
                c0vsv = null;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            zipOutputStream.putNextEntry(new ZipEntry(file.getName()));
            bArr = new byte[1024];
        } catch (Exception e5) {
            e = e5;
            c0vsp2 = c0vsp;
            TryCatchGuardChecker.doCheck(e);
            if (c0vsp2 != null) {
                c0vsp2.close();
            }
            if (zipOutputStream != null) {
                zipOutputStream.close();
            }
            if (c0vsv == null) {
                return;
            }
        } catch (Throwable th4) {
            th = th4;
            c0vsp2 = c0vsp;
            TryCatchGuardChecker.doCheck(th);
            if (c0vsp2 != null) {
                try {
                    c0vsp2.close();
                } catch (IOException e6) {
                    TryCatchGuardChecker.doCheck(e6);
                    throw th;
                }
            }
            if (zipOutputStream != null) {
                zipOutputStream.close();
            }
            if (c0vsv != null) {
                c0vsv.close();
                throw th;
            }
            throw th;
        }
        while (true) {
            int i = c0vsp.read(bArr);
            if (i <= 0) {
                break;
            } else {
                zipOutputStream.write(bArr, 0, i);
            }
            c0vsv.close();
        }
        zipOutputStream.closeEntry();
        c0vsp.close();
        zipOutputStream.close();
        c0vsv.close();
    }
}
