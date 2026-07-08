package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Pbj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.autoplay.core.viewmodel.cardagent.HorizontalProductsCardAgentV2$traversePlay$1", f = "HorizontalProductsCardAgentV2.kt", l = {97}, m = "invokeSuspend")
public final class C648250Pbj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C648260Pbk LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C648250Pbj(C648260Pbk c648260Pbk, InterfaceC1364105Vn<? super C648250Pbj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c648260Pbk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C648250Pbj c648250Pbj = new C648250Pbj(this.LLILLL, interfaceC1364105Vn);
        c648250Pbj.LLILLJJLI = obj;
        return c648250Pbj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a4, code lost:
    
        if ((r9 instanceof X.InterfaceC648270Pbl) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a6, code lost:
    
        r9 = (X.InterfaceC648270Pbl) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a8, code lost:
    
        if (r9 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00aa, code lost:
    
        r14.LLILLL.getClass();
        X.C648260Pbk.LJIIL(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b6, code lost:
    
        if (r14.LLILLL.LJIIIIZZ == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b8, code lost:
    
        X.C2296808zG.LIZJ(r4, null);
        r0 = kotlin.Unit.LIZ;
        X.C1C7U.LIZIZ("HorizontalProductsCardAgentV2@4694.traversePlay$1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c0, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c3, code lost:
    
        if ((r9 instanceof X.C661440Px0) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c5, code lost:
    
        ((X.C661440Px0) r9).LJIJI();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cd, code lost:
    
        if ((r9 instanceof X.C658550PsL) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cf, code lost:
    
        ((X.C658550PsL) r9).LLLLLIL();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0108 -> B:6:0x0017). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C648250Pbj.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
