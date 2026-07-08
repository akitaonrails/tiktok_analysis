package X;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.04l6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1189804l6 {
    public static final Set<String> LIZ = new LinkedHashSet();

    public static boolean LIZ(String str) {
        boolean z = true;
        if (str.length() <= 0 || !LIZ.contains(str)) {
            z = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hasShown aid=");
        sbLIZ.append(str);
        sbLIZ.append(" hasShown=");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        return z;
    }
}
