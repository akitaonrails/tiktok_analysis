package X;

import com.ss.android.ugc.aweme.pns.gatekeeper.GatekeeperEngine;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NQs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pns.gatekeeper.GatekeeperEngine$updateEligibility$job$1", f = "GatekeeperEngine.kt", l = {663}, m = "invokeSuspend")
public final class C593800NQs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1DEV LL;
    public GatekeeperEngine LLILLJJLI;
    public C0NR1 LLILLL;
    public boolean LLILZ;
    public int LLILZIL;
    public final /* synthetic */ GatekeeperEngine LLILZLL;
    public final /* synthetic */ C0NR1 LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C593800NQs(GatekeeperEngine gatekeeperEngine, C0NR1 c0nr1, boolean z, InterfaceC1364105Vn<? super C593800NQs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = gatekeeperEngine;
        this.LLIZ = c0nr1;
        this.LLIZLLLIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C593800NQs(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r10 = "GatekeeperEngine@cdc1.updateEligibility$job$1"
            X.C1C7U.LIZ(r10)
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r11.LLILZIL
            r8 = 0
            r9 = 1
            if (r0 == 0) goto L25
            if (r0 != r9) goto L1d
            boolean r4 = r11.LLILZ
            X.0NR1 r7 = r11.LLILLL
            com.ss.android.ugc.aweme.pns.gatekeeper.GatekeeperEngine r6 = r11.LLILLJJLI
            X.1DEV r5 = r11.LL
            X.C155000ia.LIZIZ(r12)
            goto L44
        L1d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L25:
            X.C155000ia.LIZIZ(r12)
            com.ss.android.ugc.aweme.pns.gatekeeper.GatekeeperEngine r6 = r11.LLILZLL
            X.1DEV r5 = r6.LJIIJ
            X.0NR1 r7 = r11.LLIZ
            boolean r4 = r11.LLIZLLLIL
            r11.LL = r5
            r11.LLILLJJLI = r6
            r11.LLILLL = r7
            r11.LLILZ = r4
            r11.LLILZIL = r9
            java.lang.Object r0 = r5.LIZLLL(r8, r11)
            if (r0 != r1) goto L44
            X.C1C7U.LIZIZ(r10)
            return r1
        L44:
            r6.getClass()     // Catch: java.lang.Throwable -> L86
            java.lang.String r1 = r7.getTaskKey()     // Catch: java.lang.Throwable -> L86
            java.lang.String r0 = "GatekeeperFeatureTask"
            boolean r0 = kotlin.text.u.LJJIIJZLJL(r1, r0, r9)     // Catch: java.lang.Throwable -> L86
            if (r0 != 0) goto L77
            java.lang.String r3 = r7.getTaskKey()     // Catch: java.lang.Throwable -> L86
            if (r4 == 0) goto L5b
            r2 = 1
            goto L5c
        L5b:
            r2 = 0
        L5c:
            java.util.Set<java.lang.String> r0 = r6.LJ     // Catch: java.lang.Throwable -> L86
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L86
            if (r2 == 0) goto L70
            java.util.Set<java.lang.String> r0 = r6.LJ     // Catch: java.lang.Throwable -> L86
            r0.remove(r3)     // Catch: java.lang.Throwable -> L86
            java.util.Set<java.lang.String> r0 = r6.LJ     // Catch: java.lang.Throwable -> L86
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L86
            goto L75
        L70:
            java.util.Set<java.lang.String> r0 = r6.LJ     // Catch: java.lang.Throwable -> L86
            r0.add(r3)     // Catch: java.lang.Throwable -> L86
        L75:
            if (r1 == 0) goto L7d
        L77:
            if (r4 != 0) goto L7a
            r9 = 0
        L7a:
            r6.LJIIZILJ(r7, r9)     // Catch: java.lang.Throwable -> L86
        L7d:
            r5.LIZIZ(r8)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        L86:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L86
            r5.LIZIZ(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C593800NQs.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
