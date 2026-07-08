package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03vl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel$updateCheckSalePropId$3", f = "PdpViewModel.kt", l = {4631}, m = "invokeSuspend")
public final class C1001103vl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PdpViewModel LLILLJJLI;
    public final /* synthetic */ String[] LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1001103vl(PdpViewModel pdpViewModel, String[] strArr, InterfaceC1364105Vn<? super C1001103vl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pdpViewModel;
        this.LLILLL = strArr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1001103vl(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PdpViewModel@6cb1.updateCheckSalePropId$3");
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
            C0NJ1 c0nj1 = this.LLILLJJLI.LLIZ;
            Map<String, ? extends Object> mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("sku_id", null), new Pair("checked_sku_ids", this.LLILLL));
            this.LL = 1;
            if (c0nj1.LJFF(mapLJIIIIZZ, this) == objLJFF) {
                C1C7U.LIZIZ("PdpViewModel@6cb1.updateCheckSalePropId$3");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PdpViewModel@6cb1.updateCheckSalePropId$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
