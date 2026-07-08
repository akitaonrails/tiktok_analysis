package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.aigc.asynctask.ImagesUploadTaskOutput;
import com.ss.android.ugc.aweme.publish.model.AIGCAvatarAuthConfig;
import com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0LL9, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LL9 extends C0LTN<C0LLA, ImagesUploadTaskOutput> {
    public final String LJIIIIZZ = "ImagesUploadTask";
    public final String LJIIIZ = C0LMI.UPLOAD.getType();

    @Override // X.C0LTN
    public final String LJIL() {
        return this.LJIIIZ;
    }

    @Override // X.C0LTN
    public final String LJJ() {
        return this.LJIIIIZZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJL(X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.publish.model.AIGCAvatarAuthConfig> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C0LLD
            if (r0 == 0) goto L76
            r5 = r8
            X.0LLD r5 = (X.C0LLD) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L76
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r4 = 1
            if (r0 == 0) goto L27
            if (r0 != r4) goto L7c
            X.C155000ia.LIZIZ(r1)
        L22:
            com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig r1 = (com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig) r1
            com.ss.android.ugc.aweme.publish.model.AIGCAvatarAuthConfig r0 = r1.aigcAvatarAuthConfig
            return r0
        L27:
            X.C155000ia.LIZIZ(r1)
            boolean r0 = X.C297690Blf.LIZ()
            if (r0 == 0) goto L40
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            X.0o1f r0 = r0.getAccountService()
            boolean r0 = r0.isLogin()
            if (r0 != 0) goto L40
            r0 = 0
            return r0
        L40:
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            X.0niP r2 = r0.getNetworkService()
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.tools.AVApi> r0 = com.ss.android.ugc.aweme.tools.AVApi.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.tools.AVApi r0 = (com.ss.android.ugc.aweme.tools.AVApi) r0
            java.lang.String r1 = r0.LIZ()
            java.lang.Class<com.ss.android.ugc.aweme.uploader.retrofit.UploaderRetrofitService> r0 = com.ss.android.ugc.aweme.uploader.retrofit.UploaderRetrofitService.class
            java.lang.Object r3 = r2.createRetrofit(r1, r4, r0)
            com.ss.android.ugc.aweme.uploader.retrofit.UploaderRetrofitService r3 = (com.ss.android.ugc.aweme.uploader.retrofit.UploaderRetrofitService) r3
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.String r1 = "purpose"
            java.lang.String r0 = "aigc_avatar"
            r2.<init>(r1, r0)
            java.util.Map r0 = X.C2097908Jt.LIZJ(r2)
            r5.LLILLL = r4
            java.lang.Object r1 = r3.LIZ(r0, r5)
            if (r1 != r6) goto L22
            return r6
        L76:
            X.0LLD r5 = new X.0LLD
            r5.<init>(r7, r8)
            goto L12
        L7c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LL9.LJJJJL(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJJL(X.C0LLA r38, X.InterfaceC1364105Vn<? super kotlin.Unit> r39) {
        /*
            r37 = this;
            r3 = r39
            boolean r0 = r3 instanceof X.C0LLC
            r5 = r37
            if (r0 == 0) goto L7f
            r4 = r3
            X.0LLC r4 = (X.C0LLC) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7f
            int r2 = r2 - r1
            r4.LLILLL = r2
        L16:
            java.lang.Object r6 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L2c
            if (r0 == r1) goto L73
            if (r0 != r2) goto L85
            X.C155000ia.LIZIZ(r6)
        L29:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2c:
            X.C155000ia.LIZIZ(r6)
            X.0LSZ r6 = r5.LIZLLL
            r7 = 0
            java.lang.String r11 = "STARTED"
            r14 = 0
            r0 = r38
            com.ss.android.ugc.aweme.aigc.asynctask.Source r0 = r0.LIZ
            r26 = 0
            r36 = 268431343(0xfffefef, float:2.523736E-29)
            r8 = r7
            r9 = r7
            r10 = r7
            r12 = r7
            r13 = r7
            r15 = r7
            r16 = r7
            r17 = r7
            r18 = r14
            r19 = r0
            r20 = r7
            r21 = r7
            r22 = r14
            r23 = r7
            r24 = r7
            r25 = r7
            r28 = r7
            r29 = r26
            r31 = r7
            r32 = r7
            r33 = r7
            r34 = r14
            r35 = r7
            X.0LSZ r0 = X.C0LSZ.LIZ(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r29, r31, r32, r33, r34, r35, r36)
            r4.LLILLL = r1
            java.lang.Object r0 = X.C0LTN.LJJJI(r5, r0, r4)
            if (r0 != r3) goto L76
            return r3
        L73:
            X.C155000ia.LIZIZ(r6)
        L76:
            r4.LLILLL = r2
            java.lang.Object r0 = X.C0LTN.LJJIJL(r5, r4)
            if (r0 != r3) goto L29
            return r3
        L7f:
            X.0LLC r4 = new X.0LLC
            r4.<init>(r5, r3)
            goto L16
        L85:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LL9.LJJJJJL(X.0LLA, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0106 A[Catch: IOException -> 0x021f, TryCatch #0 {IOException -> 0x021f, blocks: (B:35:0x00c8, B:46:0x0102, B:48:0x0106, B:52:0x0124, B:54:0x0132, B:59:0x0145, B:61:0x0160, B:65:0x017e, B:67:0x018c, B:68:0x0195, B:70:0x019b, B:72:0x01a5, B:73:0x01b1, B:78:0x01fe, B:83:0x0212, B:45:0x00ff, B:51:0x0121, B:58:0x0142, B:64:0x017b, B:77:0x01fb, B:82:0x020f), top: B:92:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0132 A[Catch: IOException -> 0x021f, TryCatch #0 {IOException -> 0x021f, blocks: (B:35:0x00c8, B:46:0x0102, B:48:0x0106, B:52:0x0124, B:54:0x0132, B:59:0x0145, B:61:0x0160, B:65:0x017e, B:67:0x018c, B:68:0x0195, B:70:0x019b, B:72:0x01a5, B:73:0x01b1, B:78:0x01fe, B:83:0x0212, B:45:0x00ff, B:51:0x0121, B:58:0x0142, B:64:0x017b, B:77:0x01fb, B:82:0x020f), top: B:92:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0160 A[Catch: IOException -> 0x021f, TryCatch #0 {IOException -> 0x021f, blocks: (B:35:0x00c8, B:46:0x0102, B:48:0x0106, B:52:0x0124, B:54:0x0132, B:59:0x0145, B:61:0x0160, B:65:0x017e, B:67:0x018c, B:68:0x0195, B:70:0x019b, B:72:0x01a5, B:73:0x01b1, B:78:0x01fe, B:83:0x0212, B:45:0x00ff, B:51:0x0121, B:58:0x0142, B:64:0x017b, B:77:0x01fb, B:82:0x020f), top: B:92:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018c A[Catch: IOException -> 0x021f, TryCatch #0 {IOException -> 0x021f, blocks: (B:35:0x00c8, B:46:0x0102, B:48:0x0106, B:52:0x0124, B:54:0x0132, B:59:0x0145, B:61:0x0160, B:65:0x017e, B:67:0x018c, B:68:0x0195, B:70:0x019b, B:72:0x01a5, B:73:0x01b1, B:78:0x01fe, B:83:0x0212, B:45:0x00ff, B:51:0x0121, B:58:0x0142, B:64:0x017b, B:77:0x01fb, B:82:0x020f), top: B:92:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x020a A[RETURN] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v2, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r13v4, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r40v0, types: [X.0LL9, X.0LQl, X.0LTN] */
    @Override // X.C0LTN, X.InterfaceC542770LQl
    /* JADX INFO: renamed from: LJJJJLI, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.C0LLA r41, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.aigc.asynctask.ImagesUploadTaskOutput> r42) {
        /*
            Method dump skipped, instruction units count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LL9.LJFF(X.0LLA, X.05Vn):java.lang.Object");
    }

    public static final Object LJJJJLL(final List<String> list, AIGCAvatarAuthConfig aIGCAvatarAuthConfig, InterfaceC1364105Vn<? super Map<String, String>> interfaceC1364105Vn) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        final C2207821Bb2 c2207821Bb2 = new C2207821Bb2(aIGCAvatarAuthConfig);
        c2207821Bb2.LIZIZ(list.size(), (String[]) list.toArray(new String[0]));
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        c2207821Bb2.LIZJ(new InterfaceC2207871Bb7() { // from class: X.0LL8
            @Override // X.InterfaceC2207871Bb7
            public final void onLog(int i, int i2, String str) {
            }

            @Override // X.InterfaceC2207871Bb7
            public final void LIZ(int i, long j, AbstractImageUploader.ImageUploadInfo imageUploadInfo) {
                C563650M8t c563650M8t = C563650M8t.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("uploader notify: what = ");
                sbLIZ.append(imageUploadInfo);
                C201955140j.LIZLLL(c563650M8t, "ImagesUploadTask", C2188811AlT.LIZIZ(sbLIZ));
                if (i == 6) {
                    if (imageUploadInfo != null && Integer.valueOf(imageUploadInfo.mFileIndex) != null && imageUploadInfo.mImageToskey != null) {
                        Map<String, String> map = linkedHashMap;
                        Object obj = ListProtector.get(list, imageUploadInfo.mFileIndex);
                        String str = imageUploadInfo.mImageToskey;
                        if (str != null) {
                            map.put((String) obj, str);
                            return;
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    }
                    return;
                }
                if (i == 0) {
                    InterfaceC1364105Vn<Map<String, String>> interfaceC1364105Vn2 = c23260099m;
                    Map<String, String> map2 = linkedHashMap;
                    C189200o6.m2constructorimpl(map2);
                    interfaceC1364105Vn2.resumeWith(map2);
                    return;
                }
                if (i != 2 && i != 7) {
                    return;
                }
                c2207821Bb2.LIZ();
                C2243608qg.LIZ(C2097608Jq.LJ(), c23260099m);
            }
        });
        c2207821Bb2.LIZLLL();
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }
}
