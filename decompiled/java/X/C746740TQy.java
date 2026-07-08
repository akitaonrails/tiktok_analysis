package X;

import android.hardware.Camera;
import com.bytedance.bpea.basics.Cert;
import kotlin.Pair;
import kotlin.jvm.internal.AwS27S0001000_12;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0TQy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C746740TQy {
    public static Camera LIZ(int i, Cert cert) {
        C825940Wae c825940WaeLIZ = C746720TQw.LIZ(100100, "camera_open1", cert);
        C837860Wts.LIZ(c825940WaeLIZ, "android/hardware/Camera", "open(I)Landroid/hardware/Camera;", C2097908Jt.LIZJ(new Pair("cameraId", Integer.valueOf(i))));
        return (Camera) C838080WuE.LIZ(c825940WaeLIZ, new AwS27S0001000_12(i, 1));
    }

    public static void LIZIZ(Camera camera, Cert cert) {
        C825940Wae c825940WaeLIZ = C746720TQw.LIZ(100101, "camera_close1", cert);
        C837860Wts.LIZ(c825940WaeLIZ, "android/hardware/Camera", "release()V", null);
        C838080WuE.LIZ(c825940WaeLIZ, new AwS591S0100000_12(camera, 955));
    }
}
