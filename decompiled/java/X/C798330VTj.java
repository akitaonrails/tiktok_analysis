package X;

import kotlin.text.a0;

/* JADX INFO: renamed from: X.0VTj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C798330VTj {
    public static final /* synthetic */ int LIZ = 0;

    public static final long LIZ(long j) {
        if (1 > j || j >= 1073741825) {
            return 0L;
        }
        return j;
    }

    public static final long LIZIZ(long j) {
        if (1 > j || j >= 107374182401L) {
            return 0L;
        }
        return j;
    }

    public static final long LIZJ(long j) {
        if (1 > j || j >= 107374182401L) {
            return 0L;
        }
        return j;
    }

    public static final String LIZLLL(String str) {
        boolean z;
        Long lLJIILIIL;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z || (lLJIILIIL = C2095008Iq.LJIILIIL(str)) == null || lLJIILIIL.longValue() > 104857600) {
            return "-1";
        }
        return str;
    }

    public static long LJ(String str) {
        Long lLJIILIIL;
        if (str != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
            long jLongValue = lLJIILIIL.longValue();
            if (1 <= jLongValue && jLongValue < 104857601) {
                return jLongValue;
            }
            return 0L;
        }
        return -1L;
    }
}
