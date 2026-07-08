package X;

import Y.AfS162S0200000_28;
import Y.AfS197S0100000_28;
import android.app.Activity;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.os.Looper;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.wallet.data.api.IKYCApi;
import com.bytedance.android.livesdk.comp.api.network.INetworkService;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS579S0100000_35;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.14bO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20296814bO {
    public final Activity LIZ;
    public final TextureView LIZIZ;
    public final InterfaceC1870050ylP LIZJ;
    public final boolean LIZLLL;
    public final JSONObject LJ;
    public boolean LJFF = true;
    public boolean LJI;
    public boolean LJII;
    public int LJIIIIZZ;
    public final C20297014bQ LJIIIZ;
    public String LJIIJ;
    public CameraDevice LJIIJJI;
    public CameraCaptureSession LJIIL;
    public Size LJIILIIL;
    public ImageReader LJIILJJIL;
    public final C14WZ LJIILL;
    public final BPEAHandler LJIILLIIL;
    public BPEAHandler LJIIZILJ;
    public final DialogC780480UjW LJIJ;
    public final DialogC20297114bR LJIJI;

    public final void LIZ() {
        try {
            CameraCaptureSession cameraCaptureSession = this.LJIIL;
            if (cameraCaptureSession != null) {
                cameraCaptureSession.stopRepeating();
            }
            CameraCaptureSession cameraCaptureSession2 = this.LJIIL;
            if (cameraCaptureSession2 != null) {
                cameraCaptureSession2.abortCaptures();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C20297014bQ c20297014bQ = this.LJIIIZ;
        if (c20297014bQ != null) {
            C500260Jjc.LJJLIIIJJIZ(new AwS579S0100000_35(c20297014bQ, 192));
        }
        try {
            CameraDevice cameraDevice = this.LJIIJJI;
            if (cameraDevice != null) {
                C1305760k5G.LIZ(cameraDevice, CertProviderManagerKt.findCert("bpea-bpea-kyc_4_open_camera", 1476788225));
            }
            this.LJIIJJI = null;
        } catch (C838130WuJ e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        ImageReader imageReader = this.LJIILJJIL;
        if (imageReader != null) {
            imageReader.close();
        }
        this.LJIILJJIL = null;
        DialogC20297114bR dialogC20297114bR = this.LJIJI;
        dialogC20297114bR.dismiss();
        C785410UrT.LIZ(dialogC20297114bR);
        DialogC780480UjW dialogC780480UjW = this.LJIJ;
        dialogC780480UjW.dismiss();
        C785410UrT.LIZ(dialogC780480UjW);
    }

    public final void LIZIZ() {
        try {
            SurfaceTexture surfaceTexture = this.LIZIZ.getSurfaceTexture();
            if (surfaceTexture == null) {
                return;
            }
            Size size = this.LJIILIIL;
            if (size != null) {
                surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
            }
            final Surface surface = new Surface(surfaceTexture);
            CameraDevice cameraDevice = this.LJIIJJI;
            if (cameraDevice != null) {
                cameraDevice.createCaptureSession(Collections.singletonList(surface), new CameraCaptureSession.StateCallback() { // from class: X.14bH
                    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
                    }

                    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
                        CameraDevice cameraDevice2 = this.LIZ.LJIIJJI;
                        if (cameraDevice2 == null) {
                            return;
                        }
                        try {
                            CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice2.createCaptureRequest(1);
                            builderCreateCaptureRequest.addTarget(surface);
                            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_MODE, 1);
                            this.LIZ.LJIIL = cameraCaptureSession;
                            if (cameraCaptureSession != null) {
                                cameraCaptureSession.setRepeatingRequest(builderCreateCaptureRequest.build(), null, this.LIZ.LJIIZILJ);
                            }
                        } catch (CameraAccessException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }, this.LJIIZILJ);
            }
        } catch (CameraAccessException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LIZJ() throws CameraAccessException {
        Size[] outputSizes;
        if (!this.LJI || this.LJII) {
            return;
        }
        this.LJII = true;
        CameraManager cameraManager = (CameraManager) C786410Ut5.F2(this.LIZ, "camera");
        for (String str : cameraManager.getCameraIdList()) {
            Integer num = (Integer) cameraManager.getCameraCharacteristics(str).get(CameraCharacteristics.LENS_FACING);
            if (num != null && num.intValue() == 1) {
                this.LJIIJ = str;
            }
        }
        String str2 = this.LJIIJ;
        if (str2 != null) {
            try {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraManager.getCameraCharacteristics(str2).get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                this.LJIILIIL = (streamConfigurationMap == null || (outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class)) == null) ? null : outputSizes[0];
                C1305760k5G.LIZIZ(new CameraDevice.StateCallback() { // from class: X.14bG
                    @Override // android.hardware.camera2.CameraDevice.StateCallback
                    public final void onDisconnected(CameraDevice cameraDevice) {
                        try {
                            C1305760k5G.LIZ(cameraDevice, CertProviderManagerKt.findCert("bpea-bpea-kyc_4_open_camera", 1476788225));
                        } catch (C838130WuJ e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }

                    @Override // android.hardware.camera2.CameraDevice.StateCallback
                    public final void onOpened(CameraDevice cameraDevice) throws Throwable {
                        int width;
                        int height;
                        Size[] outputSizes2;
                        Object obj;
                        CameraDevice cameraDevice2 = cameraDevice;
                        C0WST c0wst = new C0WST();
                        Object[] objArr = {cameraDevice2};
                        C0WZW c0wzw = new C0WZW(false, "(Landroid/hardware/camera2/CameraDevice;)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYF4JopQECwWhU3SDL7IswNZSsMjI=", null));
                        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(100200, "com/bytedance/android/live/kyc/KYCCameraManager$openCamera$1$1", "onOpened", this, objArr, "void", c0wzw);
                        if (c0wsuLIZIZ.LIZ) {
                            c0wst.LIZ(100200, "com/bytedance/android/live/kyc/KYCCameraManager$openCamera$1$1", "onOpened", null, objArr, this, c0wzw, false);
                            return;
                        }
                        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
                        if (objArr2 != null && (obj = objArr2[0]) != null) {
                            cameraDevice2 = (CameraDevice) obj;
                        }
                        if (Intrinsics.LJFF(cameraDevice2.getId(), this.LIZ.LJIIJ)) {
                            C20296814bO c20296814bO = this.LIZ;
                            c20296814bO.LJIIJJI = cameraDevice2;
                            StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) ((CameraManager) C786410Ut5.H2(C786410Ut5.L3(c20296814bO.LIZ), "camera")).getCameraCharacteristics(cameraDevice2.getId()).get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                            if (streamConfigurationMap2 != null && (outputSizes2 = streamConfigurationMap2.getOutputSizes(256)) != null && outputSizes2.length != 0) {
                                width = outputSizes2[0].getWidth();
                                height = outputSizes2[0].getHeight();
                            } else {
                                width = 640;
                                height = 480;
                            }
                            ImageReader imageReaderNewInstance = ImageReader.newInstance(width, height, 256, 1);
                            c20296814bO.LJIILJJIL = imageReaderNewInstance;
                            if (imageReaderNewInstance != null) {
                                imageReaderNewInstance.setOnImageAvailableListener(c20296814bO.LJIILL, c20296814bO.LJIIZILJ);
                            }
                            this.LIZ.LIZIZ();
                        }
                        c0wst.LIZ(100200, "com/bytedance/android/live/kyc/KYCCameraManager$openCamera$1$1", "onOpened", null, objArr, this, c0wzw, true);
                    }

                    @Override // android.hardware.camera2.CameraDevice.StateCallback
                    public final void onError(CameraDevice cameraDevice, int i) {
                        try {
                            C1305760k5G.LIZ(cameraDevice, CertProviderManagerKt.findCert("bpea-bpea-kyc_4_open_camera", 1476788225));
                        } catch (C838130WuJ e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }, cameraManager, this.LJIILLIIL, CertProviderManagerKt.findCert("bpea-bpea-kyc_4_open_camera", 1476788225), str2);
            } catch (C838130WuJ e) {
                TryCatchGuardChecker.doCheck(e);
            } catch (CameraAccessException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    public final void LIZLLL() {
        String str;
        String str2;
        DialogC20297114bR dialogC20297114bR = this.LJIJI;
        dialogC20297114bR.show();
        C785410UrT.LIZIZ(dialogC20297114bR);
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJJ(dialogC20297114bR);
        C816490W1f.LIZ(dialogC20297114bR);
        C20297414bU.LJ(this.LIZLLL ? "double_side" : "single_side", "iqa_failed", this.LJ);
        String str3 = this.LIZLLL ? "double_side" : "single_side";
        if (this.LJFF) {
            str = "profile_image_side";
            str2 = "profile_image";
        } else {
            str = "back_image_side";
            str2 = "back_image";
        }
        JSONObject jSONObject = this.LJ;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_kyc_form_iqa_failed");
        c474500IjALIZ.LJJII(str3, "shoot_type");
        c474500IjALIZ.LJJII(str, "page_name");
        c474500IjALIZ.LJJII(str2, "photo_type");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        c474500IjALIZ.LJJIIJZLJL(jSONObject);
        c474500IjALIZ.LIZ();
    }

    public final void LJ(byte[] bArr) {
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("kycFiles");
        sbLIZ.append(System.currentTimeMillis());
        multipartTypedOutput.addPart("file", new TypedByteArray("multipart/form-data", bArr, C2188811AlT.LIZIZ(sbLIZ)));
        C480460Ism.LIZ().getClass();
        ((IKYCApi) ((INetworkService) C1161920gLG.LIZJ(INetworkService.class)).eo1(IKYCApi.class)).iqaIdPhotoVerify(multipartTypedOutput).LJLJI(10L, TimeUnit.SECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIIJ(new C20308114dD(this, 0)).LJJLL(new AfS162S0200000_28(this, (MutableLiveData<Integer>) bArr, (Function0<Unit>) 5), new AfS197S0100000_28(this, 2));
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.14WZ] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.14bQ] */
    public C20296814bO(Activity activity, C20856616jU c20856616jU, InterfaceC1870050ylP interfaceC1870050ylP, boolean z, JSONObject jSONObject) {
        this.LIZ = activity;
        this.LIZIZ = c20856616jU;
        this.LIZJ = interfaceC1870050ylP;
        this.LIZLLL = z;
        this.LJ = jSONObject;
        TextureView.SurfaceTextureListener surfaceTextureListener = new TextureView.SurfaceTextureListener() { // from class: X.14bP
            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                this.LL.LIZ();
                return false;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) throws CameraAccessException {
                this.LL.LIZJ();
            }
        };
        ?? r3 = new InterfaceC2273761DzC() { // from class: X.14bQ
            @Override // X.InterfaceC2273761DzC
            public final void LIZ(int i) {
                this.LIZ.LJIIIIZZ = i;
            }
        };
        this.LJIIIZ = r3;
        C19514711Wn.LIZIZ.LIZIZ(activity, CertProviderManagerKt.findCert("bpea-kyc_4_camera", 1476788225)).LIZIZ("android.permission.CAMERA").LIZJ(new C20308314dF(this, 0));
        c20856616jU.setSurfaceTextureListener(surfaceTextureListener);
        C500260Jjc.LJJLIIIJJIZ(new AwS579S0100000_35((C20297014bQ) r3, 191));
        this.LJIILL = new ImageReader.OnImageAvailableListener() { // from class: X.14WZ
            @Override // android.media.ImageReader.OnImageAvailableListener
            public final void onImageAvailable(ImageReader imageReader) {
                Image imageAcquireLatestImage = null;
                try {
                    try {
                        imageAcquireLatestImage = imageReader.acquireLatestImage();
                        ByteBuffer buffer = imageAcquireLatestImage.getPlanes()[0].getBuffer();
                        byte[] bArr = new byte[buffer.remaining()];
                        buffer.get(bArr);
                        this.LL.LJ(bArr);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        if (imageAcquireLatestImage == null) {
                            return;
                        }
                    }
                    imageAcquireLatestImage.close();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (imageAcquireLatestImage != null) {
                        imageAcquireLatestImage.close();
                    }
                    throw th;
                }
            }
        };
        this.LJIILLIIL = new BPEAHandler(Looper.getMainLooper());
        C780470UjV c780470UjV = new C780470UjV(activity);
        c780470UjV.LIZIZ = activity.getString(2131842383);
        c780470UjV.LIZJ = false;
        this.LJIJ = c780470UjV.LIZ();
        this.LJIJI = new DialogC20297114bR(activity, jSONObject, z);
    }
}
