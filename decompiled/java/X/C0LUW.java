package X;

import com.ss.android.ugc.aweme.aigc.asynctask.AIGCServerTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.I2VServerTaskOutput;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCResultType;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0LUW, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LUW extends C0LSD<C09JG, I2VServerTaskOutput> {
    public static final C557860LuK LJIIZILJ = new C557860LuK();
    public final String LJIIJ = C0LM5.AI_CREATION_SERVER.getTypeName();
    public final String LJIIJJI = C0LMI.SERVER.getType();
    public final String LJIIL = "";
    public final AIGCResultType LJIILIIL = AIGCResultType.VIDEO;
    public final List<AIGCServerTaskOutput> LJIILJJIL = new ArrayList();
    public final String LJIILL = "";
    public int LJIILLIIL;

    @Override // X.C0LSD
    public final C0LUV LJJJJLL() {
        return new C00FT(this.LIZLLL.LJIJJLI, this.LIZLLL.LJJ.generateLogId);
    }

    @Override // X.C0LSD
    public final C0LUU LJJJJLI() {
        C0LUU c0luuLJJJJLI = super.LJJJJLI();
        return new C0LUU(c0luuLJJJJLI.LIZ, c0luuLJJJJLI.LIZIZ, c0luuLJJJJLI.LIZJ, c0luuLJJJJLI.LIZLLL, "generate", c0luuLJJJJLI.LJFF, c0luuLJJJJLI.LJI, c0luuLJJJJLI.LJII, c0luuLJJJJLI.LJIIIZ, c0luuLJJJJLI.LJIIIIZZ);
    }

    @Override // X.C0LTN
    public final String LJIL() {
        return this.LJIIJJI;
    }

    @Override // X.C0LTN
    public final String LJJ() {
        return this.LJIIJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    @Override // X.C0LSD, X.C0LTN, X.InterfaceC542770LQl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C543700LUa
            if (r0 == 0) goto L46
            r5 = r7
            X.0LUa r5 = (X.C543700LUa) r5
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
            java.lang.Object r0 = X.C0LSD.LJJJJL(r6, r5)
            if (r0 != r3) goto L37
            return r3
        L34:
            X.C155000ia.LIZIZ(r4)
        L37:
            X.0LuK r1 = X.C0LUW.LJIIZILJ
            X.0LSZ r0 = r6.LIZLLL
            java.lang.String r0 = r0.LJIJJLI
            r5.LLILLL = r2
            java.lang.Object r0 = r1.LIZ(r0, r5)
            if (r0 != r3) goto L25
            return r3
        L46:
            X.0LUa r5 = new X.0LUa
            r5.<init>(r6, r7)
            goto L12
        L4c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LUW.LJIIJ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJLL(X.InterfaceC1364105Vn<? super kotlin.Unit> r38) {
        /*
            r37 = this;
            r3 = r38
            boolean r0 = r3 instanceof X.C543730LUd
            r5 = r37
            if (r0 == 0) goto L95
            r4 = r3
            X.0LUd r4 = (X.C543730LUd) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L95
            int r2 = r2 - r1
            r4.LLILLL = r2
        L16:
            java.lang.Object r6 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L2c
            if (r0 == r1) goto L89
            if (r0 != r2) goto L9c
            X.C155000ia.LIZIZ(r6)
        L29:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2c:
            X.C155000ia.LIZIZ(r6)
            java.lang.String r0 = "CREATE"
            boolean r0 = r5.LJIIZILJ(r0)
            if (r0 != 0) goto L3a
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3a:
            X.0LSZ r0 = r5.LIZLLL
            java.lang.String r6 = r0.LJ
            java.lang.String r0 = "FAILED"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r6, r0)
            if (r0 == 0) goto L49
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L49:
            X.0LSZ r6 = r5.LIZLLL
            r7 = 0
            java.lang.String r11 = "FINISHED"
            r14 = 0
            r26 = 0
            r36 = 268435439(0xfffffef, float:2.5243523E-29)
            r8 = r7
            r9 = r7
            r10 = r7
            r12 = r7
            r13 = r7
            r15 = r7
            r16 = r7
            r17 = r7
            r18 = r14
            r19 = r7
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
            java.lang.Object r0 = r5.LJIIIZ(r0, r4)
            if (r0 != r3) goto L8c
            return r3
        L89:
            X.C155000ia.LIZIZ(r6)
        L8c:
            r4.LLILLL = r2
            java.lang.Object r0 = X.C0LSD.LJJJJZ(r5, r1, r4)
            if (r0 != r3) goto L29
            return r3
        L95:
            X.0LUd r4 = new X.0LUd
            r4.<init>(r5, r3)
            goto L16
        L9c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LUW.LJJJLL(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cc  */
    @Override // X.C0LTN, X.InterfaceC542770LQl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.C09JG r26, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.aigc.asynctask.I2VServerTaskOutput> r27) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LUW.LJFF(X.09JG, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0076 A[PHI: r6
      0x0076: PHI (r6v11 java.lang.String) = (r6v8 java.lang.String), (r6v13 java.lang.String) binds: [B:35:0x0074, B:33:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJLIIL(com.ss.android.ugc.aweme.aigc.asynctask.I2VServerTaskInput r43, X.InterfaceC1364105Vn<? super kotlin.Unit> r44) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LUW.LJJJLIIL(com.ss.android.ugc.aweme.aigc.asynctask.I2VServerTaskInput, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00db A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJLZIJ(X.C09JG r38, X.InterfaceC1364105Vn<? super kotlin.Unit> r39) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LUW.LJJJLZIJ(X.09JG, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02ad A[Catch: all -> 0x02d6, TryCatch #0 {all -> 0x02d6, blocks: (B:110:0x0243, B:113:0x0254, B:115:0x0273, B:117:0x0277, B:119:0x027d, B:120:0x0281, B:122:0x0287, B:124:0x0291, B:133:0x02a4, B:134:0x02a8, B:136:0x02ad, B:137:0x02b5, B:139:0x02bb, B:140:0x02d1, B:112:0x024c), top: B:227:0x0243, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0338 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061 A[Catch: all -> 0x04bc, TRY_LEAVE, TryCatch #5 {all -> 0x04bc, blocks: (B:20:0x0059, B:22:0x0061, B:25:0x0067, B:29:0x00b6), top: B:236:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067 A[Catch: all -> 0x04bc, TRY_ENTER, TryCatch #5 {all -> 0x04bc, blocks: (B:20:0x0059, B:22:0x0061, B:25:0x0067, B:29:0x00b6), top: B:236:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x021b  */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.01eN, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJZ(X.C09JG r46, X.InterfaceC1364105Vn<? super kotlin.Unit> r47) {
        /*
            Method dump skipped, instruction units count: 1240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LUW.LJJJZ(X.09JG, X.05Vn):java.lang.Object");
    }
}
