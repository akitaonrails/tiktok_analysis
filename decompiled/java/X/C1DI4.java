package X;

import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;

/* JADX INFO: renamed from: X.1DI4, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DI4 implements InterfaceC1622130sJX {
    public static final C1DI4 LIZ = new C1DI4();
    public static final Cert LIZIZ = CertProviderManagerKt.findCert("bpea-sensor_register_sticker_gravity", 1476415493);
    public static final Cert LIZJ = CertProviderManagerKt.findCert("bpea-sensor_register_sticker_rotation_vector", 1476415493);
    public static final Cert LIZLLL = CertProviderManagerKt.findCert("bpea-sensor_register_sticker_ar_gyroscope", 1476415493);
    public static final Cert LJ = CertProviderManagerKt.findCert("bpea-sensor_register_sticker_ar_rotation_vector", 1476415493);
    public static final Cert LJFF = CertProviderManagerKt.findCert("bpea-sensor_register_sticker_ar_gravity", 1476415493);
    public static final Cert LJI = CertProviderManagerKt.findCert("bpea-sensor_register_sticker_ar_accelerator", 1476415493);
    public static final Cert LJII = CertProviderManagerKt.findCert("bpea-sensor_register_sticker_landmark_rotation_vector", 1476415493);
    public static final Cert LJIIIIZZ = CertProviderManagerKt.findCert("bpea-sensor_unregister_sticker", 1476415493);
    public static final Cert LJIIIZ = CertProviderManagerKt.findCert("bpea-vesdk_sensor_register", 1476415490);
    public static final Cert LJIIJ = CertProviderManagerKt.findCert("bpea-vesdk_sensor_unregister", 1476415490);

    @Override // X.InterfaceC1622130sJX
    public final /* bridge */ /* synthetic */ void LIZIZ() {
    }

    public static final Cert LIZJ() {
        return C1DI6.LIZ.LIZIZ(C1DI5.CLOSE_CAMERA_COMPONENT_ON_STOP, EnumC1641610sox.PAGE_INVISIBLE);
    }

    public static final Cert LIZLLL() {
        return C1DI6.LIZ.LIZIZ(C1DI5.CLOSE_CAMERA_VIEW_ON_STOP, EnumC1641610sox.PAGE_INVISIBLE);
    }

    public static final Cert LJ() {
        return C1DI6.LIZ.LIZIZ(C1DI5.CLOSE_CAMERA_SURFACE_DESTROY, EnumC1641610sox.PAGE_INVISIBLE);
    }

    public static final Cert LJFF() {
        return C1DI6.LIZ.LIZIZ(C1DI5.CLOSE_CAMERA_ON_TEXTURE_DESTROY, EnumC1641610sox.PAGE_INVISIBLE);
    }

    public static final Cert LJI() {
        return C1DI6.LIZ.LIZIZ(C1DI5.CLOSE_CAMERA_ON_SURFACE_DESTROY, EnumC1641610sox.PAGE_INVISIBLE);
    }

    public static final Cert LJII() {
        return C1DI6.LIZ.LIZ(C1DI7.OPEN_CAMERA_ENTER_PAGE_ON_RESUME, null);
    }

    public static final Cert LJIIIIZZ() {
        return C1DI6.LIZ.LIZ(C1DI7.OPEN_CAMERA_ENTER_PAGE_TEXTURE_CREATE, null);
    }

    @Override // X.InterfaceC1622130sJX
    public final Cert LIZ() {
        return C1DI6.LIZ.LIZ(C1DI7.SWITCH_CAMERA_DOUBLE_TAP_CAMERA_GESTURE_COMP, null);
    }
}
