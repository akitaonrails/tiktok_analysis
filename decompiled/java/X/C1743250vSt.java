package X;

import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictPage;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vSt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment$createTopSearchBoxResultClickListener$searchResultClickListener$1$onResultClick$5$1$1", f = "DistrictFragment.kt", l = {1384}, m = "invokeSuspend")
public final class C1743250vSt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public DistrictFragment LL;
    public int LLILLJJLI;
    public final /* synthetic */ DistrictFragment LLILLL;
    public final /* synthetic */ DistrictPage LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1743250vSt(DistrictFragment districtFragment, DistrictPage districtPage, InterfaceC1364105Vn<? super C1743250vSt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = districtFragment;
        this.LLILZ = districtPage;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1743250vSt(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        DistrictFragment districtFragment;
        C1C7U.LIZ("DistrictFragment@520d.createTopSearchBoxResultClickListener$searchResultClickListener$1$onResultClick$5$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                districtFragment = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            District district = (District) C13LP.LJJJLZIJ(0, this.LLILLL.mS().LLJJJIL);
            if (district != null) {
                DistrictPage districtPage = this.LLILZ;
                districtFragment = this.LLILLL;
                if (districtPage != null) {
                    this.LL = districtFragment;
                    this.LLILLJJLI = 1;
                    obj = districtPage.VR(district, false, this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("DistrictFragment@520d.createTopSearchBoxResultClickListener$searchResultClickListener$1$onResultClick$5$1$1");
                        return objLJFF;
                    }
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("DistrictFragment@520d.createTopSearchBoxResultClickListener$searchResultClickListener$1$onResultClick$5$1$1");
            return unit;
        }
        if (((Boolean) obj).booleanValue()) {
            districtFragment.mS().yQ2(districtFragment.getChildFragmentManager(), 0);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("DistrictFragment@520d.createTopSearchBoxResultClickListener$searchResultClickListener$1$onResultClick$5$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
