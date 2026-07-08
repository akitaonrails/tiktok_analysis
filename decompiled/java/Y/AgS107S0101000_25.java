package Y;

import X.InterfaceC1364105Vn;
import X.InterfaceC346701Wf;

/* JADX INFO: loaded from: classes26.dex */
public class AgS107S0101000_25 implements InterfaceC346701Wf {
    public final int $t;
    public int i1;
    public Object l0;

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

    public AgS107S0101000_25(InterfaceC346701Wf interfaceC346701Wf, int i, int i2) {
        this.$t = i2;
        this.l0 = interfaceC346701Wf;
        this.i1 = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$0(Y.AgS107S0101000_25 r9, java.lang.Object r10, X.InterfaceC1364105Vn r11) {
        /*
            boolean r0 = r11 instanceof X.C1661850tLb
            if (r0 == 0) goto L6a
            r7 = r11
            X.0tLb r7 = (X.C1661850tLb) r7
            int r2 = r7.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6a
            int r2 = r2 - r1
            r7.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r7.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILLJJLI
            r8 = 1
            if (r0 == 0) goto L25
            if (r0 != r8) goto L70
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r5 = r9.l0
            X.01Wf r5 = (X.InterfaceC346701Wf) r5
            java.util.List r10 = (java.util.List) r10
            java.util.Iterator r4 = r10.iterator()
        L32:
            boolean r0 = r4.hasNext()
            r3 = 0
            r2 = 0
            if (r0 == 0) goto L4f
            java.lang.Object r2 = r4.next()
            r0 = r2
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r0 = r0.getFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            int r0 = r9.i1
            if (r1 != r0) goto L32
        L4f:
            kotlin.Pair r2 = (kotlin.Pair) r2
            if (r2 == 0) goto L5d
            java.lang.Object r0 = r2.getSecond()
            X.0tLg r0 = (X.C1661900tLg) r0
            if (r0 == 0) goto L5d
            boolean r3 = r0.LIZJ
        L5d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r7.LLILLJJLI = r8
            java.lang.Object r0 = r5.emit(r0, r7)
            if (r0 != r6) goto L22
            return r6
        L6a:
            X.0tLb r7 = new X.0tLb
            r7.<init>(r9, r11)
            goto L12
        L70:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS107S0101000_25.emit$0(Y.AgS107S0101000_25, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$1(Y.AgS107S0101000_25 r8, java.lang.Object r9, X.InterfaceC1364105Vn r10) {
        /*
            boolean r0 = r10 instanceof X.C1661870tLd
            if (r0 == 0) goto L6b
            r6 = r10
            X.0tLd r6 = (X.C1661870tLd) r6
            int r2 = r6.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6b
            int r2 = r2 - r1
            r6.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLJJLI
            r7 = 1
            if (r0 == 0) goto L25
            if (r0 != r7) goto L71
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r4 = r8.l0
            X.01Wf r4 = (X.InterfaceC346701Wf) r4
            java.util.List r9 = (java.util.List) r9
            java.util.Iterator r3 = r9.iterator()
        L32:
            boolean r0 = r3.hasNext()
            r2 = 0
            if (r0 == 0) goto L4e
            java.lang.Object r2 = r3.next()
            r0 = r2
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r0 = r0.getFirst()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            int r0 = r8.i1
            if (r1 != r0) goto L32
        L4e:
            kotlin.Pair r2 = (kotlin.Pair) r2
            if (r2 == 0) goto L69
            java.lang.Object r0 = r2.getSecond()
            X.0tLg r0 = (X.C1661900tLg) r0
            if (r0 == 0) goto L69
            boolean r0 = r0.LIZIZ
        L5c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.LLILLJJLI = r7
            java.lang.Object r0 = r4.emit(r0, r6)
            if (r0 != r5) goto L22
            return r5
        L69:
            r0 = 1
            goto L5c
        L6b:
            X.0tLd r6 = new X.0tLd
            r6.<init>(r8, r10)
            goto L12
        L71:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS107S0101000_25.emit$1(Y.AgS107S0101000_25, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$2(Y.AgS107S0101000_25 r5, java.lang.Object r6, X.InterfaceC1364105Vn r7) {
        /*
            boolean r0 = r7 instanceof X.C1661890tLf
            if (r0 == 0) goto L45
            r4 = r7
            X.0tLf r4 = (X.C1661890tLf) r4
            int r2 = r4.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L45
            int r2 = r2 - r1
            r4.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLJJLI
            r2 = 1
            if (r0 == 0) goto L25
            if (r0 != r2) goto L4b
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r1 = r5.l0
            X.01Wf r1 = (X.InterfaceC346701Wf) r1
            java.util.Set r6 = (java.util.Set) r6
            int r0 = r5.i1
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
            boolean r0 = r6.contains(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.LLILLJJLI = r2
            java.lang.Object r0 = r1.emit(r0, r4)
            if (r0 != r3) goto L22
            return r3
        L45:
            X.0tLf r4 = new X.0tLf
            r4.<init>(r5, r7)
            goto L12
        L4b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS107S0101000_25.emit$2(Y.AgS107S0101000_25, java.lang.Object, X.05Vn):java.lang.Object");
    }
}
