package X;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.Pair;
import kotlin.jvm.internal.AwS599S0100000_20;

/* JADX INFO: renamed from: X.0k5G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1305760k5G {
    public static void LIZ(CameraDevice cameraDevice, Cert cert) {
        C825940Wae c825940WaeLIZ = C746720TQw.LIZ(100201, "camera_close2", cert);
        C837860Wts.LIZ(c825940WaeLIZ, "android/hardware/camera2/CameraDevice", "close()V", null);
        C838080WuE.LIZ(c825940WaeLIZ, new AwS599S0100000_20(cameraDevice, 40));
    }

    public static void LIZIZ(CameraDevice.StateCallback stateCallback, CameraManager cameraManager, BPEAHandler bPEAHandler, Cert cert, String str) {
        C825940Wae c825940WaeLIZ = C746720TQw.LIZ(100206, "camera_open2", cert);
        C837860Wts.LIZ(c825940WaeLIZ, "android/hardware/camera2/CameraManager", "openCamera(Ljava/lang/String;Landroid/hardware/camera2/CameraDevice$StateCallback;Landroid/os/Handler;)V", C2097608Jq.LJIIIIZZ(new Pair("cameraId", str), new Pair("callback", stateCallback), new Pair("handler", bPEAHandler)));
        C838080WuE.LIZ(c825940WaeLIZ, new C1305680k58(cameraManager, str, stateCallback, bPEAHandler));
    }
}
