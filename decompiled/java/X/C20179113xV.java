package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13xV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20179113xV {
    public static final C20179113xV LIZ = new C20179113xV();
    public static final ConcurrentHashMap<String, C20180513xj> LIZIZ = new ConcurrentHashMap<>();
    public static final C2092008Hm<String, C20181013xo> LIZJ = new C2092008Hm<>();

    public static String LIZJ(C1457070o1J c1457070o1J) {
        NLEModel nLEModelLIZ;
        String string;
        int iLJ;
        List<SingleImageData> imageList;
        StringBuilder sb = new StringBuilder();
        sb.append(c1457070o1J.LIZ.getCreationId());
        sb.append("_src_");
        StringBuilder sb2 = new StringBuilder("videoFile_");
        EditPreviewInfo previewInfo = c1457070o1J.LIZ.getPreviewInfo();
        if (previewInfo != null && (!previewInfo.getVideoList().isEmpty())) {
            for (EditVideoSegment editVideoSegment : previewInfo.getVideoList()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("path_");
                sbLIZ.append(editVideoSegment.getVideoPath().hashCode());
                sb2.append(C2188811AlT.LIZIZ(sbLIZ));
                sb2.append("_");
                VideoFileInfo videoFileInfo = editVideoSegment.getVideoFileInfo();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(videoFileInfo.getWidth());
                sbLIZ2.append('x');
                sbLIZ2.append(videoFileInfo.getHeight());
                sb2.append(C2188811AlT.LIZIZ(sbLIZ2));
                sb2.append("_");
                sb2.append(videoFileInfo.getDuration());
                sb2.append("_");
                sb2.append(C2286708xd.LJIIL(editVideoSegment.getVideoPath()));
                if (!Intrinsics.LJFF(editVideoSegment, C13LP.LJJLIIIJJI(previewInfo.getVideoList()))) {
                    sb2.append("|");
                }
            }
        }
        sb2.append("imageFile_");
        ImageAlbumData imageAlbumData = c1457070o1J.LIZ.getImageAlbumData();
        Integer numValueOf = null;
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null && (!imageList.isEmpty())) {
            for (SingleImageData singleImageData : imageList) {
                SrcImageInfo srcImageInfo = singleImageData.getSrcImageInfo();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("path_");
                sbLIZ3.append(srcImageInfo.getPath().hashCode());
                sb2.append(C2188811AlT.LIZIZ(sbLIZ3));
                sb2.append("_");
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(srcImageInfo.getWidth());
                sbLIZ4.append('x');
                sbLIZ4.append(srcImageInfo.getHeight());
                sb2.append(C2188811AlT.LIZIZ(sbLIZ4));
                sb2.append("_");
                sb2.append(C2286708xd.LJIIL(srcImageInfo.getPath()));
                if (!Intrinsics.LJFF(singleImageData, C13LP.LJJLIIIJJI(imageList))) {
                    sb2.append("|");
                }
            }
        }
        sb.append(sb2.toString());
        sb.append("_");
        String str = c1457070o1J.LIZLLL;
        int i = 0;
        if (str != null && str.length() != 0) {
            sb.append("save_");
        }
        sb.append(c1457070o1J.LJ);
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("_w");
        sbLIZ5.append(c1457070o1J.LJFF);
        sbLIZ5.append("x_h");
        sbLIZ5.append(c1457070o1J.LJI);
        sb.append(C2188811AlT.LIZIZ(sbLIZ5));
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("_q");
        sbLIZ6.append(c1457070o1J.LJII);
        sb.append(C2188811AlT.LIZIZ(sbLIZ6));
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("_f");
        sbLIZ7.append(c1457070o1J.LJIIIIZZ);
        sb.append(C2188811AlT.LIZIZ(sbLIZ7));
        C20178213xM c20178213xM = C20178213xM.LIZ;
        sb.append(C20178213xM.LIZLLL(c1457070o1J).getStrategyName());
        if (c1457070o1J.LJIIIZ && c1457070o1J.LJIIJ != null && c1457070o1J.LJIIJJI != null) {
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append("_AI_SmartCoverCount");
            Integer num = c1457070o1J.LJIIL;
            if (num != null) {
                iLJ = C13LZ.LJ(num.intValue(), 3, 15);
            } else {
                iLJ = 7;
            }
            sbLIZ8.append(iLJ);
            sb.append(C2188811AlT.LIZIZ(sbLIZ8));
        }
        if (C1428470nHB.LJJZZI(c1457070o1J.LIZ)) {
            sb.append("_ImageMode");
        }
        if (c1457070o1J.LIZIZ != null) {
            sb.append("_veEditor");
            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
            sbLIZ9.append("_NLEModel");
            InterfaceC1452170ntP interfaceC1452170ntP = c1457070o1J.LIZIZ;
            if (interfaceC1452170ntP != null && (nLEModelLIZ = C352130DrH.LIZ(interfaceC1452170ntP)) != null && (string = nLEModelLIZ.toString()) != null) {
                numValueOf = Integer.valueOf(string.hashCode());
            }
            sbLIZ9.append(numValueOf);
            sb.append(C2188811AlT.LIZIZ(sbLIZ9));
            StringBuilder sbLIZ10 = C2188811AlT.LIZ();
            sbLIZ10.append("_type");
            if (c1457070o1J.LJIILJJIL == null) {
                if (c1457070o1J.LIZIZ == null) {
                    i = 3;
                }
            } else {
                i = 2;
            }
            sbLIZ10.append(i);
            sb.append(C2188811AlT.LIZIZ(sbLIZ10));
            if (c1457070o1J.LJIILIIL) {
                sb.append("_getCoverWithoutSeek");
            }
        } else {
            sb.append("_VEUtils");
            if (c1457070o1J.LJIILL) {
                sb.append("_extractFromVideoFile");
            } else {
                sb.append("_extractFromRecordData");
            }
        }
        return sb.toString();
    }

    public static void LIZ(String str, C1457070o1J c1457070o1J, AbstractC20178613xQ abstractC20178613xQ) {
        long j;
        try {
            if (abstractC20178613xQ.LIZ && c1457070o1J != null) {
                if (c1457070o1J.LJIIIZ) {
                    j = C20180413xi.LIZ;
                } else if (C1428470nHB.LJJZZI(c1457070o1J.LIZ)) {
                    j = C20180413xi.LIZJ;
                } else if (c1457070o1J.LIZIZ != null) {
                    j = C20180413xi.LIZIZ;
                } else if (c1457070o1J.LJIILL) {
                    j = C20180413xi.LJ;
                } else {
                    j = C20180413xi.LIZLLL;
                }
                if (j > 0) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(abstractC20178613xQ.LIZJ);
                    linkedHashMap.put("from_cache", Boolean.TRUE);
                    linkedHashMap.put("save_path", c1457070o1J.LIZLLL);
                    C1420780n4m c1420780n4m = new C1420780n4m(abstractC20178613xQ.LIZIZ, linkedHashMap);
                    C2092008Hm<String, C20181013xo> c2092008Hm = LIZJ;
                    C20181013xo c20181013xo = new C20181013xo(c1420780n4m, System.currentTimeMillis() + j);
                    synchronized (c2092008Hm) {
                        try {
                            c2092008Hm.LIZ.put(str, c20181013xo);
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                }
            }
        } catch (Exception th) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.Long r13, java.lang.String r14, X.InterfaceC1364105Vn r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof X.C20180113xf
            if (r0 == 0) goto L21
            r4 = r15
            X.13xf r4 = (X.C20180113xf) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L33
            if (r0 != r3) goto L2b
            goto L27
        L21:
            X.13xf r4 = new X.13xf
            r4.<init>(r12, r15)
            goto L12
        L27:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> La8
            return r1
        L2b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L33:
            X.C155000ia.LIZIZ(r1)
            X.08Hm<java.lang.String, X.13xo> r9 = X.C20179113xV.LIZJ     // Catch: java.lang.Exception -> La8
            monitor-enter(r9)     // Catch: java.lang.Exception -> La8
            X.084e r0 = r9.LIZ     // Catch: java.lang.Throwable -> La2
            java.lang.Object r8 = r0.get(r14)     // Catch: java.lang.Throwable -> La2
            monitor-exit(r9)     // Catch: java.lang.Exception -> La8
            X.13xo r8 = (X.C20181013xo) r8     // Catch: java.lang.Exception -> La8
            r7 = 0
            if (r8 == 0) goto L63
            long r10 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> La8
            long r0 = r8.LIZIZ     // Catch: java.lang.Exception -> La8
            int r6 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r6 <= 0) goto L50
            goto L52
        L50:
            r0 = 0
            goto L53
        L52:
            r0 = 1
        L53:
            if (r0 != 0) goto L5d
            java.lang.String r0 = "result-cache"
            X.C20178313xN.LIZIZ(r14, r0, r3)     // Catch: java.lang.Exception -> La8
            X.13xQ r0 = r8.LIZ     // Catch: java.lang.Exception -> La8
            return r0
        L5d:
            java.lang.Object r0 = r9.LIZ(r14)     // Catch: java.lang.Exception -> La8
            X.13xo r0 = (X.C20181013xo) r0     // Catch: java.lang.Exception -> La8
        L63:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.13xj> r9 = X.C20179113xV.LIZIZ     // Catch: java.lang.Exception -> La8
            java.lang.Object r8 = r9.get(r14)     // Catch: java.lang.Exception -> La8
            X.13xj r8 = (X.C20180513xj) r8     // Catch: java.lang.Exception -> La8
            if (r8 == 0) goto L99
            long r10 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> La8
            long r0 = r8.LIZIZ     // Catch: java.lang.Exception -> La8
            long r10 = r10 - r0
            long r0 = r8.LIZJ     // Catch: java.lang.Exception -> La8
            int r6 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r6 <= 0) goto L7b
            goto L7d
        L7b:
            r0 = 0
            goto L7e
        L7d:
            r0 = 1
        L7e:
            if (r0 != 0) goto L99
            java.lang.String r0 = "active-request"
            X.C20178313xN.LIZIZ(r14, r0, r3)     // Catch: java.lang.Exception -> La8
            if (r13 == 0) goto L88
            goto L8b
        L88:
            long r0 = r8.LIZJ     // Catch: java.lang.Exception -> La8
            goto L8f
        L8b:
            long r0 = r13.longValue()     // Catch: java.lang.Exception -> La8
        L8f:
            r4.LLILLL = r3     // Catch: java.lang.Exception -> La8
            java.lang.Object r1 = r12.LIZLLL(r0, r14, r4)     // Catch: java.lang.Exception -> La8
            if (r1 != r5) goto L98
            return r5
        L98:
            return r1
        L99:
            if (r8 == 0) goto L9e
            r9.remove(r14)     // Catch: java.lang.Exception -> La8
        L9e:
            X.C20178313xN.LIZIZ(r14, r2, r7)     // Catch: java.lang.Exception -> La8
            return r2
        La2:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> La2
            monitor-exit(r9)     // Catch: java.lang.Exception -> La8
            throw r0     // Catch: java.lang.Exception -> La8
        La8:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20179113xV.LIZIZ(java.lang.Long, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(long r11, java.lang.String r13, X.InterfaceC1364105Vn r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof X.C20180213xg
            if (r0 == 0) goto L23
            r6 = r14
            X.13xg r6 = (X.C20180213xg) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r1 = r6.LLILLJJLI
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r5 = 1
            r3 = 0
            if (r0 == 0) goto L31
            if (r0 != r5) goto L29
            java.lang.Object r13 = r6.LL
            goto L61
        L23:
            X.13xg r6 = new X.13xg
            r6.<init>(r10, r14)
            goto L12
        L29:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L31:
            X.C155000ia.LIZIZ(r1)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.13xj> r0 = X.C20179113xV.LIZIZ
            java.lang.Object r4 = r0.get(r13)
            X.13xj r4 = (X.C20180513xj) r4
            if (r4 == 0) goto L7a
            long r8 = java.lang.System.currentTimeMillis()
            long r0 = r4.LIZIZ
            long r8 = r8 - r0
            long r1 = r4.LIZJ
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L4f
            r0 = 1
        L4c:
            if (r0 != 0) goto L7a
            goto L51
        L4f:
            r0 = 0
            goto L4c
        L51:
            X.0Ck6 r0 = new X.0Ck6     // Catch: X.C094W -> L67 java.lang.Exception -> L71
            r0.<init>(r4, r3)     // Catch: X.C094W -> L67 java.lang.Exception -> L71
            r6.LL = r13     // Catch: X.C094W -> L67 java.lang.Exception -> L71
            r6.LLILZ = r5     // Catch: X.C094W -> L67 java.lang.Exception -> L71
            java.lang.Object r1 = X.C099A.LIZIZ(r11, r0, r6)     // Catch: X.C094W -> L67 java.lang.Exception -> L71
            if (r1 != r7) goto L64
            return r7
        L61:
            X.C155000ia.LIZIZ(r1)     // Catch: X.C094W -> L67 java.lang.Exception -> L71
        L64:
            X.13xQ r1 = (X.AbstractC20178613xQ) r1     // Catch: X.C094W -> L67 java.lang.Exception -> L71
            return r1
        L67:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.13xj> r0 = X.C20179113xV.LIZIZ
            r0.remove(r13)
            return r3
        L71:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.13xj> r0 = X.C20179113xV.LIZIZ
            r0.remove(r13)
        L7a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20179113xV.LIZLLL(long, java.lang.String, X.05Vn):java.lang.Object");
    }
}
