package X;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0C7l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C308510C7l {
    public static final boolean LIZIZ(boolean z) {
        if ((((Number) C278000Av0.LIZ.getValue()).intValue() == 1 && !z) || ((Number) C259960AGs.LIZ.getValue()).intValue() != 1) {
            return false;
        }
        return true;
    }

    public static final void LIZ(int i, Exception exc) {
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("exception_reason", String.valueOf(i)));
        if (exc != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(exc.getClass().getSimpleName());
            String message = exc.getMessage();
            if (message != null) {
                sb.append(": ");
                sb.append(message);
            }
            String string = sb.toString();
            if (string.length() > 0) {
                mapLJIIJ.put("exception_type", string);
            }
        }
        C20684815ws.LJIILLIIL("publish_mob_exception", mapLJIIJ);
    }
}
