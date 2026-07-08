package X;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05KC, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05KC<T> {
    public final InterfaceC497601wk LIZ;
    public final Function2<T, InterfaceC1364105Vn<? super T>, Object> LIZIZ;
    public final C2252321DDq LIZJ;
    public final C1DEV LIZLLL;
    public final AtomicLong LJ;
    public long LJFF;
    public volatile boolean LJI;
    public final AnonymousClass0951 LJII;

    /* JADX WARN: Can't wrap try/catch for region: R(13:(1:(1:(9:11|62|33|34|39|(1:41)|(1:43)|44|45)(2:13|14))(1:15))(2:16|(2:18|19)(2:20|(1:22)))|58|23|(2:27|(3:29|44|45))|54|30|(1:32)|34|39|(0)|(0)|44|45) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0090, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a5 A[Catch: all -> 0x00b2, TRY_LEAVE, TryCatch #1 {all -> 0x00b2, blocks: (B:39:0x009c, B:43:0x00a5, B:38:0x0091), top: B:56:0x0091 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super T> r14) throws java.lang.Throwable {
        /*
            r13 = this;
            boolean r0 = r14 instanceof X.C1329205Ic
            if (r0 == 0) goto L2a
            r11 = r14
            X.05Ic r11 = (X.C1329205Ic) r11
            int r2 = r11.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2a
            int r2 = r2 - r1
            r11.LLILZLL = r2
        L12:
            java.lang.Object r1 = r11.LLILZ
            java.lang.Object r12 = X.C099R.LJFF()
            int r0 = r11.LLILZLL
            r8 = 0
            r10 = 2
            r9 = 1
            if (r0 == 0) goto L42
            if (r0 == r9) goto L38
            if (r0 != r10) goto L30
            long r2 = r11.LLILLL
            java.lang.Object r7 = r11.LL
            X.01eN r7 = (X.InterfaceC383701eN) r7
            goto L87
        L2a:
            X.05Ic r11 = new X.05Ic
            r11.<init>(r13, r14)
            goto L12
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L38:
            X.1DEV r7 = r11.LLILLJJLI
            java.lang.Object r6 = r11.LL
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            X.C155000ia.LIZIZ(r1)
            goto L5f
        L42:
            X.C155000ia.LIZIZ(r1)
            kotlin.jvm.functions.Function2<T, X.05Vn<? super T>, java.lang.Object> r6 = r13.LIZIZ
            if (r6 != 0) goto L50
            X.1DDq r0 = r13.LIZJ
            java.lang.Object r0 = r0.getValue()
            return r0
        L50:
            X.1DEV r7 = r13.LIZLLL
            r11.LL = r6
            r11.LLILLJJLI = r7
            r11.LLILZLL = r9
            java.lang.Object r0 = r7.LIZLLL(r8, r11)
            if (r0 != r12) goto L5f
            return r12
        L5f:
            java.util.concurrent.atomic.AtomicLong r0 = r13.LJ     // Catch: java.lang.Throwable -> Lb4
            long r2 = r0.get()     // Catch: java.lang.Throwable -> Lb4
            X.1DDq r0 = r13.LIZJ     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Throwable -> Lb4
            if (r1 == 0) goto L78
            long r4 = r13.LJFF     // Catch: java.lang.Throwable -> Lb4
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 < 0) goto L78
            boolean r0 = r13.LJI     // Catch: java.lang.Throwable -> Lb4
            if (r0 == 0) goto L78
            goto Lae
        L78:
            r11.LL = r7     // Catch: java.lang.Throwable -> L90
            r11.LLILLJJLI = r8     // Catch: java.lang.Throwable -> L90
            r11.LLILLL = r2     // Catch: java.lang.Throwable -> L90
            r11.LLILZLL = r10     // Catch: java.lang.Throwable -> L90
            java.lang.Object r1 = r6.invoke(r1, r11)     // Catch: java.lang.Throwable -> L90
            if (r1 != r12) goto L8a
            return r12
        L87:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L8e
        L8a:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L8e
            goto L9c
        L8e:
            r0 = move-exception
            goto L91
        L90:
            r0 = move-exception
        L91:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> Lb2
            X.00Yq r1 = new X.00Yq     // Catch: java.lang.Throwable -> Lb2
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lb2
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> Lb2
        L9c:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)     // Catch: java.lang.Throwable -> Lb2
            if (r0 == 0) goto La3
            r1 = r8
        La3:
            if (r1 == 0) goto Lae
            X.1DDq r0 = r13.LIZJ     // Catch: java.lang.Throwable -> Lb2
            r0.setValue(r1)     // Catch: java.lang.Throwable -> Lb2
            r13.LJI = r9     // Catch: java.lang.Throwable -> Lb2
            r13.LJFF = r2     // Catch: java.lang.Throwable -> Lb2
        Lae:
            r7.LIZIZ(r8)
            return r1
        Lb2:
            r0 = move-exception
            goto Lb5
        Lb4:
            r0 = move-exception
        Lb5:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> Lb9
            goto Lbb
        Lb9:
            r0 = move-exception
            goto Lb5
        Lbb:
            r7.LIZIZ(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05KC.LIZ(X.05Vn):java.lang.Object");
    }

    public final void LIZIZ(T t) {
        this.LIZJ.setValue(t);
        this.LJFF = this.LJ.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C05KC(InterfaceC497601wk interfaceC497601wk, Function2<? super T, ? super InterfaceC1364105Vn<? super T>, ? extends Object> function2) {
        this.LIZ = interfaceC497601wk;
        this.LIZIZ = function2;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(null);
        this.LIZJ = c2252321DDqLIZ;
        this.LIZLLL = C2191201ApK.LIZ();
        this.LJ = new AtomicLong(0L);
        this.LJII = C09IC.LIZIZ(c2252321DDqLIZ);
    }
}
