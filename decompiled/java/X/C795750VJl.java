package X;

import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import com.ss.ttm.ttvideodecode.Native;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;

/* JADX INFO: renamed from: X.0VJl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C795750VJl {
    public static volatile boolean LIZ = false;
    public static volatile String LIZIZ = "";

    static {
        if (C790030Uyv.LIZ.LJI == 1) {
            int i = C2187451AjH.LIZ;
            TTVideoEngineLog.d("JniUtils", "JniUtils.loadLibrary in static block");
            LIZJ();
        }
    }

    public static int LIZ() {
        if (!LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("library not load suc exception:");
            sbLIZ.append(LIZIZ != null ? LIZIZ : "exception is null");
            throw new Exception(C2188811AlT.LIZIZ(sbLIZ));
        }
        try {
            return Native._getSupportedMethod();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getDecodedStr exception:");
            sbLIZ2.append(th.toString() != null ? th.toString() : "exception is null");
            throw new Exception(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public static synchronized void LIZJ() {
        try {
            if (!LIZ) {
                int i = C2187451AjH.LIZ;
                TTVideoEngineLog.d("JniUtils", "JniUtils.loadLibrary");
                LoadSoLancet.LIZJ("videodec");
                long jUptimeMillis = SystemClock.uptimeMillis();
                Librarian.LJFF("videodec");
                LoadSoLancet.LJ(jUptimeMillis, "videodec");
                LoadSoLancet.LIZLLL(jUptimeMillis, "videodec");
                LoadSoLancet.LIZIZ("videodec");
                LIZ = true;
            }
        } finally {
        }
    }

    public static String LIZIZ(byte[] bArr, byte[] bArr2) throws Exception {
        String string = "exception is null";
        if (!LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("library not load suc exception:");
            if (LIZIZ != null) {
                string = LIZIZ;
            }
            sbLIZ.append(string);
            throw new Exception(C2188811AlT.LIZIZ(sbLIZ));
        }
        try {
            return Native._getDecodedStr(bArr, bArr2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getDecodedStr exception:");
            if (th.toString() != null) {
                string = th.toString();
            }
            sbLIZ2.append(string);
            throw new Exception(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }
}
