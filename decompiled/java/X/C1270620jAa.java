package X;

import Y.AComparatorS39S0000000_20;
import Y.ARunnableS120S0100000_20;
import Y.ARunnableS17S0200100_20;
import Y.ARunnableS26S0201000_20;
import Y.ARunnableS31S0101000_20;
import Y.ARunnableS36S0300000_3;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttvecamera.TECameraCapture;
import com.ss.android.ttvecamera.TEFrameRateRange;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.CaptureBase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jAa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1270620jAa implements InterfaceC1266680j4E, C1DJP, C1DJX, InterfaceC1305720k5C, InterfaceC1271000jBC {
    public final C1267500j5Y LL;
    public final InterfaceC1267470j5V LLILLJJLI;
    public final Context LLILLL;
    public final Handler LLILZ;
    public final C1270630jAb LLILZIL;
    public InterfaceC1270850jAx LLILZLL;
    public int LLIZ = -1;
    public SurfaceTexture LLIZLLLIL;
    public final C1269190j8H LLJ;
    public C1267940j6G LLJI;
    public final AtomicLong LLJIJIL;
    public boolean LLJILJIL;
    public final C1270680jAg LLJILJILJ;
    public int LLJILLL;
    public final TECameraCapture LLJJ;
    public UUID LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public final JSONObject LLJJIJIIJIL;
    public final C1270760jAo LLJJIJIL;
    public final ArrayList<TEFrameSizei> LLJJJ;

    @Override // X.InterfaceC1266680j4E
    public final void LJ(Bundle bundle, C777170UeB c777170UeB, InterfaceC1270140j9o interfaceC1270140j9o) {
    }

    @Override // X.C1DJX
    public final void LJLLILLLL(SurfaceTexture surfaceTexture) {
    }

    @Override // X.InterfaceC1266680j4E
    public final void LIZ() {
        Handler handler = this.LLILZ;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS120S0100000_20(this, 443));
        }
    }

    @Override // X.InterfaceC1266680j4E
    public final void LJIILL() {
        Handler handler = this.LLILZ;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS120S0100000_20(this, 419));
        }
    }

    public final void LJIIL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stopVideoCaptureInternal TECameraCapture: ");
        sbLIZ.append(this.LLJJ);
        sbLIZ.append(" disconnect, CameraCaptureManager: ");
        sbLIZ.append(this);
        sbLIZ.append('}');
        C1270690jAh.LIZJ(1, "CameraCaptureManager", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LL.LIZ.captureBase.videoCapture.LJIIIZ()) {
            this.LLJJ.stop(true);
        }
        C1269500j8m.LIZIZ(this.LLJJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008f  */
    @Override // X.C1DJX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(com.ss.android.ttvecamera.TECameraFrame r11) {
        /*
            r10 = this;
            com.ss.android.ttvecamera.TECameraCapture r0 = r10.LLJJ
            int r1 = r0.getCameraState()
            r0 = 3
            if (r1 == r0) goto La
            return
        La:
            r6 = r11
            int r0 = r6.getRotation()
            int r0 = r0 % 180
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L91
            r3 = 1
        L16:
            X.0j8H r1 = r10.LLJ
            com.ss.android.ttvecamera.TEFrameSizei r0 = r6.getSize()
            r2 = -1
            if (r3 == 0) goto L8a
            if (r0 == 0) goto L8f
            int r0 = r0.height
        L23:
            r1.LJFF = r0
            X.0j8H r1 = r10.LLJ
            if (r3 == 0) goto L81
            com.ss.android.ttvecamera.TEFrameSizei r0 = r6.getSize()
            if (r0 == 0) goto L31
            int r2 = r0.width
        L31:
            r1.LJI = r2
            X.0j8H r1 = r10.LLJ
            int r0 = r6.getFacing()
            if (r0 != r4) goto L7f
            r0 = 1
        L3c:
            r1.LJIIJ = r0
            X.0j5V r3 = r10.LLILLJJLI
            if (r3 == 0) goto L52
            long r0 = com.ss.ttlivestreamer.core.utils.TimeUtils.currentTimeMs()
            java.lang.String r2 = java.lang.String.valueOf(r0)
            X.0j4V r3 = (X.C1266850j4V) r3
            X.0j3h r1 = r3.LIZ
            r0 = 4
            r1.LJIILIIL(r0, r5, r5, r2)
        L52:
            boolean r0 = r10.LLJILJIL
            if (r0 == 0) goto L59
            r10.LLJILJIL = r4
        L58:
            return
        L59:
            X.0jAb r3 = r10.LLILZIL
            if (r3 == 0) goto L58
            X.0jFQ r0 = r3.LLJILLL
            if (r0 == 0) goto L64
            r0.LIZJ()
        L64:
            long r4 = com.ss.ttlivestreamer.core.utils.TimeUtils.currentTimeMs()
            long r7 = com.ss.ttlivestreamer.core.utils.TimeUtils.nativeTimeUTCMicros()
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r7 = r7 / r0
            android.os.Handler r0 = r3.LLILZIL
            if (r0 == 0) goto L58
            Y.ARunnableS0S0200200_20 r2 = new Y.ARunnableS0S0200200_20
            r9 = 3
            r2.<init>(r3, r4, r6, r7, r9)
            X.C786410Ut5.LJJZZIII(r0, r2)
            return
        L7f:
            r0 = 2
            goto L3c
        L81:
            com.ss.android.ttvecamera.TEFrameSizei r0 = r6.getSize()
            if (r0 == 0) goto L31
            int r2 = r0.height
            goto L31
        L8a:
            if (r0 == 0) goto L8f
            int r0 = r0.width
            goto L23
        L8f:
            r0 = -1
            goto L23
        L91:
            r3 = 0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1270620jAa.LIZIZ(com.ss.android.ttvecamera.TECameraFrame):void");
    }

    @Override // X.InterfaceC1266680j4E
    public final void LIZLLL(C1267940j6G c1267940j6G) {
        long jIncrementAndGet = this.LLJIJIL.incrementAndGet();
        Handler handler = this.LLILZ;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS17S0200100_20(jIncrementAndGet, this, c1267940j6G, 10));
        }
    }

    public final Pair<Integer, String> LJIIJ(String str) {
        String str2 = "";
        int i = 1;
        int cameraState = this.LLJJ.getCameraState(true);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startPreviewInternal() called with: reason = ");
        sbLIZ.append(str);
        sbLIZ.append(" state = ");
        sbLIZ.append(cameraState);
        sbLIZ.append(" captureParams = ");
        sbLIZ.append(this.LLJI);
        AVLog.logKibana(4, "CameraCaptureManager", C2188811AlT.LIZIZ(sbLIZ), null);
        if (!C13LQ.LJLIIL(new Integer[]{2, 3}).contains(Integer.valueOf(cameraState))) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Camera is not opened or running, state = ");
            sbLIZ2.append(cameraState);
            return new Pair<>(-206, C2188811AlT.LIZIZ(sbLIZ2));
        }
        C1267940j6G c1267940j6G = this.LLJI;
        int iMax = Math.max(c1267940j6G.LIZ, c1267940j6G.LIZIZ);
        C1267940j6G c1267940j6G2 = this.LLJI;
        int iMin = Math.min(c1267940j6G2.LIZ, c1267940j6G2.LIZIZ);
        SurfaceTexture surfaceTexture = this.LLIZLLLIL;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        SurfaceTexture surfaceTexture2 = new SurfaceTexture(this.LLIZ);
        this.LLIZLLLIL = surfaceTexture2;
        surfaceTexture2.setDefaultBufferSize(iMax, iMin);
        C1270630jAb c1270630jAb = this.LLILZIL;
        if (c1270630jAb != null) {
            c1270630jAb.LJIIJ(this.LLIZ, iMax, iMin, this.LLIZLLLIL);
        }
        C1DJM c1djm = new C1DJM(new TEFrameSizei(iMax, iMin), (C1DJX) this, true, this.LLIZLLLIL, this.LLIZ);
        if (this.LLJJI == null) {
            this.LLJJI = UUID.randomUUID();
        }
        c1djm.LJIIJ = this.LLJJI;
        this.LLJJ.removeCameraProvider();
        this.LLJJ.addCameraProvider(c1djm);
        C1267940j6G c1267940j6G3 = this.LLJI;
        int i2 = c1267940j6G3.LIZJ;
        int i3 = c1267940j6G3.LIZLLL;
        int i4 = 7;
        if (i2 == 0) {
            i2 = 7;
        }
        try {
            if (this.LL.LIZ.captureBase.camera15FpsDisallowList.contains(Build.MODEL.toLowerCase(Locale.ROOT))) {
                i3 = 30;
            } else {
                i4 = i2;
                if (i2 != i3 || i3 == 30) {
                }
                this.LLJJ.setPreviewFpsRange(new TEFrameRateRange(i4, i3), i);
                return new Pair<>(Integer.valueOf(this.LLJJ.start()), "");
            }
            return new Pair<>(Integer.valueOf(this.LLJJ.start()), "");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            String message = e.getMessage();
            if (message != null) {
                str2 = message;
            }
            return new Pair<>(-206, str2);
        }
        i = 3;
        this.LLJJ.setPreviewFpsRange(new TEFrameRateRange(i4, i3), i);
    }

    public final void LJIIJJI(String str) {
        int cameraState = this.LLJJ.getCameraState(true);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stopPreviewInternal reason: ");
        sbLIZ.append(str);
        sbLIZ.append(" state: ");
        sbLIZ.append(cameraState);
        AVLog.logKibana(4, "CameraCaptureManager", C2188811AlT.LIZIZ(sbLIZ), null);
        this.LLJJ.stop(true);
    }

    @Override // X.C1DJP
    public final void LJIILJJIL(int i) {
        C1269190j8H c1269190j8H = this.LLJ;
        c1269190j8H.LIZ = -1L;
        c1269190j8H.LIZIZ = -1L;
        c1269190j8H.LIZJ = System.currentTimeMillis();
        c1269190j8H.LIZLLL = -1L;
        c1269190j8H.LJ = -1.0d;
        c1269190j8H.LJFF = -1;
        c1269190j8H.LJI = -1;
        c1269190j8H.LJII = null;
        InterfaceC1267470j5V interfaceC1267470j5V = this.LLILLJJLI;
        if (interfaceC1267470j5V != null) {
            ((C1266850j4V) interfaceC1267470j5V).LIZ.LJ();
        }
    }

    @Override // X.InterfaceC1271000jBC
    public final TEFrameSizei LJJJ(List<TEFrameSizei> list) {
        if (list != null) {
            Collections.sort(list, new AComparatorS39S0000000_20(18));
            this.LLJJJ.clear();
            this.LLJJJ.addAll(list);
        }
        C1267940j6G c1267940j6G = this.LLJI;
        int iMax = Math.max(c1267940j6G.LIZ, c1267940j6G.LIZIZ);
        C1267940j6G c1267940j6G2 = this.LLJI;
        int iMin = Math.min(c1267940j6G2.LIZ, c1267940j6G2.LIZIZ);
        TEFrameSizei tEFrameSizeiLIZ = C1270730jAl.LIZ(iMax, iMin, true, list);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getPreviewSize() called with: supportPreviewSizes = ");
        sbLIZ.append(list);
        sbLIZ.append(" size = ");
        sbLIZ.append(tEFrameSizeiLIZ);
        sbLIZ.append(" width = ");
        sbLIZ.append(iMax);
        sbLIZ.append(" height = ");
        sbLIZ.append(iMin);
        AVLog.logKibana(4, "CameraCaptureManager", C2188811AlT.LIZIZ(sbLIZ), null);
        int i = tEFrameSizeiLIZ.width;
        if (iMax != i || iMin != tEFrameSizeiLIZ.height) {
            InterfaceC1267470j5V interfaceC1267470j5V = this.LLILLJJLI;
            if (interfaceC1267470j5V != null) {
                ((C1266850j4V) interfaceC1267470j5V).LIZ.LJIILIIL(2, tEFrameSizeiLIZ.height, i, "Capture Resolution Changed.");
            }
            Handler handler = this.LLILZ;
            if (handler != null) {
                C786410Ut5.LJJZZIII(handler, new ARunnableS120S0100000_20(this, 433));
            }
        }
        InterfaceC1267470j5V interfaceC1267470j5V2 = this.LLILLJJLI;
        if (interfaceC1267470j5V2 != null) {
            ((C1266850j4V) interfaceC1267470j5V2).LIZ.LJIILIIL(5, tEFrameSizeiLIZ.height, tEFrameSizeiLIZ.width, "Camera Init Size Changed!");
        }
        InterfaceC1267470j5V interfaceC1267470j5V3 = this.LLILLJJLI;
        if (interfaceC1267470j5V3 != null) {
            ((C1266850j4V) interfaceC1267470j5V3).LIZ.LJIILIIL(3, tEFrameSizeiLIZ.width, tEFrameSizeiLIZ.height, "Camera Size Changed!");
        }
        C1267940j6G c1267940j6G3 = this.LLJI;
        c1267940j6G3.LIZ = tEFrameSizeiLIZ.height;
        c1267940j6G3.LIZIZ = tEFrameSizeiLIZ.width;
        return tEFrameSizeiLIZ;
    }

    @Override // X.InterfaceC1305720k5C
    public final void LJFF(String str, String str2) {
        if (Intrinsics.LJFF("te_record_camera_runtime_info", str)) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                this.LLJ.LIZ = JSONObjectProtectorUtils.getLong(jSONObject, "avgExposureTime");
                this.LLJ.LIZLLL = JSONObjectProtectorUtils.getLong(jSONObject, "AvgFps");
                this.LLJ.LJ = jSONObject.optDouble("AvgCaptureResultFPS", -1.0d);
                if (jSONObject.isNull("AvgISO")) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C1269190j8H c1269190j8H = this.LLJ;
                    if (jCurrentTimeMillis - c1269190j8H.LIZJ > Mp4ScreenVideoLoadTimeout.CONTROL) {
                        c1269190j8H.LIZJ = jCurrentTimeMillis;
                        int iso = this.LLJJ.getISO(this.LLJJIJIL);
                        if (iso > 0) {
                            this.LLJ.LIZIZ = iso;
                        }
                    }
                } else {
                    this.LLJ.LIZIZ = JSONObjectProtectorUtils.getLong(jSONObject, "AvgISO");
                }
                InterfaceC1270850jAx interfaceC1270850jAx = this.LLILZLL;
                if (interfaceC1270850jAx != null) {
                    interfaceC1270850jAx.LJJIII(this.LLJ.LIZ);
                }
                InterfaceC1270850jAx interfaceC1270850jAx2 = this.LLILZLL;
                if (interfaceC1270850jAx2 != null) {
                    interfaceC1270850jAx2.LJJIJIIJIL(this.LLJ.LIZIZ);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public final void LJIIIIZZ(int i, Exception exc) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onErrorOnHandler: ret = ");
        sbLIZ.append(i);
        sbLIZ.append(", e = ");
        sbLIZ.append(exc);
        AVLog.logKibana(4, "CameraCaptureManager", C2188811AlT.LIZIZ(sbLIZ), null);
        if (i != -443) {
            if (i != -409 && i != -105) {
                if (i != 3) {
                    if (i != -421 && i != -420 && i != -404 && i != -403) {
                        switch (i) {
                            case -417:
                            case -416:
                                break;
                            case -415:
                            case -414:
                            case -413:
                                this.LLJJIJI = false;
                                break;
                            case -412:
                            case -411:
                                this.LLJJIII = false;
                                break;
                            default:
                                InterfaceC1267470j5V interfaceC1267470j5V = this.LLILLJJLI;
                                if (interfaceC1267470j5V != null) {
                                    ((C1266850j4V) interfaceC1267470j5V).LIZ.LJI(i, exc);
                                }
                                break;
                        }
                        return;
                    }
                } else {
                    LJIIL();
                    return;
                }
            }
            InterfaceC1267470j5V interfaceC1267470j5V2 = this.LLILLJJLI;
            if (interfaceC1267470j5V2 == null) {
                return;
            }
            ((C1266850j4V) interfaceC1267470j5V2).LIZ.LJIILIIL(1, i, 0, "Camera error!");
            return;
        }
        AVLog.logKibana(6, "CameraCaptureManager", "onErrorOnHandler: mCapture restart due to non_fatal_error", null);
        LJIIJJI("error_retry");
        LJIIJ("error_retry");
    }

    @Override // X.C1DJP
    public final void LLIIL(int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCaptureStarted() called with: cameraType = ");
        sbLIZ.append(i);
        sbLIZ.append(", result = ");
        sbLIZ.append(i2);
        sbLIZ.append(" thread: ");
        sbLIZ.append(C786410Ut5.u3().getName());
        AVLog.logKibana(4, "CameraCaptureManager", C2188811AlT.LIZIZ(sbLIZ), null);
        if (i2 != 0) {
            onError(i2, "Camera retry open failed!");
            return;
        }
        if (!C786410Ut5.u3().getName().equals("LiveCoreVideoCaptureThread")) {
            Handler handler = this.LLILZ;
            if (handler != null) {
                C786410Ut5.LJJZZIII(handler, new ARunnableS31S0101000_20(i, this, 41));
                return;
            }
            return;
        }
        int cameraState = this.LLJJ.getCameraState(true);
        if (cameraState != 2 && cameraState != 3) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onCaptureStarted: cameraState:");
            sbLIZ2.append(cameraState);
            sbLIZ2.append(", return");
            AVLog.logKibana(4, "CameraCaptureManager", C2188811AlT.LIZIZ(sbLIZ2), null);
            return;
        }
        if (this.LLJILLL != i) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("onCaptureStarted TargetCamera:");
            sbLIZ3.append(this.LLJILLL);
            sbLIZ3.append(" RealCamera:");
            sbLIZ3.append(i);
            C1270690jAh.LIZJ(2, "CameraCaptureManager", C2188811AlT.LIZIZ(sbLIZ3));
            this.LLJILLL = i;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("onCaptureStarted ok this:");
        sbLIZ4.append(this);
        C1270690jAh.LIZJ(1, "CameraCaptureManager", C2188811AlT.LIZIZ(sbLIZ4));
        if (this.LLIZ <= 0) {
            onError(-206, "Invalid texture");
            return;
        }
        Pair<Integer, String> pairLJIIJ = LJIIJ("capture_started");
        if (pairLJIIJ.getFirst().intValue() == 0) {
            InterfaceC1267470j5V interfaceC1267470j5V = this.LLILLJJLI;
            if (interfaceC1267470j5V != null) {
                ((C1266850j4V) interfaceC1267470j5V).LIZ.LJIIJ();
                return;
            }
            return;
        }
        onError(pairLJIIJ.getFirst().intValue(), pairLJIIJ.getSecond());
    }

    @Override // X.C1DJP
    public final void onError(int i, String str) {
        Exception exc = new Exception(str);
        if (Intrinsics.LJFF(C786410Ut5.u3().getName(), "LiveCoreVideoCaptureThread")) {
            LJIIIIZZ(i, exc);
            return;
        }
        Handler handler = this.LLILZ;
        if (handler == null) {
            return;
        }
        C786410Ut5.LJJZZIII(handler, new ARunnableS26S0201000_20(this, i, exc, 18));
    }

    @Override // X.InterfaceC1305720k5C
    public final void LJI(long j, String str) {
    }

    @Override // X.InterfaceC1305720k5C
    public final void LJII(double d, String str) {
    }

    public static final void LJIIIZ(long j, Handler handler, Runnable runnable) {
        if (handler != null && j > 0) {
            Object obj = new Object();
            boolean[] zArr = {false};
            synchronized (obj) {
                try {
                    if (C786410Ut5.LJJZZIII(handler, new ARunnableS36S0300000_3(runnable, zArr, obj, 11))) {
                        try {
                            obj.wait(j);
                        } catch (InterruptedException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // X.C1DJP
    public final void onInfo(int i, int i2, String str) {
        if (i != 0) {
            if (i != 52) {
                if (i != 120) {
                    if (i == 121) {
                        this.LLJ.LJII = str;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onInfo TECaptureInfo:");
                        sbLIZ.append(i);
                        sbLIZ.append(" VideoCaptureMinFps:");
                        sbLIZ.append(this.LLJI.LIZJ);
                        sbLIZ.append(" VideoCaptureFps:");
                        sbLIZ.append(this.LLJI.LIZLLL);
                        sbLIZ.append(" RealFpsRange:");
                        sbLIZ.append(str);
                        sbLIZ.append(" CameraType:");
                        sbLIZ.append(this.LLJILLL);
                        C1270690jAh.LIZJ(4, "CameraCaptureManager", C2188811AlT.LIZIZ(sbLIZ));
                        return;
                    }
                    return;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onInfo TECaptureInfo:");
                sbLIZ2.append(i);
                sbLIZ2.append(" Ext:");
                sbLIZ2.append(i2);
                sbLIZ2.append(" msg:");
                sbLIZ2.append(str);
                sbLIZ2.append(" CameraType:");
                sbLIZ2.append(this.LLJILLL);
                C1270690jAh.LIZJ(4, "CameraCaptureManager", C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
            Handler handler = this.LLILZ;
            if (handler == null) {
                return;
            }
            C786410Ut5.LJJZZIII(handler, new ARunnableS120S0100000_20(this, 417));
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("onInfo TECaptureInfo:");
        sbLIZ3.append(i);
        sbLIZ3.append(" Ext:");
        sbLIZ3.append(i2);
        sbLIZ3.append(" msg:");
        sbLIZ3.append(str);
        sbLIZ3.append(" CameraType:");
        sbLIZ3.append(this.LLJILLL);
        C1270690jAh.LIZJ(4, "CameraCaptureManager", C2188811AlT.LIZIZ(sbLIZ3));
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0jAo] */
    public C1270620jAa(C1267500j5Y c1267500j5Y, C1266350j3h c1266350j3h, InterfaceC1267470j5V interfaceC1267470j5V, Context context, C1269730j99 c1269730j99) {
        Handler handlerLIZ;
        int i;
        int iLJJIIJZLJL;
        int iLJJIII;
        TEFrameSizei tEFrameSizei;
        TEFrameSizei tEFrameSizei2;
        C1269160j8E c1269160j8E;
        C1269160j8E c1269160j8E2;
        this.LL = c1267500j5Y;
        this.LLILLJJLI = interfaceC1267470j5V;
        this.LLILLL = context;
        C1269190j8H c1269190j8H = new C1269190j8H();
        this.LLJ = c1269190j8H;
        this.LLJI = new C1267940j6G();
        this.LLJIJIL = new AtomicLong(0L);
        this.LLJILLL = 2;
        this.LLJJIJIIJIL = new JSONObject();
        this.LLJJIJIL = new InterfaceC1283620jVY() { // from class: X.0jAo
            @Override // X.InterfaceC1283620jVY
            public final void LIZ(int i2) {
                C1270620jAa c1270620jAa = this.LIZ;
                C1269190j8H c1269190j8H2 = c1270620jAa.LLJ;
                long j = i2;
                c1269190j8H2.LIZIZ = j;
                c1269190j8H2.LIZJ = System.currentTimeMillis();
                InterfaceC1270850jAx interfaceC1270850jAx = c1270620jAa.LLILZLL;
                if (interfaceC1270850jAx != null) {
                    interfaceC1270850jAx.LJJIJIIJIL(j);
                }
            }
        };
        this.LLJJJ = new ArrayList<>();
        C1268700j7U c1268700j7U = (C1268700j7U) c1267500j5Y.LIZJ.getService(C1268700j7U.class);
        if (c1268700j7U != null) {
            handlerLIZ = c1268700j7U.LIZ();
        } else {
            handlerLIZ = null;
        }
        this.LLILZ = handlerLIZ;
        c1267500j5Y.LIZJ.getService(C1267810j63.class);
        if (c1267500j5Y.LIZ.captureBase.videoCapture.LJIIJ()) {
            i = 2;
        } else {
            i = 1;
        }
        this.LLJILLL = i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init: useCamera2Api ");
        sbLIZ.append(c1267500j5Y.LIZ.captureBase.videoCapture.LJIIJ());
        sbLIZ.append(" camera type: ");
        sbLIZ.append(this.LLJILLL);
        sbLIZ.append(" mCaptureParams:");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(", minFps:");
        if (c1266350j3h != null && (c1269160j8E2 = c1266350j3h.LLILZLL) != null) {
            iLJJIIJZLJL = c1269160j8E2.LJJIIJZLJL();
        } else {
            iLJJIIJZLJL = 0;
        }
        sbLIZ.append(iLJJIIJZLJL);
        sbLIZ.append(", fps:");
        if (c1266350j3h != null && (c1269160j8E = c1266350j3h.LLILZLL) != null) {
            iLJJIII = c1269160j8E.LJJIII();
        } else {
            iLJJIII = 0;
        }
        sbLIZ.append(iLJJIII);
        C2188811AlT.LIZIZ(sbLIZ);
        if (c1267500j5Y.LIZ.captureBase.videoCapture.LJIIIIZZ()) {
            new C1267940j6G();
            c1267500j5Y.LIZ.captureBase.videoCapture.LJIIJJI();
            c1267500j5Y.LIZ.captureBase.videoCapture.LJI();
            int iLJ = c1267500j5Y.LIZ.captureBase.videoCapture.LJ();
            CaptureBase.VideoCaptureParams videoCaptureParams = c1267500j5Y.LIZ.captureBase.videoCapture;
            int i2 = videoCaptureParams.LIZJ;
            if (iLJ > 0 && i2 <= 0) {
                i2 = iLJ < 30 ? iLJ : 7;
            }
            int i3 = videoCaptureParams.LIZ;
            c1269190j8H.LJIIIZ = iLJ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("updateParamsFromBuilder videoCaptureFps:");
            sbLIZ2.append(iLJ);
            sbLIZ2.append(" videoCaptureMinFps:");
            sbLIZ2.append(i2);
            sbLIZ2.append(" originMinFps:");
            sbLIZ2.append(iLJ);
            sbLIZ2.append(" width:");
            sbLIZ2.append(this.LLJI.LIZ);
            sbLIZ2.append(" height:");
            sbLIZ2.append(this.LLJI.LIZIZ);
            sbLIZ2.append(" videoCaptureDevice:");
            sbLIZ2.append(c1267500j5Y.LIZ.captureBase.videoCapture.LIZ);
            AVLog.logKibana(4, "CameraCaptureManager", C2188811AlT.LIZIZ(sbLIZ2), null);
        }
        c1269190j8H.LJIIJJI = this.LLJILLL;
        this.LLILZIL = new C1270630jAb(c1267500j5Y, c1269730j99);
        TECameraCapture tECameraCapture = new TECameraCapture(this);
        this.LLJJ = tECameraCapture;
        TECameraCapture.registerLogOutput((byte) 5, new InterfaceC1305670k57() { // from class: X.0jAi
            @Override // X.InterfaceC1305670k57
            public final void LIZ(byte b, String str, String str2) {
                if (C1270690jAh.LIZ(EnumC1270750jAn.REPORT_TRACE, b)) {
                    C1270690jAh.LIZJ(b, str, str2);
                }
            }
        });
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("init() called,mCameraCapture: ");
        sbLIZ3.append(tECameraCapture);
        sbLIZ3.append(" state: ");
        sbLIZ3.append(tECameraCapture.getCameraState(true));
        sbLIZ3.append(" reuse: ");
        sbLIZ3.append(c1267500j5Y.LIZIZ.LJJJJLL);
        sbLIZ3.append(" reuse pipeline: ");
        sbLIZ3.append(c1267500j5Y.LIZIZ.LJJJJZ);
        sbLIZ3.append(" reuse size: ");
        C2185991Agv c2185991Agv = c1267500j5Y.LIZIZ.LJJJJZ;
        if (c2185991Agv != null) {
            tEFrameSizei = c2185991Agv.LIZIZ;
        } else {
            tEFrameSizei = null;
        }
        sbLIZ3.append(tEFrameSizei);
        sbLIZ3.append(" type: ");
        sbLIZ3.append(this.LLJILLL);
        AVLog.logKibana(4, "CameraCaptureManager", C2188811AlT.LIZIZ(sbLIZ3), null);
        C2185991Agv c2185991Agv2 = c1267500j5Y.LIZIZ.LJJJJZ;
        if (c2185991Agv2 != null && (tEFrameSizei2 = c2185991Agv2.LIZIZ) != null) {
            int iLJIIJJI = c1267500j5Y.LIZ.captureBase.videoCapture.LJIIJJI();
            int iLJI = c1267500j5Y.LIZ.captureBase.videoCapture.LJI();
            if (iLJIIJJI != tEFrameSizei2.height || iLJI != tEFrameSizei2.width) {
                tECameraCapture.stop(true);
                C1269500j8m.LIZIZ(tECameraCapture);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("camera state after stop: ");
                sbLIZ4.append(tECameraCapture.getCameraState(true));
                C2188811AlT.LIZIZ(sbLIZ4);
            }
        }
        tECameraCapture.registerPreviewListener(this);
        TECameraCapture.registerMonitor(tECameraCapture, this);
        new C1270780jAq(tECameraCapture, handlerLIZ);
        if (c1267500j5Y.LIZIZ.LJJJJLL == 1) {
            this.LLJILJILJ = new C1270680jAg(this, tECameraCapture, c1267500j5Y, c1269190j8H, handlerLIZ);
        }
        if (handlerLIZ != null) {
            C786410Ut5.LJJZZIII(handlerLIZ, new ARunnableS120S0100000_20(this, 446));
        }
    }
}
