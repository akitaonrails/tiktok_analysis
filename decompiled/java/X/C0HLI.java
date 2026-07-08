package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.creation.config.DMUploadImageResult;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureHandler;
import com.ss.android.vesdk.algorithm.VEFaceExpressionDetectResult;
import com.ss.android.vesdk.algorithm.s;
import com.ss.android.vesdk.bachfaceinfo.VEFaceAttribute;
import com.ss.android.vesdk.bachfaceinfo.VEFaceAttributeInfo;
import com.ss.android.vesdk.bachfaceinfo.VEFaceDetect;
import com.ss.android.vesdk.bachfaceinfo.VEFaceDetectInfo;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0HLI, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HLI {
    public static final C0HLI LIZ = new C0HLI();
    public static final C0HMP LIZIZ = C0HMP.LIZ;
    public static int LIZJ;

    /* JADX WARN: Removed duplicated region for block: B:35:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(X.InterfaceC1364105Vn<? super X.C0HLS> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C0HLP
            if (r0 == 0) goto L69
            r6 = r8
            X.0HLP r6 = (X.C0HLP) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L69
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r2 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L46
            if (r0 != r3) goto L75
            X.C155000ia.LIZIZ(r2)
        L23:
            X.0HKO r2 = (X.C0HKO) r2
        L25:
            if (r2 == 0) goto L3c
            X.0HHM r1 = r2.LIZLLL
            X.0HHM r0 = X.C0HHM.ERROR
            if (r1 != r0) goto L3c
            X.0HHO r0 = r2.LJ
            if (r0 != 0) goto L3d
            r1 = -1
        L32:
            if (r1 == r3) goto L72
            r0 = 2
            if (r1 == r0) goto L6f
            r0 = 3
            if (r1 != r0) goto L3c
            X.0HLS r4 = X.C0HLS.INTERNAL
        L3c:
            return r4
        L3d:
            int[] r1 = X.C0HHR.LIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            goto L32
        L46:
            X.C155000ia.LIZIZ(r2)
            X.0HMP r0 = X.C0HLI.LIZIZ
            r0.getClass()
            X.0HHB r2 = X.C0HHB.LIZ
            X.0HFK r1 = X.C0HFK.SOCIAL_AVATAR
            monitor-enter(r2)
            java.util.Map<X.0HFK, X.0HHS> r0 = X.C0HHB.LIZIZ     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L7d
            X.0HHS r0 = (X.C0HHS) r0     // Catch: java.lang.Throwable -> L7d
            monitor-exit(r2)
            if (r0 == 0) goto L67
            r6.LLILLL = r3
            X.0HKO r2 = r0.getProgress()
            if (r2 != r5) goto L23
            return r5
        L67:
            r2 = r4
            goto L25
        L69:
            X.0HLP r6 = new X.0HLP
            r6.<init>(r7, r8)
            goto L12
        L6f:
            X.0HLS r4 = X.C0HLS.FACE_DETECTION
            return r4
        L72:
            X.0HLS r4 = X.C0HLS.TNS_CHECK
            return r4
        L75:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L7d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HLI.LJII(X.05Vn):java.lang.Object");
    }

    public static void LJIIJ(EnumC439310HKn enumC439310HKn, String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("start_method", enumC439310HKn.getParam());
        c2344009Gk.LJIIIIZZ("outcome", str);
        c2344009Gk.LIZJ(LIZJ, "attempts");
        C20684815ws.LJIILLIIL("social_avatar_input_tns_check", c2344009Gk.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r6, X.InterfaceC1364105Vn<? super java.lang.String> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C0HLN
            if (r0 == 0) goto L35
            r4 = r7
            X.0HLN r4 = (X.C0HLN) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L35
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L23
            if (r0 != r2) goto L3b
            X.C155000ia.LIZIZ(r1)
        L22:
            return r1
        L23:
            X.C155000ia.LIZIZ(r1)
            X.0HLO r1 = new X.0HLO
            r0 = 0
            r1.<init>(r6, r0)
            r4.LLILLL = r2
            java.lang.Object r1 = X.C2296808zG.LJ(r1, r4)
            if (r1 != r3) goto L22
            return r3
        L35:
            X.0HLN r4 = new X.0HLN
            r4.<init>(r5, r7)
            goto L12
        L3b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HLI.LIZJ(java.lang.String, X.05Vn):java.lang.Object");
    }

    public static Pair LJIIIIZZ(String str, EnumC2219708mp enumC2219708mp, boolean z) throws Throwable {
        s sVar;
        VEFaceExpressionDetectResult vEFaceExpressionDetectResult;
        VEFaceDetect[] info;
        VEFaceDetect vEFaceDetect;
        VEFaceAttribute[] info2;
        VEFaceAttribute vEFaceAttribute;
        String str2;
        VEFaceDetect[] info3;
        VEFaceDetect[] info4;
        C439450HLb c439450HLb = new C439450HLb("{\"version\":\"1.0\",\"mode\":2,\"name\":\"AlgorithmGraph_XycsbOBc\",\"model_names\":{\"alg_model\":[\"tt_face\",\"tt_face_attribute_age\",\"tt_face_extra\",\"tt_face_attribute_exp\"]},\"nodes\":[{\"name\":\"blit_0\",\"type\":\"blit\",\"config\":{\"size\":{\"width\":360,\"height\":640},\"keyMaps\":{\"intParam\":{},\"floatParam\":{},\"stringParam\":{},\"pathParam\":{}}}},{\"name\":\"expression_detect_0\",\"type\":\"expression_detect\",\"config\":{\"keyMaps\":{\"intParam\":{\"face_attr_detect_ability\":23,\"face_attr_force_detect\":1},\"floatParam\":{},\"stringParam\":{},\"pathParam\":{}}}},{\"name\":\"face_0\",\"type\":\"face\",\"config\":{\"keyMaps\":{\"intParam\":{\"face_max_num\":10,\"face_fast_mode\":0,\"face_detect_mode\":262144,\"face_detect_ability\":2304},\"floatParam\":{},\"stringParam\":{},\"pathParam\":{}}}}],\"links\":[{\"fromNode\":\"blit_0\",\"fromIndex\":0,\"toNode\":\"expression_detect_0\",\"toIndex\":0},{\"fromNode\":\"blit_0\",\"fromIndex\":0,\"toNode\":\"face_0\",\"toIndex\":0},{\"fromNode\":\"face_0\",\"fromIndex\":0,\"toNode\":\"expression_detect_0\",\"toIndex\":1}]}");
        Bitmap bitmapLIZLLL = C2471909mP.LIZLLL(str, null);
        if (bitmapLIZLLL != null) {
            c439450HLb.bitmap = bitmapLIZLLL;
            List<s> listScanPicture = TEVideoUtils.scanPicture(c439450HLb);
            int length = 0;
            if (listScanPicture != null) {
                sVar = (s) C13LP.LJJJLZIJ(0, listScanPicture);
            } else {
                sVar = null;
            }
            if ((sVar instanceof VEFaceExpressionDetectResult) && (vEFaceExpressionDetectResult = (VEFaceExpressionDetectResult) sVar) != null) {
                VEFaceDetectInfo faceDetectInfo = vEFaceExpressionDetectResult.getFaceDetectInfo();
                if (faceDetectInfo != null && (info3 = faceDetectInfo.getInfo()) != null && info3.length > 1) {
                    EnumC439400HKw enumC439400HKw = EnumC439400HKw.FAILURE_IMAGE_NO_FACE;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("VEFaceDetectInfo wrong size:");
                    VEFaceDetectInfo faceDetectInfo2 = vEFaceExpressionDetectResult.getFaceDetectInfo();
                    if (faceDetectInfo2 != null && (info4 = faceDetectInfo2.getInfo()) != null) {
                        length = info4.length;
                    }
                    sbLIZ.append(length);
                    throw new C0HKR(enumC439400HKw, C2188811AlT.LIZIZ(sbLIZ));
                }
                VEFaceAttributeInfo faceAttributeInfo = vEFaceExpressionDetectResult.getFaceAttributeInfo();
                VEFaceDetectInfo faceDetectInfo3 = vEFaceExpressionDetectResult.getFaceDetectInfo();
                if (faceDetectInfo3 != null && (info = faceDetectInfo3.getInfo()) != null && (vEFaceDetect = (VEFaceDetect) C13LQ.LJJIIZ(0, info)) != null) {
                    RectF rectF = vEFaceDetect.getRectF();
                    if (rectF != null) {
                        if (faceAttributeInfo != null && (info2 = faceAttributeInfo.getInfo()) != null && (vEFaceAttribute = (VEFaceAttribute) C13LQ.LJJIIZ(0, info2)) != null) {
                            if (enumC2219708mp == EnumC2219708mp.ALL) {
                                if (C439490HLf.LJFF.LIZIZ(null, vEFaceDetect.getPitch(), vEFaceDetect.getRoll(), vEFaceDetect.getYaw())) {
                                    boolean zLIZIZ = C439560HLm.LIZIZ(vEFaceAttribute.getExpProbs()[vEFaceAttribute.getExpType()], vEFaceAttribute.getExpProbs()[6], vEFaceAttribute.getExpType());
                                    C439470HLd c439470HLd = C439470HLd.LIZ;
                                    int expType = vEFaceAttribute.getExpType();
                                    float[] expProbs = vEFaceAttribute.getExpProbs();
                                    if (z) {
                                        str2 = "manual_shoot";
                                    } else {
                                        str2 = "upload_image";
                                    }
                                    c439470HLd.getClass();
                                    C439470HLd.LIZLLL(expType, expProbs, zLIZIZ, str2);
                                    boolean zLIZ = C439560HLm.LIZ(vEFaceAttribute.getExpProbs());
                                    if (!zLIZIZ && !zLIZ) {
                                        throw new C0HKR(EnumC439400HKw.FAILURE_IMAGE_NOT_NEUTRAL, "not neutral");
                                    }
                                } else {
                                    throw new C0HKR(EnumC439400HKw.FAILURE_IMAGE_HEADSHOT_NEEDED, "headshot needed");
                                }
                            }
                            return new Pair(Float.valueOf(vEFaceAttribute.getBoyProb()), rectF);
                        }
                        throw new C0HKR(EnumC439400HKw.FAILURE_IMAGE_NO_FACE, "VEFaceAttribute is null");
                    }
                    throw new C0HKR(EnumC439400HKw.FAILURE_IMAGE_NO_FACE, "FaceRectF is null");
                }
                throw new C0HKR(EnumC439400HKw.FAILURE_IMAGE_NO_FACE, "VEFaceDetect is null");
            }
            throw new C0HKR(EnumC439400HKw.FAILURE_IMAGE_NO_FACE, "VEFaceExpressionDetectResult is null");
        }
        throw new C0HKR(EnumC439400HKw.FAILURE_IMAGE_NO_FACE, "Bitmap is null");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.util.List<com.ss.android.ugc.aweme.creation.config.DMUploadImageResult> r23, X.EnumC439310HKn r24, java.lang.String r25, X.InterfaceC1364105Vn<? super java.util.List<com.ss.android.ugc.aweme.creation.config.DMUploadImageResult>> r26) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HLI.LIZ(java.util.List, X.0HKn, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00da A[Catch: Exception -> 0x00ea, 0HLY -> 0x00ec, 0HKp -> 0x0132, TryCatch #4 {0HKp -> 0x0132, blocks: (B:35:0x00e0, B:36:0x00e3, B:16:0x0056, B:29:0x009d, B:30:0x00c4, B:32:0x00da, B:18:0x006b, B:25:0x007a, B:26:0x007e), top: B:76:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0147  */
    /* JADX WARN: Type inference failed for: r13v1, types: [X.0HKo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJJI(java.lang.String[] r25, java.lang.String r26, boolean r27, X.InterfaceC1364105Vn<? super java.util.List<com.ss.android.ugc.aweme.creation.config.DMUploadImageResult>> r28) {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HLI.LJIIJJI(java.lang.String[], java.lang.String, boolean, X.05Vn):java.lang.Object");
    }

    public static void LJIIIZ(InterfaceC497601wk interfaceC497601wk, String str, Function2 function2, Function1 function1, Function1 function12) {
        if (str != null) {
            LIZIZ.getClass();
            C0HMP.LIZLLL = str;
            C0HMP.LIZJ().storeString(C0HMP.LJ("key_aimoji_task_id"), C0HMP.LIZLLL);
        }
        IMStickerApi.LIZ.LIZIZ().getImSocialAvatarService().LJJIIZ(null);
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C0HKN(str, function12, function1, function2, null), 3);
    }

    public final Object LIZIZ(String str, String str2, RectF rectF, String str3, boolean z, InterfaceC1364105Vn<? super List<DMUploadImageResult>> interfaceC1364105Vn) throws Throwable {
        String str4;
        boolean zLIZ;
        String str5;
        boolean zLIZ2;
        String str6;
        boolean zLIZ3;
        String str7 = "manual_shoot";
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zLIZ4 = false;
        try {
            try {
                C0HYP c0hyp = C0HYP.LIZ;
                C0HLR c0hlr = C0HLR.CROP;
                c0hyp.getClass();
                C0HYP.LJI(c0hlr);
                C0HWW c0hww = C0HWW.LIZ;
                if (z) {
                    str4 = "manual_shoot";
                } else {
                    str4 = "upload_image";
                }
                if (str3 == null) {
                    zLIZ = false;
                } else {
                    zLIZ = C1956107lP.LIZ(str3);
                }
                c0hww.getClass();
                C0HWW.LJJIII("start", str4, zLIZ, "crop", null, null);
                Bitmap bitmapLIZLLL = C2471909mP.LIZLLL(str2, null);
                if (bitmapLIZLLL == null) {
                    if (z) {
                        str6 = "manual_shoot";
                    } else {
                        str6 = "upload_image";
                    }
                    if (str3 == null) {
                        zLIZ3 = false;
                    } else {
                        zLIZ3 = C1956107lP.LIZ(str3);
                    }
                    C0HWW.LJJIII("fail", str6, zLIZ3, "crop", Float.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime), "Bitmap is null");
                    throw new RuntimeException() { // from class: X.0HKJ
                        public static final int $stable = 8;
                    };
                }
                int width = bitmapLIZLLL.getWidth();
                float f = 1 - rectF.bottom;
                if (f > 1.0f) {
                    f = 1.0f;
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapLIZLLL, 0, 0, width, (int) (f * bitmapLIZLLL.getHeight()));
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapLIZLLL.getWidth(), bitmapLIZLLL.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap2);
                canvas.drawColor(-16777216);
                canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, (Paint) null);
                C448800Hio c448800Hio = AIGCPictureHandler.Companion;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('/');
                sbLIZ.append(str.hashCode());
                sbLIZ.append("_crop.jpeg");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c448800Hio.getClass();
                String strLIZ = C448800Hio.LIZ(strLIZIZ);
                C2477909nN.LJI(bitmapCreateBitmap2, strLIZ, null, 0, 6);
                if (z) {
                    str5 = "manual_shoot";
                } else {
                    str5 = "upload_image";
                }
                if (str3 == null) {
                    zLIZ2 = false;
                } else {
                    zLIZ2 = C1956107lP.LIZ(str3);
                }
                try {
                    Float fValueOf = Float.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime);
                    c0hww.getClass();
                    C0HWW.LJJIII("success", str5, zLIZ2, "crop", fValueOf, null);
                    return LJIIJJI(new String[]{str, str2, strLIZ}, str3, z, interfaceC1364105Vn);
                } catch (Exception e) {
                    e = e;
                    zLIZ4 = false;
                    TryCatchGuardChecker.doCheck(e);
                    C0HWW c0hww2 = C0HWW.LIZ;
                    if (!z) {
                        str7 = "upload_image";
                    }
                    if (str3 != null) {
                        zLIZ4 = C1956107lP.LIZ(str3);
                    }
                    Float fValueOf2 = Float.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime);
                    String message = e.getMessage();
                    if (message == null) {
                        message = e.getClass().getSimpleName();
                    }
                    c0hww2.getClass();
                    C0HWW.LJJIII("fail", str7, zLIZ4, "crop", fValueOf2, message);
                    throw new RuntimeException() { // from class: X.0HKJ
                        public static final int $stable = 8;
                    };
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (C0HKJ e3) {
            TryCatchGuardChecker.doCheck(e3);
            throw e3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.lang.String r26, java.lang.String r27, boolean r28, boolean r29, X.EnumC2219708mp r30, X.InterfaceC1364105Vn<? super X.C443120HZe<java.lang.String, java.lang.Float, ? extends android.graphics.RectF>> r31) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HLI.LIZLLL(java.lang.String, java.lang.String, boolean, boolean, X.08mp, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x0233  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.C0HL8 r33, X.InterfaceC497601wk r34, java.util.List<com.ss.android.ugc.aweme.creation.config.DMUploadImageResult> r35, double r36, java.lang.String r38, java.lang.String r39, boolean r40, int r41, kotlin.jvm.functions.Function2<? super X.EnumC439280HKk, ? super X.C0HKO, kotlin.Unit> r42, kotlin.jvm.functions.Function1<? super X.EnumC439250HKh, kotlin.Unit> r43, kotlin.jvm.functions.Function1<? super X.EnumC439240HKg, kotlin.Unit> r44, X.InterfaceC1364105Vn<? super kotlin.Unit> r45) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HLI.LJFF(X.0HL8, X.01wk, java.util.List, double, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }
}
