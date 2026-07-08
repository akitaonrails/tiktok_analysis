package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.asynctask.GeneralI2VPostProcessingTaskOutput;
import com.ss.android.vesdk.VEUtils;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Unit;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0LTm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C543560LTm extends C0LTN<C09JG, GeneralI2VPostProcessingTaskOutput> {
    public final String LJIIIIZZ = "postprocess";

    @Override // X.C0LTN
    public final String LJJ() {
        return "postprocess";
    }

    @Override // X.C0LTN
    public final String LJIL() {
        return this.LJIIIIZZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJL(X.InterfaceC1364105Vn<? super kotlin.Unit> r38) {
        /*
            r37 = this;
            r3 = r38
            boolean r0 = r3 instanceof X.C543640LTu
            r5 = r37
            if (r0 == 0) goto L7c
            r4 = r3
            X.0LTu r4 = (X.C543640LTu) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7c
            int r2 = r2 - r1
            r4.LLILLL = r2
        L16:
            java.lang.Object r6 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L2c
            if (r0 == r1) goto L70
            if (r0 != r2) goto L82
            X.C155000ia.LIZIZ(r6)
        L29:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2c:
            X.C155000ia.LIZIZ(r6)
            X.0LSZ r6 = r5.LIZLLL
            r7 = 0
            java.lang.String r11 = "FINISHED"
            r14 = 100
            r18 = 0
            r26 = 0
            r36 = 268435311(0xfffff6f, float:2.5243331E-29)
            r8 = r7
            r9 = r7
            r10 = r7
            r12 = r7
            r13 = r7
            r15 = r7
            r16 = r7
            r17 = r7
            r19 = r7
            r20 = r7
            r21 = r7
            r22 = r18
            r23 = r7
            r24 = r7
            r25 = r7
            r28 = r7
            r29 = r26
            r31 = r7
            r32 = r7
            r33 = r7
            r34 = r18
            r35 = r7
            X.0LSZ r0 = X.C0LSZ.LIZ(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r29, r31, r32, r33, r34, r35, r36)
            r4.LLILLL = r1
            java.lang.Object r0 = X.C0LTN.LJJJI(r5, r0, r4)
            if (r0 != r3) goto L73
            return r3
        L70:
            X.C155000ia.LIZIZ(r6)
        L73:
            r4.LLILLL = r2
            java.lang.Object r0 = X.C0LTN.LJJIJIIJI(r5, r1, r4)
            if (r0 != r3) goto L29
            return r3
        L7c:
            X.0LTu r4 = new X.0LTu
            r4.<init>(r5, r3)
            goto L16
        L82:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C543560LTm.LJJJJL(X.05Vn):java.lang.Object");
    }

    public final Object LJJJJLI(C543570LTn c543570LTn) {
        Object objLJJJI = C0LTN.LJJJI(this, C0LSZ.LIZ(this.LIZLLL, null, null, null, null, "FINISHED", null, null, 100, null, null, null, 0, null, null, null, 0, null, null, null, 0L, null, 0L, null, null, null, 0, null, 268435311), c543570LTn);
        if (objLJJJI == C099R.LJFF()) {
            return objLJJJI;
        }
        return Unit.LIZ;
    }

    public static String LJJJJLL(String str, String str2) {
        if (u.LJIIZILJ(str, "/", false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("file_");
            sbLIZ.append(new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date()));
            sbLIZ.append(str2);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append("/file_");
        sbLIZ2.append(new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date()));
        sbLIZ2.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    @Override // X.C0LTN, X.InterfaceC542770LQl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.C09JG r8, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.aigc.asynctask.GeneralI2VPostProcessingTaskOutput> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C543590LTp
            if (r0 == 0) goto L75
            r4 = r9
            X.0LTp r4 = (X.C543590LTp) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L75
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r6 = r4.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r1 = r4.LLILZ
            r3 = 3
            r2 = 2
            r0 = 1
            if (r1 == 0) goto L29
            if (r1 == r0) goto L36
            if (r1 == r2) goto L83
            if (r1 != r3) goto L7b
            X.C155000ia.LIZIZ(r6)
        L28:
            return r6
        L29:
            X.C155000ia.LIZIZ(r6)
            r4.LL = r8
            r4.LLILZ = r0
            super.LJFF(r8, r4)
            if (r5 != 0) goto L3b
            return r5
        L36:
            X.09JG r8 = r4.LL
            X.C155000ia.LIZIZ(r6)
        L3b:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "input: "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r7.LJJJJIZL(r0)
            com.bytedance.ies.abmock.SettingsManager r0 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            r0.getClass()
            java.lang.String r1 = "aigc_offline_process_post_process_task_et_refactor"
            r0 = 0
            boolean r1 = com.bytedance.ies.abmock.SettingsManager.LIZ(r1, r0)
            r0 = 0
            if (r1 != 0) goto L6a
            r4.LL = r0
            r4.LLILZ = r2
            java.lang.Object r6 = r7.LJJLIIIIJ(r8, r4)
            if (r6 != r5) goto L86
            return r5
        L6a:
            r4.LL = r0
            r4.LLILZ = r3
            java.lang.Object r6 = r7.LJJLI(r8, r4)
            if (r6 != r5) goto L28
            return r5
        L75:
            X.0LTp r4 = new X.0LTp
            r4.<init>(r7, r9)
            goto L12
        L7b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L83:
            X.C155000ia.LIZIZ(r6)
        L86:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C543560LTm.LJFF(X.09JG, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJJL(com.ss.android.ugc.aweme.aigc.asynctask.tasks.GeneralI2VPostProcessingTaskInput r46, X.InterfaceC1364105Vn<? super kotlin.Unit> r47) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C543560LTm.LJJJJJL(com.ss.android.ugc.aweme.aigc.asynctask.tasks.GeneralI2VPostProcessingTaskInput, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0128 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01d9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ef A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01fc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0200 A[PHI: r9
      0x0200: PHI (r9v2 java.lang.Object) = (r9v0 java.lang.Object), (r9v3 java.lang.Object) binds: [B:55:0x01fd, B:53:0x01fa] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJLI(X.C09JG r31, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.aigc.asynctask.GeneralI2VPostProcessingTaskOutput> r32) {
        /*
            Method dump skipped, instruction units count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C543560LTm.LJJLI(X.09JG, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x035b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x035f A[PHI: r10
      0x035f: PHI (r10v2 java.lang.Object) = (r10v0 java.lang.Object), (r10v3 java.lang.Object) binds: [B:111:0x035c, B:109:0x0359] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0116 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02ef A[PHI: r10
      0x02ef: PHI (r10v4 java.lang.Object) = (r10v0 java.lang.Object), (r10v5 java.lang.Object) binds: [B:87:0x02ec, B:85:0x02e9] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x031e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0322 A[PHI: r10
      0x0322: PHI (r10v22 java.lang.Object) = (r10v0 java.lang.Object), (r10v23 java.lang.Object) binds: [B:98:0x031f, B:96:0x031c] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJLIIIIJ(X.C09JG r33, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.aigc.asynctask.GeneralI2VPostProcessingTaskOutput> r34) {
        /*
            Method dump skipped, instruction units count: 920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C543560LTm.LJJLIIIIJ(X.09JG, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJLIIL(int r39, java.lang.String r40, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.aigc.asynctask.GeneralI2VPostProcessingTaskOutput> r41) {
        /*
            r38 = this;
            r7 = r41
            r1 = r40
            r2 = r39
            boolean r0 = r7 instanceof X.C543630LTt
            r6 = r38
            if (r0 == 0) goto L90
            r5 = r7
            X.0LTt r5 = (X.C543630LTt) r5
            int r4 = r5.LLILZIL
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r3
            if (r0 == 0) goto L90
            int r4 = r4 - r3
            r5.LLILZIL = r4
        L1a:
            java.lang.Object r7 = r5.LLILLL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZIL
            r3 = 1
            if (r0 == 0) goto L39
            if (r0 != r3) goto L96
            int r2 = r5.LL
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.String r1 = (java.lang.String) r1
            X.C155000ia.LIZIZ(r7)
        L30:
            com.ss.android.ugc.aweme.aigc.asynctask.GeneralI2VPostProcessingTaskOutput r4 = new com.ss.android.ugc.aweme.aigc.asynctask.GeneralI2VPostProcessingTaskOutput
            java.lang.String r3 = "FAILED"
            r0 = 0
            r4.<init>(r3, r2, r1, r0)
            return r4
        L39:
            X.C155000ia.LIZIZ(r7)
            X.09JG r7 = r6.LJFF
            boolean r0 = r7 instanceof com.ss.android.ugc.aweme.aigc.asynctask.tasks.GeneralI2VPostProcessingTaskInput
            r8 = 0
            if (r0 == 0) goto L9e
            com.ss.android.ugc.aweme.aigc.asynctask.tasks.GeneralI2VPostProcessingTaskInput r7 = (com.ss.android.ugc.aweme.aigc.asynctask.tasks.GeneralI2VPostProcessingTaskInput) r7
            if (r7 == 0) goto L9e
            boolean r0 = r7.ignorePostProcessingFailure
            if (r0 != 0) goto L9e
            X.0LSZ r7 = r6.LIZLLL
            java.lang.String r12 = "FAILED"
            r15 = 100
            r19 = 0
            r27 = 0
            r37 = 268435311(0xfffff6f, float:2.5243331E-29)
            r9 = r8
            r10 = r8
            r11 = r8
            r13 = r8
            r14 = r8
            r16 = r8
            r17 = r8
            r18 = r8
            r20 = r8
            r21 = r8
            r22 = r8
            r23 = r19
            r24 = r8
            r25 = r8
            r26 = r8
            r29 = r8
            r30 = r27
            r32 = r8
            r33 = r8
            r34 = r8
            r35 = r19
            r36 = r8
            X.0LSZ r0 = X.C0LSZ.LIZ(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r30, r32, r33, r34, r35, r36, r37)
            r5.LLILLJJLI = r1
            r5.LL = r2
            r5.LLILZIL = r3
            java.lang.Object r0 = X.C0LTN.LJJJ(r6, r0, r5)
            if (r0 != r4) goto L30
            return r4
        L90:
            X.0LTt r5 = new X.0LTt
            r5.<init>(r6, r7)
            goto L1a
        L96:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L9e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C543560LTm.LJJJLIIL(int, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJZ(int r40, java.lang.String r41, X.InterfaceC1364105Vn<? super kotlin.Unit> r42) {
        /*
            r39 = this;
            r5 = r42
            boolean r0 = r5 instanceof X.C543650LTv
            r3 = r39
            if (r0 == 0) goto La6
            r2 = r5
            X.0LTv r2 = (X.C543650LTv) r2
            int r4 = r2.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r1
            if (r0 == 0) goto La6
            int r4 = r4 - r1
            r2.LLILLL = r4
        L16:
            java.lang.Object r6 = r2.LL
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r2.LLILLL
            r4 = 2
            r5 = 1
            if (r0 == 0) goto L2c
            if (r0 == r5) goto L99
            if (r0 != r4) goto Lad
            X.C155000ia.LIZIZ(r6)
        L29:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2c:
            X.C155000ia.LIZIZ(r6)
            java.lang.StringBuilder r8 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "task failed: errorCode="
            r8.append(r0)
            r6 = r40
            r8.append(r6)
            java.lang.String r0 = ", errorMsg="
            r8.append(r0)
            r7 = r41
            r8.append(r7)
            java.lang.String r0 = ", taskInfo="
            r8.append(r0)
            X.0LSZ r0 = r3.LIZLLL
            r8.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r8)
            r3.LJJJJJ(r0)
            X.0LSZ r8 = r3.LIZLLL
            r9 = 0
            r16 = 0
            r28 = 0
            r38 = 268337151(0xffe7fff, float:2.5095636E-29)
            r10 = r9
            r11 = r9
            r12 = r9
            r13 = r9
            r14 = r9
            r15 = r9
            r17 = r9
            r18 = r9
            r19 = r9
            r20 = r16
            r21 = r9
            r22 = r9
            r23 = r9
            r24 = r6
            r25 = r7
            r26 = r9
            r27 = r9
            r30 = r9
            r31 = r28
            r33 = r9
            r34 = r9
            r35 = r9
            r36 = r16
            r37 = r9
            X.0LSZ r0 = X.C0LSZ.LIZ(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r30, r31, r33, r34, r35, r36, r37, r38)
            r2.LLILLL = r5
            java.lang.Object r0 = X.C0LTN.LJJJI(r3, r0, r2)
            if (r0 != r1) goto L9c
            return r1
        L99:
            X.C155000ia.LIZIZ(r6)
        L9c:
            r2.LLILLL = r4
            r0 = 0
            java.lang.Object r0 = X.C0LTN.LJJIJIIJI(r3, r0, r2)
            if (r0 != r1) goto L29
            return r1
        La6:
            X.0LTv r2 = new X.0LTv
            r2.<init>(r3, r5)
            goto L16
        Lad:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C543560LTm.LJJJZ(int, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJL(java.lang.String r11, com.bytedance.ies.nle.editor_jni.NLETemplateModel r12, java.util.List r13, com.bytedance.ies.nle.editor_jni.NLEEditor r14) {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C543560LTm.LJJL(java.lang.String, com.bytedance.ies.nle.editor_jni.NLETemplateModel, java.util.List, com.bytedance.ies.nle.editor_jni.NLEEditor):void");
    }

    public final Object LJJJLL(int i, String str, final String str2, C543600LTq c543600LTq) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(c543600LTq));
        VEUtils.getVideoThumb(str, i, new InterfaceC1286300jZs(this) { // from class: X.09ni
            public final /* synthetic */ C543560LTm LIZIZ;

            {
                this.LIZIZ = this;
            }

            @Override // X.InterfaceC1286300jZs
            public final boolean processFrame(ByteBuffer byteBuffer, int i2, int i3, int i4) {
                if (byteBuffer == null) {
                    C2243608qg.LIZ("", c23260099m);
                }
                try {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                    if (byteBuffer != null) {
                        bitmapCreateBitmap.copyPixelsFromBuffer(byteBuffer.position(0));
                    }
                    C543560LTm c543560LTm = this.LIZIZ;
                    String str3 = str2;
                    c543560LTm.getClass();
                    String strLJJJJLL = C543560LTm.LJJJJLL(str3, ".jpeg");
                    C2475009mu.LJFF(100, Bitmap.CompressFormat.JPEG, bitmapCreateBitmap, new C0VSJ(strLJJJJLL));
                    C2243608qg.LIZ(strLJJJJLL, c23260099m);
                    return true;
                } catch (IllegalArgumentException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2243608qg.LIZ("", c23260099m);
                    return false;
                }
            }
        }, true, 80, 40, 0L, 0);
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(c543600LTq);
        }
        return objLIZ;
    }

    public final Object LJJJLZIJ(int i, String str, final String str2, C543610LTr c543610LTr) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(c543610LTr));
        VEUtils.getVideoThumb(str, i, new InterfaceC1286300jZs(this) { // from class: X.0LTi
            public final /* synthetic */ C543560LTm LIZIZ;

            {
                this.LIZIZ = this;
            }

            @Override // X.InterfaceC1286300jZs
            public final boolean processFrame(ByteBuffer byteBuffer, int i2, int i3, int i4) {
                if (byteBuffer == null) {
                    C2243608qg.LIZ(new C543540LTk(0, "null frame byteBuffer"), c23260099m);
                }
                try {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                    if (byteBuffer != null) {
                        bitmapCreateBitmap.copyPixelsFromBuffer(byteBuffer.position(0));
                    }
                    C543560LTm c543560LTm = this.LIZIZ;
                    String str3 = str2;
                    c543560LTm.getClass();
                    String strLJJJJLL = C543560LTm.LJJJJLL(str3, ".jpeg");
                    C2475009mu.LJFF(100, Bitmap.CompressFormat.JPEG, bitmapCreateBitmap, new C0VSJ(strLJJJJLL));
                    C2243608qg.LIZ(new C543530LTj(strLJJJJLL), c23260099m);
                    return true;
                } catch (IllegalArgumentException e) {
                    TryCatchGuardChecker.doCheck(e);
                    InterfaceC1364105Vn<InterfaceC543550LTl<String>> interfaceC1364105Vn = c23260099m;
                    String message = e.getMessage();
                    if (message == null) {
                        message = "illegalArgumentException";
                    }
                    C2243608qg.LIZ(new C543540LTk(0, message), interfaceC1364105Vn);
                    return false;
                }
            }
        }, true, 80, 40, 0L, 0);
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(c543610LTr);
        }
        return objLIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0124 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJZ(int r46, java.lang.String r47, java.lang.String r48, java.lang.String r49, X.InterfaceC1364105Vn<? super java.util.List<X.C0E4S>> r50) {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C543560LTm.LJJJJZ(int, java.lang.String, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0280  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJZI(int r50, java.lang.String r51, java.lang.String r52, java.lang.String r53, X.InterfaceC1364105Vn<? super X.InterfaceC543550LTl<? extends java.util.List<X.C0E4S>>> r54) {
        /*
            Method dump skipped, instruction units count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C543560LTm.LJJJJZI(int, java.lang.String, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
