package X;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: renamed from: X.194V, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C194V {
    public static final TimeInterpolator LIZ = new LinearInterpolator();
    public static final C12DM LIZIZ = new C12DM();
    public static final C14JQ LIZJ = new C14JQ();
    public static final C12DN LIZLLL = new C12DN();
    public static final TimeInterpolator LJ = new DecelerateInterpolator();

    public static int LIZ(float f, int i, int i2) {
        return i + Math.round(f * (i2 - i));
    }
}
