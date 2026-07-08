package X;

import java.io.IOException;

/* JADX INFO: renamed from: X.0kXF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1323110kXF {
    public static void LIZ(C1323100kXE c1323100kXE, long j) throws IOException {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        C1322350kW1.LIZIZ(z);
        while (j > 0) {
            long jSkip = c1323100kXE.skip(j);
            if (jSkip <= 0) {
                if (c1323100kXE.read() != -1) {
                    jSkip = 1;
                } else {
                    return;
                }
            }
            j -= jSkip;
        }
    }
}
