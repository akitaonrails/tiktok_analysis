package X;

import android.util.Log;

/* JADX INFO: renamed from: X.189P, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C189P {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(Throwable th) {
        String stackTraceString = Log.getStackTraceString(th);
        int length = stackTraceString.length();
        int iLIZ = C18CS.LIZ.LIZJ().LIZ();
        if (length > iLIZ) {
            length = iLIZ;
        }
        if (length > 0) {
            return stackTraceString.substring(0, length);
        }
        return "";
    }
}
