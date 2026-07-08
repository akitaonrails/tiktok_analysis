package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XqA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.android.live.rank.impl.page.presentation.CountdownCoordinator$startTicker$1", f = "CountdownCoordinator.kt", l = {117}, m = "invokeSuspend")
public final class C861040XqA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C861050XqB LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C861040XqA(C861050XqB c861050XqB, InterfaceC1364105Vn<? super C861040XqA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c861050XqB;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C861040XqA(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0066 A[Catch: all -> 0x00bd, TryCatch #1 {all -> 0x00bd, blocks: (B:14:0x0031, B:17:0x0043, B:19:0x004d, B:22:0x005a, B:24:0x0066, B:25:0x0091, B:11:0x0024, B:35:0x00be, B:26:0x0095), top: B:40:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095 A[Catch: all -> 0x00bd, TryCatch #1 {all -> 0x00bd, blocks: (B:14:0x0031, B:17:0x0043, B:19:0x004d, B:22:0x005a, B:24:0x0066, B:25:0x0091, B:11:0x0024, B:35:0x00be, B:26:0x0095), top: B:40:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ab  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x002e -> B:14:0x0031). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Throwable {
        /*
            r21 = this;
            java.lang.String r13 = "CountdownCoordinator@dd9e.startTicker$1"
            X.C1C7U.LIZ(r13)
            java.lang.Object r1 = X.C099R.LJFF()
            r2 = r21
            int r0 = r2.LL
            r5 = 1
            if (r0 == 0) goto L21
            if (r0 != r5) goto L19
            X.C155000ia.LIZIZ(r22)     // Catch: java.lang.Throwable -> L16
            goto L31
        L16:
            r3 = move-exception
            goto Lbe
        L19:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L21:
            X.C155000ia.LIZIZ(r22)
        L24:
            X.0XqB r0 = r2.LLILLJJLI     // Catch: java.lang.Throwable -> Lbd
            long r3 = r0.LIZIZ     // Catch: java.lang.Throwable -> Lbd
            r2.LL = r5     // Catch: java.lang.Throwable -> Lbd
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r3, r2)     // Catch: java.lang.Throwable -> Lbd
            if (r0 != r1) goto L31
            goto Lae
        L31:
            X.0XqB r0 = r2.LLILLJJLI     // Catch: java.lang.Throwable -> Lbd
            X.1DDq r0 = r0.LIZJ     // Catch: java.lang.Throwable -> Lbd
            java.lang.Object r14 = r0.getValue()     // Catch: java.lang.Throwable -> Lbd
            X.0XqC r14 = (X.C861060XqC) r14     // Catch: java.lang.Throwable -> Lbd
            java.lang.Long r5 = r14.LIZIZ     // Catch: java.lang.Throwable -> Lbd
            boolean r0 = r14.LJ     // Catch: java.lang.Throwable -> Lbd
            if (r0 == 0) goto Lb2
            if (r5 == 0) goto Lb2
            long r3 = r5.longValue()     // Catch: java.lang.Throwable -> Lbd
            r11 = 0
            int r0 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r0 <= 0) goto Lb2
            long r9 = r5.longValue()     // Catch: java.lang.Throwable -> Lbd
            r3 = 1
            long r9 = r9 - r3
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 >= 0) goto L5a
            r9 = 0
        L5a:
            X.0XrX r6 = r14.LIZ     // Catch: java.lang.Throwable -> Lbd
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> Lbd
            X.0XqB r0 = r2.LLILLJJLI     // Catch: java.lang.Throwable -> Lbd
            X.1DDq r3 = r0.LIZJ     // Catch: java.lang.Throwable -> Lbd
            if (r6 == 0) goto L95
            r15 = 0
            java.lang.Long r16 = X.C2286608xc.LJFF(r9)     // Catch: java.lang.Throwable -> Lbd
            java.util.Map<X.0XrX, java.lang.Long> r5 = r14.LIZJ     // Catch: java.lang.Throwable -> Lbd
            java.lang.Long r4 = X.C2286608xc.LJFF(r9)     // Catch: java.lang.Throwable -> Lbd
            kotlin.Pair r0 = new kotlin.Pair     // Catch: java.lang.Throwable -> Lbd
            r0.<init>(r6, r4)     // Catch: java.lang.Throwable -> Lbd
            java.util.Map r17 = X.C2097608Jq.LJIILIIL(r5, r0)     // Catch: java.lang.Throwable -> Lbd
            java.util.Map<X.0XrX, java.lang.Long> r5 = r14.LIZLLL     // Catch: java.lang.Throwable -> Lbd
            java.lang.Long r4 = X.C2286608xc.LJFF(r7)     // Catch: java.lang.Throwable -> Lbd
            kotlin.Pair r0 = new kotlin.Pair     // Catch: java.lang.Throwable -> Lbd
            r0.<init>(r6, r4)     // Catch: java.lang.Throwable -> Lbd
            java.util.Map r18 = X.C2097608Jq.LJIILIIL(r5, r0)     // Catch: java.lang.Throwable -> Lbd
            r19 = 0
            r20 = 17
            X.0XqC r0 = X.C861060XqC.LIZ(r14, r15, r16, r17, r18, r19, r20)     // Catch: java.lang.Throwable -> Lbd
        L91:
            r3.setValue(r0)     // Catch: java.lang.Throwable -> Lbd
            goto La7
        L95:
            r15 = 0
            java.lang.Long r16 = X.C2286608xc.LJFF(r9)     // Catch: java.lang.Throwable -> Lbd
            r19 = 0
            r20 = 29
            r17 = r15
            r18 = r15
            X.0XqC r0 = X.C861060XqC.LIZ(r14, r15, r16, r17, r18, r19, r20)     // Catch: java.lang.Throwable -> Lbd
            goto L91
        La7:
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 <= 0) goto Lb2
            r5 = 1
            goto L24
        Lae:
            X.C1C7U.LIZIZ(r13)
            return r1
        Lb2:
            X.0XqB r1 = r2.LLILLJJLI
            r0 = 0
            r1.LJ = r0
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r13)
            return r0
        Lbd:
            r3 = move-exception
        Lbe:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)     // Catch: java.lang.Throwable -> Lbd
            X.0XqB r1 = r2.LLILLJJLI
            r0 = 0
            r1.LJ = r0
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C861040XqA.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
