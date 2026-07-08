package X;

import android.app.Activity;

/* JADX INFO: renamed from: X.0lpB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1372670lpB {
    public static void LIZ(C1371600lnS c1371600lnS, boolean z, Activity activity, int i) {
        boolean z2 = true;
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            activity = C2214201BlK.LJFF();
        }
        if ((i & 4) == 0) {
            z2 = false;
        }
        C1374540lsC.LIZIZ(c1371600lnS, z, activity, z2, false);
    }
}
