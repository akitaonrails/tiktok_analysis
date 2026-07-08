package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0HWB, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HWB {
    public final Object LIZ;
    public final int LIZIZ;
    public final C1325540kbA LIZJ;
    public final InterfaceC497601wk LIZLLL;
    public final Function1<String, C1325710kbR> LJ;
    public volatile AnonymousClass0956 LJFF;

    public C0HWB(AwS604S0100000_25 awS604S0100000_25) {
        C1325540kbA c1325540kbALIZ = C1322200kVm.LIZ();
        C054G c054gLIZ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ).plus(new AnonymousClass0204(CoroutineExceptionHandler.LJJLIL, 3)));
        this.LIZ = "FullWidthEffectCarouselComponent";
        this.LIZIZ = 4;
        this.LIZJ = c1325540kbALIZ;
        this.LIZLLL = c054gLIZ;
        this.LJ = awS604S0100000_25;
    }

    public static Object LIZ(AbstractC1321260kUG abstractC1321260kUG, C458401qQ c458401qQ) {
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(c458401qQ));
        c2252611DEt.LJIJJ();
        c2252611DEt.LJJII(new AwS585S0100000_6(abstractC1321260kUG, 234));
        abstractC1321260kUG.LIZJ(new C0HWE<Void>() { // from class: X.0HTa
            @Override // X.C0HWE
            public final void LJ(InterfaceC1320200kSY<Void> interfaceC1320200kSY) {
                if (c2252611DEt.isActive()) {
                    InterfaceC20236714Gf<Unit> interfaceC20236714Gf = c2252611DEt;
                    Unit unit = Unit.LIZ;
                    C189200o6.m2constructorimpl(unit);
                    interfaceC20236714Gf.resumeWith(unit);
                }
            }

            @Override // X.C0HWE
            public final void LJFF(InterfaceC1320200kSY<Void> interfaceC1320200kSY) {
                if (interfaceC1320200kSY.LIZ() && c2252611DEt.isActive()) {
                    InterfaceC20236714Gf<Unit> interfaceC20236714Gf = c2252611DEt;
                    Unit unit = Unit.LIZ;
                    C189200o6.m2constructorimpl(unit);
                    interfaceC20236714Gf.resumeWith(unit);
                }
            }
        }, C822700WPc.LL);
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(c458401qQ);
        }
        if (objLJIJ == C099R.LJFF()) {
            return objLJIJ;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.0kUG] */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.0kUG] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r7, X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C458401qQ
            if (r0 == 0) goto L22
            r5 = r8
            X.01qQ r5 = (X.C458401qQ) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r2 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r3 = 1
            if (r0 == 0) goto L34
            if (r0 != r3) goto L2c
            X.0kUG r1 = r5.LL
            goto L28
        L22:
            X.01qQ r5 = new X.01qQ
            r5.<init>(r6, r8)
            goto L12
        L28:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Throwable -> L58
            goto L52
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C155000ia.LIZIZ(r2)
            kotlin.jvm.functions.Function1<java.lang.String, X.0kbR> r0 = r6.LJ
            java.lang.Object r2 = r0.invoke(r7)
            X.0kbR r2 = (X.C1325710kbR) r2
            X.0kbA r1 = r6.LIZJ
            java.lang.Object r0 = r6.LIZ
            X.0kUG r1 = r1.LJIJ(r2, r0)
            r5.LL = r1     // Catch: java.lang.Throwable -> L58
            r5.LLILZ = r3     // Catch: java.lang.Throwable -> L58
            java.lang.Object r0 = LIZ(r1, r5)     // Catch: java.lang.Throwable -> L58
            if (r0 != r4) goto L52
            return r4
        L52:
            r1.close()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L58:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L58
            r1.close()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HWB.LIZIZ(java.lang.String, X.05Vn):java.lang.Object");
    }
}
