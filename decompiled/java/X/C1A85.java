package X;

import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.ss.android.vesdk.VECameraSettings;
import java.util.HashMap;

/* JADX INFO: renamed from: X.1A85, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A85 {
    public static final VECameraSettings LIZ(C1A86 c1a86) {
        VECameraSettings.Builder builder = new VECameraSettings.Builder();
        builder.setCameraType(VECameraSettings.CAMERA_TYPE.TYPE2);
        builder.setIsUseNewCameraTypeStrategy(c1a86.LIZJ());
        builder.setFps(c1a86.getFps());
        int[] iArrLIZIZ = c1a86.LIZIZ();
        if (iArrLIZIZ.length == 2) {
            builder.setPreviewSize(iArrLIZIZ[0], iArrLIZIZ[1]);
        }
        builder.setRetryStartPreviewCnt(10);
        builder.setRetryCnt(50);
        builder.setCameraModeType(VECameraSettings.CAMERA_MODE_TYPE.VIDEO_MODE);
        HashMap<EnumC1270990jBB, Cert> map = new HashMap<>();
        map.put(EnumC1270990jBB.EXCEPTION_CLOSE_CAMERA, CertProviderManagerKt.findCert("bpea-exception_close_camera", 1476788485));
        builder.setCameraPrivacyCertMap(map);
        return builder.build();
    }
}
