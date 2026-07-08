package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: renamed from: X.08Oy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2111408Oy {
    public static void LIZ(String str, String str2) throws IOException {
        ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new C0VSP(str)));
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry != null) {
                String name = nextEntry.getName();
                if (!name.contains("../")) {
                    if (nextEntry.isDirectory()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str2);
                        sbLIZ.append(File.separator);
                        sbLIZ.append(name);
                        new C0VSJ(C2188811AlT.LIZIZ(sbLIZ)).mkdirs();
                    } else {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(str2);
                        sbLIZ2.append(File.separator);
                        sbLIZ2.append(name);
                        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ2));
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
                }
            } else {
                zipInputStream.close();
                return;
            }
        }
    }
}
