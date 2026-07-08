package X;

import X.C09JG;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskEventTracker;
import com.ss.android.ugc.aweme.aigc.asynctask.QuotaResult;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.aigc.asynctask.TaskLogExtra;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS152S1100000_3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0LTN, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public abstract class C0LTN<IN extends C09JG, OUT extends AbsTaskOutput> implements InterfaceC542770LQl<IN, OUT> {
    public boolean LIZIZ;
    public volatile Function0<Unit> LIZJ;
    public InterfaceC542770LQl<? super C09JG, ? extends AbsTaskOutput> LJ;
    public C09JG LJFF;
    public final int LIZ = 3;
    public volatile C0LSZ LIZLLL = new C0LSZ((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, (String) null, (String) null, (String) null, 0, (Source) null, (String) null, (String) null, 0, (String) null, (String) null, (String) null, (String) null, 0, (String) null, 0, (TaskLogExtra) null, (QuotaResult) null, 0, (String) null, 268435455);
    public final String LJI = "";
    public final C1DEV LJII = C2191201ApK.LIZ();

    @Override // X.InterfaceC542770LQl
    public Object LIZIZ(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return LJJJIL(this, interfaceC1364105Vn);
    }

    @Override // X.InterfaceC542770LQl
    public final Object LIZJ(C0LSZ c0lsz, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return LJJJI(this, c0lsz, interfaceC1364105Vn);
    }

    @Override // X.InterfaceC542770LQl
    public final Object LJ(AbstractC23140094w abstractC23140094w) {
        return LJJJJ(this, abstractC23140094w);
    }

    @Override // X.InterfaceC542770LQl
    public Object LJI(int i, String str, String str2, String str3, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return LJJIZ(this, i, str, str2, str3, interfaceC1364105Vn);
    }

    @Override // X.InterfaceC542770LQl
    public Object LJIIIZ(C0LSZ c0lsz, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return LJJJ(this, c0lsz, interfaceC1364105Vn);
    }

    @Override // X.InterfaceC542770LQl
    public Object LJIIJ(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return LJIILJJIL(this, interfaceC1364105Vn);
    }

    public void LJIIJJI(C543670LTx c543670LTx) {
    }

    public abstract String LJJ();

    public Object LJJIJ(boolean z, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return LJJIJIIJI(this, z, interfaceC1364105Vn);
    }

    public Object LJJIJIL(C0LRX c0lrx) {
        return LJJIJL(this, c0lrx);
    }

    public final C543670LTx LJIIL() {
        String source;
        if (LJJIFFI(this.LIZLLL.LJIIL)) {
            source = LJIJI(this.LIZLLL);
        } else {
            Source source2 = this.LIZLLL.LJIIL;
            if (source2 == null || (source = source2.getSource()) == null) {
                source = "";
            }
        }
        C543670LTx c543670LTx = new C543670LTx();
        c543670LTx.LIZ.put("business", source);
        c543670LTx.LIZ.put("task_type", LJJ());
        c543670LTx.LIZ.put("user_id", ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUserId());
        c543670LTx.LIZ.put("creation_id", this.LIZLLL.LJIIJ);
        c543670LTx.LIZ.put("task_id", this.LIZLLL.LIZ);
        c543670LTx.LIZ.put("parent_task_id", this.LIZLLL.LJIIIZ);
        c543670LTx.LIZ.put("network", Boolean.valueOf(C560970LzL.LIZLLL()));
        C844470XAv.LIZ.getClass();
        c543670LTx.LIZ.put("app_id", String.valueOf(C844470XAv.LJIIJ));
        C0CHQ.LIZ().getApplicationService().getClass();
        c543670LTx.LIZ.put("device_id", AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId());
        c543670LTx.LIZ.put("from_downgrade", Integer.valueOf(this.LIZLLL.LJJ.isFromDowngrade ? 1 : 0));
        return c543670LTx;
    }

    public final Map<String, String> LJIILIIL() {
        return C2097608Jq.LJIIL(C2097908Jt.LIZJ(new Pair("from_downgrade", this.LIZLLL.LJJ.isFromDowngrade ? "1" : CardStruct.IStatusCode.DEFAULT)), this.LIZLLL.LJJ.bizExtras);
    }

    public final String LJIJJ() {
        String source;
        if (LJJIFFI(this.LIZLLL.LJIIL)) {
            return LJIJI(this.LIZLLL);
        }
        Source source2 = this.LIZLLL.LJIIL;
        return (source2 == null || (source = source2.getSource()) == null) ? "" : source;
    }

    public final boolean LJJII() {
        C09JG c09jg = this.LJFF;
        return (c09jg instanceof C09JJ) || (c09jg instanceof C09JF);
    }

    public final void LJJIIJZLJL() {
        if (C2532909wF.LIZ()) {
            String str = this.LIZLLL.LIZ;
            String strLJJI = LJJI(this.LIZLLL.LJI);
            String strLJIJJ = LJIJJ();
            String str2 = this.LIZLLL.LJJ.serverTaskType;
            int i = !Intrinsics.LJFF(this.LIZLLL.LJ, "FAILED") ? 1 : 0;
            String str3 = this.LIZLLL.LJIJJLI;
            String str4 = this.LIZLLL.LJIIJ;
            String str5 = this.LIZLLL.LJJ.triggerType;
            String str6 = this.LIZLLL.LJIJI;
            C0CHQ.LIZ().getApplicationService().getClass();
            C556900Lsm c556900Lsm = new C556900Lsm(str, strLJJI, strLJIJJ, str2, i, str3, str4, str5, str6, AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId(), ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUserId(), Integer.valueOf(this.LIZLLL.LJIILL), this.LIZLLL.LJIILLIIL, Long.valueOf(System.currentTimeMillis() - this.LIZLLL.LJIJJ), this.LIZLLL.LJJ.generateLogId, C381270ExB.LIZ(this.LIZLLL.LJFF) ? "1" : CardStruct.IStatusCode.DEFAULT);
            ICreationAsyncTaskEventTracker iCreationAsyncTaskEventTrackerLIZ = C0LTZ.LIZ();
            if (iCreationAsyncTaskEventTrackerLIZ != null) {
                iCreationAsyncTaskEventTrackerLIZ.LIZ(c556900Lsm, LJIILIIL());
            }
        }
    }

    @Override // X.InterfaceC542770LQl, X.InterfaceC539460LDs
    public final String getTaskId() {
        return LJIIIIZZ().LIZ;
    }

    @Override // X.InterfaceC542770LQl
    public final C0LSZ LJIIIIZZ() {
        return this.LIZLLL;
    }

    public int LJIJJLI() {
        return this.LIZ;
    }

    public String LJIL() {
        return this.LJI;
    }

    public static boolean LJJIFFI(Source source) {
        if (source != Source.EDITOR_PRO_AIGC_T2I && source != Source.EDITOR_PRO_AIGC_T2V && source != Source.EDIT_AI_PLAYGROUND) {
            return false;
        }
        return true;
    }

    public final Object LIZ(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objLIZJ;
        InterfaceC542770LQl<? super C09JG, ? extends AbsTaskOutput> interfaceC542770LQl = this.LJ;
        if (interfaceC542770LQl != null && !Intrinsics.LJFF(interfaceC542770LQl.LJIIIIZZ().LJJ.creationId, this.LIZLLL.LJIIJ) && (objLIZJ = interfaceC542770LQl.LIZJ(C0LSZ.LIZ(interfaceC542770LQl.LJIIIIZZ(), null, null, null, null, null, null, null, 0, null, null, null, 0, null, null, null, 0, null, null, null, 0L, null, 0L, TaskLogExtra.LIZ(this.LIZLLL.LJJ, null, null, this.LIZLLL.LJIIJ, null, 0, null, null, null, null, false, null, 1047551), null, null, 0, null, 260046847), interfaceC1364105Vn)) == C099R.LJFF()) {
            return objLIZJ;
        }
        return Unit.LIZ;
    }

    @Override // X.InterfaceC542770LQl
    public final void LIZLLL(AwS152S1100000_3 awS152S1100000_3) {
        this.LIZJ = awS152S1100000_3;
    }

    public final boolean LJIILLIIL(List<String> list) {
        if (!list.contains(this.LIZLLL.LJ)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("checkStatus: status not allow, expectStatus=");
            sbLIZ.append(list);
            sbLIZ.append(", currentStatus=");
            sbLIZ.append(this.LIZLLL.LJ);
            LJJJJIZL(C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
        return true;
    }

    public final boolean LJIIZILJ(String str) {
        return LJIJ(Collections.singletonList(str));
    }

    public final boolean LJIJ(List<String> list) {
        if (LJIILLIIL(Collections.singletonList("STARTED"))) {
            if (!list.contains(this.LIZLLL.LJI)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("checkStatus: step not allow, expectSteps=");
                sbLIZ.append(list);
                sbLIZ.append(", currentStep=");
                sbLIZ.append(this.LIZLLL.LJI);
                LJJJJIZL(C2188811AlT.LIZIZ(sbLIZ));
            } else {
                return true;
            }
        }
        return false;
    }

    public final String LJIJI(C0LSZ c0lsz) {
        Source source = c0lsz.LJIIL;
        if (source == null) {
            return "";
        }
        int i = C0LLW.LIZ[source.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return "";
                }
                return "ai_video_tool";
            }
            if (this.LIZIZ) {
                return "ep_ai_create_i2v";
            }
            return "ep_ai_create_t2v";
        }
        return "ep_ai_create_t2i";
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final String LJJI(String str) {
        switch (str.hashCode()) {
            case -2084521848:
                if (str.equals("DOWNLOAD")) {
                    return C0LMI.DOWNLOAD.getType();
                }
                break;
            case -1852497085:
                if (str.equals("SERVER")) {
                    return C0LMI.SERVER.getType();
                }
                break;
            case -218451411:
                if (str.equals("PROGRESS")) {
                    return C0LMI.POLLING.getType();
                }
                break;
            case 77416024:
                if (str.equals("QUOTA")) {
                    return C0LMI.QUOTA.getType();
                }
                break;
            case 431635474:
                if (str.equals("POST_PROCESSING")) {
                    return C0LMI.POST_PROCESS.getType();
                }
                break;
            case 967533484:
                if (str.equals("CHECK_CAMEO_PERMISSION")) {
                    return C0LMI.CAMEO_PERMISSION.getType();
                }
                break;
            case 1456113029:
                if (str.equals("IMAGE_UPLOAD")) {
                    return C0LMI.UPLOAD.getType();
                }
                break;
        }
        return this.LIZLLL.LIZLLL;
    }

    public Object LJJIIJ(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        if (C2532909wF.LIZ()) {
            String str = this.LIZLLL.LIZ;
            String strLJIJJ = LJIJJ();
            String str2 = this.LIZLLL.LJIJJLI;
            String str3 = this.LIZLLL.LJJ.serverTaskType;
            String str4 = this.LIZLLL.LJIIJ;
            String strLJJI = LJJI(this.LIZLLL.LJI);
            Integer numLJ = C2286608xc.LJ(!Intrinsics.LJFF(this.LIZLLL.LJ, "FAILED") ? 1 : 0);
            String str5 = this.LIZLLL.LJJ.triggerType;
            String str6 = this.LIZLLL.LJIJI;
            C0CHQ.LIZ().getApplicationService().getClass();
            C556910Lsn c556910Lsn = new C556910Lsn(str, strLJIJJ, str2, str3, str4, strLJJI, numLJ, str5, str6, AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId(), ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUserId(), C2286608xc.LJ(this.LIZLLL.LJIILL), this.LIZLLL.LJIILLIIL, C2286608xc.LJFF(System.currentTimeMillis() - this.LIZLLL.LJIJJ));
            ICreationAsyncTaskEventTracker iCreationAsyncTaskEventTrackerLIZ = C0LTZ.LIZ();
            if (iCreationAsyncTaskEventTrackerLIZ != null) {
                iCreationAsyncTaskEventTrackerLIZ.LIZ(c556910Lsn, LJIILIIL());
            }
        }
        return Unit.LIZ;
    }

    public final void LJJIIZ(String str) {
        if (this.LIZLLL.LJJ.hasMobStart) {
            SettingsManager.LIZLLL().getClass();
            if (!SettingsManager.LIZ("aigc_framework_et_refactor_killswitch", false)) {
                return;
            }
        }
        if (C2532909wF.LIZ()) {
            String str2 = this.LIZLLL.LIZ;
            String strLJIJJ = LJIJJ();
            String str3 = this.LIZLLL.LJJ.serverTaskType;
            String str4 = this.LIZLLL.LJIIJ;
            String str5 = this.LIZLLL.LJJ.triggerType;
            String str6 = this.LIZLLL.LJIJI;
            C0CHQ.LIZ().getApplicationService().getClass();
            C556930Lsp c556930Lsp = new C556930Lsp(str2, str, strLJIJJ, str3, str4, str5, str6, AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId(), ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUserId());
            ICreationAsyncTaskEventTracker iCreationAsyncTaskEventTrackerLIZ = C0LTZ.LIZ();
            if (iCreationAsyncTaskEventTrackerLIZ != null) {
                iCreationAsyncTaskEventTrackerLIZ.LIZ(c556930Lsp, LJIILIIL());
            }
        }
    }

    public final void LJJIJIIJIL(boolean z) {
        if (C2532909wF.LIZ() && (!a0.LJJJIL(this.LIZLLL.LJIIIZ)) && (!a0.LJJJIL(LJIL()))) {
            String str = this.LIZLLL.LJIIIZ;
            String strLJIL = LJIL();
            String strLJIJJ = LJIJJ();
            String str2 = this.LIZLLL.LJJ.serverTaskType;
            String str3 = this.LIZLLL.LJIJJLI;
            boolean zLJJII = LJJII();
            String str4 = this.LIZLLL.LJJ.creationId;
            String str5 = this.LIZLLL.LJIJI;
            C0CHQ.LIZ().getApplicationService().getClass();
            C556890Lsl c556890Lsl = new C556890Lsl(str, strLJIL, strLJIJJ, str2, z ? 1 : 0, str3, zLJJII ? 1 : 0, str4, str5, AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId(), ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUserId(), Integer.valueOf(this.LIZLLL.LJIILL), this.LIZLLL.LJIILLIIL, Long.valueOf(System.currentTimeMillis() - this.LIZLLL.LJIJJ), this.LIZLLL.LJJ.generateLogId, this.LIZLLL.LJJ.triggerType);
            ICreationAsyncTaskEventTracker iCreationAsyncTaskEventTrackerLIZ = C0LTZ.LIZ();
            if (iCreationAsyncTaskEventTrackerLIZ != null) {
                iCreationAsyncTaskEventTrackerLIZ.LIZ(c556890Lsl, LJIILIIL());
            }
        }
    }

    public void LJJJJIZL(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJJ());
        sbLIZ.append(' ');
        sbLIZ.append(str);
        sbLIZ.append(" \n------ ");
        sbLIZ.append(this.LIZLLL);
        C09JK.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public void LJJJJJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJJ());
        sbLIZ.append(' ');
        sbLIZ.append(str);
        sbLIZ.append(" \n------ ");
        sbLIZ.append(this.LIZLLL);
        C09JK.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <IN extends X.C09JG, OUT extends com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput> java.lang.Object LJIILJJIL(X.C0LTN<? super IN, ? extends OUT> r35, X.InterfaceC1364105Vn<? super kotlin.Unit> r36) {
        /*
            r3 = r36
            r5 = r35
            boolean r0 = r3 instanceof X.C0LTT
            if (r0 == 0) goto L85
            r4 = r3
            X.0LTT r4 = (X.C0LTT) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L85
            int r2 = r2 - r1
            r4.LLILZ = r2
        L16:
            java.lang.Object r6 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L2c
            if (r0 == r1) goto L3e
            if (r0 != r2) goto L8b
            X.C155000ia.LIZIZ(r6)
        L29:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2c:
            X.C155000ia.LIZIZ(r6)
            X.0LQl<? super X.09JG, ? extends com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput> r0 = r5.LJ
            if (r0 == 0) goto L43
            r4.LL = r5
            r4.LLILZ = r1
            java.lang.Object r0 = r0.LJIIJ(r4)
            if (r0 != r3) goto L43
            return r3
        L3e:
            X.0LTN r5 = r4.LL
            X.C155000ia.LIZIZ(r6)
        L43:
            X.0LSZ r6 = r5.LIZLLL
            r7 = 0
            java.lang.String r11 = "CANCELED"
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
            r4.LL = r7
            r4.LLILZ = r2
            java.lang.Object r0 = LJJJI(r5, r0, r4)
            if (r0 != r3) goto L29
            return r3
        L85:
            X.0LTT r4 = new X.0LTT
            r4.<init>(r5, r3)
            goto L16
        L8b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LTN.LJIILJJIL(X.0LTN, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <IN extends X.C09JG, OUT extends com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput> java.lang.Object LJJIJL(X.C0LTN<? super IN, ? extends OUT> r34, X.InterfaceC1364105Vn<? super kotlin.Unit> r35) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LTN.LJJIJL(X.0LTN, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <IN extends X.C09JG, OUT extends com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput> java.lang.Object LJJJIL(X.C0LTN<? super IN, ? extends OUT> r35, X.InterfaceC1364105Vn<? super kotlin.Unit> r36) {
        /*
            r3 = r36
            r5 = r35
            boolean r0 = r3 instanceof X.C0LTV
            if (r0 == 0) goto L94
            r4 = r3
            X.0LTV r4 = (X.C0LTV) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L94
            int r2 = r2 - r1
            r4.LLILZ = r2
        L16:
            java.lang.Object r6 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L2c
            if (r0 == r1) goto L3e
            if (r0 != r2) goto L9b
            X.C155000ia.LIZIZ(r6)
        L29:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2c:
            X.C155000ia.LIZIZ(r6)
            X.0LQl<? super X.09JG, ? extends com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput> r0 = r5.LJ
            if (r0 == 0) goto L43
            r4.LL = r5
            r4.LLILZ = r1
            java.lang.Object r0 = r0.LIZIZ(r4)
            if (r0 != r3) goto L43
            return r3
        L3e:
            X.0LTN r5 = r4.LL
            X.C155000ia.LIZIZ(r6)
        L43:
            X.0LSZ r0 = r5.LIZLLL
            java.lang.String r1 = r0.LJ
            java.lang.String r0 = "STARTED"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L52
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L52:
            X.0LSZ r6 = r5.LIZLLL
            r7 = 0
            java.lang.String r11 = "STOPPED"
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
            r4.LL = r7
            r4.LLILZ = r2
            java.lang.Object r0 = LJJJI(r5, r0, r4)
            if (r0 != r3) goto L29
            return r3
        L94:
            X.0LTV r4 = new X.0LTV
            r4.<init>(r5, r3)
            goto L16
        L9b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LTN.LJJJIL(X.0LTN, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <IN extends X.C09JG, OUT extends com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput> java.lang.Object LJJJJ(X.C0LTN<? super IN, ? extends OUT> r35, X.InterfaceC1364105Vn<? super kotlin.Unit> r36) {
        /*
            r3 = r36
            r5 = r35
            boolean r0 = r3 instanceof X.C0LTY
            if (r0 == 0) goto L85
            r4 = r3
            X.0LTY r4 = (X.C0LTY) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L85
            int r2 = r2 - r1
            r4.LLILZ = r2
        L16:
            java.lang.Object r6 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L2c
            if (r0 == r1) goto L3e
            if (r0 != r2) goto L8b
            X.C155000ia.LIZIZ(r6)
        L29:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2c:
            X.C155000ia.LIZIZ(r6)
            X.0LQl<? super X.09JG, ? extends com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput> r0 = r5.LJ
            if (r0 == 0) goto L43
            r4.LL = r5
            r4.LLILZ = r1
            java.lang.Object r0 = r0.LJ(r4)
            if (r0 != r3) goto L43
            return r3
        L3e:
            X.0LTN r5 = r4.LL
            X.C155000ia.LIZIZ(r6)
        L43:
            X.0LSZ r6 = r5.LIZLLL
            r7 = 0
            java.lang.String r11 = "STOPPED"
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
            r4.LL = r7
            r4.LLILZ = r2
            java.lang.Object r0 = LJJJI(r5, r0, r4)
            if (r0 != r3) goto L29
            return r3
        L85:
            X.0LTY r4 = new X.0LTY
            r4.<init>(r5, r3)
            goto L16
        L8b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LTN.LJJJJ(X.0LTN, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0173 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <IN extends X.C09JG, OUT extends com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput> java.lang.Object LJJJJI(X.C0LTN<? super IN, ? extends OUT> r49, X.InterfaceC1364105Vn<? super kotlin.Unit> r50) {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LTN.LJJJJI(X.0LTN, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC542770LQl
    public Object LJFF(IN in, InterfaceC1364105Vn<? super OUT> interfaceC1364105Vn) {
        LJJJJIZL("run");
        this.LJFF = in;
        return null;
    }

    @Override // X.InterfaceC542770LQl
    public final Object LJII(String str, AbstractC23140094w abstractC23140094w) {
        this.LIZLLL = C0LSZ.LIZ(this.LIZLLL, null, null, null, null, null, null, null, 0, null, str, null, 0, null, null, null, 0, null, null, null, 0L, null, 0L, null, null, null, 0, null, 268434943);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setParentTaskId: ");
        sbLIZ.append(str);
        LJJJJIZL(C2188811AlT.LIZIZ(sbLIZ));
        Object objLJJJJI = LJJJJI(this, abstractC23140094w);
        if (objLJJJJI != C099R.LJFF()) {
            return Unit.LIZ;
        }
        return objLJJJJI;
    }

    public final Object LJIILL(AbsTaskOutput absTaskOutput, AbstractC23140094w abstractC23140094w) {
        if (Intrinsics.LJFF(absTaskOutput.LJ(), "FAILED")) {
            Object objLJI = LJI(absTaskOutput.LIZ(), absTaskOutput.LIZIZ(), absTaskOutput.LIZJ(), absTaskOutput.LIZLLL(), abstractC23140094w);
            if (objLJI == C099R.LJFF()) {
                return objLJI;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    public final void LJJIII(int i, boolean z) {
        C543670LTx c543670LTx = new C543670LTx();
        c543670LTx.LIZ.put("duration", Integer.valueOf(i));
        c543670LTx.LIZ.put("error", Integer.valueOf(z ? 1 : 0));
        c543670LTx.LIZ.put("server_task_id", this.LIZLLL.LJIJJLI);
        c543670LTx.LIZ.put("from_downgrade", Integer.valueOf(this.LIZLLL.LJJ.isFromDowngrade ? 1 : 0));
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZIZ("ai_create_discard_status", c543670LTx.LJ());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <IN extends X.C09JG, OUT extends com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput> java.lang.Object LJJIJIIJI(X.C0LTN<? super IN, ? extends OUT> r34, boolean r35, X.InterfaceC1364105Vn<? super kotlin.Unit> r36) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LTN.LJJIJIIJI(X.0LTN, boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <IN extends X.C09JG, OUT extends com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput> java.lang.Object LJJIJLIJ(X.C0LTN<? super IN, ? extends OUT> r7, java.lang.String r8, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            boolean r0 = r9 instanceof X.C0LTW
            if (r0 == 0) goto L7d
            r5 = r9
            X.0LTW r5 = (X.C0LTW) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7d
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r6 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r3 = 3
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L31
            if (r0 == r1) goto L43
            if (r0 == r2) goto L61
            if (r0 != r3) goto L83
            X.0LTN r7 = r5.LL
            X.C155000ia.LIZIZ(r6)
        L2a:
            X.0LQl r6 = (X.InterfaceC542770LQl) r6
            r7.LJ = r6
        L2e:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L31:
            X.C155000ia.LIZIZ(r6)
            X.0LX1 r0 = X.C0LX2.LIZ()
            r5.LL = r7
            r5.LLILZ = r1
            java.lang.Object r6 = r0.LJIIL(r8, r5)
            if (r6 != r4) goto L48
            return r4
        L43:
            X.0LTN r7 = r5.LL
            X.C155000ia.LIZIZ(r6)
        L48:
            X.0LXL r6 = (X.C0LXL) r6
            if (r6 != 0) goto L4f
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L4f:
            X.0LSZ r0 = X.C0LXK.LIZJ(r6)
            r5.LL = r7
            r5.LLILZ = r2
            r7.getClass()
            java.lang.Object r0 = LJJJI(r7, r0, r5)
            if (r0 != r4) goto L66
            return r4
        L61:
            X.0LTN r7 = r5.LL
            X.C155000ia.LIZIZ(r6)
        L66:
            X.0LSZ r0 = r7.LIZLLL
            java.lang.String r1 = r0.LJIIIIZZ
            boolean r0 = X.C123100dR.LIZ(r1)
            if (r0 == 0) goto L2e
            X.0LQK r0 = X.C0LQK.LIZ
            r5.LL = r7
            r5.LLILZ = r3
            java.lang.Object r6 = r0.LIZJ(r1, r5)
            if (r6 != r4) goto L2a
            return r4
        L7d:
            X.0LTW r5 = new X.0LTW
            r5.<init>(r7, r9)
            goto L12
        L83:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LTN.LJJIJLIJ(X.0LTN, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <IN extends X.C09JG, OUT extends com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput> java.lang.Object LJJJ(X.C0LTN<? super IN, ? extends OUT> r55, X.C0LSZ r56, X.InterfaceC1364105Vn<? super kotlin.Unit> r57) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LTN.LJJJ(X.0LTN, X.0LSZ, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.01eN] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ <IN extends X.C09JG, OUT extends com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput> java.lang.Object LJJJI(X.C0LTN<? super IN, ? extends OUT> r7, X.C0LSZ r8, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            boolean r0 = r9 instanceof X.C0LTP
            if (r0 == 0) goto L28
            r6 = r9
            X.0LTP r6 = (X.C0LTP) r6
            int r2 = r6.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r6.LLILZLL = r2
        L12:
            java.lang.Object r5 = r6.LLILZ
            java.lang.Object r4 = X.C099R.LJFF()
            int r1 = r6.LLILZLL
            r3 = 0
            r2 = 2
            r0 = 1
            if (r1 == 0) goto L46
            if (r1 == r0) goto L3a
            if (r1 != r2) goto L32
            java.lang.Object r1 = r6.LL
            X.01eN r1 = (X.InterfaceC383701eN) r1
            goto L2e
        L28:
            X.0LTP r6 = new X.0LTP
            r6.<init>(r7, r9)
            goto L12
        L2e:
            X.C155000ia.LIZIZ(r5)     // Catch: java.lang.Throwable -> L6f
            goto L69
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3a:
            X.1DEV r1 = r6.LLILLL
            X.0LSZ r8 = r6.LLILLJJLI
            java.lang.Object r7 = r6.LL
            X.0LTN r7 = (X.C0LTN) r7
            X.C155000ia.LIZIZ(r5)
            goto L5a
        L46:
            X.C155000ia.LIZIZ(r5)
            X.1DEV r1 = r7.LJII
            r6.LL = r7
            r6.LLILLJJLI = r8
            r6.LLILLL = r1
            r6.LLILZLL = r0
            java.lang.Object r0 = r1.LIZLLL(r3, r6)
            if (r0 != r4) goto L5a
            return r4
        L5a:
            r6.LL = r1     // Catch: java.lang.Throwable -> L6f
            r6.LLILLJJLI = r3     // Catch: java.lang.Throwable -> L6f
            r6.LLILLL = r3     // Catch: java.lang.Throwable -> L6f
            r6.LLILZLL = r2     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r0 = r7.LJIIIZ(r8, r6)     // Catch: java.lang.Throwable -> L6f
            if (r0 != r4) goto L69
            return r4
        L69:
            r1.LIZIZ(r3)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L6f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L6f
            r1.LIZIZ(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LTN.LJJJI(X.0LTN, X.0LSZ, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031 A[PHI: r10
      0x0031: PHI (r10v3 java.lang.Object) = (r10v2 java.lang.Object), (r10v0 java.lang.Object) binds: [B:23:0x00be, B:12:0x002e] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <IN extends X.C09JG, OUT extends com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput> java.lang.Object LJJIL(X.C0LTN<? super IN, ? extends OUT> r37, X.InterfaceC542770LQl<? super X.C09JG, ? extends com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput> r38, X.C09JG r39, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput> r40) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LTN.LJJIL(X.0LTN, X.0LQl, X.09JG, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <IN extends X.C09JG, OUT extends com.ss.android.ugc.aweme.aigc.asynctask.AbsTaskOutput> java.lang.Object LJJIZ(X.C0LTN<? super IN, ? extends OUT> r36, int r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, X.InterfaceC1364105Vn<? super kotlin.Unit> r41) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LTN.LJJIZ(X.0LTN, int, java.lang.String, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
