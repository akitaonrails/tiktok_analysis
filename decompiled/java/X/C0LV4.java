package X;

import com.ss.android.ugc.aweme.aigc.asynctask.AIGCServerTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.GeneralI2VServerProgressTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.experiment.aicreation.AICreationGenerateConfigExp;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCResultType;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0LV4, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LV4 extends C0LSD<C09JG, GeneralI2VServerProgressTaskOutput> {
    public final C557860LuK LJIIJ = new C557860LuK();
    public String LJIIJJI = "";
    public final String LJIIL = C0LMI.POLLING.getType();
    public AIGCResultType LJIILIIL = AIGCResultType.VIDEO;
    public final List<AIGCServerTaskOutput> LJIILJJIL = new ArrayList();
    public String LJIILL = "";
    public final C01GW LJIILLIIL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(637));

    @Override // X.C0LTN
    public final String LJJ() {
        return C0LM5.AI_CREATION_SERVER_PROGRESS.getTypeName();
    }

    @Override // X.C0LSD
    public final C0LUV LJJJJLL() {
        return new C00FS(Integer.valueOf(this.LIZLLL.LJII), Long.valueOf(this.LIZLLL.LJIL), this.LIZLLL.LJIJJLI, this.LIZLLL.LJJ.taskLogId);
    }

    public final boolean LJJLI() {
        return (((AICreationGenerateConfigExp.AICreationGenerateConfig) this.LJIILLIIL.getValue()).disablePollingIfWeakNetwork && ((INetworkStateService) C560970LzL.LIZ.getValue()).isWeakNetwork()) || C1906580ziK.LJI() || !C560970LzL.LIZIZ();
    }

    @Override // X.C0LTN
    public final String LJIL() {
        return this.LJIIL;
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
            boolean r0 = r7 instanceof X.C0LV8
            if (r0 == 0) goto L46
            r5 = r7
            X.0LV8 r5 = (X.C0LV8) r5
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
            X.0LuK r1 = r6.LJIIJ
            X.0LSZ r0 = r6.LIZLLL
            java.lang.String r0 = r0.LJIJJLI
            r5.LLILLL = r2
            java.lang.Object r0 = r1.LIZ(r0, r5)
            if (r0 != r3) goto L25
            return r3
        L46:
            X.0LV8 r5 = new X.0LV8
            r5.<init>(r6, r7)
            goto L12
        L4c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LV4.LJIIJ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJLL(X.InterfaceC1364105Vn<? super java.lang.Boolean> r21) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LV4.LJJJLL(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJLIIIJ(X.InterfaceC1364105Vn<? super java.lang.Integer> r27) {
        /*
            Method dump skipped, instruction units count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LV4.LJJLIIIJ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00db  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00a0 -> B:39:0x00b8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00b0 -> B:39:0x00b8). Please report as a decompilation issue!!! */
    @Override // X.C0LTN, X.InterfaceC542770LQl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.C09JG r11, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.aigc.asynctask.GeneralI2VServerProgressTaskOutput> r12) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LV4.LJFF(X.09JG, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0077 A[PHI: r9
      0x0077: PHI (r9v3 java.lang.String) = (r9v1 java.lang.String), (r9v5 java.lang.String) binds: [B:38:0x0075, B:36:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJLIIL(com.ss.android.ugc.aweme.aigc.asynctask.GeneralI2VServerProgressTaskInput r44, X.InterfaceC1364105Vn<? super kotlin.Unit> r45) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LV4.LJJJLIIL(com.ss.android.ugc.aweme.aigc.asynctask.GeneralI2VServerProgressTaskInput, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJLZIJ(X.C09JG r39, X.InterfaceC1364105Vn<? super kotlin.Unit> r40) {
        /*
            r38 = this;
            r5 = r40
            r3 = r39
            boolean r0 = r5 instanceof X.C0LVA
            r2 = r38
            if (r0 == 0) goto L8f
            r6 = r5
            X.0LVA r6 = (X.C0LVA) r6
            int r4 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r1
            if (r0 == 0) goto L8f
            int r4 = r4 - r1
            r6.LLILZ = r4
        L18:
            java.lang.Object r5 = r6.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r1 = 1
            if (r0 == 0) goto L40
            if (r0 != r1) goto L95
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
            if (r0 == 0) goto L3d
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
            java.lang.Object r0 = r2.LJIIIZ(r0, r6)
            if (r0 != r4) goto L2a
            return r4
        L8f:
            X.0LVA r6 = new X.0LVA
            r6.<init>(r2, r5)
            goto L18
        L95:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LV4.LJJJLZIJ(X.09JG, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0189 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJL(com.ss.android.ugc.aweme.aigc.asynctask.net.TaskDetail r46, X.InterfaceC1364105Vn<? super kotlin.Unit> r47) {
        /*
            Method dump skipped, instruction units count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LV4.LJJL(com.ss.android.ugc.aweme.aigc.asynctask.net.TaskDetail, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJLIIIIJ(java.lang.String r17, X.InterfaceC1364105Vn r18) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LV4.LJJLIIIIJ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    @Override // X.C0LTN, X.InterfaceC542770LQl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(int r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, X.InterfaceC1364105Vn<? super kotlin.Unit> r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof X.C0LVB
            r4 = r10
            if (r0 == 0) goto L45
            r9 = r15
            X.0LVB r9 = (X.C0LVB) r9
            int r2 = r9.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L45
            int r2 = r2 - r1
            r9.LLILLL = r2
        L13:
            java.lang.Object r3 = r9.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r9.LLILLL
            r0 = 1
            if (r1 == 0) goto L35
            if (r1 != r0) goto L52
            X.C155000ia.LIZIZ(r3)
        L23:
            X.0Lcd r0 = X.C546890Lcd.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.aikit.api.create.AIQuotaService r2 = X.C546890Lcd.LIZIZ()
            X.0LSZ r0 = r4.LIZLLL
            com.ss.android.ugc.aweme.aigc.asynctask.Source r1 = r0.LJIIL
            if (r1 != 0) goto L4b
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L35:
            X.C155000ia.LIZIZ(r3)
            r9.LLILLL = r0
            r8 = r14
            r7 = r13
            r6 = r12
            r5 = r11
            java.lang.Object r0 = X.C0LTN.LJJIZ(r4, r5, r6, r7, r8, r9)
            if (r0 != r2) goto L23
            return r2
        L45:
            X.0LVB r9 = new X.0LVB
            r9.<init>(r4, r15)
            goto L13
        L4b:
            r0 = 0
            r2.LJFF(r1, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L52:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LV4.LJI(int, java.lang.String, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    public final Object LJJJZ(int i, String str, String str2, String str3, InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1) {
        if (i == 0) {
            return function1.invoke(interfaceC1364105Vn);
        }
        if (str2 == null) {
            str2 = C543180LSa.LIZJ(i);
        }
        Object objLJI = LJI(i, str, str2, str3, interfaceC1364105Vn);
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }
}
