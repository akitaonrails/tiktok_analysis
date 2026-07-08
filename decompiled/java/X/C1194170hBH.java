package X;

import android.content.Context;
import android.location.LocationManager;
import android.os.Build;
import android.provider.Settings;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0hBH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1194170hBH {
    public static final boolean LIZ(Context context) {
        Object c098200Yq;
        boolean z;
        try {
            if (C838410Wul.LIZ(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                z = true;
            } else {
                z = false;
            }
            c098200Yq = Boolean.valueOf(z);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = Boolean.FALSE;
        }
        return ((Boolean) c098200Yq).booleanValue();
    }

    public static final boolean LIZIZ(Context context) {
        Object c098200Yq;
        boolean z;
        try {
            if (C838410Wul.LIZ(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                z = true;
            } else {
                z = false;
            }
            c098200Yq = Boolean.valueOf(z);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = Boolean.FALSE;
        }
        return ((Boolean) c098200Yq).booleanValue();
    }

    public static final boolean LIZJ(Context context) {
        LocationManager locationManager;
        if (Build.VERSION.SDK_INT >= 28) {
            Object objH2 = C786410Ut5.H2(C786410Ut5.N3(context), "location");
            if (!(objH2 instanceof LocationManager) || (locationManager = (LocationManager) objH2) == null) {
                return false;
            }
            return locationManager.isLocationEnabled();
        }
        try {
            if (Settings.Secure.getInt(context.getContentResolver(), "location_mode") == 0) {
                return false;
            }
            return true;
        } catch (Settings.SettingNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
