package X;

import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictVm;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vSq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment$onResultClick$5", f = "DistrictFragment.kt", l = {1533}, m = "invokeSuspend")
public final class C1743220vSq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ DistrictFragment LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1743220vSq(DistrictFragment districtFragment, int i, InterfaceC1364105Vn<? super C1743220vSq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = districtFragment;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1743220vSq(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DistrictFragment@520d.onResultClick$5");
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
            DistrictVm districtVmMS = this.LLILLJJLI.mS();
            FragmentManager childFragmentManager = this.LLILLJJLI.getChildFragmentManager();
            this.LL = 1;
            if (districtVmMS.zQ2(childFragmentManager, this) == objLJFF) {
                C1C7U.LIZIZ("DistrictFragment@520d.onResultClick$5");
                return objLJFF;
            }
        }
        int iLJIIJ = C1697810uHb.LJIIJ(this.LLILLJJLI.getChildFragmentManager().LJJLIIIJL());
        int i2 = this.LLILLL;
        if (i2 <= iLJIIJ) {
            iLJIIJ = i2;
        }
        this.LLILLJJLI.mS().yQ2(this.LLILLJJLI.getChildFragmentManager(), iLJIIJ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DistrictFragment@520d.onResultClick$5");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
