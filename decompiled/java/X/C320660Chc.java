package X;

import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.vm.MessageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Chc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.chatagent.botpage.vm.MessageViewModel$onLoadHistory$1", f = "MessageViewModel.kt", l = {157, 161}, m = "invokeSuspend")
public final class C320660Chc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ MessageViewModel LLILLL;
    public final /* synthetic */ InterfaceC1364105Vn<AbstractC316870CbV<Boolean>> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C320660Chc(MessageViewModel messageViewModel, InterfaceC1364105Vn<? super AbstractC316870CbV<Boolean>> interfaceC1364105Vn, InterfaceC1364105Vn<? super C320660Chc> interfaceC1364105Vn2) {
        super(2, interfaceC1364105Vn2);
        this.LLILLL = messageViewModel;
        this.LLILZ = interfaceC1364105Vn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C320660Chc c320660Chc = new C320660Chc(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c320660Chc.LLILLJJLI = obj;
        return c320660Chc;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.String r12 = "MessageViewModel@2947.onLoadHistory$1"
            X.C1C7U.LIZ(r12)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r13.LL
            r7 = 20
            r8 = 2
            r11 = 1
            r6 = 0
            if (r0 == 0) goto L1f
            if (r0 == r11) goto L84
            if (r0 != r8) goto Lb6
            X.C155000ia.LIZIZ(r14)
        L19:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r12)
            return r0
        L1f:
            X.C155000ia.LIZIZ(r14)
            java.lang.Object r10 = r13.LLILLJJLI
            com.ss.android.ugc.aweme.commercialize.chatagent.botpage.vm.MessageViewModel r0 = r13.LLILLL
            X.002o r0 = r0.getState()
            X.0CjI r0 = (X.C321700CjI) r0
            X.01Au<java.util.List<X.05op>> r0 = r0.LL
            T r0 = r0.LIZ
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L3b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L4d
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C321490Cix
            if (r0 == 0) goto L3b
            r3.add(r1)
            goto L3b
        L4d:
            java.lang.Object r0 = X.C13LP.LJJJLL(r3)
            X.0Cix r0 = (X.C321490Cix) r0
            if (r0 == 0) goto L8b
            com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.Message r9 = r0.LIZJ
            if (r9 == 0) goto L8b
            com.ss.android.ugc.aweme.commercialize.chatagent.botpage.vm.MessageViewModel r4 = r13.LLILLL
            X.05Vn<X.0CbV<java.lang.Boolean>> r1 = r13.LLILZ
            X.0Cha r3 = r4.LLILLL
            if (r3 == 0) goto L8b
            kotlin.jvm.internal.AwS370S0200000_4 r2 = new kotlin.jvm.internal.AwS370S0200000_4
            r0 = 91
            r2.<init>(r4, r1, r0)
            r13.LLILLJJLI = r10
            r13.LL = r11
            X.0Cht r1 = r3.LJFF
            X.0CiC r0 = X.C320910Ci1.LIZ(r7, r3, r9, r2)
            java.lang.Object r1 = r1.LIZIZ(r0, r13)
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 == r0) goto L7e
            kotlin.Unit r1 = kotlin.Unit.LIZ
        L7e:
            if (r1 != r5) goto L87
            X.C1C7U.LIZIZ(r12)
            return r5
        L84:
            X.C155000ia.LIZIZ(r14)
        L87:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != 0) goto L19
        L8b:
            com.ss.android.ugc.aweme.commercialize.chatagent.botpage.vm.MessageViewModel r4 = r13.LLILLL
            X.05Vn<X.0CbV<java.lang.Boolean>> r1 = r13.LLILZ
            X.0Cha r3 = r4.LLILLL
            if (r3 == 0) goto L19
            kotlin.jvm.internal.AwS370S0200000_4 r2 = new kotlin.jvm.internal.AwS370S0200000_4
            r0 = 92
            r2.<init>(r4, r1, r0)
            r13.LLILLJJLI = r6
            r13.LL = r8
            X.0Cht r1 = r3.LJFF
            X.0CiC r0 = X.C320910Ci1.LIZ(r7, r3, r6, r2)
            java.lang.Object r1 = r1.LIZIZ(r0, r13)
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 == r0) goto Lb0
            kotlin.Unit r1 = kotlin.Unit.LIZ
        Lb0:
            if (r1 != r5) goto L19
            X.C1C7U.LIZIZ(r12)
            return r5
        Lb6:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C320660Chc.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
