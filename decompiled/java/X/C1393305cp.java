package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05cp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1", f = "AnimateAsState.kt", l = {418}, m = "invokeSuspend")
public final class C1393305cp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC824740WWy LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C095E<T> LLILZ;
    public final /* synthetic */ C1677480tko<T, V> LLILZIL;
    public final /* synthetic */ C05P1<InterfaceC1677030tk5<T>> LLILZLL;
    public final /* synthetic */ C05P1<Function1<T, Unit>> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1393305cp(C095E<T> c095e, C1677480tko<T, V> c1677480tko, C05P1<? extends InterfaceC1677030tk5<T>> c05p1, C05P1<? extends Function1<? super T, Unit>> c05p12, InterfaceC1364105Vn<? super C1393305cp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c095e;
        this.LLILZIL = c1677480tko;
        this.LLILZLL = c05p1;
        this.LLIZ = c05p12;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1393305cp c1393305cp = new C1393305cp(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c1393305cp.LLILLL = obj;
        return c1393305cp;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0047 -> B:6:0x0014). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r11.LLILLJJLI
            r2 = 1
            if (r0 == 0) goto L4a
            if (r0 != r2) goto L5b
            X.0WWy r4 = r11.LL
            java.lang.Object r1 = r11.LLILLL
            X.01wk r1 = (X.InterfaceC497601wk) r1
            X.C155000ia.LIZIZ(r12)
        L14:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r0 = r12.booleanValue()
            if (r0 == 0) goto L58
            java.lang.Object r6 = r4.next()
            X.095E<T> r0 = r11.LLILZ
            java.lang.Object r0 = r0.LJIIJ()
            java.lang.Object r0 = X.C094N.LIZIZ(r0)
            if (r0 == 0) goto L2d
            r6 = r0
        L2d:
            X.05co r5 = new X.05co
            X.0tko<T, V> r7 = r11.LLILZIL
            X.05P1<X.0tk5<T>> r8 = r11.LLILZLL
            X.05P1<kotlin.jvm.functions.Function1<T, kotlin.Unit>> r9 = r11.LLIZ
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            r0 = 3
            X.C23250099c.LIZLLL(r1, r10, r10, r5, r0)
        L3d:
            r11.LLILLL = r1
            r11.LL = r4
            r11.LLILLJJLI = r2
            java.lang.Object r12 = r4.LIZ(r11)
            if (r12 != r3) goto L14
            return r3
        L4a:
            X.C155000ia.LIZIZ(r12)
            java.lang.Object r1 = r11.LLILLL
            X.01wk r1 = (X.InterfaceC497601wk) r1
            X.095E<T> r0 = r11.LLILZ
            X.0WWy r4 = r0.iterator()
            goto L3d
        L58:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L5b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1393305cp.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
