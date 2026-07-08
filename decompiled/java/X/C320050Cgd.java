package X;

import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cgd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel$onLoadHistory$2", f = "MessageViewModel.kt", l = {462, 466}, m = "invokeSuspend")
public final class C320050Cgd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ MessageViewModel LLILLL;
    public final /* synthetic */ InterfaceC1364105Vn<AbstractC316870CbV<Boolean>> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C320050Cgd(MessageViewModel messageViewModel, InterfaceC1364105Vn<? super AbstractC316870CbV<Boolean>> interfaceC1364105Vn, InterfaceC1364105Vn<? super C320050Cgd> interfaceC1364105Vn2) {
        super(2, interfaceC1364105Vn2);
        this.LLILLL = messageViewModel;
        this.LLILZ = interfaceC1364105Vn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C320050Cgd c320050Cgd = new C320050Cgd(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c320050Cgd.LLILLJJLI = obj;
        return c320050Cgd;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            java.lang.String r8 = "MessageViewModel@9229.onLoadHistory$2"
            X.C1C7U.LIZ(r8)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r15.LL
            r14 = 0
            r4 = 2
            r6 = 1
            if (r0 == 0) goto L1d
            if (r0 == r6) goto L84
            if (r0 != r4) goto Lab
            X.C155000ia.LIZIZ(r16)
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L1d:
            X.C155000ia.LIZIZ(r16)
            java.lang.Object r5 = r15.LLILLJJLI
            com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel r0 = r15.LLILLL
            X.002o r0 = r0.getState()
            X.0yWs r0 = (X.C1861040yWs) r0
            X.01Au<java.util.List<X.0yRy>> r0 = r0.LL
            T r0 = r0.LIZ
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r2 = r0.iterator()
        L39:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L4b
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C326880Cre
            if (r0 == 0) goto L39
            r7.add(r1)
            goto L39
        L4b:
            java.lang.Object r0 = X.C13LP.LJJJLL(r7)
            X.0Cre r0 = (X.C326880Cre) r0
            if (r0 == 0) goto L8b
            com.ss.android.ugc.aweme.tako.ccl.model.api.Message r12 = r0.LLILLL
            if (r12 == 0) goto L8b
            com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel r2 = r15.LLILLL
            X.05Vn<X.0CbV<java.lang.Boolean>> r1 = r15.LLILZ
            X.0yae r9 = r2.LLJJJJ
            if (r9 == 0) goto L8b
            kotlin.jvm.internal.AwS370S0200000_4 r13 = new kotlin.jvm.internal.AwS370S0200000_4
            r0 = 3
            r13.<init>(r2, r1, r0)
            r15.LLILLJJLI = r5
            r15.LL = r6
            X.0yaU r1 = r9.LJIILL
            int r10 = X.C1EK8.LIZLLL
            r11 = r9
            r2 r0 = r9.LIZIZ(r10, r11, r12, r13, r14)
            java.lang.Object r1 = r1.LJIILL(r0, r15)
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 == r0) goto L7e
            kotlin.Unit r1 = kotlin.Unit.LIZ
        L7e:
            if (r1 != r3) goto L87
            X.C1C7U.LIZIZ(r8)
            return r3
        L84:
            X.C155000ia.LIZIZ(r16)
        L87:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != 0) goto L17
        L8b:
            com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel r2 = r15.LLILLL
            X.05Vn<X.0CbV<java.lang.Boolean>> r1 = r15.LLILZ
            X.0yae r11 = r2.LLJJJJ
            if (r11 == 0) goto L17
            int r12 = X.C1EK8.LIZLLL
            kotlin.jvm.internal.AwS370S0200000_4 r13 = new kotlin.jvm.internal.AwS370S0200000_4
            r0 = 4
            r13.<init>(r2, r1, r0)
            r16 = 4
            r15.LLILLJJLI = r14
            r15.LL = r4
            java.lang.Object r0 = X.C1863380yae.LJIJ(r11, r12, r13, r14, r15, r16)
            if (r0 != r3) goto L17
            X.C1C7U.LIZIZ(r8)
            return r3
        Lab:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C320050Cgd.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
