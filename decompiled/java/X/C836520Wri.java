package X;

import android.telephony.TelephonyCallback;

/* JADX INFO: renamed from: X.0Wri, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C836520Wri extends TelephonyCallback implements TelephonyCallback.DataConnectionStateListener {
    public final /* synthetic */ C836490Wrf LIZ;

    public C836520Wri(C836490Wrf c836490Wrf) {
        this.LIZ = c836490Wrf;
    }

    @Override // android.telephony.TelephonyCallback.DataConnectionStateListener
    public final void onDataConnectionStateChanged(int i, int i2) {
        this.LIZ.getClass();
        C836490Wrf.LIZIZ = i2;
    }
}
