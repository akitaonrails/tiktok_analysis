package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XoG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.effectcreatormobile.infrastructure.seqmgr.impl.AnimSeqShowMgrImpl$launchDoAnimLoop$loopBlock$1$animShown$1", f = "AnimSeqShowMgrImpl.kt", l = {189}, m = "invokeSuspend")
public final class C859860XoG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ C859810XoB LLILLJJLI;
    public final /* synthetic */ float LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C859860XoG(C859810XoB c859810XoB, float f, InterfaceC1364105Vn<? super C859860XoG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c859810XoB;
        this.LLILLL = f;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C859860XoG(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.String r4 = "AnimSeqShowMgrImpl@5.launchDoAnimLoop$loopBlock$1$animShown$1"
            X.C1C7U.LIZ(r4)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LL
            r2 = 1
            if (r0 == 0) goto L19
            if (r0 != r2) goto L11
            goto L3c
        L11:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L19:
            X.C155000ia.LIZIZ(r6)
            X.0XoB r1 = r5.LLILLJJLI
            float r0 = r5.LLILLL
            java.util.SortedMap<java.lang.Float, X.01LM> r1 = r1.LLIZLLLIL     // Catch: java.lang.Throwable -> L4d
            java.lang.Float r0 = X.C2286608xc.LIZLLL(r0)     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Throwable -> L4d
            X.01LM r0 = (X.C01LM) r0     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L3a
            r5.LL = r2     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r6 = r0.LIZ(r5)     // Catch: java.lang.Throwable -> L4d
            if (r6 != r3) goto L3f
            X.C1C7U.LIZIZ(r4)
            return r3
        L3a:
            r0 = 0
            goto L45
        L3c:
            X.C155000ia.LIZIZ(r6)     // Catch: java.lang.Throwable -> L4d
        L3f:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L4d
            boolean r0 = r6.booleanValue()     // Catch: java.lang.Throwable -> L4d
        L45:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L4d
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L4d
            goto L59
        L4d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L59:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 == 0) goto L60
            r1 = 0
        L60:
            X.C1C7U.LIZIZ(r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C859860XoG.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
