package X;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect;

/* JADX INFO: renamed from: X.0p7H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1499210p7H {
    public NetworkChangeNotifierAutoDetect LIZ;

    public abstract void LIZ();

    public abstract void LIZIZ(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect);

    public final void LIZJ() {
        NetworkCapabilities networkCapabilitiesLIZJ;
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.LIZ;
        if (networkChangeNotifierAutoDetect.LJIIIZ) {
            networkChangeNotifierAutoDetect.LIZ(networkChangeNotifierAutoDetect.LIZLLL());
            return;
        }
        if (networkChangeNotifierAutoDetect.LJIIL) {
            networkChangeNotifierAutoDetect.LIZ(networkChangeNotifierAutoDetect.LIZLLL());
        }
        ConnectivityManager.NetworkCallback networkCallback = networkChangeNotifierAutoDetect.LJFF;
        if (networkCallback != null) {
            try {
                C1499220p7I c1499220p7I = networkChangeNotifierAutoDetect.LJI;
                BPEAHandler bPEAHandler = networkChangeNotifierAutoDetect.LIZIZ;
                c1499220p7I.getClass();
                try {
                    c1499220p7I.LIZ.registerDefaultNetworkCallback(networkCallback, bPEAHandler);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
                networkChangeNotifierAutoDetect.LJFF = null;
            }
        }
        if (networkChangeNotifierAutoDetect.LJFF == null) {
            try {
                networkChangeNotifierAutoDetect.LJIIJJI = C786410Ut5.LJIJJ(C787230UuP.LIZ, networkChangeNotifierAutoDetect, networkChangeNotifierAutoDetect.LIZJ) != null;
            } catch (RuntimeException e2) {
                TryCatchGuardChecker.doCheck(e2);
                networkChangeNotifierAutoDetect.LJIIJJI = false;
            }
        }
        networkChangeNotifierAutoDetect.LJIIIZ = true;
        C1499230p7J c1499230p7J = networkChangeNotifierAutoDetect.LJII;
        if (c1499230p7J != null) {
            Network[] networkArrLIZJ = NetworkChangeNotifierAutoDetect.LIZJ(c1499230p7J.LIZIZ.LJI, null);
            c1499230p7J.LIZ = null;
            if (networkArrLIZJ.length == 1 && (networkCapabilitiesLIZJ = c1499230p7J.LIZIZ.LJI.LIZJ(networkArrLIZJ[0])) != null && networkCapabilitiesLIZJ.hasTransport(4)) {
                c1499230p7J.LIZ = networkArrLIZJ[0];
            }
            try {
                C1499220p7I c1499220p7I2 = networkChangeNotifierAutoDetect.LJI;
                NetworkRequest networkRequest = networkChangeNotifierAutoDetect.LJIIIIZZ;
                C1499230p7J c1499230p7J2 = networkChangeNotifierAutoDetect.LJII;
                BPEAHandler bPEAHandler2 = networkChangeNotifierAutoDetect.LIZIZ;
                c1499220p7I2.getClass();
                try {
                    if (Build.VERSION.SDK_INT >= 26) {
                        c1499220p7I2.LIZ.registerNetworkCallback(networkRequest, c1499230p7J2, bPEAHandler2);
                    } else {
                        c1499220p7I2.LIZ.registerNetworkCallback(networkRequest, c1499230p7J2);
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            } catch (RuntimeException e3) {
                TryCatchGuardChecker.doCheck(e3);
                networkChangeNotifierAutoDetect.LJIILIIL = true;
                networkChangeNotifierAutoDetect.LJII = null;
            }
            if (networkChangeNotifierAutoDetect.LJIILIIL || !networkChangeNotifierAutoDetect.LJIIL) {
                return;
            }
            Network[] networkArrLIZJ2 = NetworkChangeNotifierAutoDetect.LIZJ(networkChangeNotifierAutoDetect.LJI, null);
            long[] jArr = new long[networkArrLIZJ2.length];
            for (int i = 0; i < networkArrLIZJ2.length; i++) {
                jArr[i] = NetworkChangeNotifierAutoDetect.LJ(networkArrLIZJ2[i]);
            }
            ((C1499180p7E) networkChangeNotifierAutoDetect.LIZLLL).LIZ.LJI(jArr);
        }
    }
}
