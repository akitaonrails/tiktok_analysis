package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.10c0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.tiktok.kmp.eventbus.SharedEventManager$start$1", f = "SharedEventManager.kt", l = {59, 60}, m = "invokeSuspend")
public final class C19281410c0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC824740WWy LL;
    public int LLILLJJLI;

    public C19281410c0(InterfaceC1364105Vn<? super C19281410c0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C19281410c0(interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0043 -> B:7:0x0018). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "SharedEventManager@12aa.start$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LLILLJJLI
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L49
            if (r0 == r3) goto L26
            if (r0 != r4) goto L63
            X.0WWy r2 = r7.LL
            X.C155000ia.LIZIZ(r8)
        L18:
            r7.LL = r2
            r7.LLILLJJLI = r3
            java.lang.Object r8 = r2.LIZ(r7)
            if (r8 != r5) goto L2b
            X.C1C7U.LIZIZ(r6)
            return r5
        L26:
            X.0WWy r2 = r7.LL
            X.C155000ia.LIZIZ(r8)
        L2b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r0 = r8.booleanValue()
            if (r0 == 0) goto L6b
            java.lang.Object r1 = r2.next()
            X.10bu r1 = (X.C19280810bu) r1
            X.10bz r0 = X.C19281310bz.LIZ
            r7.LL = r2
            r7.LLILLJJLI = r4
            java.lang.Object r0 = r0.LIZJ(r1, r7)
            if (r0 != r5) goto L18
            X.C1C7U.LIZIZ(r6)
            return r5
        L49:
            X.C155000ia.LIZIZ(r8)
            X.0yeS r0 = X.C1865740yeS.LIZ
            r0.getClass()
            java.lang.String r1 = "Event_Handler"
            java.lang.String r0 = "SharedEventManager start consumer coroutine"
            X.C1865740yeS.LIZJ(r1, r0)
            X.1DEK r0 = X.C19281310bz.LJ
            r0.getClass()
            X.1DEL r2 = new X.1DEL
            r2.<init>(r0)
            goto L18
        L63:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L6b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19281410c0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C19281410c0(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
