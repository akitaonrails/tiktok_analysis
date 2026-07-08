package X;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.IllegalFormatException;
import java.util.Locale;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.09kE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2458409kE {
    public final String LIZ;

    public C2458409kE(String str) {
        this.LIZ = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }

    public final void LIZ(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            LJFF(this.LIZ, str, objArr);
        }
    }

    public final void LIZIZ(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            LJFF(this.LIZ, str, objArr);
        }
    }

    public final void LIZLLL(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            LJFF(this.LIZ, str, objArr);
        }
    }

    public final void LJ(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            LJFF(this.LIZ, str, objArr);
        }
    }

    public static String LJFF(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = C786410Ut5.k4(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                "Unable to format ".concat(str2);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + e3.f;
            }
        }
        return str + " : " + str2;
    }

    public final void LIZJ(String str, Throwable th, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            LJFF(this.LIZ, str, objArr);
        }
    }
}
