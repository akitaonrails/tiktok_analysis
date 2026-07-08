package X;

import Y.ARunnableS120S0100000_20;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.view.Surface;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ttlivestreamer.core.engine.VideoEncoder;
import com.ss.ttlivestreamer.core.opengl.GLSurface;
import com.ss.ttlivestreamer.core.opengl.GlRenderDrawer;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThread;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jTZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1282390jTZ extends VideoEncoder {
    public String LL;
    public String LLILLJJLI;
    public C1282610jTv LLILLL;
    public Integer LLILZ;
    public Integer LLILZIL;
    public EnumC1273500jFE LLILZLL;
    public int LLIZ;
    public volatile boolean LLIZLLLIL;
    public boolean LLJ;
    public long LLJI;
    public long LLJIJIL;
    public AbstractC1282450jTf LLJILJIL;
    public boolean LLJJ;
    public boolean LLJJIJI;
    public MediaCodecInfo LLJJJ;
    public MediaCodec LLJJJIL;
    public SafeHandlerThread LLJJJJ;
    public Surface LLJJJJJIL;
    public int LLJJJJLIIL;
    public int LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public int LLJLIL;
    public boolean LLJLL;
    public GLSurface LLJLLIL;
    public GlRenderDrawer LLJLLL;
    public byte[] LLJZIJLIL;
    public byte[] LLL;
    public EGLSurface LLLFF;
    public EGLDisplay LLLFFI;
    public C1269390j8b LLLFZ;
    public C1269940j9U LLLI;
    public double LLJILJILJ = -1.0d;
    public double LLJILLL = -1.0d;
    public double LLJJI = -1.0d;
    public C1282530jTn LLJJIII = new C1282530jTn(this);
    public boolean LLJJIJIIJIL = false;
    public int LLJJIJIL = -1;
    public int LLJLILLLLZIIL = 0;
    public byte[] LLJZ = null;
    public boolean LLLF = false;
    public final C1282420jTc LLLII = new C1282420jTc(this);

    public final void LLJILJIL() {
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("request-sync", 0);
            MediaCodec mediaCodec = this.LLJJJIL;
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

    public boolean LLJILJILJ() {
        String str = this.LLILLJJLI;
        String str2 = C1282600jTu.LIZ;
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
                    if (!TextUtils.isEmpty(lowerCase) && !C1282600jTu.LIZ(lowerCase) && C1282600jTu.LIZIZ(codecInfoAt, str)) {
                        z = true;
                        break;
                    }
                }
                i++;
            }
        }
        if (z) {
            this.LLLII.LJFF(10);
            return z;
        }
        this.LLLII.LJ(10, null);
        return z;
    }

    @Override // com.ss.ttlivestreamer.core.engine.VideoEncoder
    public final void RequestIDRFrame() {
        AVLog.iow("HardwareVideoEncoder", "RequestIDRFrame");
        this.LLIZLLLIL = true;
    }

    @Override // com.ss.ttlivestreamer.core.engine.VideoEncoder
    public final String getEncoderInfo() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("codec_name", this.LLJJJ.getName());
            jSONObject.put("hardware", true);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return C786410Ut5.J3(jSONObject);
    }

    @Override // com.ss.ttlivestreamer.core.engine.VideoEncoder, com.ss.ttlivestreamer.core.engine.NativeObject
    public void release() {
        C1269390j8b c1269390j8b = this.LLLFZ;
        if (c1269390j8b == null) {
            return;
        }
        c1269390j8b.LIZ();
        MediaCodec mediaCodec = this.LLJJJIL;
        if (mediaCodec != null) {
            try {
                if (this.LLJJLIIIJLLLLLLLZ) {
                    GLSurface gLSurface = this.LLJLLIL;
                    if (gLSurface != null) {
                        gLSurface.nativeSwapBuffers();
                    }
                    this.LLJJJIL.signalEndOfInputStream();
                    AVLog.ioi("HardwareVideoEncoder", "Texture codec signalEndOfInputStream ok");
                } else {
                    int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(this.LLJ ? -1L : 0L);
                    if (iDequeueInputBuffer >= 0) {
                        ByteBuffer byteBuffer = this.LLJJJIL.getInputBuffers()[iDequeueInputBuffer];
                        if (byteBuffer != null) {
                            byteBuffer.position(0);
                            byteBuffer.limit(0);
                        }
                        this.LLJJJIL.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
                        AVLog.ioi("HardwareVideoEncoder", "Yuv codec signalEndOfInputStream ok");
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LLJJLIIIJLLLLLLLZ ? "Texture" : "Yuv");
                sbLIZ.append(" codec signalEndOfInputStream failed: ");
                sbLIZ.append(e.getMessage());
                AVLog.ioe("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        MediaCodec mediaCodec2 = this.LLJJJIL;
        SafeHandlerThread safeHandlerThread = this.LLJJJJ;
        if (safeHandlerThread != null) {
            C1283100jUi.LIZIZ(safeHandlerThread.getHandler(), new ARunnableS120S0100000_20(this, 248));
        }
        LLJIJIL(mediaCodec2);
        SafeHandlerThread safeHandlerThread2 = this.LLJJJJ;
        if (safeHandlerThread2 != null) {
            C1273730jFb.LIZLLL(safeHandlerThread2);
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

    /* JADX WARN: Removed duplicated region for block: B:44:0x00ef A[Catch: RuntimeException -> 0x01ed, TryCatch #2 {RuntimeException -> 0x01ed, blocks: (B:27:0x0094, B:29:0x00a8, B:34:0x00b8, B:36:0x00bc, B:37:0x00c1, B:39:0x00c9, B:41:0x00e8, B:42:0x00eb, B:44:0x00ef, B:45:0x00fc, B:47:0x0107, B:51:0x012f, B:48:0x010e, B:50:0x0116, B:52:0x0133, B:33:0x00b5, B:31:0x00ae), top: B:93:0x0094, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0107 A[Catch: RuntimeException -> 0x01ed, TryCatch #2 {RuntimeException -> 0x01ed, blocks: (B:27:0x0094, B:29:0x00a8, B:34:0x00b8, B:36:0x00bc, B:37:0x00c1, B:39:0x00c9, B:41:0x00e8, B:42:0x00eb, B:44:0x00ef, B:45:0x00fc, B:47:0x0107, B:51:0x012f, B:48:0x010e, B:50:0x0116, B:52:0x0133, B:33:0x00b5, B:31:0x00ae), top: B:93:0x0094, inners: #3 }] */
    @Override // com.ss.ttlivestreamer.core.engine.VideoEncoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int Encode(com.ss.ttlivestreamer.core.buffer.VideoFrame r19) {
        /*
            Method dump skipped, instruction units count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1282390jTZ.Encode(com.ss.ttlivestreamer.core.buffer.VideoFrame):int");
    }

    @Override // com.ss.ttlivestreamer.core.engine.VideoEncoder
    public boolean InitEncoder(TEBundle tEBundle) {
        boolean z;
        String str;
        C1282530jTn c1282530jTn;
        String str2;
        boolean z2;
        String str3;
        int i;
        this.LLLII.LJFF(31);
        C1282420jTc c1282420jTc = this.LLLII;
        c1282420jTc.getClass();
        try {
            c1282420jTc.LIZJ.put("profileLevel", tEBundle.getInt("video_profileLevel"));
            JSONObject jSONObject = c1282420jTc.LIZJ;
            if (tEBundle.getInt("configuration_type") == 0) {
                str3 = "avcc";
            } else {
                str3 = "annex-b";
            }
            jSONObject.put("configurationType", str3);
            c1282420jTc.LIZJ.put("fixHWEncDts", tEBundle.getBool("video_fix_hardware_enc_dts"));
            c1282420jTc.LIZJ.put("enablePerfPrior", tEBundle.getBool("video_encode_perf_prior"));
            TEBundle bundle = tEBundle.getBundle("roi_settings");
            if (bundle != null) {
                i = bundle.getInt("roi_on");
            } else {
                i = 0;
            }
            c1282420jTc.LIZJ.put("enableROI", i);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (this.LLLFZ == null) {
            this.LLLFZ = new C1269390j8b();
        }
        this.LLJJJJLIIL = tEBundle.getInt("video_width");
        this.LLJJL = tEBundle.getInt("video_height");
        int i2 = tEBundle.getInt("video_fps");
        this.LLJLILLLLZIIL = i2;
        if (i2 <= 0) {
            i2 = 25;
        }
        this.LLJLILLLLZIIL = i2;
        this.LLJ = tEBundle.getBool("video_no_drop_frame");
        if (tEBundle.getInt("video_is_cbr") == 1) {
            z = true;
        } else {
            z = false;
        }
        this.LLJLL = z;
        this.LLJJ = tEBundle.getBool("enableBFrame");
        if (tEBundle.getInt("video_enable_hard_enc_bframe") >= 0) {
            if (tEBundle.getInt("video_enable_hard_enc_bframe") > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.LLJJ = z2;
        }
        if (tEBundle.contains("video_const_time_period_gop")) {
            this.LLJJIJI = tEBundle.getBool("video_const_time_period_gop");
        }
        boolean bool = tEBundle.getBool("video_lossless_encode");
        this.LLJL = bool;
        if (bool) {
            this.LLJLIL = ((((this.LLJJJJLIIL * this.LLJJL) * this.LLJLILLLLZIIL) * 3) / 2) * 8;
        } else {
            this.LLJLIL = (int) tEBundle.getLong("video_bitrate");
        }
        this.LLIZ = tEBundle.getInt("video_gop") / this.LLJLILLLLZIIL;
        if (tEBundle.contains("videoEncoderStrategy")) {
            try {
                if (this.LLILLJJLI.equalsIgnoreCase(C1282600jTu.LIZ)) {
                    str = "hardBytevc1";
                } else {
                    str = "hardH264";
                }
                JSONObject jSONObjectOptJSONObject = new JSONObject(tEBundle.getString("videoEncoderStrategy")).optJSONObject(str);
                if (jSONObjectOptJSONObject != null) {
                    if (!jSONObjectOptJSONObject.isNull("bitrateRatio")) {
                        this.LLJILLL = JSONObjectProtectorUtils.getDouble(jSONObjectOptJSONObject, "bitrateRatio");
                    }
                    if (!jSONObjectOptJSONObject.isNull("enableBFrame")) {
                        this.LLJJ = JSONObjectProtectorUtils.getBoolean(jSONObjectOptJSONObject, "enableBFrame");
                    }
                    if (!jSONObjectOptJSONObject.isNull("bFrameBitrateRatio")) {
                        this.LLJJI = JSONObjectProtectorUtils.getDouble(jSONObjectOptJSONObject, "bFrameBitrateRatio");
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        if (tEBundle.contains("video_hw_encode_lock_optimize")) {
            this.LLJJIJIIJIL = tEBundle.getBool("video_hw_encode_lock_optimize");
        }
        if (tEBundle.getInt("configuration_type") == 0) {
            AVLog.ioe("HardwareVideoEncoder", "Value of TEBundle.kKeyVideoConfigurationType error, should be 1 (Annex-B)");
            this.LLLII.LJ(31, null);
            return false;
        }
        if (!tEBundle.getBool("video_fix_hardware_enc_dts") && !this.LLJJ) {
            c1282530jTn = new C1282530jTn(this);
        } else {
            c1282530jTn = new C1282530jTn() { // from class: X.0jTm
                public final LinkedList<C1282560jTq> LJII;
                public final LinkedList<Long> LJIIIIZZ;
                public long LJIIIZ;
                public int LJIIJ;

                {
                    super(this.LJIIJJI);
                    this.LJII = new LinkedList<>();
                    this.LJIIIIZZ = new LinkedList<>();
                    this.LJIIJ = -1;
                }

                @Override // X.C1282530jTn
                public final void LIZLLL(long j) {
                    super.LIZLLL(j);
                    this.LJIIIIZZ.offer(Long.valueOf(j));
                }

                @Override // X.C1282530jTn
                public final synchronized void LIZIZ(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
                    long j = bufferInfo.presentationTimeUs;
                    boolean z3 = true;
                    if ((bufferInfo.flags & 1) == 0) {
                        z3 = false;
                    }
                    int iLIZ = LIZ(j, z3);
                    if (iLIZ < 0) {
                        C1282560jTq c1282560jTq = new C1282560jTq(this.LJIIJJI);
                        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(byteBuffer.limit());
                        c1282560jTq.LIZ = byteBufferAllocateDirect;
                        byteBufferAllocateDirect.put(byteBuffer);
                        c1282560jTq.LIZIZ = bufferInfo;
                        this.LJII.offer(c1282560jTq);
                    } else {
                        C1282560jTq c1282560jTqPollFirst = this.LJII.pollFirst();
                        while (c1282560jTqPollFirst != null) {
                            LJFF(iLIZ, c1282560jTqPollFirst.LIZIZ, c1282560jTqPollFirst.LIZ);
                            c1282560jTqPollFirst = this.LJII.pollFirst();
                        }
                        LJFF(iLIZ, bufferInfo, byteBuffer);
                    }
                }

                @Override // X.C1282530jTn
                public final void LJ(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
                    long j = bufferInfo.presentationTimeUs;
                    boolean z3 = true;
                    if ((bufferInfo.flags & 1) == 0) {
                        z3 = false;
                    }
                    int iLIZ = LIZ(j, z3);
                    if (iLIZ < 0) {
                        C1282560jTq c1282560jTq = new C1282560jTq(this.LJIIJJI);
                        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(byteBuffer.limit());
                        c1282560jTq.LIZ = byteBufferAllocateDirect;
                        byteBufferAllocateDirect.put(byteBuffer);
                        c1282560jTq.LIZIZ = bufferInfo;
                        this.LJII.offer(c1282560jTq);
                        return;
                    }
                    C1282560jTq c1282560jTqPollFirst = this.LJII.pollFirst();
                    while (c1282560jTqPollFirst != null) {
                        LJI(iLIZ, c1282560jTqPollFirst.LIZIZ, c1282560jTqPollFirst.LIZ);
                        c1282560jTqPollFirst = this.LJII.pollFirst();
                    }
                    LJI(iLIZ, bufferInfo, byteBuffer);
                }

                public final void LJFF(int i3, MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer) {
                    long j;
                    long jLongValue;
                    long j2 = bufferInfo.presentationTimeUs;
                    if (i3 >= 0) {
                        if (i3 == 0) {
                            this.LJIIJJI.nativeEncoded(byteBuffer, byteBuffer.limit(), bufferInfo.flags, 0, j2, j2);
                            return;
                        }
                        long j3 = 1000000 / this.LJIIJJI.LLJLILLLLZIIL;
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
                            if (AVLog.enableLogToIODevice2()) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("last dts out: ");
                                sbLIZ.append(this.LJIIIZ);
                                sbLIZ.append(", current dts out: ");
                                sbLIZ.append(j);
                                AVLog.logToIODevice2(6, "HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ), null, 12, 30000);
                            }
                            j = 10000 + this.LJIIIZ;
                        }
                        if (j > j2) {
                            if (AVLog.enableLogToIODevice2()) {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("pts out: ");
                                sbLIZ2.append(j2);
                                sbLIZ2.append(", dts out: ");
                                sbLIZ2.append(j);
                                AVLog.logToIODevice2(6, "HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ2), null, 13, 30000);
                            }
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

                public final void LJI(int i3, MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer) {
                    long j;
                    long jLongValue;
                    long j2 = bufferInfo.presentationTimeUs;
                    if (i3 >= 0) {
                        if (i3 == 0) {
                            this.LJIIJJI.nativeEncoded(byteBuffer, byteBuffer.limit(), bufferInfo.flags, 0, j2, j2);
                            return;
                        }
                        synchronized (this) {
                            try {
                                long j3 = 1000000 / this.LJIIJJI.LLJLILLLLZIIL;
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
                                    if (AVLog.enableLogToIODevice2()) {
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("last dts out: ");
                                        sbLIZ.append(this.LJIIIZ);
                                        sbLIZ.append(", current dts out: ");
                                        sbLIZ.append(j);
                                        AVLog.logToIODevice2(6, "HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ), null, 12, 30000);
                                    }
                                    j = 10000 + this.LJIIIZ;
                                }
                                if (j > j2) {
                                    if (AVLog.enableLogToIODevice2()) {
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("pts out: ");
                                        sbLIZ2.append(j2);
                                        sbLIZ2.append(", dts out: ");
                                        sbLIZ2.append(j);
                                        AVLog.logToIODevice2(6, "HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ2), null, 13, 30000);
                                    }
                                    j = j2;
                                }
                                this.LJIIIZ = j;
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                throw th2;
                            }
                        }
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
        this.LLJJIII = c1282530jTn;
        boolean bool2 = tEBundle.getBool("video_encode_perf_prior");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("videoEncodePerfPrior ");
        if (bool2) {
            str2 = "enabled";
        } else {
            str2 = "disabled";
        }
        sbLIZ.append(str2);
        AVLog.iow("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ));
        if (!bool2) {
            return LLJ(tEBundle, C1282600jTu.LIZJ(this.LLILLJJLI));
        }
        if (this.LLILLL == null) {
            this.LLILLL = new C1282610jTv(this.LLILLJJLI);
        }
        C1282610jTv c1282610jTv = this.LLILLL;
        while (!((ArrayList) c1282610jTv.LIZIZ).isEmpty()) {
            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) ListProtector.get(c1282610jTv.LIZIZ, 0);
            JSONObject jSONObjectLJ = C1282600jTu.LJ(mediaCodecInfo);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Try encoder ");
            sbLIZ2.append(jSONObjectLJ);
            AVLog.iow("MediaCodecUtils", C2188811AlT.LIZIZ(sbLIZ2));
            if (!LLJ(tEBundle, mediaCodecInfo)) {
                C1282420jTc c1282420jTc2 = this.LLLII;
                c1282420jTc2.getClass();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    c1282420jTc2.LIZ(jSONObject2);
                    JSONObject jSONObject3 = JSONObjectProtectorUtils.getJSONObject(jSONObject2, "codecInfos");
                    c1282420jTc2.LIZLLL(jSONObject3);
                    c1282420jTc2.LIZLLL.put(jSONObject3);
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Remove encoder ");
                sbLIZ3.append(jSONObjectLJ);
                AVLog.ioe("MediaCodecUtils", C2188811AlT.LIZIZ(sbLIZ3), null);
                ListProtector.remove(c1282610jTv.LIZIZ, 0);
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
        if (this.LLJJIJIL >= 0) {
            return;
        }
        if (this.LLILLJJLI.equals("video/avc")) {
            this.LLJJIJIL = 0;
            return;
        }
        if (!this.LLILLJJLI.equals(C1282600jTu.LIZ)) {
            return;
        }
        int i3 = 0;
        for (int iPosition = byteBuffer.position(); iPosition != byteBuffer.limit(); iPosition++) {
            byte b = byteBuffer.get(iPosition);
            if (b == 0) {
                i3++;
                if (i3 > 3) {
                    this.LLJJIJIL = 2;
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
                        int i4 = this.LLJJIJIL;
                        i2 = i4 == -2 ? 0 : i4 - 1;
                    }
                    this.LLJJIJIL = i2;
                    if (i2 == 1) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Multi-slice detected: model ");
                        sbLIZ2.append(Build.MODEL);
                        sbLIZ2.append(", width ");
                        sbLIZ2.append(this.LLJJJJLIIL);
                        sbLIZ2.append(", height ");
                        sbLIZ2.append(this.LLJJL);
                        sbLIZ2.append(", fps ");
                        sbLIZ2.append(this.LLJLILLLLZIIL);
                        sbLIZ2.append(", bitrate ");
                        sbLIZ2.append(this.LLJLIL / LSPassThroughRecordSizeConfig.DEFAULT);
                        sbLIZ2.append("kbps");
                        AVLog.logKibana(5, "HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ2), null);
                    }
                    if (this.LLJJIJIL >= 0) {
                        return;
                    }
                }
                i3 = 0;
            }
        }
    }

    public final boolean LLJI(byte b) {
        if (this.LLILLJJLI.equals("video/avc")) {
            if ((b & 31) == 5) {
                return true;
            }
            return false;
        }
        if (!this.LLILLJJLI.equals(C1282600jTu.LIZ)) {
            return false;
        }
        int i = (b & 126) >> 1;
        if (i == 16 || i == 17 || i == 18 || i == 19 || i == 20 || i == 21) {
            return true;
        }
        return false;
    }

    public final void LLJIJIL(MediaCodec mediaCodec) {
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
        GlRenderDrawer glRenderDrawer = this.LLJLLL;
        if (glRenderDrawer != null) {
            glRenderDrawer.release();
            this.LLJLLL = null;
        }
        if (this.LLJLLIL != null) {
            GLES20.glFinish();
            this.LLJLLIL.release();
            this.LLJLLIL = null;
        }
        Surface surface = this.LLJJJJJIL;
        if (surface != null) {
            surface.release();
            this.LLJJJJJIL = null;
        }
        AVLog.iod("HardwareVideoEncoder", "Release on output thread done");
    }

    @Override // com.ss.ttlivestreamer.core.engine.VideoEncoder
    public final void SetBitrate(int i) {
        if (!this.LLJL && this.LLJJJIL != null) {
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
                this.LLJJJIL.setParameters(bundle);
                this.LLJLIL = i;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("update bitrate: ");
                sbLIZ.append(LLIZ(i, i2));
                AVLog.ioi("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ));
            } catch (IllegalStateException e) {
                TryCatchGuardChecker.doCheck(e);
                try {
                    double d4 = this.LLJLIL;
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
                    this.LLJJJIL.setParameters(bundle2);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("reset bitrate: ");
                    sbLIZ2.append(LLIZ(this.LLJLIL, i3));
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
                    sbLIZ4.append(this.LLJLIL);
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

    public final boolean LLJ(TEBundle tEBundle, MediaCodecInfo mediaCodecInfo) {
        EnumC1273500jFE enumC1273500jFE;
        MediaFormat mediaFormatCreateVideoFormat;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str;
        this.LLLII.LJFF(41);
        this.LLJJJ = mediaCodecInfo;
        if (mediaCodecInfo == null) {
            this.LLLII.LJ(41, null);
            return false;
        }
        String name = mediaCodecInfo.getName();
        Integer numLIZLLL = C1282600jTu.LIZLLL(C1282600jTu.LJI, this.LLJJJ.getCapabilitiesForType(this.LLILLJJLI), name);
        Integer numLIZLLL2 = C1282600jTu.LIZLLL(C1282600jTu.LJFF, this.LLJJJ.getCapabilitiesForType(this.LLILLJJLI), name);
        this.LL = name;
        this.LLILZ = numLIZLLL;
        this.LLILZIL = numLIZLLL2;
        int iIntValue = numLIZLLL2.intValue();
        C1273480jFC c1273480jFC = EnumC1273500jFE.LL;
        if (iIntValue != 19) {
            if (iIntValue != 21 && iIntValue != 2141391872 && iIntValue != 2141391876) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unsupported colorFormat: ");
                sbLIZ.append(iIntValue);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            enumC1273500jFE = EnumC1273500jFE.LLILLJJLI;
        } else {
            enumC1273500jFE = EnumC1273500jFE.LL;
        }
        this.LLILZLL = enumC1273500jFE;
        boolean z = !tEBundle.getBool("video_is_yuv_frame");
        this.LLJJLIIIJLLLLLLLZ = z;
        if (z && numLIZLLL == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("useSurfaceMode ");
            sbLIZ2.append(this.LLJJLIIIJLLLLLLLZ);
            sbLIZ2.append(", surfaceColorFormat ");
            sbLIZ2.append(numLIZLLL);
            sbLIZ2.append(", yuvColorFormat ");
            sbLIZ2.append(numLIZLLL2);
            AVLog.ioe("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ2));
            this.LLLII.LJ(42, null);
            return false;
        }
        this.LLLII.LJFF(51);
        try {
            mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.LLILLJJLI, this.LLJJJJLIIL, this.LLJJL);
            mediaFormatCreateVideoFormat.setInteger("bitrate", this.LLJLIL);
            if (this.LLJLL) {
                i = 2;
            } else {
                i = 1;
            }
            mediaFormatCreateVideoFormat.setInteger("bitrate-mode", i);
            if (C1267520j5a.LIZ()) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Set bitrate mode: ");
                if (this.LLJLL) {
                    str = "CBR";
                } else {
                    str = "VBR";
                }
                sbLIZ3.append(str);
                C2188811AlT.LIZIZ(sbLIZ3);
            }
            mediaFormatCreateVideoFormat.setInteger("frame-rate", this.LLJLILLLLZIIL);
            if (this.LLJJIJI) {
                i2 = -1;
            } else {
                i2 = this.LLIZ;
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("Using constant time period [");
            sbLIZ4.append(this.LLJJIJI);
            sbLIZ4.append("] with i frame interval [");
            sbLIZ4.append(i2);
            sbLIZ4.append("s]");
            AVLog.iow("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ4));
            mediaFormatCreateVideoFormat.setInteger("i-frame-interval", i2);
            if (this.LLJJ) {
                i3 = 2;
            } else {
                i3 = 0;
            }
            mediaFormatCreateVideoFormat.setInteger("max-bframes", i3);
        } catch (Exception e) {
            e = e;
        }
        try {
            if (this.LLILLJJLI.equals("video/avc")) {
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : this.LLJJJ.getCapabilitiesForType(this.LLILLJJLI).profileLevels) {
                    if (C1268530j7D.LIZ()) {
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("Profile = ");
                        sbLIZ5.append(codecProfileLevel.profile);
                        sbLIZ5.append(", Level = ");
                        sbLIZ5.append(codecProfileLevel.level);
                        AVLog.d("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ5));
                    }
                    int i6 = codecProfileLevel.profile;
                    if (i6 == 1) {
                        AVLog.d("HardwareVideoEncoder", "Support Baseline Profile!");
                    } else if (i6 == 2) {
                        AVLog.d("HardwareVideoEncoder", "Support Main Profile!");
                    } else if (i6 == 8) {
                        AVLog.d("HardwareVideoEncoder", "Support High Profile!");
                    }
                    int i7 = codecProfileLevel.profile;
                    int i8 = tEBundle.getInt("video_profileLevel");
                    synchronized (this) {
                        if (i8 != 2) {
                            if (i8 != 3) {
                                i5 = 1;
                            } else {
                                i5 = 8;
                            }
                        } else {
                            i5 = 2;
                        }
                    }
                    if (i7 == i5) {
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("Set Profile: ");
                        sbLIZ6.append(codecProfileLevel.profile);
                        sbLIZ6.append(", Level = ");
                        sbLIZ6.append(codecProfileLevel.level);
                        AVLog.d("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ6));
                        mediaFormatCreateVideoFormat.setInteger("profile", codecProfileLevel.profile);
                        mediaFormatCreateVideoFormat.setInteger("level", codecProfileLevel.level);
                    }
                }
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append("Android SDK version ");
                sbLIZ7.append(Build.VERSION.SDK_INT);
                sbLIZ7.append(", dstProfileLevel ");
                sbLIZ7.append((Object) null);
                this.LLLII.LJ(51, new Throwable(C2188811AlT.LIZIZ(sbLIZ7)));
                return false;
            }
            if (this.LLILLJJLI.equals(C1282600jTu.LIZ)) {
                if (tEBundle.getInt("video_profileLevel") != 5) {
                    mediaFormatCreateVideoFormat.setInteger("profile", 1);
                } else {
                    mediaFormatCreateVideoFormat.setInteger("profile", 2);
                }
                mediaFormatCreateVideoFormat.setInteger("level", 256);
            } else {
                try {
                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                    sbLIZ8.append("Unsupported codec type: ");
                    sbLIZ8.append(this.LLILLJJLI);
                    AVLog.ioe("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ8));
                    this.LLLII.LJ(52, null);
                    return false;
                } catch (Exception e2) {
                    e = e2;
                    TryCatchGuardChecker.doCheck(e);
                    this.LLLII.LJ(54, e);
                    StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                    sbLIZ9.append("initEncodeInternal failed: ");
                    sbLIZ9.append(e.getMessage());
                    AVLog.ioe("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ9));
                    MediaCodec mediaCodec = this.LLJJJIL;
                    this.LLJJJIL = null;
                    LLJIJIL(mediaCodec);
                    return false;
                }
            }
            try {
                if (this.LLJILJIL == null) {
                    this.LLJILJIL = AbstractC1282450jTf.LIZJ(this.LL, tEBundle);
                }
                AbstractC1282450jTf abstractC1282450jTf = this.LLJILJIL;
                if (abstractC1282450jTf != null) {
                    abstractC1282450jTf.LIZIZ(mediaFormatCreateVideoFormat);
                }
                LLJILLL(this.LL, mediaFormatCreateVideoFormat, tEBundle);
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                AVLog.ioe("HardwareVideoEncoder", "init roi or qp range failed. ", e3);
            }
            if (this.LLJJLIIIJLLLLLLLZ) {
                this.LLLII.LJFF(52);
                mediaFormatCreateVideoFormat.setInteger("color-format", this.LLILZ.intValue());
                MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(this.LL);
                this.LLJJJIL = mediaCodecCreateByCodecName;
                mediaCodecCreateByCodecName.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
                this.LLLII.LJFF(53);
                try {
                    this.LLJJJJJIL = this.LLJJJIL.createInputSurface();
                } catch (Exception e4) {
                    TryCatchGuardChecker.doCheck(e4);
                }
                this.LLJLLL = new GlRenderDrawer();
                GLSurface gLSurface = new GLSurface();
                this.LLJLLIL = gLSurface;
                gLSurface.nativeSurfaceCreate(this.LLJJJJLIIL, this.LLJJL, this.LLJJJJJIL);
                this.LLJLLIL.nativeMakeCurrent();
                this.LLLII.LJFF(54);
                this.LLLFFI = EGL14.eglGetCurrentDisplay();
                EGLSurface eGLSurfaceEglGetCurrentSurface = EGL14.eglGetCurrentSurface(12378);
                this.LLLFF = eGLSurfaceEglGetCurrentSurface;
                if (eGLSurfaceEglGetCurrentSurface != null && this.LLLFFI != null) {
                    this.LLLII.LJFF(55);
                    this.LLJJJIL.start();
                } else {
                    throw new IllegalStateException("currSurface " + this.LLLFF + ", currDisplay " + this.LLLFFI);
                }
            } else {
                this.LLLII.LJFF(56);
                mediaFormatCreateVideoFormat.setInteger("color-format", this.LLILZIL.intValue());
                MediaCodec mediaCodecCreateByCodecName2 = MediaCodec.createByCodecName(this.LL);
                this.LLJJJIL = mediaCodecCreateByCodecName2;
                mediaCodecCreateByCodecName2.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
                this.LLLII.LJFF(57);
                this.LLJJJIL.start();
            }
            AVLog.d("HardwareVideoEncoder", "Format: " + mediaFormatCreateVideoFormat);
            try {
                AbstractC1282450jTf abstractC1282450jTf2 = this.LLJILJIL;
                double d = -1.0d;
                if (abstractC1282450jTf2 != null) {
                    abstractC1282450jTf2.LIZ(this.LLJJJIL, tEBundle);
                    AbstractC1282450jTf abstractC1282450jTf3 = this.LLJILJIL;
                    int i9 = abstractC1282450jTf3.LIZ;
                    if (i9 == 1 || i9 == 0) {
                        d = abstractC1282450jTf3.LIZLLL;
                    }
                    this.LLJILJILJ = d;
                } else {
                    TEBundle bundle = tEBundle.getBundle("roi_settings");
                    if (bundle != null && bundle.contains("roi_bitrate_ratio") && ((i4 = bundle.getInt("roi_on")) == 1 || i4 == 0)) {
                        d = bundle.getDouble("roi_bitrate_ratio");
                    }
                    this.LLJILJILJ = d;
                }
            } catch (Exception e5) {
                TryCatchGuardChecker.doCheck(e5);
            }
            SetBitrate(this.LLJLIL);
            SafeHandlerThread safeHandlerThreadLIZIZ = C1273730jFb.LIZIZ(0, "HwEncoderReadThread");
            this.LLJJJJ = safeHandlerThreadLIZIZ;
            safeHandlerThreadLIZIZ.start();
            this.LLLII.LJFF(200);
            this.LLLII.LJ = System.currentTimeMillis();
            return true;
        } catch (Exception e6) {
            e = e6;
            TryCatchGuardChecker.doCheck(e);
            this.LLLII.LJ(54, e);
            StringBuilder sbLIZ92 = C2188811AlT.LIZ();
            sbLIZ92.append("initEncodeInternal failed: ");
            sbLIZ92.append(e.getMessage());
            AVLog.ioe("HardwareVideoEncoder", C2188811AlT.LIZIZ(sbLIZ92));
            MediaCodec mediaCodec2 = this.LLJJJIL;
            this.LLJJJIL = null;
            LLJIJIL(mediaCodec2);
            return false;
        }
    }

    public static void LLJILLL(String str, MediaFormat mediaFormat, TEBundle tEBundle) {
        AbstractC1282500jTk abstractC1282500jTk;
        if (!tEBundle.contains("video_qp_settings")) {
            return;
        }
        String string = tEBundle.getString("video_qp_settings");
        if (str.startsWith("OMX.hisi.")) {
            abstractC1282500jTk = new AbstractC1282500jTk() { // from class: X.0jVc
                @Override // X.AbstractC1282500jTk
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
                                return;
                            }
                            mediaFormat2.setInteger("vendor.hisi.hisi-ext-codec-qp-regulation-supported", 1);
                            mediaFormat2.setInteger("vendor.hisi.hisi-ext-codec-min-qp", JSONObjectProtectorUtils.getInt(jSONObject, "qp_min"));
                            mediaFormat2.setInteger("vendor.hisi.hisi-ext-codec-max-qp", JSONObjectProtectorUtils.getInt(jSONObject, "qp_max"));
                            return;
                        }
                        AVLog.ioe("HisiClip", "setup qp range error. qp range should be in [0,51]");
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("setup encode qp config error. qpCfg:");
                        sbLIZ.append(str2);
                        AVLog.logKibana(6, "HisiClip", C2188811AlT.LIZIZ(sbLIZ), e);
                    }
                }
            };
        } else if (!str.startsWith("OMX.qcom.") && !str.startsWith("c2.qti.")) {
            if (str.startsWith("OMX.Exynos.")) {
                abstractC1282500jTk = new AbstractC1282500jTk() { // from class: X.0jWm
                    @Override // X.AbstractC1282500jTk
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
                                                return;
                                            }
                                            mediaFormat2.setInteger("vendor.sec-ext-enc-qp-range.I-minQP", JSONObjectProtectorUtils.getInt(jSONObject, "qp_i_min"));
                                            mediaFormat2.setInteger("vendor.sec-ext-enc-qp-range.I-maxQP", JSONObjectProtectorUtils.getInt(jSONObject, "qp_i_max"));
                                            mediaFormat2.setInteger("vendor.sec-ext-enc-qp-range.B-minQP", JSONObjectProtectorUtils.getInt(jSONObject, "qp_b_min"));
                                            mediaFormat2.setInteger("vendor.sec-ext-enc-qp-range.B-maxQP", JSONObjectProtectorUtils.getInt(jSONObject, "qp_b_max"));
                                            mediaFormat2.setInteger("vendor.sec-ext-enc-qp-range.P-minQP", JSONObjectProtectorUtils.getInt(jSONObject, "qp_p_min"));
                                            mediaFormat2.setInteger("vendor.sec-ext-enc-qp-range.P-maxQP", JSONObjectProtectorUtils.getInt(jSONObject, "qp_p_max"));
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
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("setup encode qp config error. qpCfg:");
                        sbLIZ.append(str2);
                        AVLog.logKibana(6, "ExynosClip", C2188811AlT.LIZIZ(sbLIZ), e);
                    }
                };
            } else if (!str.startsWith("OMX.MTK.") && !str.startsWith("c2.mtk.")) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("create Clip instance error. codecName:");
                sbLIZ.append(str);
                AVLog.ioe("Clip", C2188811AlT.LIZIZ(sbLIZ));
                abstractC1282500jTk = null;
            } else {
                abstractC1282500jTk = new AbstractC1282500jTk() { // from class: X.0jWp
                    @Override // X.AbstractC1282500jTk
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
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("setup encode qp config error. qpCfg:");
                            sbLIZ2.append(str2);
                            AVLog.logKibana(6, "MTKClip", C2188811AlT.LIZIZ(sbLIZ2), e);
                        }
                    }
                };
            }
        } else {
            abstractC1282500jTk = new AbstractC1282500jTk() { // from class: X.0jWn
                @Override // X.AbstractC1282500jTk
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
                                                return;
                                            }
                                            mediaFormat2.setInteger("vendor.qti-ext-enc-qp-range.qp-i-min", JSONObjectProtectorUtils.getInt(jSONObject2, "qp_i_min"));
                                            mediaFormat2.setInteger("vendor.qti-ext-enc-qp-range.qp-i-max", JSONObjectProtectorUtils.getInt(jSONObject2, "qp_i_max"));
                                            mediaFormat2.setInteger("vendor.qti-ext-enc-qp-range.qp-b-min", JSONObjectProtectorUtils.getInt(jSONObject2, "qp_b_min"));
                                            mediaFormat2.setInteger("vendor.qti-ext-enc-qp-range.qp-b-max", JSONObjectProtectorUtils.getInt(jSONObject2, "qp_b_max"));
                                            mediaFormat2.setInteger("vendor.qti-ext-enc-qp-range.qp-p-min", JSONObjectProtectorUtils.getInt(jSONObject2, "qp_p_min"));
                                            mediaFormat2.setInteger("vendor.qti-ext-enc-qp-range.qp-p-max", JSONObjectProtectorUtils.getInt(jSONObject2, "qp_p_max"));
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
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("setup encode qp config error. qpCfg:");
                    sbLIZ2.append(str2);
                    AVLog.logKibana(6, "QcomClip", C2188811AlT.LIZIZ(sbLIZ2), e);
                }
            };
        }
        abstractC1282500jTk.LIZ(string, mediaFormat);
    }
}
