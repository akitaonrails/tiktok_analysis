package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vP5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.perf.preload.PdpPreloadMgr$getPreviewProduct$1", f = "PdpPreloadMgr.kt", l = {425}, m = "invokeSuspend")
public final class C1740890vP5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1749710vdJ LLILLJJLI;
    public final /* synthetic */ Object LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1740890vP5(C1749710vdJ c1749710vdJ, Object obj, InterfaceC1364105Vn<? super C1740890vP5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1749710vdJ;
        this.LLILLL = obj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1740890vP5(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PdpPreloadMgr@12da.getPreviewProduct$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(200L, this) == objLJFF) {
                C1C7U.LIZIZ("PdpPreloadMgr@12da.getPreviewProduct$1");
                return objLJFF;
            }
        }
        PdpViewModel pdpViewModel = this.LLILLJJLI.LIZ;
        if (pdpViewModel.LLLZIL) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("PdpPreloadMgr@12da.getPreviewProduct$1");
            return unit;
        }
        PdpViewModel.zS2(pdpViewModel, (ProductPackStruct) this.LLILLL, null, false, false, false, true, false, false, false, false, 976);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PdpPreloadMgr@12da.getPreviewProduct$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
