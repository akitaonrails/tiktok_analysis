package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.12aE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19780012aE extends BroadcastReceiver {
    public final C12Z4 LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;

    public final void LIZIZ() {
        this.LIZ.LJJJLL();
        this.LIZ.LJIIL().LJ();
        this.LIZ.LJIIL().LJ();
        if (this.LIZIZ) {
            this.LIZ.LJIILJJIL().LJIILIIL.LIZJ("Unregistering connectivity change receiver");
            this.LIZIZ = false;
            this.LIZJ = false;
            try {
                C786410Ut5.LJJIFFI(this.LIZ.LJIIJJI.LIZ, this);
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                this.LIZ.LJIILJJIL().LJFF.LIZ(e, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    public C19780012aE(C12Z4 c12z4) {
        this.LIZ = c12z4;
    }

    public final void LIZ(Intent intent) {
        this.LIZ.LJJJLL();
        String action = intent.getAction();
        this.LIZ.LJIILJJIL().LJIILIIL.LIZ(action, "NetworkBroadcastReceiver received action");
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            C19800912db c19800912db = this.LIZ.LIZIZ;
            C12Z4.LJJII(c19800912db);
            final boolean zLJIILIIL = c19800912db.LJIILIIL();
            if (this.LIZJ != zLJIILIIL) {
                this.LIZJ = zLJIILIIL;
                this.LIZ.LJIIL().LJIILL(new Runnable(zLJIILIIL) { // from class: X.12Zl
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("zzgj@38e4.run");
                        try {
                            this.LL.LIZ.LJJIIZI();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("zzgj@38e4.run");
                    }
                });
                return;
            }
            return;
        }
        this.LIZ.LJIILJJIL().LJIIIIZZ.LIZ(action, "NetworkBroadcastReceiver received unknown action");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LIZ(intent);
        } else {
            C2408409cA.LIZ();
            LIZ(intent);
        }
    }
}
