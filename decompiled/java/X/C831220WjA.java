package X;

import android.content.Context;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: X.0WjA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C831220WjA {
    public final SparseIntArray LIZ = new SparseIntArray();
    public final C829100Wfk LIZIZ;

    public C831220WjA(C829100Wfk c829100Wfk) {
        C0W3J.LJIIIIZZ(c829100Wfk);
        this.LIZIZ = c829100Wfk;
    }

    public final int LIZ(Context context, InterfaceC831160Wj4 interfaceC831160Wj4) {
        C0W3J.LJIIIIZZ(context);
        C0W3J.LJIIIIZZ(interfaceC831160Wj4);
        if (!interfaceC831160Wj4.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = interfaceC831160Wj4.getMinApkVersion();
        int iIsGooglePlayServicesAvailable = this.LIZ.get(minApkVersion, -1);
        if (iIsGooglePlayServicesAvailable == -1) {
            int i = 0;
            while (true) {
                if (i < this.LIZ.size()) {
                    int iKeyAt = this.LIZ.keyAt(i);
                    if (iKeyAt > minApkVersion && this.LIZ.get(iKeyAt) == 0) {
                        iIsGooglePlayServicesAvailable = 0;
                        break;
                    }
                    i++;
                } else {
                    iIsGooglePlayServicesAvailable = this.LIZIZ.isGooglePlayServicesAvailable(context, minApkVersion);
                    break;
                }
            }
            this.LIZ.put(minApkVersion, iIsGooglePlayServicesAvailable);
        }
        return iIsGooglePlayServicesAvailable;
    }
}
