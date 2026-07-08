package X;

import android.content.Context;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: renamed from: X.08P1, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08P1 {
    public static String LIZ() {
        Context contextLIZ = C176600m4.LIZ();
        if (contextLIZ == null) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C786410Ut5.w2(contextLIZ).getPath());
        sbLIZ.append(File.separator);
        sbLIZ.append("live");
        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
        if (!c0vsj.exists()) {
            c0vsj.mkdirs();
        }
        return c0vsj.getAbsolutePath();
    }

    public static byte[] LIZIZ(C0VSJ c0vsj) {
        if (c0vsj.exists()) {
            try {
                return LIZJ(new C0VSP(c0vsj));
            } catch (FileNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return null;
    }

    public static byte[] LIZJ(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream;
        byte[] bArr;
        if (inputStream == null) {
            return null;
        }
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                bArr = new byte[SpeechEngineDefines.ASR_WORK_MODE_OFFLINE];
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                try {
                    inputStream.close();
                    return null;
                } catch (IOException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    return null;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            try {
                inputStream.close();
                throw th;
            } catch (IOException e3) {
                TryCatchGuardChecker.doCheck(e3);
                throw th;
            }
        }
        while (true) {
            int i = inputStream.read(bArr);
            if (i != -1) {
                byteArrayOutputStream.write(bArr, 0, i);
            } else {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                try {
                    inputStream.close();
                    return byteArray;
                } catch (IOException e4) {
                    TryCatchGuardChecker.doCheck(e4);
                    return byteArray;
                }
            }
            TryCatchGuardChecker.doCheck(th);
            inputStream.close();
            throw th;
        }
    }

    public static void LIZLLL(File file) {
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                for (File file2 : fileArrListFiles) {
                    if (file2.isDirectory()) {
                        LIZLLL(file2);
                    } else {
                        file2.delete();
                    }
                }
                file.delete();
                return;
            }
            file.delete();
            return;
        }
        file.delete();
    }

    public static void LJ(String str, String str2) {
        ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new C0VSP(str)));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("..");
        sbLIZ.append(File.separator);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry != null) {
                String name = nextEntry.getName();
                if (!C2093608Ic.LJ(name) && name.contains(strLIZIZ)) {
                    throw new IOException("Unzip maybe be unsafe.");
                }
                if (nextEntry.isDirectory()) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(str2);
                    sbLIZ2.append(File.separator);
                    sbLIZ2.append(name);
                    new C0VSJ(C2188811AlT.LIZIZ(sbLIZ2)).mkdirs();
                } else {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(str2);
                    sbLIZ3.append(File.separator);
                    sbLIZ3.append(name);
                    C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ3));
                    if (c0vsj.exists()) {
                        c0vsj.delete();
                    } else {
                        c0vsj.getParentFile().mkdirs();
                    }
                    c0vsj.createNewFile();
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new C0VSV(c0vsj));
                    byte[] bArr = new byte[SpeechEngineDefines.ASR_WORK_MODE_OFFLINE];
                    while (true) {
                        int i = zipInputStream.read(bArr);
                        if (i == -1) {
                            break;
                        } else {
                            bufferedOutputStream.write(bArr, 0, i);
                        }
                    }
                    bufferedOutputStream.flush();
                    bufferedOutputStream.close();
                }
            } else {
                zipInputStream.close();
                return;
            }
        }
    }
}
