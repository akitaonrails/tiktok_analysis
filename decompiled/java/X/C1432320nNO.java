package X;

import Y.ACallableS427S0100000_22;
import android.net.Uri;
import android.util.Log;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSynthesisResult;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0nNO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1432320nNO {
    public final VideoPublishEditModel LIZ;
    public C918190a09 LIZIZ;
    public InterfaceC1452170ntP LIZJ;
    public final LinkedBlockingQueue<Runnable> LIZLLL = new LinkedBlockingQueue<>();
    public final C01GW LJ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 849));
    public final List<RunnableC1432010nMt> LJFF;

    public final void LIZIZ() {
        C918190a09 c918190a09 = this.LIZIZ;
        if (c918190a09 != null) {
            c918190a09.LIZ();
        }
        this.LIZIZ = null;
        InterfaceC1452170ntP interfaceC1452170ntP = this.LIZJ;
        if (interfaceC1452170ntP != null) {
            C15O7.LIZJ(new ACallableS427S0100000_22(interfaceC1452170ntP, 13));
        }
    }

    public final ThreadPoolExecutor LJ() {
        return (ThreadPoolExecutor) this.LJ.getValue();
    }

    public final boolean LJFF() {
        List<SingleImageData> imageList;
        ImageSynthesisResult synthesisData;
        String path;
        ImageAlbumData imageAlbumData = this.LIZ.getImageAlbumData();
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
            for (SingleImageData singleImageData : imageList) {
                if (singleImageData.getSynthesisData() == null || (C568750MSj.LIZIZ(this.LIZ) && ((synthesisData = singleImageData.getSynthesisData()) == null || (path = synthesisData.getPath()) == null || a0.LJJJIL(path)))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void LIZ() {
        C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("image publish presenter cancel, ");
        sbLIZ.append(hashCode());
        c1437510nVlLJJLIIIJ.LIZ("compile", C2188811AlT.LIZIZ(sbLIZ));
        C1437510nVl c1437510nVlLJJLIIIJ2 = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("image publish presenter cancel ");
        sbLIZ2.append(Log.getStackTraceString(new Throwable()));
        c1437510nVlLJJLIIIJ2.LIZ("compile", C2188811AlT.LIZIZ(sbLIZ2));
        Iterator it2 = ((ArrayList) this.LJFF).iterator();
        while (it2.hasNext()) {
            ((RunnableC1432010nMt) it2.next()).LIZ();
        }
        this.LIZLLL.clear();
        LJ().shutdown();
        LIZIZ();
    }

    public C1432320nNO(VideoPublishEditModel videoPublishEditModel) {
        this.LIZ = videoPublishEditModel;
        C19565911gn.LIZ();
        C122T.LIZ();
        this.LJFF = new ArrayList();
    }

    public static String LIZJ(String str) {
        Object c098200Yq;
        if (C2471909mP.LJJIIZI(str)) {
            try {
                c098200Yq = UriProtector.parse(str);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            return C09N5.LIZ(C786410Ut5.M3(C1BWL.LIZ()), (Uri) c098200Yq);
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZLLL(int r7, java.lang.String r8, boolean r9, boolean r10) {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r6.LIZ
            X.14Cw r1 = X.EnumC20228014Cw.SYNTHESISE
            java.lang.String r0 = "image_mode_synthesis"
            java.io.File r0 = X.C2298308zV.LIZ(r2, r1, r0)
            X.0VSJ r4 = new X.0VSJ
            java.lang.String r3 = r0.getPath()
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = X.C08F1.LIZIZ(r8)
            r2.append(r0)
            r5 = 95
            r2.append(r5)
            long r0 = java.lang.System.currentTimeMillis()
            r2.append(r0)
            r2.append(r5)
            r2.append(r7)
            if (r10 != 0) goto L8a
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.LIZ
            boolean r0 = X.C1428470nHB.LLI(r0)
            if (r0 == 0) goto L5f
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.LIZ
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            if (r0 == 0) goto L5c
            com.ss.android.ugc.aweme.shortvideo.upload.StoryPublishNetworkInfo r0 = r0.storyPublishNetworkInfo
            if (r0 == 0) goto L5c
            long r0 = r0.getSpeedToGetEncodeSetting()
        L45:
            boolean r0 = X.C1432380nNU.LIZ(r0)
            if (r0 == 0) goto L5f
        L4b:
            java.lang.String r0 = ".webp"
        L4d:
            r2.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r2)
            r4.<init>(r3, r0)
            java.lang.String r0 = r4.getPath()
            return r0
        L5c:
            r0 = 0
            goto L45
        L5f:
            if (r9 == 0) goto L70
            boolean r0 = X.C287050BMx.LIZ()
            if (r0 == 0) goto L87
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.LIZ
            boolean r0 = X.C1428470nHB.LLIIIL(r0)
            if (r0 != 0) goto L87
            goto L4b
        L70:
            X.01GW r0 = X.C287040BMw.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L87
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.LIZ
            boolean r0 = X.C1428470nHB.LLIIIL(r0)
            if (r0 != 0) goto L87
            goto L4b
        L87:
            java.lang.String r0 = ".jpeg"
            goto L4d
        L8a:
            java.lang.String r0 = ".mp4"
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1432320nNO.LIZLLL(int, java.lang.String, boolean, boolean):java.lang.String");
    }

    public final void LJIIIZ(VideoPublishEditModel videoPublishEditModel, Function2<? super ImageSynthesisResult, ? super Integer, Unit> function2, InterfaceC1631620sYq<? super Integer, ? super Exception, ? super String, Unit> interfaceC1631620sYq, Function1<? super List<ImageSynthesisResult>, Unit> function1) throws Throwable {
        List<SingleImageData> imageList;
        SingleImageData singleImageData;
        SrcImageInfo srcImageInfo;
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null && (singleImageData = (SingleImageData) C13LP.LJJJLL(imageList)) != null && (srcImageInfo = singleImageData.getSrcImageInfo()) != null) {
            LJIIIIZZ(videoPublishEditModel, srcImageInfo, null, LIZLLL(0, srcImageInfo.getPath(), true, false), function2, interfaceC1631620sYq, function1, null);
        } else if (interfaceC1631620sYq != null) {
            interfaceC1631620sYq.invoke(-1, null, "Missing src image info!");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(X.C1413340msm r29, java.util.List<com.ss.android.ugc.aweme.creative.model.edit.SingleImageData> r30, com.ss.android.ugc.aweme.creative.model.CreativeModel r31, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super com.ss.android.ugc.aweme.creative.model.edit.ImageSynthesisResult, kotlin.Unit> r32, X.InterfaceC1631620sYq<? super java.lang.Integer, ? super java.lang.Exception, ? super java.lang.String, kotlin.Unit> r33, java.lang.String r34, boolean r35) {
        /*
            Method dump skipped, instruction units count: 591
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1432320nNO.LJI(X.0msm, java.util.List, com.ss.android.ugc.aweme.creative.model.CreativeModel, kotlin.jvm.functions.Function2, X.0sYq, java.lang.String, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [T] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [T] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r22v0, types: [X.0sYq] */
    /* JADX WARN: Type inference failed for: r25v0, types: [X.0nNO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r28v1, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r30v1, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [T, X.0sYq] */
    /* JADX WARN: Type inference failed for: r8v3 */
    public static void LJII(final C1432320nNO c1432320nNO, final VideoPublishEditModel videoPublishEditModel, Function2 function2, InterfaceC1631620sYq interfaceC1631620sYq, Function1 function1, Boolean bool, boolean z, int i) throws Throwable {
        List<SingleImageData> imageList;
        List<SingleImageData> imageList2;
        List<SingleImageData> imageList3;
        String absolutePath;
        boolean z2 = z;
        Boolean bool2 = bool;
        ?? r14 = function1;
        ?? r8 = interfaceC1631620sYq;
        ?? r13 = function2;
        if ((i & 2) != 0) {
            r13 = 0;
        }
        if ((i & 4) != 0) {
            r8 = 0;
        }
        if ((i & 8) != 0) {
            r14 = 0;
        }
        if ((i & 32) != 0) {
            bool2 = Boolean.FALSE;
        }
        int i2 = 0;
        if ((i & 64) != 0) {
            z2 = false;
        }
        c1432320nNO.getClass();
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = r13;
        final C259800zU c259800zU2 = new C259800zU();
        c259800zU2.element = r8;
        final C259800zU c259800zU3 = new C259800zU();
        c259800zU3.element = r14;
        if (C1428470nHB.LJJJJLL(videoPublishEditModel) && videoPublishEditModel.creativeModel.editSaveLocalModel.imageModeSelectedItem == -1) {
            if (C371410EhH.LIZ()) {
                c1432320nNO.LJ().submit(new Runnable() { // from class: X.0mnr
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("VEImagePublishEditPresenter@984c.synthesisAll$4");
                        try {
                            this.LL.LJIIIZ(videoPublishEditModel, c259800zU.element, c259800zU2.element, c259800zU3.element);
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("VEImagePublishEditPresenter@984c.synthesisAll$4");
                    }
                });
                return;
            } else {
                c1432320nNO.LJIIIZ(videoPublishEditModel, (Function2) c259800zU.element, (InterfaceC1631620sYq) c259800zU2.element, (Function1) c259800zU3.element);
                return;
            }
        }
        C0CHQ.LIZ().LJJI().LIZ(C0CHQ.LIZ().LJJIIJZLJL().getPathService().LIZLLL(videoPublishEditModel.getCreativeInfo()));
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData == null || (imageList = imageAlbumData.getImageList()) == null) {
            imageList = C13BV.INSTANCE;
        }
        C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("image publish presenter start synthesis ");
        sbLIZ.append(c1432320nNO.hashCode());
        c1437510nVlLJJLIIIJ.LIZ("compile", C2188811AlT.LIZIZ(sbLIZ));
        C1437510nVl c1437510nVlLJJLIIIJ2 = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("image publish presenter thread pool status: isShutdown = ");
        sbLIZ2.append(c1432320nNO.LJ().isShutdown());
        sbLIZ2.append(" isTerminated = ");
        sbLIZ2.append(c1432320nNO.LJ().isTerminated());
        c1437510nVlLJJLIIIJ2.LIZ("compile", C2188811AlT.LIZIZ(sbLIZ2));
        C1437510nVl c1437510nVlLJJLIIIJ3 = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("image publish presenter thread pool status: activeTaskCount = ");
        sbLIZ3.append(c1432320nNO.LJ().getActiveCount());
        c1437510nVlLJJLIIIJ3.LIZ("compile", C2188811AlT.LIZIZ(sbLIZ3));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ImageAlbumData imageAlbumData2 = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData2 != null && (imageList2 = imageAlbumData2.getImageList()) != null && imageList2.size() > 0) {
            ImageAlbumData imageAlbumData3 = videoPublishEditModel.getImageAlbumData();
            if (imageAlbumData3 == null || (imageList3 = imageAlbumData3.getImageList()) == null) {
                return;
            }
            for (SingleImageData singleImageData : imageList3) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    C1413340msm c1413340msm = new C1413340msm(i2, singleImageData);
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("image publish presenter start index = ");
                    sbLIZ4.append(i2);
                    C1450070nq1.LIZ(C2188811AlT.LIZIZ(sbLIZ4));
                    CreativeModel creativeModel = videoPublishEditModel.creativeModel;
                    if (Intrinsics.LJFF(bool2, Boolean.TRUE)) {
                        File fileLIZLLL = C2489809pI.LIZLLL(c1432320nNO.LIZ);
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("watermark");
                        sbLIZ6.append(System.currentTimeMillis());
                        sbLIZ5.append(C08F1.LIZIZ(C2188811AlT.LIZIZ(sbLIZ6)));
                        sbLIZ5.append('_');
                        sbLIZ5.append(i2);
                        sbLIZ5.append(".png");
                        absolutePath = new C0VSJ(fileLIZLLL, C2188811AlT.LIZIZ(sbLIZ5)).getAbsolutePath();
                    } else {
                        absolutePath = null;
                    }
                    c1432320nNO.LJI(c1413340msm, imageList, creativeModel, new C1430920nL8(linkedHashSet, imageList, r13, videoPublishEditModel, r14, c1432320nNO), r8, absolutePath, z2);
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            return;
        }
        if (r8 == 0) {
            return;
        }
        r8.invoke(200007, null, "image size empty");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0300 A[PHI: r1
      0x0300: PHI (r1v63 java.lang.Integer) = (r1v61 java.lang.Integer), (r1v64 java.lang.Integer) binds: [B:154:0x0322, B:150:0x02fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r23, com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo r24, android.util.Size r25, java.lang.String r26, kotlin.jvm.functions.Function2<? super com.ss.android.ugc.aweme.creative.model.edit.ImageSynthesisResult, ? super java.lang.Integer, kotlin.Unit> r27, X.InterfaceC1631620sYq<? super java.lang.Integer, ? super java.lang.Exception, ? super java.lang.String, kotlin.Unit> r28, kotlin.jvm.functions.Function1<? super java.util.List<com.ss.android.ugc.aweme.creative.model.edit.ImageSynthesisResult>, kotlin.Unit> r29, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1432320nNO.LJIIIIZZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo, android.util.Size, java.lang.String, kotlin.jvm.functions.Function2, X.0sYq, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):void");
    }
}
