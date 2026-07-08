package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.097V, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.EffectLoadingManager$loadingShowState$1$1", f = "EffectLoadingComponent.kt", l = {110, 111, 112}, m = "invokeSuspend")
public final class C097V extends C09AX implements Function2<InterfaceC346701Wf<? super Boolean>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C097V(long j, InterfaceC1364105Vn<? super C097V> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C097V c097v = new C097V(this.LLILLL, interfaceC1364105Vn);
        c097v.LLILLJJLI = obj;
        return c097v;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "EffectLoadingManager@bb2d.loadingShowState$1$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r8.LL
            r5 = 3
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L1f
            if (r0 == r3) goto L39
            if (r0 == r4) goto L50
            if (r0 != r5) goto L6a
            X.C155000ia.LIZIZ(r9)
        L19:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L1f:
            X.C155000ia.LIZIZ(r9)
            java.lang.Object r2 = r8.LLILLJJLI
            X.01Wf r2 = (X.InterfaceC346701Wf) r2
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8.LLILLJJLI = r2
            r8.LL = r3
            java.lang.Object r0 = r2.emit(r0, r8)
            if (r0 != r6) goto L40
            X.C1C7U.LIZIZ(r7)
            return r6
        L39:
            java.lang.Object r2 = r8.LLILLJJLI
            X.01Wf r2 = (X.InterfaceC346701Wf) r2
            X.C155000ia.LIZIZ(r9)
        L40:
            long r0 = r8.LLILLL
            r8.LLILLJJLI = r2
            r8.LL = r4
            java.lang.Object r0 = X.AnonymousClass0958.LIZJ(r0, r8)
            if (r0 != r6) goto L57
            X.C1C7U.LIZIZ(r7)
            return r6
        L50:
            java.lang.Object r2 = r8.LLILLJJLI
            X.01Wf r2 = (X.InterfaceC346701Wf) r2
            X.C155000ia.LIZIZ(r9)
        L57:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            r0 = 0
            r8.LLILLJJLI = r0
            r8.LL = r5
            java.lang.Object r0 = r2.emit(r1, r8)
            if (r0 != r6) goto L19
            X.C1C7U.LIZIZ(r7)
            return r6
        L6a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C097V.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super Boolean> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
