package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Qjb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.autoplay.core.utils.ECContentAutoPlayHandlerRefactor$startTraverse$2", f = "ECContentAutoPlayHandlerRefactor.kt", l = {586}, m = "invokeSuspend")
public final class C678610Qjb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C678600Qja LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C678610Qjb(C678600Qja c678600Qja, InterfaceC1364105Vn<? super C678610Qjb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c678600Qja;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C678610Qjb c678610Qjb = new C678610Qjb(this.LLILLL, interfaceC1364105Vn);
        c678610Qjb.LLILLJJLI = obj;
        return c678610Qjb;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c4, code lost:
    
        r8 = r19.LLILLL;
        r2 = r10.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ce, code lost:
    
        if (r2.hasNext() == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d0, code lost:
    
        r8.LJJI((X.InterfaceC648270Pbl) r2.next());
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00dc, code lost:
    
        r2 = r19.LLILLL.LJIILIIL(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e6, code lost:
    
        if (r10.size() != 1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e8, code lost:
    
        r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r10, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ec, code lost:
    
        if (r2 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f2, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r1, r2) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f4, code lost:
    
        r19.LLILLL.LJJIFFI(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00fe, code lost:
    
        if (r10.size() <= 1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0100, code lost:
    
        r1 = r19.LLILLL.LJIILLIIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0105, code lost:
    
        r19.LLILLL.LJIL(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0124 -> B:6:0x0019). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C678610Qjb.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
