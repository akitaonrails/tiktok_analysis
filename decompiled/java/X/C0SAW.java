package X;

/* JADX INFO: renamed from: X.0SAW, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SAW {
    public static C0SAV LIZ(int i, int i2) {
        int iMin = Math.min(i, i2);
        for (C0SAV c0sav : C0SAV.values()) {
            if (iMin < c0sav.maxSize && iMin >= c0sav.minSize) {
                return c0sav;
            }
        }
        return C0SAV.UNKNOWN;
    }
}
