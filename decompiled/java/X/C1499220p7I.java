package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.StrictMode;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect;
import java.io.IOException;
import java.net.Socket;

/* JADX INFO: renamed from: X.0p7I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1499220p7I {
    public final ConnectivityManager LIZ;

    /* JADX WARN: Removed duplicated region for block: B:30:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.net.Network LIZIZ() {
        /*
            r12 = this;
            r7 = 0
            android.net.ConnectivityManager r0 = r12.LIZ     // Catch: java.lang.Throwable -> L8
            android.net.Network r9 = r0.getActiveNetwork()     // Catch: java.lang.Throwable -> L8
            goto Ld
        L8:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r9 = r7
        Ld:
            if (r9 == 0) goto L10
            return r9
        L10:
            android.net.ConnectivityManager r0 = r12.LIZ     // Catch: java.lang.Throwable -> L7a
            android.net.NetworkInfo r8 = X.C786410Ut5.LJIJ(r0)     // Catch: java.lang.Throwable -> L7a
            if (r8 != 0) goto L19
            return r7
        L19:
            android.net.Network[] r6 = com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.LIZJ(r12, r7)
            int r5 = r6.length
            r4 = 0
            r3 = 0
        L20:
            if (r3 >= r5) goto L79
            r2 = r6[r3]
            android.net.NetworkInfo r10 = r12.LJ(r2)
            if (r10 == 0) goto L76
            X.0WZX r0 = new X.0WZX
            java.lang.String r11 = "dzBzEhYuUc/IG1gzQlyHbinQDwNaKWb3VzYjk49GzPUpLBq0fhBLm3343kQlGMFQAH1YwgAxFPed5Q=="
            r0.<init>(r11, r7)
            int r1 = X.C2204961BRm.LJLLILLLL(r10, r0)
            X.0WZX r0 = new X.0WZX
            r0.<init>(r11, r7)
            int r0 = X.C2204961BRm.LJLLILLLL(r8, r0)
            if (r1 == r0) goto L4d
            X.0WZX r0 = new X.0WZX
            r0.<init>(r11, r7)
            int r1 = X.C2204961BRm.LJLLILLLL(r10, r0)
            r0 = 17
            if (r1 != r0) goto L76
        L4d:
            if (r9 == 0) goto L6c
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L6c
            android.net.NetworkInfo$DetailedState r1 = r10.getDetailedState()
            android.net.NetworkInfo$DetailedState r0 = android.net.NetworkInfo.DetailedState.CONNECTING
            if (r1 == r0) goto L76
            android.net.NetworkInfo r0 = r12.LJ(r9)
            if (r0 == 0) goto L6c
            android.net.NetworkInfo$DetailedState r1 = r0.getDetailedState()
            android.net.NetworkInfo$DetailedState r0 = android.net.NetworkInfo.DetailedState.CONNECTING
            if (r1 != r0) goto L6c
            r9 = r7
        L6c:
            if (r9 == 0) goto L75
            java.lang.String r1 = "defaultNetwork != null"
            java.lang.Object[] r0 = new java.lang.Object[r4]
            X.C08VH.LIZ(r1, r0)
        L75:
            r9 = r2
        L76:
            int r3 = r3 + 1
            goto L20
        L79:
            return r9
        L7a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1499220p7I.LIZIZ():android.net.Network");
    }

    public C1499220p7I(Context context) {
        this.LIZ = (ConnectivityManager) C786410Ut5.H2(context, "connectivity");
    }

    public static boolean LJFF(Network network) {
        Socket socket = new Socket();
        try {
            try {
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                C09NE c09ne = new C09NE(null, vmPolicy);
                try {
                    network.bindSocket(socket);
                    c09ne.close();
                    try {
                        socket.close();
                        return true;
                    } catch (IOException e) {
                        TryCatchGuardChecker.doCheck(e);
                        return true;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    try {
                        c09ne.close();
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                try {
                    socket.close();
                    throw th3;
                } catch (IOException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    throw th3;
                }
            }
        } catch (IOException e3) {
            TryCatchGuardChecker.doCheck(e3);
            try {
                socket.close();
                return false;
            } catch (IOException e4) {
                TryCatchGuardChecker.doCheck(e4);
                return false;
            }
        }
    }

    public final int LIZ(Network network) {
        NetworkInfo networkInfoLIZLLL = LIZLLL(network);
        if (networkInfoLIZLLL != null && networkInfoLIZLLL.isConnected()) {
            return NetworkChangeNotifierAutoDetect.LIZIZ(C2204961BRm.LJLLILLLL(networkInfoLIZLLL, new C0WZX("dzBzEhYuUc/IG1gzQlyHbinQDwNaKWb3VzYjk49GzPUpLBq0fhBLm3343kQlGMFQAH1YwgAxFPed5Q==", null)), C2204961BRm.LJLL(networkInfoLIZLLL, new C0WZX("dzBzEhYuUc/IG1gzQlyHbinQDwNaKWb3VzYjk49GzPUpLBq0fhBLm3343kQlGMFQAH1YwgAxFPed5Q==", null)));
        }
        return 6;
    }

    public final NetworkCapabilities LIZJ(Network network) {
        for (int i = 0; i < 2; i++) {
            try {
                return C2204961BRm.LJLJL(this.LIZ, network, new C0WZX("dzBzEhYuUc/IG1gzQlyHbinQDwNaKWb3VzYjk49GzPUpLBq0fhBLm3343kQlGMFQAH1YwgAxFPed5Q==", null));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return null;
    }

    public final NetworkInfo LIZLLL(Network network) {
        NetworkInfo networkInfoLJ = LJ(network);
        if (networkInfoLJ != null && C2204961BRm.LJLLILLLL(networkInfoLJ, new C0WZX("dzBzEhYuUc/IG1gzQlyHbinQDwNaKWb3VzYjk49GzPUpLBq0fhBLm3343kQlGMFQAH1YwgAxFPed5Q==", null)) == 17) {
            try {
                return C786410Ut5.LJIJ(this.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return null;
            }
        }
        return networkInfoLJ;
    }

    public final NetworkInfo LJ(Network network) {
        try {
            return C786410Ut5.z4(this.LIZ, network);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            try {
                return C786410Ut5.z4(this.LIZ, network);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                return null;
            }
        }
    }
}
