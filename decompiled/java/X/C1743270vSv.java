package X;

import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictPage;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vSv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictPage$onViewCreated$adapter$1$1", f = "DistrictFragment.kt", l = {1807}, m = "invokeSuspend")
public final class C1743270vSv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ DistrictPage LLILLJJLI;
    public final /* synthetic */ District LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1743270vSv(DistrictPage districtPage, District district, InterfaceC1364105Vn<? super C1743270vSv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = districtPage;
        this.LLILLL = district;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1743270vSv(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DistrictPage@aef9.onViewCreated$adapter$1$1");
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
            DistrictPage districtPage = this.LLILLJJLI;
            District district = this.LLILLL;
            this.LL = 1;
            obj = districtPage.VR(district, true, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("DistrictPage@aef9.onViewCreated$adapter$1$1");
                return objLJFF;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            this.LLILLJJLI.SR().yQ2(this.LLILLJJLI.requireFragmentManager(), this.LLILLJJLI.OR());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DistrictPage@aef9.onViewCreated$adapter$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
