package X;

import android.bluetooth.BluetoothDevice;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.UUID;

/* JADX INFO: renamed from: X.0jzi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1302320jzi {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static final C1302410jzr LIZ(BluetoothDevice bluetoothDevice, int i) {
        String name;
        String string = null;
        try {
            name = bluetoothDevice.getName();
            string = "-1";
        } catch (SecurityException e) {
            name = null;
            TryCatchGuardChecker.doCheck(e);
        }
        if (name == null) {
            name = "Bluetooth Device";
        }
        if (string == null) {
            string = UUID.randomUUID().toString();
            C1302460jzw.LIZJ(string);
        }
        C1302440jzu.LIZ.getClass();
        C1302410jzr c1302410jzr = new C1302410jzr(name, 2, C1302440jzu.LIZIZ(i, 2, name));
        c1302410jzr.LLILZ = string;
        return c1302410jzr;
    }
}
