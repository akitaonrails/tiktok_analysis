package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: renamed from: X.08Oz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2111508Oz {
    public static String LIZ(C0VSJ c0vsj, String str) throws IOException {
        C0VSJ c0vsj2 = new C0VSJ(str);
        if (!c0vsj2.exists()) {
            c0vsj2.mkdir();
        }
        ZipInputStream zipInputStream = new ZipInputStream(new C0VSP(c0vsj));
        Boolean bool = Boolean.FALSE;
        String name = "";
        for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(File.separator);
            sbLIZ.append(nextEntry.getName());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (!nextEntry.getName().contains("__MACOSX") && !nextEntry.getName().contains(".DS_Store") && !nextEntry.getName().contains("../")) {
                if (!nextEntry.isDirectory()) {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new C0VSV(strLIZIZ));
                    byte[] bArr = new byte[SpeechEngineDefines.TTS_WORK_MODE_BOTH];
                    while (true) {
                        int i = zipInputStream.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        bufferedOutputStream.write(bArr, 0, i);
                    }
                    bufferedOutputStream.close();
                } else {
                    C0VSJ c0vsj3 = new C0VSJ(strLIZIZ);
                    if (!bool.booleanValue()) {
                        bool = Boolean.TRUE;
                        name = nextEntry.getName();
                    }
                    c0vsj3.mkdirs();
                }
            }
            zipInputStream.closeEntry();
        }
        zipInputStream.close();
        return name;
    }
}
