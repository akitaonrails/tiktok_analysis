package X;

import Y.ARunnableS0S1102100_20;
import Y.ARunnableS103S0100000_3;
import Y.ARunnableS120S0100000_20;
import Y.ARunnableS14S0101000_3;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.codec.DefaultAudioEncoderFactory;
import com.ss.ttlivestreamer.core.codec.DefaultVideoEncoderFactory;
import com.ss.ttlivestreamer.core.engine.MediaEncodeStream;
import com.ss.ttlivestreamer.core.engine.MediaEngineFactory;
import com.ss.ttlivestreamer.core.engine.VideoTrack;
import com.ss.ttlivestreamer.core.opengl.GlRenderDrawer;
import com.ss.ttlivestreamer.core.opengl.GlUtil;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThread;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0jBv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1271450jBv implements InterfaceC1270200j9u, InterfaceC1267880j6A {
    public C1270350jA9 LL;
    public VideoTrack LLILLJJLI;
    public MediaEncodeStream LLILLL;
    public DefaultVideoEncoderFactory LLILZ;
    public DefaultAudioEncoderFactory LLILZIL;
    public String[] LLILZLL;
    public TEBundle LLIZLLLIL;
    public C1271480jBy LLJ;
    public C1271460jBw LLJI;
    public GlRenderDrawer LLJIJIL;
    public boolean LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public float LLJJIII;
    public Handler LLJJIJI;
    public InterfaceC1271470jBx LLJJIJIIJIL;
    public boolean LLIZ = true;
    public final AtomicBoolean LLJJIJIL = new AtomicBoolean(false);
    public Bitmap LLJJJ = null;
    public Bitmap LLJJJIL = null;

    @Override // X.InterfaceC1270200j9u
    public final void LJIILIIL(int i, int i2, int i3, String str) {
    }

    public final ByteBuffer LIZIZ() {
        C1271460jBw c1271460jBw = this.LLJI;
        if (c1271460jBw == null) {
            return null;
        }
        c1271460jBw.LJ.position(0);
        c1271460jBw.LJFF.rewind();
        c1271460jBw.LJFF.limit(c1271460jBw.LJ.capacity());
        c1271460jBw.LJFF.put(c1271460jBw.LJ);
        c1271460jBw.LJFF.rewind();
        return c1271460jBw.LJFF;
    }

    @Override // X.InterfaceC1270200j9u
    public final void LJ() {
        AVLog.iod("VideoCatcher", "onVideoCaptureStopped");
    }

    @Override // X.InterfaceC1270200j9u
    public final void LJIIJ() {
        AVLog.iod("VideoCatcher", "onVideoCaptureStarted");
    }

    public final void LIZJ(VideoFrame videoFrame) {
        boolean z;
        if (this.LLJILJILJ == 0) {
            VideoFrame.Buffer buffer = videoFrame.getBuffer();
            if (!(buffer instanceof InterfaceC1271560jC6)) {
                InterfaceC1271470jBx interfaceC1271470jBx = this.LLJJIJIIJIL;
                if (interfaceC1271470jBx != null) {
                    interfaceC1271470jBx.onError(-4, "Video frame type not supported.");
                    return;
                }
                return;
            }
            int width = buffer.getWidth();
            int height = buffer.getHeight();
            if (width == this.LLJILLL && height == this.LLJJ) {
                if (this.LL != null) {
                    InterfaceC1271560jC6 interfaceC1271560jC6 = (InterfaceC1271560jC6) buffer;
                    EnumC1273550jFJ type = interfaceC1271560jC6.getType();
                    float[] fArrLIZIZ = C1273010jER.LIZIZ(interfaceC1271560jC6.getTransformMatrix());
                    C1270350jA9 c1270350jA9 = this.LL;
                    int textureId = interfaceC1271560jC6.getTextureId();
                    if (type == EnumC1273550jFJ.OES) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c1270350jA9.LLJIJIL(textureId, z, width, height, 0, fArrLIZIZ, videoFrame.getTimestampNs() / 1000, null, TimeUtils.currentTimeMs(), 0L);
                    return;
                }
                return;
            }
            InterfaceC1271470jBx interfaceC1271470jBx2 = this.LLJJIJIIJIL;
            if (interfaceC1271470jBx2 == null) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Video frame size (");
            sbLIZ.append(width);
            sbLIZ.append(", ");
            sbLIZ.append(height);
            sbLIZ.append(") does not match the init size (");
            sbLIZ.append(this.LLJILLL);
            sbLIZ.append(", ");
            sbLIZ.append(this.LLJJ);
            sbLIZ.append(")");
            interfaceC1271470jBx2.onError(-4, C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LJIIIIZZ(int i) {
        VideoTrack videoTrack;
        MediaEncodeStream mediaEncodeStream = this.LLILLL;
        if (mediaEncodeStream != null) {
            mediaEncodeStream.stop();
        }
        MediaEncodeStream mediaEncodeStream2 = this.LLILLL;
        if (mediaEncodeStream2 != null && (videoTrack = this.LLILLJJLI) != null) {
            mediaEncodeStream2.removeTrack(videoTrack);
        }
        C1271480jBy c1271480jBy = this.LLJ;
        if (c1271480jBy != null) {
            c1271480jBy.LLILZ = false;
            c1271480jBy.LLILZIL = i;
            synchronized (c1271480jBy.LLILLL) {
                try {
                    c1271480jBy.LLILLL.notifyAll();
                } finally {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            try {
                ThreadMethodProxy.join(c1271480jBy.LL, Mp4ScreenVideoLoadTimeout.CONTROL);
            } catch (Exception e) {
            }
            c1271480jBy.LL = null;
            this.LLJ = null;
        }
        TEBundle tEBundle = this.LLIZLLLIL;
        if (tEBundle != null) {
            tEBundle.release();
            this.LLIZLLLIL = null;
        }
        MediaEncodeStream mediaEncodeStream3 = this.LLILLL;
        if (mediaEncodeStream3 != null) {
            mediaEncodeStream3.registerObserver(null);
            this.LLILLL.release();
            this.LLILLL = null;
        }
        DefaultVideoEncoderFactory defaultVideoEncoderFactory = this.LLILZ;
        if (defaultVideoEncoderFactory != null) {
            defaultVideoEncoderFactory.release();
            this.LLILZ = null;
        }
        DefaultAudioEncoderFactory defaultAudioEncoderFactory = this.LLILZIL;
        if (defaultAudioEncoderFactory != null) {
            defaultAudioEncoderFactory.release();
            this.LLILZIL = null;
        }
        C1270350jA9 c1270350jA9 = this.LL;
        if (c1270350jA9 != null) {
            c1270350jA9.stop();
            this.LL.release();
            this.LL = null;
        }
        VideoTrack videoTrack2 = this.LLILLJJLI;
        if (videoTrack2 != null) {
            videoTrack2.release();
            this.LLILLJJLI = null;
        }
        C1271460jBw c1271460jBw = this.LLJI;
        if (c1271460jBw != null) {
            Handler handler = c1271460jBw.LJIIIZ.LLJJIJI;
            if (handler != null) {
                C786410Ut5.LJJZZIII(handler, new ARunnableS14S0101000_3(i, c1271460jBw, 6));
                SafeHandlerThread safeHandlerThread = c1271460jBw.LIZ;
                if (safeHandlerThread != null) {
                    C1273730jFb.LIZLLL(safeHandlerThread);
                    c1271460jBw.LIZ = null;
                }
                Bitmap bitmap = c1271460jBw.LIZLLL;
                if (bitmap != null) {
                    if (!bitmap.isRecycled()) {
                        C786410Ut5.LJJJJ(c1271460jBw.LIZLLL);
                        System.gc();
                    }
                    c1271460jBw.LIZLLL = null;
                }
                if (c1271460jBw.LJ != null) {
                    c1271460jBw.LJ = null;
                }
                c1271460jBw.LJII = 0;
                c1271460jBw.LJIIIIZZ = 0;
            }
            this.LLJI = null;
        }
        this.LLJJIJIL.set(false);
    }

    public final void LIZLLL(int i, int i2) {
        C1271460jBw c1271460jBw;
        boolean z = true;
        if (this.LLJILJILJ == 1 && (c1271460jBw = this.LLJI) != null) {
            this.LLJILLL = i;
            this.LLJJ = i2;
            try {
                synchronized (c1271460jBw.LJ) {
                    try {
                        c1271460jBw.LJIIIZ.LLJI.LIZ(i, i2);
                        GLES20.glReadPixels(0, 0, i, i2, 6408, 5121, c1271460jBw.LJ);
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                int iGlGetError = GLES20.glGetError();
                if (iGlGetError != 0 && AVLog.enableLogToIODevice2()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("glReadPixels error ");
                    sbLIZ.append(iGlGetError);
                    AVLog.logToIODevice2(6, "VideoCatcher", C2188811AlT.LIZIZ(sbLIZ), null, 65, 10000);
                }
                z = false;
            }
            try {
                synchronized (c1271460jBw.LJI) {
                    try {
                        c1271460jBw.LIZLLL.copyPixelsFromBuffer(c1271460jBw.LJ);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception th2) {
            }
            if (!TextUtils.isEmpty(c1271460jBw.LIZIZ)) {
                c1271460jBw.LIZ.post(new ARunnableS103S0100000_3(c1271460jBw, 69));
            }
            if (z && this.LLJJIJIIJIL != null) {
                C1271460jBw c1271460jBw2 = this.LLJI;
                ARunnableS120S0100000_20 aRunnableS120S0100000_20 = new ARunnableS120S0100000_20(this, 188);
                SafeHandlerThread safeHandlerThread = c1271460jBw2.LIZ;
                if (safeHandlerThread != null) {
                    safeHandlerThread.post(aRunnableS120S0100000_20);
                }
            }
        }
    }

    @Override // X.InterfaceC1270200j9u
    public final void LJI(int i, Exception exc) {
        InterfaceC1271470jBx interfaceC1271470jBx = this.LLJJIJIIJIL;
        if (interfaceC1271470jBx != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onVideoCaptureError: ");
            sbLIZ.append(i);
            sbLIZ.append(", ");
            sbLIZ.append(exc.toString());
            interfaceC1271470jBx.onError(-3, C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final byte[] LIZ(float f, int i, int i2) {
        try {
            ByteBuffer byteBufferLIZIZ = LIZIZ();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i * i2 * 4);
            int i3 = this.LLJILLL;
            int i4 = this.LLJJ;
            if (this.LLJILJIL) {
                C1271460jBw c1271460jBw = this.LLJI;
                i4 = 0;
                if (c1271460jBw != null) {
                    i3 = c1271460jBw.LJII;
                } else {
                    i3 = 0;
                }
                if (c1271460jBw != null) {
                    i4 = c1271460jBw.LJIIIIZZ;
                }
            }
            Bitmap bitmap = this.LLJJJ;
            if (bitmap == null || bitmap.getWidth() != i3 || this.LLJJJ.getHeight() != i4) {
                Bitmap bitmap2 = this.LLJJJ;
                if (bitmap2 != null) {
                    C786410Ut5.LJJJJ(bitmap2);
                }
                this.LLJJJ = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
            }
            this.LLJJJ.copyPixelsFromBuffer(byteBufferLIZIZ);
            Bitmap bitmap3 = this.LLJJJIL;
            if (bitmap3 == null || bitmap3.getWidth() != i || this.LLJJJIL.getHeight() != i2) {
                Bitmap bitmap4 = this.LLJJJIL;
                if (bitmap4 != null) {
                    C786410Ut5.LJJJJ(bitmap4);
                }
                this.LLJJJIL = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            }
            new Canvas(this.LLJJJIL).drawBitmap(this.LLJJJ, (Rect) null, new RectF(0.0f, 0.0f, i, i2), (Paint) null);
            this.LLJJJIL.compress(Bitmap.CompressFormat.JPEG, (int) (f * 100.0f), byteArrayOutputStream);
            try {
                byteArrayOutputStream.flush();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    public final void LJFF(InterfaceC1271560jC6 interfaceC1271560jC6, int i, int i2) {
        C1271460jBw c1271460jBw;
        if (interfaceC1271560jC6 != null && i > 0 && i2 > 0 && this.LLJILJILJ == 1 && (c1271460jBw = this.LLJI) != null) {
            this.LLJILLL = i;
            this.LLJJ = i2;
            int textureId = interfaceC1271560jC6.getTextureId();
            try {
                c1271460jBw.LJIIIZ.LLJI.LIZ(i, i2);
                C1271450jBv c1271450jBv = c1271460jBw.LJIIIZ;
                if (c1271450jBv.LLJIJIL == null) {
                    c1271450jBv.LLJIJIL = new GlRenderDrawer();
                }
                float[] fArr = null;
                C1271390jBp c1271390jBp = new C1271390jBp(null);
                c1271390jBp.LIZLLL(i, i2);
                GLES20.glBindFramebuffer(36160, c1271390jBp.LIZ);
                float f = c1271460jBw.LJIIIZ.LLJJIII;
                if (f == 90.0f || f == 180.0f || f == 270.0f) {
                    float[] fArrLJ = C1273010jER.LJ();
                    float[] fArr2 = new float[16];
                    Matrix.setRotateM(fArr2, 0, c1271460jBw.LJIIIZ.LLJJIII, 0.0f, 0.0f, 1.0f);
                    float f2 = fArr2[12] - ((fArr2[0] + fArr2[4]) * 0.5f);
                    fArr2[12] = f2;
                    float f3 = fArr2[13] - ((fArr2[1] + fArr2[5]) * 0.5f);
                    fArr2[13] = f3;
                    fArr2[12] = f2 + 0.5f;
                    fArr2[13] = f3 + 0.5f;
                    fArr = new float[16];
                    Matrix.multiplyMM(fArr, 0, fArrLJ, 0, fArr2, 0);
                }
                c1271460jBw.LJIIIZ.LLJIJIL.drawOes(textureId, null, fArr, 0, 0, i, i2);
                GLES20.glReadPixels(0, 0, i, i2, 6408, 5121, c1271460jBw.LJ);
                GlUtil.checkAnyGLES2Error("BUG");
                GLES20.glBindFramebuffer(36160, 0);
                c1271390jBp.LIZJ();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                int iGlGetError = GLES20.glGetError();
                if (iGlGetError != 0 && AVLog.enableLogToIODevice2()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("glReadPixels error ");
                    sbLIZ.append(iGlGetError);
                    AVLog.logToIODevice2(6, "VideoCatcher", C2188811AlT.LIZIZ(sbLIZ), null, 65, 10000);
                }
            }
            if (this.LLJJIJIIJIL != null) {
                C1271460jBw c1271460jBw2 = this.LLJI;
                ARunnableS120S0100000_20 aRunnableS120S0100000_20 = new ARunnableS120S0100000_20(this, 189);
                SafeHandlerThread safeHandlerThread = c1271460jBw2.LIZ;
                if (safeHandlerThread != null) {
                    safeHandlerThread.post(aRunnableS120S0100000_20);
                }
            }
        }
    }

    @Override // X.InterfaceC1267880j6A
    public final void onMediaEncodeStreamEvent(int i, int i2, long j, String str) {
        C786410Ut5.LJJZZIII(this.LLJJIJI, new ARunnableS0S1102100_20(this, j, i, i2, str, 2));
    }

    public final void LJII(int i, int i2, int i3, int i4, boolean z, String str, InterfaceC1271470jBx interfaceC1271470jBx, MediaEngineFactory mediaEngineFactory, Handler handler) {
        if (this.LLJJIJIL.get()) {
            if (interfaceC1271470jBx != null) {
                interfaceC1271470jBx.onError(-2, "Video catching already started.");
                return;
            }
            return;
        }
        this.LLJJIJIL.set(true);
        if (i2 > 0 && i3 > 0 && handler != null) {
            this.LLJILJILJ = i;
            this.LLJILLL = i2;
            this.LLJJ = i3;
            this.LLJJI = i4;
            this.LLJJIJIIJIL = interfaceC1271470jBx;
            this.LLJJIJI = handler;
            if (i == 0) {
                if (i4 > 0 && !TextUtils.isEmpty(str) && mediaEngineFactory != null) {
                    String str2 = null;
                    C1270350jA9 c1270350jA9 = new C1270350jA9(this, handler, null);
                    this.LL = c1270350jA9;
                    this.LLILLJJLI = mediaEngineFactory.createVideoTrack(c1270350jA9);
                    this.LLIZ = z;
                    this.LLILZ = new DefaultVideoEncoderFactory();
                    this.LLILZIL = new DefaultAudioEncoderFactory();
                    C1271480jBy c1271480jBy = new C1271480jBy(this);
                    this.LLJ = c1271480jBy;
                    MediaEncodeStream mediaEncodeStreamCreateMediaEncodeStream = mediaEngineFactory.createMediaEncodeStream(this.LLILZ, this.LLILZIL, c1271480jBy);
                    this.LLILLL = mediaEncodeStreamCreateMediaEncodeStream;
                    mediaEncodeStreamCreateMediaEncodeStream.registerObserver(this);
                    this.LLILLL.start();
                    MediaEncodeStream mediaEncodeStream = this.LLILLL;
                    if (mediaEncodeStream != null) {
                        if (this.LLIZLLLIL == null) {
                            this.LLIZLLLIL = mediaEncodeStream.getParameter();
                        }
                        if (this.LLILZLL == null) {
                            String strGetSupportedFormats = this.LLILZ.GetSupportedFormats();
                            if (strGetSupportedFormats != null) {
                                this.LLILZLL = strGetSupportedFormats.split(":");
                            } else {
                                throw new AndroidRuntimeException("Not found any valid video encoder");
                            }
                        }
                        if (this.LLIZ) {
                            for (String str3 : this.LLILZLL) {
                                if (str3.contains("video_enable_accelera=true") && str3.contains("video_type=video/avc")) {
                                    str2 = "video/avc";
                                }
                            }
                        }
                        if (str2 == null) {
                            str2 = "video/bytevc0";
                            AVLog.iow("VideoCatcher", C786410Ut5.j4("Hardware video encoder not found, use %s instead.", new Object[]{"video/bytevc0"}));
                            this.LLIZ = false;
                        }
                        this.LLIZLLLIL.setString("video_type", str2);
                        this.LLIZLLLIL.setBool("video_enable_accelera", this.LLIZ);
                        this.LLIZLLLIL.setInt("video_width", this.LLJILLL);
                        this.LLIZLLLIL.setInt("video_height", this.LLJJ);
                        this.LLIZLLLIL.setInt("video_profileLevel", 3);
                        this.LLIZLLLIL.setInt("video_fps", this.LLJJI);
                        this.LLIZLLLIL.setInt("video_gop", this.LLJJI * 2);
                        this.LLIZLLLIL.setInt("video_is_cbr", 1);
                        this.LLIZLLLIL.setInt("configuration_type", 1);
                        this.LLIZLLLIL.setBool("video_lossless_encode", true);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Dump all encodeStream config:");
                        sbLIZ.append(this.LLIZLLLIL.toString());
                        AVLog.iod("VideoCatcher", C2188811AlT.LIZIZ(sbLIZ));
                        this.LLILLL.setParameter(this.LLIZLLLIL);
                    }
                    this.LLJ.setupUrl(str);
                    this.LLILLL.addTrack(this.LLILLJJLI);
                    this.LL.LLJI(this.LLJILLL, this.LLJJ, this.LLJJI);
                    return;
                }
                if (interfaceC1271470jBx != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Param error: mode ");
                    sbLIZ2.append(i);
                    sbLIZ2.append(",fps ");
                    sbLIZ2.append(i4);
                    sbLIZ2.append(", outputPath ");
                    sbLIZ2.append(str);
                    sbLIZ2.append(", MediaEngineFactory ");
                    sbLIZ2.append(mediaEngineFactory);
                    interfaceC1271470jBx.onError(-1, C2188811AlT.LIZIZ(sbLIZ2));
                    return;
                }
                return;
            }
            C1271460jBw c1271460jBw = new C1271460jBw(this);
            this.LLJI = c1271460jBw;
            c1271460jBw.LIZ(this.LLJILLL, this.LLJJ);
            c1271460jBw.LIZIZ = str;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("PngShotThread_");
            sbLIZ3.append(c1271460jBw);
            SafeHandlerThread safeHandlerThreadLIZIZ = C1273730jFb.LIZIZ(0, C2188811AlT.LIZIZ(sbLIZ3));
            c1271460jBw.LIZ = safeHandlerThreadLIZIZ;
            safeHandlerThreadLIZIZ.start();
            if (!TextUtils.isEmpty(c1271460jBw.LIZIZ)) {
                c1271460jBw.LIZ.post(new ARunnableS120S0100000_20(c1271460jBw, 190));
                return;
            }
            return;
        }
        if (interfaceC1271470jBx != null) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("Param error: mode ");
            sbLIZ4.append(i);
            sbLIZ4.append(", width ");
            sbLIZ4.append(i2);
            sbLIZ4.append(", height ");
            sbLIZ4.append(i3);
            sbLIZ4.append(", handler ");
            sbLIZ4.append(handler);
            interfaceC1271470jBx.onError(-1, C2188811AlT.LIZIZ(sbLIZ4));
        }
    }
}
