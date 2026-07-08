package X;

import com.ss.android.ugc.aweme.aigc.asynctask.CommonAigcQuotaInput;

/* JADX INFO: renamed from: X.0LSS, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LSS extends C0LSD<CommonAigcQuotaInput, C0LQD> {
    public final C557860LuK LJIIJ = new C557860LuK();
    public final String LJIIJJI = C0LMI.QUOTA.getType();

    @Override // X.C0LTN
    public final String LJJ() {
        return C0LM5.AI_CREATION_QUOTA.getTypeName();
    }

    @Override // X.C0LSD
    public final C0LUV LJJJJLL() {
        return new C00FP(this.LIZLLL.LJJIFFI.quota, this.LIZLLL.LJJIFFI.quotaRemain);
    }

    @Override // X.C0LTN
    public final String LJIL() {
        return this.LJIIJJI;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJLIIL(com.ss.android.ugc.aweme.aigc.asynctask.CommonAigcQuotaInput r42, X.InterfaceC1364105Vn<? super kotlin.Unit> r43) {
        /*
            r41 = this;
            r6 = r43
            r1 = r42
            boolean r0 = r6 instanceof X.C0LSW
            r2 = r41
            if (r0 == 0) goto Lb9
            r0 = r6
            X.0LSW r0 = (X.C0LSW) r0
            int r5 = r0.LLILZ
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r5 & r4
            if (r3 == 0) goto Lb9
            int r5 = r5 - r4
            r0.LLILZ = r5
        L18:
            java.lang.Object r7 = r0.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r6 = r0.LLILZ
            r5 = 2
            r4 = 1
            if (r6 == 0) goto L2e
            if (r6 == r4) goto La4
            if (r6 != r5) goto Lc0
            X.C155000ia.LIZIZ(r7)
        L2b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2e:
            X.C155000ia.LIZIZ(r7)
            X.0LSZ r10 = r2.LIZLLL
            com.ss.android.ugc.aweme.aigc.asynctask.Source r6 = r1.source
            long r30 = java.lang.System.currentTimeMillis()
            X.0LSZ r7 = r2.LIZLLL
            com.ss.android.ugc.aweme.aigc.asynctask.TaskLogExtra r9 = r7.LJJ
            r11 = 0
            java.lang.String r8 = r1.creationId
            r17 = 0
            com.ss.android.ugc.aweme.aigc.asynctask.models.CommonParentTaskInput r7 = r1.commonParentTaskInput
            if (r7 == 0) goto L4a
            java.lang.String r7 = r7.entranceScene
            if (r7 != 0) goto L4c
        L4a:
            java.lang.String r7 = ""
        L4c:
            r24 = 1031167(0xfbbff, float:1.444973E-39)
            r12 = r9
            r13 = r11
            r14 = r11
            r15 = r8
            r16 = r11
            r18 = r11
            r19 = r7
            r20 = r11
            r21 = r11
            r22 = r17
            r23 = r11
            com.ss.android.ugc.aweme.aigc.asynctask.TaskLogExtra r35 = com.ss.android.ugc.aweme.aigc.asynctask.TaskLogExtra.LIZ(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.String r15 = "STARTED"
            java.lang.String r17 = "QUOTA"
            r18 = 0
            r33 = 0
            r40 = 258994095(0xf6fefaf, float:1.1829771E-29)
            r12 = r11
            r13 = r11
            r14 = r11
            r16 = r11
            r19 = r11
            r20 = r11
            r21 = r11
            r22 = r18
            r23 = r6
            r24 = r11
            r25 = r11
            r26 = r18
            r27 = r11
            r28 = r11
            r29 = r11
            r32 = r11
            r36 = r11
            r37 = r11
            r38 = r18
            r39 = r11
            X.0LSZ r6 = X.C0LSZ.LIZ(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r32, r33, r35, r36, r37, r38, r39, r40)
            r0.LL = r1
            r0.LLILZ = r4
            java.lang.Object r4 = X.C0LTN.LJJJI(r2, r6, r0)
            if (r4 != r3) goto La9
            return r3
        La4:
            com.ss.android.ugc.aweme.aigc.asynctask.CommonAigcQuotaInput r1 = r0.LL
            X.C155000ia.LIZIZ(r7)
        La9:
            com.ss.android.ugc.aweme.aigc.asynctask.models.CommonParentTaskInput r1 = r1.commonParentTaskInput
            r2.LJIIIZ = r1
            r1 = 0
            r0.LL = r1
            r0.LLILZ = r5
            java.lang.Object r0 = r2.LJJJJJL(r0)
            if (r0 != r3) goto L2b
            return r3
        Lb9:
            X.0LSW r0 = new X.0LSW
            r0.<init>(r2, r6)
            goto L18
        Lc0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LSS.LJJJLIIL(com.ss.android.ugc.aweme.aigc.asynctask.CommonAigcQuotaInput, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028 A[PHI: r5
      0x0028: PHI (r5v2 java.lang.Object) = (r5v1 java.lang.Object), (r5v0 java.lang.Object) binds: [B:23:0x005b, B:12:0x0025] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    @Override // X.C0LTN, X.InterfaceC542770LQl
    /* JADX INFO: renamed from: LJJJLL, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(com.ss.android.ugc.aweme.aigc.asynctask.CommonAigcQuotaInput r8, X.InterfaceC1364105Vn<? super X.C0LQD> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C0LSX
            if (r0 == 0) goto L5e
            r6 = r9
            X.0LSX r6 = (X.C0LSX) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5e
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r5 = r6.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r2 = r6.LLILZ
            r3 = 3
            r1 = 2
            r0 = 1
            if (r2 == 0) goto L29
            if (r2 == r0) goto L36
            if (r2 == r1) goto L46
            if (r2 != r3) goto L64
            X.C155000ia.LIZIZ(r5)
        L28:
            return r5
        L29:
            X.C155000ia.LIZIZ(r5)
            r6.LL = r8
            r6.LLILZ = r0
            super.LJFF(r8, r6)
            if (r4 != 0) goto L3b
            return r4
        L36:
            com.ss.android.ugc.aweme.aigc.asynctask.CommonAigcQuotaInput r8 = r6.LL
            X.C155000ia.LIZIZ(r5)
        L3b:
            r6.LL = r8
            r6.LLILZ = r1
            java.lang.Object r0 = r7.LJJJLIIL(r8, r6)
            if (r0 != r4) goto L4b
            return r4
        L46:
            com.ss.android.ugc.aweme.aigc.asynctask.CommonAigcQuotaInput r8 = r6.LL
            X.C155000ia.LIZIZ(r5)
        L4b:
            X.1DFB r2 = X.C0PEM.LIZJ
            X.0LSR r1 = new X.0LSR
            r0 = 0
            r1.<init>(r7, r8, r0)
            r6.LL = r0
            r6.LLILZ = r3
            java.lang.Object r5 = X.C23250099c.LJI(r6, r2, r1)
            if (r5 != r4) goto L28
            return r4
        L5e:
            X.0LSX r6 = new X.0LSX
            r6.<init>(r7, r9)
            goto L12
        L64:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LSS.LJFF(com.ss.android.ugc.aweme.aigc.asynctask.CommonAigcQuotaInput, X.05Vn):java.lang.Object");
    }
}
