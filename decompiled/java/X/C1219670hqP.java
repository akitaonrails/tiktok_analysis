package X;

import Y.AfS85S0101000_19;
import com.bytedance.android.livesdk.guide.model.TaskActionResponse;
import com.bytedance.android.livesdk.guide.model.TaskReportResponse;
import com.bytedance.android.livesdk.impl.revenue.strategy.api.IncentiveApi;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS633S0100000_19;
import qo2.w;

/* JADX INFO: renamed from: X.0hqP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1219670hqP {
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super java.lang.String> r9) {
        /*
            boolean r0 = r9 instanceof X.C1219660hqO
            if (r0 == 0) goto L88
            r6 = r9
            X.0hqO r6 = (X.C1219660hqO) r6
            int r2 = r6.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L88
            int r2 = r2 - r1
            r6.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r6.LLILLJJLI
            java.lang.String r9 = ""
            r2 = 2
            r8 = 1
            if (r0 == 0) goto L28
            if (r0 == r8) goto L97
            if (r0 != r2) goto L8e
            X.C155000ia.LIZIZ(r1)
        L27:
            return r1
        L28:
            X.C155000ia.LIZIZ(r1)
            com.bytedance.android.livesdk.livesetting.revenuestrategy.LiveCurrencyCodeTimeoutSettings r5 = com.bytedance.android.livesdk.livesetting.revenuestrategy.LiveCurrencyCodeTimeoutSettings.INSTANCE
            boolean r0 = r5.isCacheCurrency()
            if (r0 == 0) goto L4f
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "cache: "
            r1.append(r0)
            java.lang.String r0 = X.C1796440wqg.LIZIZ
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "requestTaskInfoInternal"
            X.C20441214yg.LIZIZ(r0, r1)
            java.lang.String r0 = X.C1796440wqg.LIZIZ
            if (r0 == 0) goto L96
            return r0
        L4f:
            boolean r0 = r5.isTimeoutCurrency()
            r4 = 0
            if (r0 == 0) goto L78
            X.1DFB r0 = X.C0PEM.LIZJ
            X.054G r2 = X.C2296808zG.LIZ(r0)
            X.09Kb r1 = new X.09Kb
            r1.<init>(r4)
            r0 = 3
            X.099G r3 = X.C23250099c.LIZIZ(r2, r4, r4, r1, r0)
            long r1 = r5.timeoutMs()
            X.01cW r0 = new X.01cW
            r0.<init>(r3, r4)
            r6.LLILLJJLI = r8
            java.lang.Object r1 = X.C099A.LIZJ(r1, r0, r6)
            if (r1 != r7) goto L9a
            return r7
        L78:
            X.1DFB r1 = X.C0PEM.LIZJ
            X.09Kc r0 = new X.09Kc
            r0.<init>(r4)
            r6.LLILLJJLI = r2
            java.lang.Object r1 = X.C23250099c.LJI(r6, r1, r0)
            if (r1 != r7) goto L27
            return r7
        L88:
            X.0hqO r6 = new X.0hqO
            r6.<init>(r9)
            goto L12
        L8e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L96:
            return r9
        L97:
            X.C155000ia.LIZIZ(r1)
        L9a:
            if (r1 == 0) goto L9d
            return r1
        L9d:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1219670hqP.LIZ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LJI(java.lang.String r13, long r14, long r16, X.InterfaceC1364105Vn r18) {
        /*
            r11 = 0
            r3 = r18
            boolean r0 = r3 instanceof X.C1219650hqN
            if (r0 == 0) goto L44
            r4 = r3
            X.0hqN r4 = (X.C1219650hqN) r4
            int r2 = r4.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L44
            int r2 = r2 - r1
            r4.LLILLJJLI = r2
        L15:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLJJLI
            r1 = 1
            if (r0 == 0) goto L2c
            if (r0 != r1) goto L4a
            X.C155000ia.LIZIZ(r3)
        L25:
            X.00o6 r3 = (X.C189200o6) r3
            java.lang.Object r0 = r3.m10unboximpl()
            return r0
        L2c:
            X.C155000ia.LIZIZ(r3)
            X.1DFB r0 = X.C0PEM.LIZJ
            X.0hqK r5 = new X.0hqK
            r12 = 0
            r9 = r16
            r7 = r14
            r6 = r13
            r5.<init>(r6, r7, r9, r11, r12)
            r4.LLILLJJLI = r1
            java.lang.Object r3 = X.C23250099c.LJI(r4, r0, r5)
            if (r3 != r2) goto L25
            return r2
        L44:
            X.0hqN r4 = new X.0hqN
            r4.<init>(r3)
            goto L15
        L4a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1219670hqP.LJI(java.lang.String, long, long, X.05Vn):java.lang.Object");
    }

    public static final void LJII(String str, long j, long j2, int i, InterfaceC1631620sYq<? super Integer, ? super String, ? super TaskReportResponse.Data, Unit> interfaceC1631620sYq, Function2<? super Integer, ? super Throwable, Unit> function2) {
        C1210580hbk c1210580hbk = new C1210580hbk(str, j, j2, interfaceC1631620sYq, function2);
        AwS633S0100000_19 awS633S0100000_19 = new AwS633S0100000_19(interfaceC1631620sYq, (InterfaceC1631620sYq<? super Integer, ? super String, ? super TaskActionResponse.Data, Unit>) 234);
        C480460Ism.LIZ().getClass();
        IncentiveApi incentiveApi = (IncentiveApi) C480460Ism.LIZLLL(IncentiveApi.class);
        String strValueOf = String.valueOf(j);
        w.LIZ.getClass();
        String strLJIIIZ = w.LJIIIZ();
        String strLJIIL = w.LJIIL();
        C1126800fQc.LIZ.u21();
        incentiveApi.taskReport(strValueOf, str, 1, j2, strLJIIIZ, strLJIIL, C1134510fd3.LJFF(Long.valueOf(j))).LJIILIIL(new C0UO0()).LJJLL(new AfS85S0101000_19(i, awS633S0100000_19, 3), new AfS85S0101000_19(i, c1210580hbk, 4));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZIZ(java.lang.String r18, int r19, java.lang.String r20, java.lang.Long r21, int r22, java.lang.Integer r23, java.lang.String r24, java.lang.Integer r25, java.lang.Long r26, java.lang.Long r27, X.InterfaceC1364105Vn r28) {
        /*
            r16 = 0
            r3 = r28
            boolean r0 = r3 instanceof X.C1219630hqL
            if (r0 == 0) goto L56
            r4 = r3
            X.0hqL r4 = (X.C1219630hqL) r4
            int r2 = r4.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L56
            int r2 = r2 - r1
            r4.LLILLJJLI = r2
        L16:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLJJLI
            r1 = 1
            if (r0 == 0) goto L2d
            if (r0 != r1) goto L5c
            X.C155000ia.LIZIZ(r3)
        L26:
            X.00o6 r3 = (X.C189200o6) r3
            java.lang.Object r0 = r3.m10unboximpl()
            return r0
        L2d:
            X.C155000ia.LIZIZ(r3)
            X.1DFB r0 = X.C0PEM.LIZJ
            X.0hqJ r5 = new X.0hqJ
            r17 = 0
            r15 = r27
            r14 = r26
            r13 = r25
            r12 = r24
            r11 = r23
            r10 = r22
            r9 = r21
            r8 = r20
            r7 = r19
            r6 = r18
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r4.LLILLJJLI = r1
            java.lang.Object r3 = X.C23250099c.LJI(r4, r0, r5)
            if (r3 != r2) goto L26
            return r2
        L56:
            X.0hqL r4 = new X.0hqL
            r4.<init>(r3)
            goto L16
        L5c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1219670hqP.LIZIZ(java.lang.String, int, java.lang.String, java.lang.Long, int, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Long, java.lang.Long, X.05Vn):java.lang.Object");
    }

    public static final void LIZLLL(String str, int i, String str2, Long l, int i2, Integer num, String str3, Integer num2, Long l2, Long l3, int i3, InterfaceC1631620sYq<? super Integer, ? super String, ? super TaskActionResponse.Data, Unit> interfaceC1631620sYq, Function2<? super Integer, ? super Throwable, Unit> function2) {
        String idStr;
        C1210570hbj c1210570hbj = new C1210570hbj(str, i, str2, l, i2, num, str3, num2, l2, l3, i3, interfaceC1631620sYq, function2);
        AwS633S0100000_19 awS633S0100000_19 = new AwS633S0100000_19(interfaceC1631620sYq, (InterfaceC1631620sYq<? super Integer, ? super String, ? super TaskActionResponse.Data, Unit>) 233);
        C480460Ism.LIZ().getClass();
        IncentiveApi incentiveApi = (IncentiveApi) C480460Ism.LIZLLL(IncentiveApi.class);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room roomLJJLI = C500260Jjc.LJJLI();
        if (roomLJJLI == null || (idStr = roomLJJLI.getIdStr()) == null) {
            idStr = "";
        }
        incentiveApi.taskAction(idStr, String.valueOf(i), str2, str, i2, 2, l, num, num2, l2, l3, UUID.randomUUID().toString()).LJIILIIL(new C0UO0()).LJJLL(new AfS85S0101000_19(i3, awS633S0100000_19, 1), new AfS85S0101000_19(i3, c1210570hbj, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LJ(int r22, int r23, int r24, int r25, long r26, long r28, java.lang.Long r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.util.HashMap r34, X.InterfaceC1364105Vn r35, boolean r36, boolean r37) {
        /*
            r3 = r35
            boolean r0 = r3 instanceof X.C1219640hqM
            if (r0 == 0) goto L5a
            r4 = r3
            X.0hqM r4 = (X.C1219640hqM) r4
            int r2 = r4.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5a
            int r2 = r2 - r1
            r4.LLILLJJLI = r2
        L14:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLJJLI
            r1 = 1
            if (r0 == 0) goto L2b
            if (r0 != r1) goto L60
            X.C155000ia.LIZIZ(r3)
        L24:
            X.00o6 r3 = (X.C189200o6) r3
            java.lang.Object r0 = r3.m10unboximpl()
            return r0
        L2b:
            X.C155000ia.LIZIZ(r3)
            X.1DFB r0 = X.C0PEM.LIZJ
            X.09Kd r5 = new X.09Kd
            r19 = 0
            r21 = r37
            r20 = r36
            r15 = r32
            r17 = r31
            r14 = r30
            r12 = r28
            r10 = r26
            r9 = r25
            r8 = r24
            r18 = r34
            r7 = r23
            r16 = r33
            r6 = r22
            r5.<init>(r6, r7, r8, r9, r10, r12, r14, r15, r16, r17, r18, r19, r20, r21)
            r4.LLILLJJLI = r1
            java.lang.Object r3 = X.C23250099c.LJI(r4, r0, r5)
            if (r3 != r2) goto L24
            return r2
        L5a:
            X.0hqM r4 = new X.0hqM
            r4.<init>(r3)
            goto L14
        L60:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1219670hqP.LJ(int, int, int, int, long, long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.util.HashMap, X.05Vn, boolean, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LJFF(long r22, int r24, int r25, int r26, long r27, int r29, java.lang.String r30, java.lang.String r31, boolean r32, java.lang.Long r33, java.util.HashMap<java.lang.String, java.lang.Object> r34, X.InterfaceC1631620sYq<? super java.lang.Integer, ? super java.lang.String, ? super com.bytedance.android.livesdk.guide.model.TaskInfoResponse.Data, kotlin.Unit> r35, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Throwable, kotlin.Unit> r36, X.InterfaceC1364105Vn<? super kotlin.Unit> r37) {
        /*
            Method dump skipped, instruction units count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1219670hqP.LJFF(long, int, int, int, long, int, java.lang.String, java.lang.String, boolean, java.lang.Long, java.util.HashMap, X.0sYq, kotlin.jvm.functions.Function2, X.05Vn):java.lang.Object");
    }
}
