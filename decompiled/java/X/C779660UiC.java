package X;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0UiC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C779660UiC {
    public static boolean LIZIZ;
    public static C779670UiD LIZJ;
    public static boolean LIZLLL;
    public static boolean LJ;
    public static boolean LJFF;
    public static boolean LJI;
    public static final C779660UiC LIZ = new C779660UiC();
    public static final CopyOnWriteArrayList<InterfaceC779560Ui2> LJII = new CopyOnWriteArrayList<>();

    public final boolean LIZ() {
        if (!LIZIZ) {
            LJI();
        }
        return LJ;
    }

    public final boolean LIZIZ() {
        if (!LIZIZ) {
            LJI();
        }
        return LJI;
    }

    public static void LJII() {
        Context contextLJII = C497740JfY.LJII();
        if (contextLJII == null) {
            return;
        }
        C20441214yg.LJIIIZ("HeadsetDetector", "stop");
        if (LIZIZ) {
            try {
                C786410Ut5.LJJIFFI(contextLJII, LIZJ);
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJI("HeadsetDetector", e);
            }
            LIZIZ = false;
            LIZJ = null;
            LIZLLL = false;
            LJ(false);
            LJFF(false);
            LJI = false;
            LJII.clear();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ() {
        /*
            r2 = this;
            boolean r1 = r2.LIZIZ()
            boolean r0 = r2.LIZ()
            if (r0 != 0) goto L36
            boolean r0 = X.C779660UiC.LIZIZ
            if (r0 != 0) goto L11
            r2.LJI()
        L11:
            boolean r0 = X.C779660UiC.LJFF
            if (r0 != 0) goto L36
            r0 = 0
        L16:
            X.C779660UiC.LJI = r0
            boolean r0 = r2.LIZIZ()
            if (r0 == 0) goto L38
            if (r1 != 0) goto L38
            java.util.concurrent.CopyOnWriteArrayList<X.0Ui2> r0 = X.C779660UiC.LJII
            java.util.Iterator r1 = r0.iterator()
        L26:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L56
            java.lang.Object r0 = r1.next()
            X.0Ui2 r0 = (X.InterfaceC779560Ui2) r0
            r0.LJIIIIZZ()
            goto L26
        L36:
            r0 = 1
            goto L16
        L38:
            boolean r0 = r2.LIZIZ()
            if (r0 != 0) goto L56
            if (r1 == 0) goto L56
            java.util.concurrent.CopyOnWriteArrayList<X.0Ui2> r0 = X.C779660UiC.LJII
            java.util.Iterator r1 = r0.iterator()
        L46:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L56
            java.lang.Object r0 = r1.next()
            X.0Ui2 r0 = (X.InterfaceC779560Ui2) r0
            r0.LIZJ()
            goto L46
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C779660UiC.LIZJ():void");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0UiD] */
    public final void LJI() {
        BluetoothManager bluetoothManager;
        BluetoothAdapter adapter;
        Context contextLJII = C497740JfY.LJII();
        if (contextLJII == null) {
            return;
        }
        C20441214yg.LJIIIZ("HeadsetDetector", "start");
        if (LIZIZ) {
            return;
        }
        LIZIZ = true;
        LIZJ = new BroadcastReceiver() { // from class: X.0UiD
            public static void LIZ(Intent intent) {
                String action = intent.getAction();
                if (action != null) {
                    int iHashCode = action.hashCode();
                    boolean z = true;
                    if (iHashCode != -1676458352) {
                        if (iHashCode == 545516589 && action.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED") && C779660UiC.LIZLLL) {
                            int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
                            C779660UiC c779660UiC = C779660UiC.LIZ;
                            if (intExtra != 1 && intExtra != 2) {
                                z = false;
                            }
                            C779660UiC.LJFF(z);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("wireless change:");
                            if (!C779660UiC.LIZIZ) {
                                c779660UiC.LJI();
                            }
                            sbLIZ.append(C779660UiC.LJFF);
                            C20441214yg.LIZIZ("HeadsetDetector", C2188811AlT.LIZIZ(sbLIZ));
                        }
                    } else if (action.equals("android.intent.action.HEADSET_PLUG") && intent.hasExtra("state")) {
                        C779660UiC c779660UiC2 = C779660UiC.LIZ;
                        if (intent.getIntExtra("state", 0) != 1) {
                            z = false;
                        }
                        C779660UiC.LJ(z);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("wired change:");
                        sbLIZ2.append(c779660UiC2.LIZ());
                        C20441214yg.LIZIZ("HeadsetDetector", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                }
                C779660UiC.LIZ.LIZJ();
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
        };
        IntentFilter intentFilter = new IntentFilter();
        if (Build.VERSION.SDK_INT <= 30) {
            LIZLLL = contextLJII.getPackageManager().checkPermission("android.permission.BLUETOOTH", contextLJII.getPackageName()) == 0;
        } else {
            Activity activityLJIJ = C520010KaN.LJIJ(contextLJII, true);
            if (activityLJIJ != null) {
                LIZLLL = C202002142e.LIZJ(activityLJIJ, "android.permission.BLUETOOTH_CONNECT");
            }
        }
        if (LIZLLL) {
            Object objH2 = C786410Ut5.H2(contextLJII, "bluetooth");
            if ((objH2 instanceof BluetoothManager) && (bluetoothManager = (BluetoothManager) objH2) != null && (adapter = bluetoothManager.getAdapter()) != null) {
                LJFF(2 == adapter.getProfileConnectionState(1) || 1 == adapter.getProfileConnectionState(1));
            }
        }
        intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.intent.action.HEADSET_PLUG");
        Intent intentLJIJJ = C786410Ut5.LJIJJ(contextLJII, LIZJ, intentFilter);
        if (intentLJIJJ != null) {
            LJ(intentLJIJJ.getIntExtra("state", 0) == 1);
        }
        StringBuilder sb = new StringBuilder("bluetoothPermission = ");
        sb.append(LIZLLL);
        sb.append(" , wireless = ");
        if (!LIZIZ) {
            LJI();
        }
        sb.append(LJFF);
        sb.append(" , wired = ");
        sb.append(LIZ());
        C20441214yg.LJIIIZ("HeadsetDetector", sb.toString());
        LIZJ();
    }

    public static void LJ(boolean z) {
        LJ = z;
        Iterator<InterfaceC779560Ui2> it2 = LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LJFF(z);
        }
    }

    public static void LJFF(boolean z) {
        LJFF = z;
        Iterator<InterfaceC779560Ui2> it2 = LJII.iterator();
        while (it2.hasNext()) {
            it2.next().LJFF(z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(X.InterfaceC779560Ui2 r3) {
        /*
            r2 = this;
            java.util.concurrent.CopyOnWriteArrayList<X.0Ui2> r1 = X.C779660UiC.LJII
            boolean r0 = r1.contains(r3)
            if (r0 != 0) goto L23
            boolean r0 = X.C779660UiC.LIZIZ
            if (r0 == 0) goto L20
            boolean r0 = r2.LIZ()
            if (r0 != 0) goto L24
            boolean r0 = X.C779660UiC.LIZIZ
            if (r0 != 0) goto L19
            r2.LJI()
        L19:
            boolean r0 = X.C779660UiC.LJFF
            if (r0 != 0) goto L24
            r3.LIZJ()
        L20:
            r1.add(r3)
        L23:
            return
        L24:
            r3.LJIIIIZZ()
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C779660UiC.LIZLLL(X.0Ui2):void");
    }
}
