package X;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0K7h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C512310K7h {
    public static final int LIZIZ(Throwable th) {
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
        Integer num = C09OK.LIZ(-1, th).LIZ;
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    public static final String LIZJ(Throwable th) {
        if (th instanceof C1811850xFX) {
            return "NetworkErrorException";
        }
        if (th instanceof C1494690ozz) {
            return "CronetIOException";
        }
        if (th instanceof C1494450ozb) {
            return "NetworkNotAvailableException";
        }
        if (C09OK.LIZ(null, th).LJ) {
            return "PgcApiError";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unknown: ");
        sbLIZ.append(th.getClass().getSimpleName());
        sbLIZ.append(' ');
        sbLIZ.append(th.getMessage());
        return C2188811AlT.LIZIZ(sbLIZ);
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
