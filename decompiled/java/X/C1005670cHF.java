package X;

import android.content.Context;
import android.system.OsConstants;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.agilelogger.ALog;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cHF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1005670cHF {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(342));

    public final Keva LIZJ() {
        return (Keva) this.LIZ.getValue();
    }

    public C1005670cHF(Context context) {
    }

    public static EnumC993330bxL LIZIZ(int i, int i2, int i3, String str) {
        boolean z;
        if (i <= 100) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (C281070Azx.LIZ(1) && i2 == 3) {
                return EnumC993330bxL.FORE_LOW_MEMORY;
            }
            if (C281070Azx.LIZ(2) && i2 == 2 && i3 == OsConstants.SIGKILL) {
                return EnumC993330bxL.FORE_SIGNALED;
            }
        } else {
            if (C281070Azx.LIZ(32) && i >= 400 && i2 == 3) {
                return EnumC993330bxL.BG_LOW_MEMORY;
            }
            if (C281070Azx.LIZ(16) && i2 == 6 && str != null && str.length() != 0 && a0.LJJIIZI(str, "FirebaseInstanceIdReceiver", false) && a0.LJJIIZI(str, "bg anr", false)) {
                return EnumC993330bxL.BG_PUSH_ANR;
            }
        }
        return EnumC993330bxL.UNKNOWN;
    }

    public final void LIZ(int i, String str, String str2, long j, String str3) {
        try {
            long j2 = LIZJ().getLong("key_app_exit_last_timestamp", 0L);
            int i2 = LIZJ().getInt("key_app_exit_consecutive_count", 0);
            int i3 = 1;
            if (j2 > 0 && j - j2 < 20000 && (i3 = 1 + i2) >= 3) {
                C793770VBv.LJII("consecutive_app_exit_event", new JSONObject().put("reason", i), new JSONObject().put("description", str).put("timestamp", j).put("last_activity", str2).put("last_fragment", str3), null);
            }
            LIZJ().storeInt("key_app_exit_consecutive_count", i3);
            LIZJ().storeLong("key_app_exit_last_timestamp", j);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            ALog.e("AppExitEventReporter", "detectConsecutiveExit failed", e);
        }
    }
}
