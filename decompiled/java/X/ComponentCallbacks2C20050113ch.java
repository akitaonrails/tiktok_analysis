package X;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* JADX INFO: renamed from: X.13ch, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class ComponentCallbacks2C20050113ch implements ComponentCallbacks2 {
    public static boolean LL = true;

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        if (LL) {
            LL = false;
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C01MD("onLowMemory", null), 2);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        String strValueOf = String.valueOf(i);
        if (LL) {
            LL = false;
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C01MD(strValueOf, null), 2);
        }
    }
}
