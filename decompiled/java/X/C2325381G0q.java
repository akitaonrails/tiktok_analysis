package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.1G0q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public class C2325381G0q implements InterfaceC346201Wa {
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
            default:
                return null;
        }
    }

    public C2325381G0q(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object collect$0(X.C2325381G0q r8, X.InterfaceC346701Wf r9, X.InterfaceC1364105Vn r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof X.C2250691D7j
            if (r0 == 0) goto L2b
            r6 = r10
            X.1D7j r6 = (X.C2250691D7j) r6
            int r2 = r6.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2b
            int r2 = r2 - r1
            r6.LLILLJJLI = r2
        L12:
            java.lang.Object r7 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLJJLI
            r2 = 3
            r4 = 2
            r1 = 1
            r3 = 0
            if (r0 == 0) goto L47
            if (r0 == r1) goto L3d
            if (r0 == r4) goto L9b
            if (r0 != r2) goto L35
            java.lang.Object r1 = r6.LLILZ
            njp.a r1 = (njp.a) r1
            goto L31
        L2b:
            X.1D7j r6 = new X.1D7j
            r6.<init>(r8, r10)
            goto L12
        L31:
            X.C155000ia.LIZIZ(r7)     // Catch: java.lang.Throwable -> L7d
            goto L75
        L35:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3d:
            X.01Wf r9 = r6.LLILZIL
            java.lang.Object r8 = r6.LLILZ
            X.1G0q r8 = (X.C2325381G0q) r8
            X.C155000ia.LIZIZ(r7)     // Catch: java.lang.Throwable -> L84
            goto L5b
        L47:
            X.C155000ia.LIZIZ(r7)
            java.lang.Object r0 = r8.l0     // Catch: java.lang.Throwable -> L82
            X.01Wa r0 = (X.InterfaceC346201Wa) r0     // Catch: java.lang.Throwable -> L82
            r6.LLILZ = r8     // Catch: java.lang.Throwable -> L82
            r6.LLILZIL = r9     // Catch: java.lang.Throwable -> L82
            r6.LLILLJJLI = r1     // Catch: java.lang.Throwable -> L82
            java.lang.Object r0 = r0.collect(r9, r6)     // Catch: java.lang.Throwable -> L82
            if (r0 != r5) goto L5b
            return r5
        L5b:
            X.09A4 r1 = new X.09A4
            kotlin.coroutines.CoroutineContext r0 = r6.getContext()
            r1.<init>(r9, r0)
            java.lang.Object r0 = r8.l1     // Catch: java.lang.Throwable -> L7b
            X.0sYq r0 = (X.InterfaceC1631620sYq) r0     // Catch: java.lang.Throwable -> L7b
            r6.LLILZ = r1     // Catch: java.lang.Throwable -> L7b
            r6.LLILZIL = r3     // Catch: java.lang.Throwable -> L7b
            r6.LLILLJJLI = r2     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r0 = r0.invoke(r1, r3, r6)     // Catch: java.lang.Throwable -> L7b
            if (r0 != r5) goto L75
            return r5
        L75:
            r1.releaseIntercepted()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L7b:
            r0 = move-exception
            goto L7e
        L7d:
            r0 = move-exception
        L7e:
            r1.releaseIntercepted()
            throw r0
        L82:
            r0 = move-exception
            goto L85
        L84:
            r0 = move-exception
        L85:
            X.095C r2 = new X.095C
            r2.<init>(r0)
            java.lang.Object r1 = r8.l1
            X.0sYq r1 = (X.InterfaceC1631620sYq) r1
            r6.LLILZ = r0
            r6.LLILZIL = r3
            r6.LLILLJJLI = r4
            java.lang.Object r1 = X.C2250661D7g.LIZ(r2, r1, r0, r6)
            if (r1 != r5) goto La2
            return r5
        L9b:
            java.lang.Object r0 = r6.LLILZ
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            X.C155000ia.LIZIZ(r7)
        La2:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2325381G0q.collect$0(X.1G0q, X.01Wf, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2, types: [njp.a] */
    /* JADX WARN: Type inference failed for: r2v6, types: [njp.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object collect$1(X.C2325381G0q r8, X.InterfaceC346701Wf r9, X.InterfaceC1364105Vn r10) {
        /*
            boolean r0 = r10 instanceof X.C2250701D7k
            if (r0 == 0) goto L27
            r6 = r10
            X.1D7k r6 = (X.C2250701D7k) r6
            int r2 = r6.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r6.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLJJLI
            r7 = 2
            r4 = 1
            if (r0 == 0) goto L39
            if (r0 == r4) goto L5c
            if (r0 != r7) goto L31
            java.lang.Object r2 = r6.LLILZ
            njp.a r2 = (njp.a) r2
            goto L2d
        L27:
            X.1D7k r6 = new X.1D7k
            r6.<init>(r8, r10)
            goto L12
        L2d:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L88
            goto L8d
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L39:
            X.C155000ia.LIZIZ(r1)
            X.013C r3 = new X.013C
            r3.<init>()
            r3.element = r4
            java.lang.Object r2 = r8.l0
            X.01Wa r2 = (X.InterfaceC346201Wa) r2
            Y.AgS212S0200000_30 r1 = new Y.AgS212S0200000_30
            r0 = 3
            r1.<init>(r3, r9, r0)
            r6.LLILZ = r8
            r6.LLILZIL = r9
            r6.LLILZLL = r3
            r6.LLILLJJLI = r4
            java.lang.Object r0 = r2.collect(r1, r6)
            if (r0 != r5) goto L67
            return r5
        L5c:
            X.013C r3 = r6.LLILZLL
            X.01Wf r9 = r6.LLILZIL
            java.lang.Object r8 = r6.LLILZ
            X.1G0q r8 = (X.C2325381G0q) r8
            X.C155000ia.LIZIZ(r1)
        L67:
            boolean r0 = r3.element
            if (r0 == 0) goto L90
            X.09A4 r2 = new X.09A4
            kotlin.coroutines.CoroutineContext r0 = r6.getContext()
            r2.<init>(r9, r0)
            java.lang.Object r1 = r8.l1     // Catch: java.lang.Throwable -> L88
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1     // Catch: java.lang.Throwable -> L88
            r6.LLILZ = r2     // Catch: java.lang.Throwable -> L88
            r0 = 0
            r6.LLILZIL = r0     // Catch: java.lang.Throwable -> L88
            r6.LLILZLL = r0     // Catch: java.lang.Throwable -> L88
            r6.LLILLJJLI = r7     // Catch: java.lang.Throwable -> L88
            java.lang.Object r0 = r1.invoke(r2, r6)     // Catch: java.lang.Throwable -> L88
            if (r0 != r5) goto L8d
            return r5
        L88:
            r0 = move-exception
            r2.releaseIntercepted()
            throw r0
        L8d:
            r2.releaseIntercepted()
        L90:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2325381G0q.collect$1(X.1G0q, X.01Wf, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object collect$2(X.C2325381G0q r7, X.InterfaceC346701Wf r8, X.InterfaceC1364105Vn r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof X.C2250711D7l
            if (r0 == 0) goto L68
            r6 = r9
            X.1D7l r6 = (X.C2250711D7l) r6
            int r2 = r6.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L68
            int r2 = r2 - r1
            r6.LLILLJJLI = r2
        L12:
            java.lang.Object r5 = r6.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LLILLJJLI
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L32
            if (r0 == r2) goto L28
            if (r0 != r3) goto L6e
            X.C155000ia.LIZIZ(r5)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.09A4 r1 = r6.LLILZLL
            X.01Wf r8 = r6.LLILZIL
            X.1G0q r7 = r6.LLILZ
            X.C155000ia.LIZIZ(r5)     // Catch: java.lang.Throwable -> L79
            goto L51
        L32:
            X.C155000ia.LIZIZ(r5)
            X.09A4 r1 = new X.09A4
            kotlin.coroutines.CoroutineContext r0 = r6.getContext()
            r1.<init>(r8, r0)
            java.lang.Object r0 = r7.l0     // Catch: java.lang.Throwable -> L77
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0     // Catch: java.lang.Throwable -> L77
            r6.LLILZ = r7     // Catch: java.lang.Throwable -> L77
            r6.LLILZIL = r8     // Catch: java.lang.Throwable -> L77
            r6.LLILZLL = r1     // Catch: java.lang.Throwable -> L77
            r6.LLILLJJLI = r2     // Catch: java.lang.Throwable -> L77
            java.lang.Object r0 = r0.invoke(r1, r6)     // Catch: java.lang.Throwable -> L77
            if (r0 != r4) goto L51
            goto L76
        L51:
            r1.releaseIntercepted()
            java.lang.Object r1 = r7.l1
            X.01Wa r1 = (X.InterfaceC346201Wa) r1
            r0 = 0
            r6.LLILZ = r0
            r6.LLILZIL = r0
            r6.LLILZLL = r0
            r6.LLILLJJLI = r3
            java.lang.Object r0 = r1.collect(r8, r6)
            if (r0 != r4) goto L25
            return r4
        L68:
            X.1D7l r6 = new X.1D7l
            r6.<init>(r7, r9)
            goto L12
        L6e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L76:
            return r4
        L77:
            r0 = move-exception
            goto L7a
        L79:
            r0 = move-exception
        L7a:
            r1.releaseIntercepted()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2325381G0q.collect$2(X.1G0q, X.01Wf, X.05Vn):java.lang.Object");
    }
}
