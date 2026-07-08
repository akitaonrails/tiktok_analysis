package X;

import java.io.IOException;
import kotlin.Pair;

/* JADX INFO: renamed from: X.09Rf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2372109Rf {
    public static final Pair<Integer, String> LIZ(IOException iOException) {
        String strLIZIZ;
        Integer numValueOf = null;
        if (iOException instanceof C1494690ozz) {
            C1494690ozz c1494690ozz = (C1494690ozz) iOException;
            if (c1494690ozz.getStatusCode() != 0) {
                numValueOf = Integer.valueOf(c1494690ozz.getStatusCode());
            } else if (c1494690ozz.getCronetInternalErrorCode() != 0) {
                numValueOf = Integer.valueOf(c1494690ozz.getCronetInternalErrorCode());
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CronetIOException, statusCode=");
            sbLIZ.append(c1494690ozz.getStatusCode());
            sbLIZ.append(", internalErrorCode=");
            sbLIZ.append(c1494690ozz.getCronetInternalErrorCode());
            sbLIZ.append(", requestLog=");
            sbLIZ.append(c1494690ozz.getRequestLog());
            sbLIZ.append(", ");
            sbLIZ.append(iOException);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = null;
        }
        return new Pair<>(numValueOf, strLIZIZ);
    }
}
