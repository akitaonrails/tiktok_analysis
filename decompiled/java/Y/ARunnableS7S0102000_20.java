package Y;

import X.C01IL;
import X.C1267940j6G;
import X.C1269190j8H;
import X.C1270610jAZ;
import X.C1270620jAa;
import X.C1271300jBg;
import X.C1271390jBp;
import X.C1272170jD5;
import X.C1272970jEN;
import X.C1273600jFO;
import X.C1273890jFr;
import X.C1274460jGm;
import X.C1274560jGw;
import X.C1274570jGx;
import X.C1274860jHQ;
import X.C1274900jHU;
import X.C1275150jHt;
import X.C1289620jfE;
import X.C1312310kFp;
import X.C1312420kG0;
import X.C1315680kLG;
import X.C1315700kLI;
import X.C1316190kM5;
import X.C1316300kMG;
import X.C1316590kMj;
import X.C1319460kRM;
import X.C1319470kRN;
import X.C1C7U;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1274450jGl;
import X.InterfaceC774920UaY;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.base.TraceEvent;
import com.ss.android.ttvecamera.TEFrameRateRange;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.bytertc.engine.VideoEncoderConfig;
import com.ss.bytertc.engine.data.VideoSolutionMode;
import com.ss.ttlivestreamer.core.opengl.GlRenderDrawer;
import com.ss.ttlivestreamer.core.scene_detect.TTLHSceneDetectResultInfo;
import com.ss.ttlivestreamer.core.scene_detect.TTLHSceneDetector;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import com.tts.oecverify.BdTuring;
import j27.s;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS7S0102000_20 implements Runnable {
    public final int $t;
    public int i1;
    public int i2;
    public Object l0;

    public final void LIZ$1() {
        long jNativeTimeUTCMicros = TimeUtils.nativeTimeUTCMicros();
        if (((TTLHSceneDetector) this.l0).rgbaBuffer == null) {
            AVLog.e("TTLHSceneDetector", "sceneDetect: Failed to convert texture to RGBA ByteBuffer.");
            new HashMap().put("error", "rgba_conversion_failed");
        }
        TTLHSceneDetectResultInfo tTLHSceneDetectResultInfo = new TTLHSceneDetectResultInfo();
        TTLHSceneDetector tTLHSceneDetector = (TTLHSceneDetector) this.l0;
        int iNativeSceneDetect = tTLHSceneDetector.nativeSceneDetect(tTLHSceneDetector.rgbaBuffer, this.i1, this.i2, tTLHSceneDetectResultInfo);
        if (iNativeSceneDetect != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sceneDetect: Failed to perform scene detection, detect error: ");
            sbLIZ.append(iNativeSceneDetect);
            AVLog.e("TTLHSceneDetector", C2188811AlT.LIZIZ(sbLIZ));
        }
        long jNativeTimeUTCMicros2 = (TimeUtils.nativeTimeUTCMicros() - jNativeTimeUTCMicros) / 1000;
        synchronized (((TTLHSceneDetector) this.l0).mStatisticResourceLock) {
            try {
                ((TTLHSceneDetector) this.l0).mLatestResultInfo = tTLHSceneDetectResultInfo;
                tTLHSceneDetectResultInfo.processCostMs = (int) jNativeTimeUTCMicros2;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("sceneDetect: Scene detection result: ");
        sbLIZ2.append(tTLHSceneDetectResultInfo.toString());
        AVLog.d("TTLHSceneDetector", C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                run$12(this);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                run$13(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        try {
            if (((C1312310kFp) this.l0).LJIIZILJ != null) {
                C1289620jfE.LIZJ(new ARunnableS89S0200000_20(this, new C1312420kG0(((C1312310kFp) this.l0).LJIIZILJ.renderPicture(((C1312310kFp) this.l0).LJIIL, new Rect(0, 0, this.i1, this.i2))), 34));
            } else {
                C1289620jfE.LIZJ(new ARunnableS120S0100000_20(this, 44));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("renderServalSVG failed: ");
            sbLIZ.append(e.getMessage());
            LynxLog.e("lynx_SVGRenderer", C2188811AlT.LIZIZ(sbLIZ));
            C1289620jfE.LIZJ(new ARunnableS120S0100000_20(this, 45));
        }
    }

    public final void LIZ$2() {
        C1274460jGm c1274460jGm = (C1274460jGm) this.l0;
        if (c1274460jGm.LLJJI) {
            return;
        }
        if (c1274460jGm.LLJIJIL == null) {
            c1274460jGm.LLJIJIL = new GlRenderDrawer();
            ((C1274460jGm) this.l0).LLJIJIL.setUseVideoRangeDefault(true);
        }
        C1274460jGm c1274460jGm2 = (C1274460jGm) this.l0;
        if (c1274460jGm2.LLJI == null) {
            C1271300jBg c1271300jBg = new C1271300jBg();
            c1271300jBg.LIZ = false;
            c1274460jGm2.LLJI = new C1271390jBp(c1271300jBg);
        }
        ((C1274460jGm) this.l0).LLJI.LIZLLL(this.i1, this.i2);
        C1274460jGm c1274460jGm3 = (C1274460jGm) this.l0;
        int i = this.i1;
        c1274460jGm3.getClass();
        int i2 = (((i + 8) - 1) / 8) * 8;
        int i3 = (i2 + 1) >> 1;
        int i4 = (this.i2 + 1) >> 1;
        C1274460jGm c1274460jGm4 = (C1274460jGm) this.l0;
        int[] iArr = c1274460jGm4.LLJ;
        if (iArr[0] > 0) {
            GLES20.glDeleteTextures(iArr.length, iArr, 0);
            int i5 = 0;
            while (true) {
                int[] iArr2 = c1274460jGm4.LLJ;
                if (i5 >= iArr2.length) {
                    break;
                }
                iArr2[i5] = 0;
                i5++;
            }
        }
        ((C1274460jGm) this.l0).LLJ[0] = C1274460jGm.LJIIL(33984, i2, this.i2);
        ((C1274460jGm) this.l0).LLJ[1] = C1274460jGm.LJIIL(33985, i3, i4);
        ((C1274460jGm) this.l0).LLJ[2] = C1274460jGm.LJIIL(33986, i3, i4);
        C1274460jGm c1274460jGm5 = (C1274460jGm) this.l0;
        c1274460jGm5.LLJILJIL = this.i1;
        c1274460jGm5.LLJILJILJ = this.i2;
        c1274460jGm5.LLJILLL = null;
    }

    public final void LIZ$3() {
        int i;
        int i2 = this.i1;
        if (i2 == 0 || (i = this.i2) == 0) {
            return;
        }
        C1275150jHt c1275150jHt = (C1275150jHt) ((C1272970jEN) this.l0).LIZ.l1;
        c1275150jHt.LIZIZ = i2;
        c1275150jHt.LIZJ = i;
        if (i2 > 720 || i > 720) {
            int[] iArrLIZ = C1275150jHt.LIZ(i2, i);
            C1275150jHt c1275150jHt2 = (C1275150jHt) ((C1272970jEN) this.l0).LIZ.l1;
            c1275150jHt2.LIZIZ = iArrLIZ[0];
            c1275150jHt2.LIZJ = iArrLIZ[1];
        }
        C1275150jHt c1275150jHt3 = (C1275150jHt) ((C1272970jEN) this.l0).LIZ.l1;
        c1275150jHt3.LIZIZ = (((c1275150jHt3.LIZIZ + 2) - 1) / 2) * 2;
        c1275150jHt3.LIZJ = (((c1275150jHt3.LIZJ + 2) - 1) / 2) * 2;
        if (c1275150jHt3.LJIILIIL) {
            c1275150jHt3.LJIILLIIL.removeCallbacks(c1275150jHt3.LJIIJJI);
            C1275150jHt c1275150jHt4 = (C1275150jHt) ((C1272970jEN) this.l0).LIZ.l1;
            if (c1275150jHt4.LJIIIIZZ != null) {
                VideoEncoderConfig videoEncoderConfig = new VideoEncoderConfig(c1275150jHt4.LIZIZ, c1275150jHt4.LIZJ, c1275150jHt4.LIZLLL, c1275150jHt4.LJ, 0);
                C1275150jHt c1275150jHt5 = (C1275150jHt) ((C1272970jEN) this.l0).LIZ.l1;
                c1275150jHt5.LJIIIIZZ.setVideoEncoderConfig(c1275150jHt5.LJII, VideoSolutionMode.VIDEO_SOLUTION_MODE_SINGLE, new VideoEncoderConfig[]{videoEncoderConfig}, 1);
            }
            C1275150jHt c1275150jHt6 = (C1275150jHt) ((C1272970jEN) this.l0).LIZ.l1;
            C1273600jFO c1273600jFO = c1275150jHt6.LJI;
            if (c1273600jFO != null) {
                c1273600jFO.LIZJ(c1275150jHt6.LIZIZ, c1275150jHt6.LIZJ);
            }
            if (((C1275150jHt) ((C1272970jEN) this.l0).LIZ.l1).LJIILJJIL.LJII()) {
                C1275150jHt c1275150jHt7 = (C1275150jHt) ((C1272970jEN) this.l0).LIZ.l1;
                C01IL c01il = c1275150jHt7.LJIIIZ.LIZIZ;
                if (c01il != null) {
                    c01il.LIZ = c1275150jHt7.LIZIZ;
                    c01il.LIZIZ = c1275150jHt7.LIZJ;
                }
            }
            C1275150jHt c1275150jHt8 = (C1275150jHt) ((C1272970jEN) this.l0).LIZ.l1;
            C786410Ut5.LJJZZIII(c1275150jHt8.LJIILLIIL, c1275150jHt8.LJIIJJI);
        }
    }

    public final void LIZ$4() {
        C1274860jHQ c1274860jHQ = (C1274860jHQ) this.l0;
        if (!c1274860jHQ.LJIJ) {
            InterfaceC1274450jGl interfaceC1274450jGl = c1274860jHQ.LJIIIZ.LJIILIIL;
            C1274900jHU c1274900jHU = (C1274900jHU) interfaceC1274450jGl;
            c1274900jHU.LIZ(this.i1, this.i2, c1274860jHQ.LJIIJ);
            return;
        }
        InterfaceC1274450jGl interfaceC1274450jGl2 = c1274860jHQ.LJIIIZ.LJIILIIL;
        C1274900jHU c1274900jHU2 = (C1274900jHU) interfaceC1274450jGl2;
        c1274900jHU2.LIZIZ(this.i1, this.i2, c1274860jHQ.LJIIJ, c1274860jHQ.LJIIJJI);
    }

    public static final void run$0(ARunnableS7S0102000_20 aRunnableS7S0102000_20) {
        boolean zLIZ;
        C1C7U.LIZ("LiveStream@b84d.audioStatusCaptureObserver$1$onAudioDeviceCaptureStateChanged$1");
        try {
            InterfaceC774920UaY interfaceC774920UaY = ((C1273890jFr) aRunnableS7S0102000_20.l0).LJIIJ;
            if (interfaceC774920UaY != null) {
                interfaceC774920UaY.I1(aRunnableS7S0102000_20.i1, aRunnableS7S0102000_20.i2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveStream@b84d.audioStatusCaptureObserver$1$onAudioDeviceCaptureStateChanged$1");
    }

    public static final void run$1(ARunnableS7S0102000_20 aRunnableS7S0102000_20) {
        boolean zLIZ;
        C1C7U.LIZ("SVGRenderer@6976.renderServalSVG$1");
        try {
            aRunnableS7S0102000_20.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SVGRenderer@6976.renderServalSVG$1");
    }

    public static final void run$10(ARunnableS7S0102000_20 aRunnableS7S0102000_20) {
        int i;
        int i2;
        C1270620jAa c1270620jAa = (C1270620jAa) aRunnableS7S0102000_20.l0;
        int i3 = aRunnableS7S0102000_20.i1;
        int i4 = aRunnableS7S0102000_20.i2;
        C1C7U.LIZ("CameraCaptureManager@b43e.setCameraPreviewFpsRangeWhenRunning$1L");
        int cameraState = c1270620jAa.LLJJ.getCameraState(true);
        boolean zContains = c1270620jAa.LL.LIZ.captureBase.camera15FpsDisallowList.contains(Build.MODEL.toLowerCase(Locale.ROOT));
        if (zContains) {
            i = 7;
            i2 = 30;
        } else {
            i = i3;
            i2 = i4;
        }
        C1267940j6G c1267940j6G = c1270620jAa.LLJI;
        c1267940j6G.LIZJ = i;
        c1267940j6G.LIZLLL = i2;
        C1269190j8H c1269190j8H = c1270620jAa.LLJ;
        c1269190j8H.LJIIIIZZ = i;
        c1269190j8H.LJIIIZ = i2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setCameraPreviewFpsRangeWhenRunning notAllow15fps:");
        sbLIZ.append(zContains);
        sbLIZ.append(" min:");
        sbLIZ.append(i3);
        sbLIZ.append(" max:");
        sbLIZ.append(i4);
        sbLIZ.append(" minFps:");
        sbLIZ.append(i);
        sbLIZ.append(" maxFps:");
        sbLIZ.append(i2);
        sbLIZ.append(" mCaptureParams:");
        sbLIZ.append(c1270620jAa.LLJI);
        sbLIZ.append(" state:");
        sbLIZ.append(cameraState);
        AVLog.logKibana(4, "CameraCaptureManager", C2188811AlT.LIZIZ(sbLIZ), null);
        if (cameraState == 3) {
            try {
                c1270620jAa.LLJJ.setPreviewFpsRangeWhenRunning(new TEFrameRateRange(i, i2));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("setCameraPreviewFpsRangeWhenRunning error:");
                sbLIZ2.append(th.getMessage());
                AVLog.logKibana(6, "CameraCaptureManager", C2188811AlT.LIZIZ(sbLIZ2), th);
            }
        }
        C1C7U.LIZIZ("CameraCaptureManager@b43e.setCameraPreviewFpsRangeWhenRunning$1L");
    }

    public static final void run$11(ARunnableS7S0102000_20 aRunnableS7S0102000_20) {
        boolean zLIZ;
        C1C7U.LIZ("VideoSinkWrapper@73b0.checkRemoteFrameRenderAndStatics$1");
        try {
            aRunnableS7S0102000_20.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoSinkWrapper@73b0.checkRemoteFrameRenderAndStatics$1");
    }

    public static final void run$12(ARunnableS7S0102000_20 aRunnableS7S0102000_20) {
        C1274570jGx c1274570jGx = (C1274570jGx) aRunnableS7S0102000_20.l0;
        int i = aRunnableS7S0102000_20.i1;
        int i2 = aRunnableS7S0102000_20.i2;
        c1274570jGx.getClass();
        C1C7U.LIZ("LyraxDefaultRenderProcessor@f6ac.ensureTextureDrawer$1L");
        if (!c1274570jGx.LJJ) {
            try {
                if (c1274570jGx.LJIILLIIL == null) {
                    GlRenderDrawer glRenderDrawer = new GlRenderDrawer();
                    c1274570jGx.LJIILLIIL = glRenderDrawer;
                    glRenderDrawer.setUseVideoRangeDefault(true);
                }
                if (c1274570jGx.LJIILL == null) {
                    C1271300jBg c1271300jBg = new C1271300jBg();
                    c1271300jBg.LIZ = c1274570jGx.LJIIIIZZ;
                    c1274570jGx.LJIILL = new C1271390jBp(c1271300jBg);
                }
                c1274570jGx.LJIILL.LIZLLL(i, i2);
                int i3 = (((i + 8) - 1) / 8) * 8;
                int i4 = (i3 + 1) >> 1;
                int i5 = (i2 + 1) >> 1;
                int[] iArr = c1274570jGx.LJIILJJIL;
                if (iArr[0] > 0) {
                    GLES20.glDeleteTextures(iArr.length, iArr, 0);
                    int i6 = 0;
                    while (true) {
                        int[] iArr2 = c1274570jGx.LJIILJJIL;
                        if (i6 >= iArr2.length) {
                            break;
                        }
                        iArr2[i6] = 0;
                        i6++;
                    }
                }
                c1274570jGx.LJIILJJIL[0] = C1274570jGx.LJII(33984, i3, i2);
                c1274570jGx.LJIILJJIL[1] = C1274570jGx.LJII(33985, i4, i5);
                c1274570jGx.LJIILJJIL[2] = C1274570jGx.LJII(33986, i4, i5);
                c1274570jGx.LJIJI = i;
                c1274570jGx.LJIJJ = i2;
                c1274570jGx.LJIJ = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                AVLog.ioe("LyraxDefaultRenderProcessor", "createTexture error", th);
                c1274570jGx.LJIIJJI();
            }
        }
        C1C7U.LIZIZ("LyraxDefaultRenderProcessor@f6ac.ensureTextureDrawer$1L");
    }

    public static final void run$13(ARunnableS7S0102000_20 aRunnableS7S0102000_20) {
        C1274560jGw c1274560jGw = (C1274560jGw) aRunnableS7S0102000_20.l0;
        int i = aRunnableS7S0102000_20.i1;
        int i2 = aRunnableS7S0102000_20.i2;
        c1274560jGw.getClass();
        C1C7U.LIZ("LyraxSingleViewRenderProcessor@ac26.ensureTextureDrawer$1L");
        if (!c1274560jGw.LJIILIIL) {
            try {
                if (c1274560jGw.LJII == null) {
                    GlRenderDrawer glRenderDrawer = new GlRenderDrawer();
                    c1274560jGw.LJII = glRenderDrawer;
                    glRenderDrawer.setUseVideoRangeDefault(true);
                }
                if (c1274560jGw.LJI == null) {
                    C1271300jBg c1271300jBg = new C1271300jBg();
                    c1271300jBg.LIZ = false;
                    c1274560jGw.LJI = new C1271390jBp(c1271300jBg);
                }
                c1274560jGw.LJI.LIZLLL(i, i2);
                int i3 = (((i + 8) - 1) / 8) * 8;
                int i4 = (i3 + 1) >> 1;
                int i5 = (i2 + 1) >> 1;
                int[] iArr = c1274560jGw.LJFF;
                if (iArr[0] > 0) {
                    GLES20.glDeleteTextures(iArr.length, iArr, 0);
                    int i6 = 0;
                    while (true) {
                        int[] iArr2 = c1274560jGw.LJFF;
                        if (i6 >= iArr2.length) {
                            break;
                        }
                        iArr2[i6] = 0;
                        i6++;
                    }
                }
                c1274560jGw.LJFF[0] = C1274560jGw.LJII(33984, i3, i2);
                c1274560jGw.LJFF[1] = C1274560jGw.LJII(33985, i4, i5);
                c1274560jGw.LJFF[2] = C1274560jGw.LJII(33986, i4, i5);
                c1274560jGw.LJIIJ = i;
                c1274560jGw.LJIIJJI = i2;
                c1274560jGw.LJIIIZ = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                AVLog.ioe("LyraxSingleViewRenderProcessor", "createTexture error", th);
                c1274560jGw.LJIIIZ();
            }
        }
        C1C7U.LIZIZ("LyraxSingleViewRenderProcessor@ac26.ensureTextureDrawer$1L");
    }

    public static final void run$2(ARunnableS7S0102000_20 aRunnableS7S0102000_20) {
        boolean zLIZ;
        C1C7U.LIZ("TTLHSceneDetector@3ccd.sceneDetect$1");
        try {
            aRunnableS7S0102000_20.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TTLHSceneDetector@3ccd.sceneDetect$1");
    }

    public static final void run$3(ARunnableS7S0102000_20 aRunnableS7S0102000_20) {
        C1272170jD5 c1272170jD5 = (C1272170jD5) aRunnableS7S0102000_20.l0;
        int i = aRunnableS7S0102000_20.i1;
        int i2 = aRunnableS7S0102000_20.i2;
        c1272170jD5.getClass();
        C1C7U.LIZ("EffectTrack@7ea1.onFrame$1L");
        c1272170jD5.LIZIZ.setEffectTrackOutputTexture(c1272170jD5.LIZ, c1272170jD5.LJI, i, i2);
        C1C7U.LIZIZ("EffectTrack@7ea1.onFrame$1L");
    }

    public static final void run$4(ARunnableS7S0102000_20 aRunnableS7S0102000_20) {
        int i = aRunnableS7S0102000_20.i1;
        C1319470kRN c1319470kRN = (C1319470kRN) aRunnableS7S0102000_20.l0;
        int i2 = aRunnableS7S0102000_20.i2;
        C1C7U.LIZ("FoldViewLayoutNG@63e7.computeScroll$1L");
        if (i == c1319470kRN.LLLIIIL) {
            c1319470kRN.LJIL(-i2);
        }
        C1C7U.LIZIZ("FoldViewLayoutNG@63e7.computeScroll$1L");
    }

    public static final void run$5(ARunnableS7S0102000_20 aRunnableS7S0102000_20) {
        int i = aRunnableS7S0102000_20.i1;
        C1319460kRM c1319460kRM = (C1319460kRM) aRunnableS7S0102000_20.l0;
        int i2 = aRunnableS7S0102000_20.i2;
        C1C7U.LIZ("ScrollCoordinatorLayout@8e40.computeScroll$1L");
        if (i == c1319460kRM.LLLIIIIL) {
            c1319460kRM.LJIJJLI(-i2);
        }
        C1C7U.LIZIZ("ScrollCoordinatorLayout@8e40.computeScroll$1L");
    }

    public static final void run$6(ARunnableS7S0102000_20 aRunnableS7S0102000_20) {
        boolean zLIZ;
        C1C7U.LIZ("InteractVideoSink@c470.createTexture$1");
        try {
            aRunnableS7S0102000_20.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InteractVideoSink@c470.createTexture$1");
    }

    public static final void run$7(ARunnableS7S0102000_20 aRunnableS7S0102000_20) {
        boolean zLIZ;
        C1C7U.LIZ("AuxStream@2e5b.setDisplayView$1$1$onSurfaceChanged$1");
        try {
            aRunnableS7S0102000_20.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AuxStream@2e5b.setDisplayView$1$1$onSurfaceChanged$1");
    }

    public static final void run$8(ARunnableS7S0102000_20 aRunnableS7S0102000_20) {
        boolean zLIZ;
        C1316300kMG c1316300kMG;
        C1C7U.LIZ("LynxImageManager@1fa4.updateImageSource$1");
        try {
            C1315680kLG c1315680kLG = (C1315680kLG) aRunnableS7S0102000_20.l0;
            int i = aRunnableS7S0102000_20.i1;
            int i2 = aRunnableS7S0102000_20.i2;
            if (!c1315680kLG.LLLILZLLLI && !c1315680kLG.LLLILZ && !c1315680kLG.LLLILZJ) {
                c1316300kMG = null;
            } else {
                c1316300kMG = c1315680kLG.LLLLLL;
            }
            C1315700kLI c1315700kLILIZIZ = c1315680kLG.LIZIZ(i, i2, c1315680kLG.LLILZ);
            if (c1315700kLILIZIZ != null) {
                c1315680kLG.LLJLL = c1315700kLILIZIZ;
                C1316190kM5 c1316190kM5 = c1315680kLG.LLILLL;
                C1316590kMj c1316590kMj = c1315680kLG.LLLLLJIL;
                s sVar = c1315680kLG.LLILLJJLI;
                c1316190kM5.getClass();
                TraceEvent.LIZLLL("LynxImageServiceProxy.fetchImage");
                if (!c1316190kM5.LIZIZ) {
                    c1316190kM5.LIZ.fetchImage(c1315700kLILIZIZ, c1316590kMj, c1316300kMG, sVar);
                    TraceEvent.LJII("LynxImageServiceProxy.fetchImage");
                } else {
                    throw null;
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LynxImageManager@1fa4.updateImageSource$1");
    }

    public static final void run$9(ARunnableS7S0102000_20 aRunnableS7S0102000_20) {
        boolean zLIZ;
        C1C7U.LIZ("CameraVideoCapturer@8f5e.getProviderSettings$1");
        try {
            C1270610jAZ c1270610jAZ = (C1270610jAZ) aRunnableS7S0102000_20.l0;
            int i = aRunnableS7S0102000_20.i1;
            int i2 = aRunnableS7S0102000_20.i2;
            SurfaceTexture surfaceTexture = c1270610jAZ.LLJJL;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
            SurfaceTexture surfaceTexture2 = new SurfaceTexture(c1270610jAZ.LLJJJ);
            c1270610jAZ.LLJJL = surfaceTexture2;
            surfaceTexture2.updateTexImage();
            c1270610jAZ.LLJJL.setDefaultBufferSize(i, i2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CameraVideoCapturer@8f5e.getProviderSettings$1");
    }

    public ARunnableS7S0102000_20(int i, Object obj, int i2, int i3) {
        this.$t = i3;
        this.i1 = i;
        this.l0 = obj;
        this.i2 = i2;
    }
}
