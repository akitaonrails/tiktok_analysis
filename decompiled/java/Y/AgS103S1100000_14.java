package Y;

import X.InterfaceC1364105Vn;
import X.InterfaceC346701Wf;

/* JADX INFO: loaded from: classes15.dex */
public class AgS103S1100000_14 implements InterfaceC346701Wf {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            case 2:
                return emit$2(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    public AgS103S1100000_14(InterfaceC346701Wf interfaceC346701Wf, String str, int i) {
        this.$t = i;
        this.l1 = interfaceC346701Wf;
        this.s0 = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$0(Y.AgS103S1100000_14 r5, java.lang.Object r6, X.InterfaceC1364105Vn r7) {
        /*
            boolean r0 = r7 instanceof X.C890800Yx4
            if (r0 == 0) goto L3b
            r4 = r7
            X.0Yx4 r4 = (X.C890800Yx4) r4
            int r2 = r4.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3b
            int r2 = r2 - r1
            r4.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLJJLI
            r2 = 1
            if (r0 == 0) goto L25
            if (r0 != r2) goto L41
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r1 = r5.l1
            X.01Wf r1 = (X.InterfaceC346701Wf) r1
            java.lang.String r0 = r5.s0
            X.0Ybb r0 = X.C877500Ybc.LIZ(r0)
            r4.LLILLJJLI = r2
            java.lang.Object r0 = r1.emit(r0, r4)
            if (r0 != r3) goto L22
            return r3
        L3b:
            X.0Yx4 r4 = new X.0Yx4
            r4.<init>(r5, r7)
            goto L12
        L41:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS103S1100000_14.emit$0(Y.AgS103S1100000_14, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$1(Y.AgS103S1100000_14 r8, java.lang.Object r9, X.InterfaceC1364105Vn r10) {
        /*
            boolean r0 = r10 instanceof X.C0YX1
            if (r0 == 0) goto L58
            r7 = r10
            X.0YX1 r7 = (X.C0YX1) r7
            int r2 = r7.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L58
            int r2 = r2 - r1
            r7.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r7.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILLJJLI
            r5 = 1
            if (r0 == 0) goto L25
            if (r0 != r5) goto L5e
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r4 = r8.l1
            X.01Wf r4 = (X.InterfaceC346701Wf) r4
            java.util.List r9 = (java.util.List) r9
            java.util.Iterator r3 = r9.iterator()
        L32:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L56
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.0YX2 r0 = (X.C0YX2) r0
            X.0Y8T r0 = r0.LIZ
            java.lang.String r1 = r0.getConversationId()
            java.lang.String r0 = r8.s0
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L32
        L4d:
            r7.LLILLJJLI = r5
            java.lang.Object r0 = r4.emit(r2, r7)
            if (r0 != r6) goto L22
            return r6
        L56:
            r2 = 0
            goto L4d
        L58:
            X.0YX1 r7 = new X.0YX1
            r7.<init>(r8, r10)
            goto L12
        L5e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS103S1100000_14.emit$1(Y.AgS103S1100000_14, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$2(Y.AgS103S1100000_14 r7, java.lang.Object r8, X.InterfaceC1364105Vn r9) {
        /*
            boolean r0 = r9 instanceof X.C892970Z1j
            if (r0 == 0) goto L4d
            r6 = r9
            X.0Z1j r6 = (X.C892970Z1j) r6
            int r2 = r6.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4d
            int r2 = r2 - r1
            r6.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLJJLI
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L28
            if (r0 == r3) goto L3c
            if (r0 != r4) goto L53
            X.C155000ia.LIZIZ(r1)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r2 = r7.l1
            X.01Wf r2 = (X.InterfaceC346701Wf) r2
            java.lang.String r0 = r7.s0
            r6.LLILLL = r2
            r6.LLILLJJLI = r3
            java.lang.Object r1 = X.C891080YxW.LIZ(r0, r6)
            if (r1 != r5) goto L41
            return r5
        L3c:
            X.01Wf r2 = r6.LLILLL
            X.C155000ia.LIZIZ(r1)
        L41:
            r0 = 0
            r6.LLILLL = r0
            r6.LLILLJJLI = r4
            java.lang.Object r0 = r2.emit(r1, r6)
            if (r0 != r5) goto L25
            return r5
        L4d:
            X.0Z1j r6 = new X.0Z1j
            r6.<init>(r7, r9)
            goto L12
        L53:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS103S1100000_14.emit$2(Y.AgS103S1100000_14, java.lang.Object, X.05Vn):java.lang.Object");
    }
}
