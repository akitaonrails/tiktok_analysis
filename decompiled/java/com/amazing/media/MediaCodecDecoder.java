package com.amazing.media;

import X.C786410Ut5;
import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.os.Build;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.Range;
import android.view.Surface;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes21.dex */
public class MediaCodecDecoder implements SurfaceTexture.OnFrameAvailableListener {
    public static final Object LLJJJJJIL = new Object();
    public static final ArrayList<MediaCodecInfo> LLJJJJLIIL = new ArrayList<>();
    public boolean LLILLJJLI;
    public int LLILZ;
    public int LLILZIL;
    public ByteBuffer LLILZLL;
    public SurfaceTexture LLIZ;
    public Surface LLIZLLLIL;
    public boolean LLJ;
    public int LLJI;
    public MediaCodec LLJIJIL;
    public MediaFormat LLJILJIL;
    public BPEAHandler LLJJJ;
    public String LL = "video/avc";
    public int LLILLL = 28;
    public final MediaCodec.BufferInfo LLJILJILJ = new MediaCodec.BufferInfo();
    public volatile boolean LLJILLL = false;
    public final Object LLJJ = new Object();
    public boolean LLJJI = false;
    public volatile boolean LLJJIII = false;
    public volatile int LLJJIJI = 0;
    public volatile boolean LLJJIJIIJIL = false;
    public volatile boolean LLJJIJIL = false;
    public boolean LLJJJIL = false;
    public final AtomicInteger LLJJJJ = new AtomicInteger(0);

    public final void LIZIZ() {
        if (this.LLJIJIL != null) {
            if (this.LLJILLL) {
                try {
                    if (this.LLJJIII) {
                        this.LLJIJIL.flush();
                        this.LLJJIII = false;
                    }
                    this.LLJIJIL.stop();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                this.LLJILLL = false;
            }
            this.LLJIJIL.release();
            this.LLJIJIL = null;
        }
        this.LLJJIJI = 0;
        this.LLJJIJIIJIL = false;
        this.LLJJIJIL = false;
    }

    public final void LJIIJJI() {
        int i;
        ByteBuffer byteBuffer = this.LLILZLL;
        if (byteBuffer == null) {
            return;
        }
        if (174 != this.LLILLL) {
            this.LLJILJIL.setByteBuffer("csd-0", byteBuffer);
            return;
        }
        byteBuffer.rewind();
        ByteBuffer byteBuffer2 = null;
        ByteBuffer byteBuffer3 = null;
        ByteBuffer byteBuffer4 = null;
        while (this.LLILZLL.remaining() > 4 && (i = this.LLILZLL.getInt()) > 0 && this.LLILZLL.remaining() >= i) {
            byte[] bArr = new byte[2];
            this.LLILZLL.get(bArr);
            int i2 = (bArr[1] & 126) >> 1;
            ByteBuffer byteBuffer5 = this.LLILZLL;
            byteBuffer5.position(byteBuffer5.position() - 2);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
            this.LLILZLL.get(byteBufferAllocate.array());
            byteBufferAllocate.rewind();
            if (i2 == 32) {
                byteBuffer2 = byteBufferAllocate;
            } else if (i2 == 33) {
                byteBuffer3 = byteBufferAllocate;
            } else if (i2 == 34) {
                byteBuffer4 = byteBufferAllocate;
            }
        }
        if (byteBuffer2 != null) {
            this.LLJILJIL.setByteBuffer("csd-0", byteBuffer2);
        }
        if (byteBuffer3 != null) {
            this.LLJILJIL.setByteBuffer("csd-1", byteBuffer3);
        }
        if (byteBuffer4 != null) {
            this.LLJILJIL.setByteBuffer("csd-2", byteBuffer4);
        }
    }

    public int flushDecoder() {
        int i = -3;
        if (this.LLJIJIL != null) {
            try {
                if (this.LLJJIII) {
                    i = 0;
                    this.LLJJIJIIJIL = false;
                    this.LLJJIJIL = false;
                    this.LLJJIII = false;
                    this.LLJJIJI = 0;
                    this.LLJJJJ.set(0);
                    this.LLJIJIL.flush();
                    while (true) {
                        try {
                            int iDequeueOutputBuffer = this.LLJIJIL.dequeueOutputBuffer(this.LLJILJILJ, 0L);
                            if (iDequeueOutputBuffer == -1) {
                                break;
                            }
                            if (iDequeueOutputBuffer >= 0) {
                                this.LLJIJIL.releaseOutputBuffer(iDequeueOutputBuffer, false);
                            }
                        } catch (Exception e) {
                            e = e;
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }
            } catch (Exception e2) {
                e = e2;
                i = -3;
            }
        }
        return i;
    }

    public void releaseGLResources() {
        int i = this.LLJI;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
        }
        this.LLJ = false;
    }

    public final void LJIIL() {
        LIZIZ();
        BPEAHandler bPEAHandler = this.LLJJJ;
        if (bPEAHandler != null) {
            bPEAHandler.removeCallbacksAndMessages(null);
            SharedHandlerThread sharedHandlerThreadLIZ = SharedHandlerThread.LIZ();
            synchronized (sharedHandlerThreadLIZ) {
                int i = sharedHandlerThreadLIZ.LIZIZ - 1;
                sharedHandlerThreadLIZ.LIZIZ = i;
                if (i < 0) {
                    sharedHandlerThreadLIZ.LIZIZ = 0;
                } else if (i <= 0) {
                    HandlerThread handlerThread = sharedHandlerThreadLIZ.LIZ;
                    if (handlerThread == null || !handlerThread.isAlive()) {
                        sharedHandlerThreadLIZ.LIZ = null;
                    } else {
                        sharedHandlerThreadLIZ.LIZ.quitSafely();
                        sharedHandlerThreadLIZ.LIZ = null;
                    }
                }
            }
            this.LLJJJ = null;
        }
        Surface surface = this.LLIZLLLIL;
        if (surface != null) {
            surface.release();
            this.LLIZLLLIL = null;
        }
        SurfaceTexture surfaceTexture = this.LLIZ;
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener(null);
            this.LLIZ.release();
            this.LLIZ = null;
        }
    }

    public int closeDecoder() {
        LJIIL();
        return 0;
    }

    public static String LJFF(String str) {
        int codecCount;
        MediaCodecInfo codecInfoAt;
        String[] supportedTypes;
        MediaCodecRank mediaCodecRankLIZ;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList<MediaCodecRank> arrayList = new ArrayList();
        synchronized (LLJJJJJIL) {
            try {
                ArrayList<MediaCodecInfo> arrayList2 = LLJJJJLIIL;
                boolean z = !arrayList2.isEmpty();
                try {
                    if (z) {
                        codecCount = arrayList2.size();
                    } else {
                        codecCount = MediaCodecList.getCodecCount();
                    }
                    for (int i = 0; i < codecCount && (!z || arrayList.isEmpty()); i++) {
                        if (!z) {
                            codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                        } else {
                            codecInfoAt = LLJJJJLIIL.get(i);
                        }
                        String name = codecInfoAt.getName();
                        if (!codecInfoAt.isEncoder() && !name.startsWith("OMX.google") && !name.startsWith("c2.android") && (supportedTypes = codecInfoAt.getSupportedTypes()) != null) {
                            for (String str2 : supportedTypes) {
                                if (!TextUtils.isEmpty(str2)) {
                                    if (!z && str2.startsWith("video/")) {
                                        LLJJJJLIIL.add(codecInfoAt);
                                    }
                                    if (str2.equalsIgnoreCase(str) && ((name.startsWith("OMX.") || name.startsWith("c2.")) && !name.startsWith("OMX.pv") && !name.startsWith("OMX.ittiam") && !name.contains("ffmpeg") && !name.contains("avcodec") && !name.contains("secure") && (mediaCodecRankLIZ = MediaCodecRank.LIZ(codecInfoAt, str)) != null && mediaCodecRankLIZ.LIZIZ != 20)) {
                                        arrayList.add(mediaCodecRankLIZ);
                                    }
                                }
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return null;
                    }
                    MediaCodecRank mediaCodecRank = (MediaCodecRank) arrayList.get(0);
                    for (MediaCodecRank mediaCodecRank2 : arrayList) {
                        if (mediaCodecRank2.LIZIZ > mediaCodecRank.LIZIZ) {
                            mediaCodecRank = mediaCodecRank2;
                        }
                    }
                    return mediaCodecRank.LIZ.getName();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static MediaCodecInfo LJI(String str) {
        try {
            MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
            if (codecInfos != null && codecInfos.length != 0) {
                for (MediaCodecInfo mediaCodecInfo : codecInfos) {
                    if (mediaCodecInfo != null && !mediaCodecInfo.isEncoder()) {
                        String name = mediaCodecInfo.getName();
                        if (!name.startsWith("OMX.google.") && !name.startsWith("OMX.Nvidia.") && !name.equals("OMX.TI.DUCATI1.VIDEO.H264E")) {
                            for (String str2 : mediaCodecInfo.getSupportedTypes()) {
                                if (str2.equalsIgnoreCase(str)) {
                                    return mediaCodecInfo;
                                }
                            }
                        }
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public final boolean LJIIJ(MediaCodecInfo mediaCodecInfo) {
        Range<Integer> range;
        int i;
        Range<Integer> supportedWidths = mediaCodecInfo.getCapabilitiesForType(this.LL).getVideoCapabilities().getSupportedWidths();
        Range<Integer> supportedHeights = mediaCodecInfo.getCapabilitiesForType(this.LL).getVideoCapabilities().getSupportedHeights();
        if (((Integer) supportedWidths.getUpper()).intValue() < ((Integer) supportedHeights.getUpper()).intValue()) {
            range = supportedWidths;
        } else {
            range = supportedHeights;
        }
        if (((Integer) supportedWidths.getUpper()).intValue() <= ((Integer) supportedHeights.getUpper()).intValue()) {
            supportedWidths = supportedHeights;
        }
        int i2 = this.LLILZ;
        int i3 = this.LLILZIL;
        if (i2 < i3) {
            i = i2;
        } else {
            i = i3;
        }
        if (i2 <= i3) {
            i2 = i3;
        }
        if (range.contains(Integer.valueOf(i)) && supportedWidths.contains(Integer.valueOf(i2))) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this.LLJJ) {
            try {
                this.LLJJI = true;
                this.LLJJ.notifyAll();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public int renderFrame(float[] fArr) {
        int i;
        if (this.LLJJJJ.get() <= 0) {
            return 0;
        }
        this.LLJJJJ.decrementAndGet();
        if (!this.LLJ) {
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            int i2 = iArr[0];
            if (i2 <= 0) {
                i = 0;
            } else {
                GLES20.glBindTexture(36197, i2);
                GLES20.glTexParameterf(36197, 10241, 9728.0f);
                GLES20.glTexParameterf(36197, 10240, 9729.0f);
                GLES20.glTexParameteri(36197, 10242, 33071);
                GLES20.glTexParameteri(36197, 10243, 33071);
                i = iArr[0];
            }
            this.LLJI = i;
            this.LLIZ.detachFromGLContext();
            this.LLIZ.attachToGLContext(this.LLJI);
            this.LLJ = true;
        }
        synchronized (this.LLJJ) {
            do {
                try {
                    if (!this.LLJJI) {
                        try {
                            this.LLJJ.wait(500);
                        } catch (InterruptedException e) {
                            TryCatchGuardChecker.doCheck(e);
                            return -103;
                        }
                    } else {
                        this.LLJJI = false;
                        SurfaceTexture surfaceTexture = this.LLIZ;
                        if (surfaceTexture != null) {
                            surfaceTexture.updateTexImage();
                            this.LLIZ.getTransformMatrix(fArr);
                        }
                        return this.LLJI;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            } while (this.LLJJI);
            return -103;
        }
    }

    public static String LJIIIIZZ(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, str2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return str2;
        }
    }

    public static boolean LJIIIZ(String str, int i, int i2) {
        MediaCodecInfo mediaCodecInfoLJI = LJI(str);
        if (mediaCodecInfoLJI == null) {
            return false;
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : mediaCodecInfoLJI.getCapabilitiesForType(str).profileLevels) {
            if (codecProfileLevel.profile == i && codecProfileLevel.level >= i2) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
    
        r1 = r19.LLJIJIL.getInputBuffer(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
    
        if (r21 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        r19.LLJIJIL.queueInputBuffer(r13, 0, 0, 0, 4);
        r19.LLJJIJIIJIL = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0070, code lost:
    
        if (r1.capacity() >= r21) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0072, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0073, code lost:
    
        r1.put(r20);
        r14 = 0;
        r19.LLJIJIL.queueInputBuffer(r13, 0, r21, r22, 0);
        r19.LLJJIII = true;
        r19.LLJJIJI++;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LIZLLL(java.nio.ByteBuffer r20, int r21, long r22, long r24, long r26, long[] r28) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazing.media.MediaCodecDecoder.LIZLLL(java.nio.ByteBuffer, int, long, long, long, long[]):int");
    }

    public int decodeFrame(ByteBuffer byteBuffer, int i, long j, long j2, long j3, long[] jArr) {
        int iLIZLLL = -2;
        if (this.LLJIJIL == null) {
            return -2;
        }
        try {
            iLIZLLL = LIZLLL(byteBuffer, i, j, j2, j3, jArr);
            return iLIZLLL;
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            return iLIZLLL;
        }
    }

    public int initDecoder(int i, int i2, ByteBuffer byteBuffer, int i3, int i4, boolean z) {
        this.LLILLJJLI = z;
        boolean z2 = true;
        if (174 == i4) {
            String strLJIIIIZZ = LJIIIIZZ("ro.board.platform", null);
            if (Build.VERSION.SDK_INT == 26 && strLJIIIIZZ != null && (strLJIIIIZZ.startsWith("kirin960") || strLJIIIIZZ.startsWith("hi3660"))) {
                try {
                    if (CastDoubleProtector.parseDouble(LJIIIIZZ("ro.config.hw_codec_support", "0.0")) < 0.18041d) {
                        return -5;
                    }
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return -5;
                }
            }
            String lowerCase = Build.HARDWARE.toLowerCase(Locale.US);
            if (lowerCase.startsWith("mt6763") || lowerCase.startsWith("mt6757") || lowerCase.startsWith("mt6739") || lowerCase.startsWith("mt6750")) {
                return -5;
            }
        }
        this.LLILZ = i;
        this.LLILZIL = i2;
        this.LLILZLL = null;
        this.LLILLL = i4;
        if (i4 != 2) {
            if (i4 != 13) {
                if (i4 != 28) {
                    if (i4 != 140) {
                        if (i4 != 168) {
                            if (i4 == 174) {
                                this.LL = "video/hevc";
                            }
                        } else {
                            this.LL = "video/x-vnd.on2.vp9";
                        }
                    } else {
                        this.LL = "video/x-vnd.on2.vp8";
                    }
                } else {
                    this.LL = "video/avc";
                }
            } else {
                this.LL = "video/mp4v-es";
            }
        } else {
            this.LL = "video/mpeg2";
        }
        if (i3 > 0) {
            this.LLILZLL = byteBuffer;
        }
        try {
            MediaCodecInfo mediaCodecInfoLJI = LJI(this.LL);
            if (mediaCodecInfoLJI == null) {
                return -2;
            }
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoLJI.getCapabilitiesForType(this.LL);
            MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
            if (this.LLILLL == 28) {
                capabilitiesForType.isFeatureSupported("adaptive-playback");
                if (this.LLILLJJLI && !LJIIIZ(this.LL, 16, 0)) {
                    return -5;
                }
            }
            int i5 = this.LLILLL;
            if (i5 != 28 && i5 != 174 && !videoCapabilities.isSizeSupported(this.LLILZ, this.LLILZIL)) {
                return -3;
            }
            this.LLJILJIL = MediaFormat.createVideoFormat(this.LL, this.LLILZ, this.LLILZIL);
            LJIIIZ("video/hevc", 2, 16384);
            LJIIJJI();
            int i6 = this.LLILLL;
            if (174 != i6) {
                if (28 == i6) {
                    this.LLJILJIL.setInteger("max-input-size", ((((this.LLILZ + 15) / 16) * (this.LLILZIL + 15)) / 16) * 16 * 16);
                }
            } else {
                this.LLJILJIL.setInteger("max-input-size", this.LLILZ * this.LLILZIL);
            }
            if (174 == this.LLILLL) {
                if (!LJIIJ(mediaCodecInfoLJI)) {
                    return -5;
                }
            }
            LJIIL();
            if (this.LLJIJIL == null) {
                try {
                    this.LLIZ = new SurfaceTexture(0);
                    SharedHandlerThread.LIZ().LIZIZ();
                    BPEAHandler bPEAHandler = new BPEAHandler(C786410Ut5.W2(SharedHandlerThread.LIZ().LIZ));
                    this.LLJJJ = bPEAHandler;
                    this.LLIZ.setOnFrameAvailableListener(this, bPEAHandler);
                    this.LLIZ.setDefaultBufferSize(this.LLILZ, this.LLILZIL);
                    this.LLIZLLLIL = new Surface(this.LLIZ);
                    try {
                        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(LJFF(this.LL));
                        this.LLJIJIL = mediaCodecCreateByCodecName;
                        mediaCodecCreateByCodecName.configure(this.LLJILJIL, this.LLIZLLLIL, (MediaCrypto) null, 0);
                        this.LLJIJIL.start();
                        this.LLJILLL = true;
                        return 0;
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        if (e2.getMessage() == null || !e2.getMessage().contains("0xffffec77")) {
                            z2 = false;
                        }
                        this.LLJJJIL = z2;
                        LIZIZ();
                        LJIIL();
                        if (this.LLJJJIL) {
                            this.LLJJJIL = false;
                            return -104;
                        }
                        return -1;
                    }
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    LJIIL();
                    return -1;
                }
            }
            return -1;
        } catch (Exception e4) {
            TryCatchGuardChecker.doCheck(e4);
            return -4;
        }
    }
}
