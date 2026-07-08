package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.094E, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1", f = "Combine.kt", l = {129, 132, 132}, m = "invokeSuspend")
public final class C094E extends C09AX implements Function2<Unit, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC346701Wf LL;
    public int LLILLJJLI;
    public final /* synthetic */ AnonymousClass0954<Object> LLILLL;
    public final /* synthetic */ InterfaceC346701Wf<Object> LLILZ;
    public final /* synthetic */ InterfaceC1631620sYq<Object, Object, InterfaceC1364105Vn<Object>, Object> LLILZIL;
    public final /* synthetic */ Object LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C094E(AnonymousClass0954<? extends Object> anonymousClass0954, InterfaceC346701Wf<Object> interfaceC346701Wf, InterfaceC1631620sYq<Object, Object, ? super InterfaceC1364105Vn<Object>, ? extends Object> interfaceC1631620sYq, Object obj, InterfaceC1364105Vn<? super C094E> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = anonymousClass0954;
        this.LLILZ = interfaceC346701Wf;
        this.LLILZIL = interfaceC1631620sYq;
        this.LLILZLL = obj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C094E(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0062 A[RETURN] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            java.lang.Object r8 = X.C099R.LJFF()
            int r0 = r9.LLILLJJLI
            r7 = 0
            r6 = 3
            r5 = 2
            r1 = 1
            if (r0 == 0) goto L18
            if (r0 == r1) goto L26
            if (r0 == r5) goto L53
            if (r0 != r6) goto L63
            X.C155000ia.LIZIZ(r10)
        L15:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L18:
            X.C155000ia.LIZIZ(r10)
            X.0954<java.lang.Object> r0 = r9.LLILLL
            r9.LLILLJJLI = r1
            java.lang.Object r4 = r0.LJIJ(r9)
            if (r4 != r8) goto L2d
            return r8
        L26:
            X.C155000ia.LIZIZ(r10)
            X.094N r10 = (X.C094N) r10
            java.lang.Object r4 = r10.LIZ
        L2d:
            X.01Wf<java.lang.Object> r3 = r9.LLILZ
            boolean r0 = r4 instanceof X.C094O
            if (r0 == 0) goto L3f
            java.lang.Throwable r0 = X.C094N.LIZ(r4)
            if (r0 != 0) goto L3e
            X.094L r0 = new X.094L
            r0.<init>(r3)
        L3e:
            throw r0
        L3f:
            X.0sYq<java.lang.Object, java.lang.Object, X.05Vn<java.lang.Object>, java.lang.Object> r2 = r9.LLILZIL
            java.lang.Object r1 = r9.LLILZLL
            X.09AU r0 = X.C09AV.LIZ
            if (r4 != r0) goto L48
            r4 = r7
        L48:
            r9.LL = r3
            r9.LLILLJJLI = r5
            java.lang.Object r10 = r2.invoke(r1, r4, r9)
            if (r10 != r8) goto L58
            return r8
        L53:
            X.01Wf r3 = r9.LL
            X.C155000ia.LIZIZ(r10)
        L58:
            r9.LL = r7
            r9.LLILLJJLI = r6
            java.lang.Object r0 = r3.emit(r10, r9)
            if (r0 != r8) goto L15
            return r8
        L63:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C094E.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(unit, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
