package X;

import defpackage.r2;
import defpackage.u2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0yUp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.base.handlers.MessageOperatorHandler$dispatchStream$2", f = "MessageOperatorHandler.kt", l = {2679, 2690, 2691}, m = "invokeSuspend")
public final class C1859770yUp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public u2 LL;
    public C259800zU LLILLJJLI;
    public C259800zU LLILLL;
    public C118300cf LLILZ;
    public C118300cf LLILZIL;
    public C118300cf LLILZLL;
    public C259800zU LLIZ;
    public C1863900ybU LLIZLLLIL;
    public int LLJ;
    public final /* synthetic */ C1863280yaU LLJI;
    public final /* synthetic */ r2 LLJIJIL;
    public final /* synthetic */ C259800zU<r2> LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1859770yUp(C1863280yaU c1863280yaU, r2 r2Var, C259800zU<r2> c259800zU, InterfaceC1364105Vn<? super C1859770yUp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJI = c1863280yaU;
        this.LLJIJIL = r2Var;
        this.LLJILJIL = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1859770yUp(this.LLJI, this.LLJIJIL, this.LLJILJIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:0|2|(1:83)|(1:(1:(1:(8:7|26|27|(1:29)|30|(1:32)|77|78)(2:8|9))(11:10|11|79|22|(2:24|25)|27|(0)|30|(0)|77|78))(1:16))(2:12|(2:14|15))|17|81|18|(2:20|21)|79|22|(0)|27|(0)|30|(0)|77|78|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0109, code lost:
    
        r13 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x010b, code lost:
    
        r13 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x010e, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r13);
        r6 = r30.LLJILJIL.element;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0117, code lost:
    
        if (r6 != null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0119, code lost:
    
        r12 = r30.LLJI;
        r11 = r30.LLJIJIL;
        r25 = r13.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0123, code lost:
    
        if (r25 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0125, code lost:
    
        r25 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0127, code lost:
    
        r12.LJIILJJIL(r6, -1, r25, defpackage.k9.LIZ(r11.LIZ(), (java.lang.String) r8.element, r11.LIZJ, null, null, 124), false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0148, code lost:
    
        r7 = (com.ss.android.ugc.aweme.tako.ccl.model.api.Message) r7.element;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x014c, code lost:
    
        if (r7 != null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x014e, code lost:
    
        r10 = r30.LLJI;
        r6 = r30.LLJIJIL;
        r10.LJJIFFI(r7, r9);
        r23 = defpackage.k9.LIZ(r6.LIZ(), (java.lang.String) r8.element, r6.LIZJ, null, null, 124);
        r22 = r13.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0173, code lost:
    
        if (r22 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0175, code lost:
    
        r22 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0177, code lost:
    
        X.C1863280yaU.LJJJJI(r10, r7, r6, -1, r22, r23, null, null, 96);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0186, code lost:
    
        r6 = java.lang.Math.max(r2.element, java.lang.Math.max(r3.element, r1.element));
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0194, code lost:
    
        if (r6 <= 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0196, code lost:
    
        r6 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0197, code lost:
    
        r3 = X.C1862430yZ7.LJFF;
        r1 = r13.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01a0, code lost:
    
        if (r1 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01a2, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01a4, code lost:
    
        r3.invoke(new com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBaseResponse(null, r6, r1));
        r3 = r30.LLJIJIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01af, code lost:
    
        if (r3.LIZIZ == 5) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01b1, code lost:
    
        r3 = r3.LIZ();
        r8 = "catch: " + r13.getMessage() + "; " + X.C13LP.LJJLIIIJ(X.C13LQ.LJJLIIIJJIZ(3, r13.getStackTrace()), null, null, null, 0, null, null, 63);
        r10 = X.C1862430yZ7.LJIIIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01eb, code lost:
    
        if (r10 != null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01ed, code lost:
    
        r7 = new com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBaseResponse(null, r6, r8);
        r5 = r3.LJFF.enterFrom;
        r3 = r3.LJ;
        r1 = r30.LLJIJIL.LJIILLIIL;
        r2 = r1.LJIILIIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01fe, code lost:
    
        if (r2 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0200, code lost:
    
        r2 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0202, code lost:
    
        r1 = r1.LJFF;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0204, code lost:
    
        if (r1 != null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0206, code lost:
    
        r16 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0208, code lost:
    
        r10.invoke(r7, r5, r3, r2, r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0211, code lost:
    
        X.C1503830pEj.LIZ.getClass();
        X.C1503830pEj.LIZ("stage_sug_fetch_failed", r8, false, false);
        r2 = r30.LLJIJIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x021f, code lost:
    
        if (r2.LJJJIL == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0221, code lost:
    
        r30.LLJI.getClass();
        r5 = r2.LIZIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x022e, code lost:
    
        if (X.C123100dR.LIZ(r5) == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0230, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0231, code lost:
    
        if (r5 != null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0233, code lost:
    
        r3 = X.C325210Cox.LIZ;
        r2 = new kotlin.jvm.internal.AwS39S0001000_27(r6, 9);
        r3.getClass();
        X.C325210Cox.LIZJ(r5, r2);
        X.C325210Cox.LIZIZ(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0245, code lost:
    
        r5 = r30.LLJI;
        r5.LJIIL(r5.LIZLLL(r30.LLJIJIL.LJIILLIIL, false, 4, new java.util.LinkedHashMap()));
        r1 = X.C1863280yaU.LJIILLIIL;
        X.C1870240yli.LIZ(kotlin.jvm.internal.AFwS216S0000000_27.get$arr$(167), false);
        r30.LLJI.LJJIJL(r30.LLJIJIL, false);
        r0 = r30.LLJIJIL.LJIIJ.LJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0270, code lost:
    
        if (r0 != null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0272, code lost:
    
        r0.invoke();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d6 A[Catch: all -> 0x010d, TryCatch #2 {all -> 0x010d, blocks: (B:26:0x00cf, B:27:0x00d2, B:29:0x00d6, B:30:0x00fc, B:32:0x0104, B:11:0x0045), top: B:83:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0104 A[Catch: all -> 0x010d, TRY_LEAVE, TryCatch #2 {all -> 0x010d, blocks: (B:26:0x00cf, B:27:0x00d2, B:29:0x00d6, B:30:0x00fc, B:32:0x0104, B:11:0x0045), top: B:83:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0272  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            Method dump skipped, instruction units count: 635
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1859770yUp.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
