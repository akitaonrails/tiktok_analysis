package X;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: renamed from: X.0WlL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC832570WlL extends AbstractC832580WlM {
    public final int LIZLLL;
    public final Bundle LJ;
    public final /* synthetic */ AbstractC832390Wl3 LJFF;

    @Override // X.AbstractC832580WlM
    public final void LIZIZ() {
    }

    public abstract void LJ(ConnectionResult connectionResult);

    public abstract boolean LJFF();

    @Override // X.AbstractC832580WlM
    public final /* bridge */ /* synthetic */ void LIZ() {
        if (this.LIZLLL != 0) {
            this.LJFF.zzp(1, null);
            Bundle bundle = this.LJ;
            LJ(new ConnectionResult(this.LIZLLL, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
        } else {
            if (LJFF()) {
                return;
            }
            this.LJFF.zzp(1, null);
            LJ(new ConnectionResult(8, null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC832570WlL(AbstractC832390Wl3 abstractC832390Wl3, int i, Bundle bundle) {
        super(abstractC832390Wl3, Boolean.TRUE);
        this.LJFF = abstractC832390Wl3;
        this.LIZLLL = i;
        this.LJ = bundle;
    }
}
