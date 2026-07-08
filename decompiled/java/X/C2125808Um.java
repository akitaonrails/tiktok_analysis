package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: X.08Um, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2125808Um {
    public static byte[] LIZ(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            deflater.end();
            throw th;
        }
    }

    public static int LJ(InputStream inputStream) {
        return (int) LIZLLL(inputStream, 2);
    }

    public static byte[] LIZIZ(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 >= 0) {
                i2 += i3;
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Not enough bytes to read: ");
                sbLIZ.append(i);
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        return bArr;
    }

    public static long LIZLLL(InputStream inputStream, int i) throws IOException {
        byte[] bArrLIZIZ = LIZIZ(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (bArrLIZIZ[i2] & 255)) << (i2 * 8);
        }
        return j;
    }

    public static void LJI(OutputStream outputStream, int i) throws IOException {
        LJFF(outputStream, i, 2);
    }

    public static byte[] LIZJ(InputStream inputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[SpeechEngineDefines.ASR_WORK_MODE_OFFLINE];
            int i3 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int i4 = inputStream.read(bArr2);
                if (i4 >= 0) {
                    inflater.setInput(bArr2, 0, i4);
                    try {
                        iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
                        i3 += i4;
                    } catch (DataFormatException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw new IllegalStateException(e.getMessage());
                    }
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected ");
                    sbLIZ.append(i);
                    sbLIZ.append(" bytes");
                    throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            if (i3 == i) {
                if (inflater.finished()) {
                    inflater.end();
                    return bArr;
                }
                throw new IllegalStateException("Inflater did not finish");
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Didn't read enough bytes during decompression. expected=");
            sbLIZ2.append(i);
            sbLIZ2.append(" actual=");
            sbLIZ2.append(i3);
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            inflater.end();
            throw th;
        }
    }

    public static void LJFF(OutputStream outputStream, long j, int i) throws IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        outputStream.write(bArr);
    }
}
