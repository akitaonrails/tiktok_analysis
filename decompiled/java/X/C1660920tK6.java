package X;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS62S0010000_25;

/* JADX INFO: renamed from: X.0tK6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1660920tK6 {
    public static Context LIZ;
    public static C1660930tK7 LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static boolean LJ;
    public static boolean LJFF;
    public static final ArrayList<InterfaceC1621930sJD> LJI = new ArrayList<>();

    public static boolean LIZ() {
        BluetoothAdapter defaultAdapter;
        if (!LIZJ) {
            return false;
        }
        BluetoothAdapter defaultAdapter2 = BluetoothAdapter.getDefaultAdapter();
        return (defaultAdapter2 != null && 2 == defaultAdapter2.getProfileConnectionState(1)) || ((defaultAdapter = BluetoothAdapter.getDefaultAdapter()) != null && 1 == defaultAdapter.getProfileConnectionState(1));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0tK7] */
    public static void LIZIZ(Context context) {
        boolean z;
        Intent intentLJIJJ;
        if (LIZIZ != null) {
            return;
        }
        LIZ = C786410Ut5.N3(context);
        LIZIZ = new BroadcastReceiver() { // from class: X.0tK7
            public static void LIZ(Intent intent) {
                String action;
                boolean z2 = true;
                if (!C1660920tK6.LIZLLL && !C1660920tK6.LJ && C1660920tK6.LIZ()) {
                    C01TT.LIZLLL(new AwS62S0010000_25(true, 0));
                }
                if (intent != null && (action = intent.getAction()) != null) {
                    int iHashCode = action.hashCode();
                    if (iHashCode != -1676458352) {
                        if (iHashCode == 545516589 && action.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED") && C1660920tK6.LIZJ) {
                            int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
                            if (intExtra != 1 && intExtra != 2) {
                                z2 = false;
                            }
                            if (C1660920tK6.LJ != z2) {
                                C1660920tK6.LJ = z2;
                                C01TT.LIZLLL(new AwS62S0010000_25(z2, 0));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (!action.equals("android.intent.action.HEADSET_PLUG") || !intent.hasExtra("state")) {
                        return;
                    }
                    if (intent.getIntExtra("state", 0) != 1) {
                        z2 = false;
                    }
                    if (C1660920tK6.LIZLLL == z2) {
                        return;
                    }
                    C1660920tK6.LIZLLL = z2;
                    C01TT.LIZLLL(new AwS62S0010000_25(z2, 1));
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
        boolean z2 = false;
        if (Build.VERSION.SDK_INT < 31 ? context.getPackageManager().checkPermission("android.permission.BLUETOOTH", context.getPackageName()) == 0 : context.getPackageManager().checkPermission("android.permission.BLUETOOTH_CONNECT", context.getPackageName()) == 0) {
            z = true;
        } else {
            z = false;
        }
        LIZJ = z;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.HEADSET_PLUG");
        intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        Context context2 = LIZ;
        if (context2 != null && (intentLJIJJ = C786410Ut5.LJIJJ(context2, LIZIZ, intentFilter)) != null) {
            if (intentLJIJJ.getIntExtra("state", 0) == 1) {
                z2 = true;
            }
            if (LIZLLL != z2) {
                LIZLLL = z2;
                C01TT.LIZLLL(new AwS62S0010000_25(z2, 1));
            }
            boolean zLIZ = LIZ();
            if (LJ != zLIZ) {
                LJ = zLIZ;
                C01TT.LIZLLL(new AwS62S0010000_25(zLIZ, 0));
            }
        }
    }
}
