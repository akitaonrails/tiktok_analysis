package X;

import com.ss.android.ugc.aweme.aigc.asynctask.ImageUploadTaskInput;
import com.ss.android.ugc.aweme.aigc.asynctask.ImageUploadTaskOutput;

/* JADX INFO: renamed from: X.0LLe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C541400LLe extends C0LTN<ImageUploadTaskInput, ImageUploadTaskOutput> {
    public final String LJIIIIZZ = "MultiResourceUploadTask";
    public final String LJIIIZ = C0LMI.UPLOAD.getType();
    public final C054G LJIIJ = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));

    @Override // X.C0LTN
    public final String LJIL() {
        return this.LJIIIZ;
    }

    @Override // X.C0LTN
    public final String LJJ() {
        return this.LJIIIIZZ;
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
            boolean r0 = r5 instanceof X.C541370LLb
            r4 = r47
            if (r0 == 0) goto Lb6
            r3 = r5
            X.0LLb r3 = (X.C541370LLb) r3
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
            X.0LLb r3 = new X.0LLb
            r3.<init>(r4, r5)
            goto L16
        Lbd:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C541400LLe.LJJJJJL(com.ss.android.ugc.aweme.aigc.asynctask.ImageUploadTaskInput, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01e3 A[Catch: ClassCastException -> 0x039b, IOException -> 0x0401, TryCatch #2 {IOException -> 0x0401, ClassCastException -> 0x039b, blocks: (B:86:0x01bb, B:92:0x01c7, B:95:0x01d7, B:101:0x01e3, B:104:0x01f3, B:109:0x020c, B:112:0x0216, B:114:0x0224, B:116:0x022c, B:121:0x024e, B:129:0x026d, B:132:0x0277, B:134:0x0285, B:136:0x028d, B:140:0x02ad, B:148:0x0311, B:153:0x0331, B:154:0x0344, B:156:0x034a, B:158:0x0354, B:161:0x035c, B:173:0x0385, B:163:0x0367, B:168:0x0375, B:166:0x0370, B:174:0x0389, B:131:0x0271, B:111:0x0210, B:108:0x0209, B:125:0x025e, B:128:0x026a, B:144:0x02fe, B:147:0x030e, B:152:0x032e), top: B:196:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01f3 A[Catch: ClassCastException -> 0x039b, IOException -> 0x0401, TryCatch #2 {IOException -> 0x0401, ClassCastException -> 0x039b, blocks: (B:86:0x01bb, B:92:0x01c7, B:95:0x01d7, B:101:0x01e3, B:104:0x01f3, B:109:0x020c, B:112:0x0216, B:114:0x0224, B:116:0x022c, B:121:0x024e, B:129:0x026d, B:132:0x0277, B:134:0x0285, B:136:0x028d, B:140:0x02ad, B:148:0x0311, B:153:0x0331, B:154:0x0344, B:156:0x034a, B:158:0x0354, B:161:0x035c, B:173:0x0385, B:163:0x0367, B:168:0x0375, B:166:0x0370, B:174:0x0389, B:131:0x0271, B:111:0x0210, B:108:0x0209, B:125:0x025e, B:128:0x026a, B:144:0x02fe, B:147:0x030e, B:152:0x032e), top: B:196:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0224 A[Catch: ClassCastException -> 0x039b, IOException -> 0x0401, TryCatch #2 {IOException -> 0x0401, ClassCastException -> 0x039b, blocks: (B:86:0x01bb, B:92:0x01c7, B:95:0x01d7, B:101:0x01e3, B:104:0x01f3, B:109:0x020c, B:112:0x0216, B:114:0x0224, B:116:0x022c, B:121:0x024e, B:129:0x026d, B:132:0x0277, B:134:0x0285, B:136:0x028d, B:140:0x02ad, B:148:0x0311, B:153:0x0331, B:154:0x0344, B:156:0x034a, B:158:0x0354, B:161:0x035c, B:173:0x0385, B:163:0x0367, B:168:0x0375, B:166:0x0370, B:174:0x0389, B:131:0x0271, B:111:0x0210, B:108:0x0209, B:125:0x025e, B:128:0x026a, B:144:0x02fe, B:147:0x030e, B:152:0x032e), top: B:196:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x024e A[Catch: ClassCastException -> 0x039b, IOException -> 0x0401, TryCatch #2 {IOException -> 0x0401, ClassCastException -> 0x039b, blocks: (B:86:0x01bb, B:92:0x01c7, B:95:0x01d7, B:101:0x01e3, B:104:0x01f3, B:109:0x020c, B:112:0x0216, B:114:0x0224, B:116:0x022c, B:121:0x024e, B:129:0x026d, B:132:0x0277, B:134:0x0285, B:136:0x028d, B:140:0x02ad, B:148:0x0311, B:153:0x0331, B:154:0x0344, B:156:0x034a, B:158:0x0354, B:161:0x035c, B:173:0x0385, B:163:0x0367, B:168:0x0375, B:166:0x0370, B:174:0x0389, B:131:0x0271, B:111:0x0210, B:108:0x0209, B:125:0x025e, B:128:0x026a, B:144:0x02fe, B:147:0x030e, B:152:0x032e), top: B:196:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0285 A[Catch: ClassCastException -> 0x039b, IOException -> 0x0401, TryCatch #2 {IOException -> 0x0401, ClassCastException -> 0x039b, blocks: (B:86:0x01bb, B:92:0x01c7, B:95:0x01d7, B:101:0x01e3, B:104:0x01f3, B:109:0x020c, B:112:0x0216, B:114:0x0224, B:116:0x022c, B:121:0x024e, B:129:0x026d, B:132:0x0277, B:134:0x0285, B:136:0x028d, B:140:0x02ad, B:148:0x0311, B:153:0x0331, B:154:0x0344, B:156:0x034a, B:158:0x0354, B:161:0x035c, B:173:0x0385, B:163:0x0367, B:168:0x0375, B:166:0x0370, B:174:0x0389, B:131:0x0271, B:111:0x0210, B:108:0x0209, B:125:0x025e, B:128:0x026a, B:144:0x02fe, B:147:0x030e, B:152:0x032e), top: B:196:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02fb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0321 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x034a A[Catch: ClassCastException -> 0x039b, IOException -> 0x0401, TryCatch #2 {IOException -> 0x0401, ClassCastException -> 0x039b, blocks: (B:86:0x01bb, B:92:0x01c7, B:95:0x01d7, B:101:0x01e3, B:104:0x01f3, B:109:0x020c, B:112:0x0216, B:114:0x0224, B:116:0x022c, B:121:0x024e, B:129:0x026d, B:132:0x0277, B:134:0x0285, B:136:0x028d, B:140:0x02ad, B:148:0x0311, B:153:0x0331, B:154:0x0344, B:156:0x034a, B:158:0x0354, B:161:0x035c, B:173:0x0385, B:163:0x0367, B:168:0x0375, B:166:0x0370, B:174:0x0389, B:131:0x0271, B:111:0x0210, B:108:0x0209, B:125:0x025e, B:128:0x026a, B:144:0x02fe, B:147:0x030e, B:152:0x032e), top: B:196:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c7 A[Catch: ClassCastException -> 0x039b, IOException -> 0x0401, TryCatch #2 {IOException -> 0x0401, ClassCastException -> 0x039b, blocks: (B:86:0x01bb, B:92:0x01c7, B:95:0x01d7, B:101:0x01e3, B:104:0x01f3, B:109:0x020c, B:112:0x0216, B:114:0x0224, B:116:0x022c, B:121:0x024e, B:129:0x026d, B:132:0x0277, B:134:0x0285, B:136:0x028d, B:140:0x02ad, B:148:0x0311, B:153:0x0331, B:154:0x0344, B:156:0x034a, B:158:0x0354, B:161:0x035c, B:173:0x0385, B:163:0x0367, B:168:0x0375, B:166:0x0370, B:174:0x0389, B:131:0x0271, B:111:0x0210, B:108:0x0209, B:125:0x025e, B:128:0x026a, B:144:0x02fe, B:147:0x030e, B:152:0x032e), top: B:196:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01de  */
    /* JADX WARN: Type inference failed for: r53v0, types: [X.0LLe, X.0LQl, X.0LTN] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v8, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.List] */
    @Override // X.C0LTN, X.InterfaceC542770LQl
    /* JADX INFO: renamed from: LJJJJL, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(com.ss.android.ugc.aweme.aigc.asynctask.ImageUploadTaskInput r54, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.aigc.asynctask.ImageUploadTaskOutput> r55) {
        /*
            Method dump skipped, instruction units count: 1154
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C541400LLe.LJFF(com.ss.android.ugc.aweme.aigc.asynctask.ImageUploadTaskInput, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJLI(java.util.List<java.lang.String> r22, X.InterfaceC1364105Vn<? super kotlin.Pair<com.ss.android.ugc.aweme.aigc.asynctask.ImageUploadTaskOutput, ? extends java.util.Map<java.lang.String, java.lang.String>>> r23) {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C541400LLe.LJJJJLI(java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJLL(java.util.List<java.lang.String> r22, X.InterfaceC1364105Vn<? super kotlin.Pair<com.ss.android.ugc.aweme.aigc.asynctask.ImageUploadTaskOutput, ? extends java.util.Map<java.lang.String, java.lang.String>>> r23) {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C541400LLe.LJJJJLL(java.util.List, X.05Vn):java.lang.Object");
    }
}
