package X;

import android.content.Context;
import android.provider.Settings;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: renamed from: X.0eQL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1088190eQL {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(377));

    public static boolean LIZ(Context context) {
        if (LIZIZ(context)) {
            return true;
        }
        try {
            Keva keva = (Keva) LIZ.getValue();
            if (keva != null) {
                if (keva.getBoolean("reduce_motion_enabled", false)) {
                    return true;
                }
                return false;
            }
            return false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public static boolean LIZIZ(Context context) {
        Float fValueOf;
        boolean z = false;
        try {
            try {
                Iterator<String> it2 = C1088030eQ5.LIZ.iterator();
                while (it2.hasNext()) {
                    try {
                        fValueOf = Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), it2.next()));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                    if (fValueOf == null || fValueOf.floatValue() > 0.0f) {
                        z = true;
                        break;
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
            z = !z;
            return z;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return z;
        }
    }
}
