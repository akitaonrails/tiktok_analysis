package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.p;
import com.ss.android.ugc.aweme.aigc.asynctask.AutoCutServerTaskOutput;
import com.ss.android.ugc.aweme.aigc.asynctask.models.AutoPickTaskResponse;
import com.ss.android.ugc.aweme.aigc.asynctask.models.MusicInfo;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0LKb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C541110LKb extends C0LTN<C09JG, AutoCutServerTaskOutput> {
    public static final C20106013li LJIILLIIL = new C20106013li();
    public static final long LJIIZILJ;
    public static final int LJIJ;
    public final String LJIIIIZZ = C0LM5.AUTOCUT_SERVER.getTypeName();
    public final String LJIIIZ = C0LMI.SERVER.getType();
    public int LJIIJ = 3;
    public String LJIIJJI = "";
    public MusicInfo LJIIL;
    public List<AutoPickTaskResponse> LJIILIIL;
    public int LJIILJJIL;
    public String LJIILL;

    static {
        new Gson();
        LJIIZILJ = ((long) ((Number) C0ABC.LIZ.getValue()).intValue()) * 1000;
        LJIJ = ((Number) C258500ABc.LIZ.getValue()).intValue();
    }

    @Override // X.C0LTN
    public final int LJIJJLI() {
        return this.LJIIJ;
    }

    @Override // X.C0LTN
    public final String LJIL() {
        return this.LJIIIZ;
    }

    @Override // X.C0LTN
    public final String LJJ() {
        return this.LJIIIIZZ;
    }

    public static Long LJJJJLI(String str) {
        boolean z;
        Object c098200Yq;
        String strLJIL;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        Object obj = null;
        if (z) {
            return null;
        }
        try {
            new p();
            h hVarLJJIIZI = p.LIZJ(str).LJIILIIL().LJJIIZI("metrics");
            if (hVarLJJIIZI != null) {
                int size = hVarLJJIIZI.size();
                for (int i = 0; i < size; i++) {
                    n nVarLJIILIIL = hVarLJJIIZI.LJJIIJZLJL(i).LJIILIIL();
                    k kVarLJJIIZ = nVarLJIILIIL.LJJIIZ("name");
                    if (kVarLJJIIZ != null) {
                        strLJIL = kVarLJJIIZ.LJIL();
                    } else {
                        strLJIL = null;
                    }
                    if (Intrinsics.LJFF(strLJIL, "overall_time(s)")) {
                        c098200Yq = Long.valueOf((long) (nVarLJIILIIL.LJJIIZ("value").LJIIIZ() * ((double) LSPassThroughRecordSizeConfig.DEFAULT)));
                        break;
                    }
                }
                c098200Yq = null;
                C189200o6.m2constructorimpl(c098200Yq);
            } else {
                c098200Yq = null;
                C189200o6.m2constructorimpl(c098200Yq);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (Long) obj;
    }

    @Override // X.C0LTN, X.InterfaceC542770LQl
    public final Object LIZIZ(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objLJJJIL = C0LTN.LJJJIL(this, interfaceC1364105Vn);
        if (objLJJJIL == C099R.LJFF()) {
            return objLJJJIL;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    @Override // X.C0LTN, X.InterfaceC542770LQl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C541140LKe
            if (r0 == 0) goto L74
            r5 = r9
            X.0LKe r5 = (X.C541140LKe) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L74
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r4 = 2
            r6 = 1
            if (r0 == 0) goto L44
            if (r0 == r6) goto L50
            if (r0 != r4) goto L7a
            long r2 = r5.LL
            X.C155000ia.LIZIZ(r1)
        L27:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r6 = r1.booleanValue()
        L2d:
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r2
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L42
            r0 = 2147483647(0x7fffffff, float:NaN)
        L3c:
            r8.LJJIII(r0, r6)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L42:
            int r0 = (int) r4
            goto L3c
        L44:
            X.C155000ia.LIZIZ(r1)
            r5.LLILZ = r6
            java.lang.Object r0 = X.C0LTN.LJIILJJIL(r8, r5)
            if (r0 != r7) goto L53
            return r7
        L50:
            X.C155000ia.LIZIZ(r1)
        L53:
            long r2 = java.lang.System.currentTimeMillis()
            X.0LSZ r0 = r8.LIZLLL
            java.lang.String r0 = r0.LJIJJLI
            boolean r0 = kotlin.text.a0.LJJJIL(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L2d
            X.13li r1 = X.C541110LKb.LJIILLIIL
            X.0LSZ r0 = r8.LIZLLL
            java.lang.String r0 = r0.LJIJJLI
            r5.LL = r2
            r5.LLILZ = r4
            java.lang.Object r1 = r1.LIZIZ(r0, r5)
            if (r1 != r7) goto L27
            return r7
        L74:
            X.0LKe r5 = new X.0LKe
            r5.<init>(r8, r9)
            goto L12
        L7a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C541110LKb.LJIIJ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJLIIL(X.InterfaceC1364105Vn<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instruction units count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C541110LKb.LJJJLIIL(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJLL(X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.C541230LKn
            if (r0 == 0) goto L7f
            r5 = r10
            X.0LKn r5 = (X.C541230LKn) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7f
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r6 = 2
            r7 = 1
            if (r0 == 0) goto L28
            if (r0 == r7) goto L6d
            if (r0 != r6) goto L85
            X.C155000ia.LIZIZ(r1)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r1)
            int r0 = r9.LJIIJ
            int r0 = r0 + (-1)
            r9.LJIIJ = r0
            X.13Lf r8 = X.AbstractC19994813Le.Default
            r2 = 0
            r0 = 501(0x1f5, double:2.475E-321)
            long r2 = r8.nextLong(r2, r0)
            r0 = 500(0x1f4, double:2.47E-321)
            long r2 = r2 + r0
            X.0LMx r8 = X.C541850LMx.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "submit to run retry: "
            r1.append(r0)
            int r0 = r9.LJIIJ
            r1.append(r0)
            java.lang.String r0 = ", delay="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "ms"
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "AutoCut2MAETask"
            X.C201955140j.LIZLLL(r8, r0, r1)
            r5.LLILLL = r7
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r2, r5)
            if (r0 != r4) goto L70
            return r4
        L6d:
            X.C155000ia.LIZIZ(r1)
        L70:
            X.09JJ r1 = new X.09JJ
            r0 = 0
            r1.<init>(r0)
            r5.LLILLL = r6
            java.lang.Object r0 = r9.LJFF(r1, r5)
            if (r0 != r4) goto L25
            return r4
        L7f:
            X.0LKn r5 = new X.0LKn
            r5.<init>(r9, r10)
            goto L12
        L85:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C541110LKb.LJJJLL(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ec A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ed  */
    @Override // X.C0LTN, X.InterfaceC542770LQl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.C09JG r38, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.aigc.asynctask.AutoCutServerTaskOutput> r39) {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C541110LKb.LJFF(X.09JG, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJJL(com.ss.android.ugc.aweme.aigc.asynctask.AutoCutServerTaskInput r45, X.InterfaceC1364105Vn<? super kotlin.Unit> r46) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C541110LKb.LJJJJJL(com.ss.android.ugc.aweme.aigc.asynctask.AutoCutServerTaskInput, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJL(com.ss.android.ugc.aweme.aigc.asynctask.AutoCutServerTaskInput r18, X.InterfaceC1364105Vn<? super java.lang.Boolean> r19) {
        /*
            r17 = this;
            r3 = r19
            boolean r0 = r3 instanceof X.C541200LKk
            r10 = r17
            if (r0 == 0) goto L92
            r15 = r3
            X.0LKk r15 = (X.C541200LKk) r15
            int r2 = r15.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L92
            int r2 = r2 - r1
            r15.LLILLL = r2
        L16:
            java.lang.Object r1 = r15.LL
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r15.LLILLL
            r6 = 1
            if (r0 == 0) goto L2b
            if (r0 != r6) goto L99
            X.C155000ia.LIZIZ(r1)
        L26:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            return r0
        L2b:
            X.C155000ia.LIZIZ(r1)
            r0 = r18
            if (r0 == 0) goto La7
            java.lang.Long r5 = r0.timeOutSecond
            if (r5 == 0) goto La7
            long r3 = r5.longValue()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto La7
            long r1 = r5.longValue()
            long r8 = java.lang.System.currentTimeMillis()
            X.0LSZ r0 = r10.LIZLLL
            long r3 = r0.LJIJJ
            long r8 = r8 - r3
            r0 = 1000(0x3e8, float:1.401E-42)
            long r3 = (long) r0
            long r3 = r3 * r1
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 <= 0) goto La1
            X.0LMx r8 = X.C541850LMx.LIZIZ
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            java.lang.String r5 = "time out, limit="
            r0.append(r5)
            r0.append(r1)
            java.lang.String r4 = " second"
            r0.append(r4)
            java.lang.String r3 = X.C2188811AlT.LIZIZ(r0)
            java.lang.String r0 = "AutoCut2MAETask"
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
            if (r0 != r7) goto L26
            return r7
        L92:
            X.0LKk r15 = new X.0LKk
            r15.<init>(r10, r3)
            goto L16
        L99:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        La1:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        La7:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C541110LKb.LJJJJL(com.ss.android.ugc.aweme.aigc.asynctask.AutoCutServerTaskInput, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJLL(X.C09JG r41, X.InterfaceC1364105Vn<? super kotlin.Unit> r42) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C541110LKb.LJJJJLL(X.09JG, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x015c A[Catch: all -> 0x02dc, TryCatch #0 {all -> 0x02dc, blocks: (B:18:0x003c, B:21:0x0044, B:22:0x0053, B:24:0x0059, B:26:0x0063, B:30:0x006e, B:32:0x0078, B:37:0x0083, B:38:0x0087, B:40:0x008d, B:42:0x009c, B:50:0x00aa, B:52:0x00ae, B:54:0x00b4, B:60:0x00c3, B:63:0x00cb, B:65:0x00cf, B:66:0x00d3, B:68:0x00d7, B:69:0x00db, B:75:0x00ea, B:77:0x00ee, B:78:0x00f2, B:83:0x00fc, B:86:0x0102, B:36:0x0081, B:89:0x011b, B:90:0x011f, B:92:0x0125, B:94:0x0136, B:98:0x013e, B:100:0x0142, B:104:0x014d, B:106:0x0157, B:112:0x0167, B:115:0x0172, B:117:0x0178, B:118:0x017c, B:120:0x0182, B:130:0x019b, B:132:0x019f, B:135:0x01a8, B:142:0x01b6, B:144:0x01ba, B:169:0x0216, B:171:0x021c, B:172:0x0220, B:174:0x0226, B:183:0x023d, B:185:0x0241, B:186:0x0245, B:188:0x024b, B:190:0x025c, B:196:0x0267, B:197:0x0269, B:200:0x0272, B:209:0x0284, B:212:0x028d, B:219:0x029b, B:221:0x02a1, B:222:0x02a5, B:224:0x02ab, B:235:0x02c7, B:147:0x01c3, B:148:0x01cc, B:150:0x01d2, B:152:0x01e5, B:153:0x01e9, B:154:0x01ed, B:156:0x01f3, B:158:0x0202, B:160:0x0206, B:107:0x015c), top: B:356:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0167 A[Catch: all -> 0x02dc, TryCatch #0 {all -> 0x02dc, blocks: (B:18:0x003c, B:21:0x0044, B:22:0x0053, B:24:0x0059, B:26:0x0063, B:30:0x006e, B:32:0x0078, B:37:0x0083, B:38:0x0087, B:40:0x008d, B:42:0x009c, B:50:0x00aa, B:52:0x00ae, B:54:0x00b4, B:60:0x00c3, B:63:0x00cb, B:65:0x00cf, B:66:0x00d3, B:68:0x00d7, B:69:0x00db, B:75:0x00ea, B:77:0x00ee, B:78:0x00f2, B:83:0x00fc, B:86:0x0102, B:36:0x0081, B:89:0x011b, B:90:0x011f, B:92:0x0125, B:94:0x0136, B:98:0x013e, B:100:0x0142, B:104:0x014d, B:106:0x0157, B:112:0x0167, B:115:0x0172, B:117:0x0178, B:118:0x017c, B:120:0x0182, B:130:0x019b, B:132:0x019f, B:135:0x01a8, B:142:0x01b6, B:144:0x01ba, B:169:0x0216, B:171:0x021c, B:172:0x0220, B:174:0x0226, B:183:0x023d, B:185:0x0241, B:186:0x0245, B:188:0x024b, B:190:0x025c, B:196:0x0267, B:197:0x0269, B:200:0x0272, B:209:0x0284, B:212:0x028d, B:219:0x029b, B:221:0x02a1, B:222:0x02a5, B:224:0x02ab, B:235:0x02c7, B:147:0x01c3, B:148:0x01cc, B:150:0x01d2, B:152:0x01e5, B:153:0x01e9, B:154:0x01ed, B:156:0x01f3, B:158:0x0202, B:160:0x0206, B:107:0x015c), top: B:356:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0172 A[Catch: all -> 0x02dc, TryCatch #0 {all -> 0x02dc, blocks: (B:18:0x003c, B:21:0x0044, B:22:0x0053, B:24:0x0059, B:26:0x0063, B:30:0x006e, B:32:0x0078, B:37:0x0083, B:38:0x0087, B:40:0x008d, B:42:0x009c, B:50:0x00aa, B:52:0x00ae, B:54:0x00b4, B:60:0x00c3, B:63:0x00cb, B:65:0x00cf, B:66:0x00d3, B:68:0x00d7, B:69:0x00db, B:75:0x00ea, B:77:0x00ee, B:78:0x00f2, B:83:0x00fc, B:86:0x0102, B:36:0x0081, B:89:0x011b, B:90:0x011f, B:92:0x0125, B:94:0x0136, B:98:0x013e, B:100:0x0142, B:104:0x014d, B:106:0x0157, B:112:0x0167, B:115:0x0172, B:117:0x0178, B:118:0x017c, B:120:0x0182, B:130:0x019b, B:132:0x019f, B:135:0x01a8, B:142:0x01b6, B:144:0x01ba, B:169:0x0216, B:171:0x021c, B:172:0x0220, B:174:0x0226, B:183:0x023d, B:185:0x0241, B:186:0x0245, B:188:0x024b, B:190:0x025c, B:196:0x0267, B:197:0x0269, B:200:0x0272, B:209:0x0284, B:212:0x028d, B:219:0x029b, B:221:0x02a1, B:222:0x02a5, B:224:0x02ab, B:235:0x02c7, B:147:0x01c3, B:148:0x01cc, B:150:0x01d2, B:152:0x01e5, B:153:0x01e9, B:154:0x01ed, B:156:0x01f3, B:158:0x0202, B:160:0x0206, B:107:0x015c), top: B:356:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019f A[Catch: all -> 0x02dc, TryCatch #0 {all -> 0x02dc, blocks: (B:18:0x003c, B:21:0x0044, B:22:0x0053, B:24:0x0059, B:26:0x0063, B:30:0x006e, B:32:0x0078, B:37:0x0083, B:38:0x0087, B:40:0x008d, B:42:0x009c, B:50:0x00aa, B:52:0x00ae, B:54:0x00b4, B:60:0x00c3, B:63:0x00cb, B:65:0x00cf, B:66:0x00d3, B:68:0x00d7, B:69:0x00db, B:75:0x00ea, B:77:0x00ee, B:78:0x00f2, B:83:0x00fc, B:86:0x0102, B:36:0x0081, B:89:0x011b, B:90:0x011f, B:92:0x0125, B:94:0x0136, B:98:0x013e, B:100:0x0142, B:104:0x014d, B:106:0x0157, B:112:0x0167, B:115:0x0172, B:117:0x0178, B:118:0x017c, B:120:0x0182, B:130:0x019b, B:132:0x019f, B:135:0x01a8, B:142:0x01b6, B:144:0x01ba, B:169:0x0216, B:171:0x021c, B:172:0x0220, B:174:0x0226, B:183:0x023d, B:185:0x0241, B:186:0x0245, B:188:0x024b, B:190:0x025c, B:196:0x0267, B:197:0x0269, B:200:0x0272, B:209:0x0284, B:212:0x028d, B:219:0x029b, B:221:0x02a1, B:222:0x02a5, B:224:0x02ab, B:235:0x02c7, B:147:0x01c3, B:148:0x01cc, B:150:0x01d2, B:152:0x01e5, B:153:0x01e9, B:154:0x01ed, B:156:0x01f3, B:158:0x0202, B:160:0x0206, B:107:0x015c), top: B:356:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a8 A[Catch: all -> 0x02dc, TryCatch #0 {all -> 0x02dc, blocks: (B:18:0x003c, B:21:0x0044, B:22:0x0053, B:24:0x0059, B:26:0x0063, B:30:0x006e, B:32:0x0078, B:37:0x0083, B:38:0x0087, B:40:0x008d, B:42:0x009c, B:50:0x00aa, B:52:0x00ae, B:54:0x00b4, B:60:0x00c3, B:63:0x00cb, B:65:0x00cf, B:66:0x00d3, B:68:0x00d7, B:69:0x00db, B:75:0x00ea, B:77:0x00ee, B:78:0x00f2, B:83:0x00fc, B:86:0x0102, B:36:0x0081, B:89:0x011b, B:90:0x011f, B:92:0x0125, B:94:0x0136, B:98:0x013e, B:100:0x0142, B:104:0x014d, B:106:0x0157, B:112:0x0167, B:115:0x0172, B:117:0x0178, B:118:0x017c, B:120:0x0182, B:130:0x019b, B:132:0x019f, B:135:0x01a8, B:142:0x01b6, B:144:0x01ba, B:169:0x0216, B:171:0x021c, B:172:0x0220, B:174:0x0226, B:183:0x023d, B:185:0x0241, B:186:0x0245, B:188:0x024b, B:190:0x025c, B:196:0x0267, B:197:0x0269, B:200:0x0272, B:209:0x0284, B:212:0x028d, B:219:0x029b, B:221:0x02a1, B:222:0x02a5, B:224:0x02ab, B:235:0x02c7, B:147:0x01c3, B:148:0x01cc, B:150:0x01d2, B:152:0x01e5, B:153:0x01e9, B:154:0x01ed, B:156:0x01f3, B:158:0x0202, B:160:0x0206, B:107:0x015c), top: B:356:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c3 A[Catch: all -> 0x02dc, TryCatch #0 {all -> 0x02dc, blocks: (B:18:0x003c, B:21:0x0044, B:22:0x0053, B:24:0x0059, B:26:0x0063, B:30:0x006e, B:32:0x0078, B:37:0x0083, B:38:0x0087, B:40:0x008d, B:42:0x009c, B:50:0x00aa, B:52:0x00ae, B:54:0x00b4, B:60:0x00c3, B:63:0x00cb, B:65:0x00cf, B:66:0x00d3, B:68:0x00d7, B:69:0x00db, B:75:0x00ea, B:77:0x00ee, B:78:0x00f2, B:83:0x00fc, B:86:0x0102, B:36:0x0081, B:89:0x011b, B:90:0x011f, B:92:0x0125, B:94:0x0136, B:98:0x013e, B:100:0x0142, B:104:0x014d, B:106:0x0157, B:112:0x0167, B:115:0x0172, B:117:0x0178, B:118:0x017c, B:120:0x0182, B:130:0x019b, B:132:0x019f, B:135:0x01a8, B:142:0x01b6, B:144:0x01ba, B:169:0x0216, B:171:0x021c, B:172:0x0220, B:174:0x0226, B:183:0x023d, B:185:0x0241, B:186:0x0245, B:188:0x024b, B:190:0x025c, B:196:0x0267, B:197:0x0269, B:200:0x0272, B:209:0x0284, B:212:0x028d, B:219:0x029b, B:221:0x02a1, B:222:0x02a5, B:224:0x02ab, B:235:0x02c7, B:147:0x01c3, B:148:0x01cc, B:150:0x01d2, B:152:0x01e5, B:153:0x01e9, B:154:0x01ed, B:156:0x01f3, B:158:0x0202, B:160:0x0206, B:107:0x015c), top: B:356:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0216 A[Catch: all -> 0x02dc, TryCatch #0 {all -> 0x02dc, blocks: (B:18:0x003c, B:21:0x0044, B:22:0x0053, B:24:0x0059, B:26:0x0063, B:30:0x006e, B:32:0x0078, B:37:0x0083, B:38:0x0087, B:40:0x008d, B:42:0x009c, B:50:0x00aa, B:52:0x00ae, B:54:0x00b4, B:60:0x00c3, B:63:0x00cb, B:65:0x00cf, B:66:0x00d3, B:68:0x00d7, B:69:0x00db, B:75:0x00ea, B:77:0x00ee, B:78:0x00f2, B:83:0x00fc, B:86:0x0102, B:36:0x0081, B:89:0x011b, B:90:0x011f, B:92:0x0125, B:94:0x0136, B:98:0x013e, B:100:0x0142, B:104:0x014d, B:106:0x0157, B:112:0x0167, B:115:0x0172, B:117:0x0178, B:118:0x017c, B:120:0x0182, B:130:0x019b, B:132:0x019f, B:135:0x01a8, B:142:0x01b6, B:144:0x01ba, B:169:0x0216, B:171:0x021c, B:172:0x0220, B:174:0x0226, B:183:0x023d, B:185:0x0241, B:186:0x0245, B:188:0x024b, B:190:0x025c, B:196:0x0267, B:197:0x0269, B:200:0x0272, B:209:0x0284, B:212:0x028d, B:219:0x029b, B:221:0x02a1, B:222:0x02a5, B:224:0x02ab, B:235:0x02c7, B:147:0x01c3, B:148:0x01cc, B:150:0x01d2, B:152:0x01e5, B:153:0x01e9, B:154:0x01ed, B:156:0x01f3, B:158:0x0202, B:160:0x0206, B:107:0x015c), top: B:356:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x023d A[Catch: all -> 0x02dc, TryCatch #0 {all -> 0x02dc, blocks: (B:18:0x003c, B:21:0x0044, B:22:0x0053, B:24:0x0059, B:26:0x0063, B:30:0x006e, B:32:0x0078, B:37:0x0083, B:38:0x0087, B:40:0x008d, B:42:0x009c, B:50:0x00aa, B:52:0x00ae, B:54:0x00b4, B:60:0x00c3, B:63:0x00cb, B:65:0x00cf, B:66:0x00d3, B:68:0x00d7, B:69:0x00db, B:75:0x00ea, B:77:0x00ee, B:78:0x00f2, B:83:0x00fc, B:86:0x0102, B:36:0x0081, B:89:0x011b, B:90:0x011f, B:92:0x0125, B:94:0x0136, B:98:0x013e, B:100:0x0142, B:104:0x014d, B:106:0x0157, B:112:0x0167, B:115:0x0172, B:117:0x0178, B:118:0x017c, B:120:0x0182, B:130:0x019b, B:132:0x019f, B:135:0x01a8, B:142:0x01b6, B:144:0x01ba, B:169:0x0216, B:171:0x021c, B:172:0x0220, B:174:0x0226, B:183:0x023d, B:185:0x0241, B:186:0x0245, B:188:0x024b, B:190:0x025c, B:196:0x0267, B:197:0x0269, B:200:0x0272, B:209:0x0284, B:212:0x028d, B:219:0x029b, B:221:0x02a1, B:222:0x02a5, B:224:0x02ab, B:235:0x02c7, B:147:0x01c3, B:148:0x01cc, B:150:0x01d2, B:152:0x01e5, B:153:0x01e9, B:154:0x01ed, B:156:0x01f3, B:158:0x0202, B:160:0x0206, B:107:0x015c), top: B:356:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0272 A[Catch: all -> 0x02dc, TryCatch #0 {all -> 0x02dc, blocks: (B:18:0x003c, B:21:0x0044, B:22:0x0053, B:24:0x0059, B:26:0x0063, B:30:0x006e, B:32:0x0078, B:37:0x0083, B:38:0x0087, B:40:0x008d, B:42:0x009c, B:50:0x00aa, B:52:0x00ae, B:54:0x00b4, B:60:0x00c3, B:63:0x00cb, B:65:0x00cf, B:66:0x00d3, B:68:0x00d7, B:69:0x00db, B:75:0x00ea, B:77:0x00ee, B:78:0x00f2, B:83:0x00fc, B:86:0x0102, B:36:0x0081, B:89:0x011b, B:90:0x011f, B:92:0x0125, B:94:0x0136, B:98:0x013e, B:100:0x0142, B:104:0x014d, B:106:0x0157, B:112:0x0167, B:115:0x0172, B:117:0x0178, B:118:0x017c, B:120:0x0182, B:130:0x019b, B:132:0x019f, B:135:0x01a8, B:142:0x01b6, B:144:0x01ba, B:169:0x0216, B:171:0x021c, B:172:0x0220, B:174:0x0226, B:183:0x023d, B:185:0x0241, B:186:0x0245, B:188:0x024b, B:190:0x025c, B:196:0x0267, B:197:0x0269, B:200:0x0272, B:209:0x0284, B:212:0x028d, B:219:0x029b, B:221:0x02a1, B:222:0x02a5, B:224:0x02ab, B:235:0x02c7, B:147:0x01c3, B:148:0x01cc, B:150:0x01d2, B:152:0x01e5, B:153:0x01e9, B:154:0x01ed, B:156:0x01f3, B:158:0x0202, B:160:0x0206, B:107:0x015c), top: B:356:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0284 A[Catch: all -> 0x02dc, TryCatch #0 {all -> 0x02dc, blocks: (B:18:0x003c, B:21:0x0044, B:22:0x0053, B:24:0x0059, B:26:0x0063, B:30:0x006e, B:32:0x0078, B:37:0x0083, B:38:0x0087, B:40:0x008d, B:42:0x009c, B:50:0x00aa, B:52:0x00ae, B:54:0x00b4, B:60:0x00c3, B:63:0x00cb, B:65:0x00cf, B:66:0x00d3, B:68:0x00d7, B:69:0x00db, B:75:0x00ea, B:77:0x00ee, B:78:0x00f2, B:83:0x00fc, B:86:0x0102, B:36:0x0081, B:89:0x011b, B:90:0x011f, B:92:0x0125, B:94:0x0136, B:98:0x013e, B:100:0x0142, B:104:0x014d, B:106:0x0157, B:112:0x0167, B:115:0x0172, B:117:0x0178, B:118:0x017c, B:120:0x0182, B:130:0x019b, B:132:0x019f, B:135:0x01a8, B:142:0x01b6, B:144:0x01ba, B:169:0x0216, B:171:0x021c, B:172:0x0220, B:174:0x0226, B:183:0x023d, B:185:0x0241, B:186:0x0245, B:188:0x024b, B:190:0x025c, B:196:0x0267, B:197:0x0269, B:200:0x0272, B:209:0x0284, B:212:0x028d, B:219:0x029b, B:221:0x02a1, B:222:0x02a5, B:224:0x02ab, B:235:0x02c7, B:147:0x01c3, B:148:0x01cc, B:150:0x01d2, B:152:0x01e5, B:153:0x01e9, B:154:0x01ed, B:156:0x01f3, B:158:0x0202, B:160:0x0206, B:107:0x015c), top: B:356:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0517 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0081 A[Catch: all -> 0x02dc, TryCatch #0 {all -> 0x02dc, blocks: (B:18:0x003c, B:21:0x0044, B:22:0x0053, B:24:0x0059, B:26:0x0063, B:30:0x006e, B:32:0x0078, B:37:0x0083, B:38:0x0087, B:40:0x008d, B:42:0x009c, B:50:0x00aa, B:52:0x00ae, B:54:0x00b4, B:60:0x00c3, B:63:0x00cb, B:65:0x00cf, B:66:0x00d3, B:68:0x00d7, B:69:0x00db, B:75:0x00ea, B:77:0x00ee, B:78:0x00f2, B:83:0x00fc, B:86:0x0102, B:36:0x0081, B:89:0x011b, B:90:0x011f, B:92:0x0125, B:94:0x0136, B:98:0x013e, B:100:0x0142, B:104:0x014d, B:106:0x0157, B:112:0x0167, B:115:0x0172, B:117:0x0178, B:118:0x017c, B:120:0x0182, B:130:0x019b, B:132:0x019f, B:135:0x01a8, B:142:0x01b6, B:144:0x01ba, B:169:0x0216, B:171:0x021c, B:172:0x0220, B:174:0x0226, B:183:0x023d, B:185:0x0241, B:186:0x0245, B:188:0x024b, B:190:0x025c, B:196:0x0267, B:197:0x0269, B:200:0x0272, B:209:0x0284, B:212:0x028d, B:219:0x029b, B:221:0x02a1, B:222:0x02a5, B:224:0x02ab, B:235:0x02c7, B:147:0x01c3, B:148:0x01cc, B:150:0x01d2, B:152:0x01e5, B:153:0x01e9, B:154:0x01ed, B:156:0x01f3, B:158:0x0202, B:160:0x0206, B:107:0x015c), top: B:356:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJZI(com.ss.android.ugc.aweme.aigc.asynctask.net.AutoCutAgentCheckStatusResponse r47, X.InterfaceC1364105Vn<? super kotlin.Unit> r48) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C541110LKb.LJJJJZI(com.ss.android.ugc.aweme.aigc.asynctask.net.AutoCutAgentCheckStatusResponse, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0046 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x005c -> B:15:0x003a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00a1 -> B:14:0x0037). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJZ(com.ss.android.ugc.aweme.aigc.asynctask.AutoCutServerTaskInput r45, X.InterfaceC1364105Vn<? super kotlin.Unit> r46) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C541110LKb.LJJJZ(com.ss.android.ugc.aweme.aigc.asynctask.AutoCutServerTaskInput, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01e1 A[Catch: all -> 0x022f, TryCatch #2 {all -> 0x022f, blocks: (B:121:0x022b, B:53:0x0125, B:55:0x012d, B:57:0x0131, B:59:0x013b, B:63:0x0142, B:67:0x014c, B:69:0x0154, B:73:0x015b, B:77:0x0165, B:79:0x0185, B:85:0x0190, B:86:0x0194, B:88:0x01a5, B:94:0x01b0, B:95:0x01b4, B:97:0x01c5, B:101:0x01cc, B:102:0x01d0, B:104:0x01e1, B:108:0x01e8, B:111:0x01f0, B:112:0x01ff, B:113:0x0203, B:115:0x0212, B:119:0x021c, B:120:0x0227), top: B:190:0x0125 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0154 A[Catch: all -> 0x022f, TryCatch #2 {all -> 0x022f, blocks: (B:121:0x022b, B:53:0x0125, B:55:0x012d, B:57:0x0131, B:59:0x013b, B:63:0x0142, B:67:0x014c, B:69:0x0154, B:73:0x015b, B:77:0x0165, B:79:0x0185, B:85:0x0190, B:86:0x0194, B:88:0x01a5, B:94:0x01b0, B:95:0x01b4, B:97:0x01c5, B:101:0x01cc, B:102:0x01d0, B:104:0x01e1, B:108:0x01e8, B:111:0x01f0, B:112:0x01ff, B:113:0x0203, B:115:0x0212, B:119:0x021c, B:120:0x0227), top: B:190:0x0125 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0185 A[Catch: all -> 0x022f, TryCatch #2 {all -> 0x022f, blocks: (B:121:0x022b, B:53:0x0125, B:55:0x012d, B:57:0x0131, B:59:0x013b, B:63:0x0142, B:67:0x014c, B:69:0x0154, B:73:0x015b, B:77:0x0165, B:79:0x0185, B:85:0x0190, B:86:0x0194, B:88:0x01a5, B:94:0x01b0, B:95:0x01b4, B:97:0x01c5, B:101:0x01cc, B:102:0x01d0, B:104:0x01e1, B:108:0x01e8, B:111:0x01f0, B:112:0x01ff, B:113:0x0203, B:115:0x0212, B:119:0x021c, B:120:0x0227), top: B:190:0x0125 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a5 A[Catch: all -> 0x022f, TryCatch #2 {all -> 0x022f, blocks: (B:121:0x022b, B:53:0x0125, B:55:0x012d, B:57:0x0131, B:59:0x013b, B:63:0x0142, B:67:0x014c, B:69:0x0154, B:73:0x015b, B:77:0x0165, B:79:0x0185, B:85:0x0190, B:86:0x0194, B:88:0x01a5, B:94:0x01b0, B:95:0x01b4, B:97:0x01c5, B:101:0x01cc, B:102:0x01d0, B:104:0x01e1, B:108:0x01e8, B:111:0x01f0, B:112:0x01ff, B:113:0x0203, B:115:0x0212, B:119:0x021c, B:120:0x0227), top: B:190:0x0125 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c5 A[Catch: all -> 0x022f, TryCatch #2 {all -> 0x022f, blocks: (B:121:0x022b, B:53:0x0125, B:55:0x012d, B:57:0x0131, B:59:0x013b, B:63:0x0142, B:67:0x014c, B:69:0x0154, B:73:0x015b, B:77:0x0165, B:79:0x0185, B:85:0x0190, B:86:0x0194, B:88:0x01a5, B:94:0x01b0, B:95:0x01b4, B:97:0x01c5, B:101:0x01cc, B:102:0x01d0, B:104:0x01e1, B:108:0x01e8, B:111:0x01f0, B:112:0x01ff, B:113:0x0203, B:115:0x0212, B:119:0x021c, B:120:0x0227), top: B:190:0x0125 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJL(X.C09JG r59, X.InterfaceC1364105Vn<? super kotlin.Unit> r60) {
        /*
            Method dump skipped, instruction units count: 904
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C541110LKb.LJJL(X.09JG, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJJZ(int r13, java.lang.String r14, X.InterfaceC1364105Vn<? super kotlin.Unit> r15) {
        /*
            r12 = this;
            r7 = r14
            r6 = r13
            boolean r0 = r15 instanceof X.C541180LKi
            r5 = r12
            if (r0 == 0) goto L94
            r10 = r15
            X.0LKi r10 = (X.C541180LKi) r10
            int r2 = r10.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L94
            int r2 = r2 - r1
            r10.LLILZIL = r2
        L15:
            java.lang.Object r2 = r10.LLILLL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r10.LLILZIL
            java.lang.String r3 = ", errorMsg="
            r1 = 1
            if (r0 == 0) goto L49
            if (r0 != r1) goto L9b
            int r6 = r10.LL
            java.lang.Object r7 = r10.LLILLJJLI
            java.lang.String r7 = (java.lang.String) r7
            X.C155000ia.LIZIZ(r2)
        L2d:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "polling retry exhausted, set failed. errorCode="
            r1.append(r0)
            r1.append(r6)
            r1.append(r3)
            r1.append(r7)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r5.LJJJJIZL(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L49:
            X.C155000ia.LIZIZ(r2)
            int r0 = r5.LJIILJJIL
            int r0 = r0 + 1
            r5.LJIILJJIL = r0
            int r2 = X.C541110LKb.LJIJ
            if (r0 > r2) goto L84
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "polling retryable error, continue checkstatus. retry="
            r1.append(r0)
            int r0 = r5.LJIILJJIL
            r1.append(r0)
            r0 = 47
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", errorCode="
            r1.append(r0)
            r1.append(r6)
            r1.append(r3)
            r1.append(r7)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r5.LJJJJIZL(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L84:
            r8 = 0
            r11 = 4
            r10.LLILLJJLI = r7
            r10.LL = r6
            r10.LLILZIL = r1
            r9 = r7
            java.lang.Object r0 = X.C539400LDm.LIZ(r5, r6, r7, r8, r9, r10, r11)
            if (r0 != r4) goto L2d
            return r4
        L94:
            X.0LKi r10 = new X.0LKi
            r10.<init>(r5, r15)
            goto L15
        L9b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C541110LKb.LJJJJZ(int, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJJLZIJ(int r16, java.lang.String r17, java.lang.String r18, X.InterfaceC1364105Vn<? super kotlin.Unit> r19) {
        /*
            r15 = this;
            r3 = r19
            r10 = r17
            r9 = r16
            r11 = r18
            boolean r0 = r3 instanceof X.C541190LKj
            r8 = r15
            if (r0 == 0) goto L82
            r13 = r3
            X.0LKj r13 = (X.C541190LKj) r13
            int r2 = r13.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L82
            int r2 = r2 - r1
            r13.LLILZIL = r2
        L1b:
            java.lang.Object r7 = r13.LLILLL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r13.LLILZIL
            java.lang.String r5 = ", errorCode: "
            java.lang.String r4 = ", errorMessage: "
            java.lang.String r3 = "AutoCut2MAETask"
            r6 = 2
            r1 = 1
            if (r0 == 0) goto L37
            if (r0 == r1) goto L90
            if (r0 != r6) goto L88
            X.C155000ia.LIZIZ(r7)
        L34:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L37:
            X.C155000ia.LIZIZ(r7)
            boolean r0 = X.C378010Erv.LIZ()
            if (r0 != 0) goto L42
            java.lang.String r11 = ""
        L42:
            int r0 = r8.LJIIJ
            if (r0 <= 0) goto L53
            r13.LLILLJJLI = r10
            r13.LL = r9
            r13.LLILZIL = r1
            java.lang.Object r0 = r8.LJJJLL(r13)
            if (r0 != r2) goto L99
            return r2
        L53:
            X.0LMx r7 = X.C541850LMx.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "final set task fail, quota: "
            r1.append(r0)
            int r0 = r8.LJIIJ
            r1.append(r0)
            r1.append(r4)
            r1.append(r10)
            r1.append(r5)
            r1.append(r9)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C201955140j.LIZLLL(r7, r3, r0)
            r12 = 0
            r14 = 8
            r13.LLILZIL = r6
            java.lang.Object r0 = X.C539400LDm.LIZ(r8, r9, r10, r11, r12, r13, r14)
            if (r0 != r2) goto L34
            return r2
        L82:
            X.0LKj r13 = new X.0LKj
            r13.<init>(r8, r3)
            goto L1b
        L88:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L90:
            int r9 = r13.LL
            java.lang.Object r10 = r13.LLILLJJLI
            java.lang.String r10 = (java.lang.String) r10
            X.C155000ia.LIZIZ(r7)
        L99:
            X.0LMx r2 = X.C541850LMx.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "retry left, quota: "
            r1.append(r0)
            int r0 = r8.LJIIJ
            r1.append(r0)
            r1.append(r4)
            r1.append(r10)
            r1.append(r5)
            r1.append(r9)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C201955140j.LIZLLL(r2, r3, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C541110LKb.LJJJLZIJ(int, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
