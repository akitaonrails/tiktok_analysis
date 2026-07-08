package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictPage;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictVm;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vSs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictVm$onResume$1$3$1", f = "DistrictFragment.kt", l = {1692}, m = "invokeSuspend")
public final class C1743240vSs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Fragment LLILLJJLI;
    public final /* synthetic */ DistrictVm LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ FragmentManager LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1743240vSs(Fragment fragment, DistrictVm districtVm, int i, FragmentManager fragmentManager, InterfaceC1364105Vn<? super C1743240vSs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = fragment;
        this.LLILLL = districtVm;
        this.LLILZ = i;
        this.LLILZIL = fragmentManager;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1743240vSs(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        DistrictPage districtPage;
        C1C7U.LIZ("DistrictVm@6492.onResume$1$3$1");
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
            Fragment fragment = this.LLILLJJLI;
            if ((fragment instanceof DistrictPage) && (districtPage = (DistrictPage) fragment) != null) {
                District district = (District) ListProtector.get(this.LLILLL.LLJJJIL, this.LLILZ);
                this.LL = 1;
                obj = districtPage.VR(district, false, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("DistrictVm@6492.onResume$1$3$1");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("DistrictVm@6492.onResume$1$3$1");
            return unit;
        }
        if (((Boolean) obj).booleanValue()) {
            DistrictVm districtVm = this.LLILLL;
            FragmentManager fragmentManager = this.LLILZIL;
            districtVm.yQ2(fragmentManager, C1697810uHb.LJIIJ(fragmentManager.LJJLIIIJL()));
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("DistrictVm@6492.onResume$1$3$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
