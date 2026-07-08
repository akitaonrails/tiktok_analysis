package X;

import Y.ARunnableS120S0100000_20;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.Log;
import android.view.Surface;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.pusher.core.base.TEBundle;
import com.ss.pusher.core.buffer.VideoFrame;
import com.ss.pusher.core.engine.VideoEncoder;
import com.ss.pusher.core.opengl.GLSurface;
import com.ss.pusher.core.opengl.GlRenderDrawer;
import com.ss.pusher.core.opengl.GlUtil;
import com.ss.pusher.core.params.LiveSdkSetting;
import com.ss.pusher.core.params.PushBase;
import com.ss.pusher.core.utils.AVLog;
import com.ss.pusher.core.utils.SafeHandlerThread;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jTa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1282400jTa extends VideoEncoder {
    public String LL;
    public String LLILLJJLI;
    public C1282620jTw LLILLL;
    public Integer LLILZ;
    public Integer LLILZIL;
    public EnumC1277830jMD LLILZLL;
    public int LLIZ;
    public volatile boolean LLIZLLLIL;
    public boolean LLJ;
    public long LLJI;
    public long LLJIJIL;
    public AbstractC1282440jTe LLJILJIL;
    public boolean LLJJ;
    public boolean LLJJIJI;
    public MediaCodecInfo LLJJIJIL;
    public MediaCodec LLJJJ;
    public SafeHandlerThread LLJJJIL;
    public Surface LLJJJJ;
    public int LLJJJJJIL;
    public int LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public int LLJLILLLLZIIL;
    public GLSurface LLJLL;
    public GlRenderDrawer LLJLLIL;
    public EGLSurface LLJZIJLIL;
    public EGLDisplay LLL;
    public C1276510jK5 LLLF;
    public final PushBase LLLFF;
    public final boolean LLLFFI;
    public double LLJILJILJ = -1.0d;
    public double LLJILLL = -1.0d;
    public double LLJJI = -1.0d;
    public C1282540jTo LLJJIII = new C1282540jTo(this);
    public int LLJJIJIIJIL = -1;
    public int LLJLIL = 0;
    public byte[] LLJLLL = null;
    public boolean LLJZ = false;
    public final C1282410jTb LLLFZ = new C1282410jTb(this);

    public final void LLJJ() {
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("request-sync", 0);
            MediaCodec mediaCodec = this.LLJJJ;
            if (mediaCodec != null) {
                mediaCodec.setParameters(bundle);
            }
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("requestKeyFrame failed\n");
            sbLIZ.append(e.getMessage());
            AVLog.e("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public boolean LLJJI() {
        String str = this.LLILLJJLI;
        String str2 = C1282590jTt.LIZ;
        boolean z = false;
        if (str != null && !str.isEmpty()) {
            int codecCount = MediaCodecList.getCodecCount();
            int i = 0;
            while (true) {
                if (i >= codecCount) {
                    break;
                }
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                if (codecInfoAt != null && codecInfoAt.isEncoder()) {
                    String lowerCase = codecInfoAt.getName().toLowerCase();
                    if (!TextUtils.isEmpty(lowerCase) && !C1282590jTt.LIZ(lowerCase) && C1282590jTt.LIZIZ(codecInfoAt, str)) {
                        z = true;
                        break;
                    }
                }
                i++;
            }
        }
        if (z) {
            this.LLLFZ.LJ(10);
            return z;
        }
        this.LLLFZ.LIZLLL(10, null);
        return z;
    }

    @Override // com.ss.pusher.core.engine.VideoEncoder
    public final void RequestIDRFrame() {
        AVLog.iow("HardwareVideoEncoder", "RequestIDRFrame");
        this.LLIZLLLIL = true;
    }

    @Override // com.ss.pusher.core.engine.VideoEncoder
    public final String getEncoderInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("codec_name", this.LLJJIJIL.getName());
            jSONObject.put("hardware", true);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return C786410Ut5.J3(jSONObject);
    }

    @Override // com.ss.pusher.core.engine.VideoEncoder, com.ss.pusher.core.engine.NativeObject, com.ss.ttlivestreamer.core.engine.NativeObject
    public void release() {
        C1276510jK5 c1276510jK5 = this.LLLF;
        if (c1276510jK5 == null) {
            return;
        }
        c1276510jK5.LIZ();
        MediaCodec mediaCodec = this.LLJJJ;
        if (mediaCodec != null) {
            try {
                if (this.LLJJL) {
                    GLSurface gLSurface = this.LLJLL;
                    if (gLSurface != null) {
                        gLSurface.nativeSwapBuffers();
                    }
                    this.LLJJJ.signalEndOfInputStream();
                    AVLog.ioi("HardwareVideoEncoder", "Texture codec signalEndOfInputStream ok");
                } else {
                    int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(this.LLJ ? -1L : 0L);
                    if (iDequeueInputBuffer >= 0) {
                        ByteBuffer byteBuffer = this.LLJJJ.getInputBuffers()[iDequeueInputBuffer];
                        if (byteBuffer != null) {
                            byteBuffer.position(0);
                            byteBuffer.limit(0);
                        }
                        this.LLJJJ.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
                        AVLog.ioi("HardwareVideoEncoder", "Yuv codec signalEndOfInputStream ok");
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LLJJL ? "Texture" : "Yuv");
                sbLIZ.append(" codec signalEndOfInputStream failed: ");
                sbLIZ.append(e.getMessage());
                AVLog.ioe("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        MediaCodec mediaCodec2 = this.LLJJJ;
        SafeHandlerThread safeHandlerThread = this.LLJJJIL;
        if (safeHandlerThread != null) {
            C1283060jUe.LIZIZ(safeHandlerThread.getHandler(), new ARunnableS120S0100000_20(this, 406));
        }
        LLJILLL(mediaCodec2);
        SafeHandlerThread safeHandlerThread2 = this.LLJJJIL;
        if (safeHandlerThread2 != null) {
            safeHandlerThread2.release();
        }
        if (this.LLJ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("input frame count ");
            sbLIZ2.append(this.LLJI);
            sbLIZ2.append(", output frame count ");
            sbLIZ2.append(this.LLJIJIL);
            AVLog.ioi("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public C1282400jTa(C1277590jLp c1277590jLp) {
        this.LLLFFI = false;
        LiveSdkSetting liveSdkSetting = c1277590jLp.LJI;
        this.LLLFF = liveSdkSetting.mPushBase;
        this.LLLFFI = liveSdkSetting.switchParams.LIZLLL;
    }

    @Override // com.ss.pusher.core.engine.VideoEncoder
    public int Encode(VideoFrame videoFrame) {
        int i;
        int i2 = -1;
        if (this.LLJJJ == null) {
            this.LLLFZ.LJIIJJI = -1;
            return -1;
        }
        this.LLLF.LIZ();
        this.LLLFZ.LJIIIZ++;
        boolean z = videoFrame.getBuffer() instanceof InterfaceC1278160jMk;
        if (z != this.LLJJL) {
            this.LLLFZ.LJIIJJI = -2;
            return -2;
        }
        SafeHandlerThread safeHandlerThread = this.LLJJJIL;
        if (safeHandlerThread != null && this.LLLFF.LJJIFFI == 0) {
            C786410Ut5.LJJZZIII(safeHandlerThread.getHandler(), new ARunnableS120S0100000_20(this, 407));
        }
        long j = -1;
        if (z) {
            if (this.LLJ) {
                this.LLJI++;
            }
            try {
                VideoFrame.Buffer buffer = videoFrame.getBuffer();
                long jLIZJ = this.LLJJIII.LIZJ(videoFrame.getTimestampNs() / 1000) * 1000;
                if (buffer instanceof InterfaceC1278160jMk) {
                    InterfaceC1278160jMk interfaceC1278160jMk = (InterfaceC1278160jMk) buffer;
                    long jLIZ = interfaceC1278160jMk.LIZ();
                    if (jLIZ != 0 && GLES30.glIsSync(jLIZ)) {
                        GLES30.glWaitSync(jLIZ, 0, -1L);
                        GlUtil.LIZIZ("glWaitSync");
                    }
                    AbstractC1282440jTe abstractC1282440jTe = this.LLJILJIL;
                    if (abstractC1282440jTe != null) {
                        try {
                            abstractC1282440jTe.LIZLLL(this.LLJJJ, videoFrame);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    if (this.LLJZ) {
                        this.LLJLL.nativeSwapBuffers();
                    } else {
                        this.LLJZ = true;
                    }
                    if (interfaceC1278160jMk.getType() == EnumC1277800jMA.OES) {
                        this.LLJLLIL.LIZ(interfaceC1278160jMk.getTextureId(), null, C1278590jNR.LIZ(interfaceC1278160jMk.getTransformMatrix()), this.LLJJJJJIL, this.LLJJJJLIIL);
                        GLES20.glFinish();
                    } else {
                        if (interfaceC1278160jMk.getType() == EnumC1277800jMA.RGB) {
                            this.LLJLLIL.LIZIZ(interfaceC1278160jMk.getTextureId(), null, C1278590jNR.LIZ(interfaceC1278160jMk.getTransformMatrix()), this.LLJJJJJIL, this.LLJJJJLIIL);
                        }
                        GLES20.glFlush();
                    }
                    EGLExt.eglPresentationTimeANDROID(this.LLL, this.LLJZIJLIL, jLIZJ);
                    if (this.LLIZLLLIL) {
                        LLJJ();
                        this.LLIZLLLIL = false;
                    }
                    i2 = 0;
                }
            } catch (RuntimeException e2) {
                TryCatchGuardChecker.doCheck(e2);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("encodeTexture failed\n");
                sbLIZ.append(e2.getMessage());
                AVLog.e("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ));
                i2 = -2;
            }
        } else {
            if (this.LLJ) {
                this.LLJI++;
            }
            long jLIZJ2 = ((this.LLJJIII.LIZJ(videoFrame.getTimestampNs() / 1000) * 1000) + 500) / 1000;
            try {
                MediaCodec mediaCodec = this.LLJJJ;
                if (!this.LLJ) {
                    j = 0;
                }
                int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(j);
                if (iDequeueInputBuffer != -1) {
                    VideoFrame.Buffer buffer2 = videoFrame.getBuffer();
                    int height = ((buffer2.getHeight() * buffer2.getWidth()) * 3) / 2;
                    try {
                        this.LLILZLL.LIZJ(this.LLJJJ.getInputBuffer(iDequeueInputBuffer), buffer2);
                        if (this.LLIZLLLIL) {
                            LLJJ();
                            this.LLIZLLLIL = false;
                        }
                        AbstractC1282440jTe abstractC1282440jTe2 = this.LLJILJIL;
                        if (abstractC1282440jTe2 != null) {
                            try {
                                abstractC1282440jTe2.LIZLLL(this.LLJJJ, videoFrame);
                            } catch (Exception e3) {
                                TryCatchGuardChecker.doCheck(e3);
                            }
                        }
                        try {
                            this.LLJJJ.queueInputBuffer(iDequeueInputBuffer, 0, height, jLIZJ2, 0);
                            i2 = 0;
                        } catch (IllegalStateException e4) {
                            TryCatchGuardChecker.doCheck(e4);
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("queueInputBuffer failed\n");
                            sbLIZ2.append(e4);
                            AVLog.e("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ2));
                            i2 = -4;
                        }
                    } catch (IllegalStateException e5) {
                        TryCatchGuardChecker.doCheck(e5);
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("getInputBuffers failed\n");
                        sbLIZ3.append(e5);
                        AVLog.e("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ3));
                        i2 = -3;
                    }
                } else {
                    i2 = 0;
                }
            } catch (IllegalStateException e6) {
                TryCatchGuardChecker.doCheck(e6);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("dequeueInputBuffer failed\n");
                sbLIZ4.append(e6.getMessage());
                AVLog.e("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ4));
            }
        }
        C1282410jTb c1282410jTb = this.LLLFZ;
        if (i2 < 0) {
            i = i2 - 100;
        } else {
            i = 0;
        }
        c1282410jTb.LJIIJJI = i;
        return i2;
    }

    @Override // com.ss.pusher.core.engine.VideoEncoder
    public boolean InitEncoder(TEBundle tEBundle) {
        C1282540jTo c1282540jTo;
        boolean z;
        String str;
        int i;
        this.LLLFZ.LJ(31);
        C1282410jTb c1282410jTb = this.LLLFZ;
        c1282410jTb.getClass();
        try {
            c1282410jTb.LIZJ.put("profileLevel", tEBundle.getInt("video_profileLevel"));
            JSONObject jSONObject = c1282410jTb.LIZJ;
            if (tEBundle.getInt("configuration_type") == 0) {
                str = "avcc";
            } else {
                str = "annex-b";
            }
            jSONObject.put("configurationType", str);
            c1282410jTb.LIZJ.put("fixHWEncDts", tEBundle.getBool("video_fix_hardware_enc_dts"));
            c1282410jTb.LIZJ.put("enablePerfPrior", tEBundle.getBool("video_encode_perf_prior"));
            c1282410jTb.LIZJ.put("enableQP", tEBundle.getBool("enable_video_qp_range"));
            TEBundle bundle = tEBundle.getBundle("roi_settings");
            if (bundle != null) {
                i = bundle.getInt("roi_on");
            } else {
                i = 0;
            }
            c1282410jTb.LIZJ.put("enableROI", i);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (this.LLLF == null) {
            this.LLLF = new C1276510jK5();
        }
        this.LLJJJJJIL = tEBundle.getInt("video_width");
        this.LLJJJJLIIL = tEBundle.getInt("video_height");
        int i2 = tEBundle.getInt("video_fps");
        this.LLJLIL = i2;
        if (i2 <= 0) {
            i2 = 25;
        }
        this.LLJLIL = i2;
        this.LLJ = tEBundle.getBool("video_no_drop_frame");
        this.LLJJ = tEBundle.getBool("enableBFrame");
        if (tEBundle.getInt("video_enable_hard_enc_bframe") >= 0) {
            if (tEBundle.getInt("video_enable_hard_enc_bframe") > 0) {
                z = true;
            } else {
                z = false;
            }
            this.LLJJ = z;
        }
        if (tEBundle.contains("video_const_time_period_gop")) {
            this.LLJJIJI = tEBundle.getBool("video_const_time_period_gop");
        }
        boolean bool = tEBundle.getBool("video_lossless_encode");
        this.LLJJLIIIJLLLLLLLZ = bool;
        if (bool) {
            this.LLJL = ((((this.LLJJJJJIL * this.LLJJJJLIIL) * this.LLJLIL) * 3) / 2) * 8;
        } else {
            this.LLJL = (int) tEBundle.getLong("video_bitrate");
        }
        this.LLIZ = tEBundle.getInt("video_gop") / this.LLJLIL;
        if (tEBundle.contains("videoEncoderStrategy")) {
            try {
                JSONObject jSONObject2 = new JSONObject(tEBundle.getString("videoEncoderStrategy"));
                if (!jSONObject2.isNull("bitrateRatio")) {
                    this.LLJILLL = JSONObjectProtectorUtils.getDouble(jSONObject2, "bitrateRatio");
                }
                if (!jSONObject2.isNull("enableBFrame")) {
                    this.LLJJ = JSONObjectProtectorUtils.getBoolean(jSONObject2, "enableBFrame");
                }
                if (!jSONObject2.isNull("bFrameBitrateRatio")) {
                    this.LLJJI = JSONObjectProtectorUtils.getDouble(jSONObject2, "bFrameBitrateRatio");
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        if (tEBundle.getInt("configuration_type") == 0) {
            AVLog.ioe("HardwareVideoEncoder", "Value of TEBundle.kKeyVideoConfigurationType error, should be 1 (Annex-B)");
            this.LLLFZ.LIZLLL(31, null);
            return false;
        }
        if (!tEBundle.getBool("video_fix_hardware_enc_dts") && !this.LLJJ) {
            c1282540jTo = new C1282540jTo(this);
        } else {
            c1282540jTo = new C1282540jTo() { // from class: X.0jTp
                public final LinkedList<C1282570jTr> LJII;
                public final LinkedList<Long> LJIIIIZZ;
                public long LJIIIZ;
                public int LJIIJ;

                {
                    super(this.LJIIJJI);
                    this.LJII = new LinkedList<>();
                    this.LJIIIIZZ = new LinkedList<>();
                    this.LJIIJ = -1;
                }

                @Override // X.C1282540jTo
                public final void LIZLLL(long j) {
                    super.LIZLLL(j);
                    this.LJIIIIZZ.offer(Long.valueOf(j));
                }

                @Override // X.C1282540jTo
                public final synchronized void LIZIZ(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
                    long j = bufferInfo.presentationTimeUs;
                    boolean z2 = true;
                    if ((bufferInfo.flags & 1) == 0) {
                        z2 = false;
                    }
                    int iLIZ = LIZ(j, z2);
                    if (iLIZ < 0) {
                        C1282570jTr c1282570jTr = new C1282570jTr();
                        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(byteBuffer.limit());
                        c1282570jTr.LIZ = byteBufferAllocateDirect;
                        byteBufferAllocateDirect.put(byteBuffer);
                        c1282570jTr.LIZIZ = bufferInfo;
                        this.LJII.offer(c1282570jTr);
                    } else {
                        C1282570jTr c1282570jTrPollFirst = this.LJII.pollFirst();
                        while (c1282570jTrPollFirst != null) {
                            LJ(iLIZ, c1282570jTrPollFirst.LIZIZ, c1282570jTrPollFirst.LIZ);
                            c1282570jTrPollFirst = this.LJII.pollFirst();
                        }
                        LJ(iLIZ, bufferInfo, byteBuffer);
                    }
                }

                public final void LJ(int i3, MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer) {
                    long j;
                    long jLongValue;
                    long j2 = bufferInfo.presentationTimeUs;
                    if (i3 >= 0) {
                        if (i3 == 0) {
                            this.LJIIJJI.nativeEncoded(byteBuffer, byteBuffer.limit(), bufferInfo.flags, 0, j2, j2);
                            return;
                        }
                        long j3 = 1000000 / this.LJIIJJI.LLJLIL;
                        if (this.LJIIJ < 0) {
                            this.LJIIJ = (i3 + 1) / 2;
                        }
                        if (!this.LJIIIIZZ.isEmpty()) {
                            if (this.LJIIJ > 0) {
                                long jLongValue2 = this.LJIIIIZZ.getFirst().longValue();
                                int i4 = this.LJIIJ;
                                jLongValue = jLongValue2 - (((long) i4) * j3);
                                this.LJIIJ = i4 - 1;
                            } else {
                                jLongValue = this.LJIIIIZZ.poll().longValue();
                            }
                            j = jLongValue - 100000;
                        } else {
                            j = this.LJIIIZ + j3;
                        }
                        if (j < this.LJIIIZ) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("last dts out: ");
                            sbLIZ.append(this.LJIIIZ);
                            sbLIZ.append(", current dts out: ");
                            sbLIZ.append(j);
                            AVLog.logToIODevice2(6, "HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ), (Throwable) null, 12, 30000);
                            j = 10000 + this.LJIIIZ;
                        }
                        if (j > j2) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("pts out: ");
                            sbLIZ2.append(j2);
                            sbLIZ2.append(", dts out: ");
                            sbLIZ2.append(j);
                            AVLog.logToIODevice2(6, "HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ2), (Throwable) null, 13, 30000);
                            j = j2;
                        }
                        this.LJIIIZ = j;
                        this.LJIIJJI.nativeEncoded(byteBuffer, byteBuffer.limit(), bufferInfo.flags, 0, j2, j);
                        return;
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("why bFrameCount < 0? ");
                    sbLIZ3.append(i3);
                    throw new AndroidRuntimeException(C2188811AlT.LIZIZ(sbLIZ3));
                }
            };
        }
        this.LLJJIII = c1282540jTo;
        boolean bool2 = tEBundle.getBool("video_encode_perf_prior");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("videoEncodePerfPrior: ");
        sbLIZ.append(bool2);
        AVLog.iow("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ));
        if (!bool2) {
            return LLJI(tEBundle, C1282590jTt.LIZJ(this.LLILLJJLI));
        }
        if (this.LLILLL == null) {
            this.LLILLL = new C1282620jTw(this.LLILLJJLI);
        }
        C1282620jTw c1282620jTw = this.LLILLL;
        while (!((ArrayList) c1282620jTw.LIZIZ).isEmpty()) {
            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) ListProtector.get(c1282620jTw.LIZIZ, 0);
            JSONObject jSONObjectLJ = C1282590jTt.LJ(mediaCodecInfo);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Try encoder ");
            sbLIZ2.append(jSONObjectLJ);
            AVLog.iow("MediaCodecUtils", C2188811AlT.LIZIZ(sbLIZ2));
            if (!LLJI(tEBundle, mediaCodecInfo)) {
                C1282410jTb c1282410jTb2 = this.LLLFZ;
                c1282410jTb2.getClass();
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    c1282410jTb2.LIZ(jSONObject3);
                    JSONObject jSONObject4 = JSONObjectProtectorUtils.getJSONObject(jSONObject3, "codecInfos");
                    c1282410jTb2.LIZJ(jSONObject4);
                    c1282410jTb2.LIZLLL.put(jSONObject4);
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Remove encoder ");
                sbLIZ3.append(jSONObjectLJ);
                AVLog.ioe("MediaCodecUtils", C2188811AlT.LIZIZ(sbLIZ3), null);
                ListProtector.remove(c1282620jTw.LIZIZ, 0);
            } else {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("Selected encoder ");
                sbLIZ4.append(jSONObjectLJ);
                AVLog.iow("MediaCodecUtils", C2188811AlT.LIZIZ(sbLIZ4));
                return true;
            }
        }
        return false;
    }

    public final void LLIZLLLIL(ByteBuffer byteBuffer) {
        int i;
        int i2;
        if (this.LLJJIJIIJIL >= 0) {
            return;
        }
        if (this.LLILLJJLI.equals("video/avc")) {
            this.LLJJIJIIJIL = 0;
            return;
        }
        if (!this.LLILLJJLI.equals(C1282590jTt.LIZ)) {
            return;
        }
        int i3 = 0;
        for (int iPosition = byteBuffer.position(); iPosition != byteBuffer.limit(); iPosition++) {
            byte b = byteBuffer.get(iPosition);
            if (b == 0) {
                i3++;
                if (i3 > 3) {
                    this.LLJJIJIIJIL = 2;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Lack of anti-conflict byte detected: model ");
                    sbLIZ.append(Build.MODEL);
                    AVLog.logKibana(5, "HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ), null);
                    return;
                }
            } else {
                if (b == 1 && ((i3 == 2 || i3 == 3) && ((i = (byteBuffer.get(iPosition + 1) & 126) >> 1) <= 9 || (i >= 16 && i <= 21)))) {
                    if (((byteBuffer.get(iPosition + 3) >> 7) & 1) == 0) {
                        i2 = 1;
                    } else {
                        int i4 = this.LLJJIJIIJIL;
                        i2 = i4 == -2 ? 0 : i4 - 1;
                    }
                    this.LLJJIJIIJIL = i2;
                    if (i2 == 1) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Multi-slice detected: model ");
                        sbLIZ2.append(Build.MODEL);
                        sbLIZ2.append(", width ");
                        sbLIZ2.append(this.LLJJJJJIL);
                        sbLIZ2.append(", height ");
                        sbLIZ2.append(this.LLJJJJLIIL);
                        sbLIZ2.append(", fps ");
                        sbLIZ2.append(this.LLJLIL);
                        sbLIZ2.append(", bitrate ");
                        sbLIZ2.append(this.LLJL / LSPassThroughRecordSizeConfig.DEFAULT);
                        sbLIZ2.append("kbps");
                        AVLog.logKibana(5, "HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ2), null);
                    }
                    if (this.LLJJIJIIJIL >= 0) {
                        return;
                    }
                }
                i3 = 0;
            }
        }
    }

    public final int LLJ(TEBundle tEBundle) {
        MediaCodecInfo.EncoderCapabilities encoderCapabilities;
        this.LLJLILLLLZIIL = -1;
        if (tEBundle.contains("video_hard_enc_bitrate_mode")) {
            this.LLJLILLLLZIIL = tEBundle.getInt("video_hard_enc_bitrate_mode");
        }
        int i = this.LLJLILLLLZIIL;
        if (i < 0 || i > 2) {
            this.LLJLILLLLZIIL = 1;
        }
        String[] strArr = {"CQ", "VBR", "CBR"};
        MediaCodecInfo.CodecCapabilities capabilitiesForType = this.LLJJIJIL.getCapabilitiesForType(this.LLILLJJLI);
        if (capabilitiesForType != null && (encoderCapabilities = capabilitiesForType.getEncoderCapabilities()) != null && !encoderCapabilities.isBitrateModeSupported(this.LLJLILLLLZIIL)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Set bitrate mode fail: ");
            sbLIZ.append(strArr[this.LLJLILLLLZIIL]);
            sbLIZ.append(" unsupported.");
            AVLog.iow("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ));
            this.LLJLILLLLZIIL = 1;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Set bitrate mode: ");
        sbLIZ2.append(strArr[this.LLJLILLLLZIIL]);
        AVLog.iow("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ2));
        return this.LLJLILLLLZIIL;
    }

    public final boolean LLJIJIL(byte b) {
        if (this.LLILLJJLI.equals("video/avc")) {
            if ((b & 31) == 5) {
                return true;
            }
            return false;
        }
        if (!this.LLILLJJLI.equals(C1282590jTt.LIZ)) {
            return false;
        }
        int i = (b & 126) >> 1;
        if (i == 16 || i == 17 || i == 18 || i == 19 || i == 20 || i == 21) {
            return true;
        }
        return false;
    }

    public final void LLJILJILJ(MediaFormat mediaFormat) {
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer("csd-0");
        ByteBuffer byteBuffer2 = mediaFormat.getByteBuffer("csd-1");
        if (this.LLILLJJLI.equals("video/avc") && byteBuffer != null && byteBuffer2 != null) {
            byte[] bArr = (byte[]) byteBuffer.array().clone();
            byte[] bArr2 = (byte[]) byteBuffer2.array().clone();
            byte[] bArr3 = new byte[bArr.length + bArr2.length];
            this.LLJLLL = bArr3;
            System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
            System.arraycopy(bArr2, 0, this.LLJLLL, bArr.length, bArr2.length);
            return;
        }
        if (!this.LLILLJJLI.equals(C1282590jTt.LIZ) || byteBuffer == null) {
            return;
        }
        byte[] bArr4 = (byte[]) byteBuffer.array().clone();
        byte[] bArr5 = new byte[bArr4.length];
        this.LLJLLL = bArr5;
        System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length);
    }

    public final void LLJILLL(MediaCodec mediaCodec) {
        AVLog.iod("HardwareVideoEncoder", "Releasing MediaCodec on output thread");
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
                mediaCodec.release();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("codecTexture stop failed: ");
                sbLIZ.append(e);
                AVLog.ioe("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        GlRenderDrawer glRenderDrawer = this.LLJLLIL;
        if (glRenderDrawer != null) {
            glRenderDrawer.LIZJ();
            this.LLJLLIL = null;
        }
        if (this.LLJLL != null) {
            GLES20.glFinish();
            this.LLJLL.release();
            this.LLJLL = null;
        }
        Surface surface = this.LLJJJJ;
        if (surface != null) {
            surface.release();
            this.LLJJJJ = null;
        }
        AVLog.iod("HardwareVideoEncoder", "Release on output thread done");
    }

    @Override // com.ss.pusher.core.engine.VideoEncoder
    public final void SetBitrate(int i) {
        if (!this.LLJJLIIIJLLLLLLLZ && this.LLJJJ != null) {
            double d = i;
            try {
                double d2 = this.LLJILLL;
                if (d2 > 0.0d) {
                    d *= d2;
                }
                double d3 = this.LLJILJILJ;
                if (d3 > 0.0d) {
                    d *= d3;
                }
                int i2 = (int) d;
                Bundle bundle = new Bundle();
                bundle.putInt("video-bitrate", i2);
                this.LLJJJ.setParameters(bundle);
                this.LLJL = i;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("update bitrate: ");
                sbLIZ.append(LLIZ(i, i2));
                AVLog.ioi("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ));
            } catch (IllegalStateException e) {
                TryCatchGuardChecker.doCheck(e);
                try {
                    double d4 = this.LLJL;
                    double d5 = this.LLJILLL;
                    if (d5 > 0.0d) {
                        d4 *= d5;
                    }
                    double d6 = this.LLJILJILJ;
                    if (d6 > 0.0d) {
                        d4 *= d6;
                    }
                    int i3 = (int) d4;
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("video-bitrate", i3);
                    this.LLJJJ.setParameters(bundle2);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("reset bitrate: ");
                    sbLIZ2.append(LLIZ(this.LLJL, i3));
                    AVLog.ioi("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ2));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("update bitrate failed");
                    sbLIZ3.append(e);
                    AVLog.e("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ3));
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("Update bitrate failed new bitrate ");
                    sbLIZ4.append(i);
                    sbLIZ4.append(" old bitrate ");
                    sbLIZ4.append(this.LLJL);
                    sbLIZ4.append(" cause:");
                    sbLIZ4.append(e.getMessage());
                    AVLog.ioe("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ4));
                }
            }
        }
    }

    public final String LLIZ(int i, int i2) {
        return C786410Ut5.k4(Locale.getDefault(), "%d = %d * %.2f * %.2f * %.2f", new Object[]{Integer.valueOf(i2), Integer.valueOf(i), Double.valueOf(this.LLJILLL), Double.valueOf(this.LLJJI), Double.valueOf(this.LLJILJILJ)});
    }

    public final boolean LLJI(TEBundle tEBundle, MediaCodecInfo mediaCodecInfo) {
        EnumC1277830jMD enumC1277830jMD;
        int i;
        int i2;
        int i3;
        int i4;
        this.LLLFZ.LJ(41);
        this.LLJJIJIL = mediaCodecInfo;
        if (mediaCodecInfo == null) {
            this.LLLFZ.LIZLLL(41, null);
            return false;
        }
        String name = mediaCodecInfo.getName();
        Integer numLIZLLL = C1282590jTt.LIZLLL(C1282590jTt.LJII, this.LLJJIJIL.getCapabilitiesForType(this.LLILLJJLI), name);
        Integer numLIZLLL2 = C1282590jTt.LIZLLL(C1282590jTt.LJI, this.LLJJIJIL.getCapabilitiesForType(this.LLILLJJLI), name);
        this.LL = name;
        this.LLILZ = numLIZLLL;
        this.LLILZIL = numLIZLLL2;
        int iIntValue = numLIZLLL2.intValue();
        C1277810jMB c1277810jMB = EnumC1277830jMD.LL;
        if (iIntValue != 19) {
            if (iIntValue != 21 && iIntValue != 2141391872 && iIntValue != 2141391876) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unsupported colorFormat: ");
                sbLIZ.append(iIntValue);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            enumC1277830jMD = EnumC1277830jMD.LLILLJJLI;
        } else {
            enumC1277830jMD = EnumC1277830jMD.LL;
        }
        this.LLILZLL = enumC1277830jMD;
        boolean z = !tEBundle.getBool("video_is_yuv_frame");
        this.LLJJL = z;
        if (z && numLIZLLL == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("useSurfaceMode ");
            sbLIZ2.append(this.LLJJL);
            sbLIZ2.append(", surfaceColorFormat ");
            sbLIZ2.append(numLIZLLL);
            sbLIZ2.append(", yuvColorFormat ");
            sbLIZ2.append(numLIZLLL2);
            AVLog.ioe("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ2));
            this.LLLFZ.LIZLLL(42, null);
            return false;
        }
        this.LLLFZ.LJ(51);
        try {
            MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.LLILLJJLI, this.LLJJJJJIL, this.LLJJJJLIIL);
            mediaFormatCreateVideoFormat.setInteger("bitrate", this.LLJL);
            mediaFormatCreateVideoFormat.setInteger("frame-rate", this.LLJLIL);
            if (this.LLJJIJI) {
                i = -1;
            } else {
                i = this.LLIZ;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Using constant time period [");
            sbLIZ3.append(this.LLJJIJI);
            sbLIZ3.append("] with i frame interval [");
            sbLIZ3.append(i);
            sbLIZ3.append("s]");
            AVLog.iow("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ3));
            mediaFormatCreateVideoFormat.setInteger("i-frame-interval", i);
            if (Build.VERSION.SDK_INT >= 29) {
                if (this.LLJJ) {
                    i4 = 2;
                } else {
                    i4 = 0;
                }
                mediaFormatCreateVideoFormat.setInteger("max-bframes", i4);
            }
            mediaFormatCreateVideoFormat.setInteger("bitrate-mode", LLJ(tEBundle));
            if (this.LLILLJJLI.equals("video/avc")) {
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : this.LLJJIJIL.getCapabilitiesForType(this.LLILLJJLI).profileLevels) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("Profile = ");
                    sbLIZ4.append(codecProfileLevel.profile);
                    sbLIZ4.append(", Level = ");
                    sbLIZ4.append(codecProfileLevel.level);
                    AVLog.d("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ4));
                    int i5 = codecProfileLevel.profile;
                    if (i5 == 1) {
                        AVLog.d("HardwareVideoEncoder", "Support Baseline Profile!");
                    } else if (i5 == 2) {
                        AVLog.d("HardwareVideoEncoder", "Support Main Profile!");
                    } else if (i5 == 8) {
                        AVLog.d("HardwareVideoEncoder", "Support High Profile!");
                    }
                    int i6 = codecProfileLevel.profile;
                    int i7 = tEBundle.getInt("video_profileLevel");
                    synchronized (this) {
                        if (i7 != 2) {
                            if (i7 != 3) {
                                i3 = 1;
                            } else {
                                i3 = 8;
                            }
                        } else {
                            i3 = 2;
                        }
                    }
                    if (i6 == i3) {
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("Set Profile: ");
                        sbLIZ5.append(codecProfileLevel.profile);
                        sbLIZ5.append(", Level = ");
                        sbLIZ5.append(codecProfileLevel.level);
                        AVLog.d("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ5));
                        mediaFormatCreateVideoFormat.setInteger("profile", codecProfileLevel.profile);
                        mediaFormatCreateVideoFormat.setInteger("level", codecProfileLevel.level);
                    }
                }
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("Android SDK version ");
                sbLIZ6.append(Build.VERSION.SDK_INT);
                sbLIZ6.append(", dstProfileLevel is null");
                this.LLLFZ.LIZLLL(51, new Throwable(C2188811AlT.LIZIZ(sbLIZ6)));
                return false;
            }
            if (this.LLILLJJLI.equals(C1282590jTt.LIZ)) {
                if (tEBundle.getInt("video_profileLevel") != 5) {
                    mediaFormatCreateVideoFormat.setInteger("profile", 1);
                } else {
                    mediaFormatCreateVideoFormat.setInteger("profile", 2);
                }
                mediaFormatCreateVideoFormat.setInteger("level", 256);
            } else {
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append("Unsupported codec type: ");
                sbLIZ7.append(this.LLILLJJLI);
                AVLog.ioe("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ7));
                this.LLLFZ.LIZLLL(52, null);
                return false;
            }
            try {
                if (this.LLJILJIL == null) {
                    this.LLJILJIL = AbstractC1282440jTe.LIZJ(this.LL, tEBundle);
                }
                AbstractC1282440jTe abstractC1282440jTe = this.LLJILJIL;
                if (abstractC1282440jTe != null) {
                    abstractC1282440jTe.LIZIZ(mediaFormatCreateVideoFormat);
                }
                LLJJIII(this.LL, mediaFormatCreateVideoFormat, tEBundle);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                AVLog.ioe("HardwareVideoEncoder", "init roi or qp range failed. ", e);
            }
            if (this.LLJJL) {
                this.LLLFZ.LJ(52);
                mediaFormatCreateVideoFormat.setInteger("color-format", this.LLILZ.intValue());
                MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(this.LL);
                this.LLJJJ = mediaCodecCreateByCodecName;
                mediaCodecCreateByCodecName.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
                this.LLLFZ.LJ(53);
                try {
                    this.LLJJJJ = this.LLJJJ.createInputSurface();
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    AVLog.iow("HardwareVideoEncoder", "create input surface failed");
                }
                this.LLJLLIL = new GlRenderDrawer();
                GLSurface gLSurface = new GLSurface();
                this.LLJLL = gLSurface;
                gLSurface.nativeSurfaceCreate(this.LLJJJJJIL, this.LLJJJJLIIL, this.LLJJJJ);
                this.LLJLL.nativeMakeCurrent();
                this.LLLFZ.LJ(54);
                this.LLL = EGL14.eglGetCurrentDisplay();
                EGLSurface eGLSurfaceEglGetCurrentSurface = EGL14.eglGetCurrentSurface(12378);
                this.LLJZIJLIL = eGLSurfaceEglGetCurrentSurface;
                if (eGLSurfaceEglGetCurrentSurface != null && this.LLL != null) {
                    this.LLLFZ.LJ(55);
                } else {
                    throw new IllegalStateException("currSurface " + this.LLJZIJLIL + ", currDisplay " + this.LLL);
                }
            } else {
                this.LLLFZ.LJ(56);
                mediaFormatCreateVideoFormat.setInteger("color-format", this.LLILZIL.intValue());
                MediaCodec mediaCodecCreateByCodecName2 = MediaCodec.createByCodecName(this.LL);
                this.LLJJJ = mediaCodecCreateByCodecName2;
                mediaCodecCreateByCodecName2.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
                this.LLLFZ.LJ(57);
            }
            AVLog.d("HardwareVideoEncoder", "Format: " + mediaFormatCreateVideoFormat);
            try {
                AbstractC1282440jTe abstractC1282440jTe2 = this.LLJILJIL;
                double d = -1.0d;
                if (abstractC1282440jTe2 != null) {
                    abstractC1282440jTe2.LIZ(this.LLJJJ, tEBundle);
                    AbstractC1282440jTe abstractC1282440jTe3 = this.LLJILJIL;
                    int i8 = abstractC1282440jTe3.LIZ;
                    if (i8 == 1 || i8 == 0) {
                        d = abstractC1282440jTe3.LIZLLL;
                    }
                    this.LLJILJILJ = d;
                } else {
                    TEBundle bundle = tEBundle.getBundle("roi_settings");
                    if (bundle != null && bundle.contains("roi_bitrate_ratio") && ((i2 = bundle.getInt("roi_on")) == 1 || i2 == 0)) {
                        d = bundle.getDouble("roi_bitrate_ratio");
                    }
                    this.LLJILJILJ = d;
                }
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            SetBitrate(this.LLJL);
            SafeHandlerThread safeHandlerThread = new SafeHandlerThread("HwEncoderReadThread");
            this.LLJJJIL = safeHandlerThread;
            safeHandlerThread.start();
            this.LLLFZ.LJ(200);
            this.LLLFZ.LJ = System.currentTimeMillis();
            if (this.LLLFF.LJJIFFI > 0) {
                AVLog.iod("HardwareVideoEncoder", "async mode is enabled");
                this.LLJJJ.setCallback(new C1282580jTs(this), this.LLJJJIL.getHandler());
            }
            this.LLJJJ.start();
            return true;
        } catch (Exception e4) {
            TryCatchGuardChecker.doCheck(e4);
            this.LLLFZ.LIZLLL(54, e4);
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append("initEncodeInternal failed: ");
            sbLIZ8.append(Log.getStackTraceString(e4));
            AVLog.ioe("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ8));
            MediaCodec mediaCodec = this.LLJJJ;
            this.LLJJJ = null;
            LLJILLL(mediaCodec);
            return false;
        }
    }

    public static void LLJJIII(String str, MediaFormat mediaFormat, TEBundle tEBundle) {
        AbstractC1282510jTl abstractC1282510jTl;
        if (!tEBundle.contains("enable_video_qp_range")) {
            AVLog.ioe("HardwareVideoEncoder", "setup qp error. enable_video_qp_range is null.");
            return;
        }
        if (!tEBundle.contains("video_qp_settings")) {
            AVLog.ioe("HardwareVideoEncoder", "setup qp error. video_qp_settings is null.");
            return;
        }
        boolean bool = tEBundle.getBool("enable_video_qp_range");
        String string = tEBundle.getString("video_qp_settings");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setup qp config. enable_video_qp_range:");
        sbLIZ.append(bool);
        sbLIZ.append(" video_qp_settings:");
        sbLIZ.append(string);
        AVLog.ioi("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ));
        if (bool) {
            if (str.startsWith("OMX.hisi.")) {
                abstractC1282510jTl = new AbstractC1282510jTl() { // from class: X.0jVb
                    @Override // X.AbstractC1282510jTl
                    public final void LIZ(String str2, MediaFormat mediaFormat2) {
                        try {
                            JSONObject jSONObject = JSONObjectProtectorUtils.getJSONObject(new JSONObject(str2), "hisi");
                            if (JSONObjectProtectorUtils.getInt(jSONObject, "qp_min") >= 0 && JSONObjectProtectorUtils.getInt(jSONObject, "qp_max") <= 51) {
                                if (JSONObjectProtectorUtils.getInt(jSONObject, "qp_max") - JSONObjectProtectorUtils.getInt(jSONObject, "qp_min") <= 6) {
                                    AVLog.ioe("HisiClip", "setup qp range error. qp range max - min <= 6");
                                    return;
                                }
                                if (Build.VERSION.SDK_INT >= 31) {
                                    mediaFormat2.setInteger("vendor.hisi.hisi-ext-codec-qp-regulation-supported", 1);
                                    mediaFormat2.setInteger("video-qp-min", JSONObjectProtectorUtils.getInt(jSONObject, "qp_min"));
                                    mediaFormat2.setInteger("video-qp-max", JSONObjectProtectorUtils.getInt(jSONObject, "qp_max"));
                                    mediaFormat2.setInteger("vendor.hisi.hisi-ext-codec-min-qp", JSONObjectProtectorUtils.getInt(jSONObject, "qp_min"));
                                    mediaFormat2.setInteger("vendor.hisi.hisi-ext-codec-max-qp", JSONObjectProtectorUtils.getInt(jSONObject, "qp_max"));
                                } else {
                                    mediaFormat2.setInteger("vendor.hisi.hisi-ext-codec-qp-regulation-supported", 1);
                                    mediaFormat2.setInteger("vendor.hisi.hisi-ext-codec-min-qp", JSONObjectProtectorUtils.getInt(jSONObject, "qp_min"));
                                    mediaFormat2.setInteger("vendor.hisi.hisi-ext-codec-max-qp", JSONObjectProtectorUtils.getInt(jSONObject, "qp_max"));
                                }
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("set up qp config success. cfg:");
                                sbLIZ2.append(jSONObject);
                                AVLog.ioi("HisiClip", C2188811AlT.LIZIZ(sbLIZ2));
                                return;
                            }
                            AVLog.ioe("HisiClip", "setup qp range error. qp range should be in [0,51]");
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("setup encode qp config error. qpCfg:");
                            sbLIZ3.append(str2);
                            AVLog.logKibana(6, "HisiClip", C2188811AlT.LIZIZ(sbLIZ3), e);
                        }
                    }
                };
            } else if (!str.startsWith("OMX.qcom.") && !str.startsWith("c2.qti.")) {
                if (str.startsWith("OMX.Exynos.")) {
                    abstractC1282510jTl = new AbstractC1282510jTl() { // from class: X.0jWk
                        @Override // X.AbstractC1282510jTl
                        public final void LIZ(String str2, MediaFormat mediaFormat2) {
                            try {
                                JSONObject jSONObject = JSONObjectProtectorUtils.getJSONObject(new JSONObject(str2), "exynos");
                                try {
                                    if (JSONObjectProtectorUtils.getInt(jSONObject, "qp_i_min") >= 0 && JSONObjectProtectorUtils.getInt(jSONObject, "qp_i_max") <= 51 && JSONObjectProtectorUtils.getInt(jSONObject, "qp_b_min") >= 0 && JSONObjectProtectorUtils.getInt(jSONObject, "qp_b_max") <= 51 && JSONObjectProtectorUtils.getInt(jSONObject, "qp_p_min") >= 0 && JSONObjectProtectorUtils.getInt(jSONObject, "qp_p_max") <= 51) {
                                        if (JSONObjectProtectorUtils.getInt(jSONObject, "qp_i_max") >= JSONObjectProtectorUtils.getInt(jSONObject, "qp_i_min") && JSONObjectProtectorUtils.getInt(jSONObject, "qp_b_max") >= JSONObjectProtectorUtils.getInt(jSONObject, "qp_b_min") && JSONObjectProtectorUtils.getInt(jSONObject, "qp_p_max") >= JSONObjectProtectorUtils.getInt(jSONObject, "qp_p_min")) {
                                            try {
                                                if (Build.VERSION.SDK_INT >= 31) {
                                                    mediaFormat2.setInteger("video-qp-i-min", JSONObjectProtectorUtils.getInt(jSONObject, "qp_i_min"));
                                                    mediaFormat2.setInteger("video-qp-i-max", JSONObjectProtectorUtils.getInt(jSONObject, "qp_i_max"));
                                                    mediaFormat2.setInteger("video-qp-b-min", JSONObjectProtectorUtils.getInt(jSONObject, "qp_b_min"));
                                                    mediaFormat2.setInteger("video-qp-b-max", JSONObjectProtectorUtils.getInt(jSONObject, "qp_b_max"));
                                                    mediaFormat2.setInteger("video-qp-p-min", JSONObjectProtectorUtils.getInt(jSONObject, "qp_p_min"));
                                                    mediaFormat2.setInteger("video-qp-p-max", JSONObjectProtectorUtils.getInt(jSONObject, "qp_p_max"));
                                                    mediaFormat2.setInteger("vendor.sec-ext-enc-qp-range.I-minQP", JSONObjectProtectorUtils.getInt(jSONObject, "qp_i_min"));
                                                    mediaFormat2.setInteger("vendor.sec-ext-enc-qp-range.I-maxQP", JSONObjectProtectorUtils.getInt(jSONObject, "qp_i_max"));
                                                    mediaFormat2.setInteger("vendor.sec-ext-enc-qp-range.B-minQP", JSONObjectProtectorUtils.getInt(jSONObject, "qp_b_min"));
                                                    mediaFormat2.setInteger("vendor.sec-ext-enc-qp-range.B-maxQP", JSONObjectProtectorUtils.getInt(jSONObject, "qp_b_max"));
                                                    mediaFormat2.setInteger("vendor.sec-ext-enc-qp-range.P-minQP", JSONObjectProtectorUtils.getInt(jSONObject, "qp_p_min"));
                                                    mediaFormat2.setInteger("vendor.sec-ext-enc-qp-range.P-maxQP", JSONObjectProtectorUtils.getInt(jSONObject, "qp_p_max"));
                                                } else {
                                                    mediaFormat2.setInteger("vendor.sec-ext-enc-qp-range.I-minQP", JSONObjectProtectorUtils.getInt(jSONObject, "qp_i_min"));
                                                    mediaFormat2.setInteger("vendor.sec-ext-enc-qp-range.I-maxQP", JSONObjectProtectorUtils.getInt(jSONObject, "qp_i_max"));
                                                    mediaFormat2.setInteger("vendor.sec-ext-enc-qp-range.B-minQP", JSONObjectProtectorUtils.getInt(jSONObject, "qp_b_min"));
                                                    mediaFormat2.setInteger("vendor.sec-ext-enc-qp-range.B-maxQP", JSONObjectProtectorUtils.getInt(jSONObject, "qp_b_max"));
                                                    mediaFormat2.setInteger("vendor.sec-ext-enc-qp-range.P-minQP", JSONObjectProtectorUtils.getInt(jSONObject, "qp_p_min"));
                                                    mediaFormat2.setInteger("vendor.sec-ext-enc-qp-range.P-maxQP", JSONObjectProtectorUtils.getInt(jSONObject, "qp_p_max"));
                                                }
                                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                sbLIZ2.append("set up qp config success. cfg:");
                                                sbLIZ2.append(jSONObject);
                                                AVLog.ioi("ExynosClip", C2188811AlT.LIZIZ(sbLIZ2));
                                                return;
                                            } catch (JSONException e) {
                                                e = e;
                                            }
                                        } else {
                                            AVLog.ioe("ExynosClip", "setup qp range error. qp range should be qp_max >= qp_min");
                                            return;
                                        }
                                    } else {
                                        AVLog.ioe("ExynosClip", "setup qp range error. qp range should be in [0,51]");
                                        return;
                                    }
                                } catch (JSONException e2) {
                                    e = e2;
                                }
                            } catch (JSONException e3) {
                                e = e3;
                            }
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("setup encode qp config error. qpCfg:");
                            sbLIZ3.append(str2);
                            AVLog.logKibana(6, "ExynosClip", C2188811AlT.LIZIZ(sbLIZ3), e);
                        }
                    };
                } else if (!str.startsWith("OMX.MTK.") && !str.startsWith("c2.mtk.")) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("create Clip instance error. codecName:");
                    sbLIZ2.append(str);
                    AVLog.ioe("Clip", C2188811AlT.LIZIZ(sbLIZ2));
                    abstractC1282510jTl = null;
                } else {
                    abstractC1282510jTl = new AbstractC1282510jTl() { // from class: X.0jWo
                        @Override // X.AbstractC1282510jTl
                        public final void LIZ(String str2, MediaFormat mediaFormat2) {
                            try {
                                JSONObject jSONObject = JSONObjectProtectorUtils.getJSONObject(new JSONObject(str2), "mtk");
                                if (JSONObjectProtectorUtils.getInt(jSONObject, "qp_i_min") >= 0 && JSONObjectProtectorUtils.getInt(jSONObject, "qp_i_max") <= 51 && JSONObjectProtectorUtils.getInt(jSONObject, "qp_b_min") >= 0 && JSONObjectProtectorUtils.getInt(jSONObject, "qp_b_max") <= 51 && JSONObjectProtectorUtils.getInt(jSONObject, "qp_p_min") >= 0 && JSONObjectProtectorUtils.getInt(jSONObject, "qp_p_max") <= 51) {
                                    if (JSONObjectProtectorUtils.getInt(jSONObject, "qp_i_max") >= JSONObjectProtectorUtils.getInt(jSONObject, "qp_i_min") && JSONObjectProtectorUtils.getInt(jSONObject, "qp_b_max") >= JSONObjectProtectorUtils.getInt(jSONObject, "qp_b_min") && JSONObjectProtectorUtils.getInt(jSONObject, "qp_p_max") >= JSONObjectProtectorUtils.getInt(jSONObject, "qp_p_min")) {
                                        if (Build.VERSION.SDK_INT >= 31) {
                                            mediaFormat2.setInteger("video-qp-i-min", JSONObjectProtectorUtils.getInt(jSONObject, "qp_i_min"));
                                            mediaFormat2.setInteger("video-qp-i-max", JSONObjectProtectorUtils.getInt(jSONObject, "qp_i_max"));
                                            mediaFormat2.setInteger("video-qp-b-min", JSONObjectProtectorUtils.getInt(jSONObject, "qp_b_min"));
                                            mediaFormat2.setInteger("video-qp-b-max", JSONObjectProtectorUtils.getInt(jSONObject, "qp_b_max"));
                                            mediaFormat2.setInteger("video-qp-p-min", JSONObjectProtectorUtils.getInt(jSONObject, "qp_p_min"));
                                            mediaFormat2.setInteger("video-qp-p-max", JSONObjectProtectorUtils.getInt(jSONObject, "qp_p_max"));
                                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                            sbLIZ3.append("set up qp config success. cfg:");
                                            sbLIZ3.append(jSONObject);
                                            AVLog.ioi("MTKClip", C2188811AlT.LIZIZ(sbLIZ3));
                                            return;
                                        }
                                        return;
                                    }
                                    AVLog.ioe("MTKClip", "setup qp range error. qp range should be qp_max >= qp_min");
                                    return;
                                }
                                AVLog.ioe("MTKClip", "setup qp range error. qp range should be in [0,51]");
                            } catch (JSONException e) {
                                TryCatchGuardChecker.doCheck(e);
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append("setup encode qp config error. qpCfg:");
                                sbLIZ4.append(str2);
                                AVLog.logKibana(6, "MTKClip", C2188811AlT.LIZIZ(sbLIZ4), e);
                            }
                        }
                    };
                }
            } else {
                abstractC1282510jTl = new AbstractC1282510jTl() { // from class: X.0jWl
                    @Override // X.AbstractC1282510jTl
                    public final void LIZ(String str2, MediaFormat mediaFormat2) {
                        try {
                            JSONObject jSONObject = new JSONObject(str2);
                            if (str2 != null) {
                                JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "qcom");
                                try {
                                    if (JSONObjectProtectorUtils.getInt(jSONObject2, "qp_i_min") >= 1 && JSONObjectProtectorUtils.getInt(jSONObject2, "qp_i_max") <= 51 && JSONObjectProtectorUtils.getInt(jSONObject2, "qp_b_min") >= 1 && JSONObjectProtectorUtils.getInt(jSONObject2, "qp_b_max") <= 51 && JSONObjectProtectorUtils.getInt(jSONObject2, "qp_p_min") >= 1 && JSONObjectProtectorUtils.getInt(jSONObject2, "qp_p_max") <= 51) {
                                        if (JSONObjectProtectorUtils.getInt(jSONObject2, "qp_i_max") >= JSONObjectProtectorUtils.getInt(jSONObject2, "qp_i_min") && JSONObjectProtectorUtils.getInt(jSONObject2, "qp_b_max") >= JSONObjectProtectorUtils.getInt(jSONObject2, "qp_b_min") && JSONObjectProtectorUtils.getInt(jSONObject2, "qp_p_max") >= JSONObjectProtectorUtils.getInt(jSONObject2, "qp_p_min")) {
                                            try {
                                                if (Build.VERSION.SDK_INT >= 31) {
                                                    mediaFormat2.setInteger("video-qp-i-min", JSONObjectProtectorUtils.getInt(jSONObject2, "qp_i_min"));
                                                    mediaFormat2.setInteger("video-qp-i-max", JSONObjectProtectorUtils.getInt(jSONObject2, "qp_i_max"));
                                                    mediaFormat2.setInteger("video-qp-b-min", JSONObjectProtectorUtils.getInt(jSONObject2, "qp_b_min"));
                                                    mediaFormat2.setInteger("video-qp-b-max", JSONObjectProtectorUtils.getInt(jSONObject2, "qp_b_max"));
                                                    mediaFormat2.setInteger("video-qp-p-min", JSONObjectProtectorUtils.getInt(jSONObject2, "qp_p_min"));
                                                    mediaFormat2.setInteger("video-qp-p-max", JSONObjectProtectorUtils.getInt(jSONObject2, "qp_p_max"));
                                                    mediaFormat2.setInteger("vendor.qti-ext-enc-qp-range.qp-i-min", JSONObjectProtectorUtils.getInt(jSONObject2, "qp_i_min"));
                                                    mediaFormat2.setInteger("vendor.qti-ext-enc-qp-range.qp-i-max", JSONObjectProtectorUtils.getInt(jSONObject2, "qp_i_max"));
                                                    mediaFormat2.setInteger("vendor.qti-ext-enc-qp-range.qp-b-min", JSONObjectProtectorUtils.getInt(jSONObject2, "qp_b_min"));
                                                    mediaFormat2.setInteger("vendor.qti-ext-enc-qp-range.qp-b-max", JSONObjectProtectorUtils.getInt(jSONObject2, "qp_b_max"));
                                                    mediaFormat2.setInteger("vendor.qti-ext-enc-qp-range.qp-p-min", JSONObjectProtectorUtils.getInt(jSONObject2, "qp_p_min"));
                                                    mediaFormat2.setInteger("vendor.qti-ext-enc-qp-range.qp-p-max", JSONObjectProtectorUtils.getInt(jSONObject2, "qp_p_max"));
                                                } else {
                                                    mediaFormat2.setInteger("vendor.qti-ext-enc-qp-range.qp-i-min", JSONObjectProtectorUtils.getInt(jSONObject2, "qp_i_min"));
                                                    mediaFormat2.setInteger("vendor.qti-ext-enc-qp-range.qp-i-max", JSONObjectProtectorUtils.getInt(jSONObject2, "qp_i_max"));
                                                    mediaFormat2.setInteger("vendor.qti-ext-enc-qp-range.qp-b-min", JSONObjectProtectorUtils.getInt(jSONObject2, "qp_b_min"));
                                                    mediaFormat2.setInteger("vendor.qti-ext-enc-qp-range.qp-b-max", JSONObjectProtectorUtils.getInt(jSONObject2, "qp_b_max"));
                                                    mediaFormat2.setInteger("vendor.qti-ext-enc-qp-range.qp-p-min", JSONObjectProtectorUtils.getInt(jSONObject2, "qp_p_min"));
                                                    mediaFormat2.setInteger("vendor.qti-ext-enc-qp-range.qp-p-max", JSONObjectProtectorUtils.getInt(jSONObject2, "qp_p_max"));
                                                }
                                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                sbLIZ3.append("set up qp config success. cfg:");
                                                sbLIZ3.append(jSONObject2);
                                                AVLog.ioi("QcomClip", C2188811AlT.LIZIZ(sbLIZ3));
                                                return;
                                            } catch (JSONException e) {
                                                e = e;
                                            }
                                        } else {
                                            AVLog.ioe("QcomClip", "setup qp range error. qp range should be qp_max >= qp_min");
                                            return;
                                        }
                                    } else {
                                        AVLog.ioe("QcomClip", "setup qp range error. qp range should be in [0,51]");
                                        return;
                                    }
                                } catch (JSONException e2) {
                                    e = e2;
                                }
                            } else {
                                return;
                            }
                        } catch (JSONException e3) {
                            e = e3;
                        }
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("setup encode qp config error. qpCfg:");
                        sbLIZ4.append(str2);
                        AVLog.logKibana(6, "QcomClip", C2188811AlT.LIZIZ(sbLIZ4), e);
                    }
                };
            }
            abstractC1282510jTl.LIZ(string, mediaFormat);
        }
    }

    public final void LLJILJIL(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        if (mediaCodec != null && bufferInfo != null && i >= 0) {
            try {
                ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(i);
                if (outputBuffer == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("buffer is null, index=");
                    sbLIZ.append(i);
                    AVLog.ioi("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                this.LLLFZ.LJIIJ++;
                outputBuffer.position(bufferInfo.offset);
                if (!this.LLLFFI) {
                    outputBuffer.limit(bufferInfo.size);
                }
                ByteBuffer byteBufferSlice = outputBuffer.slice();
                if (!byteBufferSlice.isDirect()) {
                    ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bufferInfo.size);
                    byteBufferAllocateDirect.position(0);
                    byteBufferAllocateDirect.put(byteBufferSlice);
                    byteBufferAllocateDirect.position(0);
                    byteBufferSlice = byteBufferAllocateDirect;
                }
                if (!byteBufferSlice.hasRemaining()) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Buffer has no remaining, current frame count is ");
                    sbLIZ2.append(this.LLLFZ.LJIIIZ);
                    AVLog.logKibana(5, "HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ2), null);
                    mediaCodec.releaseOutputBuffer(i, false);
                    return;
                }
                int i2 = bufferInfo.flags;
                if ((i2 & 2) != 0) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Config frame generated. Offset: ");
                    sbLIZ3.append(bufferInfo.offset);
                    sbLIZ3.append(". Size: ");
                    sbLIZ3.append(bufferInfo.size);
                    AVLog.iod("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ3));
                    C1282410jTb c1282410jTb = this.LLLFZ;
                    if (!c1282410jTb.LJI) {
                        c1282410jTb.LJI = true;
                        c1282410jTb.LJFF = System.currentTimeMillis();
                    }
                    if (this.LLJLLL == null) {
                        byte[] bArr = new byte[bufferInfo.size];
                        this.LLJLLL = bArr;
                        byteBufferSlice.get(bArr);
                        byteBufferSlice.position(0);
                    }
                    nativeEncoded(byteBufferSlice, bufferInfo.size, bufferInfo.flags, 0, 0L, 0L);
                } else if (i2 != 4) {
                    if (i2 == 1) {
                        C1282410jTb c1282410jTb2 = this.LLLFZ;
                        if (!c1282410jTb2.LJIIIIZZ) {
                            c1282410jTb2.LJIIIIZZ = true;
                            c1282410jTb2.LJII = System.currentTimeMillis();
                        }
                        if (this.LLJLLL != null) {
                            if (this.LLILLJJLI.equals("video/avc")) {
                                if (bufferInfo.size > this.LLJLLL.length) {
                                    byte b = byteBufferSlice.get(4);
                                    byte[] bArr2 = this.LLJLLL;
                                    if (b == bArr2[4] && LLJIJIL(byteBufferSlice.get(bArr2.length + 4))) {
                                        byteBufferSlice.position(this.LLJLLL.length);
                                        if (!this.LLLFFI) {
                                            byteBufferSlice.limit(byteBufferSlice.limit() - this.LLJLLL.length);
                                        }
                                        byteBufferSlice = byteBufferSlice.slice();
                                        this.LLLFZ.LJIIL = true;
                                    }
                                }
                            } else if (this.LLILLJJLI.equals(C1282590jTt.LIZ)) {
                                if (bufferInfo.size > this.LLJLLL.length) {
                                    byte b2 = byteBufferSlice.get(4);
                                    byte[] bArr3 = this.LLJLLL;
                                    if (b2 == bArr3[4] && LLJIJIL(byteBufferSlice.get(bArr3.length + 4))) {
                                        byteBufferSlice.position(this.LLJLLL.length);
                                        if (!this.LLLFFI) {
                                            byteBufferSlice.limit(byteBufferSlice.limit() - this.LLJLLL.length);
                                        }
                                        byteBufferSlice = byteBufferSlice.slice();
                                        this.LLLFZ.LJIIL = true;
                                    }
                                }
                            } else {
                                AVLog.ioe("HardwareVideoEncoder", "can't find config byte, end extract from I frame");
                            }
                        }
                    } else {
                        int iRemaining = byteBufferSlice.remaining();
                        if (iRemaining >= 5) {
                            if (LLJIJIL(byteBufferSlice.get(4))) {
                                bufferInfo.flags |= 1;
                            }
                        } else {
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("Buffer remaining size is less than 5: ");
                            sbLIZ4.append(iRemaining);
                            AVLog.logKibana(5, "HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ4), null);
                        }
                    }
                    if (this.LLJ) {
                        this.LLJIJIL++;
                    }
                    LLIZLLLIL(byteBufferSlice);
                    this.LLJJIII.LIZIZ(byteBufferSlice, bufferInfo);
                } else {
                    AVLog.iow("HardwareVideoEncoder", "MediaCodec.BUFFER_FLAG_END_OF_STREAM");
                    return;
                }
                mediaCodec.releaseOutputBuffer(i, false);
                return;
            } catch (IllegalStateException e) {
                TryCatchGuardChecker.doCheck(e);
                AVLog.ioe("HardwareVideoEncoder", "encoded callback error", e);
                return;
            } catch (NullPointerException e2) {
                TryCatchGuardChecker.doCheck(e2);
                AVLog.ioe("HardwareVideoEncoder", "MediaCodec has been released", e2);
                return;
            }
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("on encoded error: ");
        sbLIZ5.append(mediaCodec);
        sbLIZ5.append(", ");
        sbLIZ5.append(bufferInfo);
        sbLIZ5.append(", index=");
        sbLIZ5.append(i);
        AVLog.ioi("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ5));
    }
}
