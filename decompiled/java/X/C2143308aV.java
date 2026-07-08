package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08aV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.util.PopularStickerListManager$readTabPagesFromFile$2", f = "PopularStickerListManager.kt", l = {}, m = "invokeSuspend")
public final class C2143308aV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C452690Hp5>>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C452680Hp4 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2143308aV(C452680Hp4 c452680Hp4, InterfaceC1364105Vn<? super C2143308aV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c452680Hp4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2143308aV c2143308aV = new C2143308aV(this.LLILLJJLI, interfaceC1364105Vn);
        c2143308aV.LL = obj;
        return c2143308aV;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2143308aV.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C452690Hp5>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
