package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0Uyb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C789830Uyb extends C0VG7<C789870Uyf> {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final ConnectivityManager LJFF;
    public final C789840Uyc LJI;
    public final C789820Uya LJII;

    static {
        C0VI8.LIZIZ("NetworkStateTracker");
    }

    @Override // X.C0VG7
    public final void LIZLLL() throws Exception {
        if (Build.VERSION.SDK_INT < 24) {
            C0VI8.LIZ().getClass();
            C786410Ut5.LJIJJ(this.LIZIZ, this.LJII, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            return;
        }
        try {
            C0VI8.LIZ().getClass();
            this.LJFF.registerDefaultNetworkCallback(this.LJI);
        } catch (IllegalArgumentException | SecurityException e) {
            TryCatchGuardChecker.doCheck(e);
            C0VI8.LIZ().getClass();
        }
    }

    @Override // X.C0VG7
    public final void LJ() {
        if (Build.VERSION.SDK_INT < 24) {
            C0VI8.LIZ().getClass();
            C786410Ut5.LJJIFFI(this.LIZIZ, this.LJII);
            return;
        }
        try {
            C0VI8.LIZ().getClass();
            this.LJFF.unregisterNetworkCallback(this.LJI);
        } catch (IllegalArgumentException | SecurityException e) {
            TryCatchGuardChecker.doCheck(e);
            C0VI8.LIZ().getClass();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C789870Uyf LJFF() throws java.lang.Throwable {
        /*
            r8 = this;
            android.net.ConnectivityManager r0 = r8.LJFF
            android.net.NetworkInfo r7 = X.C786410Ut5.LJIJ(r0)
            r4 = 1
            if (r7 == 0) goto L11
            boolean r0 = r7.isConnected()
            if (r0 == 0) goto L11
            r3 = 1
            goto L12
        L11:
            r3 = 0
        L12:
            android.net.ConnectivityManager r0 = r8.LJFF     // Catch: java.lang.SecurityException -> L36
            android.net.Network r6 = r0.getActiveNetwork()     // Catch: java.lang.SecurityException -> L36
            android.net.ConnectivityManager r5 = r8.LJFF     // Catch: java.lang.SecurityException -> L36
            X.0WZX r2 = new X.0WZX     // Catch: java.lang.SecurityException -> L36
            java.lang.String r1 = "dTF6Tg0zW9KSQlgzTlyNa0aIFfTYb0gx1Tnj/qUHighyRha4qDVA0Cfp7tESrjc9snEHsU/eY+WzLJA="
            java.lang.String r0 = "01789"
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch: java.lang.SecurityException -> L36
            r2.<init>(r1, r0)     // Catch: java.lang.SecurityException -> L36
            android.net.NetworkCapabilities r1 = X.C2204961BRm.LJLJL(r5, r6, r2)     // Catch: java.lang.SecurityException -> L36
            if (r1 == 0) goto L41
            r0 = 16
            boolean r0 = r1.hasCapability(r0)     // Catch: java.lang.SecurityException -> L36
            if (r0 == 0) goto L41
            goto L43
        L36:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.0VI8 r0 = X.C0VI8.LIZ()
            r0.getClass()
        L41:
            r2 = 0
            goto L44
        L43:
            r2 = 1
        L44:
            android.net.ConnectivityManager r0 = r8.LJFF
            boolean r1 = r0.isActiveNetworkMetered()
            if (r7 == 0) goto L58
            boolean r0 = r7.isRoaming()
            if (r0 != 0) goto L58
        L52:
            X.0Uyf r0 = new X.0Uyf
            r0.<init>(r3, r2, r1, r4)
            return r0
        L58:
            r4 = 0
            goto L52
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C789830Uyb.LJFF():X.0Uyf");
    }

    @Override // X.C0VG7
    public final C789870Uyf LIZ() {
        return LJFF();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0Uya] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0Uyc] */
    public C789830Uyb(Context context, InterfaceC787600Uv0 interfaceC787600Uv0) {
        super(context, interfaceC787600Uv0);
        this.LJFF = (ConnectivityManager) C786410Ut5.H2(this.LIZIZ, "connectivity");
        if (Build.VERSION.SDK_INT >= 24) {
            this.LJI = new ConnectivityManager.NetworkCallback() { // from class: X.0Uyc
                @Override // android.net.ConnectivityManager.NetworkCallback
                public final void onLost(Network network) {
                    C0VI8.LIZ().getClass();
                    C789830Uyb c789830Uyb = this.LIZ;
                    c789830Uyb.LIZJ(c789830Uyb.LJFF());
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
                    C0VI8 c0vi8LIZ = C0VI8.LIZ();
                    C786410Ut5.j4("Network capabilities changed: %s", new Object[]{networkCapabilities});
                    c0vi8LIZ.getClass();
                    C789830Uyb c789830Uyb = this.LIZ;
                    c789830Uyb.LIZJ(c789830Uyb.LJFF());
                }
            };
        } else {
            this.LJII = new BroadcastReceiver() { // from class: X.0Uya
                public final void LIZ(Intent intent) {
                    if (intent != null && intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                        C0VI8.LIZ().getClass();
                        C789830Uyb c789830Uyb = this.LIZ;
                        c789830Uyb.LIZJ(c789830Uyb.LJFF());
                    }
                }

                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context2, Intent intent) {
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
            };
        }
    }
}
