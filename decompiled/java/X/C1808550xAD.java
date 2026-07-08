package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0xAD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.common.data.MultipleTypingIndicatorBuffer$startTimerToUpdateDisplayQueue$1", f = "MultipleTypingIndicatorBuffer.kt", l = {131, 132}, m = "invokeSuspend")
public final class C1808550xAD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C1808570xAF LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1808550xAD(long j, C1808570xAF c1808570xAF, InterfaceC1364105Vn<? super C1808550xAD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = c1808570xAF;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1808550xAD(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "MultipleTypingIndicatorBuffer@9335.startTimerToUpdateDisplayQueue$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LL
            r2 = 0
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L54
            if (r0 == r3) goto L65
            if (r0 != r4) goto L78
            X.C155000ia.LIZIZ(r8)
        L17:
            java.util.LinkedList r3 = new java.util.LinkedList
            X.0xAF r0 = r7.LLILLL
            X.0951 r0 = r0.LLILZIL
            java.lang.Object r0 = r0.getValue()
            java.util.Collection r0 = (java.util.Collection) r0
            r3.<init>(r0)
            X.0xAF r1 = r7.LLILLL
            r0 = 392(0x188, float:5.5E-43)
            kotlin.jvm.internal.AFwS269S0000000_27 r0 = kotlin.jvm.internal.AFwS269S0000000_27.get$arr$(r0)
            r1.getClass()
            boolean r0 = X.C1808570xAF.LJI(r3, r0)
            if (r0 == 0) goto L47
            X.0xAF r0 = r7.LLILLL
            X.1DDq r1 = r0.LLILZ
            java.util.List r0 = X.C13LP.LLIIII(r3)
            r1.setValue(r0)
            X.0xAF r0 = r7.LLILLL
            r0.LJFF()
        L47:
            X.0xAF r0 = r7.LLILLL
            X.1DEV r0 = r0.LLJI
            r0.LIZIZ(r2)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L54:
            X.C155000ia.LIZIZ(r8)
            long r0 = r7.LLILLJJLI
            r7.LL = r3
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r7)
            if (r0 != r5) goto L68
            X.C1C7U.LIZIZ(r6)
            return r5
        L65:
            X.C155000ia.LIZIZ(r8)
        L68:
            X.0xAF r0 = r7.LLILLL
            X.1DEV r0 = r0.LLJI
            r7.LL = r4
            java.lang.Object r0 = r0.LIZLLL(r2, r7)
            if (r0 != r5) goto L17
            X.C1C7U.LIZIZ(r6)
            return r5
        L78:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1808550xAD.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
