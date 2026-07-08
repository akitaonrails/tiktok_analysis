package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0kAB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.repository.ChunkedHexStreamParser$parse$1", f = "EffectStreamingService.kt", l = {371, 396}, m = "invokeSuspend")
public final class C1308810kAB extends C09AX implements Function2<InterfaceC346701Wf<? super C1308820kAC>, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public C238400w2 LLILLJJLI;
    public C238400w2 LLILLL;
    public long LLILZ;
    public long LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public /* synthetic */ Object LLIZLLLIL;
    public final /* synthetic */ InterfaceC1496620p36 LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1308810kAB(InterfaceC1496620p36 interfaceC1496620p36, InterfaceC1364105Vn<? super C1308810kAB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJ = interfaceC1496620p36;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1308810kAB c1308810kAB = new C1308810kAB(this.LLJ, interfaceC1364105Vn);
        c1308810kAB.LLIZLLLIL = obj;
        return c1308810kAB;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        kotlin.text.CharsKt__CharJVMKt.checkRadix(16);
        r3 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r4, 16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        if (r7 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        if (r3 != r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
    
        r12 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        r0 = r7.length;
        r13 = r8.element;
        r0 = r9.element;
        r15 = new X.C1308820kAC(r7, r12, r0, r13, r0, X.C19990113Jj.LJIJ(r13, r0));
        r28.LLIZLLLIL = r2;
        r28.LL = r8;
        r28.LLILLJJLI = r9;
        r28.LLILLL = null;
        r28.LLILZ = r5;
        r28.LLILZIL = r3;
        r28.LLILZLL = r12;
        r28.LLIZ = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0091, code lost:
    
        if (r2.emit(r15, r28) != r10) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0093, code lost:
    
        X.C1C7U.LIZIZ("ChunkedHexStreamParser@db56.parse$1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0096, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0097, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x010d, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x010e, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
        r1 = X.C2188811AlT.LIZ();
        r1.append("Invalid chunk size: ");
        r1.append(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0126, code lost:
    
        throw new java.io.IOException(X.C2188811AlT.LIZIZ(r1), r3);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012f A[EDGE_INSN: B:47:0x012f->B:43:0x012f BREAK  A[LOOP:0: B:8:0x0028->B:25:0x0099], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00ea -> B:7:0x0026). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1308810kAB.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super C1308820kAC> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
