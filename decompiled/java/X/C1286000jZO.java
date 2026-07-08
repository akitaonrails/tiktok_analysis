package X;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.text.TextUtils;
import android.util.Range;
import android.view.Surface;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.canvas.recorder.MediaRecorder;
import com.lynx.tasm.utils.EnvUtils;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0jZO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1286000jZO implements InterfaceC1286120jZa {
    public static final String[] LJJIL = {"c2.android.avc.encoder"};
    public InterfaceC1286130jZb LIZ;
    public String LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public boolean LJIIJ;
    public String LJIIL;
    public String LJIILIIL;
    public Surface LJIILJJIL;
    public MediaCodec.BufferInfo LJIILL;
    public MediaCodec.BufferInfo LJIILLIIL;
    public MediaCodec LJIIZILJ;
    public MediaCodec LJIJ;
    public MediaMuxer LJIJI;
    public boolean LJIJJ;
    public boolean LJIJJLI;
    public boolean LJIL;
    public boolean LJJ;
    public long LJJI;
    public long LJJIFFI;
    public int LJJII;
    public int LJJIII;
    public int LJJIIJ;
    public int LJJIIJZLJL;
    public long LJJIIZ;
    public long LJJIIZI;
    public long LJJIJ;
    public long LJJIJIIJI;
    public long[] LJJIJIIJIL;
    public final InterfaceC1286150jZd LJJIJL;
    public final InterfaceC1286140jZc LJJIJLIJ;
    public String LJIIJJI = "";
    public final ArrayList<String> LJJIJIL = new ArrayList<>();

    public final void LJIIIIZZ() {
        LJIILJJIL(true);
        C1286070jZV c1286070jZVLJII = LJII();
        this.LJIIL = c1286070jZVLJII.LIZ;
        this.LJIILIIL = c1286070jZVLJII.LIZIZ;
        this.LJIJI = new MediaMuxer(this.LJIIL, 0);
    }

    public final synchronized void LJIIZILJ() {
        this.LJIJJLI = false;
        if (this.LJIL) {
            this.LJIL = false;
        }
    }

    public final void LJ() {
        ByteBuffer[] outputBuffers;
        MediaCodec mediaCodec = this.LJIJ;
        if (mediaCodec == null || (outputBuffers = mediaCodec.getOutputBuffers()) == null) {
            return;
        }
        while (true) {
            int iDequeueOutputBuffer = this.LJIJ.dequeueOutputBuffer(this.LJIILLIIL, 0L);
            if (iDequeueOutputBuffer >= 0) {
                ByteBuffer byteBuffer = outputBuffers[iDequeueOutputBuffer];
                if (byteBuffer == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("encoderOutputBuffer ");
                    sbLIZ.append(iDequeueOutputBuffer);
                    sbLIZ.append(" was null");
                    throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
                }
                MediaCodec.BufferInfo bufferInfo = this.LJIILLIIL;
                if ((bufferInfo.flags & 2) != 0) {
                    bufferInfo.size = 0;
                }
                if (this.LJIJJ && bufferInfo.size != 0) {
                    byteBuffer.position(bufferInfo.offset);
                    MediaCodec.BufferInfo bufferInfo2 = this.LJIILLIIL;
                    byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
                    this.LJIJI.writeSampleData(this.LJJIIJ, byteBuffer, this.LJIILLIIL);
                }
                this.LJIJ.releaseOutputBuffer(iDequeueOutputBuffer, false);
            } else {
                if (iDequeueOutputBuffer == -1) {
                    return;
                }
                if (iDequeueOutputBuffer == -3) {
                    outputBuffers = this.LJIJ.getOutputBuffers();
                } else if (iDequeueOutputBuffer == -2) {
                    LJIILLIIL(true);
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("unexpected result from encoder.dequeueOutputBuffer: ");
                    sbLIZ2.append(iDequeueOutputBuffer);
                    C1288370jdD.LIZJ("KryptonMediaRecorder", C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
        }
    }

    public final C1286070jZV LJII() {
        String str;
        File fileCreateTempFile;
        this.LJJIJLIJ.getClass();
        C1286070jZV c1286070jZV = new C1286070jZV();
        try {
            if (c1286070jZV.LIZ != null) {
                fileCreateTempFile = new C0VSJ(c1286070jZV.LIZ);
            } else {
                C1286100jZY c1286100jZY = (C1286100jZY) this.LJJIJLIJ;
                String str2 = c1286100jZY.LIZ.LIZJ;
                String cacheDir = (str2 == null || str2.length() <= 0) ? EnvUtils.getCacheDir() : c1286100jZY.LIZ.LIZJ;
                if (cacheDir == null) {
                    throw new Exception("Should specify a video directory with getVideoDirectory method.");
                }
                fileCreateTempFile = File.createTempFile("krypton", ".mp4", new C0VSJ(cacheDir));
            }
            if (fileCreateTempFile.exists()) {
                fileCreateTempFile.delete();
            }
            c1286070jZV.LIZ = fileCreateTempFile.getPath();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1288370jdD.LIZLLL("KryptonMediaRecorder", e.getLocalizedMessage());
            c1286070jZV.LIZ = null;
        }
        if (c1286070jZV.LIZIZ == null && (str = c1286070jZV.LIZ) != null) {
            c1286070jZV.LIZIZ = "file://".concat(str);
        }
        return c1286070jZV;
    }

    public final void LJIIJJI() {
        this.LJIILLIIL = new MediaCodec.BufferInfo();
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", "audio/mp4a-latm");
        mediaFormat.setInteger("aac-profile", 2);
        mediaFormat.setInteger("sample-rate", this.LJIIIZ);
        mediaFormat.setInteger("channel-count", this.LJIIIIZZ);
        mediaFormat.setInteger("bitrate", this.LJII);
        mediaFormat.setInteger("max-input-size", 32768);
        LJIILIIL(true);
        MediaCodec mediaCodecLJI = LJI(mediaFormat);
        this.LJIJ = mediaCodecLJI;
        mediaCodecLJI.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
        this.LJIJ.start();
    }

    public final void LJIIL() {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        int i;
        Range<Integer> supportedFrameRates;
        Range<Integer> bitrateRange;
        int i2;
        int i3;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.VideoCapabilities videoCapabilities2;
        this.LJIILL = new MediaCodec.BufferInfo();
        LJIILL(true);
        if (this.LJIIJ) {
            MediaCodec mediaCodecLJI = LJI(MediaFormat.createVideoFormat("video/avc", 640, 480));
            this.LJIIZILJ = mediaCodecLJI;
            MediaCodecInfo.CodecCapabilities capabilitiesForType2 = mediaCodecLJI.getCodecInfo().getCapabilitiesForType(this.LIZIZ);
            if (capabilitiesForType2 == null || (videoCapabilities2 = capabilitiesForType2.getVideoCapabilities()) == null) {
                iIntValue = 176;
                iIntValue2 = 1920;
                iIntValue3 = 144;
                iIntValue4 = 1080;
                i = 4;
                supportedFrameRates = null;
                bitrateRange = null;
            } else {
                int widthAlignment = videoCapabilities2.getWidthAlignment() > 4 ? videoCapabilities2.getWidthAlignment() : 4;
                heightAlignment = videoCapabilities2.getHeightAlignment() > 4 ? videoCapabilities2.getHeightAlignment() : 4;
                supportedFrameRates = videoCapabilities2.getSupportedFrameRates();
                bitrateRange = videoCapabilities2.getBitrateRange();
                Range<Integer> supportedWidths = videoCapabilities2.getSupportedWidths();
                Range<Integer> supportedHeights = videoCapabilities2.getSupportedHeights();
                iIntValue = ((Integer) supportedWidths.getLower()).intValue();
                iIntValue2 = ((Integer) supportedWidths.getUpper()).intValue();
                iIntValue3 = ((Integer) supportedHeights.getLower()).intValue();
                iIntValue4 = ((Integer) supportedHeights.getUpper()).intValue();
                i = heightAlignment;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("widthRange(");
                sbLIZ.append(iIntValue);
                sbLIZ.append(",");
                sbLIZ.append(iIntValue2);
                sbLIZ.append("),heightRange(");
                sbLIZ.append(iIntValue3);
                sbLIZ.append(",");
                sbLIZ.append(iIntValue4);
                sbLIZ.append("),frameRateRange(");
                sbLIZ.append(supportedFrameRates.getLower());
                sbLIZ.append(",");
                sbLIZ.append(supportedFrameRates.getUpper());
                sbLIZ.append("),bitRateRange(");
                sbLIZ.append(bitrateRange.getLower());
                sbLIZ.append(",");
                sbLIZ.append(bitrateRange.getUpper());
                sbLIZ.append(")");
                this.LJIIJJI = C2188811AlT.LIZIZ(sbLIZ);
                heightAlignment = widthAlignment;
            }
            int i4 = this.LIZJ;
            int i5 = this.LIZLLL;
            if (i4 < i5) {
                i2 = iIntValue2;
                iIntValue2 = iIntValue4;
                i3 = iIntValue3;
                iIntValue3 = iIntValue;
            } else {
                i2 = iIntValue4;
                i3 = iIntValue;
            }
            if (i4 > iIntValue2 || i5 > i2) {
                int i6 = i4 * i2;
                int i7 = i5 * iIntValue2;
                if (i6 > i7) {
                    if (i4 <= 0) {
                        i4 = 1;
                    }
                    i5 = i7 / i4;
                    i4 = iIntValue2;
                } else {
                    if (i5 <= 0) {
                        i5 = 1;
                    }
                    i4 = i6 / i5;
                    i5 = i2;
                }
            }
            if (i4 % heightAlignment != 0) {
                i4 = (i4 / heightAlignment) * heightAlignment;
            }
            if (i5 % i != 0) {
                i5 = (i5 / i) * i;
            }
            int iLJIJ = LJIJ(i4, null, i3, iIntValue2);
            int iLJIJ2 = LJIJ(i5, null, iIntValue3, i2);
            int iLJIJ3 = LJIJ(this.LJFF, supportedFrameRates, 0, 960);
            int iLJIJ4 = LJIJ(this.LJ, bitrateRange, 280000, 30000000);
            if (this.LIZJ != iLJIJ || this.LIZLLL != iLJIJ2 || this.LJFF != iLJIJ3 || this.LJ != iLJIJ4) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("adjust video config to width: ");
                sbLIZ2.append(iLJIJ);
                sbLIZ2.append(", height: ");
                sbLIZ2.append(iLJIJ2);
                sbLIZ2.append(", bps: ");
                sbLIZ2.append(iLJIJ4);
                sbLIZ2.append(", fps: ");
                sbLIZ2.append(iLJIJ3);
                sbLIZ2.append(" from original width: ");
                sbLIZ2.append(this.LIZJ);
                sbLIZ2.append(", height: ");
                sbLIZ2.append(this.LIZLLL);
                sbLIZ2.append(", bps: ");
                sbLIZ2.append(this.LJ);
                sbLIZ2.append(", fps: ");
                sbLIZ2.append(this.LJFF);
                sbLIZ2.append(", range:");
                sbLIZ2.append(this.LJIIJJI);
                C1288370jdD.LIZJ("KryptonMediaRecorder", C2188811AlT.LIZIZ(sbLIZ2));
                this.LIZJ = iLJIJ;
                this.LIZLLL = iLJIJ2;
                this.LJFF = iLJIJ3;
                this.LJ = iLJIJ4;
            }
            MediaCodec mediaCodec = this.LJIIZILJ;
            int i8 = this.LIZJ;
            int i9 = this.LIZLLL;
            if (mediaCodec == null || (capabilitiesForType = mediaCodec.getCodecInfo().getCapabilitiesForType("video/avc")) == null || (videoCapabilities = capabilitiesForType.getVideoCapabilities()) == null || !videoCapabilities.isSizeSupported(i8, i9)) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("release encoder which do not supported size (");
                sbLIZ3.append(this.LIZJ);
                sbLIZ3.append(", ");
                sbLIZ3.append(this.LIZLLL);
                sbLIZ3.append(")");
                C1288370jdD.LIZJ("KryptonMediaRecorder", C2188811AlT.LIZIZ(sbLIZ3));
                LJIILL(true);
            }
            this.LJIIJ = false;
        }
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat("video/avc", this.LIZJ, this.LIZLLL);
        mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
        mediaFormatCreateVideoFormat.setInteger("bitrate", this.LJ);
        mediaFormatCreateVideoFormat.setInteger("frame-rate", this.LJFF);
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 1);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("create format width: ");
        sbLIZ4.append(this.LIZJ);
        sbLIZ4.append(", height: ");
        sbLIZ4.append(this.LIZLLL);
        sbLIZ4.append(", bps: ");
        sbLIZ4.append(this.LJ);
        sbLIZ4.append(", fps: ");
        sbLIZ4.append(this.LJFF);
        C1288370jdD.LIZJ("KryptonMediaRecorder", C2188811AlT.LIZIZ(sbLIZ4));
        if (this.LJIIZILJ == null) {
            this.LJIIZILJ = LJI(mediaFormatCreateVideoFormat);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(" find encoder for size (");
            sbLIZ5.append(this.LIZJ);
            sbLIZ5.append(", ");
            sbLIZ5.append(this.LIZLLL);
            sbLIZ5.append(")");
            C1288370jdD.LIZJ("KryptonMediaRecorder", C2188811AlT.LIZIZ(sbLIZ5));
        } else {
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append(" reuse the encoder found with dummy format for size (");
            sbLIZ6.append(this.LIZJ);
            sbLIZ6.append(", ");
            sbLIZ6.append(this.LIZLLL);
            sbLIZ6.append(")");
            C1288370jdD.LIZJ("KryptonMediaRecorder", C2188811AlT.LIZIZ(sbLIZ6));
        }
        this.LJIIZILJ.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
        this.LJIILJJIL = this.LJIIZILJ.createInputSurface();
        this.LJIIZILJ.start();
    }

    public static long LIZIZ() {
        long jNanoTime = System.nanoTime();
        return (System.currentTimeMillis() * 1000) + ((jNanoTime - ((jNanoTime / 1000000) * 1000000)) / 1000);
    }

    public static void LIZJ(String str) {
        try {
            C0VSJ c0vsj = new C0VSJ(str);
            if (c0vsj.exists() && c0vsj.isFile()) {
                if (c0vsj.delete()) {
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("delete file error for ");
                sbLIZ.append(str);
                C1288370jdD.LIZIZ("KryptonMediaRecorder", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("delete file error for ");
            sbLIZ2.append(str);
            sbLIZ2.append(", file not exists");
            C1288370jdD.LIZIZ("KryptonMediaRecorder", C2188811AlT.LIZIZ(sbLIZ2));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("delete file error for ");
            sbLIZ3.append(str);
            sbLIZ3.append(" exception ");
            sbLIZ3.append(th.toString());
            C1288370jdD.LIZIZ("KryptonMediaRecorder", C2188811AlT.LIZIZ(sbLIZ3));
        }
    }

    public static MediaCodec LJI(MediaFormat mediaFormat) {
        boolean z = false;
        String strFindEncoderForFormat = new MediaCodecList(0).findEncoderForFormat(mediaFormat);
        if (!TextUtils.isEmpty(strFindEncoderForFormat)) {
            String[] strArr = LJJIL;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (TextUtils.equals(strArr[i], strFindEncoderForFormat)) {
                    z = true;
                    break;
                }
                i++;
            }
            if (!z) {
                try {
                    return MediaCodec.createByCodecName(strFindEncoderForFormat);
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("createByCodecName ");
                    sbLIZ.append(strFindEncoderForFormat);
                    sbLIZ.append(" exception ");
                    sbLIZ.append(e.getMessage());
                    C1288370jdD.LIZLLL("KryptonMediaRecorder", C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        }
        return MediaCodec.createEncoderByType(mediaFormat.getString("mime"));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void LIZLLL(boolean r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.LJIIZILJ()     // Catch: java.lang.Throwable -> L4c
            X.0jZc r0 = r3.LJJIJLIJ     // Catch: java.lang.Throwable -> L4c
            X.0jZY r0 = (X.C1286100jZY) r0     // Catch: java.lang.Throwable -> L4c
            r0.getClass()     // Catch: java.lang.Throwable -> L4c
            X.0jZT r2 = X.EnumC1286050jZT.USER_DEFINED     // Catch: java.lang.Throwable -> L4c
            if (r2 == 0) goto L24
            int[] r1 = X.C1286040jZS.LIZ     // Catch: java.lang.Throwable -> L4c
            X.0jZc r0 = r3.LJJIJLIJ     // Catch: java.lang.Throwable -> L4c
            X.0jZY r0 = (X.C1286100jZY) r0     // Catch: java.lang.Throwable -> L4c
            r0.getClass()     // Catch: java.lang.Throwable -> L4c
            int r0 = r2.ordinal()     // Catch: java.lang.Throwable -> L4c
            r1 = r1[r0]     // Catch: java.lang.Throwable -> L4c
            r0 = 1
            if (r1 == r0) goto L26
            r0 = 2
            if (r1 == r0) goto L43
        L24:
            if (r4 == 0) goto L43
        L26:
            java.lang.String r1 = "KryptonMediaRecorder"
            java.lang.String r0 = "Media recorder destroy with video files deleted"
            X.C1288370jdD.LIZJ(r1, r0)     // Catch: java.lang.Throwable -> L4c
            java.util.ArrayList<java.lang.String> r0 = r3.LJJIJIL     // Catch: java.lang.Throwable -> L4c
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L4c
        L33:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L4a
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L4c
            LIZJ(r0)     // Catch: java.lang.Throwable -> L4c
            goto L33
        L43:
            java.lang.String r1 = "KryptonMediaRecorder"
            java.lang.String r0 = "Media recorder destroy with 1 video files not deleted"
            X.C1288370jdD.LIZJ(r1, r0)     // Catch: java.lang.Throwable -> L4c
        L4a:
            monitor-exit(r3)
            return
        L4c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1286000jZO.LIZLLL(boolean):void");
    }

    public final void LJFF(boolean z) {
        ByteBuffer[] outputBuffers;
        long jLIZIZ;
        MediaCodec mediaCodec = this.LJIIZILJ;
        if (mediaCodec == null || (outputBuffers = mediaCodec.getOutputBuffers()) == null) {
            return;
        }
        while (true) {
            int iDequeueOutputBuffer = this.LJIIZILJ.dequeueOutputBuffer(this.LJIILL, 0L);
            if (iDequeueOutputBuffer < 0) {
                if (iDequeueOutputBuffer != -3) {
                    if (iDequeueOutputBuffer != -2) {
                        if (iDequeueOutputBuffer != -1) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("unexpected result from encoder.dequeueOutputBuffer: ");
                            sbLIZ.append(iDequeueOutputBuffer);
                            C1288370jdD.LIZLLL("KryptonMediaRecorder", C2188811AlT.LIZIZ(sbLIZ));
                        } else if (!z) {
                            return;
                        }
                    } else {
                        LJIILLIIL(false);
                    }
                } else {
                    outputBuffers = this.LJIIZILJ.getOutputBuffers();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("encoder output buffer length:");
                    sbLIZ2.append(outputBuffers.length);
                    C1288370jdD.LIZJ("KryptonMediaRecorder", C2188811AlT.LIZIZ(sbLIZ2));
                }
            } else {
                ByteBuffer byteBuffer = outputBuffers[iDequeueOutputBuffer];
                if (byteBuffer != null) {
                    MediaCodec.BufferInfo bufferInfo = this.LJIILL;
                    if ((bufferInfo.flags & 2) != 0) {
                        bufferInfo.size = 0;
                    }
                    if (this.LJIJJ && bufferInfo.size > 0) {
                        byteBuffer.position(bufferInfo.offset);
                        MediaCodec.BufferInfo bufferInfo2 = this.LJIILL;
                        byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
                        MediaCodec.BufferInfo bufferInfo3 = this.LJIILL;
                        synchronized (this) {
                            if (this.LJJ && this.LJJIFFI != 0) {
                                jLIZIZ = this.LJJI;
                            } else {
                                jLIZIZ = (LIZIZ() - this.LJJIJIIJI) - this.LJJIIZI;
                            }
                        }
                        bufferInfo3.presentationTimeUs = jLIZIZ;
                        if (!this.LJIJJLI) {
                            MediaCodec.BufferInfo bufferInfo4 = this.LJIILL;
                            long j = bufferInfo4.presentationTimeUs;
                            long j2 = this.LJJIJ;
                            if (j <= j2) {
                                bufferInfo4.presentationTimeUs = j2 + 8000;
                            }
                            this.LJJIJ = bufferInfo4.presentationTimeUs;
                            this.LJIJI.writeSampleData(this.LJJIIJZLJL, byteBuffer, bufferInfo4);
                        }
                    }
                    this.LJIIZILJ.releaseOutputBuffer(iDequeueOutputBuffer, false);
                    if ((this.LJIILL.flags & 4) != 0) {
                        if (!z) {
                            C1288370jdD.LIZLLL("KryptonMediaRecorder", "reached end of stream unexpectedly");
                            return;
                        }
                        return;
                    }
                } else {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("encoderOutputBuffer ");
                    sbLIZ3.append(iDequeueOutputBuffer);
                    sbLIZ3.append(" was null");
                    throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ3));
                }
            }
        }
    }

    public final void LJIIJ(String str) {
        String str2 = this.LJIIL;
        synchronized (this) {
            if (str2 != null) {
                LIZJ(str2);
            }
        }
        InterfaceC1286130jZb interfaceC1286130jZb = this.LIZ;
        if (interfaceC1286130jZb != null) {
            ((MediaRecorder) interfaceC1286130jZb).LJFF(str);
        }
    }

    public final void LJIILIIL(boolean z) {
        MediaCodec mediaCodec = this.LJIJ;
        if (mediaCodec == null) {
            return;
        }
        try {
            try {
                mediaCodec.stop();
                this.LJIJ.release();
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("releaseAudioMediaCodecEncoder exception ");
                sbLIZ.append(e.toString());
                C1288370jdD.LIZIZ("KryptonMediaRecorder", C2188811AlT.LIZIZ(sbLIZ));
                if (!z) {
                    throw e;
                }
            }
            this.LJIJ = null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJIJ = null;
            throw th;
        }
    }

    public final void LJIILJJIL(boolean z) {
        MediaMuxer mediaMuxer = this.LJIJI;
        if (mediaMuxer == null) {
            return;
        }
        try {
            try {
                mediaMuxer.stop();
                this.LJIJI.release();
            } catch (IllegalStateException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("releaseMediaMuxer exception ");
                sbLIZ.append(e.toString());
                C1288370jdD.LIZIZ("KryptonMediaRecorder", C2188811AlT.LIZIZ(sbLIZ));
                if (!z) {
                    throw e;
                }
            }
            this.LJIJI = null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJIJI = null;
            throw th;
        }
    }

    public final void LJIILL(boolean z) {
        MediaCodec mediaCodec = this.LJIIZILJ;
        if (mediaCodec == null) {
            return;
        }
        try {
            try {
                mediaCodec.stop();
                this.LJIIZILJ.release();
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("releaseVideoMediaCodecEncoder exception ");
                sbLIZ.append(e.toString());
                C1288370jdD.LIZIZ("KryptonMediaRecorder", C2188811AlT.LIZIZ(sbLIZ));
                if (!z) {
                    throw e;
                }
            }
            this.LJIIZILJ = null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJIIZILJ = null;
            throw th;
        }
    }

    public final void LJIILLIIL(boolean z) {
        if (!this.LJIJJ) {
            if (z) {
                this.LJJIIJ = this.LJIJI.addTrack(this.LJIJ.getOutputFormat());
            } else {
                this.LJJIIJZLJL = this.LJIJI.addTrack(this.LJIIZILJ.getOutputFormat());
            }
            int i = this.LJJIII + 1;
            this.LJJIII = i;
            if (i == this.LJJII) {
                this.LJIJI.start();
                this.LJIJJ = true;
                return;
            }
            return;
        }
        throw new IllegalStateException("output format already changed!");
    }

    public C1286000jZO(C1286100jZY c1286100jZY, C1286110jZZ c1286110jZZ) {
        this.LJJIJLIJ = c1286100jZY;
        this.LJJIJL = c1286110jZZ;
    }

    public final void LJIIIZ(String str, String str2) {
        synchronized (this) {
            if (str != null) {
                LIZJ(str);
            }
        }
        InterfaceC1286130jZb interfaceC1286130jZb = this.LIZ;
        if (interfaceC1286130jZb != null) {
            ((MediaRecorder) interfaceC1286130jZb).LIZIZ(str2);
        }
    }

    public static int LJIJ(int i, Range range, int i2, int i3) {
        if (range != null) {
            if (i > ((Integer) range.getUpper()).intValue()) {
                return ((Integer) range.getUpper()).intValue();
            }
            if (i < ((Integer) range.getLower()).intValue()) {
                return ((Integer) range.getLower()).intValue();
            }
        } else {
            if (i > i3) {
                return i3;
            }
            if (i < i2) {
                return i2;
            }
        }
        return i;
    }

    public static boolean LIZ(MediaExtractor mediaExtractor, MediaMuxer mediaMuxer, C1286030jZR c1286030jZR, ByteBuffer byteBuffer, int i, int i2) {
        mediaExtractor.selectTrack(i);
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        int i3 = 0;
        long j = 0;
        int i4 = 0;
        boolean z = false;
        long j2 = 0;
        while (true) {
            C1286060jZU[] c1286060jZUArr = c1286030jZR.LIZ;
            if (i4 < c1286060jZUArr.length) {
                C1286060jZU c1286060jZU = c1286060jZUArr[i4];
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("start time ");
                sbLIZ.append(c1286060jZU.LIZ);
                sbLIZ.append(", end time");
                sbLIZ.append(c1286060jZU.LIZIZ);
                C1288370jdD.LIZJ("KryptonMediaRecorder", C2188811AlT.LIZIZ(sbLIZ));
                mediaExtractor.seekTo(c1286060jZU.LIZ, i3);
                long j3 = -1;
                while (true) {
                    int sampleData = mediaExtractor.readSampleData(byteBuffer, i3);
                    if (sampleData < 0) {
                        mediaExtractor.unselectTrack(i);
                        break;
                    }
                    long sampleTime = mediaExtractor.getSampleTime();
                    int sampleFlags = mediaExtractor.getSampleFlags();
                    if (sampleTime > c1286060jZU.LIZIZ) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("presentationTimeUs > endTime ");
                        sbLIZ2.append(sampleTime);
                        sbLIZ2.append(" > ");
                        sbLIZ2.append(c1286060jZU.LIZIZ);
                        C1288370jdD.LIZJ("KryptonMediaRecorder", C2188811AlT.LIZIZ(sbLIZ2));
                        break;
                    }
                    if (c1286060jZU.LIZJ == -1) {
                        c1286060jZU.LIZ = sampleTime;
                        c1286060jZU.LIZJ = j2;
                    }
                    long j4 = c1286060jZU.LIZ;
                    if (sampleTime < j4) {
                        mediaExtractor.advance();
                    } else {
                        long j5 = (sampleTime - j4) + c1286060jZU.LIZJ;
                        if (j5 < j) {
                            mediaExtractor.advance();
                        } else {
                            i3 = 0;
                            bufferInfo.offset = 0;
                            bufferInfo.size = sampleData;
                            bufferInfo.flags = sampleFlags;
                            bufferInfo.presentationTimeUs = j5;
                            mediaMuxer.writeSampleData(i2, byteBuffer, bufferInfo);
                            mediaExtractor.advance();
                            j = j5;
                            z = true;
                            j3 = sampleTime;
                        }
                    }
                    i3 = 0;
                }
                if (j3 != -1) {
                    j2 += j3 - c1286060jZU.LIZ;
                } else {
                    c1286060jZU.LIZ = c1286060jZU.LIZIZ;
                }
                i4++;
                i3 = 0;
            } else {
                return z;
            }
        }
    }
}
