package Y;

import X.InterfaceC1364105Vn;
import X.InterfaceC346701Wf;

/* JADX INFO: loaded from: classes35.dex */
public class AgS312S0100000_34 implements InterfaceC346701Wf {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    public AgS312S0100000_34(InterfaceC346701Wf interfaceC346701Wf, int i) {
        this.$t = i;
        this.l0 = interfaceC346701Wf;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$0(Y.AgS312S0100000_34 r5, java.lang.Object r6, X.InterfaceC1364105Vn r7) {
        /*
            boolean r0 = r7 instanceof X.C2192961AsA
            if (r0 == 0) goto L3d
            r4 = r7
            X.1AsA r4 = (X.C2192961AsA) r4
            int r2 = r4.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3d
            int r2 = r2 - r1
            r4.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLJJLI
            r2 = 1
            if (r0 == 0) goto L25
            if (r0 != r2) goto L43
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r1 = r5.l0
            X.01Wf r1 = (X.InterfaceC346701Wf) r1
            X.1AsK r6 = (X.C2193061AsK) r6
            if (r6 == 0) goto L3b
            X.12Dr r0 = r6.LIZ
        L32:
            r4.LLILLJJLI = r2
            java.lang.Object r0 = r1.emit(r0, r4)
            if (r0 != r3) goto L22
            return r3
        L3b:
            r0 = 0
            goto L32
        L3d:
            X.1AsA r4 = new X.1AsA
            r4.<init>(r5, r7)
            goto L12
        L43:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS312S0100000_34.emit$0(Y.AgS312S0100000_34, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$1(Y.AgS312S0100000_34 r5, java.lang.Object r6, X.InterfaceC1364105Vn r7) {
        /*
            boolean r0 = r7 instanceof X.C2192981AsC
            if (r0 == 0) goto L41
            r4 = r7
            X.1AsC r4 = (X.C2192981AsC) r4
            int r2 = r4.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L41
            int r2 = r2 - r1
            r4.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLJJLI
            r2 = 1
            if (r0 == 0) goto L25
            if (r0 != r2) goto L47
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r1 = r5.l0
            X.01Wf r1 = (X.InterfaceC346701Wf) r1
            X.0943 r6 = (X.AnonymousClass0943) r6
            boolean r0 = r6 instanceof X.AnonymousClass0945
            if (r0 == 0) goto L3f
            X.0945 r6 = (X.AnonymousClass0945) r6
            X.12Dr r0 = r6.LIZ
        L36:
            r4.LLILLJJLI = r2
            java.lang.Object r0 = r1.emit(r0, r4)
            if (r0 != r3) goto L22
            return r3
        L3f:
            r0 = 0
            goto L36
        L41:
            X.1AsC r4 = new X.1AsC
            r4.<init>(r5, r7)
            goto L12
        L47:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS312S0100000_34.emit$1(Y.AgS312S0100000_34, java.lang.Object, X.05Vn):java.lang.Object");
    }
}
