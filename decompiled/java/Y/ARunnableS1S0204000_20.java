package Y;

import X.C1270610jAZ;
import X.C1282590jTt;
import X.C1282600jTu;
import X.C1282630jTx;
import X.C1282640jTy;
import X.C1C7U;
import X.C1DJM;
import X.C2188811AlT;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.util.Log;
import android.view.Surface;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttvecamera.TEFrameRateRange;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.CaptureBase;

/* JADX INFO: loaded from: classes21.dex */
public class ARunnableS1S0204000_20 implements Runnable {
    public final int $t;
    public int i2;
    public int i3;
    public int i4;
    public int i5;
    public Object l0;
    public Object l1;

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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        String strLIZIZ;
        MediaCodec mediaCodec = ((C1282630jTx) this.l1).LLILZ;
        if (mediaCodec != null) {
            mediaCodec.stop();
            ((C1282630jTx) this.l1).LLILZ.release();
            ((C1282630jTx) this.l1).LLILZ = null;
        }
        if (this.i2 != 1 && ((C1282630jTx) this.l1).LLJI != 3) {
            String str = C1282630jTx.LLJILJIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MediaCodec doesn't support profile ");
            sbLIZ.append(((C1282630jTx) this.l1).LLJI);
            AVLog.ioe(str, C2188811AlT.LIZIZ(sbLIZ));
            ((boolean[]) this.l0)[0] = false;
            return;
        }
        try {
            ((C1282630jTx) this.l1).LLILZ = MediaCodec.createByCodecName(C1282600jTu.LIZJ("audio/mp4a-latm").getName());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            ((C1282630jTx) this.l1).LLJIJIL = false;
            AVLog.logKibana(6, C1282630jTx.LLJILJIL, "MediaCodec.createByCodecName(audio/mp4a-latm) failed", e);
            try {
                ((C1282630jTx) this.l1).LLILZ = MediaCodec.createByCodecName("OMX.google.aac.encoder");
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                String str2 = C1282630jTx.LLJILJIL;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("MediaCodec.createEncoderByType(\"OMX.google.aac.encoder\") failed: ");
                sbLIZ2.append(e2);
                AVLog.ioe(str2, C2188811AlT.LIZIZ(sbLIZ2));
                ((boolean[]) this.l0)[0] = false;
                return;
            }
        }
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = ((C1282630jTx) this.l1).LLILZ.getCodecInfo().getCapabilitiesForType("audio/mp4a-latm");
            C1282630jTx c1282630jTx = (C1282630jTx) this.l1;
            int i = this.i2;
            c1282630jTx.getClass();
            int i2 = i != 1 ? i != 3 ? i != 4 ? -1 : 29 : 5 : 2;
            MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = capabilitiesForType.profileLevels;
            int length = codecProfileLevelArr.length;
            int i3 = 0;
            while (true) {
                if (i3 < length) {
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel = codecProfileLevelArr[i3];
                    String str3 = C1282630jTx.LLJILJIL;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Find profile = ");
                    sbLIZ3.append(codecProfileLevel.profile);
                    AVLog.iod(str3, C2188811AlT.LIZIZ(sbLIZ3));
                    if (codecProfileLevel.profile == i2) {
                        break;
                    } else {
                        i3++;
                    }
                } else {
                    String str4 = C1282630jTx.LLJILJIL;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("AAC Profile ");
                    C1282630jTx c1282630jTx2 = (C1282630jTx) this.l1;
                    int i4 = this.i2;
                    c1282630jTx2.getClass();
                    if (i4 == 1) {
                        strLIZIZ = "AAC-LC";
                    } else if (i4 == 3) {
                        strLIZIZ = "AAC-HE";
                    } else if (i4 != 4) {
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("Unknown profile ");
                        sbLIZ5.append(i4);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
                    } else {
                        strLIZIZ = "AAC-HEv2";
                    }
                    sbLIZ4.append(strLIZIZ);
                    sbLIZ4.append(" not found. Use default LC profile.");
                    AVLog.ioe(str4, C2188811AlT.LIZIZ(sbLIZ4));
                    if (this.i2 != 1) {
                        ((C1282630jTx) this.l1).LLILZ.release();
                        ((C1282630jTx) this.l1).LLILZ = null;
                        ((boolean[]) this.l0)[0] = false;
                        return;
                    }
                }
            }
            MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", this.i3, this.i4);
            mediaFormatCreateAudioFormat.setInteger("bitrate", this.i5);
            mediaFormatCreateAudioFormat.setInteger("profile", i2);
            mediaFormatCreateAudioFormat.setInteger("aac-profile", i2);
            if (i2 == 29) {
                mediaFormatCreateAudioFormat.setInteger("aac-sbr-mode", 2);
            }
            mediaFormatCreateAudioFormat.setInteger("max-input-size", ((this.i3 * this.i4) * 2) / 20);
            ((C1282630jTx) this.l1).LLILZ.configure(mediaFormatCreateAudioFormat, (Surface) null, (MediaCrypto) null, 1);
            ((C1282630jTx) this.l1).LLILZ.start();
            ((boolean[]) this.l0)[0] = true;
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            String str5 = C1282630jTx.LLJILJIL;
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("init AAC Encoder failed. message: ");
            sbLIZ6.append(e3.getMessage());
            sbLIZ6.append(", cause: ");
            sbLIZ6.append(e3.getCause());
            sbLIZ6.append(", stack: ");
            sbLIZ6.append(Log.getStackTraceString(e3));
            AVLog.logKibana(6, str5, C2188811AlT.LIZIZ(sbLIZ6), null);
            ((boolean[]) this.l0)[0] = false;
            ((C1282630jTx) this.l1).LLIZLLLIL();
        }
    }

    public final void LIZ$1() {
        String strLIZIZ;
        MediaCodec mediaCodec = ((C1282640jTy) this.l1).LLILZ;
        if (mediaCodec != null) {
            mediaCodec.stop();
            ((C1282640jTy) this.l1).LLILZ.release();
            ((C1282640jTy) this.l1).LLILZ = null;
        }
        if (this.i2 != 1 && ((C1282640jTy) this.l1).LLJI != 3) {
            String str = C1282640jTy.LLJILJIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MediaCodec doesn't support profile ");
            sbLIZ.append(((C1282640jTy) this.l1).LLJI);
            com.ss.pusher.core.utils.AVLog.ioe(str, C2188811AlT.LIZIZ(sbLIZ));
            ((boolean[]) this.l0)[0] = false;
            return;
        }
        try {
            ((C1282640jTy) this.l1).LLILZ = MediaCodec.createByCodecName(C1282590jTt.LIZJ("audio/mp4a-latm").getName());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            ((C1282640jTy) this.l1).LLJIJIL = false;
            com.ss.pusher.core.utils.AVLog.logKibana(6, C1282640jTy.LLJILJIL, "MediaCodec.createByCodecName(audio/mp4a-latm) failed", e);
            try {
                ((C1282640jTy) this.l1).LLILZ = MediaCodec.createByCodecName("OMX.google.aac.encoder");
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                String str2 = C1282640jTy.LLJILJIL;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("MediaCodec.createEncoderByType(\"OMX.google.aac.encoder\") failed: ");
                sbLIZ2.append(e2);
                com.ss.pusher.core.utils.AVLog.ioe(str2, C2188811AlT.LIZIZ(sbLIZ2));
                ((boolean[]) this.l0)[0] = false;
                return;
            }
        }
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = ((C1282640jTy) this.l1).LLILZ.getCodecInfo().getCapabilitiesForType("audio/mp4a-latm");
            C1282640jTy c1282640jTy = (C1282640jTy) this.l1;
            int i = this.i2;
            c1282640jTy.getClass();
            int i2 = i != 1 ? i != 3 ? i != 4 ? -1 : 29 : 5 : 2;
            MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = capabilitiesForType.profileLevels;
            int length = codecProfileLevelArr.length;
            int i3 = 0;
            while (true) {
                if (i3 < length) {
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel = codecProfileLevelArr[i3];
                    String str3 = C1282640jTy.LLJILJIL;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Find profile = ");
                    sbLIZ3.append(codecProfileLevel.profile);
                    com.ss.pusher.core.utils.AVLog.iod(str3, C2188811AlT.LIZIZ(sbLIZ3));
                    if (codecProfileLevel.profile == i2) {
                        break;
                    } else {
                        i3++;
                    }
                } else {
                    String str4 = C1282640jTy.LLJILJIL;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("AAC Profile ");
                    C1282640jTy c1282640jTy2 = (C1282640jTy) this.l1;
                    int i4 = this.i2;
                    c1282640jTy2.getClass();
                    if (i4 == 1) {
                        strLIZIZ = "AAC-LC";
                    } else if (i4 == 3) {
                        strLIZIZ = "AAC-HE";
                    } else if (i4 != 4) {
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("Unknown profile ");
                        sbLIZ5.append(i4);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
                    } else {
                        strLIZIZ = "AAC-HEv2";
                    }
                    sbLIZ4.append(strLIZIZ);
                    sbLIZ4.append(" not found. Use default LC profile.");
                    com.ss.pusher.core.utils.AVLog.ioe(str4, C2188811AlT.LIZIZ(sbLIZ4));
                    if (this.i2 != 1) {
                        ((C1282640jTy) this.l1).LLILZ.release();
                        ((C1282640jTy) this.l1).LLILZ = null;
                        ((boolean[]) this.l0)[0] = false;
                        return;
                    }
                }
            }
            MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", this.i3, this.i4);
            mediaFormatCreateAudioFormat.setInteger("bitrate", this.i5);
            mediaFormatCreateAudioFormat.setInteger("profile", i2);
            mediaFormatCreateAudioFormat.setInteger("aac-profile", i2);
            if (i2 == 29) {
                mediaFormatCreateAudioFormat.setInteger("aac-sbr-mode", 2);
            }
            mediaFormatCreateAudioFormat.setInteger("max-input-size", ((this.i3 * this.i4) * 2) / 20);
            ((C1282640jTy) this.l1).LLILZ.configure(mediaFormatCreateAudioFormat, (Surface) null, (MediaCrypto) null, 1);
            ((C1282640jTy) this.l1).LLILZ.start();
            ((boolean[]) this.l0)[0] = true;
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            String str5 = C1282640jTy.LLJILJIL;
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("init AAC Encoder failed. message: ");
            sbLIZ6.append(e3.getMessage());
            sbLIZ6.append(", cause: ");
            sbLIZ6.append(e3.getCause());
            sbLIZ6.append(", stack: ");
            sbLIZ6.append(Log.getStackTraceString(e3));
            com.ss.pusher.core.utils.AVLog.logKibana(6, str5, C2188811AlT.LIZIZ(sbLIZ6), null);
            ((boolean[]) this.l0)[0] = false;
            ((C1282640jTy) this.l1).LLIZLLLIL();
        }
    }

    public final void LIZ$2() {
        synchronized (((C1270610jAZ) this.l1).LLLFF) {
            try {
                long jNativeNanoTime = AVLog.isLogKibanaEnabled() ? TimeUtils.nativeNanoTime() : 0L;
                if (((CaptureBase.VideoCaptureParams) this.l0) != null) {
                    ((C1270610jAZ) this.l1).LLJJJIL.stop(true);
                } else {
                    ((C1270610jAZ) this.l1).LLJJJIL.stop();
                }
                ((C1270610jAZ) this.l1).getClass();
                C1DJM c1djmLLJJJIL = ((C1270610jAZ) this.l1).LLJJJIL(this.i2, this.i3);
                if (((C1270610jAZ) this.l1).LLJJLIIIJLLLLLLLZ()) {
                    ((C1270610jAZ) this.l1).LLJJJIL.removeCameraProvider();
                }
                ((C1270610jAZ) this.l1).LLJJJIL.addCameraProvider(c1djmLLJJJIL);
                CaptureBase.VideoCaptureParams videoCaptureParams = (CaptureBase.VideoCaptureParams) this.l0;
                if (videoCaptureParams != null) {
                    int i = 0;
                    if (this.i4 == this.i5) {
                        i = 1;
                    } else if (videoCaptureParams.LJI) {
                        i = 3;
                    }
                    ((C1270610jAZ) this.l1).LLJJJIL.setPreviewFpsRange(new TEFrameRateRange(this.i4, this.i5), i);
                } else {
                    ((C1270610jAZ) this.l1).LLJJJIL.setPreviewFpsRange(new TEFrameRateRange(this.i4, this.i5), 1);
                }
                C1270610jAZ c1270610jAZ = (C1270610jAZ) this.l1;
                c1270610jAZ.LLJLLIL = true;
                int iStart = c1270610jAZ.LLJJJIL.start();
                if (AVLog.isLogKibanaEnabled()) {
                    long jNativeNanoTime2 = TimeUtils.nativeNanoTime() - jNativeNanoTime;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("restart Camera with captureWidth:");
                    sbLIZ.append(this.i2);
                    sbLIZ.append(" captureHeight:");
                    sbLIZ.append(this.i3);
                    sbLIZ.append(" minFps:");
                    sbLIZ.append(this.i4);
                    sbLIZ.append(" fps:");
                    sbLIZ.append(this.i5);
                    sbLIZ.append(" cost Ns:");
                    sbLIZ.append(jNativeNanoTime2);
                    sbLIZ.append(" ret:");
                    sbLIZ.append(iStart);
                    AVLog.logKibana(5, "CameraVideoCapturer", C2188811AlT.LIZIZ(sbLIZ), null);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static final void run$0(ARunnableS1S0204000_20 aRunnableS1S0204000_20) {
        boolean zLIZ;
        C1C7U.LIZ("AACHWAudioEncoder@9e69.initEncoderInternal$1");
        try {
            aRunnableS1S0204000_20.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AACHWAudioEncoder@9e69.initEncoderInternal$1");
    }

    public static final void run$1(ARunnableS1S0204000_20 aRunnableS1S0204000_20) {
        boolean zLIZ;
        C1C7U.LIZ("AACHWAudioEncoder@beef.initEncoderInternal$1");
        try {
            aRunnableS1S0204000_20.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AACHWAudioEncoder@beef.initEncoderInternal$1");
    }

    public static final void run$2(ARunnableS1S0204000_20 aRunnableS1S0204000_20) {
        boolean zLIZ;
        C1C7U.LIZ("CameraVideoCapturer@8f5e.updateCaptureResolution$1");
        try {
            aRunnableS1S0204000_20.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CameraVideoCapturer@8f5e.updateCaptureResolution$1");
    }

    public ARunnableS1S0204000_20(Object obj, int i, Object obj2, int i2, int i3, int i4, int i5) {
        this.$t = i5;
        this.l1 = obj;
        this.i2 = i;
        this.l0 = obj2;
        this.i3 = i2;
        this.i4 = i3;
        this.i5 = i4;
    }
}
