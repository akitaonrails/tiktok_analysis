package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: X.08Mz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2106308Mz {
    public static String LIZ(InputStream inputStream) {
        byte[] byteArray;
        if (inputStream != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[SpeechEngineDefines.ASR_WORK_MODE_OFFLINE];
            while (true) {
                try {
                    int i = inputStream.read(bArr, 0, SpeechEngineDefines.ASR_WORK_MODE_OFFLINE);
                    if (i == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    byteArray = null;
                }
            }
            byteArray = byteArrayOutputStream.toByteArray();
        } else {
            byteArray = null;
        }
        if (byteArray == null) {
            return null;
        }
        return new String(byteArray);
    }
}
