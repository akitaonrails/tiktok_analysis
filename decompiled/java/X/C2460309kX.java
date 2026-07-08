package X;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.IllegalFormatException;
import java.util.Locale;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.09kX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2460309kX {
    public final String LIZ;

    public C2460309kX(String str) {
        this.LIZ = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }

    public final void LIZ(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            LIZJ(this.LIZ, str, objArr);
        }
    }

    public final void LIZIZ(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            LIZJ(this.LIZ, str, objArr);
        }
    }

    public static String LIZJ(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = C786410Ut5.k4(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + e3.f;
            }
        }
        return str + " : " + str2;
    }
}
