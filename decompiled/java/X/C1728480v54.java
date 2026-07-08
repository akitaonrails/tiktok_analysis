package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0v54, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.utils.UseLiveEffectHelper$setEffect$3", f = "UseLiveEffectHelper.kt", l = {}, m = "invokeSuspend")
public final class C1728480v54 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1728720v5S LL;
    public final /* synthetic */ C1729110v65 LLILLJJLI;
    public final /* synthetic */ RootData LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1728480v54(C1728720v5S c1728720v5S, C1729110v65 c1729110v65, RootData rootData, InterfaceC1364105Vn<? super C1728480v54> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1728720v5S;
        this.LLILLJJLI = c1729110v65;
        this.LLILLL = rootData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1728480v54(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UseLiveEffectHelper@a681.setEffect$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1728940v5o.LLZLLIL(this.LLILLJJLI, this.LLILLL.authorId);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UseLiveEffectHelper@a681.setEffect$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
