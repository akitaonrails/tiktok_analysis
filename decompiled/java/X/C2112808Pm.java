package X;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: X.08Pm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2112808Pm {
    public static final C2112808Pm LIZ = new C2112808Pm();
    public static final List<String> LIZIZ;

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C786410Ut5.W3().getPath());
        sbLIZ.append("/VESDK_Demo/");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append("veimage/");
        C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(strLIZIZ);
        sbLIZ3.append("resource/");
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(strLIZIZ2);
        sbLIZ4.append("filter/");
        C2188811AlT.LIZIZ(sbLIZ4);
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append(strLIZIZ2);
        sbLIZ5.append("stickers/");
        C2188811AlT.LIZIZ(sbLIZ5);
        LIZIZ = new ArrayList();
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append(strLIZIZ);
        sbLIZ6.append("object_tracking/");
        C2188811AlT.LIZIZ(sbLIZ6);
        new ArrayList();
        new Formatter(new StringBuilder(), Locale.getDefault());
        int i = 1;
        while (true) {
            List<String> list = LIZIZ;
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("Filter_0");
            sbLIZ7.append(i);
            ((ArrayList) list).add(C2188811AlT.LIZIZ(sbLIZ7));
            while (true) {
                i++;
                if (i >= 20) {
                    return;
                }
                if (i >= 10) {
                    List<String> list2 = LIZIZ;
                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                    sbLIZ8.append("Filter_");
                    sbLIZ8.append(i);
                    ((ArrayList) list2).add(C2188811AlT.LIZIZ(sbLIZ8));
                }
            }
        }
    }

    public static boolean LIZJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C0VSJ c0vsj = new C0VSJ(str);
        if (!c0vsj.exists() || c0vsj.length() <= 0) {
            return false;
        }
        return true;
    }

    public static void LIZLLL(String str) {
        File parentFile;
        C0VSJ c0vsj = new C0VSJ(str);
        if (c0vsj.exists()) {
            c0vsj.delete();
        }
        File parentFile2 = c0vsj.getParentFile();
        if (parentFile2 != null && !parentFile2.exists() && (parentFile = c0vsj.getParentFile()) != null) {
            parentFile.mkdirs();
        }
        c0vsj.createNewFile();
    }

    public static final String LJ(String str) {
        try {
            C0VSJ c0vsj = new C0VSJ(str);
            C0VSF c0vsf = new C0VSF(c0vsj);
            InputStreamReader inputStreamReader = new InputStreamReader(new C0VSP(c0vsj), "utf-8");
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                int i = inputStreamReader.read();
                if (i != -1) {
                    stringBuffer.append((char) i);
                } else {
                    c0vsf.close();
                    inputStreamReader.close();
                    return stringBuffer.toString();
                }
            }
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static void LJFF(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static void LIZ(String str, String str2) throws Throwable {
        C0VSP c0vsp;
        C0VSV c0vsv;
        C2112808Pm c2112808Pm = LIZ;
        C0VSV c0vsv2 = null;
        C0VSV c0vsv3 = null;
        c0vsv2 = null;
        C0VSP c0vsp2 = null;
        try {
            c0vsp = new C0VSP(new C0VSJ(str));
            try {
                c0vsv = new C0VSV(new C0VSJ(str2));
            } catch (Exception e) {
                e = e;
            } catch (Throwable th) {
                th = th;
            }
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = c0vsp.read(bArr);
                    if (i <= 0) {
                        break;
                    } else {
                        c0vsv.write(bArr, 0, i);
                    }
                }
                LJFF(c0vsp);
            } catch (Exception e2) {
                e = e2;
                c0vsv3 = c0vsv;
                c0vsv = c0vsv3;
                c0vsp2 = c0vsp;
                try {
                    TryCatchGuardChecker.doCheck(e);
                    LJFF(c0vsp2);
                } catch (Throwable th2) {
                    th = th2;
                    c0vsp = c0vsp2;
                    c0vsv2 = c0vsv;
                    while (true) {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            c2112808Pm.getClass();
                            LJFF(c0vsp);
                            LJFF(c0vsv2);
                            throw th;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                c0vsv2 = c0vsv;
                while (true) {
                    TryCatchGuardChecker.doCheck(th);
                    c2112808Pm.getClass();
                    LJFF(c0vsp);
                    LJFF(c0vsv2);
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            c0vsv = null;
        } catch (Throwable th5) {
            th = th5;
            c0vsp = null;
        }
        LJFF(c0vsv);
    }

    public static void LIZIZ(String str, String str2) throws Exception {
        C0VSJ c0vsj = new C0VSJ(str);
        C0VSJ c0vsj2 = new C0VSJ(str2);
        if (c0vsj.exists()) {
            if (c0vsj.isDirectory()) {
                if (!c0vsj2.exists()) {
                    c0vsj2.mkdirs();
                }
                if (c0vsj2.isDirectory()) {
                    File[] fileArrListFiles = c0vsj.listFiles();
                    if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                        C089E c089e = new C089E(fileArrListFiles);
                        while (c089e.hasNext()) {
                            File file = (File) c089e.next();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(c0vsj2);
                            sbLIZ.append(File.separator);
                            sbLIZ.append(file.getName());
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            if (file.isDirectory()) {
                                LIZIZ(file.getAbsolutePath(), strLIZIZ);
                            } else {
                                BufferedInputStream bufferedInputStream = new BufferedInputStream(new C0VSP(file));
                                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new C0VSV(strLIZIZ));
                                byte[] bArr = new byte[1024];
                                while (true) {
                                    int i = bufferedInputStream.read(bArr);
                                    if (i == -1) {
                                        break;
                                    } else {
                                        bufferedOutputStream.write(bArr, 0, i);
                                    }
                                }
                                bufferedOutputStream.close();
                                bufferedInputStream.close();
                            }
                        }
                        return;
                    }
                    return;
                }
                throw new Exception("targetFile not exists");
            }
            throw new Exception("sourceFileis Directory not exists");
        }
        throw new Exception("sourceFile not exists");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.graphics.Bitmap] */
    public static final boolean LJI(Bitmap bitmap, File file, Bitmap.CompressFormat compressFormat) throws Throwable {
        C0VSV c0vsv;
        if (bitmap == 0 || file == null) {
            return false;
        }
        ?? byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(compressFormat, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        C0VSV c0vsv2 = null;
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            try {
                c0vsv = new C0VSV(file);
            } catch (IOException e) {
                e = e;
            }
            try {
                c0vsv.write(byteArray);
                c0vsv.flush();
                LJFF(c0vsv);
                return true;
            } catch (IOException e2) {
                e = e2;
                c0vsv2 = c0vsv;
                TryCatchGuardChecker.doCheck(e);
                LJFF(c0vsv2);
                return false;
            }
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream = c0vsv2;
            TryCatchGuardChecker.doCheck(th);
            LJFF(byteArrayOutputStream);
            throw th;
        }
    }
}
