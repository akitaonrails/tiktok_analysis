package X;

import android.view.View;

/* JADX INFO: renamed from: X.0l2i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1342620l2i {
    public static final C1342620l2i LIZ = new C1342620l2i();

    public static int LIZ(View view, boolean z, boolean z2, boolean z3) {
        int iLIZ;
        if (!z) {
            if (!z3 && !z2) {
                return C0HD5.LIZ(view, 16);
            }
            int iLIZ2 = C0HD5.LIZ(view, 100) - (view.getWidth() / 2);
            if (z3) {
                iLIZ = C0HD5.LIZ(view, 6);
            } else {
                iLIZ = C0HD5.LIZ(view, 4);
            }
            return iLIZ2 - iLIZ;
        }
        if (z2) {
            return -((C0HD5.LIZ(view, 100) - (view.getWidth() / 2)) + C0HD5.LIZ(view, 6));
        }
        return C0HD5.LIZ(view, 36) + (-(C0HD5.LIZ(view, 100) - (view.getWidth() / 2)));
    }

    public static int LIZIZ(View view, boolean z, boolean z2, boolean z3) {
        int iLIZ;
        if (!z) {
            if (!z3 && !z2) {
                iLIZ = C0HD5.LIZ(view, 5);
            } else {
                return C0HD5.LIZ(view, 8);
            }
        } else {
            iLIZ = C0HD5.LIZ(view, 6);
        }
        return -iLIZ;
    }
}
