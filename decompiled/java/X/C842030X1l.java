package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: X.0X1l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C842030X1l {
    public static void LIZ(InputStream inputStream, OutputStream outputStream) throws IOException {
        outputStream.getClass();
        byte[] bArr = new byte[SpeechEngineDefines.TTS_WORK_MODE_BOTH];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }

    public static int LIZIZ(InputStream inputStream, byte[] bArr, int i) throws IOException {
        inputStream.getClass();
        if (i >= 0) {
            int i2 = 0;
            while (i2 < i) {
                int i3 = inputStream.read(bArr, i2, i - i2);
                if (i3 == -1) {
                    break;
                }
                i2 += i3;
            }
            return i2;
        }
        throw new IndexOutOfBoundsException("len is negative");
    }
}
