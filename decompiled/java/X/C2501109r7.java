package X;

import Y.AgS194S0200000_3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.09r7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2501109r7 implements InterfaceC346201Wa {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC346201Wa
    public final Object collect(InterfaceC346701Wf<Object> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return collect$0(this, interfaceC346701Wf, interfaceC1364105Vn);
            case 1:
                return collect$1(this, interfaceC346701Wf, interfaceC1364105Vn);
            case 2:
                return collect$2(this, interfaceC346701Wf, interfaceC1364105Vn);
            case 3:
                return collect$3(this, interfaceC346701Wf, interfaceC1364105Vn);
            case 4:
                return collect$4(this, interfaceC346701Wf, interfaceC1364105Vn);
            case 5:
                return collect$5(this, interfaceC346701Wf, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    public C2501109r7(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object collect$0(X.C2501109r7 r6, X.InterfaceC346701Wf r7, X.InterfaceC1364105Vn r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof X.C09IX
            if (r0 == 0) goto L57
            r5 = r8
            X.09IX r5 = (X.C09IX) r5
            int r2 = r5.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L57
            int r2 = r2 - r1
            r5.LLILLJJLI = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLJJLI
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L28
            if (r0 == r1) goto L3c
            if (r0 != r2) goto L5d
            X.C155000ia.LIZIZ(r4)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r4)
            java.lang.Object r0 = r6.l0
            X.01Wa r0 = (X.InterfaceC346201Wa) r0
            r5.LLILZ = r6
            r5.LLILZIL = r7
            r5.LLILLJJLI = r1
            java.lang.Object r4 = X.C09IC.LJFF(r5, r0, r7)
            if (r4 != r3) goto L43
            return r3
        L3c:
            X.01Wf r7 = r5.LLILZIL
            X.09r7 r6 = r5.LLILZ
            X.C155000ia.LIZIZ(r4)
        L43:
            if (r4 == 0) goto L25
            java.lang.Object r1 = r6.l1
            X.0sYq r1 = (X.InterfaceC1631620sYq) r1
            r0 = 0
            r5.LLILZ = r0
            r5.LLILZIL = r0
            r5.LLILLJJLI = r2
            java.lang.Object r0 = r1.invoke(r7, r4, r5)
            if (r0 != r3) goto L25
            return r3
        L57:
            X.09IX r5 = new X.09IX
            r5.<init>(r6, r8)
            goto L12
        L5d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2501109r7.collect$0(X.09r7, X.01Wf, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (1 == 0) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x007e -> B:12:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object collect$1(X.C2501109r7 r9, X.InterfaceC346701Wf r10, X.InterfaceC1364105Vn r11) throws java.lang.Throwable {
        /*
            boolean r0 = r11 instanceof X.C09IY
            if (r0 == 0) goto L81
            r7 = r11
            X.09IY r7 = (X.C09IY) r7
            int r2 = r7.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L81
            int r2 = r2 - r1
            r7.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r7.LL
            java.lang.Object r8 = X.C099R.LJFF()
            int r0 = r7.LLILLJJLI
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L3f
            if (r0 == r5) goto L5a
            if (r0 != r6) goto L88
            long r2 = r7.LLIZ
            java.lang.Object r4 = r7.LLILZLL
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            X.01Wf r10 = r7.LLILZIL
            X.09r7 r9 = r7.LLILZ
            X.C155000ia.LIZIZ(r1)
        L2f:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto L87
            r0 = 1
            long r2 = r2 + r0
            if (r5 != 0) goto L44
        L3c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3f:
            X.C155000ia.LIZIZ(r1)
            r2 = 0
        L44:
            java.lang.Object r1 = r9.l0
            X.01Wa r1 = (X.InterfaceC346201Wa) r1
            r7.LLILZ = r9
            r7.LLILZIL = r10
            r0 = 0
            r7.LLILZLL = r0
            r7.LLIZ = r2
            r7.LLILLJJLI = r5
            java.lang.Object r1 = X.C09IC.LJFF(r7, r1, r10)
            if (r1 != r8) goto L63
            return r8
        L5a:
            long r2 = r7.LLIZ
            X.01Wf r10 = r7.LLILZIL
            X.09r7 r9 = r7.LLILZ
            X.C155000ia.LIZIZ(r1)
        L63:
            r4 = r1
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            if (r4 == 0) goto L3c
            java.lang.Object r1 = r9.l1
            X.0sYr r1 = (X.InterfaceC1631630sYr) r1
            java.lang.Long r0 = X.C2286608xc.LJFF(r2)
            r7.LLILZ = r9
            r7.LLILZIL = r10
            r7.LLILZLL = r4
            r7.LLIZ = r2
            r7.LLILLJJLI = r6
            java.lang.Object r1 = r1.invoke(r10, r4, r0, r7)
            if (r1 != r8) goto L2f
            return r8
        L81:
            X.09IY r7 = new X.09IY
            r7.<init>(r9, r11)
            goto L12
        L87:
            throw r4
        L88:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2501109r7.collect$1(X.09r7, X.01Wf, X.05Vn):java.lang.Object");
    }

    public static final Object collect$2(C2501109r7 c2501109r7, InterfaceC346701Wf interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object objCollect = ((InterfaceC346201Wa) c2501109r7.l0).collect(new AgS194S0200000_3(interfaceC346701Wf, (Function2) c2501109r7.l1, 6), interfaceC1364105Vn);
        if (objCollect == C099R.LJFF()) {
            return objCollect;
        }
        return Unit.LIZ;
    }

    public static final Object collect$3(C2501109r7 c2501109r7, InterfaceC346701Wf interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object objCollect = ((InterfaceC346201Wa) c2501109r7.l0).collect(new AgS194S0200000_3(interfaceC346701Wf, (C2276108vv) c2501109r7.l1, 9), interfaceC1364105Vn);
        if (objCollect == C099R.LJFF()) {
            return objCollect;
        }
        return Unit.LIZ;
    }

    public static final Object collect$4(C2501109r7 c2501109r7, InterfaceC346701Wf interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object objCollect = ((InterfaceC346201Wa) c2501109r7.l0).collect(new AgS194S0200000_3(interfaceC346701Wf, (C2274008va) c2501109r7.l1, 11), interfaceC1364105Vn);
        if (objCollect == C099R.LJFF()) {
            return objCollect;
        }
        return Unit.LIZ;
    }

    public static final Object collect$5(C2501109r7 c2501109r7, InterfaceC346701Wf interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object objCollect = ((InterfaceC346201Wa) c2501109r7.l0).collect(new AgS194S0200000_3(interfaceC346701Wf, (C2256008sg) c2501109r7.l1, 12), interfaceC1364105Vn);
        if (objCollect == C099R.LJFF()) {
            return objCollect;
        }
        return Unit.LIZ;
    }
}
