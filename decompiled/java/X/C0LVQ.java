package X;

import com.ss.android.ugc.aweme.aigc.asynctask.I2VServerTaskInput;
import com.ss.android.ugc.aweme.aigc.asynctask.I2VServerTaskOutput;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0LVQ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LVQ extends C0LTN<C09JG, I2VServerTaskOutput> {
    public static final C557860LuK LJIIJJI = new C557860LuK();
    public final String LJIIIIZZ = C0LM5.EDIT_I2V_SERVER.getTypeName();
    public final String LJIIIZ = C0LMI.SERVER.getType();
    public String LJIIJ = "";

    @Override // X.C0LTN
    public final String LJIL() {
        return this.LJIIIZ;
    }

    @Override // X.C0LTN
    public final String LJJ() {
        return this.LJIIIIZZ;
    }

    @Override // X.C0LTN, X.InterfaceC542770LQl
    public final Object LIZIZ(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objLJJJIL = C0LTN.LJJJIL(this, interfaceC1364105Vn);
        if (objLJJJIL == C099R.LJFF()) {
            return objLJJJIL;
        }
        return Unit.LIZ;
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
            boolean r0 = r7 instanceof X.C0LVV
            if (r0 == 0) goto L46
            r5 = r7
            X.0LVV r5 = (X.C0LVV) r5
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
            X.0LuK r1 = X.C0LVQ.LJIIJJI
            X.0LSZ r0 = r6.LIZLLL
            java.lang.String r0 = r0.LJIJJLI
            r5.LLILLL = r2
            java.lang.Object r0 = r1.LIZ(r0, r5)
            if (r0 != r3) goto L25
            return r3
        L46:
            X.0LVV r5 = new X.0LVV
            r5.<init>(r6, r7)
            goto L12
        L4c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LVQ.LJIIJ(X.05Vn):java.lang.Object");
    }

    @Override // X.C0LTN
    public final void LJIIJJI(C543670LTx c543670LTx) {
        c543670LTx.LIZLLL("generate_log_id", this.LIZLLL.LJJ.generateLogId);
        c543670LTx.LIZLLL("task_log_id", this.LIZLLL.LJJ.taskLogId);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0132 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0145 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0154 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0158 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b7  */
    @Override // X.C0LTN, X.InterfaceC542770LQl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.C09JG r52, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.aigc.asynctask.I2VServerTaskOutput> r53) {
        /*
            Method dump skipped, instruction units count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LVQ.LJFF(X.09JG, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJJL(com.ss.android.ugc.aweme.aigc.asynctask.I2VServerTaskInput r46, X.InterfaceC1364105Vn<? super kotlin.Unit> r47) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LVQ.LJJJJJL(com.ss.android.ugc.aweme.aigc.asynctask.I2VServerTaskInput, X.05Vn):java.lang.Object");
    }

    public final Object LJJJJL(I2VServerTaskInput i2VServerTaskInput, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        Long l;
        boolean z = false;
        if (i2VServerTaskInput != null && (l = i2VServerTaskInput.timeOutSecond) != null && l.longValue() > 0) {
            if (System.currentTimeMillis() - this.LIZLLL.LJIJJ > l.longValue() * ((long) LSPassThroughRecordSizeConfig.DEFAULT)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0102 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJLL(com.ss.android.ugc.aweme.aigc.asynctask.net.TaskDetail r38, X.InterfaceC1364105Vn<? super kotlin.Unit> r39) {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LVQ.LJJJJLL(com.ss.android.ugc.aweme.aigc.asynctask.net.TaskDetail, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0129 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0192 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0197 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJZ(com.ss.android.ugc.aweme.aigc.asynctask.I2VServerTaskInput r18, X.InterfaceC1364105Vn<? super kotlin.Unit> r19) {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LVQ.LJJJJZ(com.ss.android.ugc.aweme.aigc.asynctask.I2VServerTaskInput, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0096 A[PHI: r5
      0x0096: PHI (r5v12 com.ss.android.ugc.aweme.aigc.asynctask.I2VServerTaskInput) = 
      (r5v2 com.ss.android.ugc.aweme.aigc.asynctask.I2VServerTaskInput)
      (r5v5 com.ss.android.ugc.aweme.aigc.asynctask.I2VServerTaskInput)
      (r5v9 com.ss.android.ugc.aweme.aigc.asynctask.I2VServerTaskInput)
      (r5v0 com.ss.android.ugc.aweme.aigc.asynctask.I2VServerTaskInput)
     binds: [B:67:0x0096, B:19:0x0091, B:46:0x013b, B:17:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0185 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJZI(com.ss.android.ugc.aweme.aigc.asynctask.I2VServerTaskInput r42, X.InterfaceC1364105Vn<? super kotlin.Unit> r43) {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LVQ.LJJJJZI(com.ss.android.ugc.aweme.aigc.asynctask.I2VServerTaskInput, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(2:4|(1:6)(1:52))(0)|7|(1:(1:(1:(1:(3:13|14|15)(2:53|54))(3:55|56|57))(3:35|36|(4:38|(1:40)|56|57)(8:41|(1:43)(1:51)|44|(1:46)(1:50)|47|(1:49)|14|15)))(1:27))(2:16|(2:18|19)(2:20|(2:22|23)(2:24|(1:26))))|28|58|29|32|(1:34)|36|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bd, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00be, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJLIIL(X.C09JG r44, X.InterfaceC1364105Vn<? super kotlin.Unit> r45) {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LVQ.LJJJLIIL(X.09JG, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    @Override // X.C0LTN, X.InterfaceC542770LQl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(int r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, X.InterfaceC1364105Vn<? super kotlin.Unit> r17) {
        /*
            r12 = this;
            r3 = r17
            boolean r0 = r3 instanceof X.C0LVW
            r6 = r12
            if (r0 == 0) goto L62
            r11 = r3
            X.0LVW r11 = (X.C0LVW) r11
            int r2 = r11.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L62
            int r2 = r2 - r1
            r11.LLILLL = r2
        L15:
            java.lang.Object r3 = r11.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r11.LLILLL
            r0 = 1
            if (r1 == 0) goto L51
            if (r1 != r0) goto L68
            X.C155000ia.LIZIZ(r3)
        L25:
            java.lang.Class<com.ss.android.ugc.aweme.services.IExternalService> r0 = com.ss.android.ugc.aweme.services.IExternalService.class
            r1 = 0
            r4 = 14
            r5 = 0
            r2 = r1
            r3 = r1
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r0, r1, r2, r3, r4, r5)
            com.ss.android.ugc.aweme.services.IExternalService r0 = (com.ss.android.ugc.aweme.services.IExternalService) r0
            if (r0 == 0) goto L4e
            com.ss.android.ugc.aweme.services.external.IAIGCQuotaService r2 = r0.getAIGCQuotaService()
            if (r2 == 0) goto L4e
            X.0LSZ r0 = r6.LIZLLL
            com.ss.android.ugc.aweme.aigc.asynctask.Source r0 = r0.LJIIL
            if (r0 == 0) goto L47
            java.lang.String r1 = r0.getSource()
            if (r1 != 0) goto L49
        L47:
            java.lang.String r1 = ""
        L49:
            com.ss.android.ugc.aweme.services.external.RefreshQuotaScene r0 = com.ss.android.ugc.aweme.services.external.RefreshQuotaScene.TASK_STATUS_CHANGE
            r2.refreshQuotaCache(r1, r0)
        L4e:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L51:
            X.C155000ia.LIZIZ(r3)
            r11.LLILLL = r0
            r10 = r16
            r9 = r15
            r8 = r14
            r7 = r13
            java.lang.Object r0 = X.C0LTN.LJJIZ(r6, r7, r8, r9, r10, r11)
            if (r0 != r2) goto L25
            return r2
        L62:
            X.0LVW r11 = new X.0LVW
            r11.<init>(r6, r3)
            goto L15
        L68:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LVQ.LJI(int, java.lang.String, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    public final Object LJJJJLI(int i, String str, String str2, Function1 function1, AbstractC23140094w abstractC23140094w) {
        String str3 = str;
        if (i == 0) {
            return function1.invoke(abstractC23140094w);
        }
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        if (str2 != null) {
            str4 = str2;
        }
        Object objLIZ = C539400LDm.LIZ(this, i, str3, null, str4, abstractC23140094w, 4);
        if (objLIZ == C099R.LJFF()) {
            return objLIZ;
        }
        return Unit.LIZ;
    }
}
