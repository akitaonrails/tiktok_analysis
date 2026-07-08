package X;

import com.ss.android.ugc.aweme.aigc.asynctask.AIGCServerTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.GeneralI2VServerProgressTaskOutput;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCResultType;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0LVf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C544010LVf extends C0LTN<C09JG, GeneralI2VServerProgressTaskOutput> {
    public long LJIILIIL;
    public final C572890MdT LJIIIIZZ = new C572890MdT();
    public String LJIIIZ = "";
    public final String LJIIJ = C0LM5.TEXT_TO_IMAGE_PROGRESS.getTypeName();
    public AIGCResultType LJIIJJI = AIGCResultType.VIDEO;
    public final List<AIGCServerTaskOutput> LJIIL = new ArrayList();
    public final String LJIILJJIL = "";

    @Override // X.C0LTN
    public final String LJJ() {
        return "TextToImageServerProgressTask";
    }

    @Override // X.C0LTN
    public final String LJIL() {
        return this.LJIIJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    @Override // X.C0LTN, X.InterfaceC542770LQl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C0LW3
            if (r0 == 0) goto L46
            r5 = r7
            X.0LW3 r5 = (X.C0LW3) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L46
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r1 = r5.LLILLL
            r2 = 2
            r0 = 1
            if (r1 == 0) goto L28
            if (r1 == r0) goto L34
            if (r1 != r2) goto L4c
            X.C155000ia.LIZIZ(r4)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r4)
            r5.LLILLL = r0
            java.lang.Object r0 = X.C0LTN.LJIILJJIL(r6, r5)
            if (r0 != r3) goto L37
            return r3
        L34:
            X.C155000ia.LIZIZ(r4)
        L37:
            X.0MdT r1 = r6.LJIIIIZZ
            X.0LSZ r0 = r6.LIZLLL
            java.lang.String r0 = r0.LJIJJLI
            r5.LLILLL = r2
            java.lang.Object r0 = r1.LIZ(r0, r5)
            if (r0 != r3) goto L25
            return r3
        L46:
            X.0LW3 r5 = new X.0LW3
            r5.<init>(r6, r7)
            goto L12
        L4c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C544010LVf.LJIIJ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Path cross not found for [B:25:0x0077, B:35:0x00ab], limit reached: 69 */
    /* JADX WARN: Path cross not found for [B:35:0x00ab, B:25:0x0077], limit reached: 69 */
    /* JADX WARN: Path cross not found for [B:41:0x00cb, B:43:0x00cf], limit reached: 69 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0152 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0172 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0170 -> B:37:0x00bb). Please report as a decompilation issue!!! */
    @Override // X.C0LTN, X.InterfaceC542770LQl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.C09JG r18, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.aigc.asynctask.GeneralI2VServerProgressTaskOutput> r19) {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C544010LVf.LJFF(X.09JG, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0054 A[PHI: r5
      0x0054: PHI (r5v9 java.lang.String) = (r5v6 java.lang.String), (r5v10 java.lang.String) binds: [B:23:0x0052, B:21:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJJL(com.ss.android.ugc.aweme.aigc.asynctask.GeneralI2VServerProgressTaskInput r39, X.InterfaceC1364105Vn<? super kotlin.Unit> r40) {
        /*
            r38 = this;
            r5 = r40
            boolean r0 = r5 instanceof X.C0LWK
            r3 = r38
            if (r0 == 0) goto Lb0
            r2 = r5
            X.0LWK r2 = (X.C0LWK) r2
            int r4 = r2.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r1
            if (r0 == 0) goto Lb0
            int r4 = r4 - r1
            r2.LLILLL = r4
        L16:
            java.lang.Object r6 = r2.LL
            java.lang.Object r1 = X.C099R.LJFF()
            int r5 = r2.LLILLL
            r4 = 2
            r0 = 1
            if (r5 == 0) goto L2c
            if (r5 == r0) goto La4
            if (r5 != r4) goto Lb7
            X.C155000ia.LIZIZ(r6)
        L29:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2c:
            X.C155000ia.LIZIZ(r6)
            java.lang.String r6 = "FINISHED"
            java.lang.String r5 = "CANCELED"
            java.lang.String[] r5 = new java.lang.String[]{r6, r5}
            java.util.List r5 = X.C1697810uHb.LJIIJJI(r5)
            boolean r5 = r3.LJIILLIIL(r5)
            if (r5 == 0) goto L44
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L44:
            X.0LSZ r7 = r3.LIZLLL
            java.lang.String r26 = ""
            r6 = r39
            if (r6 == 0) goto L50
            java.lang.String r5 = r6.LIZ
            if (r5 != 0) goto L54
        L50:
            r5 = r26
            if (r6 == 0) goto L5e
        L54:
            com.ss.android.ugc.aweme.aigc.asynctask.models.CommonParentTaskInput r6 = r6.commonParentTaskInput
            if (r6 == 0) goto L5e
            java.lang.String r6 = r6.resourceId
            if (r6 == 0) goto L5e
            r26 = r6
        L5e:
            java.util.Date r6 = new java.util.Date
            r6.<init>()
            long r27 = r6.getTime()
            r8 = 0
            java.lang.String r12 = "STARTED"
            java.lang.String r13 = "ASYNC"
            java.lang.String r14 = "GET_STATUS"
            r15 = 0
            r30 = 0
            r37 = 264765327(0xfc7ff8f, float:1.9721353E-29)
            r9 = r8
            r10 = r8
            r11 = r8
            r16 = r8
            r17 = r8
            r18 = r8
            r19 = r15
            r20 = r8
            r21 = r8
            r22 = r8
            r23 = r15
            r24 = r8
            r25 = r8
            r29 = r5
            r32 = r8
            r33 = r8
            r34 = r8
            r35 = r15
            r36 = r8
            X.0LSZ r5 = X.C0LSZ.LIZ(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r30, r32, r33, r34, r35, r36, r37)
            r2.LLILLL = r0
            java.lang.Object r0 = X.C0LTN.LJJJ(r3, r5, r2)
            if (r0 != r1) goto La7
            return r1
        La4:
            X.C155000ia.LIZIZ(r6)
        La7:
            r2.LLILLL = r4
            java.lang.Object r0 = X.C0LTN.LJJIJL(r3, r2)
            if (r0 != r1) goto L29
            return r1
        Lb0:
            X.0LWK r2 = new X.0LWK
            r2.<init>(r3, r5)
            goto L16
        Lb7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C544010LVf.LJJJJJL(com.ss.android.ugc.aweme.aigc.asynctask.GeneralI2VServerProgressTaskInput, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJLI(X.C09JG r39, X.InterfaceC1364105Vn<? super kotlin.Unit> r40) {
        /*
            r38 = this;
            r5 = r40
            r3 = r39
            boolean r0 = r5 instanceof X.C0LW8
            r2 = r38
            if (r0 == 0) goto Lb0
            r6 = r5
            X.0LW8 r6 = (X.C0LW8) r6
            int r4 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r1
            if (r0 == 0) goto Lb0
            int r4 = r4 - r1
            r6.LLILZ = r4
        L18:
            java.lang.Object r5 = r6.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r1 = 1
            if (r0 == 0) goto L40
            if (r0 != r1) goto Lb7
            X.09JG r3 = r6.LL
            X.C155000ia.LIZIZ(r5)
        L2a:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "GeneralI2VServerProgressTaskInput "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.LJJJJIZL(r0)
        L3d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L40:
            X.C155000ia.LIZIZ(r5)
            boolean r0 = r3 instanceof com.ss.android.ugc.aweme.aigc.asynctask.GeneralI2VServerProgressTaskInput
            if (r0 == 0) goto L8f
            X.0LSZ r7 = r2.LIZLLL
            r8 = 0
            r15 = 0
            java.lang.String r21 = X.C0LKZ.LIZLLL(r3)
            if (r21 != 0) goto L53
            java.lang.String r21 = ""
        L53:
            r27 = 0
            r37 = 268427263(0xfffdfff, float:2.5231222E-29)
            r9 = r8
            r10 = r8
            r11 = r8
            r12 = r8
            r13 = r8
            r14 = r8
            r16 = r8
            r17 = r8
            r18 = r8
            r19 = r15
            r20 = r8
            r22 = r8
            r23 = r15
            r24 = r8
            r25 = r8
            r26 = r8
            r29 = r8
            r30 = r27
            r32 = r8
            r33 = r8
            r34 = r8
            r35 = r15
            r36 = r8
            X.0LSZ r0 = X.C0LSZ.LIZ(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r30, r32, r33, r34, r35, r36, r37)
            r6.LL = r3
            r6.LLILZ = r1
            java.lang.Object r0 = X.C0LTN.LJJJ(r2, r0, r6)
            if (r0 != r4) goto L2a
            return r4
        L8f:
            boolean r0 = r3 instanceof X.C0LKX
            if (r0 == 0) goto L3d
            X.0LSZ r0 = r2.LIZLLL
            java.lang.String r1 = r0.LJIILIIL
            java.lang.Class<com.ss.android.ugc.aweme.aigc.asynctask.GeneralI2VServerProgressTaskInput> r0 = com.ss.android.ugc.aweme.aigc.asynctask.GeneralI2VServerProgressTaskInput.class
            X.C0LKZ.LIZJ(r1, r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "RestoreTaskInput "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.LJJJJIZL(r0)
            goto L3d
        Lb0:
            X.0LW8 r6 = new X.0LW8
            r6.<init>(r2, r5)
            goto L18
        Lb7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C544010LVf.LJJJJLI(X.09JG, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJLL(java.lang.String r14, X.InterfaceC1364105Vn<? super kotlin.Unit> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof X.C0LWU
            r6 = r13
            if (r0 == 0) goto La1
            r11 = r15
            X.0LWU r11 = (X.C0LWU) r11
            int r2 = r11.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La1
            int r2 = r2 - r1
            r11.LLILLL = r2
        L13:
            java.lang.Object r4 = r11.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r11.LLILLL
            r3 = 2
            r5 = 1
            if (r0 == 0) goto L29
            if (r0 == r5) goto L4e
            if (r0 != r3) goto La8
            X.C155000ia.LIZIZ(r4)
        L26:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L29:
            X.C155000ia.LIZIZ(r4)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "requestProgress request: "
            r1.append(r0)
            r1.append(r14)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r6.LJJJJIZL(r0)
            X.0MdT r1 = r6.LJIIIIZZ
            X.0LSZ r0 = r6.LIZLLL
            java.lang.String r0 = r0.LJIJJLI
            r11.LLILLL = r5
            java.lang.Object r4 = r1.LIZJ(r0, r11)
            if (r4 != r2) goto L51
            return r2
        L4e:
            X.C155000ia.LIZIZ(r4)
        L51:
            com.ss.android.ugc.aweme.texttoimage.Text2ImageAIGCQueryResponse r4 = (com.ss.android.ugc.aweme.texttoimage.Text2ImageAIGCQueryResponse) r4
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "requestProgress response: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r6.LJJJJIZL(r0)
            if (r4 == 0) goto L9f
            java.util.List<com.ss.android.ugc.aweme.texttoimage.AiUrlInfo> r0 = r4.data
            if (r0 == 0) goto L9f
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            com.ss.android.ugc.aweme.texttoimage.AiUrlInfo r0 = (com.ss.android.ugc.aweme.texttoimage.AiUrlInfo) r0
            if (r0 == 0) goto L9f
            java.lang.Integer r0 = r0.errCode
            if (r0 == 0) goto L9f
            int r7 = r0.intValue()
        L7c:
            java.lang.String r8 = ""
            X.0LVg r0 = new X.0LVg
            r9 = 0
            r0.<init>(r4, r6, r9)
            r11.LLILLL = r3
            if (r7 != 0) goto L8f
            java.lang.Object r1 = r0.invoke(r11)
        L8c:
            if (r1 != r2) goto L26
            return r2
        L8f:
            r12 = 12
            r10 = r9
            java.lang.Object r1 = X.C539400LDm.LIZ(r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 == r0) goto L8c
            kotlin.Unit r1 = kotlin.Unit.LIZ
            goto L8c
        L9f:
            r7 = 0
            goto L7c
        La1:
            X.0LWU r11 = new X.0LWU
            r11.<init>(r6, r15)
            goto L13
        La8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C544010LVf.LJJJJLL(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJL(com.ss.android.ugc.aweme.aigc.asynctask.GeneralI2VServerProgressTaskInput r18, long r19, X.InterfaceC1364105Vn<? super java.lang.Boolean> r21) {
        /*
            r17 = this;
            r5 = r21
            r1 = r19
            boolean r0 = r5 instanceof X.C0LWL
            r10 = r17
            if (r0 == 0) goto L94
            r15 = r5
            X.0LWL r15 = (X.C0LWL) r15
            int r4 = r15.LLILLL
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r3
            if (r0 == 0) goto L94
            int r4 = r4 - r3
            r15.LLILLL = r4
        L18:
            java.lang.Object r3 = r15.LL
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r15.LLILLL
            r6 = 1
            if (r0 == 0) goto L2d
            if (r0 != r6) goto L9b
            X.C155000ia.LIZIZ(r3)
        L28:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            return r0
        L2d:
            X.C155000ia.LIZIZ(r3)
            r0 = r18
            if (r0 == 0) goto L46
            java.lang.Long r5 = r0.timeOutSecond
            if (r5 == 0) goto L46
            long r8 = r5.longValue()
            r3 = 0
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 <= 0) goto L46
            long r1 = r5.longValue()
        L46:
            long r8 = java.lang.System.currentTimeMillis()
            X.0LSZ r0 = r10.LIZLLL
            long r3 = r0.LJIJJ
            long r8 = r8 - r3
            r0 = 1000(0x3e8, float:1.401E-42)
            long r3 = (long) r0
            long r3 = r3 * r1
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 <= 0) goto La3
            X.0LC1 r8 = X.C0LC1.LIZIZ
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            java.lang.String r5 = "time out, limit="
            r0.append(r5)
            r0.append(r1)
            java.lang.String r4 = " second"
            r0.append(r4)
            java.lang.String r3 = X.C2188811AlT.LIZIZ(r0)
            java.lang.String r0 = "ProgressTask"
            X.C201955140j.LIZLLL(r8, r0, r3)
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r5)
            r0.append(r1)
            r0.append(r4)
            java.lang.String r12 = X.C2188811AlT.LIZIZ(r0)
            r13 = 0
            r16 = 12
            r15.LLILLL = r6
            r11 = -47369(0xffffffffffff46f7, float:NaN)
            r14 = r13
            java.lang.Object r0 = X.C539400LDm.LIZ(r10, r11, r12, r13, r14, r15, r16)
            if (r0 != r7) goto L28
            return r7
        L94:
            X.0LWL r15 = new X.0LWL
            r15.<init>(r10, r5)
            goto L18
        L9b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        La3:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C544010LVf.LJJJJL(com.ss.android.ugc.aweme.aigc.asynctask.GeneralI2VServerProgressTaskInput, long, X.05Vn):java.lang.Object");
    }
}
