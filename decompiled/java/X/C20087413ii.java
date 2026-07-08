package X;

import android.view.ViewConfiguration;

/* JADX INFO: renamed from: X.13ii, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20087413ii {
    public static final float LIZ = ViewConfiguration.getScrollFriction();
    public static final double LIZIZ;
    public static final double LIZJ;

    static {
        double dLog = Math.log(0.78d) / Math.log(0.9d);
        LIZIZ = dLog;
        LIZJ = dLog - 1.0d;
    }
}
