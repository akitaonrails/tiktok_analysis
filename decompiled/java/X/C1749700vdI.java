package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpPreviewInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS605S0100000_26;
import njp.a;

/* JADX INFO: renamed from: X.0vdI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragment$initData$6", f = "PdpFragment.kt", l = {}, m = "invokeSuspend")
public final class C1749700vdI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PdpFragment LL;
    public final /* synthetic */ IPdpStarter.PdpEnterParam LLILLJJLI;
    public final /* synthetic */ C259800zU<String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1749700vdI(PdpFragment pdpFragment, IPdpStarter.PdpEnterParam pdpEnterParam, C259800zU<String> c259800zU, InterfaceC1364105Vn<? super C1749700vdI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = pdpFragment;
        this.LLILLJJLI = pdpEnterParam;
        this.LLILLL = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1749700vdI(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        int iIntValue2;
        ProductPackStruct productPackStructLIZIZ;
        C1C7U.LIZ("PdpFragment@ab0c.initData$6");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (this.LL.JS().LLLLLLJ.LIZIZ(this.LLILLJJLI, this.LL.requireContext(), new AwS605S0100000_26(this.LLILLL, (C259800zU<String>) 696))) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("PdpFragment@ab0c.initData$6");
            return unit;
        }
        Pair<Integer, Integer> pairLIZ = C1759110vsT.LIZ(this.LL.JS().getProductId(), this.LLILLL.element);
        if ((pairLIZ != null || (pairLIZ = C1743690vTb.LIZ(this.LLILLL.element)) != null) && pairLIZ.getSecond().intValue() / pairLIZ.getFirst().floatValue() > 1.0f) {
            iIntValue = pairLIZ.getFirst().intValue();
            iIntValue2 = pairLIZ.getSecond().intValue();
        } else {
            iIntValue = 800;
            iIntValue2 = 800;
        }
        PdpPreviewInfo pdpPreviewInfo = this.LL.JS().LLLIILIL;
        if (pdpPreviewInfo != null) {
            productPackStructLIZIZ = pdpPreviewInfo.LIZIZ(iIntValue, iIntValue2);
        } else {
            productPackStructLIZIZ = null;
        }
        C1054004Ag c1054004Ag = this.LL.JS().LLJLILLLLZIIL;
        if (c1054004Ag != null) {
            c1054004Ag.LJJJJ(1, "hit_loading");
        }
        if (productPackStructLIZIZ != null) {
            PdpViewModel.zS2(this.LL.JS(), productPackStructLIZIZ, null, true, false, false, false, true, false, false, false, 952);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PdpFragment@ab0c.initData$6");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
