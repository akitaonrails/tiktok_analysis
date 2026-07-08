package X;

import android.text.TextUtils;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: X.09NB, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09NB {
    public static String LIZJ(String str) {
        int length = str.length();
        char[] charArray = str.toCharArray();
        int i = 0;
        char c = 0;
        int i2 = 0;
        while (i < length) {
            char c2 = charArray[i];
            if (c2 != '/' || c != '/') {
                charArray[i2] = c2;
                i2++;
            }
            i++;
            c = c2;
        }
        if (c == '/' && length > 1) {
            i2--;
        }
        if (i2 != length) {
            return new String(charArray, 0, i2);
        }
        return str;
    }

    public static void LIZLLL(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                if ("mounted".equals(C786410Ut5.X3())) {
                    C0VSJ c0vsj = new C0VSJ(str);
                    if (c0vsj.exists()) {
                        c0vsj.delete();
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static void LIZ(C0VSP c0vsp, OutputStream outputStream) {
        try {
            byte[] bArr = new byte[SpeechEngineDefines.TTS_WORK_MODE_BOTH];
            if (outputStream == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Failed to copy input:");
                sbLIZ.append(c0vsp);
                sbLIZ.append("output:");
                sbLIZ.append(outputStream);
                throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
            }
            while (true) {
                int i = c0vsp.read(bArr);
                if (i <= 0) {
                    break;
                } else {
                    outputStream.write(bArr, 0, i);
                }
            }
            outputStream.flush();
            try {
                c0vsp.close();
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                outputStream.close();
            } catch (IOException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            try {
                c0vsp.close();
            } catch (IOException e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            if (outputStream != null) {
                try {
                    outputStream.close();
                    throw th;
                } catch (IOException e4) {
                    TryCatchGuardChecker.doCheck(e4);
                    throw th;
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x01d2  */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8, types: [android.net.Uri, java.lang.String[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.net.Uri LIZIZ(android.content.Context r14, java.lang.String r15, java.lang.String r16, java.lang.Boolean r17) {
        /*
            Method dump skipped, instruction units count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09NB.LIZIZ(android.content.Context, java.lang.String, java.lang.String, java.lang.Boolean):android.net.Uri");
    }
}
