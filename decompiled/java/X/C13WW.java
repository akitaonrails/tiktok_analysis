package X;

import android.hardware.input.InputManager;
import android.view.InputDevice;

/* JADX INFO: renamed from: X.13WW, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13WW {
    public static final boolean LIZ() {
        Object objG2 = C786410Ut5.G2(C1BWL.LIZ(), "input");
        InputManager inputManager = objG2 instanceof InputManager ? (InputManager) objG2 : null;
        if (inputManager != null) {
            for (int i : inputManager.getInputDeviceIds()) {
                InputDevice inputDevice = inputManager.getInputDevice(i);
                if (inputDevice != null && !inputDevice.isVirtual() && (inputDevice.getSources() & 8194) == 8194) {
                    return true;
                }
            }
        }
        return false;
    }
}
