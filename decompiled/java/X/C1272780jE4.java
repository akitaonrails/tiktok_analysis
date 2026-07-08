package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: X.0jE4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1272780jE4 {
    public static boolean LIZ(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        if (byteBuffer.capacity() < 4) {
            return false;
        }
        byteBuffer.get(bArr, 0, 4);
        byteBuffer.position(0);
        if (!"MATN".equals(new String(bArr))) {
            return false;
        }
        return true;
    }

    public static byte[] LIZIZ(byte[] bArr) throws IOException {
        Inflater inflater = new Inflater();
        inflater.setInput(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
        byte[] bArr2 = new byte[SpeechEngineDefines.TTS_WORK_MODE_BOTH];
        while (!inflater.finished()) {
            byteArrayOutputStream.write(bArr2, 0, inflater.inflate(bArr2));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        return byteArray;
    }
}
