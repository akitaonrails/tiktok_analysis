package X;

import android.content.Context;
import android.content.res.Resources;

/* JADX INFO: renamed from: X.0Daq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C341940Daq {
    public static int LIZ(double d) {
        Resources resources;
        Context applicationContext = C2213981Bky.LIZIZ.getApplicationContext();
        if (applicationContext != null && (resources = applicationContext.getResources()) != null && resources.getDisplayMetrics() != null) {
            return (int) ((d * ((double) resources.getDisplayMetrics().density)) + 0.5d);
        }
        return 0;
    }

    public static int LIZIZ(double d) {
        return (int) ((d / ((double) C2213981Bky.LIZIZ.getApplicationContext().getResources().getDisplayMetrics().density)) + 0.5d);
    }

    public static int LIZJ(double d) {
        return (int) ((d * ((double) C2213981Bky.LIZIZ.getApplicationContext().getResources().getDisplayMetrics().scaledDensity)) + 0.5d);
    }
}
