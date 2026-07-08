package X;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: renamed from: X.0WlK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C832560WlK implements InterfaceC832240Wko {
    public final /* synthetic */ AbstractC832390Wl3 LIZ;

    public C832560WlK(AbstractC832390Wl3 abstractC832390Wl3) {
        this.LIZ = abstractC832390Wl3;
    }

    @Override // X.InterfaceC832240Wko
    public final void LIZ(ConnectionResult connectionResult) {
        if (connectionResult.LLFFF()) {
            AbstractC832390Wl3 abstractC832390Wl3 = this.LIZ;
            abstractC832390Wl3.getRemoteService(null, abstractC832390Wl3.getScopes());
        } else if (this.LIZ.zzx != null) {
            this.LIZ.zzx.LJJJZ(connectionResult);
        }
    }
}
