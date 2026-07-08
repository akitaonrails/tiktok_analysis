package X;

import android.bluetooth.BluetoothA2dp;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.livesdk.broadcast.utils.LiveAudioDevicesDetector;
import com.bytedance.android.livesdk.livesetting.broadcast.OptGoLiveBluetoothPermissionRequestSetting;
import java.util.List;

/* JADX INFO: renamed from: X.0UiE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C779680UiE {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ() {
        Context contextLJII;
        if (Build.VERSION.SDK_INT >= 31 && (contextLJII = C497740JfY.LJII()) != null && contextLJII.checkSelfPermission("android.permission.BLUETOOTH_CONNECT") == 0) {
            return true;
        }
        Context contextLJII2 = C497740JfY.LJII();
        return contextLJII2 != null && contextLJII2.checkSelfPermission("android.permission.BLUETOOTH") == 0;
    }

    public static boolean LIZIZ() {
        AudioManager audioManager;
        BluetoothA2dp bluetoothA2dp;
        List<BluetoothDevice> connectedDevices;
        if (OptGoLiveBluetoothPermissionRequestSetting.INSTANCE.enable()) {
            ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getLiveAudioDevicesDetector().getClass();
            if (!LiveAudioDevicesDetector.LJI) {
                ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getLiveAudioDevicesDetector().getClass();
                if (!LiveAudioDevicesDetector.LJII) {
                    return false;
                }
            }
            return true;
        }
        if (LIZ()) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null) {
                if (defaultAdapter.isEnabled()) {
                    int profileConnectionState = defaultAdapter.getProfileConnectionState(2);
                    int profileConnectionState2 = defaultAdapter.getProfileConnectionState(1);
                    if (profileConnectionState == 2 || profileConnectionState2 == 2) {
                        C20441214yg.LJIIIZ("HeadsetUtil", "blue tooth connected");
                        return true;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("blue tooth disconnected. a2dpState: ");
                    sbLIZ.append(profileConnectionState);
                    sbLIZ.append(", headset: ");
                    sbLIZ.append(profileConnectionState2);
                    C20441214yg.LJIIIZ("HeadsetUtil", C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    C20441214yg.LJIIIZ("HeadsetUtil", "bluetooth disable");
                }
            }
        } else {
            C20441214yg.LJIIIZ("HeadsetUtil", "no bluetooth permission");
        }
        if (!LIZ()) {
            return false;
        }
        Context contextLJII = C497740JfY.LJII();
        Object objH2 = contextLJII != null ? C786410Ut5.H2(contextLJII, "audio") : null;
        if (!(objH2 instanceof AudioManager) || (audioManager = (AudioManager) objH2) == null || !audioManager.isBluetoothA2dpOn() || (bluetoothA2dp = C779690UiF.LIZ) == null || (connectedDevices = bluetoothA2dp.getConnectedDevices()) == null || connectedDevices.isEmpty()) {
            return false;
        }
        for (BluetoothDevice bluetoothDevice : connectedDevices) {
            BluetoothA2dp bluetoothA2dp2 = C779690UiF.LIZ;
            if (bluetoothA2dp2 != null && bluetoothA2dp2.isA2dpPlaying(bluetoothDevice)) {
                return true;
            }
        }
        return false;
    }
}
