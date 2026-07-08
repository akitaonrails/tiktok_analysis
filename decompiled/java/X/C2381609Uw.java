package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Uw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.editeffect.ui.EditEffectPageView$initObserver$1$1", f = "EditEffectPageView.kt", l = {431}, m = "invokeSuspend")
public final class C2381609Uw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C113E LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2381609Uw(C113E c113e, InterfaceC1364105Vn<? super C2381609Uw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c113e;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2381609Uw(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "EditEffectPageView@b66d.initObserver$1$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r9.LL
            r3 = 0
            r7 = 0
            r2 = 1
            if (r0 == 0) goto L69
            if (r0 != r2) goto L86
            X.C155000ia.LIZIZ(r10)
            X.00o6 r10 = (X.C189200o6) r10
            java.lang.Object r1 = r10.m10unboximpl()
        L1b:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 == 0) goto L22
            r1 = r7
        L22:
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L28
        L26:
            X.13BV r1 = X.C13BV.INSTANCE
        L28:
            X.113E r6 = r9.LLILLJJLI
            java.util.Iterator r5 = r1.iterator()
        L2e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L80
            java.lang.Object r4 = r5.next()
            com.ss.android.ugc.effectmanager.effect.model.Effect r4 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r4
            java.util.List<com.ss.android.ugc.aweme.effect.EffectModel> r0 = r6.LLJJLIIIJLLLLLLLZ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r3 = r0.iterator()
            r2 = 0
        L43:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r3.next()
            com.ss.android.ugc.aweme.effect.EffectModel r0 = (com.ss.android.ugc.aweme.effect.EffectModel) r0
            java.lang.String r1 = r0.resourceId
            java.lang.String r0 = r4.getResourceId()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L66
            if (r2 < 0) goto L2e
            X.113F r0 = r6.LLJJIJIL
            if (r0 != 0) goto L62
            r0 = r7
        L62:
            r0.notifyItemChanged(r2)
            goto L2e
        L66:
            int r2 = r2 + 1
            goto L43
        L69:
            X.C155000ia.LIZIZ(r10)
            X.113E r0 = r9.LLILLJJLI
            X.0EEl r1 = r0.LLJJJJJIL
            if (r1 == 0) goto L26
            r9.LL = r2
            java.lang.String r0 = "editingeffect"
            java.lang.Object r1 = r1.SS0(r0, r3, r9)
            if (r1 != r4) goto L1b
            X.C1C7U.LIZIZ(r8)
            return r4
        L80:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L86:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2381609Uw.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
