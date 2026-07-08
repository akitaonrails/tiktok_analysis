package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpPreviewInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.ui.SeaPdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS268S0000000_26;
import njp.a;

/* JADX INFO: renamed from: X.0vnO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.ui.SeaPdpFragment$initData$8", f = "SeaPdpFragment.kt", l = {}, m = "invokeSuspend")
public final class C1755960vnO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SeaPdpFragment LL;
    public final /* synthetic */ IPdpStarter.PdpEnterParam LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1755960vnO(SeaPdpFragment seaPdpFragment, IPdpStarter.PdpEnterParam pdpEnterParam, InterfaceC1364105Vn<? super C1755960vnO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = seaPdpFragment;
        this.LLILLJJLI = pdpEnterParam;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1755960vnO(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        SeaPdpFragment seaPdpFragment;
        ProductPackStruct productPackStructLIZIZ;
        C1C7U.LIZ("SeaPdpFragment@244c.initData$8");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            seaPdpFragment = this.LL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (!seaPdpFragment.LLJLIL && seaPdpFragment.JS(this.LLILLJJLI, AFwS268S0000000_26.get$arr$(639))) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SeaPdpFragment@244c.initData$8");
            return unit;
        }
        PdpPreviewInfo pdpPreviewInfo = this.LL.FS().LLLIILIL;
        if (pdpPreviewInfo != null) {
            productPackStructLIZIZ = pdpPreviewInfo.LIZIZ(800, 800);
        } else {
            productPackStructLIZIZ = null;
        }
        C1054104Ah c1054104Ah = this.LL.FS().LLJLIL;
        if (c1054104Ah != null) {
            c1054104Ah.LIZJ.put("hit_loading", 1);
        }
        if (productPackStructLIZIZ != null) {
            C1756210vnn.LIZLLL(this.LL.FS().LLIZ, EnumC1756170vnj.PREVIEW, productPackStructLIZIZ);
            SeaPdpViewModel.SS2(this.LL.FS(), productPackStructLIZIZ, null, true, false, false, false, true, false, false, false, 1976);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SeaPdpFragment@244c.initData$8");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
