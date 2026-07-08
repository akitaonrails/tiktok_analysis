package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.asynctask.AIGCServerTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.I2VServerTaskOutput;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCResultType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0LUm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C543820LUm extends C0LTN<C09JG, I2VServerTaskOutput> {
    public static final C557860LuK LJIILJJIL = new C557860LuK();
    public final String LJIIIIZZ = C0LM5.GENERAL_I2V_SERVER.getTypeName();
    public final String LJIIIZ = C0LMI.SERVER.getType();
    public String LJIIJ = "";
    public AIGCResultType LJIIJJI = AIGCResultType.VIDEO;
    public final List<AIGCServerTaskOutput> LJIIL = new ArrayList();
    public String LJIILIIL = "";

    @Override // X.C0LTN
    public final String LJIL() {
        return this.LJIIIZ;
    }

    @Override // X.C0LTN
    public final String LJJ() {
        return this.LJIIIIZZ;
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
            boolean r0 = r7 instanceof X.C543860LUq
            if (r0 == 0) goto L46
            r5 = r7
            X.0LUq r5 = (X.C543860LUq) r5
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
            X.0LuK r1 = X.C543820LUm.LJIILJJIL
            X.0LSZ r0 = r6.LIZLLL
            java.lang.String r0 = r0.LJIJJLI
            r5.LLILLL = r2
            java.lang.Object r0 = r1.LIZ(r0, r5)
            if (r0 != r3) goto L25
            return r3
        L46:
            X.0LUq r5 = new X.0LUq
            r5.<init>(r6, r7)
            goto L12
        L4c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C543820LUm.LJIIJ(X.05Vn):java.lang.Object");
    }

    public final Float LJJJJZ(String str) {
        try {
            return Float.valueOf((float) new JSONObject(str).optDouble("img_gender", 0.0d));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Fail parseDataGender ");
            sbLIZ.append(e);
            LJJJJJ(C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }

    public final Integer LJJJJZI(String str) {
        try {
            return Integer.valueOf(new JSONObject(str).optInt("img_imgtype", 1));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Fail parseDataImageType ");
            sbLIZ.append(e);
            LJJJJJ(C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }

    public final String LJJJLIIL(String str) {
        try {
            return new JSONObject(str).optString("img_skincolor", "");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Fail parseDataSkinColor ");
            sbLIZ.append(e);
            LJJJJJ(C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJLL(X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.C543910LUv
            if (r0 == 0) goto La5
            r6 = r10
            X.0LUv r6 = (X.C543910LUv) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La5
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r8 = r6.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r2 = 1
            r7 = 2
            if (r0 == 0) goto L28
            if (r0 == r2) goto L5f
            if (r0 != r7) goto Lac
            X.C155000ia.LIZIZ(r8)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r8)
            X.0LSZ r0 = r9.LIZLLL
            java.lang.String r4 = r0.LJIJJLI
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "requestProgress request: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r9.LJJJJIZL(r0)
            boolean r0 = X.C1906580ziK.LJI()
            if (r0 != 0) goto Lb4
            boolean r0 = X.C560970LzL.LIZLLL()
            if (r0 == 0) goto Lb4
            X.0LuK r1 = X.C543820LUm.LJIILJJIL
            java.util.List r0 = java.util.Collections.singletonList(r4)
            r6.LL = r4
            r6.LLILZ = r2
            java.lang.Object r8 = r1.LJFF(r0, r2, r6)
            if (r8 != r5) goto L66
            return r5
        L5f:
            java.lang.Object r4 = r6.LL
            java.lang.String r4 = (java.lang.String) r4
            X.C155000ia.LIZIZ(r8)
        L66:
            com.ss.android.ugc.aweme.aigc.asynctask.net.TasksDetailResponse r8 = (com.ss.android.ugc.aweme.aigc.asynctask.net.TasksDetailResponse) r8
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "requestProgress response: "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r9.LJJJJIZL(r0)
            if (r8 != 0) goto L80
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L80:
            java.lang.Integer r0 = r8.getStatusCode()
            if (r0 == 0) goto La3
            int r3 = r0.intValue()
        L8a:
            java.lang.String r2 = r8.getStatusMsg()
            if (r2 != 0) goto L92
            java.lang.String r2 = ""
        L92:
            X.0LV3 r1 = new X.0LV3
            r0 = 0
            r1.<init>(r8, r9, r4, r0)
            r6.LL = r0
            r6.LLILZ = r7
            java.lang.Object r0 = r9.LJJJJLL(r3, r2, r6, r1)
            if (r0 != r5) goto L25
            return r5
        La3:
            r3 = -1
            goto L8a
        La5:
            X.0LUv r6 = new X.0LUv
            r6.<init>(r9, r10)
            goto L12
        Lac:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lb4:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C543820LUm.LJJJLL(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b0 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0119  */
    @Override // X.C0LTN, X.InterfaceC542770LQl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.C09JG r38, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.aigc.asynctask.I2VServerTaskOutput> r39) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C543820LUm.LJFF(X.09JG, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJJL(com.ss.android.ugc.aweme.aigc.asynctask.I2VServerTaskInput r45, X.InterfaceC1364105Vn<? super kotlin.Unit> r46) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C543820LUm.LJJJJJL(com.ss.android.ugc.aweme.aigc.asynctask.I2VServerTaskInput, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJLI(X.C09JG r40, X.InterfaceC1364105Vn<? super kotlin.Unit> r41) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C543820LUm.LJJJJLI(X.09JG, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b9 A[PHI: r0 r5 r7
      0x00b9: PHI (r0v15 long) = (r0v4 long), (r0v6 long), (r0v18 long) binds: [B:54:0x00b9, B:22:0x00b7, B:20:0x0097] A[DONT_GENERATE, DONT_INLINE]
      0x00b9: PHI (r5v8 long) = (r5v3 long), (r5v4 long), (r5v12 long) binds: [B:54:0x00b9, B:22:0x00b7, B:20:0x0097] A[DONT_GENERATE, DONT_INLINE]
      0x00b9: PHI (r7v9 com.ss.android.ugc.aweme.aigc.asynctask.I2VServerTaskInput) = 
      (r7v3 com.ss.android.ugc.aweme.aigc.asynctask.I2VServerTaskInput)
      (r7v5 com.ss.android.ugc.aweme.aigc.asynctask.I2VServerTaskInput)
      (r7v10 com.ss.android.ugc.aweme.aigc.asynctask.I2VServerTaskInput)
     binds: [B:54:0x00b9, B:22:0x00b7, B:20:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0136 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJLZIJ(com.ss.android.ugc.aweme.aigc.asynctask.I2VServerTaskInput r42, X.InterfaceC1364105Vn<? super kotlin.Unit> r43) {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C543820LUm.LJJJLZIJ(com.ss.android.ugc.aweme.aigc.asynctask.I2VServerTaskInput, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(24:0|2|(2:4|(1:6)(1:156))(0)|7|(1:(1:(1:(1:(1:(3:14|15|16)(2:157|158))(9:145|146|(1:148)(1:155)|149|(1:151)|152|(1:154)|15|16))(3:163|164|165))(3:128|129|(4:131|(1:133)|164|165)(12:134|(1:136)(1:144)|137|(2:141|(1:143))|146|(0)(0)|149|(0)|152|(0)|15|16)))(1:28))(2:17|(2:19|20)(2:21|(2:23|24)(2:25|(1:27))))|29|(3:33|(3:36|(7:38|(7:44|(1:46)(1:76)|47|(1:49)|50|(1:52)(1:75)|53)|54|(1:56)(1:74)|57|(2:71|171)(2:73|172)|72)(3:170|159|160)|34)|169)|77|(3:79|(3:82|(7:84|(1:86)(1:95)|87|(1:89)|90|(2:92|175)(2:94|176)|93)(3:174|161|162)|80)|173)|96|(1:98)(1:111)|(1:100)|(3:102|(1:104)(1:109)|105)(1:110)|106|(1:108)(1:112)|166|113|116|(3:118|(2:121|119)|177)|122|125|(1:127)|129|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x020b, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x020c, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
        r13 = new org.json.JSONObject();
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0258, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0259, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1);
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0363 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0366  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJZ(X.C09JG r50, X.InterfaceC1364105Vn<? super kotlin.Unit> r51) {
        /*
            Method dump skipped, instruction units count: 901
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C543820LUm.LJJJZ(X.09JG, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJL(com.ss.android.ugc.aweme.aigc.asynctask.I2VServerTaskInput r18, long r19, X.InterfaceC1364105Vn<? super java.lang.Boolean> r21) {
        /*
            r17 = this;
            r5 = r21
            r1 = r19
            boolean r0 = r5 instanceof X.C543900LUu
            r10 = r17
            if (r0 == 0) goto La0
            r15 = r5
            X.0LUu r15 = (X.C543900LUu) r15
            int r4 = r15.LLILLL
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r3
            if (r0 == 0) goto La0
            int r4 = r4 - r3
            r15.LLILLL = r4
        L18:
            java.lang.Object r3 = r15.LL
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r15.LLILLL
            r6 = 1
            if (r0 == 0) goto L2d
            if (r0 != r6) goto La7
            X.C155000ia.LIZIZ(r3)
        L28:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            return r0
        L2d:
            X.C155000ia.LIZIZ(r3)
            boolean r0 = X.C1906580ziK.LJI()
            if (r0 != 0) goto Lb5
            boolean r0 = X.C560970LzL.LIZLLL()
            if (r0 == 0) goto Lb5
            r0 = r18
            if (r0 == 0) goto L52
            java.lang.Long r5 = r0.timeOutSecond
            if (r5 == 0) goto L52
            long r8 = r5.longValue()
            r3 = 0
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 <= 0) goto L52
            long r1 = r5.longValue()
        L52:
            long r8 = java.lang.System.currentTimeMillis()
            X.0LSZ r0 = r10.LIZLLL
            long r3 = r0.LJIJJ
            long r8 = r8 - r3
            r0 = 1000(0x3e8, float:1.401E-42)
            long r3 = (long) r0
            long r3 = r3 * r1
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 <= 0) goto Laf
            X.0LC1 r8 = X.C0LC1.LIZIZ
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            java.lang.String r5 = "time out, limit="
            r0.append(r5)
            r0.append(r1)
            java.lang.String r4 = " second"
            r0.append(r4)
            java.lang.String r3 = X.C2188811AlT.LIZIZ(r0)
            java.lang.String r0 = "GeneralI2VServerTask"
            X.C201955140j.LIZLLL(r8, r0, r3)
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r5)
            r0.append(r1)
            r0.append(r4)
            java.lang.String r12 = X.C2188811AlT.LIZIZ(r0)
            r13 = 0
            r16 = 12
            r15.LLILLL = r6
            r11 = -47369(0xffffffffffff46f7, float:NaN)
            r14 = r13
            java.lang.Object r0 = X.C539400LDm.LIZ(r10, r11, r12, r13, r14, r15, r16)
            if (r0 != r7) goto L28
            return r7
        La0:
            X.0LUu r15 = new X.0LUu
            r15.<init>(r10, r5)
            goto L18
        La7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Laf:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        Lb5:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C543820LUm.LJJJJL(com.ss.android.ugc.aweme.aigc.asynctask.I2VServerTaskInput, long, X.05Vn):java.lang.Object");
    }

    public final Object LJJJJLL(int i, String str, InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1) {
        if (i == 0) {
            return function1.invoke(interfaceC1364105Vn);
        }
        Object objLIZ = C539400LDm.LIZ(this, i, str, null, null, interfaceC1364105Vn, 12);
        if (objLIZ == C099R.LJFF()) {
            return objLIZ;
        }
        return Unit.LIZ;
    }
}
