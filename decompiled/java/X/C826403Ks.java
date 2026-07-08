package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddOnFeed;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddOnWriteImpressionRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SessionInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03Ks, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.addon.OspAddonOrderViewModel$addOnWriteImpression$1", f = "AddonOrderViewModel.kt", l = {54}, m = "invokeSuspend")
public final class C826403Ks extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ OrderSubmitAssemViewModel LLILLJJLI;
    public final /* synthetic */ List<AddOnFeed> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C826403Ks(OrderSubmitAssemViewModel orderSubmitAssemViewModel, List<AddOnFeed> list, InterfaceC1364105Vn<? super C826403Ks> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = orderSubmitAssemViewModel;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C826403Ks(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SessionInfo] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        C1C7U.LIZ("OspAddonOrderViewModel@c299.addOnWriteImpression$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LIZJ("addon write impression Fail");
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C259800zU c259800zU = new C259800zU();
            C752702wn c752702wn = this.LLILLJJLI.LLILZLL;
            if (c752702wn != null && (str2 = c752702wn.LLJJIII) != null) {
                c259800zU.element = new SessionInfo(str2);
            }
            OrderSubmitAssemViewModel orderSubmitAssemViewModel = this.LLILLJJLI;
            C752702wn c752702wn2 = orderSubmitAssemViewModel.LLILZLL;
            if (c752702wn2 != null && (str = c752702wn2.LLJJI) != null) {
                AddOnWriteImpressionRequest addOnWriteImpressionRequest = new AddOnWriteImpressionRequest(str, this.LLILLL, (SessionInfo) c259800zU.element);
                if (orderSubmitAssemViewModel.LLLJIL != null) {
                    this.LL = 1;
                    obj = C03WX.LJJIJIL(addOnWriteImpressionRequest, this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("OspAddonOrderViewModel@c299.addOnWriteImpression$1");
                        return objLJFF;
                    }
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("OspAddonOrderViewModel@c299.addOnWriteImpression$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("OspAddonOrderViewModel@c299.addOnWriteImpression$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
