package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Kuh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.editorpro.EditorTabContainerScene$Companion$preloadEoyAssets$1", f = "EditorTabContainerScene.kt", l = {109}, m = "invokeSuspend")
public final class C532610Kuh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Context LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C532610Kuh(Context context, InterfaceC1364105Vn<? super C532610Kuh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C532610Kuh c532610Kuh = new C532610Kuh(this.LLILLL, interfaceC1364105Vn);
        c532610Kuh.LLILLJJLI = obj;
        return c532610Kuh;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "EditorTabContainerScene$Companion@4fe1.preloadEoyAssets$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r8.LL
            r6 = 1
            if (r0 == 0) goto L19
            if (r0 != r6) goto L11
            goto L70
        L11:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L19:
            X.C155000ia.LIZIZ(r9)
            X.0LBG r1 = X.C0LBG.LIZ
            r1.getClass()
            boolean r0 = X.C0LBG.LJ()
            if (r0 == 0) goto L8d
            boolean r0 = X.C0LBG.LIZLLL()
            if (r0 == 0) goto L8d
            android.content.Context r4 = r8.LLILLL
            boolean r0 = X.C0MQ1.LIZIZ()
            r3 = 0
            if (r0 == 0) goto L5b
            r1.getClass()
            java.lang.String r0 = "create_tab_eoy_background.png"
            X.0VSJ r0 = X.C0LBG.LIZJ(r0)
            if (r0 == 0) goto L5b
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
        L45:
            if (r0 == 0) goto L5d
            X.0kbQ r0 = X.C1325700kbQ.LIZLLL(r0)
            X.0kbR r2 = r0.LIZ()
            X.0kbA r1 = X.C1322200kVm.LIZ()
            android.content.Context r0 = X.C786410Ut5.N3(r4)
            r1.LJIJ(r2, r0)
            goto L5d
        L5b:
            r0 = r3
            goto L45
        L5d:
            r8.LL = r6     // Catch: java.lang.Throwable -> L81
            X.1DFB r1 = X.C0PEM.LIZJ     // Catch: java.lang.Throwable -> L81
            X.08rT r0 = new X.08rT     // Catch: java.lang.Throwable -> L81
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L81
            java.lang.Object r9 = X.C23250099c.LJI(r8, r1, r0)     // Catch: java.lang.Throwable -> L81
            if (r9 != r5) goto L73
            X.C1C7U.LIZIZ(r7)
            return r5
        L70:
            X.C155000ia.LIZIZ(r9)     // Catch: java.lang.Throwable -> L81
        L73:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L81
            boolean r0 = r9.booleanValue()     // Catch: java.lang.Throwable -> L81
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L81
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L81
            goto L8d
        L81:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L8d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C532610Kuh.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
