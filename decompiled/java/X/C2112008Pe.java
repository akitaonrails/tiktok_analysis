package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: X.08Pe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2112008Pe {
    public static void LIZ(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static void LIZJ(File file) {
        try {
            if (!file.exists()) {
                file.mkdirs();
            } else if (!file.isDirectory()) {
                file.delete();
                file.mkdirs();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJ(File file) {
        File[] fileArrListFiles;
        if (file.exists()) {
            if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                for (File file2 : fileArrListFiles) {
                    LJ(file2);
                }
            }
            try {
                C08SE.LIZIZ(file);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static String LJFF(File file) {
        C0VSP c0vsp;
        if (file.exists() && !file.isDirectory()) {
            int length = (int) file.length();
            byte[] bArr = new byte[length];
            try {
                c0vsp = new C0VSP(file);
                try {
                    String str = new String(bArr, 0, c0vsp.read(bArr, 0, length));
                    try {
                        c0vsp.close();
                        return str;
                    } catch (IOException e) {
                        TryCatchGuardChecker.doCheck(e);
                        return str;
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        if (c0vsp != null) {
                            try {
                                c0vsp.close();
                                return null;
                            } catch (IOException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                            }
                        }
                        return null;
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        if (c0vsp != null) {
                            try {
                                c0vsp.close();
                                throw th2;
                            } catch (IOException e3) {
                                TryCatchGuardChecker.doCheck(e3);
                                throw th2;
                            }
                        }
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                c0vsp = null;
            }
        }
        return null;
    }

    public static void LJI(String str) {
        try {
            Class<?> cls = Integer.TYPE;
            C2204961BRm.a0(Class.forName("android.os.FileUtils").getMethod("setPermissions", String.class, cls, cls, cls), null, new Object[]{str, 493, -1, -1}, new C0WZX("dzBzEgAjS8/YVFkiQFyHdNRwud8ndmm3vkaceRWTyvw5kPdiaFWssQ==", null));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static C0VSJ LIZIZ(File file, String str) {
        C0VSJ c0vsj = new C0VSJ(file, str);
        LIZJ(c0vsj);
        return c0vsj;
    }

    public static C0VSJ LIZLLL(File file, String str) {
        C0VSJ c0vsj = new C0VSJ(file, str);
        if (c0vsj.isDirectory()) {
            LJ(c0vsj);
        }
        try {
            if (!c0vsj.exists()) {
                c0vsj.createNewFile();
                return c0vsj;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return c0vsj;
    }

    public static void LJII(C0VSJ c0vsj, String str) {
        try {
            C08SE.LJIIIIZZ(c0vsj, str, false);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
