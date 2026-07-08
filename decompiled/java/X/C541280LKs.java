package X;

import com.ss.android.ugc.aweme.aigc.asynctask.ImageUploadTaskOutput;
import com.ss.android.ugc.aweme.publish.model.AIGCAvatarAuthConfig;
import com.ss.android.ugc.aweme.uploader.factory.AbstractImageUploader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0LKs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C541280LKs extends C0LTN<C09JG, ImageUploadTaskOutput> {
    public final String LJIIIIZZ = C0LM5.IMAGE_UPLOAD.getTypeName();
    public final String LJIIIZ = C0LMI.UPLOAD.getType();
    public final C054G LJIIJ = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
    public long LJIIJJI;
    public long LJIIL;

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
            boolean r0 = r8 instanceof X.C541250LKp
            if (r0 == 0) goto L76
            r5 = r8
            X.0LKp r5 = (X.C541250LKp) r5
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
            X.0LKp r5 = new X.0LKp
            r5.<init>(r7, r8)
            goto L12
        L7c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C541280LKs.LJJJJL(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0369 A[Catch: IOException -> 0x04b1, TryCatch #2 {IOException -> 0x04b1, blocks: (B:112:0x034c, B:117:0x0365, B:119:0x0369, B:122:0x0387, B:131:0x03e8, B:133:0x041a, B:135:0x0420, B:136:0x0424, B:138:0x042a, B:146:0x0440, B:149:0x0489, B:151:0x0490, B:152:0x0495, B:157:0x049e), top: B:185:0x034c }] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0387 A[Catch: IOException -> 0x04b1, TryCatch #2 {IOException -> 0x04b1, blocks: (B:112:0x034c, B:117:0x0365, B:119:0x0369, B:122:0x0387, B:131:0x03e8, B:133:0x041a, B:135:0x0420, B:136:0x0424, B:138:0x042a, B:146:0x0440, B:149:0x0489, B:151:0x0490, B:152:0x0495, B:157:0x049e), top: B:185:0x034c }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x041a A[Catch: IOException -> 0x04b1, TryCatch #2 {IOException -> 0x04b1, blocks: (B:112:0x034c, B:117:0x0365, B:119:0x0369, B:122:0x0387, B:131:0x03e8, B:133:0x041a, B:135:0x0420, B:136:0x0424, B:138:0x042a, B:146:0x0440, B:149:0x0489, B:151:0x0490, B:152:0x0495, B:157:0x049e), top: B:185:0x034c }] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0490 A[Catch: IOException -> 0x04b1, TryCatch #2 {IOException -> 0x04b1, blocks: (B:112:0x034c, B:117:0x0365, B:119:0x0369, B:122:0x0387, B:131:0x03e8, B:133:0x041a, B:135:0x0420, B:136:0x0424, B:138:0x042a, B:146:0x0440, B:149:0x0489, B:151:0x0490, B:152:0x0495, B:157:0x049e), top: B:185:0x034c }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ff A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0264  */
    /* JADX WARN: Type inference failed for: r0v39, types: [com.ss.android.ugc.aweme.aigc.asynctask.ImageUploadTaskInput] */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v59, types: [com.ss.android.ugc.aweme.aigc.asynctask.ImageUploadTaskInput, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v63, types: [com.ss.android.ugc.aweme.aigc.asynctask.ImageUploadTaskInput] */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v11, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v10, types: [com.ss.android.ugc.aweme.aigc.asynctask.QuotaResult, com.ss.android.ugc.aweme.aigc.asynctask.Source, com.ss.android.ugc.aweme.aigc.asynctask.TaskLogExtra, java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12, types: [java.util.List, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r15v13, types: [X.05Vn, X.099V, java.lang.Object, kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r15v15, types: [com.ss.android.ugc.aweme.aigc.asynctask.QuotaResult, com.ss.android.ugc.aweme.aigc.asynctask.Source, com.ss.android.ugc.aweme.aigc.asynctask.TaskLogExtra, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.util.List, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v40 */
    /* JADX WARN: Type inference failed for: r15v41 */
    /* JADX WARN: Type inference failed for: r15v42 */
    /* JADX WARN: Type inference failed for: r15v43 */
    /* JADX WARN: Type inference failed for: r15v44 */
    /* JADX WARN: Type inference failed for: r15v45 */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.util.List, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [java.lang.String, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r45v0, types: [X.0LKs, X.0LQl, X.0LTN] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.String] */
    @Override // X.C0LTN, X.InterfaceC542770LQl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.C09JG r46, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.aigc.asynctask.ImageUploadTaskOutput> r47) {
        /*
            Method dump skipped, instruction units count: 1448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C541280LKs.LJFF(X.09JG, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJJL(com.ss.android.ugc.aweme.aigc.asynctask.ImageUploadTaskInput r46, X.InterfaceC1364105Vn<? super kotlin.Unit> r47) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C541280LKs.LJJJJJL(com.ss.android.ugc.aweme.aigc.asynctask.ImageUploadTaskInput, X.05Vn):java.lang.Object");
    }

    public final Object LJJJJLI(final List<String> list, AIGCAvatarAuthConfig aIGCAvatarAuthConfig, InterfaceC1364105Vn<? super C541300LKu> interfaceC1364105Vn) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        final C2207821Bb2 c2207821Bb2 = new C2207821Bb2(aIGCAvatarAuthConfig);
        final ArrayList arrayList = new ArrayList();
        c2207821Bb2.LIZIZ(list.size(), (String[]) list.toArray(new String[0]));
        c2207821Bb2.LIZJ(new InterfaceC2207871Bb7() { // from class: X.0LKt
            @Override // X.InterfaceC2207871Bb7
            public final void LIZ(int i, long j, AbstractImageUploader.ImageUploadInfo imageUploadInfo) {
                Long lValueOf;
                int i2;
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
                        C541280LKs c541280LKs = this;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("upload image success: ");
                        sbLIZ2.append(imageUploadInfo);
                        c541280LKs.LJJJJIZL(C2188811AlT.LIZIZ(sbLIZ2));
                        C2243608qg.LIZ(new C541300LKu(arrayList, null, null, 6), c23260099m);
                        return;
                    }
                    return;
                }
                if (i != 2 && i != 7) {
                    if (i != 1) {
                        return;
                    }
                    if (imageUploadInfo != null) {
                        i2 = (int) imageUploadInfo.mProgress;
                    } else {
                        i2 = 0;
                    }
                    C541280LKs c541280LKs2 = this;
                    C23250099c.LIZLLL(c541280LKs2.LJIIJ, null, null, new C539440LDq(c541280LKs2, ((int) (i2 * 0.5f)) + 50, null), 3);
                    C541280LKs c541280LKs3 = this;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("upload image in progress: ");
                    sbLIZ3.append(imageUploadInfo);
                    c541280LKs3.LJJJJIZL(C2188811AlT.LIZIZ(sbLIZ3));
                    return;
                }
                C541280LKs c541280LKs4 = this;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("upload image fail: ");
                sbLIZ4.append(imageUploadInfo);
                c541280LKs4.LJJJJIZL(C2188811AlT.LIZIZ(sbLIZ4));
                c2207821Bb2.LIZ();
                InterfaceC1364105Vn<C541300LKu> interfaceC1364105Vn2 = c23260099m;
                if (imageUploadInfo != null) {
                    lValueOf = Long.valueOf(imageUploadInfo.mErrorCode);
                } else {
                    lValueOf = null;
                }
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("info=");
                sbLIZ5.append(imageUploadInfo);
                C2243608qg.LIZ(new C541300LKu(null, lValueOf, C2188811AlT.LIZIZ(sbLIZ5), 1), interfaceC1364105Vn2);
            }

            @Override // X.InterfaceC2207871Bb7
            public final void onLog(int i, int i2, String str) {
                C541280LKs c541280LKs = this;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("on Log: ");
                sbLIZ.append(i);
                sbLIZ.append(' ');
                sbLIZ.append(i2);
                sbLIZ.append(' ');
                sbLIZ.append(str);
                c541280LKs.LJJJJIZL(C2188811AlT.LIZIZ(sbLIZ));
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
