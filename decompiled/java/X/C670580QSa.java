package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0QSa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.entry.searchbubble.SearchHotTooltipHelper$getBubbleInfoAndStartTimer$1", f = "SearchHotTooltipHelper.kt", l = {}, m = "invokeSuspend")
public final class C670580QSa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C670580QSa(boolean z, InterfaceC1364105Vn<? super C670580QSa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C670580QSa(this.LL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0033 A[EDGE_INSN: B:48:0x0033->B:8:0x0033 BREAK  A[LOOP:0: B:32:0x00dc->B:50:0x00dc]] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C670580QSa.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
