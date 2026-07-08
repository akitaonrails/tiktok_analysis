package X;

import X.C09JG;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.aigc.asynctask.experiment.aicreation.AICreationGenerateConfigExp;
import com.ss.android.ugc.aweme.aigc.asynctask.models.CommonParentTaskInput;
import com.ss.android.ugc.aweme.aigc.asynctask.models.ParentTaskInput;
import com.ss.android.ugc.aweme.aigc.asynctask.models.PublicTaskInput;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0LSC, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public abstract class C0LSC<IN extends C09JG, OUT extends AbsTaskOutput> extends C0LRR<IN, OUT> {
    public final String LJIILLIIL = C0LMI.FLOW.getType();
    public final C01GW LJIIZILJ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(17));
    public final C01GW LJIJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 3));

    @Override // X.C0LTN
    public final Object LJJIIJ(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return LJJZZI(this, interfaceC1364105Vn);
    }

    @Override // X.C0LTN
    public final Object LJJIJ(boolean z, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return LJJZZIII(this, z, interfaceC1364105Vn);
    }

    @Override // X.C0LTN
    public final Object LJJIJIL(C0LRX c0lrx) {
        return LJL(this, c0lrx);
    }

    @Override // X.C0LRR
    public final Object LJJL(C542950LRd c542950LRd) {
        return LJJZ(this, c542950LRd);
    }

    public abstract AICreationGenerateConfigExp.AICreationGenerateConfig LJJLJ();

    public abstract C0LSL LJJLL();

    public final C0LUU LJJLJLI() {
        String source;
        AccountUserService accountUserServiceLJIIJ;
        ParentTaskInput parentTaskInput;
        CommonParentTaskInput commonParentTaskInput;
        String str;
        String str2 = this.LIZLLL.LIZ;
        String str3 = this.LIZLLL.LIZ;
        Source source2 = this.LIZLLL.LJIIL;
        String str4 = "";
        if (source2 == null || (source = source2.getSource()) == null) {
            source = "";
        }
        String str5 = this.LIZLLL.LJJ.entranceScene;
        String str6 = this.LJIILLIIL;
        PublicTaskInput publicTaskInput = this.LJIIJ;
        if (publicTaskInput != null && (parentTaskInput = publicTaskInput.parentTaskInput) != null && (commonParentTaskInput = parentTaskInput.commonParentTaskInput) != null && (str = commonParentTaskInput.jobType) != null) {
            str4 = str;
        }
        C0CHQ.LIZ().getApplicationService().getClass();
        String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        return new C0LUU(str2, str3, source, str5, str6, str4, strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId, (iAccountService == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null) ? null : accountUserServiceLJIIJ.getCurUserId(), LJJII() ? 1 : 0, this.LIZLLL.LJJ.creationId);
    }

    @Override // X.C0LRR
    public final int LJJJJZ() {
        C0LSL c0lslLJJLL = LJJLL();
        C0LSZ c0lsz = this.LIZLLL;
        InterfaceC542770LQl<? super C09JG, ? extends AbsTaskOutput> interfaceC542770LQl = this.LJ;
        return c0lslLJJLL.LIZJ(c0lsz, interfaceC542770LQl != null ? interfaceC542770LQl.LJIIIIZZ() : null);
    }

    @Override // X.C0LRR
    public final void LJJLIIIIJ() {
        LJJLL().LJ(this.LJIIIIZZ);
    }

    @Override // X.C0LTN
    public final String LJIL() {
        return this.LJIILLIIL;
    }

    @Override // X.C0LRR, X.C0LTN, X.InterfaceC542770LQl
    public final Object LJIIJ(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        if (C1697810uHb.LJIIJJI("FINISHED", "CANCELED", "FAILED").contains(this.LIZLLL.LJ)) {
            return Unit.LIZ;
        }
        Object objLJJJJLL = C0LRR.LJJJJLL(this, interfaceC1364105Vn);
        if (objLJJJJLL == C099R.LJFF()) {
            return objLJJJJLL;
        }
        return Unit.LIZ;
    }

    @Override // X.C0LTN
    public final void LJJJJIZL(String str) {
        C542830LQr c542830LQr = C542830LQr.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJJ());
        sbLIZ.append(' ');
        sbLIZ.append(str);
        C201955140j.LIZLLL(c542830LQr, "CreationAsyncTask", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C0LTN
    public final void LJJJJJ(String str) {
        C542830LQr c542830LQr = C542830LQr.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJJ());
        sbLIZ.append(' ');
        sbLIZ.append(str);
        C201955140j.LJIIIIZZ(c542830LQr, "CreationAsyncTask", C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002b  */
    @Override // X.C0LRR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long LJJJJZI(int r9) {
        /*
            r8 = this;
            X.0LSZ r0 = r8.LIZLLL
            java.lang.String r1 = r0.LJI
            java.lang.String r0 = "PROGRESS"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r6 = 0
            if (r0 == 0) goto L30
            X.0LQl<? super X.09JG, ? extends com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput> r0 = r8.LJ
            if (r0 == 0) goto L2b
            X.0LSZ r0 = r0.LJIIIIZZ()
            if (r0 == 0) goto L2b
            long r2 = r0.LJIL
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 < 0) goto L2b
        L1e:
            X.0LSZ r0 = r8.LIZLLL
            long r4 = r0.LJIL
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 > 0) goto L35
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 <= 0) goto L35
            return r2
        L2b:
            X.0LSZ r0 = r8.LIZLLL
            long r2 = r0.LJIL
            goto L1e
        L30:
            X.0LSZ r0 = r8.LIZLLL
            long r2 = r0.LJIL
            goto L1e
        L35:
            X.0LSZ r0 = r8.LIZLLL
            long r0 = r0.LJIL
            long r0 = java.lang.Math.min(r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LSC.LJJJJZI(int):long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0171  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v2, types: [com.ss.android.ugc.aweme.aigc.asynctask.QuotaResult, com.ss.android.ugc.aweme.aigc.asynctask.Source, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v3, types: [com.ss.android.ugc.aweme.aigc.asynctask.models.ChildTaskOutput, com.ss.android.ugc.aweme.aigc.asynctask.models.ParentTaskInput, com.ss.android.ugc.aweme.aigc.asynctask.models.PublicInputType, java.lang.String, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r32v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r33v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r34v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r35v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r37v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r38v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r39v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r40v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r42v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <IN extends X.C09JG, OUT extends com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput> java.lang.Object LJJZ(X.C0LSC<? super IN, ? extends OUT> r42, X.InterfaceC1364105Vn<? super kotlin.Unit> r43) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LSC.LJJZ(X.0LSC, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <IN extends X.C09JG, OUT extends com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput> java.lang.Object LJJZZI(X.C0LSC<? super IN, ? extends OUT> r35, X.InterfaceC1364105Vn<? super kotlin.Unit> r36) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LSC.LJJZZI(X.0LSC, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <IN extends X.C09JG, OUT extends com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput> java.lang.Object LJL(X.C0LSC<? super IN, ? extends OUT> r5, X.InterfaceC1364105Vn<? super kotlin.Unit> r6) {
        /*
            boolean r0 = r6 instanceof X.C0LSJ
            if (r0 == 0) goto L53
            r4 = r6
            X.0LSJ r4 = (X.C0LSJ) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L53
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r3 = r4.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r1 = 1
            if (r0 == 0) goto L3a
            if (r0 != r1) goto L59
            X.0LSC r5 = r4.LL
            X.C155000ia.LIZIZ(r3)
        L24:
            X.0LSO r2 = new X.0LSO
            X.0LUU r1 = r5.LJJLJLI()
            r0 = 0
            r2.<init>(r1, r0)
            com.ss.android.ugc.aweme.aigc.aicreation.mob.IAICreationTaskEventTracker r0 = X.C0LSM.LIZ()
            if (r0 == 0) goto L37
            r0.LIZ(r2)
        L37:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3a:
            X.C155000ia.LIZIZ(r3)
            X.0LSZ r0 = r5.LIZLLL
            com.ss.android.ugc.aweme.aigc.asynctask.TaskLogExtra r0 = r0.LJJ
            boolean r0 = r0.hasMobStart
            if (r0 == 0) goto L48
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L48:
            r4.LL = r5
            r4.LLILZ = r1
            java.lang.Object r0 = X.C0LTN.LJJIJL(r5, r4)
            if (r0 != r2) goto L24
            return r2
        L53:
            X.0LSJ r4 = new X.0LSJ
            r4.<init>(r5, r6)
            goto L12
        L59:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LSC.LJL(X.0LSC, X.05Vn):java.lang.Object");
    }

    @Override // X.C0LTN, X.InterfaceC542770LQl
    public final Object LJIIIZ(C0LSZ c0lsz, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        List listLIZIZ = C543180LSa.LIZIZ(this.LIZLLL, c0lsz);
        if ((!listLIZIZ.isEmpty()) && listLIZIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("taskInfo diff: ");
            sbLIZ.append(C13LP.LJJLIIIJ(listLIZIZ, ", ", null, null, 0, null, null, 62));
            LJJJJIZL(C2188811AlT.LIZIZ(sbLIZ));
        }
        Object objLJJJ = C0LTN.LJJJ(this, c0lsz, interfaceC1364105Vn);
        if (objLJJJ != C099R.LJFF()) {
            return Unit.LIZ;
        }
        return objLJJJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <IN extends X.C09JG, OUT extends com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput> java.lang.Object LJJZZIII(X.C0LSC<? super IN, ? extends OUT> r15, boolean r16, X.InterfaceC1364105Vn<? super kotlin.Unit> r17) {
        /*
            r4 = r17
            r2 = r15
            r7 = r16
            boolean r0 = r4 instanceof X.C0LSF
            if (r0 == 0) goto L98
            r5 = r4
            X.0LSF r5 = (X.C0LSF) r5
            int r3 = r5.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L98
            int r3 = r3 - r1
            r5.LLILZIL = r3
        L17:
            java.lang.Object r4 = r5.LLILLL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILZIL
            r1 = 1
            if (r0 == 0) goto L7d
            if (r0 != r1) goto L9f
            boolean r7 = r5.LLILLJJLI
            X.0LSC r2 = r5.LL
            X.C155000ia.LIZIZ(r4)
        L2b:
            java.lang.String r0 = X.C0LMH.LIZ
            X.0LSZ r0 = r2.LIZLLL
            java.lang.String r0 = r0.LJI
            java.lang.String r9 = X.C0LMH.LIZ(r0)
            X.0LSZ r0 = r2.LIZLLL
            int r3 = r0.LJII
            long r4 = java.lang.System.currentTimeMillis()
            X.0LSZ r0 = r2.LIZLLL
            long r0 = r0.LJIJJ
            long r4 = r4 - r0
            X.0LSZ r0 = r2.LIZLLL
            int r1 = r0.LJIILL
            X.0LSZ r0 = r2.LIZLLL
            java.lang.String r13 = r0.LJIILLIIL
            X.0LSZ r0 = r2.LIZLLL
            java.lang.String r0 = r0.LJIILLIIL
            java.lang.String r14 = X.C543180LSa.LIZ(r0)
            X.0LSZ r0 = r2.LIZLLL
            com.ss.android.ugc.aweme.aigc.asynctask.TaskLogExtra r0 = r0.LJJ
            java.lang.String r11 = r0.errorSource
            X.0LUU r15 = r2.LJJLJLI()
            X.0LTc r6 = new X.0LTc
            java.lang.Long r8 = X.C2286608xc.LJFF(r4)
            java.lang.Integer r10 = X.C2286608xc.LJ(r3)
            java.lang.Integer r12 = X.C2286608xc.LJ(r1)
            r16 = 0
            r17 = 512(0x200, float:7.17E-43)
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            com.ss.android.ugc.aweme.aigc.aicreation.mob.IAICreationTaskEventTracker r0 = X.C0LSM.LIZ()
            if (r0 == 0) goto L7a
            r0.LIZ(r6)
        L7a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L7d:
            X.C155000ia.LIZIZ(r4)
            X.0LSZ r0 = r2.LIZLLL
            com.ss.android.ugc.aweme.aigc.asynctask.TaskLogExtra r0 = r0.LJJ
            boolean r0 = r0.hasMobResult
            if (r0 == 0) goto L8b
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L8b:
            r5.LL = r2
            r5.LLILLJJLI = r7
            r5.LLILZIL = r1
            java.lang.Object r0 = X.C0LTN.LJJIJIIJI(r2, r7, r5)
            if (r0 != r3) goto L2b
            return r3
        L98:
            X.0LSF r5 = new X.0LSF
            r5.<init>(r2, r4)
            goto L17
        L9f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LSC.LJJZZIII(X.0LSC, boolean, X.05Vn):java.lang.Object");
    }

    @Override // X.C0LRR
    public final Object LJJLIIIJILLIZJL(InterfaceC542770LQl interfaceC542770LQl, C09JG c09jg, AbstractC23140094w abstractC23140094w) {
        C0LSD c0lsd;
        if ((interfaceC542770LQl instanceof C0LSD) && (c0lsd = (C0LSD) interfaceC542770LQl) != null) {
            c0lsd.LJIIIIZZ = LJJLL();
        }
        return C0LRR.LJJLIIIJJI(this, interfaceC542770LQl, c09jg, abstractC23140094w);
    }
}
