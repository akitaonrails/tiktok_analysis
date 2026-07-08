package X;

import java.util.Collections;

/* JADX INFO: renamed from: X.0YAd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C869770YAd {
    public static C869710Y9x LIZ(C869690Y9v c869690Y9v, int i, long j, boolean z, int i2) {
        C0YAL c0yal;
        boolean z2 = z;
        long j2 = j;
        int i3 = i;
        String str = null;
        if ((i2 & 2) != 0) {
            c0yal = C0YAL.SORT_ORDER_DESC;
        } else {
            c0yal = null;
        }
        if ((i2 & 4) != 0) {
            i3 = -1;
        }
        if ((i2 & 8) != 0) {
            j2 = Long.MAX_VALUE;
        }
        if ((i2 & 16) != 0) {
            z2 = false;
        }
        if ((i2 & 32) != 0) {
            str = "";
        }
        return new C869710Y9x(Collections.singletonList(c869690Y9v), c0yal, i3, j2, z2, str);
    }
}
