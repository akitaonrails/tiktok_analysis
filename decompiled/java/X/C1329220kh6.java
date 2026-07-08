package X;

import android.util.SparseIntArray;

/* JADX INFO: renamed from: X.0kh6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1329220kh6 {
    public static final SparseIntArray LIZ = new SparseIntArray(0);

    public static C1329300khE LIZ() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        return new C1329300khE(0, iMin > 16777216 ? (iMin / 4) * 3 : iMin / 2, LIZ);
    }
}
