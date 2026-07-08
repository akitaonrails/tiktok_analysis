package X;

import android.graphics.Bitmap;
import android.util.Size;
import com.bytedance.ies.nle.editor_jni.INLEListenerGetImage;
import com.bytedance.ies.nle.editor_jni.NLEAlphaSplitType;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLE_GET_FRAME_FLAGS;
import com.bytedance.ies.nle.editor_jni.VecLongLong;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.vesdk.VEUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0EgA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C370720EgA {
    public static volatile boolean LIZIZ;
    public static final C370720EgA LIZ = new C370720EgA();
    public static final HashMap<C370820EgK, Bitmap> LIZJ = new HashMap<>();
    public static final HashMap<C370820EgK, InterfaceC370850EgN> LIZLLL = new HashMap<>();
    public static final Object LJ = new Object();
    public static volatile boolean LJFF = true;

    public static int LIZ(int i) {
        int i2 = (i / LSPassThroughRecordSizeConfig.DEFAULT) * LSPassThroughRecordSizeConfig.DEFAULT;
        if (i2 + 500 < i) {
            return i2 + LSPassThroughRecordSizeConfig.DEFAULT;
        }
        return i2;
    }

    public static String LIZIZ(NLETrackSlot nLETrackSlot) {
        NLEResourceAV nLEResourceAVLJJIIJZLJL;
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        String resourceFile = nLESegmentVideoDynamicCast.getPlayResource().getResourceFile();
        C351510DqH.LIZ.getClass();
        if (C351510DqH.LJJIL(nLETrackSlot) && ((nLEResourceAVLJJIIJZLJL = C351510DqH.LJJIIJZLJL(nLETrackSlot)) == null || (resourceFile = nLEResourceAVLJJIIJZLJL.getResourceFile()) == null)) {
            resourceFile = "";
        }
        if (resourceFile.length() <= 0) {
            return nLESegmentVideoDynamicCast.getResource().getResourceFile();
        }
        return resourceFile;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f4  */
    /* JADX WARN: Type inference failed for: r14v0, types: [X.0EgD, X.0EgN] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [X.0EgD] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [X.0EgD] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(com.bytedance.ies.nle.editor_jni.NLETrackSlot r21, int r22, final android.util.Size r23, java.lang.String r24, final X.C020W r25, X.InterfaceC1364105Vn r26) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C370720EgA.LIZLLL(com.bytedance.ies.nle.editor_jni.NLETrackSlot, int, android.util.Size, java.lang.String, X.020W, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [X.0EgC] */
    public static Object LJ(final String str, final String str2, final List list, final Size size, final InterfaceC370850EgN interfaceC370850EgN, String str3, AbstractC23140094w abstractC23140094w) {
        int i;
        int i2;
        int height;
        NLEResourceNode resource;
        final C370830EgL c370830EgL = new C370830EgL();
        C0EHL.LIZ();
        AFwS234S0000000_5 aFwS234S0000000_5 = AFwS234S0000000_5.get$arr$(590);
        final ?? r15 = new INLEListenerGetImage() { // from class: X.0EgC
            @Override // com.bytedance.ies.nle.editor_jni.INLEListenerGetImage
            public final int onGetImageData(byte[] bArr, int i3, int i4, int i5, float f) {
                if (bArr == null) {
                    return 0;
                }
                Bitmap bitmapLIZ = C370830EgL.LIZ(c370830EgL, ByteBuffer.wrap(bArr), str, i4, i5, size.getWidth(), size.getHeight(), null, false, 192);
                if (bitmapLIZ != null) {
                    interfaceC370850EgN.LIZ(new C370820EgK(str, i3, str2), bitmapLIZ);
                    return 0;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("failed to obtain bitmap with ");
                sbLIZ.append(str);
                sbLIZ.append(" in ");
                sbLIZ.append(i3);
                sbLIZ.append(' ');
                C355090Dw3.LIZLLL("FrameLoader", C2188811AlT.LIZIZ(sbLIZ));
                return 0;
            }
        };
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(abstractC23140094w));
        c2252611DEt.LJIJJ();
        C558340Lv6 c558340Lv6LJI = C351220Dpo.LJI(str, NLEResType.VIDEO);
        try {
            C0VSJ c0vsj = new C0VSJ(str3);
            if (!c0vsj.exists()) {
                c0vsj.mkdirs();
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        NLEModel nLEModel = new NLEModel();
        NLETrackSlot nLETrackSlot = new NLETrackSlot();
        NLESegmentVideo nLESegmentVideo = new NLESegmentVideo();
        NLEResourceAV nLEResourceAV = new NLEResourceAV();
        int i3 = c558340Lv6LJI.LIZLLL;
        if (i3 != 90 && i3 != 270) {
            i = c558340Lv6LJI.LIZIZ;
        } else {
            i = c558340Lv6LJI.LIZJ;
        }
        if (i3 != 90 && i3 != 270) {
            i2 = c558340Lv6LJI.LIZJ;
        } else {
            i2 = c558340Lv6LJI.LIZIZ;
        }
        nLEResourceAV.setResourceType(NLEResType.VIDEO);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        nLEResourceAV.setDuration(timeUnit.toMicros(c558340Lv6LJI.LJ));
        nLEResourceAV.setHeight(i2);
        nLEResourceAV.setWidth(i);
        nLEResourceAV.setAlphaSplitType(NLEAlphaSplitType.H264_LR);
        nLEResourceAV.setResourceFile(str);
        nLEResourceAV.setHasAudio(false);
        nLESegmentVideo.setAVFile(nLEResourceAV);
        nLESegmentVideo.setTimeClipStart(0L);
        long micros = timeUnit.toMicros(c558340Lv6LJI.LJ);
        nLESegmentVideo.setTimeClipEnd(micros);
        nLETrackSlot.setEndTime(micros);
        nLESegmentVideo.setKeepTone(true);
        nLESegmentVideo.setVolume(0.0f);
        C351510DqH.LIZ.getClass();
        C351510DqH.LJJJJ(nLESegmentVideo);
        nLETrackSlot.setMainSegment(nLESegmentVideo);
        aFwS234S0000000_5.invoke(nLETrackSlot);
        NLESegment mainSegment = nLETrackSlot.getMainSegment();
        if (mainSegment != null && (resource = mainSegment.getResource()) != null) {
            float width = resource.getWidth();
            float height2 = resource.getHeight();
            if (height2 < 1.0f) {
                height2 = 1.0f;
            }
            nLEModel.setCanvasRatio(width / height2);
        }
        C348350DlB.LJIIJJI(nLEModel, size.getWidth());
        if (nLEModel.getCanvasRatio() > 0.0f) {
            height = (int) (size.getWidth() / nLEModel.getCanvasRatio());
        } else {
            height = size.getHeight();
        }
        NLETrack nLETrack = new NLETrack();
        nLETrack.setMainTrack(true);
        nLETrack.addSlot(nLETrackSlot);
        nLEModel.addTrack(nLETrack);
        nLEModel.addToStage(0L);
        EnumC1464030oCX.DEFAULT.getValue();
        EnumC1442010nd1.UPLOAD_OTHER.getValue();
        final C1463860oCG c1463860oCGLIZ = C0F9X.LIZ(C1463690oBz.LIZIZ(str3, ""), null, null, 12);
        c1463860oCGLIZ.setDataSource(nLEModel);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(C2286608xc.LJFF(TimeUnit.MILLISECONDS.toMicros(((Number) it2.next()).intValue())));
        }
        ((C1463950oCP) c1463860oCGLIZ.getMediaRuntimeApi()).getImages(new VecLongLong(arrayList), size.getWidth(), height, NLE_GET_FRAME_FLAGS.NLE_GET_FRAMES_MODE_NORMAL, new INLEListenerGetImage() { // from class: X.0EgI
            @Override // com.bytedance.ies.nle.editor_jni.INLEListenerGetImage
            public final int onGetImageData(byte[] bArr, int i4, int i5, int i6, float f) {
                if (bArr == null) {
                    return 0;
                }
                r15.onGetImageData(bArr, i4, i5, i6, f);
                Integer num = (Integer) C13LP.LJJLIIIJL(list);
                if (num != null && i4 == num.intValue()) {
                    ((C389960FQs) c1463860oCGLIZ.getPlayerApi()).destroy();
                    InterfaceC20236714Gf<Unit> interfaceC20236714Gf = c2252611DEt;
                    Unit unit = Unit.LIZ;
                    C189200o6.m2constructorimpl(unit);
                    interfaceC20236714Gf.resumeWith(unit);
                }
                return 0;
            }
        });
        c2252611DEt.LJJII(new AwS584S0100000_5(c1463860oCGLIZ, 883));
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(abstractC23140094w);
        }
        if (objLJIJ != C099R.LJFF()) {
            objLJIJ = Unit.LIZ;
        }
        if (objLJIJ == C099R.LJFF()) {
            return objLJIJ;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c7 A[Catch: Exception -> 0x01fd, TryCatch #1 {Exception -> 0x01fd, blocks: (B:88:0x01c0, B:89:0x01c3, B:91:0x01c7, B:93:0x01da, B:77:0x0185, B:81:0x018c, B:85:0x01a8), top: B:110:0x0029 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r22, java.lang.String r23, java.util.List<X.C370780EgG> r24, android.util.Size r25, X.InterfaceC370850EgN r26, java.lang.String r27, boolean r28, kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Float, kotlin.Unit> r29, X.InterfaceC1364105Vn<? super kotlin.Unit> r30) {
        /*
            Method dump skipped, instruction units count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C370720EgA.LIZJ(java.lang.String, java.lang.String, java.util.List, android.util.Size, X.0EgN, java.lang.String, boolean, kotlin.jvm.functions.Function2, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [X.0EgB] */
    public static void LJFF(C370720EgA c370720EgA, final String str, final String str2, final List list, Size size, final InterfaceC370850EgN interfaceC370850EgN, final boolean z, Function2 function2, boolean z2, boolean z3, int i) {
        boolean z4;
        boolean z5;
        boolean z6;
        final Function2 function22 = function2;
        if ((i & 64) != 0) {
            function22 = null;
        }
        if ((i & 128) != 0) {
            z2 = false;
        }
        if ((i & 256) != 0) {
            z3 = false;
        }
        c370720EgA.getClass();
        C20137413qm c20137413qm = C20137413qm.LIZ;
        C1452610nu7 c1452610nu7LIZ = c20137413qm.LIZ(str);
        final C013C c013c = new C013C();
        int i2 = c1452610nu7LIZ.LJ;
        int i3 = c1452610nu7LIZ.LIZLLL;
        if (i2 < i3) {
            z4 = true;
        } else {
            z4 = false;
        }
        c013c.element = z4;
        if (i2 / i3 < C360610EBv.LIZ / 1000.0f) {
            z5 = true;
        } else {
            z5 = false;
        }
        c013c.element = z5;
        final ArrayList arrayList = new ArrayList(list);
        C08XD.LJIL(arrayList);
        Size sizeLIZIZ = c20137413qm.LIZIZ(size.getWidth(), str);
        final C238400w2 c238400w2 = new C238400w2();
        c238400w2.element = System.currentTimeMillis();
        final C238400w2 c238400w22 = new C238400w2();
        final C238400w2 c238400w23 = new C238400w2();
        C370860EgO c370860EgO = (C370860EgO) C370840EgM.LIZ.getValue();
        int[] iArrLLII = C13LP.LLII(arrayList);
        int width = sizeLIZIZ.getWidth();
        int height = sizeLIZIZ.getHeight();
        final int width2 = size.getWidth();
        final int height2 = size.getHeight();
        if (c013c.element && !z3) {
            z6 = true;
        } else {
            z6 = false;
        }
        final ?? r3 = new InterfaceC370870EgP() { // from class: X.0EgB
            @Override // X.InterfaceC370870EgP
            public final boolean LIZ(int i4, Bitmap bitmap) {
                Function2<Boolean, Float, Unit> function23;
                long jCurrentTimeMillis = System.currentTimeMillis();
                c238400w22.element += jCurrentTimeMillis - c238400w2.element;
                C238400w2 c238400w24 = c238400w23;
                long j = c238400w24.element + 1;
                c238400w24.element = j;
                float f = r7.element / j;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(" isRough: ");
                sbLIZ.append(c013c.element);
                sbLIZ.append(" cost: ");
                sbLIZ.append(jCurrentTimeMillis - c238400w2.element);
                sbLIZ.append(" average: ");
                sbLIZ.append(f);
                sbLIZ.append(' ');
                sbLIZ.append(list.size());
                C355090Dw3.LJ("FrameLoader", C2188811AlT.LIZIZ(sbLIZ));
                if (c238400w23.element >= list.size() && (function23 = function22) != null) {
                    function23.invoke(Boolean.valueOf(c013c.element), Float.valueOf(f));
                }
                c238400w2.element = System.currentTimeMillis();
                if (bitmap != null) {
                    interfaceC370850EgN.LIZ(new C370820EgK(str, i4, str2), bitmap);
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("failed to obtain bitmap with ");
                    sbLIZ2.append(str);
                    sbLIZ2.append(" in ");
                    sbLIZ2.append(i4);
                    sbLIZ2.append(' ');
                    C355090Dw3.LIZLLL("FrameLoader", C2188811AlT.LIZIZ(sbLIZ2));
                }
                arrayList.remove(Integer.valueOf(i4));
                if (!arrayList.isEmpty()) {
                    C370720EgA.LIZ.getClass();
                    if (!C370720EgA.LIZIZ) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
        };
        c370860EgO.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getVideoBitmap ");
        sbLIZ.append(str);
        sbLIZ.append("  ");
        sbLIZ.append(C13LQ.LJJLJ(iArrLLII));
        sbLIZ.append('.');
        C355090Dw3.LIZIZ("bitmap-track", C2188811AlT.LIZIZ(sbLIZ));
        final C370830EgL c370830EgL = (C370830EgL) c370860EgO.LIZ.getValue();
        c370830EgL.getClass();
        C355090Dw3.LJ("GetFrameAbility", "GetFrameAbility start get frame");
        int videoFrames2 = VEUtils.getVideoFrames2(str, iArrLLII, width, height, z6, new InterfaceC1286300jZs() { // from class: X.0EgJ
            @Override // X.InterfaceC1286300jZs
            public final boolean processFrame(ByteBuffer byteBuffer, int i4, int i5, int i6) {
                Bitmap bitmapLIZ;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (byteBuffer != null) {
                    bitmapLIZ = C370830EgL.LIZ(c370830EgL, byteBuffer, str, i4, i5, width2, height2, null, z, 64);
                } else {
                    bitmapLIZ = null;
                }
                boolean zLIZ = r3.LIZ(i6, bitmapLIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("getVideoBitmap callback ");
                sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis);
                C355090Dw3.LJ("GetFrameAbility", C2188811AlT.LIZIZ(sbLIZ2));
                return zLIZ;
            }
        });
        if (videoFrames2 != 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(" ret is ");
            sbLIZ2.append(videoFrames2);
            sbLIZ2.append(" path is ");
            sbLIZ2.append(str);
            C355090Dw3.LIZLLL("FrameLoader", C2188811AlT.LIZIZ(sbLIZ2));
            if (z2) {
                HashMap<C370820EgK, Bitmap> map = LIZJ;
                synchronized (map) {
                    try {
                        map.clear();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        }
    }
}
