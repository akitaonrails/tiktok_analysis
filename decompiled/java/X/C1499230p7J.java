package X;

import Y.ARunnableS23S0100100_23;
import Y.ARunnableS23S0210000_23;
import Y.ARunnableS34S0101000_23;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ttnet.org.chromium.base.TraceEvent;
import com.ttnet.org.chromium.net.NetworkChangeNotifier;
import com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect;

/* JADX INFO: renamed from: X.0p7J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1499230p7J extends ConnectivityManager.NetworkCallback {
    public Network LIZ;
    public final /* synthetic */ NetworkChangeNotifierAutoDetect LIZIZ;

    public C1499230p7J(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        this.LIZIZ = networkChangeNotifierAutoDetect;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        Network network2;
        TraceEvent traceEventLIZ = TraceEvent.LIZ("NetworkChangeNotifierCallback::onAvailable");
        try {
            NetworkCapabilities networkCapabilitiesLIZJ = this.LIZIZ.LJI.LIZJ(network);
            if (LIZ(network, networkCapabilitiesLIZJ)) {
                if (traceEventLIZ != null) {
                    traceEventLIZ.close();
                    return;
                }
                return;
            }
            final boolean z = false;
            if (networkCapabilitiesLIZJ != null && networkCapabilitiesLIZJ.hasTransport(4) && ((network2 = this.LIZ) == null || !network.equals(network2))) {
                z = true;
            }
            if (z) {
                this.LIZ = network;
            }
            final long jLJ = NetworkChangeNotifierAutoDetect.LJ(network);
            final int iLIZ = this.LIZIZ.LJI.LIZ(network);
            this.LIZIZ.LJFF(new Runnable() { // from class: X.0p7L
                public final void LIZ() {
                    InterfaceC1499200p7G interfaceC1499200p7G = this.LLILZ.LIZIZ.LIZLLL;
                    ((C1499180p7E) interfaceC1499200p7G).LIZ.LIZLLL(iLIZ, jLJ, z);
                    if (z) {
                        InterfaceC1499200p7G interfaceC1499200p7G2 = this.LLILZ.LIZIZ.LIZLLL;
                        int i = iLIZ;
                        NetworkChangeNotifier networkChangeNotifier = ((C1499180p7E) interfaceC1499200p7G2).LIZ;
                        networkChangeNotifier.LIZLLL = i;
                        networkChangeNotifier.LIZJ(i, networkChangeNotifier.getCurrentDefaultNetId());
                        ((C1499180p7E) this.LLILZ.LIZIZ.LIZLLL).LIZ.LJI(new long[]{jLJ});
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("NetworkChangeNotifierAutoDetect$MyNetworkCallback@2051.onAvailable$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("NetworkChangeNotifierAutoDetect$MyNetworkCallback@2051.onAvailable$1");
                }
            });
            if (traceEventLIZ != null) {
                traceEventLIZ.close();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (traceEventLIZ != null) {
                try {
                    traceEventLIZ.close();
                    throw th;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    th.addSuppressed(th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        TraceEvent traceEventLIZ = TraceEvent.LIZ("NetworkChangeNotifierCallback::onLost");
        try {
            Network network2 = this.LIZ;
            boolean z = true;
            if (network2 != null && !network2.equals(network)) {
                if (traceEventLIZ != null) {
                    traceEventLIZ.close();
                    return;
                }
                return;
            }
            Network network3 = this.LIZ;
            if (network3 == null || !network3.equals(network)) {
                z = false;
            }
            this.LIZIZ.LJFF(new ARunnableS23S0210000_23(network, this, z, 1));
            if (this.LIZ != null) {
                this.LIZ = null;
                for (Network network4 : NetworkChangeNotifierAutoDetect.LIZJ(this.LIZIZ.LJI, network)) {
                    onAvailable(network4);
                }
                this.LIZIZ.LJFF(new ARunnableS34S0101000_23(this, this.LIZIZ.LIZLLL().LIZIZ(), 3));
            }
            if (traceEventLIZ != null) {
                traceEventLIZ.close();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (traceEventLIZ != null) {
                try {
                    traceEventLIZ.close();
                    throw th;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    th.addSuppressed(th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    public final boolean LIZ(Network network, NetworkCapabilities networkCapabilities) {
        Network network2 = this.LIZ;
        if ((network2 != null && !network2.equals(network)) || (networkCapabilities == null && (networkCapabilities = this.LIZIZ.LJI.LIZJ(network)) == null)) {
            return true;
        }
        if (networkCapabilities.hasTransport(4)) {
            this.LIZIZ.LJI.getClass();
            if (!C1499220p7I.LJFF(network)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        final boolean z;
        TraceEvent traceEventLIZ = TraceEvent.LIZ("NetworkChangeNotifierCallback::onCapabilitiesChanged");
        try {
            if (LIZ(network, networkCapabilities)) {
                if (traceEventLIZ != null) {
                    traceEventLIZ.close();
                    return;
                }
                return;
            }
            final long jLJ = NetworkChangeNotifierAutoDetect.LJ(network);
            final int iLIZ = this.LIZIZ.LJI.LIZ(network);
            Network network2 = this.LIZ;
            if (network2 != null && network2.equals(network)) {
                z = true;
            } else {
                z = false;
            }
            this.LIZIZ.LJFF(new Runnable() { // from class: X.0p7O
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("NetworkChangeNotifierAutoDetect$MyNetworkCallback@2051.onCapabilitiesChanged$1");
                    try {
                        InterfaceC1499200p7G interfaceC1499200p7G = this.LLILZ.LIZIZ.LIZLLL;
                        long j = jLJ;
                        ((C1499180p7E) interfaceC1499200p7G).LIZ.LIZLLL(iLIZ, j, z);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("NetworkChangeNotifierAutoDetect$MyNetworkCallback@2051.onCapabilitiesChanged$1");
                }
            });
            if (traceEventLIZ != null) {
                traceEventLIZ.close();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (traceEventLIZ != null) {
                try {
                    traceEventLIZ.close();
                    throw th;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    th.addSuppressed(th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLosing(Network network, int i) {
        TraceEvent traceEventLIZ = TraceEvent.LIZ("NetworkChangeNotifierCallback::onLosing");
        try {
            if (LIZ(network, null)) {
                if (traceEventLIZ != null) {
                    traceEventLIZ.close();
                }
            } else {
                this.LIZIZ.LJFF(new ARunnableS23S0100100_23(NetworkChangeNotifierAutoDetect.LJ(network), this, 3));
                if (traceEventLIZ != null) {
                    traceEventLIZ.close();
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (traceEventLIZ != null) {
                try {
                    traceEventLIZ.close();
                    throw th;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    th.addSuppressed(th2);
                    throw th;
                }
            }
            throw th;
        }
    }
}
