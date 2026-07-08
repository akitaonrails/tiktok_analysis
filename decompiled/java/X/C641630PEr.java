package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0PEr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.skylight.plat.processor.activitystatus.SkylightActivityStatusModule$activityStatusClient$2$1$1$onActivityStatusUpdate$2", f = "SkylightActivityStatusModule.kt", l = {75, 77, 78}, m = "invokeSuspend")
public final class C641630PEr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1598850rhz LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C641630PEr(C1598850rhz c1598850rhz, InterfaceC1364105Vn<? super C641630PEr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1598850rhz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C641630PEr(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "SkylightActivityStatusModule@7da9.activityStatusClient$2$1$1$onActivityStatusUpdate$2"
            X.C1C7U.LIZ(r6)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r7.LL
            r5 = 3
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L1e
            if (r0 == r2) goto L68
            if (r0 == r3) goto L4f
            if (r0 == r5) goto L68
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1e:
            X.C155000ia.LIZIZ(r8)
            boolean r0 = X.C1599090riN.LIZ()
            if (r0 == 0) goto L39
            X.0rhz r0 = r7.LLILLJJLI
            com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel r1 = r0.LJFF
            X.0rh9 r0 = X.EnumC1598330rh9.ACTIVE_STATUS
            r7.LL = r2
            java.lang.Object r0 = r1.KQ2(r0, r7)
            if (r0 != r4) goto L6b
            X.C1C7U.LIZIZ(r6)
            return r4
        L39:
            X.0rhz r0 = r7.LLILLJJLI
            com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel r1 = r0.LJFF
            X.0rh9 r0 = X.EnumC1598330rh9.ACTIVE_STATUS
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r7.LL = r3
            java.lang.Object r0 = r1.JQ2(r0, r7)
            if (r0 != r4) goto L52
            X.C1C7U.LIZIZ(r6)
            return r4
        L4f:
            X.C155000ia.LIZIZ(r8)
        L52:
            X.08ps r3 = X.C2108208Ns.LIZ
            X.0PEq r2 = new X.0PEq
            X.0rhz r1 = r7.LLILLJJLI
            r0 = 0
            r2.<init>(r1, r0)
            r7.LL = r5
            java.lang.Object r0 = X.C23250099c.LJI(r7, r3, r2)
            if (r0 != r4) goto L6b
            X.C1C7U.LIZIZ(r6)
            return r4
        L68:
            X.C155000ia.LIZIZ(r8)
        L6b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C641630PEr.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
