package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.Unit;

/* JADX INFO: renamed from: X.08N0, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08N0 {
    public static final C08N0 LIZ = new C08N0();

    public static void LIZ(Closeable closeable) {
        Unit unit;
        if (closeable == null) {
            unit = null;
        } else {
            try {
                closeable.close();
                unit = Unit.LIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return;
            }
        }
        C189200o6.m2constructorimpl(unit);
    }

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

    public static void LIZIZ(C0VSP c0vsp, OutputStream outputStream) {
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
                    outputStream.flush();
                    LIZ(c0vsp);
                    LIZ(outputStream);
                    return;
                }
                outputStream.write(bArr, 0, i);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZ(c0vsp);
            LIZ(outputStream);
            throw th;
        }
    }
}
