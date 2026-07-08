package X;

import Y.ARunnableS4S0410000_32;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CTx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.anchor.maker.ShopWindowAnchorMaker$onVideoSelect$4", f = "ShopWindowAnchorMaker.kt", l = {365}, m = "invokeSuspend")
public final class C314350CTx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C238400w2 LLILLJJLI;
    public final /* synthetic */ C21272118Ml LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C314350CTx(C238400w2 c238400w2, C21272118Ml c21272118Ml, InterfaceC1364105Vn<? super C314350CTx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c238400w2;
        this.LLILLL = c21272118Ml;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C314350CTx(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShopWindowAnchorMaker@b379.onVideoSelect$4");
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
            long j = this.LLILLJJLI.element;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("ShopWindowAnchorMaker@b379.onVideoSelect$4");
                return objLJFF;
            }
        }
        ARunnableS4S0410000_32 aRunnableS4S0410000_32 = this.LLILLL.LLILZLL;
        if (aRunnableS4S0410000_32 != null) {
            aRunnableS4S0410000_32.run();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShopWindowAnchorMaker@b379.onVideoSelect$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
