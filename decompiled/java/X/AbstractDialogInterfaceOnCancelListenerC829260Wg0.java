package X;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.internal.base.zaq;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.0Wg0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractDialogInterfaceOnCancelListenerC829260Wg0 extends LifecycleCallback implements DialogInterface.OnCancelListener {
    public volatile boolean LLILLJJLI;
    public final AtomicReference<C829280Wg2> LLILLL;
    public final zaq LLILZ;
    public final GoogleApiAvailability LLILZIL;

    public abstract void LJIIIZ(ConnectionResult connectionResult, int i);

    public abstract void LJIIJ();

    public final void LJIIJJI() {
        this.LLILLL.set(null);
        LJIIJ();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void LJ(Bundle bundle) {
        C829280Wg2 c829280Wg2;
        if (bundle != null) {
            AtomicReference<C829280Wg2> atomicReference = this.LLILLL;
            if (bundle.getBoolean("resolving_error", false)) {
                c829280Wg2 = new C829280Wg2(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1));
            } else {
                c829280Wg2 = null;
            }
            atomicReference.set(c829280Wg2);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void LJI(Bundle bundle) {
        C829280Wg2 c829280Wg2 = this.LLILLL.get();
        if (c829280Wg2 == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", c829280Wg2.LIZ);
        bundle.putInt("failed_status", c829280Wg2.LIZIZ.zzb);
        C786410Ut5.LJJIJL(bundle, "failed_resolution", c829280Wg2.LIZIZ.zzc);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i;
        ConnectionResult connectionResult = new ConnectionResult(13, null);
        C829280Wg2 c829280Wg2 = this.LLILLL.get();
        if (c829280Wg2 == null) {
            i = -1;
        } else {
            i = c829280Wg2.LIZ;
        }
        this.LLILLL.set(null);
        LJIIIZ(connectionResult, i);
    }

    public AbstractDialogInterfaceOnCancelListenerC829260Wg0(InterfaceC831130Wj1 interfaceC831130Wj1, GoogleApiAvailability googleApiAvailability) {
        super(interfaceC831130Wj1);
        this.LLILLL = new AtomicReference<>(null);
        this.LLILZ = new zaq(Looper.getMainLooper());
        this.LLILZIL = googleApiAvailability;
    }

    public final void LJIIL(ConnectionResult connectionResult, int i) {
        C829280Wg2 c829280Wg2 = new C829280Wg2(connectionResult, i);
        AtomicReference<C829280Wg2> atomicReference = this.LLILLL;
        while (!atomicReference.compareAndSet(null, c829280Wg2)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        C786410Ut5.LJJZZIII(this.LLILZ, new RunnableC829250Wfz(this, c829280Wg2));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void LIZLLL(int i, int i2, Intent intent) {
        C829280Wg2 c829280Wg2 = this.LLILLL.get();
        if (i != 1) {
            if (i == 2) {
                int iB4 = C786410Ut5.b4(this.LLILZIL, LIZIZ());
                if (iB4 == 0) {
                    LJIIJJI();
                    return;
                } else {
                    if (c829280Wg2 == null) {
                        return;
                    }
                    if (c829280Wg2.LIZIZ.zzb == 18 && iB4 == 18) {
                        return;
                    }
                }
            }
            ConnectionResult connectionResult = c829280Wg2.LIZIZ;
            int i3 = c829280Wg2.LIZ;
            this.LLILLL.set(null);
            LJIIIZ(connectionResult, i3);
        }
        if (i2 == -1) {
            LJIIJJI();
            return;
        }
        if (i2 == 0) {
            if (c829280Wg2 == null) {
                return;
            }
            int intExtra = 13;
            if (intent != null) {
                intExtra = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
            }
            ConnectionResult connectionResult2 = new ConnectionResult(1, intExtra, c829280Wg2.LIZIZ.toString(), null);
            int i4 = c829280Wg2.LIZ;
            this.LLILLL.set(null);
            LJIIIZ(connectionResult2, i4);
            return;
        }
        if (c829280Wg2 == null) {
            return;
        }
        ConnectionResult connectionResult3 = c829280Wg2.LIZIZ;
        int i32 = c829280Wg2.LIZ;
        this.LLILLL.set(null);
        LJIIIZ(connectionResult3, i32);
    }
}
