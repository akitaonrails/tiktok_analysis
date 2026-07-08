package X;

import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.GZIPInputStream;

/* JADX INFO: renamed from: X.0p0v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1495270p0v {
    public static volatile int LIZ = 0;
    public static volatile int LIZIZ = 0;
    public static final Map<String, Integer> LIZJ = new ConcurrentHashMap();

    public static void LJI(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                Logger.debug();
            }
        }
    }

    public static boolean LJII(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf("application/octet-stream")) < 0 || str.indexOf("ssmix=", iIndexOf + 24) <= 0) {
            return false;
        }
        return true;
    }

    public static void LIZ(int i, byte[] bArr) {
        if (i > 0) {
            byte[] bArr2 = {-99, -114, 127, 90};
            int i2 = 0;
            do {
                bArr[i2] = (byte) (bArr[i2] ^ bArr2[i2 % 4]);
                i2++;
            } while (i2 < i);
        }
    }

    public static byte[] LJ(int i, InputStream inputStream, C1494570ozn c1494570ozn) throws Exception {
        C1496690p3D c1496690p3D = new C1496690p3D();
        try {
            C1496670p3B c1496670p3B = new C1496670p3B(C1496330p2d.LIZJ(inputStream));
            while (!c1496670p3B.LJJJJLL()) {
                try {
                    long j = i;
                    if (c1496670p3B.read(c1496690p3D, j - c1496690p3D.LLILLJJLI) == -1 || c1496690p3D.LLILLJJLI > j) {
                        throw new C812930Vul(i, c1496690p3D.LLILLJJLI);
                    }
                } finally {
                }
            }
            if (c1494570ozn != null) {
                c1494570ozn.LIZLLL = 1;
                c1494570ozn.LJJJLZIJ.put("streamReadByteCount", Long.valueOf(c1496690p3D.LLILLJJLI));
            }
            byte[] bArrLJZL = c1496690p3D.LJZL();
            c1496670p3B.close();
            return bArrLJZL;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        }
    }

    public static InputStream LIZIZ(InputStream inputStream, Map<String, List<String>> map, boolean z, C1494570ozn c1494570ozn) {
        if (z) {
            return new GZIPInputStream(inputStream);
        }
        InterfaceC1495260p0u interfaceC1495260p0u = C1494230ozF.LJIIIZ;
        if (interfaceC1495260p0u == null) {
            return inputStream;
        }
        if (c1494570ozn != null) {
            c1494570ozn.LJLJI.LIZIZ.LIZIZ();
        }
        try {
            InputStream inputStreamLIZ = interfaceC1495260p0u.LIZ(inputStream, map, c1494570ozn);
            if (c1494570ozn != null) {
                C1494720p02 c1494720p02 = c1494570ozn.LJLJI.LIZIZ;
                c1494720p02.LJIIIZ = c1494720p02.LIZ();
            }
            return inputStreamLIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (c1494570ozn != null) {
                C1494720p02 c1494720p022 = c1494570ozn.LJLJI.LIZIZ;
                c1494720p022.LJIIIZ = c1494720p022.LIZ();
            }
            throw th;
        }
    }

    public static byte[] LIZLLL(boolean z, int i, InputStream inputStream, int[] iArr, C1494570ozn c1494570ozn) throws IOException {
        boolean z2;
        int iIntValue;
        int i2;
        int length;
        URL url;
        int i3 = LIZ;
        boolean z3 = true;
        if (i3 >= 4096 && i3 <= 5242880) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            iIntValue = LIZ;
        } else {
            iIntValue = 32768;
        }
        int i4 = LIZIZ;
        if (i4 < 4096 || i4 > 5242880) {
            z3 = false;
        }
        if (z3) {
            i2 = LIZIZ;
        } else {
            i2 = 102400;
        }
        if (c1494570ozn != null && (url = c1494570ozn.LIZ) != null && !TextUtils.isEmpty(url.getPath())) {
            Integer num = (Integer) ((ConcurrentHashMap) LIZJ).get(c1494570ozn.LIZ.getPath());
            if (num != null) {
                iIntValue = num.intValue();
            }
        }
        Logger.debug();
        byte[] bArr = new byte[iIntValue];
        int i5 = 0;
        int i6 = 0;
        do {
            try {
                if (i5 + SpeechEngineDefines.TTS_WORK_MODE_BOTH > bArr.length) {
                    if (bArr.length < i2) {
                        length = bArr.length + i2;
                    } else {
                        length = bArr.length * 2;
                    }
                    byte[] bArr2 = new byte[length];
                    System.arraycopy(bArr, 0, bArr2, 0, i5);
                    i6++;
                    bArr = bArr2;
                }
                int i7 = inputStream.read(bArr, i5, bArr.length - i5);
                if (i7 > 0) {
                    i5 += i7;
                }
            } catch (EOFException e) {
                TryCatchGuardChecker.doCheck(e);
                if (!z || i5 <= 0) {
                    throw e;
                }
            } catch (IOException e2) {
                TryCatchGuardChecker.doCheck(e2);
                String message = e2.getMessage();
                if (!z || i5 <= 0 || (!"CRC mismatch".equals(message) && !"Size mismatch".equals(message))) {
                    throw e2;
                }
            } catch (OutOfMemoryError e3) {
                TryCatchGuardChecker.doCheck(e3);
                return null;
            }
            if (i5 <= 0) {
                return null;
            }
            if (c1494570ozn != null) {
                c1494570ozn.LIZLLL = 0;
                c1494570ozn.LJJJLZIJ.put("streamReadByteCount", Long.valueOf(i5));
                c1494570ozn.LIZJ = i6;
            }
            Logger.debug();
            byte[] bArr3 = new byte[i5];
            System.arraycopy(bArr, 0, bArr3, 0, i5);
            iArr[0] = i5;
            return bArr3;
        } while (i5 <= i);
        throw new C812930Vul(i, i5);
    }

    public static byte[] LJFF(boolean z, Map<String, List<String>> map, int i, InputStream inputStream, int[] iArr, InterfaceC1493860oye interfaceC1493860oye) throws Exception {
        InputStream inputStreamLIZIZ = inputStream;
        try {
            if (inputStreamLIZIZ == null) {
                return null;
            }
            try {
                inputStreamLIZIZ = LIZIZ(inputStreamLIZIZ, map, z, null);
                byte[] bArrLIZJ = LIZJ(z, i, inputStreamLIZIZ, iArr, null, false, false);
                LJI(inputStreamLIZIZ);
                if (bArrLIZJ == null || iArr[0] <= 0) {
                    return null;
                }
                return bArrLIZJ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                LJI(inputStreamLIZIZ);
                throw th;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (interfaceC1493860oye != null) {
                try {
                    interfaceC1493860oye.LIZ();
                    throw e;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw e;
                }
            }
            throw e;
        }
    }

    public static byte[] LIZJ(boolean z, int i, InputStream inputStream, int[] iArr, C1494570ozn c1494570ozn, boolean z2, boolean z3) {
        if (inputStream == null) {
            return null;
        }
        if (i <= 0) {
            i = 5242880;
        } else if (i < 1048576) {
            i = 1048576;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            if (z3) {
                try {
                    inputStream.read(new byte[0]);
                    int iAvailable = inputStream.available();
                    Logger.debug();
                    byte[] bArr = new byte[iAvailable];
                    inputStream.read(bArr);
                    if (c1494570ozn != null) {
                        c1494570ozn.LIZLLL = 2;
                        c1494570ozn.LJJJLZIJ.put("streamReadByteCount", Long.valueOf(iAvailable));
                    }
                    if (c1494570ozn != null) {
                        c1494570ozn.LJJJLZIJ.put("streamReadTime", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                        c1494570ozn.LIZLLL = z2 ? 1 : 0;
                    }
                    return bArr;
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw e;
                }
            }
            if (z2) {
                byte[] bArrLJ = LJ(i, inputStream, c1494570ozn);
                if (c1494570ozn != null) {
                    c1494570ozn.LJJJLZIJ.put("streamReadTime", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                    c1494570ozn.LIZLLL = z2 ? 1 : 0;
                }
                return bArrLJ;
            }
            byte[] bArrLIZLLL = LIZLLL(z, i, inputStream, iArr, c1494570ozn);
            if (c1494570ozn != null) {
                c1494570ozn.LJJJLZIJ.put("streamReadTime", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                c1494570ozn.LIZLLL = z2 ? 1 : 0;
            }
            return bArrLIZLLL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (c1494570ozn != null) {
                c1494570ozn.LJJJLZIJ.put("streamReadTime", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                c1494570ozn.LIZLLL = z2 ? 1 : 0;
            }
            throw th;
        }
    }
}
