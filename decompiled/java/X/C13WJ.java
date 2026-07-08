package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.13WJ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$1", f = "BringIntoViewResponder.kt", l = {183}, m = "invokeSuspend")
public final class C13WJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C13WM LLILLJJLI;
    public final /* synthetic */ InterfaceC1692950u9l LLILLL;
    public final /* synthetic */ Function0<C1683130ttv> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13WJ(C13WM c13wm, InterfaceC1692950u9l interfaceC1692950u9l, Function0<C1683130ttv> function0, InterfaceC1364105Vn<? super C13WJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c13wm;
        this.LLILLL = interfaceC1692950u9l;
        this.LLILZ = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C13WJ(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C13WL c13wl = this.LLILLJJLI.LLJJ;
            C13WK c13wk = new C13WK(this.LLILLJJLI, this.LLILLL, this.LLILZ);
            this.LL = 1;
            if (c13wl.LJJIIJZLJL(c13wk, this) == objLJFF) {
                return objLJFF;
            }
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
