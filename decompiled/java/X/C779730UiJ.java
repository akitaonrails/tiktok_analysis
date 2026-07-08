package X;

import android.bluetooth.BluetoothA2dp;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0UiJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C779730UiJ extends BroadcastReceiver {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void LIZ(Intent intent) {
        String action;
        if (intent == null || (action = intent.getAction()) == null) {
            return;
        }
        switch (action.hashCode()) {
            case -1676458352:
                if (!action.equals("android.intent.action.HEADSET_PLUG") || !intent.hasExtra("state")) {
                    return;
                }
                int intExtra = intent.getIntExtra("state", 0);
                if (intExtra != 0 && intExtra != 1) {
                    return;
                }
                C768620UDc.LIZ.LJIIL(false);
                return;
            case -855499628:
                if (!action.equals("android.bluetooth.a2dp.profile.action.PLAYING_STATE_CHANGED")) {
                    return;
                }
                break;
            case 487423555:
                if (!action.equals("android.bluetooth.a2dp.profile.action.ACTIVE_DEVICE_CHANGED")) {
                    return;
                }
                break;
            case 1123270207:
                if (!action.equals("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED")) {
                    return;
                }
                break;
            default:
                return;
        }
        C768620UDc.LIZ.LJIIL(false);
    }

    public static void LIZIZ(Context context) {
        BluetoothAdapter defaultAdapter;
        try {
            if (C779680UiE.LIZ() && C779690UiF.LIZ != null && (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) != null) {
                defaultAdapter.getProfileProxy(context, new BluetoothProfile.ServiceListener() { // from class: X.0UiK
                    @Override // android.bluetooth.BluetoothProfile.ServiceListener
                    public final void onServiceDisconnected(int i) {
                    }

                    @Override // android.bluetooth.BluetoothProfile.ServiceListener
                    public final void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
                        BluetoothA2dp bluetoothA2dp;
                        if (i == 2) {
                            if (bluetoothProfile instanceof BluetoothA2dp) {
                                bluetoothA2dp = (BluetoothA2dp) bluetoothProfile;
                            } else {
                                bluetoothA2dp = null;
                            }
                            C779690UiF.LIZ = bluetoothA2dp;
                        }
                    }
                }, 2);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("initBluetoothA2dpProxy ");
            sbLIZ.append(e.getMessage());
            C20441214yg.LJ("HeadsetBroadcastReceiver", C2188811AlT.LIZIZ(sbLIZ));
        }
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
