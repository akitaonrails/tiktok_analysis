package X;

import android.content.Context;
import android.view.SurfaceHolder;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.medialib.model.Enigma;
import com.ss.android.medialib.model.EnigmaResult;
import com.ss.android.medialib.model.TdPoint;
import com.ss.android.medialib.qr.ScanSettings;
import com.ss.android.ugc.asve.recorder.VERecorderImpl;
import com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner;
import com.ss.android.ugc.aweme.services.external.ability.camera.AVCameraParams;
import com.ss.android.ugc.aweme.services.external.ability.qr.AVEnigma;
import com.ss.android.ugc.aweme.services.external.ability.qr.AVEnigmaResult;
import com.ss.android.ugc.aweme.services.external.ability.qr.AVScanSettings;
import com.ss.android.ugc.aweme.services.external.ability.qr.AVTdPoint;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.runtime.VERuntime;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS684S0100000_35;
import lro.b;
import lth.o;

/* JADX INFO: renamed from: X.1DKv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2254191DKv implements IQRCodeScanner {
    public C2253821DJk LIZ;
    public IQRCodeScanner.OnEnigmaScanListener LIZIZ;
    public C448700Hie LIZJ;
    public IQRCodeScanner.ScanProcessListenr LIZLLL;
    public volatile boolean LJ;

    @Override // com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void enableCameraScan(boolean z, long j) {
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void closeLight() {
        C1DHX cameraController;
        C2253821DJk c2253821DJk = this.LIZ;
        if (c2253821DJk == null || (cameraController = c2253821DJk.getCameraController()) == null) {
            return;
        }
        cameraController.LIZ(VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_OFF.ordinal());
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void openLight() {
        C1DHX cameraController;
        C2253821DJk c2253821DJk = this.LIZ;
        if (c2253821DJk == null || (cameraController = c2253821DJk.getCameraController()) == null) {
            return;
        }
        cameraController.LIZ(VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_TORCH.ordinal());
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void release() {
        InterfaceC2254211DKx interfaceC2254211DKxLIZ;
        C2253821DJk c2253821DJk = this.LIZ;
        if (c2253821DJk == null || (interfaceC2254211DKxLIZ = c2253821DJk.LIZ()) == null) {
            return;
        }
        interfaceC2254211DKxLIZ.release();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void stop() {
        InterfaceC2254211DKx interfaceC2254211DKxLIZ;
        C2253821DJk c2253821DJk = this.LIZ;
        if (c2253821DJk == null || (interfaceC2254211DKxLIZ = c2253821DJk.LIZ()) == null) {
            return;
        }
        interfaceC2254211DKxLIZ.stop();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void stopPicScan() {
        InterfaceC2254211DKx interfaceC2254211DKxLIZ;
        C2253821DJk c2253821DJk = this.LIZ;
        if (c2253821DJk == null || (interfaceC2254211DKxLIZ = c2253821DJk.LIZ()) == null) {
            return;
        }
        interfaceC2254211DKxLIZ.stopPicScan();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void stopVE() {
        C448700Hie c448700Hie;
        VERecorder vERecorderLIZIZ;
        b bVar;
        C2253821DJk c2253821DJk = this.LIZ;
        if (c2253821DJk == null || (c448700Hie = this.LIZJ) == null || (vERecorderLIZIZ = c2253821DJk.LIZIZ()) == null || (bVar = vERecorderLIZIZ.LIZIZ.LJJIJLIJ) == null) {
            return;
        }
        bVar.LIZIZ(c448700Hie);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void startScanVE() {
        VERecorder vERecorderLIZIZ;
        o.LIZLLL();
        C1A66.LIZLLL(DownloadableModelSupport.getInstance().getResourceFinder());
        if (this.LIZ != null) {
            if (!this.LJ) {
                C2253821DJk c2253821DJk = this.LIZ;
                if (c2253821DJk != null) {
                    c2253821DJk.LJFF();
                }
                this.LJ = true;
            }
            C2253821DJk c2253821DJk2 = this.LIZ;
            b bVar = (c2253821DJk2 == null || (vERecorderLIZIZ = c2253821DJk2.LIZIZ()) == null) ? null : vERecorderLIZIZ.LIZIZ.LJJIJLIJ;
            C448700Hie c448700HieLIZ = new C448710Hif().LIZ();
            this.LIZJ = c448700HieLIZ;
            if (bVar != null) {
                bVar.LIZ(c448700HieLIZ);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void pauseEffectAudio(boolean z) {
        InterfaceC2254211DKx interfaceC2254211DKxLIZ;
        C2253821DJk c2253821DJk = this.LIZ;
        if (c2253821DJk != null && (interfaceC2254211DKxLIZ = c2253821DJk.LIZ()) != null) {
            interfaceC2254211DKxLIZ.pauseEffectAudio(z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.1DMq] */
    @Override // com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void setScanListener(IQRCodeScanner.OnEnigmaScanListener onEnigmaScanListener) {
        InterfaceC2254211DKx interfaceC2254211DKxLIZ;
        this.LIZIZ = onEnigmaScanListener;
        C2253821DJk c2253821DJk = this.LIZ;
        if (c2253821DJk != null && (interfaceC2254211DKxLIZ = c2253821DJk.LIZ()) != 0) {
            interfaceC2254211DKxLIZ.LIZJ(new C1DML() { // from class: X.1DMq
                @Override // X.C1DML
                public final void LIZ(EnigmaResult enigmaResult) {
                    AVTdPoint[] aVTdPointArr;
                    IQRCodeScanner.OnEnigmaScanListener onEnigmaScanListener2 = this.LIZ.LIZIZ;
                    if (onEnigmaScanListener2 != null) {
                        AVEnigmaResult aVEnigmaResult = null;
                        if (enigmaResult != null) {
                            AVEnigmaResult aVEnigmaResult2 = new AVEnigmaResult();
                            aVEnigmaResult2.zoomFactor = enigmaResult.zoomFactor;
                            Enigma[] result = enigmaResult.getResult();
                            if (result != null) {
                                AVEnigma[] aVEnigmaArr = new AVEnigma[result.length];
                                int length = result.length;
                                for (int i = 0; i < length; i++) {
                                    AVEnigma aVEnigma = new AVEnigma();
                                    aVEnigma.setText(result[i].getText());
                                    aVEnigma.setType(result[i].getType());
                                    TdPoint[] points = result[i].getPoints();
                                    if (points == null) {
                                        aVTdPointArr = null;
                                    } else {
                                        aVTdPointArr = new AVTdPoint[points.length];
                                        int length2 = points.length;
                                        for (int i2 = 0; i2 < length2; i2++) {
                                            AVTdPoint aVTdPoint = new AVTdPoint();
                                            aVTdPoint.setX(points[i2].getX());
                                            aVTdPoint.setY(points[i2].getY());
                                            aVTdPointArr[i2] = aVTdPoint;
                                        }
                                    }
                                    aVEnigma.setPoints(aVTdPointArr);
                                    aVEnigmaArr[i] = aVEnigma;
                                }
                                aVEnigmaResult2.setResult(aVEnigmaArr);
                            }
                            aVEnigmaResult = aVEnigmaResult2;
                        }
                        onEnigmaScanListener2.onSuccess(aVEnigmaResult);
                    }
                }

                @Override // X.C1DML
                public final void onFail(int i) {
                    IQRCodeScanner.OnEnigmaScanListener onEnigmaScanListener2 = this.LIZ.LIZIZ;
                    if (onEnigmaScanListener2 != null) {
                        onEnigmaScanListener2.onFail(i);
                    }
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void setScanProcessListener(IQRCodeScanner.ScanProcessListenr scanProcessListenr) {
        this.LIZLLL = scanProcessListenr;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void setVEScanListener(InterfaceC448730Hih interfaceC448730Hih) {
        VERecorder vERecorderLIZIZ;
        b bVar;
        C2253821DJk c2253821DJk = this.LIZ;
        if (c2253821DJk != null && interfaceC448730Hih != null && (vERecorderLIZIZ = c2253821DJk.LIZIZ()) != null && (bVar = vERecorderLIZIZ.LIZIZ.LJJIJLIJ) != null) {
            bVar.LIZJ(interfaceC448730Hih);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void zoomByRatio(float f) {
        C1DHX cameraController;
        C2253821DJk c2253821DJk = this.LIZ;
        if (c2253821DJk != null && (cameraController = c2253821DJk.getCameraController()) != null) {
            cameraController.LIZIZ(f);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void processTouchEvent(float f, float f2) {
        InterfaceC2254211DKx interfaceC2254211DKxLIZ;
        C2253821DJk c2253821DJk = this.LIZ;
        if (c2253821DJk != null && (interfaceC2254211DKxLIZ = c2253821DJk.LIZ()) != null) {
            interfaceC2254211DKxLIZ.processTouchEvent(f, f2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2254191DKv(Context context, final SurfaceHolder surfaceHolder, Function1<? super C1DKV, ? extends C1DKV> function1) {
        C2253821DJk c2253821DJk;
        C1DHX cameraController;
        C1DHX cameraController2;
        C1DHX cameraController3;
        VERuntime.getInstance().enableCameraGF(C0C64.LJIILLIIL().LJIIIZ(31744, "studio_enable_camera_graph_scan", true, false));
        o.LJFF(C2216131BoR.LIZ());
        C1A66.LIZIZ();
        C2253311DHl c2253311DHl = new C2253311DHl();
        C1DKV c1dkvInvoke = function1.invoke(new C1DLX() { // from class: X.1DKb
            @Override // X.C1DKV
            public final boolean LJJ() {
                return true;
            }

            @Override // X.C1DKV
            public final InterfaceC2253521DIg LJIIZILJ() {
                return new C1661490tL1() { // from class: X.1DKa
                    @Override // X.C1661490tL1, X.InterfaceC2253521DIg
                    public final C1D3N LIZ() {
                        return C1D3N.AS_CAMERA_LENS_BACK;
                    }
                };
            }

            @Override // X.C1DKV
            public final boolean LJJIIZI() {
                SettingsManager.LIZLLL().getClass();
                return SettingsManager.LIZ("enable_arcore", false);
            }

            @Override // X.C1DKV
            public final SurfaceHolder getSurfaceHolder() {
                return surfaceHolder;
            }
        });
        LifecycleOwner lifecycleOwner = (LifecycleOwner) context;
        AFwS217S0000000_28 aFwS217S0000000_28 = AFwS217S0000000_28.get$arr$(718);
        C2216191BoX.LIZ.getClass();
        C2253821DJk c2253821DJk2 = new C2253821DJk(lifecycleOwner, new VERecorderImpl(C2216191BoX.LIZ(), lifecycleOwner, c1dkvInvoke, c2253311DHl, null, aFwS217S0000000_28), c1dkvInvoke);
        this.LIZ = c2253821DJk2;
        C1DHX cameraController4 = c2253821DJk2.getCameraController();
        if (cameraController4 != null) {
            cameraController4.setControllerCallback(new C19771112Xd(""));
        }
        C2253821DJk c2253821DJk3 = this.LIZ;
        if (c2253821DJk3 != null && (cameraController3 = c2253821DJk3.getCameraController()) != null) {
            cameraController3.m4(new InterfaceC2253331DHn() { // from class: X.1DLG
                @Override // X.InterfaceC2253331DHn
                public final void LIZIZ(int i) {
                }

                @Override // X.InterfaceC2253331DHn
                public final void LIZ(int i, int i2, String str) {
                    IQRCodeScanner.OnEnigmaScanListener onEnigmaScanListener = this.LIZ.LIZIZ;
                    if (onEnigmaScanListener != null) {
                        onEnigmaScanListener.onFail(C386801es.DEFAULT);
                    }
                }
            });
        }
        C2253821DJk c2253821DJk4 = this.LIZ;
        if (c2253821DJk4 != null && (cameraController2 = c2253821DJk4.getCameraController()) != null) {
            cameraController2.u4(new AwS684S0100000_35(this, 2));
        }
        surfaceHolder.addCallback(new SurfaceHolder.Callback() { // from class: X.1DKw
            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceChanged(SurfaceHolder surfaceHolder2, int i, int i2, int i3) {
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceCreated(SurfaceHolder surfaceHolder2) {
                C1DHX cameraController5;
                C2254191DKv c2254191DKv = this.LL;
                if (c2254191DKv.LIZ != null) {
                    IQRCodeScanner.ScanProcessListenr scanProcessListenr = c2254191DKv.LIZLLL;
                    if (scanProcessListenr != null) {
                        scanProcessListenr.onCameraScanStarted();
                    }
                    C2253821DJk c2253821DJk5 = this.LL.LIZ;
                    if (c2253821DJk5 != null && (cameraController5 = c2253821DJk5.getCameraController()) != null) {
                        int iOrdinal = C1D3N.AS_CAMERA_LENS_BACK.ordinal();
                        final C2254191DKv c2254191DKv2 = this.LL;
                        cameraController5.D4(iOrdinal, new InterfaceC2253331DHn() { // from class: X.1DL4
                            @Override // X.InterfaceC2253331DHn
                            public final void LIZ(int i, int i2, String str) {
                            }

                            @Override // X.InterfaceC2253331DHn
                            public final void LIZIZ(int i) {
                                IQRCodeScanner.ScanProcessListenr scanProcessListenr2 = c2254191DKv2.LIZLLL;
                                if (scanProcessListenr2 != null) {
                                    scanProcessListenr2.onCameraOpenSuccess();
                                }
                            }
                        }, C1DPV.LIZIZ.LIZIZ(C1DPW.OPEN_CAMERA_QR_CODE_SCAN_SURFACE_CREATE, EnumC1781650wSp.QR), 1.0f);
                    }
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceDestroyed(SurfaceHolder surfaceHolder2) {
                C1DHX cameraController5;
                C2253821DJk c2253821DJk5 = this.LL.LIZ;
                if (c2253821DJk5 != null && (cameraController5 = c2253821DJk5.getCameraController()) != null) {
                    cameraController5.c4(C1DPV.LIZIZ.LIZJ(C1DPX.CLOSE_CAMERA_QR_SURFACE_DESTROY, EnumC1641610sox.PAGE_INVISIBLE), false);
                }
            }
        });
        if (surfaceHolder.getSurface() != null && surfaceHolder.getSurface().isValid() && (c2253821DJk = this.LIZ) != null && (cameraController = c2253821DJk.getCameraController()) != null) {
            cameraController.D4(C1D3N.AS_CAMERA_LENS_BACK.ordinal(), null, C1DPV.LIZIZ.LIZIZ(C1DPW.OPEN_CAMERA_QR_CODE_SCAN_SURFACE_HAD, EnumC1781650wSp.QR), 1.0f);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void startPicScan(String str, AVScanSettings aVScanSettings, long j) {
        InterfaceC2254211DKx interfaceC2254211DKxLIZ;
        C2253821DJk c2253821DJk = this.LIZ;
        if (c2253821DJk != null && (interfaceC2254211DKxLIZ = c2253821DJk.LIZ()) != null) {
            ScanSettings scanSettings = new ScanSettings();
            scanSettings.width = aVScanSettings.width;
            scanSettings.height = aVScanSettings.height;
            scanSettings.detectModelDir = aVScanSettings.detectModelDir;
            scanSettings.detectRectLeft = aVScanSettings.detectRectLeft;
            scanSettings.detectRectTop = aVScanSettings.detectRectTop;
            scanSettings.detectRectWidth = aVScanSettings.detectRectWidth;
            scanSettings.detectRectHeight = aVScanSettings.detectRectHeight;
            scanSettings.enableDetectRect = aVScanSettings.enableDetectRect;
            scanSettings.detectRequirement = aVScanSettings.detectRequirement;
            scanSettings.buildChainFlag = aVScanSettings.buildChainFlag;
            interfaceC2254211DKxLIZ.LIZIZ(str, scanSettings, j);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void startScan(Context context, AVCameraParams aVCameraParams, SurfaceHolder surfaceHolder, AVScanSettings aVScanSettings) {
        InterfaceC2254211DKx interfaceC2254211DKxLIZ;
        o.LIZLLL();
        C1A66.LIZLLL(DownloadableModelSupport.getInstance().getResourceFinder());
        C2253821DJk c2253821DJk = this.LIZ;
        if (c2253821DJk != null && (interfaceC2254211DKxLIZ = c2253821DJk.LIZ()) != null) {
            interfaceC2254211DKxLIZ.LIZ(aVScanSettings.detectRectLeft, aVScanSettings.detectRectTop, aVScanSettings.detectRectWidth, aVScanSettings.detectRectHeight);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner
    public final void switchEffectWithTag(String str, int i, int i2, String str2) {
        InterfaceC2254211DKx interfaceC2254211DKxLIZ;
        C2253821DJk c2253821DJk = this.LIZ;
        if (c2253821DJk != null && (interfaceC2254211DKxLIZ = c2253821DJk.LIZ()) != null) {
            interfaceC2254211DKxLIZ.switchEffectWithTag(str, i, i2, str2);
        }
    }
}
