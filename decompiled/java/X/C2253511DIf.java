package X;

import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.ss.android.ugc.asve.context.PreviewSize;
import com.ss.android.vesdk.VECameraSettings;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1DIf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2253511DIf {
    public static final VECameraSettings LIZ(InterfaceC2253521DIg interfaceC2253521DIg, Function1<? super VECameraSettings.Builder, Unit> function1) {
        VECameraSettings.Builder builder = new VECameraSettings.Builder();
        builder.setIsUseNewCameraTypeStrategy(true);
        builder.setDontUseVendorCameraType(interfaceC2253521DIg.LJIJJ());
        builder.setCameraFacing(C1D3R.LIZ(interfaceC2253521DIg.LIZ()));
        builder.setOptionFlag(interfaceC2253521DIg.LJI());
        builder.setRetryCnt(interfaceC2253521DIg.LJIJI());
        builder.setRetryStartPreviewCnt(interfaceC2253521DIg.LJIILLIIL());
        int[] iArrLIZIZ = interfaceC2253521DIg.LIZIZ();
        if (iArrLIZIZ.length >= 2) {
            builder.setPreviewSize(iArrLIZIZ[0], iArrLIZIZ[1]);
        } else {
            C2216191BoX.LIZ.getClass();
            PreviewSize previewSizeLIZLLL = ((C2208821Bce) C2216191BoX.LIZIZ()).LIZLLL();
            if (previewSizeLIZLLL != null) {
                builder.setPreviewSize(previewSizeLIZLLL.width, previewSizeLIZLLL.height);
            }
        }
        if (((Boolean) C1866520yfi.LIZ.getValue()).booleanValue()) {
            int[] iArrLJ = interfaceC2253521DIg.LJ();
            if (iArrLJ.length >= 2) {
                builder.setSecondaryPreviewSize(iArrLJ[0], iArrLJ[1]);
            }
        }
        int[] iArrLJIIJ = interfaceC2253521DIg.LJIIJ();
        if (iArrLJIIJ != null && iArrLJIIJ.length >= 2) {
            builder.setFpsRange(iArrLJIIJ);
        }
        Boolean boolLJFF = interfaceC2253521DIg.LJFF();
        if (boolLJFF != null) {
            builder.setCameraAntiShake(boolLJFF.booleanValue());
        }
        builder.setCameraModeType(interfaceC2253521DIg.LIZJ());
        builder.enableShutterSound(interfaceC2253521DIg.LJIIL());
        HashMap<EnumC1270990jBB, Cert> map = new HashMap<>();
        Cert cert = C1DI4.LJIIIZ;
        if (cert != null) {
            map.put(EnumC1270990jBB.REGISTER_SENSOR, cert);
        }
        Cert cert2 = C1DI4.LJIIJ;
        if (cert2 != null) {
            map.put(EnumC1270990jBB.UNREGISTER_SENSOR, cert2);
        }
        map.put(EnumC1270990jBB.EXCEPTION_CLOSE_CAMERA, CertProviderManagerKt.findCert("bpea-exception_close_camera", 1476788485));
        builder.setCameraPrivacyCertMap(map);
        if (function1 != null) {
            function1.invoke(builder);
        }
        VECameraSettings vECameraSettingsBuild = builder.build();
        vECameraSettingsBuild.enableManualReleaseCaptureResult(interfaceC2253521DIg.LIZLLL());
        return vECameraSettingsBuild;
    }
}
