package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03vk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel$updateCheckedSkuIdsFromOsp$2", f = "PdpViewModel.kt", l = {3295}, m = "invokeSuspend")
public final class C1001003vk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PdpViewModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ List<String> LLILZ;
    public final /* synthetic */ Integer LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1001003vk(PdpViewModel pdpViewModel, String str, List<String> list, Integer num, InterfaceC1364105Vn<? super C1001003vk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pdpViewModel;
        this.LLILLL = str;
        this.LLILZ = list;
        this.LLILZIL = num;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1001003vk(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PdpViewModel@6cb1.updateCheckedSkuIdsFromOsp$2");
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
            Map<String, ? extends Object> mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("sku_id", this.LLILLL), new Pair("checked_sku_ids", this.LLILZ.toArray(new String[0])), new Pair("quantity", this.LLILZIL));
            this.LL = 1;
            if (c0nj1.LJFF(mapLJIIIIZZ, this) == objLJFF) {
                C1C7U.LIZIZ("PdpViewModel@6cb1.updateCheckedSkuIdsFromOsp$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PdpViewModel@6cb1.updateCheckedSkuIdsFromOsp$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
