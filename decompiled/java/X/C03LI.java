package X;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.CombinedSkuOrderSubmitFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03LI, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.page.CombinedSkuOrderSubmitFragment$initSubscribe$13$1", f = "CombinedSkuOrderSubmitFragment.kt", l = {856}, m = "invokeSuspend")
public final class C03LI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CombinedSkuOrderSubmitFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03LI(CombinedSkuOrderSubmitFragment combinedSkuOrderSubmitFragment, InterfaceC1364105Vn<? super C03LI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = combinedSkuOrderSubmitFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C03LI(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CombinedSkuOrderSubmitFragment@b53b.initSubscribe$13$1");
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
            ConstraintLayout constraintLayout = this.LLILLJJLI.LLJJJIL;
            if (constraintLayout != null) {
                C1750960vfK c1750960vfK = C1750960vfK.LIZ;
                this.LL = 1;
                if (c1750960vfK.LJI(constraintLayout, this) == objLJFF) {
                    C1C7U.LIZIZ("CombinedSkuOrderSubmitFragment@b53b.initSubscribe$13$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CombinedSkuOrderSubmitFragment@b53b.initSubscribe$13$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
