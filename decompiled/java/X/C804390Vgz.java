package X;

import Y.ARunnableS113S0100000_13;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.telephony.PhoneStateListener;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0Vgz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C804390Vgz {
    public TelephonyManager LIZ;
    public C804380Vgy LIZIZ;
    public final AtomicInteger LIZJ = new AtomicInteger(-1);
    public volatile int LIZLLL = -1;

    public final int LIZ() {
        return this.LIZJ.get();
    }

    public final void LIZIZ() {
        C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new ARunnableS113S0100000_13(this, 244));
    }

    public final void LIZJ(Context context) {
        this.LIZLLL = -1;
        ConnectivityManager connectivityManager = (ConnectivityManager) C786410Ut5.H2(context, "connectivity");
        this.LIZ = (TelephonyManager) C786410Ut5.H2(context, "phone");
        LIZLLL(SubscriptionManager.getDefaultDataSubscriptionId());
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        builder.addCapability(12).addTransportType(0);
        connectivityManager.registerNetworkCallback(builder.build(), new ConnectivityManager.NetworkCallback() { // from class: X.0Vh0
            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onAvailable(Network network) throws Throwable {
                super.onAvailable(network);
                int defaultDataSubscriptionId = SubscriptionManager.getDefaultDataSubscriptionId();
                if (defaultDataSubscriptionId != this.LIZ.LIZLLL) {
                    this.LIZ.LIZLLL(defaultDataSubscriptionId);
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onLost(Network network) {
                super.onLost(network);
                this.LIZ.LIZJ.set(-1);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0Vgy] */
    public final void LIZLLL(int i) throws Throwable {
        this.LIZ.createForSubscriptionId(i);
        this.LIZLLL = i;
        this.LIZJ.set(C2204961BRm.LLIILII(this.LIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOapbZzLyHyp5ssDB2nYTllQ9ZVuELJmtcxKqe90GUlnk/dh0PBSGA==", null)));
        C804380Vgy c804380Vgy = this.LIZIZ;
        if (c804380Vgy != null) {
            C2204961BRm.LLILIL(this.LIZ, c804380Vgy, 0, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOapbZzLyHyp5ssDB2nYTllQ9ZVuELJmtcxKqe90GUlnk/dh0PBSGA==", null));
        } else {
            this.LIZIZ = new PhoneStateListener() { // from class: X.0Vgy
                @Override // android.telephony.PhoneStateListener
                public final void onDataConnectionStateChanged(int i2, int i3) {
                    super.onDataConnectionStateChanged(i2, i3);
                    this.LIZ.LIZJ.set(i3);
                }
            };
        }
        C2204961BRm.LLILIL(this.LIZ, this.LIZIZ, 64, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOapbZzLyHyp5ssDB2nYTllQ9ZVuELJmtcxKqe90GUlnk/dh0PBSGA==", null));
    }
}
