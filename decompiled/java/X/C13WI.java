package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.13WI, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2", f = "BringIntoViewResponder.kt", l = {}, m = "invokeSuspend")
public final class C13WI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C09AE>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C13WM LLILLJJLI;
    public final /* synthetic */ InterfaceC1692950u9l LLILLL;
    public final /* synthetic */ Function0<C1683130ttv> LLILZ;
    public final /* synthetic */ Function0<C1683130ttv> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13WI(C13WM c13wm, InterfaceC1692950u9l interfaceC1692950u9l, Function0<C1683130ttv> function0, Function0<C1683130ttv> function02, InterfaceC1364105Vn<? super C13WI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c13wm;
        this.LLILLL = interfaceC1692950u9l;
        this.LLILZ = function0;
        this.LLILZIL = function02;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C13WI c13wi = new C13WI(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c13wi.LL = obj;
        return c13wi;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C13WJ(this.LLILLJJLI, this.LLILLL, this.LLILZ, null), 3);
        return C23250099c.LIZLLL(interfaceC497601wk, null, null, new C13WH(this.LLILLJJLI, this.LLILZIL, null), 3);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C09AE> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
