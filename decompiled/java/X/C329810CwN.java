package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CwN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "androidx.core.telecom.CallsManager$pauseExecutionUntilCallIsReadyOrTimeout$2", f = "CallsManager.kt", l = {577}, m = "invokeSuspend")
public final class C329810CwN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C259800zU<AbstractC1302730k0N> LLILLL;
    public final /* synthetic */ C05XL<AbstractC1302730k0N> LLILZ;
    public final /* synthetic */ C05XL<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C329810CwN(C259800zU<AbstractC1302730k0N> c259800zU, C05XL<AbstractC1302730k0N> c05xl, C05XL<Unit> c05xl2, InterfaceC1364105Vn<? super C329810CwN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c259800zU;
        this.LLILZ = c05xl;
        this.LLILZIL = c05xl2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C329810CwN c329810CwN = new C329810CwN(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c329810CwN.LLILLJJLI = obj;
        return c329810CwN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b A[PHI: r0
      0x004b: PHI (r0v12 int) = (r0v11 int), (r0v13 int), (r0v14 int), (r0v15 int), (r0v16 int) binds: [B:12:0x0039, B:14:0x003c, B:16:0x003f, B:18:0x0042, B:20:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LL
            r3 = 1
            if (r0 == 0) goto L4d
            if (r0 != r3) goto L7e
            java.lang.Object r1 = r5.LLILLJJLI
            X.00zU r1 = (X.C259800zU) r1
            X.C155000ia.LIZIZ(r6)
        L12:
            r1.element = r6
            X.00zU<X.0k0N> r0 = r5.LLILLL
            T r0 = r0.element
            boolean r0 = r0 instanceof X.C1302710k0L
            if (r0 == 0) goto L7b
            X.05XL<kotlin.Unit> r1 = r5.LLILZIL
            if (r1 == 0) goto L29
            kotlin.Unit r0 = kotlin.Unit.LIZ
            boolean r0 = r1.LJIIZILJ(r0)
            java.lang.Boolean.valueOf(r0)
        L29:
            X.00zU<X.0k0N> r0 = r5.LLILLL
            T r1 = r0.element
            X.0k0L r1 = (X.C1302710k0L) r1
            X.0CwP r2 = new X.0CwP
            X.0CwO r0 = X.C329830CwP.Companion
            int r1 = r1.LIZ
            r0.getClass()
            r0 = 2
            if (r1 == r0) goto L4b
            r0 = 3
            if (r1 == r0) goto L4b
            r0 = 4
            if (r1 == r0) goto L4b
            r0 = 5
            if (r1 == r0) goto L4b
            r0 = 6
            if (r1 == r0) goto L4b
        L47:
            r2.<init>(r3)
            throw r2
        L4b:
            r3 = r0
            goto L47
        L4d:
            X.C155000ia.LIZIZ(r6)
            java.lang.Object r2 = r5.LLILLJJLI
            X.01wk r2 = (X.InterfaceC497601wk) r2
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "addCall: pausing ["
            r1.append(r0)
            kotlin.coroutines.CoroutineContext r0 = r2.getCoroutineContext()
            r1.append(r0)
            java.lang.String r0 = "] execution until the CallControl or Connection is ready"
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            X.00zU<X.0k0N> r1 = r5.LLILLL
            X.05XL<X.0k0N> r0 = r5.LLILZ
            r5.LLILLJJLI = r1
            r5.LL = r3
            java.lang.Object r6 = r0.LJLIIIL(r5)
            if (r6 != r4) goto L12
            return r4
        L7b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L7e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C329810CwN.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
