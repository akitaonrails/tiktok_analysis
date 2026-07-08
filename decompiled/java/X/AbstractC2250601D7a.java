package X;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS614S0100000_35;

/* JADX INFO: renamed from: X.1D7a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public abstract class AbstractC2250601D7a<T, R> extends AbstractC328380Cu4<R> {
    public Function2<? super T, ? super InterfaceC1364105Vn<? super Boolean>, ? extends Object> LIZIZ;
    public Function2<? super List<? extends T>, ? super InterfaceC1364105Vn<? super List<? extends T>>, ? extends Object> LIZJ;
    public Function2<? super R, ? super InterfaceC1364105Vn<? super Boolean>, ? extends Object> LIZLLL;
    public int LJ;
    public volatile boolean LJFF;

    public abstract Function1<T, R> LIZJ();

    public abstract Object LJ(InterfaceC1364105Vn<? super List<T>> interfaceC1364105Vn);

    public abstract Object LJI(InterfaceC1364105Vn<? super List<T>> interfaceC1364105Vn);

    public AbstractC2250601D7a() {
        C1DFB c1dfb = C0PEM.LIZJ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        this.LJ = -1;
        new AwS614S0100000_35((AbstractC2250601D7a) this, 33);
        this.LJFF = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.InterfaceC1364105Vn<? super java.util.List<R>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C2250621D7c
            if (r0 == 0) goto L49
            r5 = r7
            X.1D7c r5 = (X.C2250621D7c) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L49
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r4 = r5.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r1 = r5.LLILZ
            r2 = 2
            r0 = 1
            if (r1 == 0) goto L26
            if (r1 == r0) goto L36
            if (r1 != r2) goto L4f
            X.C155000ia.LIZIZ(r4)
        L25:
            return r4
        L26:
            X.C155000ia.LIZIZ(r4)
            r5.LL = r6
            r5.LLILZ = r0
            java.lang.Object r4 = r6.LJ(r5)
            if (r4 != r3) goto L34
            return r3
        L34:
            r1 = r6
            goto L3b
        L36:
            X.1D7a r1 = r5.LL
            X.C155000ia.LIZIZ(r4)
        L3b:
            java.util.List r4 = (java.util.List) r4
            r0 = 0
            r5.LL = r0
            r5.LLILZ = r2
            java.lang.Object r4 = r1.LJII(r4, r5)
            if (r4 != r3) goto L25
            return r3
        L49:
            X.1D7c r5 = new X.1D7c
            r5.<init>(r6, r7)
            goto L12
        L4f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC2250601D7a.LIZLLL(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.InterfaceC1364105Vn<? super java.util.List<R>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C2250631D7d
            if (r0 == 0) goto L49
            r5 = r7
            X.1D7d r5 = (X.C2250631D7d) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L49
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r4 = r5.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r1 = r5.LLILZ
            r2 = 2
            r0 = 1
            if (r1 == 0) goto L26
            if (r1 == r0) goto L36
            if (r1 != r2) goto L4f
            X.C155000ia.LIZIZ(r4)
        L25:
            return r4
        L26:
            X.C155000ia.LIZIZ(r4)
            r5.LL = r6
            r5.LLILZ = r0
            java.lang.Object r4 = r6.LJI(r5)
            if (r4 != r3) goto L34
            return r3
        L34:
            r1 = r6
            goto L3b
        L36:
            X.1D7a r1 = r5.LL
            X.C155000ia.LIZIZ(r4)
        L3b:
            java.util.List r4 = (java.util.List) r4
            r0 = 0
            r5.LL = r0
            r5.LLILZ = r2
            java.lang.Object r4 = r1.LJII(r4, r5)
            if (r4 != r3) goto L25
            return r3
        L49:
            X.1D7d r5 = new X.1D7d
            r5.<init>(r6, r7)
            goto L12
        L4f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC2250601D7a.LJFF(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(java.util.List<T> r13, X.InterfaceC1364105Vn<? super java.util.List<R>> r14) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC2250601D7a.LJII(java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.util.List r8, X.InterfaceC1364105Vn r9, kotlin.jvm.functions.Function2 r10) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C1D7Y
            if (r0 == 0) goto L68
            r6 = r9
            X.1D7Y r6 = (X.C1D7Y) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L68
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r5 = r6.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L43
            if (r0 != r2) goto L6f
            java.lang.Object r8 = r6.LL
            X.C155000ia.LIZIZ(r5)
        L25:
            java.util.List r5 = (java.util.List) r5
        L27:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "finish collating list size: "
            r1.append(r0)
            if (r5 == 0) goto L3a
            int r0 = r5.size()
            java.lang.Integer r3 = X.C2286608xc.LJ(r0)
        L3a:
            r1.append(r3)
            X.C2188811AlT.LIZIZ(r1)
            if (r5 == 0) goto L6e
            return r5
        L43:
            X.C155000ia.LIZIZ(r5)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Start collating list size: "
            r1.append(r0)
            int r0 = r8.size()
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            if (r10 == 0) goto L66
            r6.LL = r8
            r6.LLILZ = r2
            java.lang.Object r5 = r10.invoke(r8, r6)
            if (r5 != r4) goto L25
            return r4
        L66:
            r5 = r3
            goto L27
        L68:
            X.1D7Y r6 = new X.1D7Y
            r6.<init>(r7, r9)
            goto L12
        L6e:
            return r8
        L6f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC2250601D7a.LIZ(java.util.List, X.05Vn, kotlin.jvm.functions.Function2):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0051 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.util.List r8, X.InterfaceC1364105Vn r9, kotlin.jvm.functions.Function2 r10) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C1D7Z
            if (r0 == 0) goto L76
            r5 = r9
            X.1D7Z r5 = (X.C1D7Z) r5
            int r2 = r5.LLIZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L76
            int r2 = r2 - r1
            r5.LLIZ = r2
        L12:
            java.lang.Object r0 = r5.LLILZIL
            java.lang.Object r6 = X.C099R.LJFF()
            int r1 = r5.LLIZ
            r4 = 1
            if (r1 == 0) goto L54
            if (r1 != r4) goto L7c
            java.lang.Object r1 = r5.LLILZ
            java.lang.Object r3 = r5.LLILLL
            java.util.Iterator r3 = (java.util.Iterator) r3
            java.lang.Object r2 = r5.LLILLJJLI
            java.util.Collection r2 = (java.util.Collection) r2
            kotlin.jvm.functions.Function2 r10 = r5.LL
            X.C155000ia.LIZIZ(r0)
        L2e:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L39
            r2.add(r1)
        L39:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L84
            java.lang.Object r1 = r3.next()
            r5.LL = r10
            r5.LLILLJJLI = r2
            r5.LLILLL = r3
            r5.LLILZ = r1
            r5.LLIZ = r4
            java.lang.Object r0 = r10.invoke(r1, r5)
            if (r0 != r6) goto L2e
            return r6
        L54:
            X.C155000ia.LIZIZ(r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Start filtering list size: "
            r1.append(r0)
            int r0 = r8.size()
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            if (r10 == 0) goto L8a
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r8.iterator()
            goto L39
        L76:
            X.1D7Z r5 = new X.1D7Z
            r5.<init>(r7, r9)
            goto L12
        L7c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L84:
            r8 = r2
            java.util.List r8 = (java.util.List) r8
            r8.size()
        L8a:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC2250601D7a.LIZIZ(java.util.List, X.05Vn, kotlin.jvm.functions.Function2):java.lang.Object");
    }
}
