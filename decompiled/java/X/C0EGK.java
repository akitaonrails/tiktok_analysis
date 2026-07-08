package X;

import android.content.res.Resources;

/* JADX INFO: renamed from: X.0EGK, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EGK {
    public static final /* synthetic */ int LIZ = 0;

    public static float LIZIZ() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static int LIZ(int i) {
        return (int) ((i * LIZIZ()) + 0.5f);
    }
}
