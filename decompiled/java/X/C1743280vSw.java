package X;

import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictPage;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictVm;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vSw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictPage$onViewCreated$3", f = "DistrictFragment.kt", l = {1873, 1874}, m = "invokeSuspend")
public final class C1743280vSw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ DistrictPage LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1743280vSw(DistrictPage districtPage, InterfaceC1364105Vn<? super C1743280vSw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = districtPage;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1743280vSw(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DistrictPage@aef9.onViewCreated$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("DistrictPage@aef9.onViewCreated$3");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            if (this.LLILLJJLI.SR().LLILZLL > this.LLILLJJLI.OR()) {
                DistrictVm districtVmSR = this.LLILLJJLI.SR();
                FragmentManager fragmentManagerRequireFragmentManager = this.LLILLJJLI.requireFragmentManager();
                this.LL = 1;
                if (districtVmSR.zQ2(fragmentManagerRequireFragmentManager, this) == objLJFF) {
                    C1C7U.LIZIZ("DistrictPage@aef9.onViewCreated$3");
                    return objLJFF;
                }
            }
        }
        DistrictPage districtPage = this.LLILLJJLI;
        this.LL = 2;
        if (districtPage.WR(this) == objLJFF) {
            C1C7U.LIZIZ("DistrictPage@aef9.onViewCreated$3");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("DistrictPage@aef9.onViewCreated$3");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
