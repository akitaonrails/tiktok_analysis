package X;

import android.media.Image;
import android.media.ImageReader;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.common.TEImageUtils;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.vesdk.VEBingoInvoker;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0jZk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class RunnableC1286220jZk implements Runnable {
    public final /* synthetic */ String LL;
    public final /* synthetic */ int[] LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ InterfaceC1464150oCj LLIZLLLIL;
    public final /* synthetic */ int LLJ;
    public final /* synthetic */ long LLJI;
    public final /* synthetic */ int[] LLJIJIL;
    public final /* synthetic */ VEBingoInvoker LLJILJIL;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0jZo] */
    public final void LIZ() {
        int i;
        boolean z;
        MediaFormat mediaFormat = null;
        final ByteBuffer[] byteBufferArr = {null};
        final float[] fArr = {0.0f};
        final long[] jArr = {System.currentTimeMillis()};
        final C1286240jZm c1286240jZm = new C1286240jZm(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, new InterfaceC1286300jZs() { // from class: X.0jZo
            @Override // X.InterfaceC1286300jZs
            public final boolean processFrame(ByteBuffer byteBuffer, int i2, int i3, int i4) {
                String str;
                long jCurrentTimeMillis = System.currentTimeMillis() - jArr[0];
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("frameProcessHW");
                sbLIZ.append(this.LIZLLL.LLILZLL);
                sbLIZ.append("_");
                sbLIZ.append(this.LIZLLL.LLIZ);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(" cost time :");
                sbLIZ2.append(jCurrentTimeMillis);
                sbLIZ2.append(" ptsMs: ");
                sbLIZ2.append(i4);
                sbLIZ2.append(" frame is ");
                if (byteBuffer == null) {
                    str = "null";
                } else {
                    str = "not null";
                }
                sbLIZ2.append(str);
                C2484209oO.LJI(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2));
                jArr[0] = System.currentTimeMillis();
                if (byteBuffer == null) {
                    byteBufferArr[0] = null;
                    RunnableC1286220jZk runnableC1286220jZk = this.LIZLLL;
                    runnableC1286220jZk.LLJILJIL.progressBack(runnableC1286220jZk.LLIZLLLIL, runnableC1286220jZk.LLJ, runnableC1286220jZk.LLILZLL, runnableC1286220jZk.LLJI, runnableC1286220jZk.LLJIJIL);
                    RunnableC1286220jZk runnableC1286220jZk2 = this.LIZLLL;
                    return runnableC1286220jZk2.LLJILJIL.genFrameMap.get(Integer.valueOf(runnableC1286220jZk2.LLILZLL)).booleanValue();
                }
                ByteBuffer[] byteBufferArr2 = byteBufferArr;
                ByteBuffer byteBuffer2 = byteBufferArr2[0];
                if (byteBuffer2 == null) {
                    byteBufferArr2[0] = byteBuffer;
                    fArr[0] = i4;
                    RunnableC1286220jZk runnableC1286220jZk3 = this.LIZLLL;
                    return runnableC1286220jZk3.LLJILJIL.genFrameMap.get(Integer.valueOf(runnableC1286220jZk3.LLILZLL)).booleanValue();
                }
                RunnableC1286220jZk runnableC1286220jZk4 = this.LIZLLL;
                runnableC1286220jZk4.LLJILJIL.mNativeBingoHandler.processBingoFrames(byteBuffer2, byteBuffer, i2, i3, fArr[0], runnableC1286220jZk4.LL);
                byteBufferArr[0] = null;
                fArr[0] = 0.0f;
                RunnableC1286220jZk runnableC1286220jZk5 = this.LIZLLL;
                runnableC1286220jZk5.LLJILJIL.progressBack(runnableC1286220jZk5.LLIZLLLIL, runnableC1286220jZk5.LLJ, runnableC1286220jZk5.LLILZLL, runnableC1286220jZk5.LLJI, runnableC1286220jZk5.LLJIJIL);
                RunnableC1286220jZk runnableC1286220jZk6 = this.LIZLLL;
                return runnableC1286220jZk6.LLJILJIL.genFrameMap.get(Integer.valueOf(runnableC1286220jZk6.LLILZLL)).booleanValue();
            }
        });
        try {
            C2484209oO.LJI(c1286240jZm.LIZIZ, "method start begin");
            if (c1286240jZm.LIZLLL.length <= 0) {
                String str = c1286240jZm.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ptsMs.length is wrong: ");
                sbLIZ.append(c1286240jZm.LIZLLL.length);
                C2484209oO.LJI(str, C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            C1286240jZm.LJ();
            System.currentTimeMillis();
            MediaExtractor mediaExtractor = new MediaExtractor();
            mediaExtractor.setDataSource(c1286240jZm.LIZJ);
            int i2 = c1286240jZm.LJ;
            int i3 = c1286240jZm.LJFF;
            for (int i4 = 0; i4 < mediaExtractor.getTrackCount(); i4++) {
                MediaFormat trackFormat = mediaExtractor.getTrackFormat(i4);
                if (trackFormat.getString("mime").startsWith("video")) {
                    c1286240jZm.LJIILJJIL = trackFormat.getInteger("width");
                    c1286240jZm.LJIILL = trackFormat.getInteger("height");
                    int integer = trackFormat.getInteger("rotation-degrees");
                    c1286240jZm.LJIILIIL = integer;
                    if (integer != 0) {
                        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(((c1286240jZm.LJ * c1286240jZm.LJFF) * 3) / 2);
                        byteBufferAllocateDirect.clear();
                        c1286240jZm.LJIIJJI = VEFrame.createByteBufferFrame(byteBufferAllocateDirect, c1286240jZm.LJ, c1286240jZm.LJFF, 0, 0L, EnumC2185621AgK.TEPixFmt_YUV420P);
                        int i5 = c1286240jZm.LJIILIIL;
                        if (i5 == 90 || i5 == 270) {
                            i2 = c1286240jZm.LJFF;
                            i3 = c1286240jZm.LJ;
                        }
                    }
                    mediaExtractor.selectTrack(i4);
                    mediaFormat = trackFormat;
                }
            }
            if (c1286240jZm.LJIIIZ == null) {
                ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(((i2 * i3) * 3) / 2);
                byteBufferAllocateDirect2.clear();
                i = 2;
                c1286240jZm.LJIIIZ = VEFrame.createByteBufferFrame(byteBufferAllocateDirect2, i2, i3, c1286240jZm.LJIILIIL, 0L, EnumC2185621AgK.TEPixFmt_YUV420P);
            } else {
                i = 2;
            }
            c1286240jZm.LJIIL = MediaCodec.createDecoderByType("video/avc");
            ArrayList arrayList = new ArrayList();
            mediaExtractor.seekTo(c1286240jZm.LIZLLL[0], i);
            ArrayList arrayList2 = new ArrayList();
            int i6 = c1286240jZm.LJI;
            while (true) {
                long sampleTime = mediaExtractor.getSampleTime();
                if (sampleTime < 0 && mediaExtractor.advance()) {
                    c1286240jZm.LJIJJLI = true;
                    break;
                }
                arrayList2.add(Long.valueOf(sampleTime));
                if (mediaExtractor.getSampleFlags() == 1) {
                    z = true;
                    arrayList.add(Long.valueOf(sampleTime));
                } else {
                    z = false;
                }
                int[] iArr = c1286240jZm.LIZLLL;
                if (sampleTime > iArr[iArr.length - 1] && z) {
                    i6--;
                }
                if (!mediaExtractor.advance() || i6 <= 0) {
                    break;
                }
            }
            if (c1286240jZm.LJIJJLI) {
                C2484209oO.LJI(c1286240jZm.LIZIZ, "start wrong");
                c1286240jZm.LIZJ();
                return;
            }
            Collections.sort(arrayList2);
            int length = c1286240jZm.LIZLLL.length;
            final List[] listArr = new List[length];
            int size = arrayList2.size();
            int i7 = 0;
            int i8 = 0;
            while (i7 < size && i8 < c1286240jZm.LIZLLL.length) {
                if (((Long) arrayList2.get(i7)).longValue() < c1286240jZm.LIZLLL[i8]) {
                    i7++;
                } else {
                    if (listArr[i8] == null) {
                        listArr[i8] = new ArrayList();
                    }
                    for (int i9 = 0; i9 < c1286240jZm.LJI; i9++) {
                        int i10 = i7 + i9;
                        if (i10 < size) {
                            listArr[i8].add(arrayList2.get(i10));
                        }
                    }
                    i7++;
                    i8++;
                }
            }
            int[] iArr2 = c1286240jZm.LIZLLL;
            if (listArr[iArr2.length - 1] != null && listArr[iArr2.length - 1].size() == 1) {
                int[] iArr3 = c1286240jZm.LIZLLL;
                listArr[iArr3.length - 1].add(listArr[iArr3.length - 1].get(0));
                listArr[c1286240jZm.LIZLLL.length - 1].set(0, arrayList2.get(arrayList2.size() - 2));
            }
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                String str2 = c1286240jZm.LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("pts value:");
                sbLIZ2.append(arrayList2.get(i11));
                C2484209oO.LJI(str2, C2188811AlT.LIZIZ(sbLIZ2));
            }
            for (int i12 = 0; i12 < length; i12++) {
                List list = listArr[i12];
                for (int i13 = 0; i13 < list.size(); i13++) {
                    String str3 = c1286240jZm.LIZIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("sensArray i: ");
                    sbLIZ3.append(i13);
                    sbLIZ3.append(" value: ");
                    sbLIZ3.append(list.get(i13).toString());
                    C2484209oO.LJI(str3, C2188811AlT.LIZIZ(sbLIZ3));
                }
            }
            mediaExtractor.seekTo(c1286240jZm.LIZLLL[0], 0);
            c1286240jZm.LJIILLIIL = new HandlerThread("MediaCodec Callback");
            String str4 = c1286240jZm.LIZIZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("getVideoFramesHW: mCodecHandlerThread = ");
            sbLIZ4.append(c1286240jZm.LJIILLIIL.getThreadId());
            sbLIZ4.append(", curr-threadId = ");
            sbLIZ4.append(c1286240jZm.LIZ);
            C2484209oO.LJI(str4, C2188811AlT.LIZIZ(sbLIZ4));
            c1286240jZm.LJIILLIIL.start();
            c1286240jZm.LJIIL.setCallback(new C1286180jZg(c1286240jZm, mediaExtractor, listArr, arrayList), new BPEAHandler(C786410Ut5.W2(c1286240jZm.LJIILLIIL)));
            c1286240jZm.LJIIZILJ = new HandlerThread("ImageReader Callback");
            String str5 = c1286240jZm.LIZIZ;
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("getVideoFramesHW: mReaderHandlerThread = ");
            sbLIZ5.append(c1286240jZm.LJIIZILJ.getThreadId());
            sbLIZ5.append(", curr-threadId = ");
            sbLIZ5.append(c1286240jZm.LIZ);
            C2484209oO.LJI(str5, C2188811AlT.LIZIZ(sbLIZ5));
            c1286240jZm.LJIIZILJ.start();
            BPEAHandler bPEAHandler = new BPEAHandler(C786410Ut5.W2(c1286240jZm.LJIIZILJ));
            ImageReader imageReaderNewInstance = ImageReader.newInstance(c1286240jZm.LJIILJJIL, c1286240jZm.LJIILL, 35, 2);
            c1286240jZm.LJIJ = imageReaderNewInstance;
            imageReaderNewInstance.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: X.0jZi
                public int LL;
                public final List<Long> LLILLJJLI = new ArrayList();

                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    VEFrame vEFrameCreateYUVPlanFrame;
                    VEFrame vEFrame;
                    try {
                        synchronized (c1286240jZm) {
                            try {
                                Image imageAcquireNextImage = imageReader.acquireNextImage();
                                long timestamp = imageAcquireNextImage.getTimestamp() / 1000;
                                if (listArr[this.LL].contains(Long.valueOf(timestamp))) {
                                    if (c1286240jZm.LJII != null) {
                                        if (imageAcquireNextImage.getFormat() == 35) {
                                            if (imageAcquireNextImage.getPlanes() != null && imageAcquireNextImage.getPlanes()[1].getPixelStride() > 1) {
                                                C1284350jWj c1284350jWj = new C1284350jWj(imageAcquireNextImage.getPlanes());
                                                C1286240jZm c1286240jZm2 = c1286240jZm;
                                                vEFrameCreateYUVPlanFrame = VEFrame.createYUVPlanFrame(c1284350jWj, c1286240jZm2.LJIILJJIL, c1286240jZm2.LJIILL, c1286240jZm2.LJIILIIL, 0L, EnumC2185621AgK.TEPixFmt_NV12);
                                                C1286240jZm c1286240jZm3 = c1286240jZm;
                                                if (c1286240jZm3.LJIIJ == null) {
                                                    ByteBuffer byteBufferAllocateDirect3 = ByteBuffer.allocateDirect(((c1286240jZm3.LJIILJJIL * c1286240jZm3.LJIILL) * 3) / 2);
                                                    byteBufferAllocateDirect3.clear();
                                                    C1286240jZm c1286240jZm4 = c1286240jZm;
                                                    c1286240jZm4.LJIIJ = VEFrame.createByteBufferFrame(byteBufferAllocateDirect3, c1286240jZm4.LJIILJJIL, c1286240jZm4.LJIILL, c1286240jZm4.LJIILIIL, 0L, EnumC2185621AgK.TEPixFmt_YUV420P);
                                                    TEImageUtils.LIZ(vEFrameCreateYUVPlanFrame, c1286240jZm.LJIIJ, EnumC1284340jWi.OP_CONVERT);
                                                    vEFrameCreateYUVPlanFrame = c1286240jZm.LJIIJ;
                                                }
                                            } else {
                                                C1284350jWj c1284350jWj2 = new C1284350jWj(imageAcquireNextImage.getPlanes());
                                                C1286240jZm c1286240jZm5 = c1286240jZm;
                                                vEFrameCreateYUVPlanFrame = VEFrame.createYUVPlanFrame(c1284350jWj2, c1286240jZm5.LJIILJJIL, c1286240jZm5.LJIILL, c1286240jZm5.LJIILIIL, 0L, EnumC2185621AgK.TEPixFmt_YUV420P);
                                            }
                                            VEFrame vEFrame2 = c1286240jZm.LJIIIZ;
                                            if (vEFrame2 != null) {
                                                TEImageUtils.LIZ(vEFrameCreateYUVPlanFrame, vEFrame2, EnumC1284340jWi.OP_SCALE);
                                            }
                                            C1286240jZm c1286240jZm6 = c1286240jZm;
                                            if (c1286240jZm6.LJIILIIL != 0) {
                                                vEFrame = c1286240jZm6.LJIIJJI;
                                                TEImageUtils.LIZ(c1286240jZm6.LJIIIZ, vEFrame, EnumC1284340jWi.OP_ROTATION);
                                            } else {
                                                vEFrame = c1286240jZm6.LJIIIZ;
                                            }
                                            TEImageUtils.LIZ(vEFrame, c1286240jZm.LJIIIIZZ, EnumC1284340jWi.OP_CONVERT);
                                            ((VEFrame.ByteBufferFrame) c1286240jZm.LJIIIIZZ.getFrame()).getByteBuffer().clear();
                                        }
                                        C1286240jZm c1286240jZm7 = c1286240jZm;
                                        c1286240jZm7.LIZIZ(c1286240jZm.LJIIIIZZ.getWidth(), c1286240jZm.LJIIIIZZ.getHeight(), (int) (imageAcquireNextImage.getTimestamp() / 1000000.0d), ((VEFrame.ByteBufferFrame) c1286240jZm7.LJIIIIZZ.getFrame()).getByteBuffer());
                                    }
                                    ((ArrayList) this.LLILLJJLI).add(Long.valueOf(timestamp));
                                    if (this.LLILLJJLI.containsAll(listArr[this.LL])) {
                                        ((ArrayList) this.LLILLJJLI).clear();
                                        this.LL++;
                                    }
                                    c1286240jZm.notify();
                                }
                                imageAcquireNextImage.close();
                            } finally {
                            }
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        c1286240jZm.LIZJ();
                        c1286240jZm.notify();
                        c1286240jZm.LIZLLL();
                    } catch (OutOfMemoryError e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        Runtime.getRuntime().gc();
                        c1286240jZm.LIZJ();
                        c1286240jZm.notify();
                        c1286240jZm.LIZLLL();
                    }
                }
            }, bPEAHandler);
            mediaFormat.setInteger("color-format", 2135033992);
            String str6 = C1286240jZm.LJJ;
            Map<String, Integer> map = C1286290jZr.LIZ;
            int iIntValue = ((((((HashMap) map).containsKey(str6) ? ((Integer) ((HashMap) map).get(str6)).intValue() : 0) * 1080) * 1920) / c1286240jZm.LJIILJJIL) / c1286240jZm.LJIILL;
            if (iIntValue > 0) {
                mediaFormat.setInteger("operating-rate", iIntValue);
            }
            c1286240jZm.LJIIL.configure(mediaFormat, c1286240jZm.LJIJ.getSurface(), (MediaCrypto) null, 0);
            c1286240jZm.LJIIL.start();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2484209oO.LJI(c1286240jZm.LIZIZ, "start crash");
            c1286240jZm.LIZJ();
            c1286240jZm.LIZLLL();
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2484209oO.LJI(c1286240jZm.LIZIZ, "start crash oom");
            Runtime.getRuntime().gc();
            c1286240jZm.LIZJ();
            c1286240jZm.LIZLLL();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("VEBingoInvoker@daec.beginGenFrameHW$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VEBingoInvoker@daec.beginGenFrameHW$1");
    }

    public RunnableC1286220jZk(VEBingoInvoker vEBingoInvoker, String str, int[] iArr, int i, int i2, int i3, int i4, int i5, InterfaceC1464150oCj interfaceC1464150oCj, int i6, long j, int[] iArr2) {
        this.LLJILJIL = vEBingoInvoker;
        this.LL = str;
        this.LLILLJJLI = iArr;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = i3;
        this.LLILZLL = i4;
        this.LLIZ = i5;
        this.LLIZLLLIL = interfaceC1464150oCj;
        this.LLJ = i6;
        this.LLJI = j;
        this.LLJIJIL = iArr2;
    }
}
