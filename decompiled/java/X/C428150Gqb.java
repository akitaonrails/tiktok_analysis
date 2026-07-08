package X;

import android.view.View;

/* JADX INFO: renamed from: X.0Gqb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C428150Gqb {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(View view, EnumC428940Grs enumC428940Grs, float f) {
        int i = C428170Gqd.LIZ[enumC428940Grs.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        if (view != null) {
                            C427690Gpr.LJII(view);
                            return;
                        }
                        return;
                    }
                    throw new C1954807lC();
                }
                if (view == null) {
                    return;
                }
                C427690Gpr.LJFF(view, f);
                return;
            }
            if (view == null) {
                return;
            }
            C427690Gpr.LJ(view, f);
            return;
        }
        if (view == null) {
            return;
        }
        C427690Gpr.LJI(view, null);
    }
}
