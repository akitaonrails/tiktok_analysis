package X;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0K7g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C512300K7g {
    public static final int LIZIZ(Throwable th) {
        if (th instanceof C501470JlZ) {
            return ((C501520Jle) th).getErrorCode();
        }
        if (th instanceof C1494430ozZ) {
            return ((C1494430ozZ) th).getStatusCode();
        }
        if (th instanceof C1811850xFX) {
            return ((C1811850xFX) th).statusCode;
        }
        if (th instanceof C1494450ozb) {
            return ((C1494450ozb) th).getCronetInternalErrorCode();
        }
        if (th instanceof C1494690ozz) {
            return ((C1494690ozz) th).getCronetInternalErrorCode();
        }
        return -1;
    }

    public static final String LIZJ(Throwable th) {
        if (th instanceof C501470JlZ) {
            return "ApiServerException";
        }
        if (th instanceof C1811850xFX) {
            return "NetworkErrorException";
        }
        if (th instanceof C1494690ozz) {
            return "CronetIOException";
        }
        if (th instanceof C1494450ozb) {
            return "NetworkNotAvailableException";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unknown: ");
        sbLIZ.append(th.getClass().getSimpleName());
        sbLIZ.append(' ');
        sbLIZ.append(th.getMessage());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final String LIZLLL(Throwable th) {
        C501470JlZ c501470JlZ;
        if (!(th instanceof C501470JlZ) || (c501470JlZ = (C501470JlZ) th) == null) {
            return null;
        }
        return c501470JlZ.getErrorMsg();
    }

    public static final String LJ(Throwable th) {
        C501470JlZ c501470JlZ;
        if (th instanceof C477520Io2) {
            C477520Io2 c477520Io2 = (C477520Io2) th;
            if (C500260Jjc.LJJIIZ(c477520Io2.getxTtLogId())) {
                return c477520Io2.getxTtLogId();
            }
        }
        if (!(th instanceof C501470JlZ) || (c501470JlZ = (C501470JlZ) th) == null) {
            return null;
        }
        return c501470JlZ.getLogId();
    }

    public static final Boolean LIZ(Bundle bundle, String str, Boolean bool) {
        boolean z;
        if (bundle.getBoolean(str)) {
            return Boolean.valueOf(bundle.getBoolean(str));
        }
        if (!bundle.containsKey(str) && bool != null) {
            return bool;
        }
        if (!Intrinsics.LJFF(bundle.getString(str), "true") && !Intrinsics.LJFF(bundle.getString(str), "1") && bundle.getLong(str) != 1) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
