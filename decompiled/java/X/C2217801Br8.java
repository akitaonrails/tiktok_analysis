package X;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbDevice;
import android.media.AudioManager;
import com.ss.android.ugc.aweme.feed.earphone.IEarphonePlayerControlService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS225S0000000_34;

/* JADX INFO: renamed from: X.1Br8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2217801Br8 extends BroadcastReceiver {
    public final AudioManager LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(262));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(261));

    public final Map<String, Boolean> LIZIZ() {
        return (Map) this.LIZJ.getValue();
    }

    public C2217801Br8(AudioManager audioManager) {
        this.LIZ = audioManager;
    }

    public final void LIZ(Intent intent) {
        String action;
        UsbDevice usbDevice;
        AudioManager audioManager;
        AudioManager audioManager2;
        BluetoothDevice bluetoothDevice;
        AudioManager audioManager3;
        if (intent != null && (action = intent.getAction()) != null) {
            int iHashCode = action.hashCode();
            if (iHashCode != -2114103349) {
                if (iHashCode != -1676458352) {
                    if (iHashCode == -301431627 && action.equals("android.bluetooth.device.action.ACL_CONNECTED") && (bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE")) != null) {
                        C722880SXe.LIZ().LJIIIZ("audio device connected, is supported device: downgrade");
                        int majorDeviceClass = bluetoothDevice.getBluetoothClass().getMajorDeviceClass();
                        int deviceClass = bluetoothDevice.getBluetoothClass().getDeviceClass();
                        C20286614Zk.LIZ.getClass();
                        if (!C20286614Zk.LJII && (audioManager3 = this.LIZ) != null && audioManager3.getMode() == 0 && majorDeviceClass == 1024) {
                            if (deviceClass == 1048 || deviceClass == 1044) {
                                ((IEarphonePlayerControlService) ServiceManager.get().getService(IEarphonePlayerControlService.class)).LIZLLL(false);
                                for (InterfaceC2217831BrB interfaceC2217831BrB : (Set) this.LIZIZ.getValue()) {
                                    C722880SXe.LIZIZ(LIZIZ().get(interfaceC2217831BrB.getScenario()), interfaceC2217831BrB.getScenario());
                                    interfaceC2217831BrB.LIZ();
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (action.equals("android.intent.action.HEADSET_PLUG") && intent.getIntExtra("state", -1) == 1) {
                    C722880SXe.LIZ().LJIIIZ("audio device connected, is supported device: downgrade");
                    C20286614Zk.LIZ.getClass();
                    if (!C20286614Zk.LJII && (audioManager2 = this.LIZ) != null && audioManager2.getMode() == 0) {
                        ((IEarphonePlayerControlService) ServiceManager.get().getService(IEarphonePlayerControlService.class)).LIZLLL(false);
                        for (InterfaceC2217831BrB interfaceC2217831BrB2 : (Set) this.LIZIZ.getValue()) {
                            C722880SXe.LIZIZ(LIZIZ().get(interfaceC2217831BrB2.getScenario()), interfaceC2217831BrB2.getScenario());
                            interfaceC2217831BrB2.LIZ();
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (action.equals("android.hardware.usb.action.USB_DEVICE_ATTACHED") && (usbDevice = (UsbDevice) intent.getParcelableExtra("device")) != null) {
                C722880SXe.LIZ().LJIIIZ("audio device connected, is supported device: downgrade");
                int deviceClass2 = usbDevice.getDeviceClass();
                C20286614Zk.LIZ.getClass();
                if (!C20286614Zk.LJII && (audioManager = this.LIZ) != null && audioManager.getMode() == 0 && deviceClass2 == 1) {
                    ((IEarphonePlayerControlService) ServiceManager.get().getService(IEarphonePlayerControlService.class)).LIZLLL(false);
                    for (InterfaceC2217831BrB interfaceC2217831BrB3 : (Set) this.LIZIZ.getValue()) {
                        C722880SXe.LIZIZ(LIZIZ().get(interfaceC2217831BrB3.getScenario()), interfaceC2217831BrB3.getScenario());
                        interfaceC2217831BrB3.LIZ();
                    }
                }
            }
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
