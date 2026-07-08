package X;

import com.bytedance.bpea.basics.Cert;
import kotlin.jvm.internal.AwS599S0100000_20;

/* JADX INFO: renamed from: X.0k4v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1305550k4v {
    public static final void LIZ(Cert cert, InterfaceC1305530k4t interfaceC1305530k4t) {
        C825940Wae c825940WaeLIZ = C746580TQi.LIZ(cert, new String[]{"video"}, "camera_close", 100201);
        C837860Wts.LIZ(c825940WaeLIZ, "android/hardware/Camera", "release()V", null);
        C838080WuE.LIZ(c825940WaeLIZ, new AwS599S0100000_20(interfaceC1305530k4t, (InterfaceC1305530k4t<Object>) 50));
    }

    public static final <T> T LIZIZ(Cert cert, InterfaceC1305530k4t<T> interfaceC1305530k4t) {
        C825940Wae c825940WaeLIZ = C746580TQi.LIZ(cert, new String[]{"video"}, "camera_open", 100206);
        C837860Wts.LIZ(c825940WaeLIZ, "android/hardware/Camera", "open()Landroid/hardware/Camera;", null);
        return (T) C838080WuE.LIZ(c825940WaeLIZ, new AwS599S0100000_20(interfaceC1305530k4t, (InterfaceC1305530k4t<Object>) 51));
    }
}
