package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/* JADX INFO: renamed from: X.08S8, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08S8 {
    public static void LIZ(String str, String str2) throws IOException {
        ZipInputStream zipInputStream = new ZipInputStream(new C0VSP(str));
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry != null) {
                String name = nextEntry.getName();
                if (nextEntry.isDirectory()) {
                    String strSubstring = name.substring(0, name.length() - 1);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str2);
                    sbLIZ.append(File.separator);
                    sbLIZ.append(strSubstring);
                    new C0VSJ(C2188811AlT.LIZIZ(sbLIZ)).mkdirs();
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(str2);
                    sbLIZ2.append(File.separator);
                    sbLIZ2.append(name);
                    C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ2));
                    if (!c0vsj.exists()) {
                        c0vsj.getParentFile().mkdirs();
                        c0vsj.createNewFile();
                    }
                    C0VSV c0vsv = new C0VSV(c0vsj);
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = zipInputStream.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        c0vsv.write(bArr, 0, i);
                        c0vsv.flush();
                    }
                    c0vsv.close();
                }
            } else {
                zipInputStream.close();
                return;
            }
        }
    }

    public static void LIZJ(String str, String str2) throws IOException {
        ZipOutputStream zipOutputStream = new ZipOutputStream(new C0VSV(str2));
        C0VSJ c0vsj = new C0VSJ(str);
        if (c0vsj.isDirectory()) {
            File[] fileArrListFiles = c0vsj.listFiles();
            if (fileArrListFiles == null) {
                return;
            }
            for (File file : fileArrListFiles) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(file.getParent());
                sbLIZ.append(File.separator);
                LIZIZ(C2188811AlT.LIZIZ(sbLIZ), file.getName(), zipOutputStream);
            }
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(c0vsj.getParent());
            sbLIZ2.append(File.separator);
            LIZIZ(C2188811AlT.LIZIZ(sbLIZ2), c0vsj.getName(), zipOutputStream);
        }
        zipOutputStream.finish();
        zipOutputStream.close();
    }

    public static void LIZIZ(String str, String str2, ZipOutputStream zipOutputStream) throws IOException {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(str2);
        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
        if (c0vsj.isFile()) {
            ZipEntry zipEntry = new ZipEntry(str2);
            C0VSP c0vsp = new C0VSP(c0vsj);
            zipOutputStream.putNextEntry(zipEntry);
            byte[] bArr = new byte[SpeechEngineDefines.TTS_WORK_MODE_BOTH];
            while (true) {
                int i = c0vsp.read(bArr);
                if (i != -1) {
                    zipOutputStream.write(bArr, 0, i);
                } else {
                    zipOutputStream.closeEntry();
                    return;
                }
            }
        } else {
            String[] list = c0vsj.list();
            if (list != null && list.length > 0) {
                for (String str3 : list) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(str2);
                    sbLIZ2.append(File.separator);
                    sbLIZ2.append(str3);
                    LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ2), zipOutputStream);
                }
                return;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(str2);
            sbLIZ3.append(File.separator);
            zipOutputStream.putNextEntry(new ZipEntry(C2188811AlT.LIZIZ(sbLIZ3)));
            zipOutputStream.closeEntry();
        }
    }
}
