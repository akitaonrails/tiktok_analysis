package X;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS67S0010000_34;

/* JADX INFO: renamed from: X.1Bs4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2218381Bs4 {
    public static Context LIZ;
    public static C2218391Bs5 LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static boolean LJ;
    public static final ArrayList<InterfaceC2218401Bs6> LJFF = new ArrayList<>();

    public static boolean LIZ() {
        if (LIZJ) {
            return 2 == BluetoothAdapter.getDefaultAdapter().getProfileConnectionState(1) || 1 == BluetoothAdapter.getDefaultAdapter().getProfileConnectionState(1);
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.1Bs5] */
    public static void LIZIZ(Context context) {
        boolean z;
        Intent intentLJIJJ;
        if (LIZIZ != null) {
            return;
        }
        LIZ = C786410Ut5.N3(context);
        LIZIZ = new BroadcastReceiver() { // from class: X.1Bs5
            public static void LIZ(Intent intent) {
                String action;
                boolean z2 = true;
                if (!C2218381Bs4.LIZLLL && !C2218381Bs4.LJ && C2218381Bs4.LIZ()) {
                    C305180Bxk.LIZ(new AwS67S0010000_34(true, 0));
                }
                if (intent != null && (action = intent.getAction()) != null) {
                    int iHashCode = action.hashCode();
                    if (iHashCode != -1676458352) {
                        if (iHashCode == 545516589 && action.equals("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED") && C2218381Bs4.LIZJ) {
                            int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
                            if (intExtra != 1 && intExtra != 2) {
                                z2 = false;
                            }
                            if (C2218381Bs4.LJ != z2) {
                                C2218381Bs4.LJ = z2;
                                C305180Bxk.LIZ(new AwS67S0010000_34(z2, 0));
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
                    if (C2218381Bs4.LIZLLL == z2) {
                        return;
                    }
                    C2218381Bs4.LIZLLL = z2;
                    C305180Bxk.LIZ(new AwS67S0010000_34(z2, 1));
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
                C305180Bxk.LIZ(new AwS67S0010000_34(z2, 1));
            }
            boolean zLIZ = LIZ();
            if (LJ != zLIZ) {
                LJ = zLIZ;
                C305180Bxk.LIZ(new AwS67S0010000_34(zLIZ, 0));
            }
        }
    }
}
