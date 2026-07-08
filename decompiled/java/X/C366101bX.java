package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01bX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.common.utils.TakoGeckoUtil$fetchResource$2$1", f = "TakoGeckoUtl.kt", l = {}, m = "invokeSuspend")
public final class C366101bX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1533790q13 LL;
    public final /* synthetic */ Function2<Boolean, C1533790q13, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C366101bX(C1533790q13 c1533790q13, Function2<? super Boolean, ? super C1533790q13, Unit> function2, InterfaceC1364105Vn<? super C366101bX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1533790q13;
        this.LLILLJJLI = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C366101bX(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoGeckoUtil@73b9.fetchResource$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1533790q13 c1533790q13 = this.LL;
        if (c1533790q13.LIZIZ && c1533790q13.LIZLLL() != null) {
            Function2<Boolean, C1533790q13, Unit> function2 = this.LLILLJJLI;
            if (function2 != null) {
                function2.invoke(true, this.LL);
            }
        } else {
            Function2<Boolean, C1533790q13, Unit> function22 = this.LLILLJJLI;
            if (function22 != null) {
                function22.invoke(false, this.LL);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoGeckoUtil@73b9.fetchResource$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
