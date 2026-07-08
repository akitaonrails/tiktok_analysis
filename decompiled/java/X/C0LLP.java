package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.aigc.asynctask.FaceDetectTaskOutput;
import com.ss.android.vesdk.algorithm.VEBachAlgorithmParam;
import com.ss.android.vesdk.algorithm.VEFaceDetectResult;
import com.ss.android.vesdk.algorithm.s;
import com.ss.android.vesdk.bachfaceinfo.VEFaceDetect;
import com.ss.android.vesdk.bachfaceinfo.VEFaceDetectInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0LLP, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LLP extends C0LTN<C09JG, FaceDetectTaskOutput> {
    public static final List<String> LJIIJJI = C1697810uHb.LJIIJJI("tt_face", "tt_face_extra");
    public final String LJIIIIZZ = C0LM5.FACE_DETECT.getTypeName();
    public final String LJIIIZ = C0LMI.FACE_DETECT.getType();
    public boolean LJIIJ;

    @Override // X.C0LTN
    public final String LJIL() {
        return this.LJIIIZ;
    }

    @Override // X.C0LTN
    public final String LJJ() {
        return this.LJIIIIZZ;
    }

    public static FaceDetectTaskOutput LJJJJJL(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(1);
        }
        return new FaceDetectTaskOutput("FAILED", 0, null, arrayList, 0L, false, null, 118, null);
    }

    public final int LJJJJL(Bitmap bitmap) {
        int length;
        VEFaceDetectResult vEFaceDetectResult;
        VEFaceDetectInfo faceDetectInfo;
        VEFaceDetect[] info;
        try {
            VEBachAlgorithmParam vEBachAlgorithmParam = new VEBachAlgorithmParam();
            vEBachAlgorithmParam.setAlgorithmType(0);
            vEBachAlgorithmParam.bitmap = bitmap;
            vEBachAlgorithmParam.algorithmConfig = "\n            {\n              \"version\": \"1.0\",\n              \"mode\": 2,\n              \"name\": \"AlgorithmGraph_XycsbOBcxcvn\",\n              \"model_names\": {\n                \"alg_model\": [\"tt_face\", \"tt_face_extra\"]\n              },\n              \"nodes\": [\n                {\n                  \"name\": \"blit_0\",\n                  \"type\": \"blit\",\n                  \"config\": {\n                    \"size\": {\"width\": 360, \"height\": 640},\n                    \"keyMaps\": {\n                      \"intParam\": {}, \"floatParam\": {},\n                      \"stringParam\": {}, \"pathParam\": {}\n                    }\n                  }\n                },\n                {\n                  \"name\": \"face_0\",\n                  \"type\": \"face\",\n                  \"config\": {\n                    \"keyMaps\": {\n                      \"intParam\": {\n                        \"face_detect_mode\": 262144,\n                        \"face_detect_ability\": 1\n                      },\n                      \"floatParam\": {},\n                      \"stringParam\": {},\n                      \"pathParam\": {}\n                    }\n                  }\n                }\n              ],\n              \"links\": [\n                {\"fromNode\": \"blit_0\", \"fromIndex\": 0, \"toNode\": \"face_0\", \"toIndex\": 0}\n              ]\n            }\n        ";
            List<s> listScanPicture = TEVideoUtils.scanPicture(vEBachAlgorithmParam);
            if (listScanPicture != null && !listScanPicture.isEmpty()) {
                Object objLJJJLZIJ = C13LP.LJJJLZIJ(0, listScanPicture);
                if ((objLJJJLZIJ instanceof VEFaceDetectResult) && (vEFaceDetectResult = (VEFaceDetectResult) objLJJJLZIJ) != null && (faceDetectInfo = vEFaceDetectResult.getFaceDetectInfo()) != null && (info = faceDetectInfo.getInfo()) != null) {
                    length = info.length;
                } else {
                    length = 1;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("FaceDetectTask: Successfully detected ");
                sbLIZ.append(length);
                sbLIZ.append(" faces");
                LJJJJIZL(C2188811AlT.LIZIZ(sbLIZ));
                return length;
            }
            LJJJJIZL("FaceDetectTask: Face detection returned empty results");
            return 1;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("FaceDetectTask: Face detection scan failed: ");
            sbLIZ2.append(e.getMessage());
            LJJJJJ(C2188811AlT.LIZIZ(sbLIZ2));
            return 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJLL(X.InterfaceC1364105Vn<? super java.lang.Boolean> r14) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LLP.LJJJJLL(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJLL(X.InterfaceC1364105Vn r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof X.C0LLS
            r4 = r11
            if (r0 == 0) goto L42
            r9 = r12
            X.0LLS r9 = (X.C0LLS) r9
            int r2 = r9.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L42
            int r2 = r2 - r1
            r9.LLILLL = r2
        L13:
            java.lang.Object r3 = r9.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r9.LLILLL
            r1 = 1
            if (r0 == 0) goto L29
            if (r0 != r1) goto L48
            X.C155000ia.LIZIZ(r3)
        L23:
            r0 = 0
            com.ss.android.ugc.aweme.aigc.asynctask.FaceDetectTaskOutput r0 = LJJJJJL(r0)
            return r0
        L29:
            X.C155000ia.LIZIZ(r3)
            java.lang.String r0 = "FaceDetectTask: Task timeout after 60000ms"
            r4.LJJJJJ(r0)
            java.lang.String r6 = "Task execution timeout"
            r7 = 0
            r10 = 12
            r9.LLILLL = r1
            r5 = 7003(0x1b5b, float:9.813E-42)
            r8 = r7
            java.lang.Object r0 = X.C539400LDm.LIZ(r4, r5, r6, r7, r8, r9, r10)
            if (r0 != r2) goto L23
            return r2
        L42:
            X.0LLS r9 = new X.0LLS
            r9.<init>(r4, r12)
            goto L13
        L48:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LLP.LJJJLL(X.05Vn):java.lang.Object");
    }

    public final Bitmap LJJJZ(String str) {
        int i;
        float f;
        C0VSJ c0vsj = new C0VSJ(str);
        if (!c0vsj.exists()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("FaceDetectTask: Image file does not exist: ");
            sbLIZ.append(str);
            LJJJJJ(C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            C0VSP c0vsp = new C0VSP(c0vsj);
            try {
                BitmapFactory.decodeStream(c0vsp, null, options);
                C2107108Nh.LIZ(c0vsp, null);
                int i2 = options.outWidth;
                if (i2 > 0 && (i = options.outHeight) > 0) {
                    int iMax = Math.max(i2, i);
                    if (iMax > 360) {
                        f = 360.0f / iMax;
                    } else {
                        f = 1.0f;
                    }
                    Pair pair = new Pair(Integer.valueOf(C814420VxA.LIZIZ(i2 * f)), Integer.valueOf(C814420VxA.LIZIZ(i * f)));
                    int iIntValue = ((Number) pair.getFirst()).intValue();
                    int iIntValue2 = ((Number) pair.getSecond()).intValue();
                    Bitmap bitmapLJJJLZIJ = LJJJLZIJ(c0vsj, options);
                    if (bitmapLJJJLZIJ == null) {
                        return null;
                    }
                    if (bitmapLJJJLZIJ.getWidth() == iIntValue && bitmapLJJJLZIJ.getHeight() == iIntValue2) {
                        return bitmapLJJJLZIJ;
                    }
                    Matrix matrix = new Matrix();
                    matrix.postScale(iIntValue / bitmapLJJJLZIJ.getWidth(), iIntValue2 / bitmapLJJJLZIJ.getHeight());
                    return Bitmap.createBitmap(bitmapLJJJLZIJ, 0, 0, bitmapLJJJLZIJ.getWidth(), bitmapLJJJLZIJ.getHeight(), matrix, true);
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("FaceDetectTask: Invalid image dimensions: ");
                sbLIZ2.append(str);
                LJJJJJ(C2188811AlT.LIZIZ(sbLIZ2));
                return null;
            } catch (Throwable th) {
                th = th;
                try {
                    TryCatchGuardChecker.doCheck(th);
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                        while (true) {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                try {
                                    C2107108Nh.LIZ(c0vsp, th);
                                    throw th;
                                } catch (Exception e) {
                                    e = e;
                                    TryCatchGuardChecker.doCheck(e);
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("FaceDetectTask: Failed to load bitmap: ");
                                    sbLIZ3.append(str);
                                    sbLIZ3.append(", error: ");
                                    sbLIZ3.append(e.getMessage());
                                    LJJJJJ(C2188811AlT.LIZIZ(sbLIZ3));
                                    return null;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    th = null;
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:20:0x003b
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static android.graphics.Bitmap LJJJLZIJ(X.C0VSJ r5, android.graphics.BitmapFactory.Options r6) {
        /*
            int r1 = r6.outWidth
            int r0 = r6.outHeight
            r4 = 720(0x2d0, float:1.009E-42)
            r3 = 1
            if (r0 > r4) goto Lb
            if (r1 <= r4) goto L1a
        Lb:
            int r2 = r0 / 2
            int r1 = r1 / 2
        Lf:
            int r0 = r2 / r3
            if (r0 < r4) goto L1a
            int r0 = r1 / r3
            if (r0 < r4) goto L1a
            int r3 = r3 * 2
            goto Lf
        L1a:
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options
            r1.<init>()
            r1.inSampleSize = r3
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            r1.inPreferredConfig = r0
            X.0VSP r3 = new X.0VSP
            r3.<init>(r5)
            r2 = 0
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r3, r2, r1)     // Catch: java.lang.Throwable -> L33
            X.C2107108Nh.LIZ(r3, r2)
            return r0
        L33:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L3b
            throw r1     // Catch: java.lang.Throwable -> L38
        L38:
            r0 = move-exception
            r2 = r1
            goto L3c
        L3b:
            r0 = move-exception
        L3c:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L3b
            X.C2107108Nh.LIZ(r3, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LLP.LJJJLZIJ(X.0VSJ, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
    @Override // X.C0LTN, X.InterfaceC542770LQl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.C09JG r13, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.aigc.asynctask.FaceDetectTaskOutput> r14) {
        /*
            r12 = this;
            r8 = r13
            boolean r0 = r14 instanceof X.C0LLM
            r7 = r12
            if (r0 == 0) goto L75
            r4 = r14
            X.0LLM r4 = (X.C0LLM) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L75
            int r2 = r2 - r1
            r4.LLILZ = r2
        L14:
            java.lang.Object r6 = r4.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r3 = 3
            r2 = 2
            r1 = 1
            r11 = 0
            if (r0 == 0) goto L2f
            if (r0 == r1) goto L2c
            if (r0 == r2) goto L83
            if (r0 != r3) goto L7b
            X.C155000ia.LIZIZ(r6)
        L2b:
            return r6
        L2c:
            com.ss.android.ugc.aweme.aigc.asynctask.FaceDetectTaskInput r8 = r4.LL
            goto L51
        L2f:
            X.C155000ia.LIZIZ(r6)
            long r9 = java.lang.System.currentTimeMillis()
            boolean r0 = r8 instanceof com.ss.android.ugc.aweme.aigc.asynctask.FaceDetectTaskInput
            if (r0 == 0) goto L3d
            com.ss.android.ugc.aweme.aigc.asynctask.FaceDetectTaskInput r8 = (com.ss.android.ugc.aweme.aigc.asynctask.FaceDetectTaskInput) r8
            goto L3e
        L3d:
            r8 = r11
        L3e:
            X.0LLL r6 = new X.0LLL     // Catch: java.lang.Exception -> L57 X.C094W -> L66
            r6.<init>(r7, r8, r9, r11)     // Catch: java.lang.Exception -> L57 X.C094W -> L66
            r4.LL = r8     // Catch: java.lang.Exception -> L57 X.C094W -> L66
            r4.LLILZ = r1     // Catch: java.lang.Exception -> L57 X.C094W -> L66
            r0 = 60000(0xea60, double:2.9644E-319)
            java.lang.Object r6 = X.C099A.LIZIZ(r0, r6, r4)     // Catch: java.lang.Exception -> L57 X.C094W -> L66
            if (r6 != r5) goto L54
            goto L87
        L51:
            X.C155000ia.LIZIZ(r6)     // Catch: java.lang.Exception -> L57 X.C094W -> L66
        L54:
            com.ss.android.ugc.aweme.aigc.asynctask.FaceDetectTaskOutput r6 = (com.ss.android.ugc.aweme.aigc.asynctask.FaceDetectTaskOutput) r6     // Catch: java.lang.Exception -> L57 X.C094W -> L66
            return r6
        L57:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r4.LL = r11
            r4.LLILZ = r3
            java.lang.Object r6 = r7.LJJJLIIL(r0, r8, r4)
            if (r6 != r5) goto L2b
            return r5
        L66:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r4.LL = r11
            r4.LLILZ = r2
            java.lang.Object r6 = r7.LJJJLL(r4)
            if (r6 != r5) goto L2b
            return r5
        L75:
            X.0LLM r4 = new X.0LLM
            r4.<init>(r7, r14)
            goto L14
        L7b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L83:
            X.C155000ia.LIZIZ(r6)
            return r6
        L87:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LLP.LJFF(X.09JG, X.05Vn):java.lang.Object");
    }

    public final void LJJJJLI(List list, final C23260099m c23260099m) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FaceDetectTask: Downloading models: ");
        sbLIZ.append(list);
        LJJJJIZL(C2188811AlT.LIZIZ(sbLIZ));
        C13Q5.LIZ().LIZ(new String[]{""}, C2097908Jt.LIZJ(new Pair("models", list)), new C13MA<Long>() { // from class: X.0Dwy
            @Override // X.C13MA
            public final void onSuccess(Long l) {
                l.longValue();
                this.LIZ.LJJJJIZL("FaceDetectTask: Models downloaded successfully");
                C2243608qg.LIZ(Boolean.TRUE, c23260099m);
            }

            @Override // X.C13MA
            public final /* bridge */ /* synthetic */ void preProcess(Long l) {
                l.longValue();
            }

            @Override // X.C13MA
            public final void onFail(Long l, C1662010tLr c1662010tLr) {
                C0LLP c0llp = this.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("FaceDetectTask: Model download failed: ");
                sbLIZ2.append(c1662010tLr.LIZIZ);
                c0llp.LJJJJJ(C2188811AlT.LIZIZ(sbLIZ2));
                C2243608qg.LIZ(Boolean.FALSE, c23260099m);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0198 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJZ(com.ss.android.ugc.aweme.aigc.asynctask.FaceDetectTaskInput r46, long r47, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.aigc.asynctask.FaceDetectTaskOutput> r49) {
        /*
            Method dump skipped, instruction units count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LLP.LJJJJZ(com.ss.android.ugc.aweme.aigc.asynctask.FaceDetectTaskInput, long, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJZI(java.lang.String r13, com.ss.android.ugc.aweme.aigc.asynctask.Source r14, X.InterfaceC1364105Vn<? super java.lang.Boolean> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof X.C0LLN
            r5 = r12
            if (r0 == 0) goto L5b
            r10 = r15
            X.0LLN r10 = (X.C0LLN) r10
            int r2 = r10.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5b
            int r2 = r2 - r1
            r10.LLILLL = r2
        L13:
            java.lang.Object r1 = r10.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r10.LLILLL
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L29
            if (r0 != r3) goto L61
            X.C155000ia.LIZIZ(r1)
        L24:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L29:
            X.C155000ia.LIZIZ(r1)
            if (r13 == 0) goto L34
            int r0 = r13.length()
            if (r0 != 0) goto L24
        L34:
            if (r14 == 0) goto L43
            int[] r1 = X.C0LLT.LIZ
            int r0 = r14.ordinal()
            r1 = r1[r0]
            if (r1 == r3) goto L59
            r0 = 2
            if (r1 == r0) goto L59
        L43:
            java.lang.String r0 = "FaceDetectTask: Image URI is null or empty"
            r5.LJJJJJ(r0)
            java.lang.String r7 = "imageUri null"
            r8 = 0
            r11 = 12
            r10.LLILLL = r3
            r6 = 7006(0x1b5e, float:9.817E-42)
            r9 = r8
            java.lang.Object r0 = X.C539400LDm.LIZ(r5, r6, r7, r8, r9, r10, r11)
            if (r0 != r2) goto L24
            return r2
        L59:
            r4 = 1
            goto L24
        L5b:
            X.0LLN r10 = new X.0LLN
            r10.<init>(r5, r15)
            goto L13
        L61:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LLP.LJJJJZI(java.lang.String, com.ss.android.ugc.aweme.aigc.asynctask.Source, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJLIIL(java.lang.Exception r12, com.ss.android.ugc.aweme.aigc.asynctask.FaceDetectTaskInput r13, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.aigc.asynctask.FaceDetectTaskOutput> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof X.C0LLO
            r4 = r11
            if (r0 == 0) goto L75
            r9 = r14
            X.0LLO r9 = (X.C0LLO) r9
            int r2 = r9.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L75
            int r2 = r2 - r1
            r9.LLILZ = r2
        L13:
            java.lang.Object r1 = r9.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r9.LLILZ
            r3 = 1
            if (r0 == 0) goto L36
            if (r0 != r3) goto L7b
            com.ss.android.ugc.aweme.aigc.asynctask.FaceDetectTaskInput r13 = r9.LL
            X.C155000ia.LIZIZ(r1)
        L25:
            if (r13 == 0) goto L34
            java.util.List<java.lang.String> r0 = r13.imageUriList
            if (r0 == 0) goto L34
            int r0 = r0.size()
        L2f:
            com.ss.android.ugc.aweme.aigc.asynctask.FaceDetectTaskOutput r0 = LJJJJJL(r0)
            return r0
        L34:
            r0 = 0
            goto L2f
        L36:
            X.C155000ia.LIZIZ(r1)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "FaceDetectTask: Task execution failed: "
            r1.append(r0)
            java.lang.String r0 = r12.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r4.LJJJJJ(r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Execution exception: "
            r1.append(r0)
            java.lang.String r0 = r12.getMessage()
            r1.append(r0)
            java.lang.String r6 = X.C2188811AlT.LIZIZ(r1)
            r7 = 0
            r10 = 12
            r9.LL = r13
            r9.LLILZ = r3
            r5 = 7003(0x1b5b, float:9.813E-42)
            r8 = r7
            java.lang.Object r0 = X.C539400LDm.LIZ(r4, r5, r6, r7, r8, r9, r10)
            if (r0 != r2) goto L25
            return r2
        L75:
            X.0LLO r9 = new X.0LLO
            r9.<init>(r4, r14)
            goto L13
        L7b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LLP.LJJJLIIL(java.lang.Exception, com.ss.android.ugc.aweme.aigc.asynctask.FaceDetectTaskInput, X.05Vn):java.lang.Object");
    }
}
