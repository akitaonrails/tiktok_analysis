package X;

import X.C09JG;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.experiment.AigcArchFixParentTaskParamExperiment;
import com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput;
import com.ss.android.ugc.aweme.aigc.asynctask.workflowbuilder.ITaskScheduler;
import com.ss.android.ugc.aweme.aigc.asynctask.workflowbuilder.IWorkflowManager;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LRR, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public abstract class C0LRR<IN extends C09JG, OUT extends AbsTaskOutput> extends C0LTN<C09JG, AbsTaskOutput> {
    public static final C1DEV LJIILL = C2191201ApK.LIZ();
    public final List<C0LRS<C09JG, AbsTaskOutput>> LJIIIIZZ = new ArrayList();
    public final Class<PublicTaskInput> LJIIIZ = PublicTaskInput.class;
    public PublicTaskInput LJIIJ;
    public boolean LJIIJJI;
    public final IWorkflowManager LJIIL;
    public final C054G LJIILIIL;
    public AnonymousClass0956 LJIILJJIL;

    @Override // X.C0LTN, X.InterfaceC542770LQl
    public final Object LIZIZ(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return LJJLIIJ(this, interfaceC1364105Vn);
    }

    @Override // X.C0LTN, X.InterfaceC542770LQl
    public final Object LJFF(C09JG c09jg, InterfaceC1364105Vn<? super C1974607oO> interfaceC1364105Vn) {
        return LJJLIIIJ(this, c09jg, interfaceC1364105Vn);
    }

    @Override // X.C0LTN, X.InterfaceC542770LQl
    public Object LJIIJ(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return LJJJJLL(this, interfaceC1364105Vn);
    }

    public Object LJJJJJL(PublicTaskInput publicTaskInput, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return LJJJJL(this, publicTaskInput, interfaceC1364105Vn);
    }

    public Object LJJJLIIL(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return LJJJLL(this, interfaceC1364105Vn);
    }

    public Object LJJL(C542950LRd c542950LRd) {
        return LJJLI(this, c542950LRd);
    }

    public void LJJLIIIIJ() {
    }

    public Object LJJLIIIJILLIZJL(InterfaceC542770LQl interfaceC542770LQl, C09JG c09jg, AbstractC23140094w abstractC23140094w) {
        return LJJLIIIJJI(this, interfaceC542770LQl, c09jg, abstractC23140094w);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public int LJJJJZ() {
        C0LSZ c0lszLJIIIIZZ;
        C0LSZ c0lszLJIIIIZZ2;
        C0LSZ c0lszLJIIIIZZ3;
        String str = this.LIZLLL.LJI;
        int i = 0;
        switch (str.hashCode()) {
            case -2084521848:
                if (str.equals("DOWNLOAD")) {
                    InterfaceC542770LQl<? super C09JG, ? extends AbsTaskOutput> interfaceC542770LQl = this.LJ;
                    if (interfaceC542770LQl != null && (c0lszLJIIIIZZ3 = interfaceC542770LQl.LJIIIIZZ()) != null) {
                        i = c0lszLJIIIIZZ3.LJII;
                    }
                    return ((int) (((double) i) * 0.04d)) + 95;
                }
                break;
            case -1852497085:
                if (str.equals("SERVER")) {
                    InterfaceC542770LQl<? super C09JG, ? extends AbsTaskOutput> interfaceC542770LQl2 = this.LJ;
                    if (interfaceC542770LQl2 != null && (c0lszLJIIIIZZ2 = interfaceC542770LQl2.LJIIIIZZ()) != null) {
                        i = c0lszLJIIIIZZ2.LJII;
                    }
                    return 5 + ((int) (((double) i) * 0.9d));
                }
                break;
            case -218451411:
                if (str.equals("PROGRESS")) {
                    InterfaceC542770LQl<? super C09JG, ? extends AbsTaskOutput> interfaceC542770LQl3 = this.LJ;
                    if (interfaceC542770LQl3 != null && (c0lszLJIIIIZZ = interfaceC542770LQl3.LJIIIIZZ()) != null) {
                        i = c0lszLJIIIIZZ.LJII;
                    }
                    return ((int) (((double) i) * 0.9d)) + 10;
                }
                break;
            case 1456113029:
                if (str.equals("IMAGE_UPLOAD")) {
                    return 5;
                }
                break;
        }
        return this.LIZLLL.LJII;
    }

    public C0LRR() {
        IWorkflowManager iWorkflowManager;
        try {
            iWorkflowManager = (IWorkflowManager) PluggableExtentionKt.pluggableSpi$default(IWorkflowManager.class, false, false, false, 14, null);
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            iWorkflowManager = null;
        }
        this.LJIIL = iWorkflowManager;
        this.LJIILIIL = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
    }

    public List<InterfaceC543000LRi<? extends C09JG, ? extends AbsTaskOutput>> LJJJJLI(String str) {
        ITaskScheduler iTaskSchedulerLIZ;
        List<InterfaceC543000LRi<? extends C09JG, ? extends AbsTaskOutput>> listLIZJ;
        IWorkflowManager iWorkflowManager = this.LJIIL;
        if (iWorkflowManager == null || (iTaskSchedulerLIZ = iWorkflowManager.LIZ()) == null || (listLIZJ = iTaskSchedulerLIZ.LIZJ(str)) == null) {
            return C13BV.INSTANCE;
        }
        return listLIZJ;
    }

    public long LJJJJZI(int i) {
        long j;
        C0LSZ c0lszLJIIIIZZ;
        InterfaceC542770LQl<? super C09JG, ? extends AbsTaskOutput> interfaceC542770LQl = this.LJ;
        if (interfaceC542770LQl != null && (c0lszLJIIIIZZ = interfaceC542770LQl.LJIIIIZZ()) != null) {
            j = c0lszLJIIIIZZ.LJIL;
        } else {
            j = -1;
        }
        if (!Intrinsics.LJFF(this.LIZLLL.LJI, LivePreviewCTASmartDisplayManager.DEFAULT) && !Intrinsics.LJFF(this.LIZLLL.LJI, "IMAGE_UPLOAD")) {
            String str = this.LIZLLL.LJI;
            String str2 = C0LMH.LIZ;
            if (!Intrinsics.LJFF(str, C0LMH.LIZ)) {
                if (!Intrinsics.LJFF(this.LIZLLL.LJI, "SERVER") && !Intrinsics.LJFF(this.LIZLLL.LJI, "PROGRESS")) {
                    if (Intrinsics.LJFF(this.LIZLLL.LJI, "DOWNLOAD") || i > 95) {
                        return 1000L;
                    }
                    return 120000L;
                }
                if (j >= 0) {
                    return 1000 + j;
                }
                if (this.LIZLLL.LJIL >= 1000) {
                    return this.LIZLLL.LJIL;
                }
                return 121000L;
            }
            return 123000L;
        }
        return 123000L;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <IN extends X.C09JG, OUT extends com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput> java.lang.Object LJJJJLL(X.C0LRR<? super IN, ? extends OUT> r8, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            boolean r0 = r9 instanceof X.C0LRY
            if (r0 == 0) goto L78
            r4 = r9
            X.0LRY r4 = (X.C0LRY) r4
            int r2 = r4.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L78
            int r2 = r2 - r1
            r4.LLILZIL = r2
        L12:
            java.lang.Object r1 = r4.LLILLL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZIL
            r5 = 2
            r6 = 1
            if (r0 == 0) goto L28
            if (r0 == r6) goto L63
            if (r0 != r5) goto L7e
            X.C155000ia.LIZIZ(r1)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r1)
            X.0C64 r7 = X.C0C64.LJIILLIIL()
            r1 = 31744(0x7c00, float:4.4483E-41)
            java.lang.String r0 = "aigc_cancel_et_fix"
            r2 = 0
            boolean r0 = r7.LJIIIZ(r1, r0, r6, r2)
            if (r0 != 0) goto L52
            X.0LSZ r0 = r8.LIZLLL
            java.lang.String r1 = r0.LJ
            java.lang.String r0 = "FINISHED"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L53
            X.0LSZ r0 = r8.LIZLLL
            java.lang.String r1 = r0.LJ
            java.lang.String r0 = "FAILED"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L53
        L52:
            r2 = 1
        L53:
            r4.LL = r8
            r4.LLILLJJLI = r2
            r4.LLILZIL = r6
            r8.getClass()
            java.lang.Object r0 = X.C0LTN.LJIILJJIL(r8, r4)
            if (r0 != r3) goto L6a
            return r3
        L63:
            int r2 = r4.LLILLJJLI
            X.0LRR r8 = r4.LL
            X.C155000ia.LIZIZ(r1)
        L6a:
            if (r2 == 0) goto L86
            r0 = 0
            r4.LL = r0
            r4.LLILZIL = r5
            java.lang.Object r0 = r8.LJJIIJ(r4)
            if (r0 != r3) goto L25
            return r3
        L78:
            X.0LRY r4 = new X.0LRY
            r4.<init>(r8, r9)
            goto L12
        L7e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L86:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LRR.LJJJJLL(X.0LRR, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x015c A[Catch: all -> 0x020d, TryCatch #2 {all -> 0x020d, blocks: (B:117:0x0209, B:99:0x0152, B:102:0x015c, B:105:0x01a6), top: B:122:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01ff A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b1 A[Catch: all -> 0x0208, TryCatch #1 {all -> 0x0208, blocks: (B:24:0x0073, B:26:0x0081, B:29:0x0087, B:31:0x008d, B:34:0x0093, B:36:0x0097, B:38:0x009b, B:40:0x00a3, B:43:0x00a8, B:51:0x00bc, B:53:0x00c7, B:55:0x00cd, B:57:0x00d1, B:59:0x00d5, B:61:0x00d9, B:76:0x00f4, B:80:0x00fd, B:82:0x010c, B:84:0x0110, B:85:0x0112, B:87:0x011e, B:89:0x0122, B:90:0x0124, B:92:0x0130, B:94:0x0134, B:95:0x0136, B:64:0x00df, B:66:0x00e3, B:68:0x00e7, B:45:0x00b1, B:47:0x00b5), top: B:123:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c7 A[Catch: all -> 0x0208, TryCatch #1 {all -> 0x0208, blocks: (B:24:0x0073, B:26:0x0081, B:29:0x0087, B:31:0x008d, B:34:0x0093, B:36:0x0097, B:38:0x009b, B:40:0x00a3, B:43:0x00a8, B:51:0x00bc, B:53:0x00c7, B:55:0x00cd, B:57:0x00d1, B:59:0x00d5, B:61:0x00d9, B:76:0x00f4, B:80:0x00fd, B:82:0x010c, B:84:0x0110, B:85:0x0112, B:87:0x011e, B:89:0x0122, B:90:0x0124, B:92:0x0130, B:94:0x0134, B:95:0x0136, B:64:0x00df, B:66:0x00e3, B:68:0x00e7, B:45:0x00b1, B:47:0x00b5), top: B:123:0x0073 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fd A[Catch: all -> 0x0208, TryCatch #1 {all -> 0x0208, blocks: (B:24:0x0073, B:26:0x0081, B:29:0x0087, B:31:0x008d, B:34:0x0093, B:36:0x0097, B:38:0x009b, B:40:0x00a3, B:43:0x00a8, B:51:0x00bc, B:53:0x00c7, B:55:0x00cd, B:57:0x00d1, B:59:0x00d5, B:61:0x00d9, B:76:0x00f4, B:80:0x00fd, B:82:0x010c, B:84:0x0110, B:85:0x0112, B:87:0x011e, B:89:0x0122, B:90:0x0124, B:92:0x0130, B:94:0x0134, B:95:0x0136, B:64:0x00df, B:66:0x00e3, B:68:0x00e7, B:45:0x00b1, B:47:0x00b5), top: B:123:0x0073 }] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [X.01eN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <IN extends X.C09JG, OUT extends com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput> java.lang.Object LJJJLL(X.C0LRR<? super IN, ? extends OUT> r43, X.InterfaceC1364105Vn<? super kotlin.Unit> r44) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LRR.LJJJLL(X.0LRR, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <IN extends X.C09JG, OUT extends com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput> java.lang.Object LJJLI(X.C0LRR<? super IN, ? extends OUT> r34, X.InterfaceC1364105Vn<? super kotlin.Unit> r35) {
        /*
            r5 = r35
            r3 = r34
            boolean r0 = r5 instanceof X.C542920LRa
            if (r0 == 0) goto Lb2
            r4 = r5
            X.0LRa r4 = (X.C542920LRa) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb2
            int r2 = r2 - r1
            r4.LLILZ = r2
        L16:
            java.lang.Object r5 = r4.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r1 = 1
            if (r0 == 0) goto L33
            if (r0 != r1) goto Lb9
            X.0LRR r3 = r4.LL
            X.C155000ia.LIZIZ(r5)
        L28:
            com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput r1 = r3.LJIIJ
            if (r1 == 0) goto L30
            com.ss.android.ugc.aweme.aigc.asynctask.models.PublicInputType r0 = com.ss.android.ugc.aweme.aigc.asynctask.models.PublicInputType.RETRY
            r1.publicInputType = r0
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            X.C155000ia.LIZIZ(r5)
            X.0LSZ r0 = r3.LIZLLL
            java.lang.String r5 = r0.LJ
            java.lang.String r0 = "FAILED"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r0)
            if (r0 == 0) goto L28
            java.lang.String r0 = "RetryTaskInput"
            r3.LJJJJIZL(r0)
            com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput r0 = r3.LJIIJ
            if (r0 == 0) goto L50
            com.ss.android.ugc.aweme.aigc.asynctask.models.ChildTaskOutput r5 = r0.childTaskOutPut
            r0 = 0
            r5.commonAigcQuotaOutput = r0
        L50:
            X.0LSZ r5 = r3.LIZLLL
            r6 = 0
            java.lang.String r10 = "DEFAULT"
            r13 = 0
            com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput r0 = r3.LJIIJ
            if (r0 != 0) goto L71
            com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput r0 = new com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput
            r22 = 127(0x7f, float:1.78E-43)
            r14 = r0
            r15 = r6
            r16 = r6
            r17 = r6
            r18 = r6
            r19 = r6
            r20 = r6
            r21 = r6
            r23 = r6
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)
        L71:
            java.lang.String r19 = X.C0LKZ.LIZIZ(r0)
            if (r19 != 0) goto L79
            java.lang.String r19 = ""
        L79:
            r25 = 0
            r35 = 268427247(0xfffdfef, float:2.5231197E-29)
            r7 = r6
            r8 = r6
            r9 = r6
            r11 = r6
            r12 = r6
            r14 = r6
            r15 = r6
            r16 = r6
            r17 = r13
            r18 = r6
            r20 = r6
            r21 = r13
            r22 = r6
            r23 = r6
            r24 = r6
            r27 = r6
            r28 = r25
            r30 = r6
            r31 = r6
            r32 = r6
            r33 = r13
            r34 = r6
            X.0LSZ r0 = X.C0LSZ.LIZ(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r27, r28, r30, r31, r32, r33, r34, r35)
            r4.LL = r3
            r4.LLILZ = r1
            java.lang.Object r0 = X.C0LTN.LJJJI(r3, r0, r4)
            if (r0 != r2) goto L28
            return r2
        Lb2:
            X.0LRa r4 = new X.0LRa
            r4.<init>(r3, r5)
            goto L16
        Lb9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LRR.LJJLI(X.0LRR, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <IN extends X.C09JG, OUT extends com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput> java.lang.Object LJJLIIJ(X.C0LRR<? super IN, ? extends OUT> r36, X.InterfaceC1364105Vn<? super kotlin.Unit> r37) {
        /*
            r3 = r37
            r4 = r36
            boolean r0 = r3 instanceof X.C542930LRb
            if (r0 == 0) goto La1
            r5 = r3
            X.0LRb r5 = (X.C542930LRb) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La1
            int r2 = r2 - r1
            r5.LLILZ = r2
        L16:
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r8 = 0
            r2 = 2
            r6 = 1
            if (r0 == 0) goto L36
            if (r0 == r6) goto L8e
            if (r0 != r2) goto La8
            X.0LRR r4 = r5.LL
            X.C155000ia.LIZIZ(r1)
        L2c:
            X.0956 r0 = r4.LJIILJJIL
            if (r0 == 0) goto L33
            r0.LIZIZ(r8)
        L33:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L36:
            X.C155000ia.LIZIZ(r1)
            X.0LQl<? super X.09JG, ? extends com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput> r0 = r4.LJ
            if (r0 == 0) goto L93
            X.0LSZ r0 = r0.LJIIIIZZ()
            if (r0 == 0) goto L93
            java.lang.String r1 = r0.LJIJJLI
            if (r1 == 0) goto L93
            int r0 = r1.length()
            if (r0 <= 0) goto L93
            X.0LSZ r7 = r4.LIZLLL
            r15 = 0
            r27 = 0
            r37 = 266338303(0xfdfffff, float:2.2088104E-29)
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
            r21 = r8
            r22 = r8
            r23 = r15
            r24 = r8
            r25 = r8
            r26 = r8
            r29 = r1
            r30 = r27
            r32 = r8
            r33 = r8
            r34 = r8
            r35 = r15
            r36 = r8
            X.0LSZ r0 = X.C0LSZ.LIZ(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r29, r30, r32, r33, r34, r35, r36, r37)
            r5.LL = r4
            r5.LLILZ = r6
            java.lang.Object r0 = X.C0LTN.LJJJI(r4, r0, r5)
            if (r0 != r3) goto L93
            return r3
        L8e:
            X.0LRR r4 = r5.LL
            X.C155000ia.LIZIZ(r1)
        L93:
            r5.LL = r4
            r5.LLILZ = r2
            r4.getClass()
            java.lang.Object r0 = X.C0LTN.LJJJIL(r4, r5)
            if (r0 != r3) goto L2c
            return r3
        La1:
            X.0LRb r5 = new X.0LRb
            r5.<init>(r4, r3)
            goto L16
        La8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LRR.LJJLIIJ(X.0LRR, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0155 A[Catch: all -> 0x0251, TryCatch #0 {all -> 0x0251, blocks: (B:51:0x014b, B:53:0x0155, B:60:0x0169, B:62:0x016f, B:63:0x0174, B:65:0x017a, B:67:0x0184, B:68:0x0197, B:70:0x019d, B:71:0x01ab, B:73:0x01b8, B:76:0x01c6, B:77:0x01ce, B:79:0x01d4, B:81:0x01dc, B:83:0x01e0, B:84:0x01e5, B:86:0x01f9, B:87:0x01fc, B:88:0x01fd, B:90:0x0201, B:91:0x0205, B:93:0x020b), top: B:108:0x014b }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0201 A[Catch: all -> 0x0251, TryCatch #0 {all -> 0x0251, blocks: (B:51:0x014b, B:53:0x0155, B:60:0x0169, B:62:0x016f, B:63:0x0174, B:65:0x017a, B:67:0x0184, B:68:0x0197, B:70:0x019d, B:71:0x01ab, B:73:0x01b8, B:76:0x01c6, B:77:0x01ce, B:79:0x01d4, B:81:0x01dc, B:83:0x01e0, B:84:0x01e5, B:86:0x01f9, B:87:0x01fc, B:88:0x01fd, B:90:0x0201, B:91:0x0205, B:93:0x020b), top: B:108:0x014b }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x020b A[Catch: all -> 0x0251, TryCatch #0 {all -> 0x0251, blocks: (B:51:0x014b, B:53:0x0155, B:60:0x0169, B:62:0x016f, B:63:0x0174, B:65:0x017a, B:67:0x0184, B:68:0x0197, B:70:0x019d, B:71:0x01ab, B:73:0x01b8, B:76:0x01c6, B:77:0x01ce, B:79:0x01d4, B:81:0x01dc, B:83:0x01e0, B:84:0x01e5, B:86:0x01f9, B:87:0x01fc, B:88:0x01fd, B:90:0x0201, B:91:0x0205, B:93:0x020b), top: B:108:0x014b }] */
    /* JADX WARN: Type inference failed for: r42v0, types: [X.0LRR, X.0LRR<IN extends X.09JG, OUT extends com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput>, X.0LTN] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.05Vn] */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v5, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJLZIJ(X.C09JG r43, X.InterfaceC1364105Vn<? super kotlin.Unit> r44) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LRR.LJJJLZIJ(X.09JG, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00cd A[PHI: r10
      0x00cd: PHI (r10v3 java.lang.String) = (r10v0 java.lang.String), (r10v4 java.lang.String) binds: [B:63:0x00cb, B:61:0x00c7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d1 A[PHI: r10
      0x00d1: PHI (r10v2 java.lang.String) = (r10v0 java.lang.String), (r10v3 java.lang.String) binds: [B:63:0x00cb, B:65:0x00cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01cf A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJZ(com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput r56, X.InterfaceC1364105Vn<? super kotlin.Unit> r57) {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LRR.LJJJZ(com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput, X.05Vn):java.lang.Object");
    }

    public final Object LJJLIIIJJIZ(C0LSZ c0lsz, AbstractC23140094w abstractC23140094w) {
        String strLIZIZ;
        if (AigcArchFixParentTaskParamExperiment.isEnabled()) {
            PublicTaskInput publicTaskInput = this.LJIIJ;
            if (publicTaskInput == null || (strLIZIZ = C0LKZ.LIZIZ(publicTaskInput)) == null) {
                strLIZIZ = "";
            }
            Object objLJJJI = C0LTN.LJJJI(this, C0LSZ.LIZ(c0lsz, null, null, null, null, null, null, null, 0, null, null, null, 0, null, strLIZIZ, null, 0, null, null, null, 0L, null, 0L, null, null, null, 0, null, 268427263), abstractC23140094w);
            if (objLJJJI == C099R.LJFF()) {
                return objLJJJI;
            }
            return Unit.LIZ;
        }
        Object objLJJJI2 = C0LTN.LJJJI(this, c0lsz, abstractC23140094w);
        if (objLJJJI2 == C099R.LJFF()) {
            return objLJJJI2;
        }
        return Unit.LIZ;
    }

    public final Object LJJLIL(PublicTaskInput publicTaskInput, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        String strLIZIZ = C0LKZ.LIZIZ(publicTaskInput);
        if (strLIZIZ == null) {
            strLIZIZ = "";
        }
        Object objLJJJI = C0LTN.LJJJI(this, C0LSZ.LIZ(this.LIZLLL, null, null, null, null, null, null, null, 0, null, null, null, 0, null, strLIZIZ, null, 0, null, null, null, 0L, null, 0L, null, null, null, 0, null, 268427263), interfaceC1364105Vn);
        if (objLJJJI == C099R.LJFF()) {
            return objLJJJI;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <IN extends X.C09JG, OUT extends com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput> java.lang.Object LJJJJL(X.C0LRR<? super IN, ? extends OUT> r38, com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput r39, X.InterfaceC1364105Vn<? super kotlin.Unit> r40) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LRR.LJJJJL(X.0LRR, com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0189 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a3 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d1  */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.0LRR, X.0LTN] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0LRR] */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.0LRR, X.0LTN, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.0LRR] */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.0LRR] */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.0LRR, X.0LTN] */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.0LRR] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v7, types: [X.0LTN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <IN extends X.C09JG, OUT extends com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput> java.lang.Object LJJLIIIJ(X.C0LRR<? super IN, ? extends OUT> r22, X.C09JG r23, X.InterfaceC1364105Vn<? super X.C1974607oO> r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LRR.LJJLIIIJ(X.0LRR, X.09JG, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x021b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJLIIIJL(X.C0LRS<X.C09JG, com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput> r42, com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput r43, X.InterfaceC1364105Vn<? super kotlin.Unit> r44) {
        /*
            Method dump skipped, instruction units count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LRR.LJJLIIIJL(X.0LRS, com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0236 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0269  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [X.0LRS, com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJLIIIJLJLI(X.C0LRS<X.C09JG, com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput> r42, com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput r43, X.InterfaceC1364105Vn<? super kotlin.Unit> r44) {
        /*
            Method dump skipped, instruction units count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LRR.LJJLIIIJLJLI(X.0LRS, com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJLIIIJLLLLLLLZ(X.C0LRS<X.C09JG, com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput> r42, X.C09JG r43, X.InterfaceC1364105Vn<? super kotlin.Unit> r44) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LRR.LJJLIIIJLLLLLLLZ(X.0LRS, X.09JG, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <IN extends X.C09JG, OUT extends com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput> java.lang.Object LJJLIIIJJI(X.C0LRR<? super IN, ? extends OUT> r36, X.InterfaceC542770LQl<? super X.C09JG, ? extends com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput> r37, X.C09JG r38, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput> r39) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LRR.LJJLIIIJJI(X.0LRR, X.0LQl, X.09JG, X.05Vn):java.lang.Object");
    }
}
