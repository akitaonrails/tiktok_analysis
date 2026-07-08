package X;

import android.content.res.Resources;

/* JADX INFO: renamed from: X.0gVb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1168330gVb {
    public static C1168340gVc LIZIZ(boolean z) {
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = Resources.getSystem().getDisplayMetrics().scaledDensity;
        if (!z) {
            f2 = f;
        }
        return new C1168340gVc(f2, f);
    }

    public static C1168340gVc LIZ(float f, float f2, float f3) {
        if (f > 0.0f && f3 > 0.0f && f2 > 0.0f) {
            int i = Resources.getSystem().getDisplayMetrics().widthPixels;
            int i2 = Resources.getSystem().getDisplayMetrics().heightPixels;
            if (i > i2) {
                i = i2;
            }
            float f4 = i / f;
            return new C1168340gVc(f3 * f4, f2 * f4);
        }
        C1325860kbg.LIZIZ(null, new C1162680gMU(f, f2, f3), C2097608Jq.LJ());
        Resources.getSystem().getDisplayMetrics();
        return new C1168340gVc(Resources.getSystem().getDisplayMetrics().scaledDensity, Resources.getSystem().getDisplayMetrics().density);
    }
}
