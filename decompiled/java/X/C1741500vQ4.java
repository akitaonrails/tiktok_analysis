package X;

import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0vQ4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1741500vQ4 {
    public static StringBuilder LIZ(C1741510vQ5 c1741510vQ5) {
        StringBuilder sb;
        C1741510vQ5 c1741510vQ52 = c1741510vQ5.LIZIZ;
        if (c1741510vQ52 != null && (sb = LIZ(c1741510vQ52)) != null) {
            if (c1741510vQ5.LIZLLL) {
                sb.append("_");
            } else {
                sb.append(e3.d);
            }
        } else {
            sb = new StringBuilder();
        }
        sb.append(c1741510vQ5.LIZ);
        if (c1741510vQ5.LIZJ != -1) {
            sb.append("_i" + c1741510vQ5.LIZJ);
        }
        return sb;
    }
}
