package X;

import Y.AgS208S0200000_25;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0u9q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "androidx.compose.foundation.text.TextLinkScope$LinksComposables$1$3$1", f = "TextLinkScope.kt", l = {247}, m = "invokeSuspend")
public final class C1693000u9q extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1693040u9u LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1693000u9q(C1693040u9u c1693040u9u, InterfaceC1364105Vn<? super C1693000u9q> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1693040u9u;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1693000u9q(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
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
            C1693040u9u c1693040u9u = this.LLILLJJLI;
            this.LL = 1;
            c1693040u9u.getClass();
            C13B1 c13b1 = new C13B1((Object) null);
            C2252331DDr c2252331DDrLIZIZ = c1693040u9u.LIZ.LIZIZ();
            AgS208S0200000_25 agS208S0200000_25 = new AgS208S0200000_25(c13b1, c1693040u9u, 20);
            c2252331DDrLIZIZ.getClass();
            Object objLJIIJ = C2252331DDr.LJIIJ(c2252331DDrLIZIZ, agS208S0200000_25, this);
            if (objLJIIJ != C099R.LJFF()) {
                objLJIIJ = Unit.LIZ;
            }
            if (objLJIIJ == objLJFF) {
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
