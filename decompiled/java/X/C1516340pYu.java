package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0pYu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1", f = "SuspendingPointerInputFilter.kt", l = {883, 884}, m = "invokeSuspend")
public final class C1516340pYu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C1516410pZ1<R> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1516340pYu(long j, C1516410pZ1<R> c1516410pZ1, InterfaceC1364105Vn<? super C1516340pYu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = c1516410pZ1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1516340pYu(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LL
            r3 = 8
            r5 = 2
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 == r2) goto L3d
            if (r0 != r5) goto L49
            X.C155000ia.LIZIZ(r8)
        L13:
            X.0pZ1<R> r0 = r7.LLILLL
            X.14Gf<? super X.13fT> r3 = r0.LLILLL
            if (r3 == 0) goto L2b
            X.0pYx r2 = new X.0pYx
            long r0 = r7.LLILLJJLI
            r2.<init>(r0)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r2)
            X.C189200o6.m2constructorimpl(r0)
            r3.resumeWith(r0)
        L2b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2e:
            X.C155000ia.LIZIZ(r8)
            long r0 = r7.LLILLJJLI
            long r0 = r0 - r3
            r7.LL = r2
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r7)
            if (r0 != r6) goto L40
            return r6
        L3d:
            X.C155000ia.LIZIZ(r8)
        L40:
            r7.LL = r5
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r3, r7)
            if (r0 != r6) goto L13
            return r6
        L49:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1516340pYu.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
