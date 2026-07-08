package X;

import X.C09JG;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.aigc.asynctask.models.CommonParentTaskInput;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0LSD, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public abstract class C0LSD<IN extends C09JG, OUT extends AbsTaskOutput> extends C0LTN<IN, OUT> {
    public C0LSL LJIIIIZZ;
    public CommonParentTaskInput LJIIIZ;

    @Override // X.C0LTN, X.InterfaceC542770LQl
    public Object LJIIJ(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return LJJJJL(this, interfaceC1364105Vn);
    }

    @Override // X.C0LTN
    public final Object LJJIJ(boolean z, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return LJJJJZ(this, false, interfaceC1364105Vn);
    }

    public C0LUV LJJJJLL() {
        return null;
    }

    public C0LUU LJJJJLI() {
        String source;
        AccountUserService accountUserServiceLJIIJ;
        String str;
        String str2 = this.LIZLLL.LIZ;
        String str3 = this.LIZLLL.LJIIIZ;
        Source source2 = this.LIZLLL.LJIIL;
        String str4 = "";
        if (source2 == null || (source = source2.getSource()) == null) {
            source = "";
        }
        String str5 = this.LIZLLL.LJJ.entranceScene;
        String strLJIL = LJIL();
        CommonParentTaskInput commonParentTaskInput = this.LJIIIZ;
        if (commonParentTaskInput != null && (str = commonParentTaskInput.jobType) != null) {
            str4 = str;
        }
        C0CHQ.LIZ().getApplicationService().getClass();
        String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        return new C0LUU(str2, str3, source, str5, strLJIL, str4, strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId, (iAccountService == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null) ? null : accountUserServiceLJIIJ.getCurUserId(), LJJII() ? 1 : 0, this.LIZLLL.LJJ.creationId);
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

    public final Object LJJJJJL(AbstractC23140094w abstractC23140094w) {
        Object objLJJJJZI = LJJJJZI(this, abstractC23140094w);
        if (objLJJJJZI != C099R.LJFF()) {
            return Unit.LIZ;
        }
        return objLJJJJZI;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <IN extends X.C09JG, OUT extends com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput> java.lang.Object LJJJJL(X.C0LSD<? super IN, ? extends OUT> r36, X.InterfaceC1364105Vn<? super kotlin.Unit> r37) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LSD.LJJJJL(X.0LSD, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <IN extends X.C09JG, OUT extends com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput> java.lang.Object LJJJJZI(X.C0LSD<? super IN, ? extends OUT> r5, X.InterfaceC1364105Vn<? super kotlin.Unit> r6) {
        /*
            boolean r0 = r6 instanceof X.C0LSI
            if (r0 == 0) goto L56
            r4 = r6
            X.0LSI r4 = (X.C0LSI) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L56
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r3 = r4.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r1 = 1
            if (r0 == 0) goto L3d
            if (r0 != r1) goto L5c
            X.0LSD r5 = r4.LL
            X.C155000ia.LIZIZ(r3)
        L24:
            X.0LSO r2 = new X.0LSO
            X.0LUU r1 = r5.LJJJJLI()
            X.0LUV r0 = r5.LJJJJLL()
            r2.<init>(r1, r0)
            com.ss.android.ugc.aweme.aigc.aicreation.mob.IAICreationTaskEventTracker r0 = X.C0LSM.LIZ()
            if (r0 == 0) goto L3a
            r0.LIZ(r2)
        L3a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3d:
            X.C155000ia.LIZIZ(r3)
            X.0LSZ r0 = r5.LIZLLL
            com.ss.android.ugc.aweme.aigc.asynctask.TaskLogExtra r0 = r0.LJJ
            boolean r0 = r0.hasMobStart
            if (r0 == 0) goto L4b
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L4b:
            r4.LL = r5
            r4.LLILZ = r1
            java.lang.Object r0 = X.C0LTN.LJJIJL(r5, r4)
            if (r0 != r2) goto L24
            return r2
        L56:
            X.0LSI r4 = new X.0LSI
            r4.<init>(r5, r6)
            goto L12
        L5c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LSD.LJJJJZI(X.0LSD, X.05Vn):java.lang.Object");
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
    /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <IN extends X.C09JG, OUT extends com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput> java.lang.Object LJJJJZ(X.C0LSD<? super IN, ? extends OUT> r15, boolean r16, X.InterfaceC1364105Vn<? super kotlin.Unit> r17) {
        /*
            r4 = r17
            r3 = r15
            r7 = r16
            boolean r0 = r4 instanceof X.C0LSG
            if (r0 == 0) goto L91
            r5 = r4
            X.0LSG r5 = (X.C0LSG) r5
            int r2 = r5.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L91
            int r2 = r2 - r1
            r5.LLILZIL = r2
        L17:
            java.lang.Object r4 = r5.LLILLL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r5.LLILZIL
            r1 = 1
            if (r0 == 0) goto L76
            if (r0 != r1) goto L97
            boolean r7 = r5.LLILLJJLI
            X.0LSD r3 = r5.LL
            X.C155000ia.LIZIZ(r4)
        L2b:
            X.0LSZ r0 = r3.LIZLLL
            int r2 = r0.LJII
            long r4 = java.lang.System.currentTimeMillis()
            X.0LSZ r0 = r3.LIZLLL
            long r0 = r0.LJIJJ
            long r4 = r4 - r0
            X.0LSZ r0 = r3.LIZLLL
            int r1 = r0.LJIILL
            X.0LSZ r0 = r3.LIZLLL
            java.lang.String r13 = r0.LJIILLIIL
            X.0LSZ r0 = r3.LIZLLL
            java.lang.String r0 = r0.LJIILLIIL
            java.lang.String r14 = X.C543180LSa.LIZ(r0)
            X.0LSZ r0 = r3.LIZLLL
            com.ss.android.ugc.aweme.aigc.asynctask.TaskLogExtra r0 = r0.LJJ
            java.lang.String r11 = r0.errorSource
            X.0LUU r15 = r3.LJJJJLI()
            X.0LUV r16 = r3.LJJJJLL()
            X.0LTc r6 = new X.0LTc
            java.lang.Long r8 = X.C2286608xc.LJFF(r4)
            r9 = 0
            java.lang.Integer r10 = X.C2286608xc.LJ(r2)
            java.lang.Integer r12 = X.C2286608xc.LJ(r1)
            r17 = 4
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            com.ss.android.ugc.aweme.aigc.aicreation.mob.IAICreationTaskEventTracker r0 = X.C0LSM.LIZ()
            if (r0 == 0) goto L73
            r0.LIZ(r6)
        L73:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L76:
            X.C155000ia.LIZIZ(r4)
            X.0LSZ r0 = r3.LIZLLL
            com.ss.android.ugc.aweme.aigc.asynctask.TaskLogExtra r0 = r0.LJJ
            boolean r0 = r0.hasMobResult
            if (r0 == 0) goto L84
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L84:
            r5.LL = r3
            r5.LLILLJJLI = r7
            r5.LLILZIL = r1
            java.lang.Object r0 = X.C0LTN.LJJIJIIJI(r3, r7, r5)
            if (r0 != r2) goto L2b
            return r2
        L91:
            X.0LSG r5 = new X.0LSG
            r5.<init>(r3, r4)
            goto L17
        L97:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LSD.LJJJJZ(X.0LSD, boolean, X.05Vn):java.lang.Object");
    }
}
