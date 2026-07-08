package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Qjc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.autoplay.core.utils.ECContentAutoPlayHandler$startTraverse$2", f = "ECContentAutoPlayHandler.kt", l = {436}, m = "invokeSuspend")
public final class C678620Qjc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C678590QjZ LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C678620Qjc(C678590QjZ c678590QjZ, InterfaceC1364105Vn<? super C678620Qjc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c678590QjZ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C678620Qjc c678620Qjc = new C678620Qjc(this.LLILLL, interfaceC1364105Vn);
        c678620Qjc.LLILLJJLI = obj;
        return c678620Qjc;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
    
        r3 = r11.LLILLL;
        r2 = r8.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
    
        if (r2.hasNext() == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007c, code lost:
    
        r3.LJIJI((X.InterfaceC648270Pbl) r2.next());
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0086, code lost:
    
        r2 = r11.LLILLL.LJIIJJI();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0090, code lost:
    
        if (r8.size() != 1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0092, code lost:
    
        r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r8, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0096, code lost:
    
        if (r2 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009c, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r1, r2) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009e, code lost:
    
        r11.LLILLL.LJIJJ(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a8, code lost:
    
        if (r8.size() <= 1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00aa, code lost:
    
        r1 = r11.LLILLL.LJIILJJIL;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00c8 -> B:6:0x0017). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C678620Qjc.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
