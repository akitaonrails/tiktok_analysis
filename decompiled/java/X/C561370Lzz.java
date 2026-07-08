package X;

import com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lzz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment$onResume$1", f = "DraftBoxFragment.kt", l = {1514, 1515}, m = "invokeSuspend")
public final class C561370Lzz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ DraftBoxFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C561370Lzz(DraftBoxFragment draftBoxFragment, InterfaceC1364105Vn<? super C561370Lzz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = draftBoxFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C561370Lzz(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "DraftBoxFragment@80e.onResume$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r8.LL
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L1c
            if (r0 == r4) goto L39
            if (r0 != r5) goto L5c
            X.C155000ia.LIZIZ(r9)
        L16:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L1c:
            X.C155000ia.LIZIZ(r9)
            com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment r0 = r8.LLILLJJLI
            X.01GW r0 = r0.LLLJ
            java.lang.Object r0 = r0.getValue()
            X.0M5m r0 = (X.InterfaceC562800M5m) r0
            if (r0 == 0) goto L37
            r8.LL = r4
            java.lang.Object r9 = r0.LIZJ(r8)
            if (r9 != r6) goto L3c
            X.C1C7U.LIZIZ(r7)
            return r6
        L37:
            r4 = 0
            goto L44
        L39:
            X.C155000ia.LIZIZ(r9)
        L3c:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r0 = r9.booleanValue()
            if (r0 != r4) goto L37
        L44:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r3 = X.C2107308Nj.LIZ
            X.0M0s r2 = new X.0M0s
            com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment r1 = r8.LLILLJJLI
            r0 = 0
            r2.<init>(r4, r1, r0)
            r8.LL = r5
            java.lang.Object r0 = X.C23250099c.LJI(r8, r3, r2)
            if (r0 != r6) goto L16
            X.C1C7U.LIZIZ(r7)
            return r6
        L5c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C561370Lzz.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
