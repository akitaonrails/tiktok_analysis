package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0Wl0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C832360Wl0 {
    public static C832360Wl0 LIZIZ;
    public final C832370Wl1 LIZ;

    public C832360Wl0(Context context) {
        C832370Wl1 c832370Wl1LIZIZ = C832370Wl1.LIZIZ(context);
        this.LIZ = c832370Wl1LIZIZ;
        c832370Wl1LIZIZ.LIZJ();
        c832370Wl1LIZIZ.LIZLLL();
    }

    public static synchronized C832360Wl0 LIZ(Context context) {
        return LIZIZ(C786410Ut5.N3(context));
    }

    public static synchronized C832360Wl0 LIZIZ(Context context) {
        C832360Wl0 c832360Wl0 = LIZIZ;
        if (c832360Wl0 != null) {
            return c832360Wl0;
        }
        C832360Wl0 c832360Wl02 = new C832360Wl0(context);
        LIZIZ = c832360Wl02;
        return c832360Wl02;
    }
}
