package X;

import com.ss.android.ugc.aweme.aigc.asynctask.ImageUploadTaskInput;
import com.ss.android.ugc.aweme.aigc.asynctask.ImageUploadTaskOutput;
import com.ss.android.ugc.aweme.publish.model.AIGCAvatarAuthConfig;
import com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0LKz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C541350LKz extends C0LTN<ImageUploadTaskInput, ImageUploadTaskOutput> {
    public final String LJIIIIZZ = "MultiImageUploadTask";
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
            boolean r0 = r8 instanceof X.C0LL2
            if (r0 == 0) goto L76
            r5 = r8
            X.0LL2 r5 = (X.C0LL2) r5
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
            X.0LL2 r5 = new X.0LL2
            r5.<init>(r7, r8)
            goto L12
        L7c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C541350LKz.LJJJJL(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJJL(com.ss.android.ugc.aweme.aigc.asynctask.ImageUploadTaskInput r48, X.InterfaceC1364105Vn<? super kotlin.Unit> r49) {
        /*
            r47 = this;
            r5 = r49
            boolean r0 = r5 instanceof X.C0LL1
            r4 = r47
            if (r0 == 0) goto Lb6
            r3 = r5
            X.0LL1 r3 = (X.C0LL1) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb6
            int r2 = r2 - r1
            r3.LLILLL = r2
        L16:
            java.lang.Object r6 = r3.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r5 = 2
            r1 = 1
            if (r0 == 0) goto L2c
            if (r0 == r1) goto Laa
            if (r0 != r5) goto Lbd
            X.C155000ia.LIZIZ(r6)
        L29:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2c:
            X.C155000ia.LIZIZ(r6)
            X.0LSZ r9 = r4.LIZLLL
            r10 = 0
            java.lang.String r14 = "STARTED"
            r17 = 0
            r6 = r48
            com.ss.android.ugc.aweme.aigc.asynctask.Source r8 = r6.source
            com.ss.android.ugc.aweme.aigc.asynctask.models.CommonParentTaskInput r0 = r6.commonParentTaskInput
            if (r0 == 0) goto L42
            java.lang.String r0 = r0.resourceId
            if (r0 != 0) goto L44
        L42:
            java.lang.String r0 = ""
        L44:
            java.util.Date r7 = new java.util.Date
            r7.<init>()
            long r29 = r7.getTime()
            r32 = 0
            X.0LSZ r7 = r4.LIZLLL
            com.ss.android.ugc.aweme.aigc.asynctask.TaskLogExtra r7 = r7.LJJ
            java.lang.String r6 = r6.creationId
            r46 = 1047551(0xffbff, float:1.467932E-39)
            r34 = r7
            r35 = r10
            r36 = r10
            r37 = r6
            r38 = r10
            r39 = r17
            r40 = r10
            r41 = r10
            r42 = r10
            r43 = r10
            r44 = r17
            r45 = r10
            com.ss.android.ugc.aweme.aigc.asynctask.TaskLogExtra r34 = com.ss.android.ugc.aweme.aigc.asynctask.TaskLogExtra.LIZ(r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
            r39 = 258469871(0xf67efef, float:1.1435389E-29)
            r11 = r10
            r12 = r10
            r13 = r10
            r15 = r10
            r16 = r10
            r18 = r10
            r19 = r10
            r20 = r10
            r21 = r17
            r22 = r8
            r23 = r10
            r24 = r10
            r25 = r17
            r26 = r10
            r27 = r10
            r28 = r0
            r31 = r10
            r35 = r10
            r36 = r10
            r37 = r17
            r38 = r10
            X.0LSZ r0 = X.C0LSZ.LIZ(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r31, r32, r34, r35, r36, r37, r38, r39)
            r3.LLILLL = r1
            java.lang.Object r0 = X.C0LTN.LJJJI(r4, r0, r3)
            if (r0 != r2) goto Lad
            return r2
        Laa:
            X.C155000ia.LIZIZ(r6)
        Lad:
            r3.LLILLL = r5
            java.lang.Object r0 = X.C0LTN.LJJIJL(r4, r3)
            if (r0 != r2) goto L29
            return r2
        Lb6:
            X.0LL1 r3 = new X.0LL1
            r3.<init>(r4, r5)
            goto L16
        Lbd:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C541350LKz.LJJJJJL(com.ss.android.ugc.aweme.aigc.asynctask.ImageUploadTaskInput, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0133 A[Catch: ClassCastException -> 0x0230, IOException -> 0x0232, TryCatch #4 {IOException -> 0x0232, ClassCastException -> 0x0230, blocks: (B:49:0x012f, B:51:0x0133, B:54:0x0150, B:63:0x019a, B:65:0x01ca, B:68:0x01e5), top: B:106:0x012f }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0150 A[Catch: ClassCastException -> 0x0230, IOException -> 0x0232, TryCatch #4 {IOException -> 0x0232, ClassCastException -> 0x0230, blocks: (B:49:0x012f, B:51:0x0133, B:54:0x0150, B:63:0x019a, B:65:0x01ca, B:68:0x01e5), top: B:106:0x012f }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ca A[Catch: ClassCastException -> 0x0230, IOException -> 0x0232, TryCatch #4 {IOException -> 0x0232, ClassCastException -> 0x0230, blocks: (B:49:0x012f, B:51:0x0133, B:54:0x0150, B:63:0x019a, B:65:0x01ca, B:68:0x01e5), top: B:106:0x012f }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e5 A[Catch: ClassCastException -> 0x0230, IOException -> 0x0232, TryCatch #4 {IOException -> 0x0232, ClassCastException -> 0x0230, blocks: (B:49:0x012f, B:51:0x0133, B:54:0x0150, B:63:0x019a, B:65:0x01ca, B:68:0x01e5), top: B:106:0x012f }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0269 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0321 A[RETURN] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r1v54 */
    /* JADX WARN: Type inference failed for: r1v55 */
    /* JADX WARN: Type inference failed for: r1v56 */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARN: Type inference failed for: r1v58 */
    /* JADX WARN: Type inference failed for: r1v59 */
    /* JADX WARN: Type inference failed for: r1v60 */
    /* JADX WARN: Type inference failed for: r1v61 */
    /* JADX WARN: Type inference failed for: r1v62 */
    /* JADX WARN: Type inference failed for: r1v63 */
    /* JADX WARN: Type inference failed for: r1v64 */
    /* JADX WARN: Type inference failed for: r1v65 */
    /* JADX WARN: Type inference failed for: r42v0, types: [X.0LKz, X.0LQl, X.0LTN] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.String] */
    @Override // X.C0LTN, X.InterfaceC542770LQl
    /* JADX INFO: renamed from: LJJJJLI, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(com.ss.android.ugc.aweme.aigc.asynctask.ImageUploadTaskInput r43, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.aigc.asynctask.ImageUploadTaskOutput> r44) {
        /*
            Method dump skipped, instruction units count: 856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C541350LKz.LJFF(com.ss.android.ugc.aweme.aigc.asynctask.ImageUploadTaskInput, X.05Vn):java.lang.Object");
    }

    public static final Object LJJJJLL(final List<String> list, AIGCAvatarAuthConfig aIGCAvatarAuthConfig, InterfaceC1364105Vn<? super List<String>> interfaceC1364105Vn) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        final C2207821Bb2 c2207821Bb2 = new C2207821Bb2(aIGCAvatarAuthConfig);
        final ArrayList arrayList = new ArrayList();
        c2207821Bb2.LIZIZ(list.size(), (String[]) list.toArray(new String[0]));
        c2207821Bb2.LIZJ(new InterfaceC2207871Bb7() { // from class: X.0LKy
            @Override // X.InterfaceC2207871Bb7
            public final void onLog(int i, int i2, String str) {
            }

            @Override // X.InterfaceC2207871Bb7
            public final void LIZ(int i, long j, AbstractImageUploader.ImageUploadInfo imageUploadInfo) {
                String str;
                C563650M8t c563650M8t = C563650M8t.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("uploader notify: what = ");
                sbLIZ.append(imageUploadInfo);
                C201955140j.LIZLLL(c563650M8t, "ImageUploadTask", C2188811AlT.LIZIZ(sbLIZ));
                if (i == 6) {
                    List<String> list2 = arrayList;
                    if (imageUploadInfo == null || (str = imageUploadInfo.mImageToskey) == null) {
                        str = "";
                    }
                    list2.add(str);
                    if (arrayList.size() == list.size()) {
                        C2243608qg.LIZ(arrayList, c23260099m);
                        return;
                    }
                    return;
                }
                if (i != 2 && i != 7) {
                    return;
                }
                c2207821Bb2.LIZ();
                C2243608qg.LIZ(C13BV.INSTANCE, c23260099m);
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
